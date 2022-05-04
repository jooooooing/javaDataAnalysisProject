package capitalRealEstate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class arrayName {
	
	public static ArrayList<String> arrayName() throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedReader read = new BufferedReader(new FileReader(filepath.resultFilePath1));
		String line;

		// 합친 내용 들어갈 파일 생성
		PrintWriter pw = new PrintWriter(filepath.resultFilePath3);

		ArrayList<String> monthName = new ArrayList<String>();

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
						monthName.add(cutLine[4]);
					}
				} catch (Exception e) {
				}				
//			}				

			}
		
		ArrayList<String> resultList = new ArrayList<String>();
		
		  for (int i = 0; i < monthName.size(); i++) {
              if (!resultList.contains(monthName.get(i))) {
                  resultList.add(monthName.get(i));
              }
          }
		
		pw.println(resultList);
		pw.flush();	
		
		System.out.println(resultList);
		int cnt = resultList.size();
		
//		System.out.println(monthName);
		System.out.println(cnt + "개 단지");
		
		return monthName;
	}

}
