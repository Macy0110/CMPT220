import java.util.Arrays;

public class HwFourDebug {
    public static void main(String[] args) throws Exception {
       //Create me an array named "nameArray" that is a string and has 4 values in it, give me 4 names of people or animals you care about
        String [] arr1 = {"Lucy" , "Lindsay", "Zach" , "Wyatt"}; 
        //Create me an array without any values, but it's an integer array named "numArray"
        int [] numArray = {}; 
        //Create me an int array named "newArray" and set it to have 20 null spaces
        int [] newArray = new int[20]; 
        System.out.println(newArray.length); 

            
        String[] sortMe = {"Apple","Kiwi","Orange","Banana","Watermelon","Strawberry"};
            //What method is missing here to actually sort our array?
        Arrays.sort(sortMe);
        //And what method is missing here to print out that array?
        for (int i = 0; i < sortMe.length; i++){
            System.out.println(sortMe[i]); 
        }
        //After this, you cannot use the array helper file, gotta go back to the old ways!!

          //another one!
        int addMe[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //How would we add every index together and print out the sum??
       int sum=0;
        for(int k = 0; k < addMe.length; k++){
            sum = sum + addMe[k]; 
            

        }
        System.out.println(sum); 

           //thinking one! here's an array
           
        int maxMe[] = {280, 4892, 134, 23, 1937, 5329, 932, 89};
        int biggest = maxMe[0]; 
        //What would you have to do to find the largest number and then print that value?

        for(int j= 0; j < maxMe.length; j++){
            if(maxMe[j] > biggest){
                biggest = maxMe[j]; 

            }
        } System.out.println(biggest); 

        //A small hint:
      //  int sum = 0;
       // for(?;?;?){

        }


}
