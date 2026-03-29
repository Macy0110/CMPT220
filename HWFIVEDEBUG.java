import java.util.Scanner;
public class HWFIVEDEBUG {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); 
       
       
       //P2: Ask the user for a number. Create a loop to find the factorial of it
       System.out.println("Enter a number and I will tell you the factorial");
       int input = sc.nextInt(); 
       System.out.println(factorial(input)); 
       
       //P3: Ask the user for a number, and then add together every OTHER digit (starting from 1)
       System.out.println("Enter a number and I will tell you the sum of every other number");
       int inputTwo = sc.nextInt(); 
       System.out.println(sum(inputTwo)); 

        //P5: Take a string from the user and print them in reverse!
        System.out.println("Enter a string, and I will tell you it backwards.");
       sc.nextLine();
        String fowards= sc.nextLine(); 
        backwards(fowards); 

        
    }
public static int factorial(int num){
   int factorial=1;
    for(int i=1; i <=num; i++){
        factorial = factorial* i; 
       }

return factorial;
} 
public static int sum(int inputTwo){ 
    int sum = 0; 
    for(int k=0; k<= inputTwo; k+=2){
        sum+=k; 
    }
    return sum; 
}
public static void backwards( String fowards) {
    for (int p=fowards.length()-1; p>=0; p--){
        System.out.print(fowards.charAt(p)); 
    }
}


}
