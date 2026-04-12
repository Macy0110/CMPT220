public class Valorant {
    public static void main(String[] args) throws Exception {
        agent a1= new agent("Sage", "Sentinal", 12, 8); 
        agent a2 = new agent("Clove", "Controller", 20, 12); 
        agent a3 = new agent("Jett", "Duelist", 23, 5); 
        agent a4 = new agent("Reyna", "Duelist", 8, 5); 
        agent a5 = new agent("Skye", "Initiator", 13, 19); 
        agent a6 = new agent("Sova", "Initiator", 17, 8); 


        a1.whatRole(); 
        a2.whatRole(); 
        a3.whatRole(); 
        a4.whatRole(); 
        a5.whatRole(); 
        a6.whatRole(); 

        a3.dueliPreformingWell(); 
        a4.dueliPreformingWell(); 

        a5.initiPreformingWell();
        a6.initiPreformingWell();

    
    }
}
