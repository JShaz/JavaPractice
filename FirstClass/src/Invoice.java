import java.util.Scanner;

public class Invoice {

        public static void main(String[]args){
            Scanner input = new Scanner(System.in);
            int ticketPrice;
            int attending;
            String groupName;
            int totalPrice;


            ticketPrice = 400;

            System.out.println("Enter number of guest: ");

            attending = input.nextInt();
            System.out.println("Enter Group Name: ");


            groupName = input.next();

            totalPrice = ticketPrice * attending;

            System.out.println("Invoice");
            System.out.println("Group: " + groupName);
            System.out.println("Number of guest: " + attending );
            System.out.println("Price per ticket: " + ticketPrice);
            System.out.println("Your total is: " + totalPrice);
        }
    }


