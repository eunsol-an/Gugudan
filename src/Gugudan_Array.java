
public class Gugudan_Array {
	public static void main(String[] args) {
		// �迭 Array�� �̿��Ͽ� 2�� ����ϱ�
		
		int[] result = new int[9];
		for(int i=0; i<result.length; i++) {
			result[i] = 2 * (i + 1);
			System.out.println(result[i]);
		}


		// ����for���� �̿��Ͽ� 2�ܺ��� 9�ܱ��� ����ϱ�
		
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
