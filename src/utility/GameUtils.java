/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.lang.reflect.Field
        ;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import soccer.*;

/**
 *
 * @author ksomervi
 */
public class GameUtils {

    public static void addGameGoals(Game currentGame) {
        
        //System.out.println(currGame.awayTeam + " : " + currGame.homeTeam);

        // Or possibly throw an Exception?
        if (currentGame.goals == null) {
            currentGame.goals = new Goal[(int) (Math.random() * 10)];   // If goals not initialized max will be 9
        }

        //System.out.println(currGame.goals.length);
        int i = 0;
        for (Goal currGoal : currentGame.goals) {
            currGoal = new Goal();
            currGoal.theTeam = Math.random() > 0.5 ? getHomeTeam(currentGame, "home") : getHomeTeam(currentGame, "away");
            currGoal.thePlayer = currGoal.theTeam.playerArray[(int) (Math.random() * currGoal.theTeam.playerArray.length)];
            currGoal.theTime = (int) (Math.random() * 90);
            currentGame.goals[i] = currGoal;
            i++;
        }
        Arrays.sort(currentGame.goals, (g1, g2) -> Double.valueOf(g1.theTime).compareTo(Double.valueOf(g2.theTime)));

    }

    // Uses reflection so works with getter method or public field
    private static Team getHomeTeam(Game currentGame, String homeOrAway) {
        Team theTeam = null;
        Method m;
        Field f;
        try {
            m = Game.class.getMethod("get" + Character.toUpperCase(homeOrAway.charAt(0)) + homeOrAway.substring(1) + "Team");
            theTeam = (Team)m.invoke(currentGame);
            //System.out.println(theTeam);
        } catch (NoSuchMethodException|IllegalAccessException|InvocationTargetException em) {
            try {
                f = Game.class.getField(homeOrAway + "Team");
                theTeam = (Team)f.get(currentGame);
                //System.out.println(theTeam);
            } catch (NoSuchFieldException|IllegalAccessException ef) { 
                System.out.println("The addGoals() utility requires the Goal class to contain either:\n" +
                        "public String fields called homeTeam and awayTeam, OR,\n" +
                        "public accessor methods called getHomeTeam() and getAwayTeam().");
            }
        }
        return theTeam;
    }
}
