package capitalRealEstate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Merge {

	public static void MergeFiles() throws IOException {
		// 디렉토리 설정
		File dir = new File(filepath.rawFilePath);

		// 합친 내용 들어갈 파일 생성
		PrintWriter pw = new PrintWriter(filepath.resultFilePath1);

		// 모든 파일들을 리스트로 String Array에 담음
		String[] fileNames = dir.list();
		{

			for (String fileName : fileNames) {
				System.out.println("Reading from " + fileName); // 콘솔창에 파일 이름 출력

				// create instance of file from Name of
				// the file stored in string Array
				File f = new File(dir, fileName);

				// create object of BufferedReader
				BufferedReader br = new BufferedReader(new FileReader(f));
//				pw.println("Contents of file " + fileName); // 생성되는 파일 내에 구분을 위해 파일 이름 표시 (실제 파일엔 이 표시 없음/ 주석처리)

				String line = br.readLine();
				int cnt = 0;

				while ((line = br.readLine()) != null) {

					if (line.contains(",")) {
						line = line.replaceAll(",", "");
					}

					if (cnt >= 16) {
						line = br.readLine();

						try {
							if (line.contains("\",\"")) {
								line = line.replaceAll("\",\"", "|");
							}
						} catch (Exception e) {
						}

						try {
							if (line.contains("\"")) {
								line = line.replaceAll("\"", "");
							}
						} catch (Exception e) {
						}

						pw.println(line);

					}
					cnt++;
				}
				pw.flush();
			}
			// 작업 완료시 콘솔창에 표시
			System.out.println("Reading from all files" + " in directory " + dir.getName() + " Completed");

		}

	}
}
