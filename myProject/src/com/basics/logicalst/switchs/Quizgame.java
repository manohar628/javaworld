package com.basics.logicalst.switchs;

import java.util.Scanner;

public class Quizgame {

	public static void main(String[] args) {
		System.out.println(" welcome to  quiz game");
		System.out.println("******lets start the quiz");
		Scanner sc = new Scanner(System.in);
		System.out.println("easy" + "\n" + "medium" + "\n" + "hard");
		System.out.println("Enter a mode :");
		String Mode = sc.next();

		switch (Mode) {

		case "easy":
			System.out.println("select your category :");
			String cat = sc.next();
			switch (cat) {

			case "java":

				System.out.println("quetion 1: java is platform independent or not ?");
				System.out.println("A.yes" + "\n" + "B.no" + "\n" + "C.both" + "\n" + "D.none");
				System.out.println("enter your option please :");
				char Ans = sc.next().charAt(0);
				switch (Ans) {
				case 'A', 'a':
					System.out.println("your Answer is correct");
					break;
				case 'B', 'C', 'D', 'b', 'c', 'd':
					System.out.println("incorrect Answer");
					break;
				default:
					System.out.println(" Enter correct answer");
				}

			}

			break;
		case "medium":
			break;
		case "hard":
			break;
		}

	}

}
