// Ŭ����(class)�� �и��ϱ�
// ���� Ŭ������ ���� ������ �ۼ�������, ������ ���� �Բ� �ۼ���.

// �������� �����ϴ� Ŭ����
public class Gugudan_class {
	// ���� ������ ���� �ش��ϴ� �������� �迭�� �����ϴ� �޼ҵ�
	public static int[] calculate(int times) {
		int[] result = new int[9];
		for (int i = 0; i < result.length; i++) {
			result[i] = times * (i + 1);
		}

		return result;
	}

	// �迭�� ����ϴ� �޼ҵ�
	public static void print(int[] result) {
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}

// ���α׷��� �����ϴ� Ŭ����
class Gugudan_Main {
	// ���α׷��� �����ϴ� ������ ���� �޼ҵ�
	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			int[] result = Gugudan_class.calculate(i);
			Gugudan_class.print(result);
		}
	}
}