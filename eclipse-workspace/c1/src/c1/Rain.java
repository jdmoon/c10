package c1;
import java.util.*;
public class Rain {
	public static void print(Vector<Integer> v) {
		Iterator<Integer> it = v.iterator();
		int sum = 0;
		it = v.iterator();
		while (it.hasNext()) {
			int n = it.next();
			sum += n;
		}
		System.out.print("���� ���" + sum / v.size());
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		while (true) {
			System.out.print("������ �Է� (0 �Է½� ����); >> ");
			int n = scanner.nextInt();

		if(0==n)
			break;
		else
			v.add(n);
		for(int i =0; i<v.size(); i++) {
			System.out.print(v.get(i) + " ");
		}
		System.out.println(" ");
		print(v);
		System.out.println("  ");
	}
		scanner.close();
}
}
