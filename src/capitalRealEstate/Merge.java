package capitalRealEstate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Merge {

	public static void MergeFiles() throws IOException {
		// ���丮 ����
		File dir = new File(filepath.rawFilePath);

		// ��ģ ���� �� ���� ����
		PrintWriter pw = new PrintWriter(filepath.resultFilePath1);

		// ��� ���ϵ��� ����Ʈ�� String Array�� ����
		String[] fileNames = dir.list();
		{

			for (String fileName : fileNames) {
				System.out.println("Reading from " + fileName); // �ܼ�â�� ���� �̸� ���

				// create instance of file from Name of
				// the file stored in string Array
				File f = new File(dir, fileName);

				// create object of BufferedReader
				BufferedReader br = new BufferedReader(new FileReader(f));
//				pw.println("Contents of file " + fileName); // �����Ǵ� ���� ���� ������ ���� ���� �̸� ǥ�� (���� ���Ͽ� �� ǥ�� ����/ �ּ�ó��)

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
			// �۾� �Ϸ�� �ܼ�â�� ǥ��
			System.out.println("Reading from all files" + " in directory " + dir.getName() + " Completed");

		}

	}
}
