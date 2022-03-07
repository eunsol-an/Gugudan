import java.util.Scanner;

public class Gugudan_8dan_9dan {

	public static void main(String[] args) {
		// Scanner 클래스를 이용하여 사용자에게 입력값 받고,
		// 조건문 if문 이용해서 2이상, 9이하만 구구단 출력하기
		
		System.out.println("구구단 중 출력할 단은? : ");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		
		
		// and(&&) 연산자 사용
		if (number >= 2 && number <= 9) {
			System.out.println(number + "단을 출력합니다.");
			for (int i = 1; i < 10; i++) {
				System.out.println(number * i);
			}
		} else {
			System.out.println("2이상, 9이하 값만 입력할 수 있습니다.");
		}
		
		
		// else if문 사용
		if (number < 2) {
			System.out.println("2이상 값을 입력해주세요.");
		} else if (number > 9) {
			System.out.println("9이하 값을 입력해주세요.");
		} else {
			System.out.println(number + "단을 출력합니다.");
			for (int i = 1; i < 10; i++) {
				System.out.println(number * i);
			}
		}

	}

}
