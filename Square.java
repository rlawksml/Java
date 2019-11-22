package Factory;

public class Square implements Shape{
	
	public int price = 20000;
	
	@Override
	public void draw() {
		System.out.println("정사각형 생크림 케익 주문 완료 되었습니다." + "가격은 " + price + "입니다." );
	}
}
