import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //P1: This one only prints 0-9, can you fix it so it prints 1-10?
        System.out.println("Problem 1");
        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }

        //P2: Ask the user for a number. Create a loop to find the factorial of it
        //(factorial = X!, X being the user input, Factorials are every digit before X multiplied together)
        System.out.println("Problem 2");
        System.out.println("Enter a number and I will tell you the factorial: ");
        int num = sc.nextInt(); 
        int factorial = 1;
        for (int i = 1; i <= num; i++){
            factorial = factorial * i; 
            
        }
        System.out.println("Your facrotiral is " + factorial);
        //here's a hint

        //for (int i = 0; i < ?; i++){

        

        //P3: Ask the user for a number, and then add together every OTHER digit (starting from 1)
        System.out.println("Problem 3");
        System.out.println("Enter a number and I will tell you the sum of every other number: ");
        int numtwo= sc.nextInt(); 
        int sum= 0;
        //No hint! what do you need to complete this task?
        for ( int k = 1; k <= numtwo; k+=2) {
            sum+= k; 
        }
        System.out.println(sum); 


        //P4: Why does this loop never stop!
        //what can you do to break out of the loop after it prints once?
        System.out.println("Problem 4");
        boolean run = true;
        while (run == true){
            System.out.println("I printed once!");
            run = false; 
        }
         //P5: Take a string from the user and print them the reverse!
        System.out.println("Problem 5");
        //hint
        System.out.println("Enter a string");
        sc.nextLine(); 
        String yourstring = sc.nextLine(); 
        //String reverse = "";
        for ( int p= yourstring.length()-1; p >= 0; p-- ){
        System.out.println(yourstring.charAt(p));
    }
    }
}


