public class MarioKart extends VideoGames{
    private String characterName;

    public MarioKart(String gameType, String creator, String platform, Double currentPrice, String playerNum, Double playingTime, String difficulty, int starReviews) {
        super(gameType, creator, platform, currentPrice, playerNum, playingTime, difficulty, starReviews);
    }

    public String getCharacterName(){
        return this.characterName = characterName;
    }
    public void setCharacterName(String characterName){
        this.characterName = characterName;
    }
}

