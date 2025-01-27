package chess.piecemovescalculator;

import chess.ChessBoard;
import chess.ChessMove;
import chess.ChessPosition;

import java.util.ArrayList;
import java.util.Collection;

import static chess.ChessPiece.PieceType.*;

public interface PieceMovesCalculator {
    Collection<ChessMove> movesCalculator(ChessBoard board, ChessPosition pos);

    default boolean inbounds(ChessPosition pos) {
        if (pos.getRow() > 0 && pos.getRow() < 9 && pos.getColumn() > 0 && pos.getColumn() < 9){
            return true;
        }
        else{
            return false;
        }
    }

    default ArrayList<ChessMove> promoter(ChessPosition startPos, ChessPosition endPos){
        ArrayList<ChessMove> moves = new ArrayList<>();

        moves.add(new ChessMove(startPos, endPos, ROOK));
        moves.add(new ChessMove(startPos, endPos, KNIGHT));
        moves.add(new ChessMove(startPos, endPos, BISHOP));
        moves.add(new ChessMove(startPos, endPos, QUEEN));

        return moves;
    }
}
