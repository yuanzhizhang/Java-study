import java.util.*;
public class GuessSize {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int resNum = (int)((Math.random()*6+1) + (Math.random()*6+1));
		String res;
        
        System.out.println("big or small?");
			String guess = input.next();
			
			if (resNum > 6) {
				res = "big";
			}
			else {
				res = "small";
			}
			
			if (guess.equals(res)) {
				System.out.println("Congratulations!");
			}
			else {
				System.out.println("Unfortunately!");
			}
    }
}