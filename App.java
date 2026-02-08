
// Macy Robbins, Data Science and Analytics Major 
import java.util.Scanner; 
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        System.out.println("This is a Valorant quiz Game");
        System.out.println("How many seconds does a clove smoke last? ");
        int score = 0; 
        int answerone = sc.nextInt (); 
        if (answerone == 13) {
            System.out.println("Correcct");
            score = +1;
            System.out.println("Your score is " + score); 
        } else {
            System.out.println("Incorrect");
        }
        sc.nextLine();
        System.out.println("What is the name of Raze's ultimate ability? ");
        String answer2 = sc.nextLine();
        if (answer2.equals( "Showstopper")|| answer2.equals("showstopper") || answer2.equals( "ShowStopper")) { 
            System.out.println("Correct");
            score = +2; 
            System.out.println("Your score is " + score);
        } else {
            System.out.println("Incorrect");
        }
        System.out.println("How many seconds does it take for the spike to explode? ");
        int answerthree = sc.nextInt();
        if (answerthree == 7){
            System.out.println("Correct");
            score = score +1;
            System.out.println("Your final score is " + score);
        } else {
            System.out.println("Incorrect");
        }



}
}
// I learned how to use if/ else if/ else statements in java as well as the and or syntax. 
// I'm also learning that a lot of the stuff I learned in python can be used for java, but it's usually going 
// to be with different syntax. 