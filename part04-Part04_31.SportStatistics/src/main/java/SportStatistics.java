
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("File:");
        String file = scan.nextLine();
        
        System.out.println("Team:");
        String team = scan.nextLine();
        ArrayList<Team> stats = readFromFile(file);
        
        ArrayList<Team> gamesOfTeam = new ArrayList<>();
        for (Team teams : stats) {
            if (team.equals(teams.getHome()) || team.equals(teams.getAway()))  {
                gamesOfTeam.add(teams);
            }
        }
        
        System.out.println("Games: " + gamesOfTeam.size());
        
        int wins = 0;
        for (Team teams : gamesOfTeam) {
            if (teams.winnerIs(team))
                wins++;
        }
        
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + (gamesOfTeam.size() - wins));
}
    
public static ArrayList<Team> readFromFile(String file) {
    ArrayList<Team> stats = new ArrayList<>();

        
    try (Scanner reader = new Scanner(Paths.get(file))) {
            
        while (reader.hasNextLine()) {
                
            String line = reader.nextLine();
                
            if(line.isEmpty()) {
                continue;
             }
                
            String[] parts = line.split(",");
            String homeTeam = parts[0];
            String awayTeam = parts[1];
            int homePoints = Integer.valueOf(parts[2]);
            int awayPoints = Integer.valueOf(parts[3]);
                
            stats.add(new Team(homeTeam, awayTeam, homePoints, awayPoints));
        }
            
    } catch (Exception e) {
        System.out.println("Error" + e.getMessage());
    }
    
    return stats;
        
        
        
        
        

    }

}
