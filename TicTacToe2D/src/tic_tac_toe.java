import java.util.Arrays;
import java.util.Scanner;

/********************************************************
 * 														*
 *	This is a Tic Tac Toe game created with code.		*
 * 	it will need a player variable and a board			*
 * 	the player variable will be an int that alternates	*
 * 	between 1 and 2										*
 *	 													*
 * 	the board will be an array of chars					*
 *	 													*
 * 	@author S02373613									*
 * 	@date 4/20/2026										*
 * 														*
 ********************************************************/
public class tic_tac_toe {

	public static void main(String[] args) {
		int player = 2;
		char[][] board = new char[3][3];
		fillBoard(board);
		drawBoard(board);
		int count = 0;
		while (count < 9 && checkWinner(board, player) < 0) {
			player = player % 2 + 1;
			makeMove(board, player);
			drawBoard(board);
			count++;
		}
		if(checkWinner(board, player) > 0)
			System.out.println("Player " + player + " is the winner!!!");
		else
			System.out.println("Cat's Game!!");
	}

	private static int checkWinner(char[][] board, int player) {
		String line = null;
		for(int i = 0; i < 8; i++)
		{
			switch(i) {
				case 0: //top horizontal
					line = String.valueOf(board[0][0]) + board[0][1] + board[0][2];
					break;
				case 1: //mid horizontal
					line = String.valueOf(board[1][0]) + board[1][1] + board[1][2];
					break;
				case 2:	//bottom horizontal
					line = String.valueOf(board[2][0]) + board[2][1] + board[2][2];
					break;
				case 3:	//left vertical
					line = String.valueOf(board[0][0]) + board[1][0] + board[2][0];
					break;
				case 4:	//mid vertical
					line = String.valueOf(board[1][0]) + board[1][1] + board[1][2];
					break;
				case 5:	//right vertical
					line = String.valueOf(board[2][0]) + board[2][1] + board[2][2];
					break;
				case 6: //right diag
					line = String.valueOf(board[0][0]) + board[1][1] + board[2][2];
					break;
				case 7: //left diag
					line = String.valueOf(board[2][0]) + board[1][1] + board[0][2];
					break;
			}
			
			if(line.equals("XXX") || line.equals("OOO"))return player;
		}
		return -1;

	}
	
	private static void makeMove(char[][] board, int player) {
		Scanner input = new Scanner(System.in);
		int row, col, place;
		char marker = (player == 1) ? 'X' : 'O';
		
		while(true) {
			System.out.print("Player " + player + ", enter a position (1-9) : ");
			
			if(input.hasNextInt()) {
				place = input.nextInt();
			
				if(place >= 1 && place <= 9) {
					//The "Magic" Math
					row = (place - 1) / 3;
					col = (place - 1) % 3;
					
					//Check if the spot is available
					if(Character.isDigit(board[row][col])) {
						board[row][col] = marker;
						break; //Move Successful, exit loop
						
					}
					else {
						System.out.println("Invalid range. Please pick 1-9");
						
					}
				}
				else {
					System.out.println("Please enter a number between 1 and 9 that hasn't been taken already.");
					input.next(); //Clear invalid input
				}
			}
		}
	}
	
	
	private static void drawBoard(char[][] board) {
		int index = 0;
		for(int i = 0; i < 3; i++)		//rows
		{
			for(int j = 0; j < 3; j++)	//columns
			{
				System.out.print(board[i][j]);
				if(j != 2) System.out.print('|');
				
			}
			System.out.println("");
			if(i != 2) System.out.println("~~~~~");
		}
		
	}

	private static void fillBoard(char[][] board) {
		int index = 0;
		char ch = '1';
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++) {
				board[i][j] = ch;
				ch++;
				index++;
			
			}
		}
		
	}

}
