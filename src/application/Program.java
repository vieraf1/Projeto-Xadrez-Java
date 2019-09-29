package application;
import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		
		/*
8 - - - - - - - - 
7 - - - - - - - - 
6 - - - - - - - - 
5 - - - - - - - - 
4 - - - - - - - - 
3 - - - - - - - - 
2 - - - - - - - - 
1 - - - - - - - - 
  a b c d e f g h
		 */
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		while(true) {
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.print("Souce: ");
			ChessPosition source = UI.readChessPosition(sc);
			
			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(sc);
			
			ChessPiece capturedPiece = chessMatch.performChessMove(source, target) ;
		}
		
		//ChessPosition chessPosition = new ChessPosition('a',1);
		//chessPosition.toPosition();
		
		//System.out.println("coluna " + (char) ('a' + 0));
		//System.out.println("linha " + (8 - 6));
		
		//sc.close();
	}

}
