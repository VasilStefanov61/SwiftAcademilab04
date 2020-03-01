package SwiftAcad_Homework_10_Vasil_Stefanov;

import java.util.Scanner;
import java.util.*;

public class Task7_StackMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		String cmd = "";
		Stack stack1 = new Stack();
		Stack stack2 = new Stack();
		while (!"END".equals(cmd)) {
			System.out.print("Enter command : ");
			//str = "PUSH 3";
			str = sc.nextLine();
			String[] split = str.split(" ");
			cmd = split[0];
			if ("PUSH".equals(cmd)) {
				stack1.add(Integer.parseInt(split[1]));
			} else if ("POP".equals(cmd)) {
				System.out.println(stack1.pop());
				//stack1.pop();
			} else if ("MAX".equals(cmd)) {
				int maxNum = (int) stack1.peek();//Integer.MIN_VALUE;
				int num = 0;
				while (!stack1.isEmpty()) {
					num = (int) stack1.pop();
					if (num > maxNum) {
						maxNum = num;
					}
					stack2.add(num);
				}
				System.out.println(maxNum);
				while (!stack2.isEmpty()) {
					num = (int) stack2.pop();
					stack1.add(num);
				}

			} else if ("END".equals(cmd)) {
				while (!stack1.isEmpty()) {
					System.out.printf("%d ", stack1.pop());
					
				}
			}
		}
	}

}
