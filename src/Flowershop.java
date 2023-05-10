import java.util.Scanner;

public class Flowershop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to our flowerShop!");
        System.out.println("Choose your types of flowers:");
        System.out.println("1. Rose");
        System.out.println("2. Tulips");
        System.out.println("3. Lilies");
        System.out.println("4. Lotus");
                System.out.print("Choose number of flowers what you want to buy: ");
        int flowerType = scanner.nextInt();

        double flowerPrice = 0;
        String flowerName = "";

        switch (flowerType) {
            case 1:
                flowerPrice = 5.5;
                flowerName = "Rose";
                break;
            case 2:
                flowerPrice = 3.2;
                flowerName = "Tulips";
                break;
            case 3:
                flowerPrice = 4.5;
                flowerName = "Lilies";
                break;
            case 4:
                flowerPrice = 7.5;
                flowerName = "Lotus";
                break;
            default:
                System.out.println("Number what you choose is no exist. please try again");
                System.exit(0);
        }

        System.out.print("How many flowers you want to buy: ");
        int quantity = scanner.nextInt();

        double totalPrice = flowerPrice * quantity;

        System.out.println();
        System.out.println("information of order:");
        System.out.println("Selected types of flowers: " + flowerName);
        System.out.println("Numbers of flowers: " + quantity);
        System.out.println("Price per Flower: $" + flowerPrice);
        System.out.println("Total cost: $" + totalPrice);

        System.out.println();
        System.out.print("Enter estimated delivery date (Example, 2023-05-15): ");
        scanner.nextLine(); // очистка буфера после ввода числа
        String deliveryDate = scanner.nextLine();

        System.out.println();
        System.out.println("Information of delivery:");
        System.out.println("Date of delivery: " + deliveryDate);
        System.out.println("Delivery Time : Usually 2-3 workings days");

        System.out.println();
        System.out.println("Thank you for your purchase!!!");
    }
}
