package javaProject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class percentile {

	static double percentile;
	static int quart1, half, quart3, full;
	static int[] lowerHalf, upperHalf;
	int[] arr;

	public static void main(String[] args) throws IOException {

		int[] priceArr = { 59500, 60000, 67000, 61000, 72250, 73500, 76500, 80000, 67500, 54000 };			

		Arrays.sort(priceArr);
		divideHalf(priceArr);		
		printResult(priceArr);
		
	}

	public static void divideHalf(int[] arr) {
		
	

		if (arr.length % 2 == 0) {
			lowerHalf = Arrays.copyOfRange(arr, 0, (arr.length / 2));
			upperHalf = Arrays.copyOfRange(arr, (arr.length / 2), (arr.length));

		} else if (arr.length % 2 == 1) {
			lowerHalf = Arrays.copyOfRange(arr, 0, (arr.length / 2));
			upperHalf = Arrays.copyOfRange(arr, (arr.length / 2) + 1, (arr.length));
		}
		
		quart1 = median(lowerHalf);
		half = median(arr);
		quart3 = median(upperHalf);
		full = arr[arr.length - 1];

	}

	public static int median(int[] arr) {
		int arrLength = arr.length;
		if (arrLength % 2 == 1) {
			return arr[arrLength / 2];
		} else {
			return (arr[arrLength / 2 - 1] + arr[arrLength / 2]) / 2;
		}
	}
	
	public static void printResult(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("]");
		System.out.println("");

		System.out.println("1������ : " + quart1);
		System.out.println("2������ : " + half);
		System.out.println("3������ : " + quart3);
		System.out.println("4������ : " + full);
		
	}
}