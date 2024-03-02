public class Games {
    private String gameType; //BoardGame, CardGame, VidoeGame
    private String creator;
    private String platform; //console,BoardGame, CardGame, computer, handheld, mobile
    private Double currentPrice;
    private String playerNum; // Strings: 1-4, 1+, unlimited
    private Double playingTime;
    private String difficulty;//easy medium hard
    private int starReviews;//1-5



   //constructor
   public Games(String gameType, String creator, String platform, Double currentPrice,
                 String playerNum, Double playingTime, String difficulty,int starReviews){
        this.gameType = gameType;
        this.creator = creator;
        this.platform = platform;
        this.currentPrice = currentPrice;
        this.playerNum = playerNum;
        this.playingTime = playingTime;
        this.difficulty = difficulty;
        this.starReviews = starReviews;
    }


    //accessor methods
    public String getGameType(){
        return gameType;
    }
    public String getCreator(){
        return creator;
    }
    public String getPlatform(){
        return platform;
    }
    public Double getCurrentPrice(){
        return currentPrice;
    }
    public String getPlayerNum(){
        return playerNum;
    }
    public Double getPlayingTime(){
        return playingTime;
    }
    public String getDifficulty(){
        return difficulty;
    }
    public int getStarReviews(){
        return starReviews;
    }


    //mutator methods
    public void setGameType(String gameType){
        this.gameType = gameType;
    }
    public void setCreator(String creator){
        this.creator = creator;
    }
    public void setPlatform(String platform){
        this.platform = platform;
    }
    public void setCurrentPrice(Double currentPrice){
        this.currentPrice = currentPrice;
    }
    public void setPlayerNum(String playerNum){
        this.playerNum = playerNum;
    }
    public void setPlayingTime(Double playingTime){
        this.playingTime = playingTime;
    }
    public void setDifficulty(String difficulty){
        this.difficulty = difficulty;
    }
    public void setStarReviews(int starReviews){
        this.starReviews = starReviews;
    }
}
