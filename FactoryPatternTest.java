package Factory;

public class FactoryPatternTest {
	public static void main(String[] args) {
	
	  //팩토리 클래스에서 객체를 생성 후 반환
      ShapeFactory cakeshapeFactory = new ShapeFactory();

      Shape shape1 = cakeshapeFactory.getShape("CIRCLE");

      //Circle 메소드 호출
      shape1.draw();

      Shape shape2 = cakeshapeFactory.getShape("RECTANGLE");

      //Rectangle 메소드 호출
      shape2.draw();

      Shape shape3 = cakeshapeFactory.getShape("SQUARE");

      //Square 메소드 호출
      shape3.draw();
	}
}
