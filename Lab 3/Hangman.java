class Hangman{

    private String playerName;
    private String wordToGuess;
    public int MAX_GUESSES = 20;
    private char[] guesses = new char[MAX_GUESSES];

    public Hangman(String playerName){
        this.playerName = playerName;
    }

    public String getCurrentState(){
        String guesses = new String(getGuesses());
        char[] guessWord = this.wordToGuess.toCharArray();
        String currentWord = "";

        for (int i=0; i<guessWord.length; i++)
            if (guesses.indexOf(guessWord[i]) >= 0)
                currentWord = currentWord + guessWord[i];
            else currentWord = currentWord + "_";

        return currentWord;
    }

    public char[] getGuesses() {
        return guesses;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getRemainingGuesses(){
        int num = 0;
        for (int i=0; i<this.guesses.length; i++)
            if (this.guesses[i]!=0)
                num = num + 1;
        return this.MAX_GUESSES-num;
    }

    public String getWord() {
        return wordToGuess;
    }

    public void setWord(String word) {
        this.wordToGuess = word;
    }

    public boolean tryChar(char trial){
        if (new String(getGuesses()).indexOf(trial) == -1)
            this.guesses[this.MAX_GUESSES-getRemainingGuesses()] = trial;
        if (this.wordToGuess.indexOf(trial) >= 0)
            return true;
        return false;
    }
}