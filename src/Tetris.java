public class Tetris extends VideoGames{
    
    // tetris doesn't have characters so set/get backgroundColor instead
    private String backgroundColor;

    public Tetris(String gameName, String gameType, String creator,
                     Double currentPrice, int maxPlayerNum, Double playingTime,
                     String difficulty, Double starReviews) {

        super(gameName, gameType, creator, currentPrice, maxPlayerNum,
                playingTime, difficulty, starReviews);
    }



    public String getBackgroundColor(){
        return this.backgroundColor = backgroundColor;
    }
    public void setBackgroundColor(String backgroundColor){
        this.backgroundColor = backgroundColor;
    }
}
