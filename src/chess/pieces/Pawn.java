package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece {

	public Pawn(Board board, Color color) {
		super(board, color);
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position p = new Position(0, 0);
		
		// white pieces
		if(getColor() == Color.WHITE) {
			
			//above 1 row
			p.setValeus(position.getRow() - 1, position.getColumn());
			if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			
			//above 2 rows2
			p.setValeus(position.getRow() - 2, position.getColumn());
			if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && getMoveCount() == 0) {
				Position p2 = new Position(position.getRow() - 1, position.getColumn());
				if(getBoard().positionExists(p2) && !getBoard().thereIsAPiece(p2)) {
					mat[p.getRow()][p.getColumn()] = true;
				}
			}
			
			//diagonal left
			p.setValeus(position.getRow() - 1, position.getColumn() - 1);
			if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			
			//diagonal right
			p.setValeus(position.getRow() - 1, position.getColumn() + 1);
			if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
		}
		
		// black pieces
		else {
			//down 1 row
			p.setValeus(position.getRow() + 1, position.getColumn());
			if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			
			//down 2 rows2
			p.setValeus(position.getRow() + 2, position.getColumn());
			if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && getMoveCount() == 0) {
				Position p2 = new Position(position.getRow() + 1, position.getColumn());
				if(getBoard().positionExists(p2) && !getBoard().thereIsAPiece(p2)) {
					mat[p.getRow()][p.getColumn()] = true;
				}
			}
			
			//diagonal left
			p.setValeus(position.getRow() + 1, position.getColumn() - 1);
			if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			
			//diagonal right
			p.setValeus(position.getRow() + 1, position.getColumn() + 1);
			if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
		}
		
		return mat;
	}
	
	@Override
	public String toString() {
		return "P";
	}

}
