package asddd;
import java.io.*;

public class UpperCharacter {

	public static void main(String[] args) {
		try {
			File f = new File("c:\\windows\\system.ini"); //��θ� �����Ѵ�.
			FileReader fin = new FileReader(f);
			int c;
			while((c=fin.read()) != -1) { //�ҹ��ڸ� �빮�ڷ� �ٲٴ� while
				char a = (char)c;
				if(Character.isLowerCase(a))
					a = Character.toUpperCase(a);
				System.out.print((char)a); //�빮�� ���
			}
			fin.close();
		}
		catch(IOException e) {
			System.out.println("���� �б� ����");
		}

	}

}
