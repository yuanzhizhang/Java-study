public class DrawStars{
	public static void main(String[] args) {
		
		int i = 0;

		while(true) {
			if (i == 0) {
				for(int x=0;x < 9;x++){
					System.out.print("*");
				}
			}
			else if (i<5 && i>0) {
				for(int x=0;x<5-i;x++) {
					System.out.print("*");
				}
				for(int x=0;x<i*2-1;x++) {
					System.out.print(" ");
				}
				for(int x=0;x<5-i;x++) {
					System.out.print("*");
				}
			}
			else {
				break;
			 }
			i++;
			System.out.println();
		}
	}
}