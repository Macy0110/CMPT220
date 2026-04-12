public class Goblin extends Enemy {
    String type; 
    
    public Goblin(int h, int d, String t){
        super(h,d); 
        type= t; 
    }
    @Override
    void attack(){
         System.out.println(this.type + "  goblin gobbles");
    }

    //needs method to overwrite attack in enemy to say "the goblin gobbles" instead of "the enemy attacks
}
