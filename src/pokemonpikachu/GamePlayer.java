/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemonpikachu;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Santiago
 */
public class GamePlayer {
    private Game game;
    private Random random;
    private Scanner scanner;

    public GamePlayer(Game game) {
        this.game = game;
        this.random = new Random();
        this.scanner = new Scanner(System.in);
    }

    public void playGame() {
        // Select a Pokemon to play with
        System.out.println("Select a Pokemon to play with:");
        for (int i = 0; i < game.getPokemons().size(); i++) {
            System.out.println((i + 1) + ". " + game.getPokemons().get(i).getName());
        }
        int pokemonIndex = scanner.nextInt() - 1;
        Pokemon selectedPokemon = game.getPokemons().get(pokemonIndex);

        if (selectedPokemon.getName().equals("Pachirisu") && !game.canUnlockPachirisu()) {
            System.out.println("You haven't unlocked Pachirisu yet. Please select a different Pokemon.");
            return;
        }
        // Bet watts
        System.out.println("Enter the number of watts to bet:");
        int betWatts = scanner.nextInt();
        if (betWatts > game.getWattsBalance()) {
            System.out.println("You don't have enough watts to bet this amount.");
            return;
        }
        game.setWattsBalance(game.getWattsBalance() - betWatts);

        // Play a game
        if (selectedPokemon.getName().equals("Pikachu")) {
            playHighLowGame(betWatts);
        } else if (selectedPokemon.getName().equals("Pachirisu")) {
            playGuessingGame(selectedPokemon, betWatts);
        }
    }

   private void playHighLowGame(int betWatts) {
    int firstCard = random.nextInt(13) + 1;
    System.out.println("The card chosen by Pikachu is: " + firstCard);

    System.out.println("Will the next card be higher or lower? Enter 'H' for higher, 'L' for lower:");
    String prediction = scanner.next();

    int secondCard = random.nextInt(13) + 1;
    System.out.println("The next card is: " + secondCard);

    if ((prediction.equalsIgnoreCase("H") && secondCard > firstCard) ||
        (prediction.equalsIgnoreCase("L") && secondCard < firstCard)) {
        System.out.println("You won! Pikachu has charged your balance.");
        game.setWattsBalance(game.getWattsBalance() + 2 * betWatts);
    } else {
        System.out.println("You lost! Pikachu has consumed your watts.");
        game.setWattsBalance(game.getWattsBalance() - betWatts);
    }
}

private void playGuessingGame(Pokemon pokemon, int betWatts) {
    if (pokemon.getGiftsReceived().size() < 2) {
        System.out.println("Pokemon refuses to play, you need to buy at least 2 gifts for Pokemon.");
        return;
    }

    System.out.println("Guess what Pokemon is thinking. Enter the name of the gift:");
    String guessedGift = scanner.next();

    int randomGiftIndex = random.nextInt(pokemon.getGiftsReceived().size());
    Gift actualGift = pokemon.getGiftsReceived().get(randomGiftIndex);

    if (guessedGift.equalsIgnoreCase(actualGift.getName())) {
        System.out.println("You won! Pokemon has charged your balance.");
        game.setWattsBalance(game.getWattsBalance() + 2 * betWatts);
    } else {
        System.out.println("You lost! Pokemon has consumed your watts.");
        game.setWattsBalance(game.getWattsBalance() - betWatts);
        pokemon.setRelationship(pokemon.getRelationship() + betWatts);
    }
}
}