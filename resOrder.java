import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class resOrder{

    // Method to calculate total price
    public static int calculateTotalPrice(int price, int plates) {
        return price * plates;
    }

    // Method to write order details to file
    public static void writeToFile(String fileName, String orderDetails) {
        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            fileWriter.write(orderDetails);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // Method to get input from user
    public static String getInput(Scanner scanner) {
        String input = scanner.nextLine();
        if (input.isEmpty()) {
            System.out.println("Invalid input, please enter a valid input");
            return getInput(scanner);
        }
        //validate with regex
        String regex = "^[a-zA-Z ]+$";
        if (!input.matches(regex)) {
            System.out.println(
                    "\n\n                                                                      Please enter a valid name");
            return getInput(scanner);
        }
        return input;
    }


    // Method to get order from user
    public static int getOrder(Scanner scanner) {
        String input = scanner.nextLine();
        try {
            int orderNumber = Integer.parseInt(input);
            return orderNumber;
        } catch (NumberFormatException e) {
            System.out.println("Invalid order number, please enter a valid number");
            // call the method again
            return getOrder(scanner);
        }
    }



    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = "Hyderabadi Biryani";
        String b = "Hyderabadi Haleem";
        String c = "Chicken 65";
        String d = "Pathar Ka Gosht";
        String e = "Qabooli Biryani";
        String f = "Keama samosa";
        String g = "Hyderabadi Dum ka Murgh";
        String h = "Mutton Dalcha";
        String i = "Mirchi ka Salan";
        String j = "Double ka Meetha";
        String k = "Nazaqati Boti Kebab";
        String l = "Sofiana Biryani";

        // Menu
        System.out.println(
                "\n\n                                                                       || WELCOME TO LPU RESTOBAR ||");
        System.out.println(
                "\n\n                     <-----------------------------------------------------------MENU------------------------------------------------------------->  ");
        System.out.println(
                "\n\n\n                                1. Hyderabadi Biryani (499/-).                            7. Hyderabadi Dum ka Murgh (699/-).");
        System.out.println(
                "\n\n                                2. Hyderabadi Haleem (299/-).                             8. Mutton Dalcha (499/-).");
        System.out.println(
                "\n\n                                3. Chicken 65 (599/-).                                    9. Mirchi ka Salan (299/-).");
        System.out.println(
                "\n\n                                4. Pathar Ka Gosht (399/-).                               10. Double ka Meetha (199/-).");
        System.out.println(
                "\n\n                                5. Qabooli Biryani (799/-).                               11. Nazaqati Boti Kebab (499/-).");
        System.out.println(
                "\n\n                                6. Keama samosa (199/-).                                  12. Sofiana Biryani (499/-).");
        System.out.println("\n\n                                                    <--Pick Any Dish You Want-->\n\n");

        // Taking input from user
        int  plates;
        System.out.print("\n                                                        customer name  = ");
        String userInput = getInput(sc);
        // validate the user input
      //  String regex = "^[a-zA-Z ]+$"; // regular expression pattern for matching names
        // System.out.println("\n\n                                                            ORDER NOW");
        System.out.println("\n                                                       welcome " + userInput + "!!");
        System.out.print("\n                                                        Dish Number  = ");
        int orderInput = getOrder(sc);

        // validate the order input
        if (orderInput < 1 || orderInput > 12 || orderInput == 0) {
            System.out.println("Invalid order number , Please enter a valid number");
            orderInput = getOrder(sc);
        }
        System.out.print("\n                                                        no.of plates = ");




            plates = getOrder(sc);

           // validate the plates input
        if (plates < 1 || plates > 10 || plates == 0) {
            System.out.println("Invalid plates number , Please enter a valid number");
            plates = getOrder(sc);
        }
        String orderDetails;
        int totalPrice;

        switch (orderInput) {
            case 1:
                System.out.printf("                                                %s  --> price  = 499/-\n\n", a);
                totalPrice = calculateTotalPrice(499, plates);
                System.out.printf("                                                %d Plates Of %s = %d/-\n\n", plates,
                        a, totalPrice);
                System.out.printf("                                                      YOUR TOTAL  =  %d/-\n",
                        totalPrice);
                orderDetails = String.format("Name %s,%s, %d plates, Total price: %d/-\n", userInput, a, plates,
                        totalPrice);

                writeToFile("orders.txt", orderDetails);
                break;
            case 2:
                System.out.printf("                                                %s  --> price  = 299/-\n\n", b);
                totalPrice = calculateTotalPrice(299, plates);
                System.out.printf("                                                %d Plates Of %s = %d/-\n\n", plates,
                        a, totalPrice);
                System.out.printf("                                                      YOUR TOTAL  =  %d/-\n",
                        totalPrice);
                orderDetails = String.format("Name %s,%s, %d plates, Total price: %d/-\n", userInput, b, plates,
                        totalPrice);
                writeToFile("orders.txt", orderDetails);
                break;
            case 3:
                System.out.printf("                                                %s  --> price  = 599/-\n\n", c);
                totalPrice = calculateTotalPrice(599, plates);
                System.out.printf("                                                %d Plates Of %s = %d/-\n\n", plates,
                        a, totalPrice);
                System.out.printf("                                                      YOUR TOTAL  =  %d/-\n",
                        totalPrice);
                orderDetails = String.format("Name %s,%s, %d plates, Total price: %d/-\n", userInput, c, plates,
                        totalPrice);
                writeToFile("orders.txt", orderDetails);
                break;
            case 4:
                System.out.printf("                                                %s  --> price  = 399/-\n\n", d);
                totalPrice = calculateTotalPrice(399, plates);
                System.out.printf("                                                %d Plates Of %s = %d/-\n\n", plates,
                        d, totalPrice);
                System.out.printf("                                                      YOUR TOTAL  =  %d/-\n",
                        totalPrice);
                orderDetails = String.format("Name %s,%s, %d plates, Total price: %d/-\n", userInput, d, plates,
                        totalPrice);
                writeToFile("orders.txt", orderDetails);
                break;
            case 5:
                System.out.printf("                                                %s  --> price  = 799/-\n\n", e);
                totalPrice = calculateTotalPrice(799, plates);
                System.out.printf("                                                %d Plates Of %s = %d/-\n\n", plates,
                        e, totalPrice);
                System.out.printf("                                                      YOUR TOTAL  =  %d/-\n",
                        totalPrice);
                orderDetails = String.format("Name %s,%s, %d plates, Total price: %d/-\n", userInput, e, plates,
                        totalPrice);
                writeToFile("orders.txt", orderDetails);
                break;
            case 6:
                System.out.printf("                                                %s  --> price  = 199/-\n\n", f);
                totalPrice = calculateTotalPrice(199, plates);
                System.out.printf("                                                %d Plates Of %s = %d/-\n\n", plates,
                        f, totalPrice);
                System.out.printf("                                                      YOUR TOTAL  =  %d/-\n",
                        totalPrice);
                orderDetails = String.format("Name %s,%s, %d plates, Total price: %d/-\n", userInput, f, plates,
                        totalPrice);
                writeToFile("orders.txt", orderDetails);
                break;
            case 7:
                System.out.printf("                                                %s  --> price  = 699/-\n\n", g);
                totalPrice = calculateTotalPrice(699, plates);
                System.out.printf("                                                %d Plates Of %s = %d/-\n\n", plates,
                        g, totalPrice);
                System.out.printf("                                                      YOUR TOTAL  =  %d/-\n",
                        totalPrice);
                orderDetails = String.format("Name %s,%s, %d plates, Total price: %d/-\n", userInput, g, plates,
                        totalPrice);
                writeToFile("orders.txt", orderDetails);
                break;
            case 8:
                System.out.printf("                                                %s  --> price  = 499/-\n\n", h);
                totalPrice = calculateTotalPrice(499, plates);
                System.out.printf("                                                %d Plates Of %s = %d/-\n\n", plates,
                        h, totalPrice);
                System.out.printf("                                                      YOUR TOTAL  =  %d/-\n",
                        totalPrice);
                orderDetails = String.format("Name %s,%s, %d plates, Total price: %d/-\n", userInput, h, plates,
                        totalPrice);
                writeToFile("orders.txt", orderDetails);
                break;
            case 9:
                System.out.printf("                                                %s  --> price  = 299/-\n\n", i);
                totalPrice = calculateTotalPrice(299, plates);
                System.out.printf("                                                %d Plates Of %s = %d/-\n\n", plates,
                        i, totalPrice);
                System.out.printf("                                                      YOUR TOTAL  =  %d/-\n",
                        totalPrice);
                orderDetails = String.format("Name %s,%s, %d plates, Total price: %d/-\n", userInput, i, plates,
                        totalPrice);
                writeToFile("orders.txt", orderDetails);
                break;
            case 10:
                System.out.printf("                                                %s  --> price  = 199/-\n\n", j);
                totalPrice = calculateTotalPrice(199, plates);
                System.out.printf("                                                %d Plates Of %s = %d/-\n\n", plates,
                        j, totalPrice);
                System.out.printf("                                                      YOUR TOTAL  =  %d/-\n",
                        totalPrice);
                orderDetails = String.format("Name %s,%s, %d plates, Total price: %d/-\n", userInput, j, plates,
                        totalPrice);
                writeToFile("orders.txt", orderDetails);
                break;
            case 11:
                System.out.printf("                                                %s  --> price  = 499/-\n\n", k);
                totalPrice = calculateTotalPrice(499, plates);
                System.out.printf("                                                %d Plates Of %s = %d/-\n\n", plates,
                        k, totalPrice);
                System.out.printf("                                                      YOUR TOTAL  =  %d/-\n",
                        totalPrice);
                orderDetails = String.format("Name %s,%s, %d plates, Total price: %d/-\n", userInput, k, plates,
                        totalPrice);
                writeToFile("orders.txt", orderDetails);
                break;
            case 12:
                System.out.printf("                                                %s  --> price  = 499/-\n\n", l);
                totalPrice = calculateTotalPrice(499, plates);
                System.out.printf("                                                %d Plates Of %s = %d/-\n\n", plates,
                        l, totalPrice);
                System.out.printf("                                                      YOUR TOTAL  =  %d/-\n",
                        totalPrice);
                orderDetails = String.format("Name %s,%s, %d plates, Total price: %d/-\n", userInput, l, plates,
                        totalPrice);
                writeToFile("orders.txt", orderDetails);
                break;
            default:
                System.out.println("                   Invalid Input  ==> Please Try Again! Requested order is not available \n\n");
        }
    }
}