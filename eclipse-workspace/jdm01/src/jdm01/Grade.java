package jdm01;
import java.util.Scanner;

public class Grade { //Grade�� ���� ����
	 private int math;
	 private int science;
	 private int english;
	 public int average() { //����� ���ϴ� �Լ�
		 return (math+science+english)/3;
	 }
	public Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;		
		this.english = english;
	}	
	public static void main(String [] args) { //�Էµ� ���� ����Ͽ� ����ϴ� �Լ�
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("����� " + me.average());
		
		scanner.close();
	}
}