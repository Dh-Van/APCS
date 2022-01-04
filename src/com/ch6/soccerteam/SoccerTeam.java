package com.ch6.soccerteam;

public class SoccerTeam {

    private int wins;
    private int losses;
    private int ties;

    public static int gamesPlayed;
    public static int totalGoalsScored;

    public static void main(String[] args) {
        SoccerTeam s1 = new SoccerTeam();
        SoccerTeam s2 = new SoccerTeam();
        SoccerTeam s3 = new SoccerTeam();
        SoccerTeam s4 = new SoccerTeam();

        // TOURNAMENT 1

        s1.startTournament();
        s1.played(s2, 1, 2); // s2 W
        s1.played(s3, 2, 2); // s1 & s3 Tie
        s4.played(s2, 3, 4); // s2 W
        s3.played(s2, 2, 0); // s3 W

        System.out.println("s1\t:\t" + s1.points());
        System.out.println("s2\t:\t" + s2.points());
        System.out.println("s3\t:\t" + s3.points());
        System.out.println("s4\t:\t" + s4.points());
        System.out.printf("Total Games Player\t:\t%d\nTotal Goals Scored\t:\t%d\n\n\n\n", SoccerTeam.getGamesPlayed(), SoccerTeam.getTotalGoalsScored());

        s1.reset();
        s2.reset();
        s3.reset();
        s4.reset();

        // TOURNAMENT 2

        s1.startTournament();
        s1.played(s2, 1, 4); // s2 W
        s1.played(s3, 2, 3); // s3 W
        s4.played(s2, 3, 2); // s4 W
        s3.played(s2, 5, 1); // s3 W

        System.out.println("s1\t:\t" + s1.points());
        System.out.println("s2\t:\t" + s2.points());
        System.out.println("s3\t:\t" + s3.points());
        System.out.println("s4\t:\t" + s4.points());
        System.out.printf("Total Games Played\t:\t%d\nTotal Goals Scored\t:\t%d\n", SoccerTeam.getGamesPlayed(), SoccerTeam.getTotalGoalsScored());
    }

    public SoccerTeam() {
        this.wins = 0;
        this.losses = 0;
        this.ties = 0;
    }

    public void startTournament(){
        SoccerTeam.gamesPlayed = 0;
        SoccerTeam.totalGoalsScored = 0;
    }

    public void reset(){
        this.wins = 0;
        this.ties = 0;
        this.losses = 0;
    }

    public void played(SoccerTeam other, int thisScore, int otherScore){
        gamesPlayed++;
        totalGoalsScored += thisScore + otherScore;

        if (thisScore > otherScore) {
            this.wins++;
            other.losses++;
        } else if(thisScore == otherScore) {
            this.ties++;
            other.ties++;
        } else {
            this.losses++;
            other.wins++;
        }
    }

    public int points(){
        return (wins * 3) + (ties * 1);
    }

    public static int getGamesPlayed() {
        return gamesPlayed;
    }

    public static int getTotalGoalsScored() {
        return totalGoalsScored;
    }
}

/* Output:
s1	:	1
s2	:	6
s3	:	4
s4	:	0
Total Games Player	:	4
Total Goals Scored	:	16



s1	:	0
s2	:	3
s3	:	6
s4	:	3
Total Games Played	:	4
Total Goals Scored	:	21

 */
