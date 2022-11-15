package ro.sdacdemy.advanced.generics;

/**
 *       /*
 *
 *         Create a generic class to implement a league table for sport.
 *         The class should allow teams to be added to the list, and store
 *         a list of teams that belong to the league.
 *
 *         Your class should have a method to print out the teams in order,
 *         with the team at the top of the league printed first.
 *
 *         Only teams of the same type should be added to any particular
 *         instance of the league class - the program should fail to compile
 *         if an attempt is made to add an incompatible team.
 *         */

public class Main {
    public static void main(String[] args) {

        League<FootballTeam> pl = new League<>("Premier League");

        FootballTeam chelsea = new FootballTeam("Chelsea");
      FootballTeam liverpool = new FootballTeam("Liverpool");
        FootballTeam manchesterUnited = new FootballTeam("Manchester United");
        FootballTeam manchesterCity = new FootballTeam("Manchester City");

        pl.addTeam(chelsea);
        pl.addTeam(liverpool);
        pl.addTeam(manchesterCity);
        pl.addTeam(manchesterUnited);

        chelsea.matchResult(liverpool, 2, 1);
        chelsea.matchResult(manchesterUnited, 3, 2);
        chelsea.matchResult(manchesterCity, 4, 3);
        liverpool.matchResult(chelsea, 0, 0);
        liverpool.matchResult(manchesterUnited, 1, 0);
        liverpool.matchResult(manchesterCity, 2, 0);
        manchesterUnited.matchResult(chelsea, 2, 1);
        manchesterUnited.matchResult(liverpool, 0, 2);
        manchesterUnited.matchResult(manchesterCity, 0, 1);
        manchesterCity.matchResult(chelsea, 2, 1);
        manchesterCity.matchResult(manchesterUnited, 2, 3);
        manchesterCity.matchResult(liverpool, 3, 2);


        pl.showLeagueTable();

    }
}
