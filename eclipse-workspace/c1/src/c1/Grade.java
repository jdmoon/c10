package c1;
import java.util.*;

public class Grade {
	public static void main(String[] args) {
		ArrayList<Character> a = new ArrayList<Character>();
		double stgrade = 0.0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("6�� ������ �Է�>>");
		double sum = 0;
		
		for (int i = 0; i < 6; i++) { //for���� �̿��Ͽ� ������ �Է��Ѵ�
			String s =scanner.next();
			char ch = s.charAt(0);
			if(ch == 'A' || ch =='B' || ch == 'C'|| ch =='D' || ch == 'F') {
				a.add(ch);
			}
			else {
				System.out.println("�Է°��� �߸� �Ǿ����ϴ�. ");
			}
		}
		for ( int i =0; i< a.size(); i++) {
			char ch = a.get(i);
			
			switch (ch) {
			case 'A':
				stgrade = 4.0;
				break;
			case 'B':
				stgrade = 3.0;
				break;
			case 'C':
				stgrade = 2.0;
				break;
			case 'D':
				stgrade = 1.0;
				break;
			case 'F':
				stgrade = 0.0;
				break;
			}
			sum += stgrade;
		}
		double avg = sum/6; //����� ����ϴ� avg
		System.out.println(avg);
	}

}
