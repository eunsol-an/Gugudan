
public class Gugudan_Method {
	
	// 메소드(method)를 이용하기
	// 값을 넣으면 값에 해당하는 구구단을 배열에 저장하는 메소드
	public static int[] calculate(int times) {
		int[] result = new int[9];
		for (int i=0; i<result.length; i++) {
			result[i] = times * (i + 1);
		}
		
		return result;
	}

	// 배열을 출력하는 메소드
	public static void print(int[] result) {
		for (int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	// 메인 메소드
	public static void main(String[] args) {
		
		// 2단부터 9단까지 출력하기
		for (int i=2; i<10; i++) {
			int[] result = calculate(i); // 구구단을 배열에 저장하는 메소드 호출
			print(result); // 배열을 출력하는 메소드 호출
		}
		
	}
}
