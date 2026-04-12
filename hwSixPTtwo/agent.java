public class agent {
    String name; 
    String role; 
    int kills; 
    int assists;

    public agent(String n, String r, int k, int a){
        name = n; 
        role = r;
        kills = k; 
        assists = a; 
    }
    
    void whatRole(){
        if(this.role == "Sentinal"){
            System.out.println(this.name+ " is supposed to hold down site and get information"); 
        }else if(this.role == "Controller"){
            System.out.println(this.name + " is supposed to smoke off chokes and hold down sites");
        } else if(this.role == "Duelist"){
            System.out.println(this.name + " is supposed to take space and get kills!");
        }else {
            System.out.println(this.name + " is supposed to help the duelist enter site and get information "); 
        }
        }

    void dueliPreformingWell() {
        if(this.kills >= 19 && this.role == "Duelist"){
            System.out.println(this.name + " is preforming well"); 
        }else {
            System.out.println(this.name + " is NOT preforming well"); 
        }
    }
    void initiPreformingWell() {
        if(this.assists >= 10 && this.role == "Initiator"){
            System.out.println(this.name + " is preforming well"); 
        }else{
            System.out.println(this.name + " is NOT  preforming well"); 
        }
    }
    
    }
