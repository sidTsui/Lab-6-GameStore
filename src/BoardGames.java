public class BoardGames extends Games {

    private Double boardSize;

    public BoardGames(String gameName, String gameType, String creator,
                      Double currentPrice, int maxPlayerNum, Double playingTime,
                      String difficulty, Double starReviews)
    {super(gameName, gameType, creator, currentPrice,
            maxPlayerNum, playingTime, difficulty, starReviews);
    }
    public Double getBoardSize(){
        // boardSize is the width of the board
        return this.boardSize;
    }
    public void setBoardSize(Double boardSize){
        this.boardSize = boardSize;
    }
}
