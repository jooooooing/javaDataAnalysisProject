package javaProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Merge {

   public static void mergeFiles() throws IOException {
      // TODO Auto-generated method stub
      
       //���丮 ���� 
        File dir = new File("C:\\Users\\local pc\\Desktop\\filesforpj");
      
        // ��ģ ���� �� ���� ���� 
        PrintWriter pw = new PrintWriter("C:\\\\Users\\\\local pc\\\\Desktop\\\\fileMerge.csv");
      
        //��� ���ϵ��� ����Ʈ�� String Array�� ����
        String[] fileNames = dir.list();
        
         for (String fileName : fileNames) {
            System.out.println("Reading from " + fileName);   //�ܼ�â�� ���� �̸� ��� 
            
             File f = new File(dir, fileName);
             
             //BufferedReader ��ü ���� 
             BufferedReader br = new BufferedReader(new FileReader(f));
             //�����Ǵ� ���� ���� ������ ���� ���� �̸� ǥ�� (���� ���Ͽ� �� ǥ�� ����/ �ּ�ó��) 
             //pw.println("Contents of file " + fileName);   
             
         String line = br.readLine();
         int cnt = 0;

         while ((line = br.readLine()) != null) {
            
            if (cnt >= 13) {
               line = br.readLine();
               System.out.println(line);
               
               try {
                  if(line.contains("\",\"")) {
                     line = line.replaceAll("\",\"", "|");
                  }
               } catch (Exception e){
                  System.out.println("Error");
               }
               
               try {
                  if(line.contains("\"")) {
                     line = line.replaceAll("\"", "");
                  }
               }catch (Exception e) {
                  System.out.println("Error");
               }
               
               
                  pw.println(line);
                  System.out.println(line);
               
               
            }
            cnt++;
         } 
         pw.flush();
         }
         //�۾� �Ϸ�� �ܼ�â�� ǥ�� 
         System.out.println("Reading from all files" +
                   " in directory " + dir.getName() + " Completed");
   }

}