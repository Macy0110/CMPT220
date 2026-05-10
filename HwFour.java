import java.util.Scanner; 
import java.util.*; 
public class HwFour {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); 
    //Don't let the size of this scare you! no matter how big an array is, it all works the same!

     int[] myArray = {10,3,295,38,20,3,4,267,2445,10,5566,87,93,17,10,2,87,267,3176,3,82};
      //you cannot use the array util. Do this one by hand :(

      for (int i =0; i< myArray.length; i++){
        int count = 0; 
        boolean repeated = false; 
        for(int k =0; k< 1; k++){
            if(myArray[i] == myArray[k]){
                repeated = true; 
            }
        }
        for(int j =0; j< myArray.length; j++){
            if(myArray[i] == myArray[j]){
                count++;
            }
        } if(count >1 && repeated == false){
            System.out.println(myArray[i] + " comes up " + count + " times");
        }
      }
        //I learned how to create a more advanced loop AND see how many times something appears 
        //more than once AND add how many times it appeared to a count because obv I already know how loops work, but this was rly different and a lot harder. 


      
      
            }
    }
