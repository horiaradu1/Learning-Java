import java.io.Console;

class HangmanDriver {

    public static void main(String[] args){
        Console console = System.console();
        String userInput = console.readLine("Enter your name here: ");
        Hangman player = new Hangman(userInput);
//        player.setPlayerName(userInput);
        System.out.println("Your name is " + player.getPlayerName());

        HangmanDictionary dict = new HangmanDictionary();
        String word = dict.getWord();

        player.setWord(word);
        System.out.println("The random word is: " + player.getWord());

        do{

            
        }



        System.out.println("Remaining guesses: " + player.getRemainingGuesses());

        System.out.println("Status of word is: " + player.getCurrentState());

    }


}