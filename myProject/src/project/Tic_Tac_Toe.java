package project;

import java.util.Scanner;

public class Tic_Tac_Toe {

	public static void main(String[] args) {
	

		        Scanner sc = new Scanner(System.in);
		        char[][] board = new char[3][3];

		        // Initialize board
		        for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++) {
		                board[i][j] = ' ';
		            }
		        }
		        

		        char currentPlayer = 'X';

		        while (true) {

		            // Print board
		            System.out.println("\nBoard:");
		            for (int i = 0; i < 3; i++) {
		                for (int j = 0; j < 3; j++) {
		                    System.out.print(board[i][j] + " ");
		                }
		                System.out.println();
		            }

		            // Take input
		            System.out.println("Player " + currentPlayer + " enter row and column (0-2):");
		            int row = sc.nextInt();
		            int col = sc.nextInt();

		            // Check valid move
		            if (board[row][col] == ' ') {
		                board[row][col] = currentPlayer;

		                // 🔄 Switch player
		                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';

		            } else {
		                System.out.println("Cell already filled! Try again.");
		            }
		           
		        }
		    }
		}