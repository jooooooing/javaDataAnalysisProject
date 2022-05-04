package capitalRealEstate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Merge merge = new Merge();
		merge.MergeFiles();
		
		arrayPrice arrayPrice = new arrayPrice();
		ArrayList<String> monthPrice = arrayPrice.arrayPrice();
		
		arrayName arrayName = new arrayName();
		ArrayList<String> monthName = arrayName.arrayName();		
		
		highRank highRank = new highRank();
		highRank.highRank(monthPrice);
		
		

	}

}
