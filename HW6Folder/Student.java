import java.util.Random; 
public class Student {
    String name; 
    String year; 
    double gpa;
    int id; 
    public Student(String n, String y, double g, int i){
        name = n; 
        year = y; 
        gpa = g; 
        id= i; 


    }
    void isHonors() {
        if(this.gpa >= 3.6){
            System.out.println(this.name +  " is on honor roll"); 
        }else{
            System.out.println(this.name + "is NOT on honor roll"); 
        }


    }

    void getsFreeLunch(int freeLunchID) {
        if(this.id == freeLunchID) {
            System.out.println(this.name + " Get's free lunch today!");
        }else {
            System.out.println(this.name + " sorry, no free lunch for you today"); 
        }
    }
