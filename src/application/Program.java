package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
import exceptions.ChessException;

public class Program {

	public static void main(String[] args) {

		/*
		 * 8 - - - - - - - - 
		 * 7 - - - - - - - - 
		 * 6 - - - - - - - - 
		 * 5 - - - - - - - - 
		 * 4 - - - - - - - - 
		 * 3 - - - - - - - - 
		 * 2 - - - - - - - - 
		 * 1 - - - - - - - - 
		 *   a b c d e f g h
		 */
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();

		while (true) {
			try {
				UI.clearScreen();
				UI.PrintMatch(chessMatch);
				System.out.println();
				System.out.print("Souce: ");
				ChessPosition source = UI.readChessPosition(sc);
				
				boolean[][] possibleMoves = chessMatch.possibleMoves(source);
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces(), possibleMoves);

				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UI.readChessPosition(sc);

				ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
			} catch (ChessException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}

		// ChessPosition chessPosition = new ChessPosition('a',1);
		// chessPosition.toPosition();

		// System.out.println("coluna " + (char) ('a' + 0));
		// System.out.println("linha " + (8 - 6));

		// sc.close();
	}

}
