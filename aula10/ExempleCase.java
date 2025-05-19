package aula10;

import java.util.Scanner;

public class ExempleCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int abobra[] = {5, 6 , 3, 9};
		int key = sc.nextInt();
		switch (key) {
		case 1: {
			System.out.println("1");
		}
			break;
		case 2: {
			System.out.println("2");
			break;
		}
		case 3: {
			System.out.println("3");
		}
		default:
			System.out.println("error");
		}
		
	}
}
