package soccer;

public class League {

    public static void main(String[] args) {


        Team[] theTeams = createTeams();
        Game[] theGames = createGames(theTeams);

        Player player1 = new Player();
        player1.playerName = "Skara Ngobese";
        Player player2 = new Player();
        player2.playerName = "Thabo Matlaba";
        Player player3 = new Player();
        player3.playerName = "Percy Tau";
        Player[] thePlayers = {player1, player2, player3};
//        System.out.println(player1.playerName);


//
//        Team team1 = new Team();
//        team1.teamName = "The Greens";
//        team1.playerArray = thePlayers;
//
//
//        Team team2 = new Team();
//        team2.teamName = "The Reds";
//        team2.playerArray = new Player[3];
//        team2.playerArray[0] = new Player();
//        team2.playerArray[0].playerName = "Robert Burns";
//
//        team2.playerArray[1] = new Player();
//        team2.playerArray[1].playerName = "Robbie Burns";
//
//        team2.playerArray[2] = new Player();
//        team2.playerArray[2].playerName = "Phumlani Mthembu";


        Game currentGame = theGames[0];

        int numberOfGoals = (int)(Math.random() * 7);

        System.out.println(numberOfGoals);

        Goal[] theGoals = new Goal[numberOfGoals];
//        System.out.println(theGoals.length);
        currentGame.goals = theGoals;

//
//        Game currentGame = new Game();
//        currentGame.homeTeam = team1;
//        currentGame.awayTeam = team2;

//        Goal goal1 = new Goal();
//        System.out.println();
//
//        int index = 2;
//        goal1.thePlayer = currentGame.awayTeam.playerArray[index];
//        goal1.theTeam = currentGame.awayTeam;
//        goal1.theTime = 55;
//
//        Goal[] theGoals = {Team};
//        currentGame.goals = theGoals;


     /*   System.out.println("Goal scored after " +
                currentGame.goals[0].theTime + " mins by " +
                currentGame.goals[0].thePlayer.playerName + " of " +
                currentGame.goals[0].theTeam.teamName);*/


//        for (Player thePlayer : team2.playerArray) {
//
//
//            if (thePlayer.playerName.matches(".*mla.*")) {// .*string.* searches and print the whole String.
//                System.out.println("------ from team 2 --------------");
//                System.out.println("Found " + thePlayer.playerName);
//                System.out.println("Last Name is: " + thePlayer.playerName.split(" ")[1]);
//
//                StringBuilder familyNameFirst = new StringBuilder();
//                System.out.println("------ from team 1 -------");
//                for (Player thePlayer2 : team1.playerArray) {
//
//                    String name[] = thePlayer2.playerName.split(" ");
//                    familyNameFirst.append(name[1]);
//                    familyNameFirst.append(", ");
//                    familyNameFirst.append(name[0]);
//                    System.out.println(familyNameFirst);
//                    familyNameFirst.delete(0,familyNameFirst.length());
//
//
//
//
//                }
//            }
//
//
//        }



    }



    public static Team[] createTeams(){

// home team team 1

        Team team1 = new Team();
        team1.teamName = "Keizer chiefs";
        team1.playerArray = new Player[3];
        team1.playerArray[0] = new Player();
        team1.playerArray[0].playerName = "Robert Stevens";

        team1.playerArray[1] = new Player();
        team1.playerArray[1].playerName = "Robbie Burns";

        team1.playerArray[2] = new Player();
        team1.playerArray[2].playerName = "Khama Billiat";
//TODO: add more players

// away team team2

        Team team2 = new Team();
        team2.teamName = "Orlando Pirates";
        team2.playerArray = new Player[5];
        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Siyabonga Mpontshane";

        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Nhlanhla Khuzwayo";

        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Phumlani Mthembu";

        team2.playerArray[3] = new Player();
        team2.playerArray[3].playerName = "Happy Jele";

        team2.playerArray[4] = new Player();
        team2.playerArray[4].playerName = "Mthokozisi Dube";
//TODO: add more players

        


        Team[] theTeams = {team1, team2};


        return  theTeams;
    }


    public static Game[] createGames(Team[] theTeams) {

        Game theGame = new Game();

        theGame.homeTeam =theTeams[0];
        theGame.awayTeam = theTeams[1];

        Game[] theGames = {theGame};

        return theGames;
    }


}