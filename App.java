import java.util.Scanner; 
public class App {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.println("Type in a string, and I will return each letter on a new line");
    String yourstring = sc.nextLine();
    for ( int i= 0; i < yourstring.length(); i++ ){
        System.out.println(yourstring.charAt(i));
    }

    }
}
