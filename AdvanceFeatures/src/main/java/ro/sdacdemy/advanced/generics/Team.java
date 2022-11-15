package ro.sdacdemy.advanced.generics;

public class Team<T> implements Comparable<Team<T>>{

    private String name;
    private int matchesPlayed = 0;
    private int won = 0;
    private int lost = 0;
    private int draw = 0;


    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;
        if (ourScore > theirScore) {
            won++;
            message = " beat ";
        } else {
            if (ourScore == theirScore) {
                draw++;
                message = " drew with ";
            } else {
                lost++;
                message = " lost to ";
            }

        }
        matchesPlayed++;
        System.out.println(this.getName() + message + opponent.getName());

    }

    public int ranking() {
        return won * 3 + draw;
    }


    @Override
    public int compareTo(Team<T> o) {

        // sort in descending order

        if(this.ranking() > o.ranking()){
            return -1;
        } else if(this.ranking() < o.ranking()){
            return 1;
        } else{
            return 0;
        }
    }
}
