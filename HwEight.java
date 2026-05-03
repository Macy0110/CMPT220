import java.util.Stack; 
import java.util.Queue; 
import java.util.LinkedList; 
import java.util.Collections; 
public class HwEight {
    public static void main(String[] args) throws Exception {
        /*
Remember that stacks/queues/linkedlists all work super similarly to arraylists, so i bet you $10 you could reference earlier HW if you get stuck....

1. Take the stack I created and find the maximum and minimum value
2. Find out how many elements were in the stack

3. Find the middle value of the linkedlist I created

4. Implement a real life example of any of the structures and do at least 3 operations to it
*/


        Stack<Integer> stax = new Stack<>();
        
        stax.push(70);
        stax.push(34);
        stax.push(807);
        stax.push(61);
        stax.push(28);
        stax.push(563);
        stax.push(492);
        stax.push(386);

        System.out.println(Collections.min(stax)); 
        System.out.println(Collections.max(stax)); 
        System.out.println(stax.size()); 
        stax.pop(); 
        stax.pop(); 
        stax.pop(); 
        System.out.println(stax); 
        System.out.println("The middle elements are"); 
        System.out.println(stax.peek()); 
        stax.pop(); 
        System.out.println(stax.peek()); 

       
        
        
        
        
        LinkedList<Integer> linky = new LinkedList<>();

        linky.add(10);
        linky.add(20);
        linky.add(30);
        linky.add(40);
        linky.add(50);

        linky.remove(); 
        linky.remove(); 
        System.out.println("The middle element is"); 
        System.out.println(linky.peek());


        Stack<Integer> unoDiscardPile = new Stack<>();

        unoDiscardPile.push(4); 
        unoDiscardPile.push(3); 
        unoDiscardPile.push(6); 
        unoDiscardPile.push(4); 
        unoDiscardPile.push(7); 
        unoDiscardPile.push(3); 

        System.out.println(unoDiscardPile); 
        //drawing from the discard pile 
        System.out.println(unoDiscardPile.peek()); 
        unoDiscardPile.pop();
        System.out.println(unoDiscardPile);  
       System.out.println(unoDiscardPile.peek());  
        unoDiscardPile.pop(); 
        System.out.println(unoDiscardPile); 
        System.out.println(unoDiscardPile.peek()); 
        unoDiscardPile.pop(); 
        System.out.println(unoDiscardPile); 
        System.out.println(unoDiscardPile.peek()); 
        unoDiscardPile.pop(); 
        System.out.println(unoDiscardPile); 






    }
}
    
