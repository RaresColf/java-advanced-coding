package ro.sdacdemy.advanced.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class League<T extends Team>{

    private String name;
    private final ArrayList<T> league ;

    public League(String name) {
        this.name = name;
        this.league = new ArrayList<>();
    }

    public boolean addTeam (T team){
        if(league.contains(team)){
            return false;
        }else{
            league.add(team);
            return true;
        }
    }

    public void showLeagueTable(){
        Collections.sort(league);
        for (T current : league){
            System.out.println(current.getName() + ": " + current.ranking());
        }
    }
}
