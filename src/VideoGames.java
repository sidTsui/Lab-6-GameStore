public class VideoGames extends Games {
    private String consoleType;

    public VideoGames(String gameType, String creator, String platform,
                      Double currentPrice, String playerNum, Double playingTime,
                      String difficulty, int starReviews) {
        super(gameType, creator, platform, currentPrice,
                playerNum, playingTime, difficulty, starReviews);
    }

    public String getConsoleType(){
        return this.consoleType;
    }
    public void setConsoleType(String consoleType){
        this.consoleType = consoleType;
    }

}
