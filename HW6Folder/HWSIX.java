import java.util.Random;
public class HWSIX {
    public static void main(String[] args) throws Exception {
       Student s1= new Student("Zach", "2029", 3.9, 1234);
       Student s2 = new Student("Macy", "2028", 3.7, 2345); 
       Student s3= new Student("John", "2027", 1.9, 3456); 
       Student s4= new Student("Cam", "2026", 3.46, 4567);
       Student s5= new Student("Emma", "2027", 3.28, 5678); 


       s1.isHonors();
       s2.isHonors();
       s3.isHonors();
       s4.isHonors();
       s5.isHonors();

       int ids [] = {1234, 2345, 3456, 4567, 5678};
       Random randomID = new Random(); 
       int freeLunchID = ids[randomID.nextInt(ids.length)]; 

       s1.getsFreeLunch(freeLunchID);
       s2.getsFreeLunch(freeLunchID);
       s3.getsFreeLunch(freeLunchID);
       s4.getsFreeLunch(freeLunchID);
       s5.getsFreeLunch(freeLunchID);

       // I learned how to generate a random item from an array. I used the array because I didn't want to just
       //generate a completely random number bc it would never match. 
       //  I had to look up how to do this bc tbh I had NO idea how to at first 



     




       
    }

}
