package day4;

public class Sample406 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("6が出たら終了");
		while(true) {
			int dice = (int)(Math.random()*6)+1;
			System.out.println(dice);
			if(dice == 6) {
				break;
			}
		}
		System.out.println("終了");
	}
}
