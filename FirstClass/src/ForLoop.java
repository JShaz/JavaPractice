import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int i;
        int j;
        int k;
        int l;
        int m;
        int n;


////Loop 1
for(i = 0; i <= 99; ++i){
    System.out.println(i);
}

////Loop 2
for(j = 0; j <= 99; ++j){
    if(j % 2 != 0){
       System.out.println(j);
    }
}


////Loop 3
for(k = 0; k <= 99; ++k){
  if(k % 2 == 0){
      System.out.println(k);
    }
}

//Loop 4
for(l = 0; l <= 99; ++l){
    if(l % 2 != 1){
    System.out.println(l);
    }
}

////Loop 5
int oddSum = 0;
for(m = 0; m <= 99; m++){
    if(m % 2 != 0){
       oddSum = oddSum + m;
    }
}
System.out.println(oddSum);


////Loop 6
int evenSum = 0;
for(n = 0; n <= 99; n++){
    if(n % 2 != 1){
        evenSum = evenSum + n;
    }
  }
System.out.println(evenSum);


////Loop 7
System.out.print("Enter the first number: ");
int numOne = scnr.nextInt();

System.out.print("Enter the second number: ");
int numTwo = scnr.nextInt();


if (numOne > numTwo) {
    System.out.println("Please enter the numbers in ascending order.");
    return;
}


int totalSum = 0;


for (int a = numOne; a <=numTwo; a++) {
    totalSum += a;
}
System.out.print(totalSum);






    }
}

