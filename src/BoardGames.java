public class BoardGames extends Games {
    private int minPlayers;
    private int maxPlayers;
    private Double boardSize;

    public BoardGames(String gameType, String creator, String platform,
                      Double currentPrice, String playerNum, Double playingTime,
                      String difficulty, int starReviews)
    {super(gameType, creator, platform, currentPrice,
            playerNum, playingTime, difficulty, starReviews);
    }
    public int getMinPlayers(){
        return this.minPlayers;
    }
    public int getMaxPlayers(){
        return this.maxPlayers;
    }
    public Double getBoardSize(){
        return this.boardSize;
    }
    public void setMinPlayers(int minPlayers){
        this.minPlayers = minPlayers;
    }
    public void setMaxPlayers(int maxPlayers){
        this.maxPlayers = maxPlayers;
    }
    public void setBoardSize(Double boardSize){
        this.boardSize = boardSize;
    }
}
