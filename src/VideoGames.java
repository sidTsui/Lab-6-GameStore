public class VideoGames extends Games {
    private String consoleType;
    // consoleType refers to things like handheld, home video game, microConsole 
    public VideoGames(String gameName, String gameType, String creator,
                      Double currentPrice, int maxPlayerNum, Double playingTime,
                      String difficulty, Double starReviews) {
        super(gameName, gameType, creator, currentPrice,
                maxPlayerNum, playingTime, difficulty, starReviews);
    }

    public String getConsoleType(){
        return this.consoleType;
    }
    public void setConsoleType(String consoleType){
        this.consoleType = consoleType;
    }

}
