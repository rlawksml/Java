package Factory;

public class Rectangle implements Shape{

	public int price = 10000;
	
	@Override
	public void draw() {
		System.out.println("사각형을 초코 케익 주문 완료 되었습니다." + "가격은 " + price + "입니다." );
	}
}
