// 클래스(class)를 분리하기
// 보통 클래스는 파일 단위로 작성하지만, 설명을 위해 함께 작성함.

// 구구단을 구현하는 클래스
public class Gugudan_class {
	// 값을 넣으면 값에 해당하는 구구단을 배열에 저장하는 메소드
	public static int[] calculate(int times) {
		int[] result = new int[9];
		for (int i = 0; i < result.length; i++) {
			result[i] = times * (i + 1);
		}

		return result;
	}

	// 배열을 출력하는 메소드
	public static void print(int[] result) {
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}

// 프로그램을 시작하는 클래스
class Gugudan_Main {
	// 프로그램을 시작하는 역할의 메인 메소드
	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			int[] result = Gugudan_class.calculate(i);
			Gugudan_class.print(result);
		}
	}
}