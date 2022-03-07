import java.util.Scanner;

public class Gugudan_dan {

	public static void main(String[] args) {
		// Scanner 클래스를 이용하여 사용자에게 입력값 받기
		
		System.out.println("구구단 중 출력할 단은? : ");
		Scanner in = new Scanner(System.in); // Scanner 객체 생성
		int number = in.nextInt();
		System.out.println(number + "단을 출력합니다.");
		int result = number * 1;
		System.out.println(result);
		result = number * 2;
		System.out.println(result);
		result = number * 3;
		System.out.println(result);
		result = number * 4;
		System.out.println(result);
		result = number * 5;
		System.out.println(result);
		result = number * 6;
		System.out.println(result);
		result = number * 7;
		System.out.println(result);
		result = number * 8;
		System.out.println(result);
		result = number * 9;
		System.out.println(result);
	}

}
