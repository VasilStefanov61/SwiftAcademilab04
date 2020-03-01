package SwiftAcad_Homework_10_Vasil_Stefanov;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task6_WordReplacement {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter string : ");
	String str = sc.nextLine();
	//String str ="Peter loves dogs but he hates cats.";
	
	System.out.print("Enter N : ");
	int n = sc.nextInt();
	sc.nextLine();
	String str1 = "";
	String [] split1;
	int idx = 0;
	List<String> list = new  ArrayList<>();
	String [] split = str.split(" ");
    for (int i = 0; i < split.length; i++) {
		list.add(split[i].toLowerCase()) ;
		
	}
	for (int j = 1; j <= n ; j++) {
		System.out.printf("Enter %d/3 string : ", j);
		str1 = sc.nextLine();
		split1 = str1.split(" ");
	for (int i = idx; i <list.size(); i++) {
		if (list.get(i).equals(split1[0])) {
			list.remove(i);
			list.add(i,split1[1].toLowerCase());
			idx = i + 1;
			break;
		}
	}
	}
	System.out.println();
	System.out.print("Exit : ");
	for (int i = 0; i <list.size(); i++) {
		System.out.printf("%s ",list.get(i));
	
	}
}
}
