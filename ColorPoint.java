package Java_Nov;

class Point{
	private int x,y;
	public Point(int x ,int y) {
		this.x = x;
		this.y = y;
	}
	public int getx() {
		return x;
	}
	public int gety() {
		return y;
	}
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class ColorPoint extends Point {

	public String color;
	
	public ColorPoint(int x , int y, String color) {
		super(x,y);
		this.color = color;
	}
	
	public void setPoint(int a, int b) {
		super.move(a, b);
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void Show() {
		System.out.println(color + "색으로 (" + getx() + "," + gety() + ")");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPoint cp = new ColorPoint(5,5,"노랑");
		cp.setPoint(10, 20);
		cp.setColor("GREEN");
		cp.Show();
	}

}
