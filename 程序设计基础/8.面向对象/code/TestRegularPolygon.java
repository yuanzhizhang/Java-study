public class TestRegularPolygon {
	public static void main(String args[]){
        RegularPolygon r1=new RegularPolygon();
        System.out.println("The perimeter of r1 is: "+r1.getPerimeter());
        System.out.println("The area of r1 is: "+r1.getArea()+"\n");
        
        RegularPolygon r2=new RegularPolygon(6,4);
        System.out.println("The perimeter of r2 is: "+r2.getPerimeter());
        System.out.println("The area of r2 is: "+r2.getArea()+"\n");
    }
}