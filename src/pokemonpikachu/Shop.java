/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemonpikachu;

import DataStructures.DynamicArray;
import UI.PokemonSelect_3;

/**
 *
 * @author Santiago
 */
import java.util.Scanner;

/**
 *
 * @author Santiago
 */
public class Shop {
    private DynamicArray<Gift> availableGifts;
    private Game game; 
    PokemonSelect_3 pokemonSelect = new PokemonSelect_3();

    /**
     *
     * @param game
     */
    public Shop(Game game) {
        this.game = game;
        this.availableGifts = new DynamicArray<>();
        initializeGifts();
    }

    /**
     *
     * @return
     */
    public DynamicArray<Gift> getAvailableGifts() {
        return availableGifts;
    }

    /**
     *
     * @param availableGifts
     */
    public void setAvailableGifts(DynamicArray<Gift> availableGifts) {
        this.availableGifts = availableGifts;
    }

    /**
     *
     * @return
     */
    public Game getGame() {
        return game;
    }

    /**
     *
     * @param game
     */
    public void setGame(Game game) {
        this.game = game;
    }

    /**
     *
     */
    public void initializeGifts() {
        for (int i = 0; i < 20; i++) {
            availableGifts.add(new Gift("Baya Aranja", 100, 100));
            availableGifts.add(new Gift("Baya Caquic", 200, 250));
            availableGifts.add(new Gift("Poke ball", 300, 400));
            availableGifts.add(new Gift("Baya Zreza", 400, 550));
            availableGifts.add(new Gift("Baya Zanama", 500, 700));
            availableGifts.add(new Gift("Baya Ziuela", 600, 850));
            availableGifts.add(new Gift("Baya Zidra", 700, 1000));
            availableGifts.add(new Gift("Baya Enigma", 800, 1150));
            availableGifts.add(new Gift("Caramelo raro", 900, 1300));
        }
    }

    /**
     *
     */
    public void buyGift() {
        Scanner scanner = new Scanner(System.in);
        int giftIndex = scanner.nextInt();
        Gift selectedGift = availableGifts.get(giftIndex);
        if (game.getWattsBalance() >= selectedGift.getCost()) {
            game.deductWatts(selectedGift.getCost());
            System.out.println("Which Pokemon do you want to give the gift to?");
            displayAvailablePokemon();
            int pokemonIndex = scanner.nextInt();
            Pokemon selectedPokemon = game.getPokemons().get(pokemonIndex);
            System.out.println(selectedPokemon.getName());
            selectedPokemon.increaseRelationship(selectedGift.getRelationshipEffect());
            selectedPokemon.addGift(selectedGift);
            System.out.println("");
            
        } else {
            System.out.println("You don't have enough watts to buy this gift.");
        }
    }

    /**
     *
     */
    public void showAvailableGifts() {
        for (int i = 0; i < availableGifts.size(); i++) {
            Gift gift = availableGifts.get(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (availableGifts.get(j).getName().equals(gift.getName())) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println((i + 1) + ". " + gift.getName() + " - " + gift.getCost() + " Watts");
            }
        }
    }

    /**
     *
     */
    public void displayAvailablePokemon() {
        DynamicArray<Pokemon> pokemons = game.getPokemons();
        for (int i = 0; i < pokemons.size(); i++) {
            Pokemon pokemon = pokemons.get(i);
            System.out.println((i + 1) + ". " + pokemon.getName());
        }
    }
}
