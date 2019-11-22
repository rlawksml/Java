package Factory;

public class Circle implements Shape{
	public int price = 15000;
	
	
	@Override
	public void draw() {
		System.out.println("원형  케익 주문 완료 되었습니다." + "가격은 " + price + "입니다." );
	}
}
