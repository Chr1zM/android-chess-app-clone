package janorschke.meyer.game

enum class PieceType(val value: String) {
    NONE("NONE"),

    PAWN_BLACK("PAWN_BLACK"),
    BISHOP_BLACK("BISHOP_BLACK"),
    KNIGHT_BLACK("KNIGHT_BLACK"),
    ROOK_BLACK("ROOK_BLACK"),
    QUEEN_BLACK("QUEEN_BLACK"),
    KING_BLACK("KING_BLACK"),

    PAWN_WHITE("PAWN_WHITE"),
    BISHOP_WHITE("BISHOP_WHITE"),
    KNIGHT_WHITE("KNIGHT_WHITE"),
    ROOK_WHITE("ROOK_WHITE"),
    QUEEN_WHITE("QUEEN_WHITE"),
    KING_WHITE("KING_WHITE")
}