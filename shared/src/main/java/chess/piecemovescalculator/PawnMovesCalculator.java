package chess.piecemovescalculator;

import chess.ChessBoard;
import chess.ChessMove;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static chess.ChessGame.TeamColor.BLACK;
import static chess.ChessGame.TeamColor.WHITE;

public class PawnMovesCalculator implements PieceMovesCalculator {


    @Override
    public Collection<ChessMove> movesCalculator(ChessBoard board, ChessPosition pos) {

        ArrayList<ChessMove> moves = new ArrayList<>();
        ChessPiece curr = board.getPiece(pos);


        if (curr.getTeamColor() == WHITE){

            ChessPosition up1 = new ChessPosition(pos.getRow() + 1, pos.getColumn());
            ChessPosition up2 = new ChessPosition(pos.getRow() + 2, pos.getColumn());
            ChessPosition takeRight = new ChessPosition(pos.getRow() + 1, pos.getColumn() + 1);
            ChessPosition takeLeft = new ChessPosition(pos.getRow() + 1, pos.getColumn() - 1);

            if (inbounds(up2) && pos.getRow() == 2 && board.getPiece(up1) == null & board.getPiece(up2) == null){
                moves.add(new ChessMove(pos, up2, null));
            }

            if (inbounds(up1) & pos.getRow() != 7 && board.getPiece(up1) == null){
                moves.add(new ChessMove(pos, up1, null));
            }

            if (inbounds(takeRight) && pos.getRow() != 7 && board.getPiece(takeRight) != null
                    && curr.getTeamColor() != board.getPiece(takeRight).getTeamColor()){
                moves.add(new ChessMove(pos, takeRight, null));
            }

            if (inbounds(takeLeft) && pos.getRow() != 7 && board.getPiece(takeLeft) != null
                    && curr.getTeamColor() != board.getPiece(takeLeft).getTeamColor()){
                moves.add(new ChessMove(pos, takeLeft, null));
            }

            if (inbounds(up1) && pos.getRow() == 7 && board.getPiece(up1) == null){
                moves.addAll(promoter(pos, up1));
            }

            if (inbounds(takeRight) && pos.getRow() == 7 && board.getPiece(takeRight) != null
                    && curr.getTeamColor() != board.getPiece(takeRight).getTeamColor()){
                moves.addAll(promoter(pos, takeRight));
            }

            if (inbounds(takeLeft) && pos.getRow() == 7 && board.getPiece(takeLeft) != null
                    && curr.getTeamColor() != board.getPiece(takeLeft).getTeamColor()){
                moves.addAll(promoter(pos, takeLeft));
            }

        }

        if (curr.getTeamColor() == BLACK){

            ChessPosition up1 = new ChessPosition(pos.getRow() - 1, pos.getColumn());
            ChessPosition up2 = new ChessPosition(pos.getRow() - 2, pos.getColumn());
            ChessPosition takeRight = new ChessPosition(pos.getRow() - 1, pos.getColumn() + 1);
            ChessPosition takeLeft = new ChessPosition(pos.getRow() - 1, pos.getColumn() - 1);

            if (inbounds(up2) && pos.getRow() == 7 && board.getPiece(up1) == null & board.getPiece(up2) == null){
                moves.add(new ChessMove(pos, up2, null));
            }

            if (inbounds(up1) & pos.getRow() != 2 && board.getPiece(up1) == null){
                moves.add(new ChessMove(pos, up1, null));
            }

            if (inbounds(takeRight) && pos.getRow() != 2 && board.getPiece(takeRight) != null
                    && curr.getTeamColor() != board.getPiece(takeRight).getTeamColor()){
                moves.add(new ChessMove(pos, takeRight, null));
            }

            if (inbounds(takeLeft) && pos.getRow() != 2 && board.getPiece(takeLeft) != null
                    && curr.getTeamColor() != board.getPiece(takeLeft).getTeamColor()){
                moves.add(new ChessMove(pos, takeLeft, null));
            }

            if (inbounds(up1) && pos.getRow() == 2 && board.getPiece(up1) == null){
                moves.addAll(promoter(pos, up1));
            }

            if (inbounds(takeRight) && pos.getRow() == 2 && board.getPiece(takeRight) != null
                    && curr.getTeamColor() != board.getPiece(takeRight).getTeamColor()){
                moves.addAll(promoter(pos, takeRight));
            }

            if (inbounds(takeLeft) && pos.getRow() == 2 && board.getPiece(takeLeft) != null
                    && curr.getTeamColor() != board.getPiece(takeLeft).getTeamColor()){
                moves.addAll(promoter(pos, takeLeft));
            }
        }

        return moves;
    }
}
