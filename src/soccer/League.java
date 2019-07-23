package soccer;

public class League {

    public static void main(String[] args) {

        Team[] theTeams = createTeams();
        Game[] theGames = createGames(theTeams);

        Game currentGame = theGames[0];

// TODO: 2019/07/23








        Player player1 = new Player();
        player1.playerName = "George Elliot";

        Player player2 = new Player();
        player2.playerName = "Graham Green";

        Player player3 = new Player();
        player3.playerName = "Geoffrey Chaucer";

        Player[] thePlayers = {player1, player2, player3};
        Team team1 = new Team();
        team1.teamName = "The Greens";
        team1.playerArray = thePlayers;


        Team team2 = new Team();
        team2.teamName = "The Reds";
        team2.playerArray = new Player[3];
        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Robert Burns";

        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Robbie Burns";

        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Phumlani Mthembu";

/*
TODO:// delete
        Game currentGame = new Game();
        currentGame.homeTeam = team1;
        currentGame.awayTeam = team2;
*/

        Goal goal1 = new Goal();
        goal1.thePlayer = currentGame.homeTeam.playerArray[2];
        goal1.theTeam = currentGame.homeTeam;
        goal1.theTime = 55;

        Goal[] theGoals = {goal1};
        currentGame.goals = theGoals;


        System.out.println("Goal scored after " +
                currentGame.goals[0].theTime + " mins by " +
                currentGame.goals[0].thePlayer.playerName + " of " +
                currentGame.goals[0].theTeam.teamName);


        for (Player thePlayer : team2.playerArray) {


            if (thePlayer.playerName.matches(".*mla.*")) {// .*string.* searches and print the whole String.
                System.out.println("------ from team 2 --------------");
                System.out.println("Found " + thePlayer.playerName);
                System.out.println("Last Name is: " + thePlayer.playerName.split(" ")[1]);

                StringBuilder familyNameFirst = new StringBuilder();
                System.out.println("------ from team 1 -------");
                for (Player thePlayer2 : team1.playerArray) {

                    String name[] = thePlayer2.playerName.split(" ");
                    familyNameFirst.append(name[1]);
                    familyNameFirst.append(", ");
                    familyNameFirst.append(name[0]);
                    System.out.println(familyNameFirst);
                    familyNameFirst.delete(0,familyNameFirst.length());




                }
            }


        }



    }



    public static Team[] createTeams(Team team1, Team team2){
        Team[] theTeams = {team1, team2};

        return  theTeams;
    }

    public static Game[] createGames(Team[] theTeams){
    Game theGame = new Game();
    theGame.homeTeam = theTeams[0];
    theGame.awayTeam = theTeams[1];

    Game[] theGames = {theGame};

    return theGames;
    }

}