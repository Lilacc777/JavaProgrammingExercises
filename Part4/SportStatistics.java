//Note: The CSV file "data.csv" is used in this file.
package Part4;

import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;

public class SportStatistics {
    public static void main(String args[]){
        Scanner scannerForFile = new Scanner(System.in);
        System.out.println("File:");
        String file = scannerForFile.nextLine();
        ArrayList<Sport> games = readRecordsFromFile(file);

        System.out.println("Team:");
        String team = scannerForFile.nextLine();

        ArrayList<Sport> gamesOfATeam = new ArrayList<>();
        for(Sport game: games){
            if(team.equals(game.getHomeTeam()) || team.equals(game.getVisitingTeam())){
                gamesOfATeam.add(game);
            }
        }
        System.out.println("Games: " + gamesOfATeam.size());

        int wins = 0;
        int losses = 0;
        for(Sport game: gamesOfATeam){
            if(game.isWin(team)){
                wins++;
            } else {
                losses++;
            }
        }

        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        
        scannerForFile.close();
    }
    public static ArrayList<Sport> readRecordsFromFile(String file) {
        ArrayList<Sport> games = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get(file))){
            while(scanner.hasNextLine()){
                String[] parts = scanner.nextLine().split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int visitingPoints = Integer.valueOf(parts[3]);
                games.add(new Sport(homeTeam, visitingTeam, homePoints, visitingPoints));
            }
        } catch (Exception e){
            System.out.println("Error " + e.getMessage());
        }
        return games;
    }
    static class Sport {
        private String homeTeam;
        private String visitingTeam;
        private int homePoints;
        private int visitingPoints;
        
        public Sport(String homeTeam, String visitingTeam, int homePoints, int visitingPoints) {
            this.homeTeam = homeTeam;
            this.visitingTeam = visitingTeam;
            this.homePoints = homePoints;
            this.visitingPoints = visitingPoints;
        }
        
        public String getHomeTeam() {
            return this.homeTeam;
        }
        
        public String getVisitingTeam() {
            return this.visitingTeam;
        }

        public int getHomePoints() {
            return this.homePoints;
        }

        public int getVisitingPoints() {
            return this.visitingPoints;
        }
        
        public boolean isWin(String team) {
            if(team.equals(homeTeam) && homePoints > visitingPoints){
                return true;
            } else if(team.equals(visitingTeam) && visitingPoints > homePoints){
                return true;
            } else {
                return false;
            }
        }
    }
}