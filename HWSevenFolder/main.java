
     public class main {
    public static void main(String[] args) {

        //create a generic enemy and call its functions
        Enemy e1 = new Enemy(79, 24); 
        e1.attack(); 

        //create a fire and an ice wizard and call all functions
        Wizard w1 = new Wizard(90, 22, "fire");
        Wizard w2 = new Wizard(90, 17, "ice");
        w1.damageType(); 
        w2.damageType(); 

        //create a goblin and call its functions
        Goblin g1 = new Goblin(99, 12, "green"); 
        Goblin g2 = new Goblin (99, 12, "Purple"); 
        g1.attack(); 
        g2.attack(); 


    }

    }
