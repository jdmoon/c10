package c1;

import java.util.*;

public class Hashmap {
	public static void main(String[] args) {
		HashMap<String, Integer>nations = new HashMap <String, Integer>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �̸��� �α��� 10�� �Է��ϼ���.");
		while(true) {
			System.out.print("���� �̸�, �α�>>");
			String nation = scanner.next();
			if(nation.equals("�׸�"))
				break;
			int population = scanner.nextInt();
			nations.put(nation, population);
		}
		while(true) {
			System.out.print("�α� �˻� >>");
			String nation = scanner.next();
			if(nation.equals("�׸�"))
				break;
			Integer n = nations.get(nation);
			if(n == null)
				System.out.println(nation + "����� �����ϴ�.");
			else
				System.out.println(nation + "�� �α���" + n);
		}
		scanner.close();
	}
}
