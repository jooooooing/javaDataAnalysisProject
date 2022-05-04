package javaProject;

import java.io.IOException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Merge merge = new Merge();
		filter filter = new filter();
		percentile percentile = new percentile();
		
//		merge.mergeFiles();
		filter.filterFile();
		
	}
}