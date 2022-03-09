
public class Gugudan_Array {
	public static void main(String[] args) {
		// 배열 Array를 이용하여 2단 출력하기
		
		int[] result = new int[9];
		for(int i=0; i<result.length; i++) {
			result[i] = 2 * (i + 1);
			System.out.println(result[i]);
		}


		// 이중for문을 이용하여 2단부터 9단까지 출력하기
		
		int[] gugudan = new int[9];
		for (int i=1; i<gugudan.length; i++) {
			int num = i + 1;
			for (int j=0; j<gugudan.length; j++) {
				gugudan[i] = num * (j + 1);
				System.out.println(gugudan[i]);
			}
		}
		
	}
}
