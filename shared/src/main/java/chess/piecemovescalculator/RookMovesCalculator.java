package chess.piecemovescalculator;

import chess.ChessBoard;
import chess.ChessMove;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RookMovesCalculator implements PieceMovesCalculator{
    @Override
    public Collection<ChessMove> movesCalculator(ChessBoard board, ChessPosition pos) {

        ArrayList<ChessMove> moves = new ArrayList<>();

        ChessPiece curr = board.getPiece(pos);

        for (int i = 1; i < 9; i++){

            ChessPosition up = new ChessPosition(pos.getRow() + i, pos.getColumn());

            if (!inbounds(up) || (board.getPiece(up) != null
                    && curr.getTeamColor() == board.getPiece(up).getTeamColor())){
                break;
            }

            moves.add(new ChessMove(pos, up, null));

            if (board.getPiece(up) != null && curr.getTeamColor() != board.getPiece(up).getTeamColor()){
                break;
            }
        }

        for (int i = 1; i < 9; i++){

            ChessPosition down = new ChessPosition(pos.getRow() - i, pos.getColumn());

            if (!inbounds(down) || (board.getPiece(down) != null
                    && curr.getTeamColor() == board.getPiece(down).getTeamColor())){
                break;
            }

            moves.add(new ChessMove(pos, down, null));

            if (board.getPiece(down) != null && curr.getTeamColor() != board.getPiece(down).getTeamColor()){
                break;
            }
        }

        for (int i = 1; i < 9; i++){

            ChessPosition right = new ChessPosition(pos.getRow(), pos.getColumn() + i);

            if (!inbounds(right) || (board.getPiece(right) != null
                    && curr.getTeamColor() == board.getPiece(right).getTeamColor())){
                break;
            }

            moves.add(new ChessMove(pos, right, null));

            if (board.getPiece(right) != null && curr.getTeamColor() != board.getPiece(right).getTeamColor()){
                break;
            }
        }

        for (int i = 1; i < 9; i++){

            ChessPosition left = new ChessPosition(pos.getRow(), pos.getColumn() - i);

            if (!inbounds(left) || (board.getPiece(left) != null
                    && curr.getTeamColor() == board.getPiece(left).getTeamColor())){
                break;
            }

            moves.add(new ChessMove(pos, left, null));

            if (board.getPiece(left) != null && curr.getTeamColor() != board.getPiece(left).getTeamColor()){
                break;
            }
        }

        return moves;
    }
}
