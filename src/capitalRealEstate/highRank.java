package capitalRealEstate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class highRank {
	
	public static void highRank(ArrayList<String> monthPrice) {

		Collections.sort(monthPrice, Collections.reverseOrder());
//		System.out.print(monthPrice);
//		System.out.println();

		Scanner sc = new Scanner(System.in);
		System.out.println("���� ��%�� �˻��Ͻðڽ��ϱ�?(ex. 10)");
		double rank = sc.nextDouble();

		int rankBar = (int) (monthPrice.size() * (rank / 100));
		int sum = 0;

		int[] rankResult = new int[rankBar];

		for (int i = 0; i < rankBar; i++) {
			rankResult[i] = Integer.parseInt(monthPrice.get(i));
			sum = sum + Integer.parseInt(monthPrice.get(i));
		}

		System.out.println(monthPrice.size() + "�� �� ���� " + rankBar + "��");
		System.out.println("��� " + (sum / rankBar) + "����");

	}

}
