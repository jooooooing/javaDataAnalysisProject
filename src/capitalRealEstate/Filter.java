package capitalRealEstate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Filter {
	
	public static void filterFiles() throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedReader read = new BufferedReader(
				new FileReader(filepath.resultFilePath1));
		String line;

		// ��ģ ���� �� ���� ����
		PrintWriter pw = new PrintWriter(filepath.resultFilePath2);

		// �Է� �� �ޱ�
		System.out.println();
		System.out.println("�ŸŰ� ���� ��%?");
		int highRank= sc.nextInt();
		System.out.println();
		int cnt = 0;
		
		while ((line = read.readLine()) != null) {		
			String[] cutLine = line.split("\\|");
			String[] monthPrice = new String[cnt];
			for (int i = 200601; i < 202204; i++) {
				String date = Integer.toString(i);
				if (cutLine[6].contains(date) == true) {
					cnt ++;
					try {
						for (int j = 0; j < cnt; j++) {
							monthPrice[j] = cutLine[8];
							pw.println(monthPrice[j]);
							pw.flush();
						}
				
					} catch (Exception e) {
					}
				}
			}
		}
	}

}
