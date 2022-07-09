import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 1 team
        Kid kid1 = new Kid("Bob");
        Kid kid2 = new Kid("Can");
        Kid kid3 = new Kid("Anna");
        Kid kid4 = new Kid("Elena");
        Kid kid5 = new Kid("Bill");

        // 2 team
        Kid kid6 = new Kid("Chak");
        Kid kid7 = new Kid("Brus");
        Kid kid8 = new Kid("Luci");
        Kid kid9 = new Kid("Jack");
        Kid kid10 = new Kid("Brus");

        // 3 team
        Kid kid11 = new Kid("Sara");
        Kid kid12 = new Kid("Anna");
        Kid kid13 = new Kid("Pavel");
        Kid kid14 = new Kid("Dima");
        Kid kid15 = new Kid("Roma");

        // building the first team
        List<Kid> team1 = new ArrayList<>();
        team1.add(kid1);
        team1.add(kid2);
        team1.add(kid3);
        team1.add(kid4);
        team1.add(kid5);
        team1.remove(2);
        team1.add(0, kid3);
        team1.add(1, kid5);
        team1.remove(5);
        System.out.println("Team 1:");
        kid1.speak();
        System.out.println("Our team spent time on rearrangements, but the task was completed:! " + "\n" +
                team1 + "\n" + "--------------------------------------------------------------");

        // building the second team
        Set<Kid> team2 = new HashSet<>();
        team2.add(kid6);
        team2.add(kid7);
        team2.add(kid8);
        team2.add(kid9);
        team2.add(kid10);
        System.out.println("Team 2:");
        kid6.speak();
        System.out.println("The game is lost: " + "\n" +
                "-We have left in the team " +  team2.size() + " players" + "\n" +
                "-we have two players with the same name and we kicked one player," + "\n" +
                "-we could not line up as the first team! " + "\n" + team2 + "\n" +
                "--------------------------------------------------------------");

        // building the third team
        Map<String, Kid> team3 = new TreeMap<>();
        team3.put("Sara", kid11);
        team3.put("Anna", kid12);
        team3.put("Pavel", kid13);
        team3.put("Dima", kid14);
        team3.put("Roma", kid15);
        System.out.println("Team 3:");
        kid11.speak();
        System.out.println("We first thought, and then lined up!: " + "\n" + team3);
    }
}
