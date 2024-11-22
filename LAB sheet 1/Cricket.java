
class CricketPlayer {
    String playerName;
    int playerAge;
    CricketPlayer(String playerName, int playerAge) {
        this.playerName = playerName;
        this.playerAge = playerAge;
    }
    void displayPlayerInfo() {
        System.out.println("Player information");
        System.out.println("player name: " + this.playerName);
        System.out.println("Age: " + this.playerAge);
    }
}
class Batsman extends CricketPlayer {
    int totalRuns;
    int matchesPlayed;

    Batsman(String playerName, int playerAge, int totalRuns, int matchesPlayed) {
        super(playerName, playerAge);
        this.totalRuns = totalRuns;
        this.matchesPlayed = matchesPlayed;
    }
    void displayPlayerInfo() {
        System.out.println("Batsman Info");
        System.out.println("Name: " + this.playerName);
        System.out.println("Age: " + this.playerAge);
        System.out.println("Total Runs: " + this.totalRuns);
        System.out.println("Matches Played: " + this.matchesPlayed);
    }
}
class Bowler extends CricketPlayer {
    int gamesPlayed;
    int totalWickets;

    Bowler(String playerName, int playerAge, int gamesPlayed, int totalWickets) {
        super(playerName, playerAge);
        this.gamesPlayed = gamesPlayed;
        this.totalWickets = totalWickets;
    }
    void displayPlayerInfo() {
        System.out.println("Bowler Info");
        System.out.println("Name: " + this.playerName);
        System.out.println("Age: " + this.playerAge);
        System.out.println("Total Wickets: " + this.totalWickets);
        System.out.println("Games Played: " + this.gamesPlayed);
    }
}

public class Cricket {
    public static void main(String[] args) {
        CricketPlayer genericPlayer = new CricketPlayer("Johnty Rhodes", 46);
        Batsman rohit = new Batsman("Rohit Sharma", 37, 10866, 265);
        Bowler arshdeep = new Bowler("Arshdeep Singh", 25, 6, 10);

        genericPlayer.displayPlayerInfo();
        System.out.println();
        rohit.displayPlayerInfo();
        System.out.println();
        arshdeep.displayPlayerInfo();
    }
}

