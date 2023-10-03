import java.util.Scanner;

public class ArrayLab {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String[] menuItems = new String[15];
        double[] price = new double[15];
        int[] numItemsPur = new int[15];
        int totalOrders = 0;
        double profit = 0;
        int customerOrder;
        boolean hasCustomer;
        int i;
        int j;


//  provide menu items names as value to menu[]

        menuItems[0] = "Rib-eye Steak with Potatoes and Shrimps";
        menuItems[1] = "Mahi with Wild Rice";
        menuItems[2] = "Baked Chicken with Smashed Potatoes and Dinner Roll";
        menuItems[3] = "Fried Porkchop with Mashed Potatoes and Dinner Roll";
        menuItems[4] = "Shrimp and Chicken Alfredo";
        menuItems[5] = "Nacho Dip";
        menuItems[6] = "Chicken Bites";
        menuItems[7] = "Firecracker Shrimps";
        menuItems[8] = "Sliders";
        menuItems[9] = "Guacamole";
        menuItems[10] = "Red Velvet Cake";
        menuItems[11] = "Chocolate Cake";
        menuItems[12] = "Caramel Cake";
        menuItems[13] = "Lemon Pie";
        menuItems[14] = "Apple Pie";



//      provides price of items on the menuItems[]

        price[0] = 25.99;
        price[1] = 20.99;
        price[2] = 17.99;
        price[3] = 17.99;
        price[4] = 22.99;
        price[5] = 10.99;
        price[6] = 10.99;
        price[7] = 13.99;
        price[8] = 13.99;
        price[9] = 11.99;
        price[10] = 12.99;
        price[11] = 12.99;
        price[12] = 12.99;
        price[13] = 11.99;
        price[14] = 11.99;

//        Provides the number of times each individual item was ordered

        numItemsPur[0]  = 0;
        numItemsPur[1]  = 0;
        numItemsPur[2]  = 0;
        numItemsPur[3]  = 0;
        numItemsPur[4]  = 0;
        numItemsPur[5]  = 0;
        numItemsPur[6]  = 0;
        numItemsPur[7]  = 0;
        numItemsPur[8]  = 0;
        numItemsPur[9]  = 0;
        numItemsPur[10] = 0;
        numItemsPur[11] = 0;
        numItemsPur[12] = 0;
        numItemsPur[13] = 0;
        numItemsPur[14] = 0;

//        While loop that will accept drive-thru orders while the total order is less than 20

        while (totalOrders < 20) {
            System.out.println("Welcome to Smacks!");
            System.out.println();
            System.out.println("Are you ready to order: ");
            hasCustomer = scnr.nextBoolean();

//          If statement will check if the boolean hasCustomers is true or false


            if (hasCustomer){
                totalOrders += 1;

//           For loop will link the menuItems[] elements to the corresponding elements  in the price[]

                System.out.println("Here's our menu");
            for (i = 0; i < menuItems.length; i++) {
                String item = menuItems[i];
                double amount = price[i];
                System.out.println(i + " " + item + " " + amount);
            }

        }

//      Gets input from customer and output the menu item and price that corresponds to customer input

        System.out.println("Enter Menu Item #");
        customerOrder = scnr.nextInt();

        for (i = 0; i <= 0; i++) {
            if (hasCustomer) {
                System.out.println("Selected: " + menuItems[customerOrder]);
                numItemsPur[customerOrder] += 1;
                System.out.println();
                System.out.println("Your Total: " + price[customerOrder]);
                profit += Math.round(price[customerOrder]) ;

            }
        }
        System.out.println(profit);

// If statement check to see if total orders are equal to two
        if(totalOrders == 20){

            System.out.print("Your total profit is :");
           System.out.println(profit);


//          for loop loops through menuitems[] calculating the percentage of each item ordered

           for(i = 0; i < menuItems.length; i++){
               double percOfItem = 0;
               percOfItem = Math.round(( numItemsPur[i] / profit) * 100) ;

               if(percOfItem == 0) {
                   percOfItem = 0;
               }

//          Prints the summary which includes total profit, total number of times an item was ordered and the percent of each item ordered

               System.out.println("A total number of " + numItemsPur[i] + " " + menuItems[i]  + " was ordered. ");
               System.out.println();
               System.out.println("Percent of profits for " + menuItems[i] + " " + percOfItem + "%");


           }
        }
     }
    }



}




