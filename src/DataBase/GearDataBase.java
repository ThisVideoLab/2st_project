package DataBase;

import java.util.ArrayList;

interface Gear{ 
	public void setInfo(String name, String description, int equipedSlot, int gearStat1, int gearStat2);
	String name();
	String description();
	int equipedSlot(); //������ġ // ���� 1, ����2, ����3, �Ź�4, ����5, ����6
	int gearStat1(); // ����1
	int gearStat2(); // ����2
}

class HeadGear implements Gear{
	private String name;
	private String description;
	private int equipedSlot;
	private int gearStat1;
	private int gearStat2;
	
	public HeadGear(String name, String description, int equipedSlot, int gearStat1, int gearStat2) {
		this.name = name; this.description = description; this.equipedSlot = equipedSlot;
		this.gearStat1 = gearStat1; this.gearStat2 = gearStat2;
	}
	@Override public String name() {return this.name;}
	@Override public String description() {return this.description;}
	@Override public int equipedSlot() {return this.equipedSlot;} // ���� ��ġ
	@Override public int gearStat1() {return this.gearStat1;} // ����
	@Override public int gearStat2() {return this.gearStat2;} // ����
	@Override
	public void setInfo(String name, String description, int equipedSlot, int gearStat1, int gearStat2) {
		// TODO Auto-generated method stub
		
	}
}

public class GearDataBase {
	public static void main(String []args) {

		// HeadGear headGear = new HeadGear();
		
		HeadGear letherHat = new HeadGear("���� ����", "���� ���� ���׸��ڴ�. �ణ�� ���°� �Բ� ���� ����� �����Ѵ�.", 1, 10, 0 );
		HeadGear militaryHat = new HeadGear("���� ����", "���뿡�� ���޵Ǵ� ����. ���� �������� Ź���� ���� �ɷ��� �ڶ��Ѵ�.", 1, 20, 0 );
		
		// System.out.println(headGear);
		
	// ������ ��
	}
}
