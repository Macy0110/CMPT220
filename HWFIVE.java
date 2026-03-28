public class HWFIVE {
    public static void main(String[] args) throws Exception {
       //I want to create a function that could be implemented in valorant to let the user know
       //they are low in bullets and might want to re load soon 
    
       printLowBullets(3);
        
    }
    public static void printLowBullets(int bullets){
        if (bullets<=4){
        System.out.println(" ⚠️ Warning: Low Bullets ⚠️ "); 
    } else {
        System.out.println("  ");
    }
       }
    
    }
