public class RegularPolygon {
	private int n = 3;
	private double side = 1;
	
    
	public RegularPolygon() {
	}
	
	public RegularPolygon(int N, double Side) {
		n = N;
		side = Side;
	}
	
	public void setN(int n) {
		this.n = n;
	}
	
	public void setSide(int side) {
		this.side = side;
	}
	
	public int getN() {
		return n;
	}
	
	public double getSide() {
		return side;
	}
	
	public double getPerimeter() {
		return n * side;
	}
	
	public double getArea() {
		return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
	}
}