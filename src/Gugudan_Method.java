
public class Gugudan_Method {
	
	// �޼ҵ�(method)�� �̿��ϱ�
	// ���� ������ ���� �ش��ϴ� �������� �迭�� �����ϴ� �޼ҵ�
	public static int[] calculate(int times) {
		int[] result = new int[9];
		for (int i=0; i<result.length; i++) {
			result[i] = times * (i + 1);
		}
		
		return result;
	}

	// �迭�� ����ϴ� �޼ҵ�
	public static void print(int[] result) {
		for (int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	// ���� �޼ҵ�
	public static void main(String[] args) {
		
		// 2�ܺ��� 9�ܱ��� ����ϱ�
		for (int i=2; i<10; i++) {
			int[] result = calculate(i); // �������� �迭�� �����ϴ� �޼ҵ� ȣ��
			print(result); // �迭�� ����ϴ� �޼ҵ� ȣ��
		}
		
	}
}
