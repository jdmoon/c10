package jdm01;

public class TV { //TV�� ���� ����
	 String manufacturer;
	 int year;
	 int size;
		
	public TV(String manufacturer, int year, int size) {
		this.manufacturer = manufacturer;
		this.year = year;		
		this.size = size;
	}
	
	public void show() {
		System.out.print(this.manufacturer + "���� ���� "+this.year + "���� "+this.size + "��ġ TV");
	}//����� �������� ���
	
	public static void main(String [] args) {
		TV myTV = new TV("LG", 2017, 32); // LG���� ���� 2017�� 65��ġ
		myTV.show();
	}
}