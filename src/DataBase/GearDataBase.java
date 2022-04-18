package DataBase;

import java.util.ArrayList;

interface Gear{ 
	public void setInfo(String name, String description, int equipedSlot, int gearStat1, int gearStat2);
	String name();
	String description();
	int equipedSlot(); //장착위치 // 모자 1, 상의2, 하의3, 신발4, 무기5, 가방6
	int gearStat1(); // 스텟1
	int gearStat2(); // 스텟2
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
	@Override public int equipedSlot() {return this.equipedSlot;} // 모자 위치
	@Override public int gearStat1() {return this.gearStat1;} // 방어력
	@Override public int gearStat2() {return this.gearStat2;} // 방어력
	@Override
	public void setInfo(String name, String description, int equipedSlot, int gearStat1, int gearStat2) {
		// TODO Auto-generated method stub
		
	}
}

public class GearDataBase {
	public static void main(String []args) {

		// HeadGear headGear = new HeadGear();
		
		HeadGear letherHat = new HeadGear("가죽 모자", "흔히 보는 가죽모자다. 약간의 방어력과 함께 차양 기능을 제공한다.", 1, 10, 0 );
		HeadGear militaryHat = new HeadGear("군용 모자", "군대에서 보급되는 모자. 높은 내구성과 탁월한 위장 능력을 자랑한다.", 1, 20, 0 );
		
		// System.out.println(headGear);
		
	// 문서의 끝
	}
}
