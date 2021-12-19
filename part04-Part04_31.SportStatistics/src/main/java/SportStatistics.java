
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine();
        
        System.out.println("Team:");
        String inputTeam = scan.nextLine();
        
        ArrayList<String> info = new ArrayList<>();
        int games = 0;
        int wins = 0;
        int losses = 0;
        
        try(Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(",");
                String teamName1 = parts[0];
                String teamName2 = parts[1];
                int homeRounds = Integer.valueOf(parts[2]);
                int awayRounds = Integer.valueOf(parts[3]);
                
                if (teamName1.contains(inputTeam) && homeRounds > awayRounds) {
                    wins++;
                    games++;
                } else if (teamName2.contains(inputTeam) && homeRounds < awayRounds) {
                    wins++;
                    games++;
                } else if (teamName1.contains(inputTeam) || teamName2.contains(inputTeam)) {
                    losses++;
                    games++;
                } else {
                    continue;
                }
            }
        } catch (Exception e) {
            System.out.println("error ");
        }
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
