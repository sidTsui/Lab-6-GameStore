public class MarioKart extends VideoGames{
    private String characterName;
    // character name is referring to which character the user chooses
    // eg: peach, mario, luigi 

    public MarioKart(String gameName, String gameType, String creator,
                     Double currentPrice, int maxPlayerNum, Double playingTime,
                     String difficulty, Double starReviews) {

        super(gameName, gameType, creator, currentPrice, maxPlayerNum,
                playingTime, difficulty, starReviews);
    }



    public String getCharacterName(){
        return this.characterName = characterName;
    }
    public void setCharacterName(String characterName){
        this.characterName = characterName;
    }
}

