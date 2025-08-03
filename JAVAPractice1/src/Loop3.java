
public class Loop3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] score = new int[3];
		score[0] = 80;
		score[1] = 100;
		score[2] = 90;
		
		String[] name = {"伊藤", "山田", "佐藤"};
		
		/*
		System.out.println(name[0] + score[0]);
		System.out.println(name[1] + score[1]);
		System.out.println(name[2] + score[2]);
		*/
		
		for(int i = 0; i < score.length; i++) {
			System.out.println(name[i] + score[i]);
		}
		System.out.println("受験者数" + score.length);
	}
}
