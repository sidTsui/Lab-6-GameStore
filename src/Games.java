public class Games {
    private String gameName;
    private String gameType; //BoardGame, CardGame, VideoGame
    private String creator;
    private Double currentPrice;
    private int maxPlayerNum; // max player number
    private Double playingTime; // average time
    private String difficulty;//easy, medium, hard, or chance
    private Double starReviews;//1-5

    @Override
    public String toString() {
        return String.format("%s %s%n%s %s%n%s %s%n%s $%.2f%n%s %d players %n%s %.2f minutes %n%s %s%n%s %.1f stars",
                "Game Name: ",gameName,
                "Game Type: ", gameType,
                "Creator: ", creator,
                "Current Cost: ", currentPrice,
                "Max Players: ", maxPlayerNum,
                "Average Playing Time: ", playingTime,
                "Difficulty Level: ", difficulty,
                "Rating: ", starReviews);
   }

   //constructor
   public Games(String gameName, String gameType, String creator, Double currentPrice,
                 int maxPlayerNum, Double playingTime, String difficulty,Double starReviews){
        this.gameName = gameName;
        this.gameType = gameType;
        this.creator = creator;
        this.currentPrice = currentPrice;
        this.maxPlayerNum = maxPlayerNum;
        this.playingTime = playingTime;
        this.difficulty = difficulty;
        this.starReviews = starReviews;
    }


    //accessor methods
    public String getGameName(){return gameName;}
    public String getGameType(){return gameType;}
    public String getCreator(){return creator;}
    public Double getCurrentPrice(){
        return currentPrice;
    }
    public int getMaxPlayerNum(){
        return maxPlayerNum;
    }
    public Double getPlayingTime(){
        return playingTime;
    }
    public String getDifficulty(){return difficulty;}
    public Double getStarReviews(){
        return starReviews;
    }


    //mutator methods
    public void setGameName(String gameName){this.gameName = gameName;}
    public void setGameType(String gameType){this.gameType = gameType;}
    public void setCreator(String creator){this.creator = creator;}
    public void setCurrentPrice(Double currentPrice){
        this.currentPrice = currentPrice;
    }
    public void setMaxPlayerNum(int maxPlayerNum){
        this.maxPlayerNum = maxPlayerNum;
    }
    public void setPlayingTime(Double playingTime){
        this.playingTime = playingTime;
    }
    public void setDifficulty(String difficulty){
        this.difficulty = difficulty;
    }
    public void setStarReviews(Double starReviews){
        this.starReviews = starReviews;
    }
}
