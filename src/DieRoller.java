import java.util.Random;
public class DieRoller {
    public static void main(String[] args) {
        Random gen = new Random();
        int die1 = 0;
        int die2 = 0;
        int die3 = 0;
        int sum = 0;
        int count = 0;
        System.out.println("Roll Die1 Die2 Die3 Sum");
        System.out.println("--------------------------");
        do {
            count ++;
            die1 = gen.nextInt(6) + 1;
            die2 = gen.nextInt(6) + 1;
            die3 = gen.nextInt(6) + 1;
            sum = die1 + die2 + die3;
            System.out.printf("%4d %4d %4d %4d %4d%n", count, die1, die2, die3, sum);
        } while (die1 != die2 || die2 != die3);
    }
}