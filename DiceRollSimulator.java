import java.util.Random;

public class DiceRollSimulator {
    public static void main(String[] args) {

        Random random = new Random();

        int die1 = random.nextInt(6) + 1;
        int die2 = random.nextInt(6) + 1;

        System.out.println("Rolling the dice...");
        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);

        int total = die1 + die2;
        System.out.println("Total: " + total);
    }
}
