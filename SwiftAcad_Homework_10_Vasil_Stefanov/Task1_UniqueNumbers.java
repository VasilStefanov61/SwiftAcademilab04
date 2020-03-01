package SwiftAcad_Homework_10_Vasil_Stefanov;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task1_UniqueNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N : ");
		int n = sc.nextInt();
		System.out.printf("Enter %d numbers with intervals : ", n);
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			list.add(num);
		}

		while (!list.isEmpty()) {

			System.out.printf("%d ", getRemoveElement(list, n));

		}

	}

	
	public static int getRemoveElement(List<Integer> list, int n) {
		int k = 0;
		k = list.get(0);
		for (int j = 1; j <= n; j++) {
			for (int i = 0; i < list.size(); i++) {
				list.remove(new Integer(k));
				
			}
		}

		return k;
	}

}
