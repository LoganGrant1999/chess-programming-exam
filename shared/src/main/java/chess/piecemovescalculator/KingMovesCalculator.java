package chess.piecemovescalculator;

import chess.ChessBoard;
import chess.ChessMove;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class KingMovesCalculator implements PieceMovesCalculator{
    @Override
    public Collection<ChessMove> movesCalculator(ChessBoard board, ChessPosition pos) {


        ArrayList<ChessMove> moves = new ArrayList<>();
        ChessPiece curr = board.getPiece(pos);

        ChessPosition up = new ChessPosition(pos.getRow() + 1, pos.getColumn());
        ChessPosition down = new ChessPosition(pos.getRow() - 1, pos.getColumn());
        ChessPosition right = new ChessPosition(pos.getRow(), pos.getColumn() + 1);
        ChessPosition left = new ChessPosition(pos.getRow(), pos.getColumn() - 1);
        ChessPosition upRight = new ChessPosition(pos.getRow() + 1, pos.getColumn() + 1);
        ChessPosition upLeft = new ChessPosition(pos.getRow() + 1, pos.getColumn() - 1);
        ChessPosition downRight = new ChessPosition(pos.getRow() - 1, pos.getColumn() + 1);
        ChessPosition downLeft = new ChessPosition(pos.getRow() - 1, pos.getColumn() - 1);

        if (inbounds(up) && (board.getPiece(up) == null
                || curr.getTeamColor() != board.getPiece(up).getTeamColor())){
            moves.add(new ChessMove(pos, up, null));
        }

        if (inbounds(down) && (board.getPiece(down) == null
                || curr.getTeamColor() != board.getPiece(down).getTeamColor())){
            moves.add(new ChessMove(pos, down, null));
        }

        if (inbounds(right) && (board.getPiece(right) == null
                || curr.getTeamColor() != board.getPiece(right).getTeamColor())){
            moves.add(new ChessMove(pos, right, null));
        }

        if (inbounds(left) && (board.getPiece(left) == null
                || curr.getTeamColor() != board.getPiece(left).getTeamColor())){
            moves.add(new ChessMove(pos, left, null));
        }

        if (inbounds(upRight) && (board.getPiece(upRight) == null
                || curr.getTeamColor() != board.getPiece(upRight).getTeamColor())){
            moves.add(new ChessMove(pos, upRight, null));
        }

        if (inbounds(upLeft) && (board.getPiece(upLeft) == null
                || curr.getTeamColor() != board.getPiece(upLeft).getTeamColor())){
            moves.add(new ChessMove(pos, upLeft, null));
        }

        if (inbounds(downRight) && (board.getPiece(downRight) == null
                || curr.getTeamColor() != board.getPiece(downRight).getTeamColor())){
            moves.add(new ChessMove(pos, downRight, null));
        }

        if (inbounds(downLeft) && (board.getPiece(downLeft) == null
                || curr.getTeamColor() != board.getPiece(downLeft).getTeamColor())){
            moves.add(new ChessMove(pos, downLeft, null));
        }

        return moves;
    }
}
