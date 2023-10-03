import java.util.Scanner;

public class FlowControl {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

//
// To store user inputs
        int firstInput;
        int secondInput;


//Get user inputs
            System.out.println("Enter a number:");
            firstInput = scnr.nextInt();

            System.out.println("Enter another number:");
            secondInput = scnr.nextInt();


//calculates and store difference of user inputs
            int diff = firstInput - secondInput;

// Checks if the difference between the user inputs are great than or equal to 200
            if (diff >= 200) {
//Prints the sum
                System.out.println(diff);

            }

// Stores sum of even numbers divisible by 4, 8, and 5
            int divisible4 = 0;
            int divisible8 = 0 ;
            int notdivisible5 = 0 ;

// Switch statements use do-while , while, and for loops based on the difference

        switch (diff % 3) {
            case 0:
// for loop
                for(int a = firstInput; a <= secondInput; a++){
                    if (a % 4 == 0 && a % 2 == 0){
                        divisible4 += a;
                    }
                    if (a % 8 == 0 && a % 2 == 0 ) {
                        divisible8 += a;
                    }
                    if (a % 5 != 0 && a % 2 != 0 ) {
                        notdivisible5 += a;
                    }
                }
                break;

//do-while loop

            case 1:
                int b = firstInput;
                do {
                    if(b % 4 == 0 && b % 2 == 0){
                        divisible4 += b;
                    }if(b % 8 == 0 && b % 2 == 0){
                        divisible8 += b;
                    }if(b % 5 != 0 && b % 2 != 0){
                        notdivisible5 += b;
                    }
                    b++;
                } while (b <= secondInput);
                break;
            case 2:
                int c = firstInput;
                while(c <= secondInput){

                   if (c % 4 == 0 && c % 2 == 0){
                       divisible4 += c;
                   }if (c % 8 == 0 && c % 2 == 0){
                       divisible8 += c;
                   }if (c % 5 != 0 && c % 2 != 0 ){
                       notdivisible5 += c;
                   }
                   c++;
                }
                break;
        }

        System.out.println("Sum of even numbers divisible by 4: " + divisible4);
        System.out.println("Sum of even numbers divisible by 8: " + divisible8);
        System.out.println("Sum of  non-even  numbers not divisible by 5: " + notdivisible5);

        scnr.close();
    }
}
