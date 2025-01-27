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

public class KnightMovesCalculator implements PieceMovesCalculator{
    @Override
    public Collection<ChessMove> movesCalculator(ChessBoard board, ChessPosition pos) {

        ArrayList<ChessMove> moves = new ArrayList<>();
        ChessPiece curr = board.getPiece(pos);


        if (curr.getTeamColor() == WHITE){
            ChessPosition up2Right = new ChessPosition(pos.getRow() + 2, pos.getColumn() + 1);
            ChessPosition up2Left = new ChessPosition(pos.getRow() + 2, pos.getColumn() - 1);
            ChessPosition up1Right = new ChessPosition(pos.getRow() + 1, pos.getColumn() + 2);
            ChessPosition up1Left = new ChessPosition(pos.getRow() + 1, pos.getColumn() - 2);
            ChessPosition back2Right = new ChessPosition(pos.getRow() - 2, pos.getColumn() + 1);
            ChessPosition back2Left = new ChessPosition(pos.getRow() - 2, pos.getColumn() - 1);
            ChessPosition back1Right = new ChessPosition(pos.getRow() - 1, pos.getColumn() + 2);
            ChessPosition back1Left = new ChessPosition(pos.getRow() - 1, pos.getColumn() - 2);

            if (inbounds(up2Right) && (board.getPiece(up2Right) == null
                    || curr.getTeamColor() != board.getPiece(up2Right).getTeamColor())){
                moves.add(new ChessMove(pos, up2Right, null));
            }

            if (inbounds(up2Left) && (board.getPiece(up2Left) == null
                    || curr.getTeamColor() != board.getPiece(up2Left).getTeamColor())){
                moves.add(new ChessMove(pos, up2Left, null));
            }

            if (inbounds(up1Right) && (board.getPiece(up1Right) == null
                    || curr.getTeamColor() != board.getPiece(up1Right).getTeamColor())){
                moves.add(new ChessMove(pos, up1Right, null));
            }

            if (inbounds(up1Left) && (board.getPiece(up1Left) == null
                    || curr.getTeamColor() != board.getPiece(up1Left).getTeamColor())){
                moves.add(new ChessMove(pos, up1Left, null));
            }

            if (inbounds(back2Right) && (board.getPiece(back2Right) == null
                    || curr.getTeamColor() != board.getPiece(back2Right).getTeamColor())){
                moves.add(new ChessMove(pos, back2Right, null));
            }

            if (inbounds(back2Left) && (board.getPiece(back2Left) == null
                    || curr.getTeamColor() != board.getPiece(back2Left).getTeamColor())){
                moves.add(new ChessMove(pos, back2Left, null));
            }

            if (inbounds(back1Right) && (board.getPiece(back1Right) == null
                    || curr.getTeamColor() != board.getPiece(back1Right).getTeamColor())){
                moves.add(new ChessMove(pos, back1Right, null));
            }

            if (inbounds(back1Left) && (board.getPiece(back1Left) == null
                    || curr.getTeamColor() != board.getPiece(back1Left).getTeamColor())){
                moves.add(new ChessMove(pos, back1Left, null));
            }
        }

        if (curr.getTeamColor() == BLACK){
            ChessPosition up2Right = new ChessPosition(pos.getRow() - 2, pos.getColumn() + 1);
            ChessPosition up2Left = new ChessPosition(pos.getRow() - 2, pos.getColumn() - 1);
            ChessPosition up1Right = new ChessPosition(pos.getRow() - 1, pos.getColumn() + 2);
            ChessPosition up1Left = new ChessPosition(pos.getRow() - 1, pos.getColumn() - 2);
            ChessPosition back2Right = new ChessPosition(pos.getRow() + 2, pos.getColumn() + 1);
            ChessPosition back2Left = new ChessPosition(pos.getRow() + 2, pos.getColumn() - 1);
            ChessPosition back1Right = new ChessPosition(pos.getRow() + 1, pos.getColumn() + 2);
            ChessPosition back1Left = new ChessPosition(pos.getRow() + 1, pos.getColumn() - 2);

            if (inbounds(up2Right) && (board.getPiece(up2Right) == null
                    || curr.getTeamColor() != board.getPiece(up2Right).getTeamColor())){
                moves.add(new ChessMove(pos, up2Right, null));
            }

            if (inbounds(up2Left) && (board.getPiece(up2Left) == null
                    || curr.getTeamColor() != board.getPiece(up2Left).getTeamColor())){
                moves.add(new ChessMove(pos, up2Left, null));
            }

            if (inbounds(up1Right) && (board.getPiece(up1Right) == null
                    || curr.getTeamColor() != board.getPiece(up1Right).getTeamColor())){
                moves.add(new ChessMove(pos, up1Right, null));
            }

            if (inbounds(up1Left) && (board.getPiece(up1Left) == null
                    || curr.getTeamColor() != board.getPiece(up1Left).getTeamColor())){
                moves.add(new ChessMove(pos, up1Left, null));
            }

            if (inbounds(back2Right) && (board.getPiece(back2Right) == null
                    || curr.getTeamColor() != board.getPiece(back2Right).getTeamColor())){
                moves.add(new ChessMove(pos, back2Right, null));
            }

            if (inbounds(back2Left) && (board.getPiece(back2Left) == null
                    || curr.getTeamColor() != board.getPiece(back2Left).getTeamColor())){
                moves.add(new ChessMove(pos, back2Left, null));
            }

            if (inbounds(back1Right) && (board.getPiece(back1Right) == null
                    || curr.getTeamColor() != board.getPiece(back1Right).getTeamColor())){
                moves.add(new ChessMove(pos, back1Right, null));
            }

            if (inbounds(back1Left) && (board.getPiece(back1Left) == null
                    || curr.getTeamColor() != board.getPiece(back1Left).getTeamColor())){
                moves.add(new ChessMove(pos, back1Left, null));
            }
        }

        return moves;
    }
}
