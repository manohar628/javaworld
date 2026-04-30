package project;

import java.util.Scanner;

public class Tic_Tac_Toe_game {
	static char[][] board = new char[3][3];
	private static char currentplayer = 'X';

//	printing the board
	private static void display() {

		System.out.println("------------");
		for (int i = 0; i < 3; i++) {
			System.out.print("| ");
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j]);
				System.out.print(" | ");
			}
			System.out.println();
			System.out.println("------------");
		}

	}

	private static boolean Rowwin() {
		for (int i = 0; i < 3; i++) {

			if (board[i][0] == currentplayer && board[i][1] == currentplayer && board[i][2] == currentplayer) {
				return true;
			}

		}
		return false;
	}
		private static boolean Colwin() {

		for (int j = 0; j < 3; j++) {

			if (board[0][j] == currentplayer && board[1][j] == currentplayer && board[2][j] == currentplayer) {
				return true;
			}
		}
		return false;
		}
		private static boolean DialogWin() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[0][0] == currentplayer && board[1][1] == currentplayer && board[2][2] == currentplayer) {
					return true;
				}

				if (board[0][2] == currentplayer && board[1][1] == currentplayer && board[2][0] == currentplayer) {
					return true;
				}

			}
		}
		return false;

	}

	private static boolean isboardfull() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == '-') {
					return false;
				}

			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to tic tac toe Gaming Zone ->");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = '-';
			}
		}
//		Accessing the board

		while (true) {
			display();
			
			
			System.out.println("player " + currentplayer + " Enter Row NUmber : ");
			int row = sc.nextInt();
			System.out.println("player " + currentplayer + " Enter Col Number : ");
			int col = sc.nextInt();
			
			if(row<0 || row >2 ||col<0||col>2) {
				System.out.println("invalid input plz enter again  ");
				continue;
			}
	
			if (board[row][col] != '-') {
				System.out.println("cell is already taken plz enter again ");
				continue;

			}
			board[row][col]=currentplayer;
			
			if(Rowwin()|| Colwin()||DialogWin()) {
				System.out.println("player "+currentplayer+" wins");
				break;
			}
			if(isboardfull()) {
				System.out.println("its a draw");
			}
			currentplayer = (currentplayer == 'X') ? 'O' : 'X';
		}
		display();

	}

}
