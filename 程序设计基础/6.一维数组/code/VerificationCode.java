import java.util.*;
public class VerificationCode {
	public static char ls(){
		char ch;
		char[] VerifyCode = {'0', '1', '2', '3', '4', '5', '6', '7', '8', 
				'9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 
				'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 
				'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 
				'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 
				'v', 'w', 'x', 'y', 'z'};
		
		ch = VerifyCode[(int)(Math.random() * 63)];

		return ch;
	}
	
	public static void main(String[] args) {
		int len;
		Scanner input = new Scanner(System.in);
		System.out.print("需要几位验证码：");
		len = input.nextInt();
		
		System.out.print("验证码：");
		for(int i=0; i<len; i++) {
			System.out.print(ls());
		}
	}
}