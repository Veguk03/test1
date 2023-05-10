import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zdravstvuite");
        System.out.println("Are you find flowers?");
        Scanner scanner = new Scanner(System.in);

        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("yes")){
            System.out.println("What kind of flowers do you want to see");
            String flowers = scanner.nextLine();
            System.out.println("You want flowers:"+ flowers);
        }
    }
}