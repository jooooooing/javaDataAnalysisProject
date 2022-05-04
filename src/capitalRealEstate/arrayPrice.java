package capitalRealEstate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class arrayPrice {
	
	public static ArrayList<String> arrayPrice() throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedReader read = new BufferedReader(new FileReader(filepath.resultFilePath1));
		String line;
		int cnt = 0;

		// 합친 내용 들어갈 파일 생성
		PrintWriter pw = new PrintWriter(filepath.resultFilePath2);

		ArrayList<String> monthPrice = new ArrayList<String>();

		while ((line = read.readLine()) != null) {
			
			if (line.contains(",")) {
				line = line.replaceAll(",", "");
			}
						
			String[] cutLine = line.split("\\|");
//			for (int i = 200601; i <= 201612; i++) {
				int i = 200601;
				String date = Integer.toString(i);
				try {
					if (cutLine[6].equals(date) == true) {
						monthPrice.add(cutLine[8]);
					}
				} catch (Exception e) {
				}				
//			}				

			}
		pw.println(monthPrice);
		pw.flush();	
		
//		for (int i =1; i < monthPrice.size(); i++) {
//			System.out.println(monthPrice.get(i));
//		}
		
		return monthPrice;
	}

}
