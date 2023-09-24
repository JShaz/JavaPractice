import java.util.Scanner;

public class Invoice {

        public static void main(String[]args){
            Scanner input = new Scanner(System.in);
            double ticketPrice;
            int age;
            int attending;
            String name;
            double totalPrice;
            double discount;
            double taxes;


            ticketPrice = 400.00;

            System.out.println("Enter number of tickets: ");
            attending = input.nextInt();

            System.out.println( "Enter your age");
            age = input.nextInt();

            System.out.println("Enter Your Name: ");
            name = input.next();

            discount = 50.00;
            taxes = .6;

            totalPrice = (ticketPrice * attending) ;

            if( age > 55){
                System.out.print("You qualify for a discount");
                totalPrice = totalPrice - discount;

            }
            else{

            }



            System.out.println("Invoice");
            System.out.println("Group: " + name);
            System.out.println("Number of guest: " + attending );
            System.out.println("Price per ticket: " + ticketPrice);
            System.out.println("Your total is: " + totalPrice);
        }
    }


