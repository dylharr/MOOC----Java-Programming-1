public class Team {
    
    private String homeTeam;
    private String awayTeam;
    private int homePoints;
    private int awayPoints;
    
    public Team(String homeTeam, String awayTeam, int homePoints, int awayPoints) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homePoints = homePoints;
        this.awayPoints = awayPoints;
    }
    
    public String getHome() {
        return homeTeam;
    }
    
    public String getAway() {
        return awayTeam;
    }
    
    public boolean winnerIs(String team) {
        if (team.equals(homeTeam) && homePoints > awayPoints) {
          return true;  
        }
        if (team.equals(awayTeam) && awayPoints > homePoints) {
            return true;
        }
        return false;
    }
    
}
