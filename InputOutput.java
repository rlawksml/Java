package Java_Nov;
import java.util.Scanner;


public class InputOuput {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("정수 입력");
			int Number = scanner.nextInt();
			System.out.println("입력된 정수 값은  : " + Number + "입니다.");
			
			System.out.println("문자 입력");
			String lang = scanner.next();
			System.out.println("입력된 문자 값은  : " + lang + "입니다.");
			
			System.out.println("실수 입력");
			double Number2 = scanner.nextDouble();
			System.out.println("입력된 실수 값은  : " + Number2 + "입니다.");
		
			System.out.println("true false 입력");
			Boolean TF = scanner.nextBoolean();
			System.out.println("입력된 bool 값은  : " + TF + "입니다.");
			
			scanner.close();
		}
}
