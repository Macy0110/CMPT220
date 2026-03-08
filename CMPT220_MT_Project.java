import java.util.Scanner;
//Macy Robbins, Soft Dev MT Project

public class CMPT220_MT_Project {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); 
        //get trial numbers from user 
        System.out.println("This program will analyze the results of a clinical trial!");
        System.out.println("Please input how many patients imporved."); 
        int patientsImproved = sc.nextInt(); 
        System.out.println("Please input how many patients had no change.");
        int patientsNoChange= sc.nextInt(); 
        System.out.println("Please input the amount of patients that got worse");
        int patientsWorse = sc.nextInt(); 
        
        //add all inputs together for total
        int totalpatients = patientsImproved + patientsNoChange + patientsWorse; 
        System.out.println("In total you have " + totalpatients + " patients.");
        //set counts for loop
        int patientImprovedCount = 0; 
        int patientWorseCount = 0; 
        int patientSameCount = 0; 
        //loop through all patients and add them to their category 
        //take away each patient already counted from their respective category 
        for(int i = 0; i< totalpatients ; i++){ 
            if(patientsImproved> 0) {
                patientImprovedCount++; 
                patientsImproved--;
            } else if(patientsWorse >0) {
                patientWorseCount++;
                patientsWorse--; 
            } else {
                patientSameCount++; 
                patientsNoChange--; 
            }

    }
    double successRate= (double)patientImprovedCount/ totalpatients; 
    //Determine if trial was successful...sucessful is there are more patients who improved 

    if(patientImprovedCount> patientWorseCount){  
        System.out.println("The trial was successful");
        System.out.println("The sucess rate of your trial was " + (successRate*100)+ "%");  

    } else if(patientImprovedCount< patientWorseCount){
        System.out.println("The trial was not sucessful"); 
        System.out.println("The sucess rate of your trial was " + (successRate*100)+ "%"); 
    } else {
        System.out.println("The trial was inconclusive");
         //if numbers were even then we don't know if it was successful or not 
        System.out.println("The sucess rate of your trial was " + (successRate*100)+ "%"); 
    }


    }
}
