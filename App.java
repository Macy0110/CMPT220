import java.util.Arrays;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        //Create me an array named "nameArray" that is a string and has 4 values in it, give me 4 names of people or animals you care about"
        String[] nameArray = {"Lucy", "Lindsay", "Zach", "Delaney"};
        //Create me an array without any values, but it's an integet array names "numArray"
        Integer[] numArray= {}; 
        //Create me an int array names "newArray" and ser it to have 20 null spaces 
        int[] newArray= new int[20];
        System.out.println(newArray[3]); //to check

        //Here's our first practice array!
        String[] sortMe= {"Apple", "Kiwi", "Orange", "Banana", "Watermelon", "Strawberry"};
        //What method is missing here to actually sort our array
        //We are missing actually telling it to sort. just add in sort 
        Arrays.sort(sortMe); 
        //And what method is missing here to print out that array?
        //just missing the arrays.sort help file and the name of the array to sort 
        System.out.println(Arrays.toString(sortMe)); 
        //After this, you cannot use the array helper file, gotta go back to the old ways!!

        //another one!
        int addMe[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //How would we add every index together and print out the sum??
        int sum = 0; 
        for (int i = 0; i < addMe.length; i++) {
            //I hope maxMe.length isnt a helper file (not sure how to do without)
            sum = sum+ addMe[i]; 
        }
        System.out.println(sum); 
        
        //thinking one! here's an array
        int maxMe[] = {280, 4892, 134, 23, 1937, 5329, 932, 89}; 
        int max = maxMe[0]; 
        for (int i = 0; i < maxMe.length; i++){
            //I hope maxMe.length isnt a helper file (not sure how to do without)
            if (maxMe[i] > max) {
                max= maxMe[i];
            }
        }
        System.out.println(max); 


    }
}
