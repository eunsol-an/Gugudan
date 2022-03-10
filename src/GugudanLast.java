import java.util.Scanner;

public class GugudanLast {
	
	public static void main(String[] args) {
		// 사용자가 입력한 값에 따라 크기가 다른 구구단을 계산해 출력
		
		// 예) 사용자가 8을 입력하면 8*8단을 출력
		System.out.println("몇 단을 출력하시겠습니까?");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println(number + "*" + number + "단을 출력합니다.");
		int[] result = new int[number];
		for (int i = 1; i < result.length; i++) {
			int dan = i + 1;
			for (int j = 0; j < result.length; j++) {
				result[j] = dan * (j + 1);
				System.out.println(result[j]);
			}

		}

		// 예) 사용자가 8,7을 입력하면 8*7단을 출력
		System.out.println("몇 단을 출력하시겠습니까?");
		Scanner in = new Scanner(System.in);
		String inputValue = in.nextLine();
		
		String[] splitedValue = inputValue.split(",");
		
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		System.out.println(first + "*" + second + "단을 출력합니다.");
		result = new int[second];
		for (int i = 1; i < first; i++) {
			int dan = i + 1;
			for (int j = 0; j < result.length; j++) {
				result[j] = dan * (j + 1);
				System.out.println(result[j]);
			}

		}

	}

}
