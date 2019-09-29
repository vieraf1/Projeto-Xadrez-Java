package application;
import chess.ChessMatch;
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
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
		
		//ChessPosition chessPosition = new ChessPosition('a',1);
		//chessPosition.toPosition();
		
		//System.out.println("coluna " + (char) ('a' + 0));
		//System.out.println("linha " + (8 - 6));
	}

}
