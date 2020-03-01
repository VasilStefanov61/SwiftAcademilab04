package SwiftAcad_Homework_10_Vasil_Stefanov;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Task3_ParenthesesMatching {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter string : ");
		 String str = sc.nextLine();

		List<String> ll = new ArrayList<>();
		ll.add("(");
		ll.add("[");
		ll.add("{");
		List<String> lr = new ArrayList<>();
		lr.add(")");
		lr.add("]");
		lr.add("}");
	
		List<String> list = new ArrayList<>();
		list.addAll((Collection<? extends String>) compiledlist(str));
		

		List<String> list1 = new ArrayList<>();
		list1.addAll(list);
		list1.retainAll(ll);
		String lastl = list1.get(list1.size() - 1);
	
		String next = "";
		for (int i = 0; i < ll.size(); i++) {
			if (lastl.equals(ll.get(i))) {
				next = lr.get(i);
			}
		}
	
		int maxIdx = 0;
		for (int i = 0; i < list.size(); i++) {

			if (lastl.equals(list.get(i))) {
				maxIdx = i;
			}
		}
	
		boolean result = false;
		if (maxIdx != list.size() && list.get(maxIdx + 1).equals(next)) {
			result = true;
	

		}
		System.out.printf("Exit : %b", result);
	}

	public static Object compiledlist(String str) {
		char[] chb = { '(', '[', '{', ')', ']', '}' };
		String str1 = "";
		List<String> list = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			str1 += str.charAt(i);
			for (int j = 0; j < chb.length; j++) {

				if (str.charAt(i) == (chb[j])) {
					list.add(str1);
				}
			}
			str1 = "";
		}

		return list;
	}

//	public static String getLastLeftBracket(Collection<?> list, Collection<?> ll) {
//		List<String> list1 = new ArrayList<>();
//		list1.addAll((Collection<? extends String>) list);
//		list1.retainAll(ll);
//		// System.out.println(list1);
//		String lastl = list1.get(list1.size() - 1);
//		// String lastl = "";
//
//		return lastl;
//	}

}
