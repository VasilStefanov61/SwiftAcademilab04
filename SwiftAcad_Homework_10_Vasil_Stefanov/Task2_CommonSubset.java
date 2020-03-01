package SwiftAcad_Homework_10_Vasil_Stefanov;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2_CommonSubset {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N and M : ");
		String str = sc.nextLine();
		String [] split = str.split(" ");
		int n = Integer.parseInt(split[0].trim());
		int m = Integer.parseInt(split[1].trim());
		System.out.printf("Enter %d numbers with intervals : ", n);
		List<Integer> list1 = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			list1.add(num);
		}
		System.out.printf("Enter %d numbers with intervals : ", m);
		List<Integer> list2 = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			int num = sc.nextInt();
			list2.add(num);
		}
		//System.out.println(list1);
		//System.out.println(list2);
		List<Integer> list3 = new ArrayList<>();
		list3.addAll(list1);
		list3.retainAll(list2);
		System.out.print("Exit : ");
		if (list3.isEmpty()) {
			
			System.out.print("NO");
			
		
		}else {
			for(int i = 0; i < list3.size(); i++) {
				System.out.printf("%d ", list3.get(i));
			}
		}
		
	}

}
