/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemonpikachu;

import DataStructures.DynamicArray;

/**
 *
 * @author Santiago
 */
import java.util.Scanner;

public class Shop {
    private DynamicArray<Gift> availableGifts;
    private Game game; // replace Player with Game

    public Shop(Game game) {
        this.game = game;
        this.availableGifts = new DynamicArray<>();
        initializeGifts();
    }

    private void initializeGifts() {
        availableGifts.add(new Gift("Baya Aranja", 100, 100));
        availableGifts.add(new Gift("Baya Caquic", 200, 250));
    }

    public void buyGift() {
        showAvailableGifts();
        Scanner scanner = new Scanner(System.in);
        int giftIndex = scanner.nextInt();
        Gift selectedGift = availableGifts.get(giftIndex);
        if (game.getWattsBalance() >= selectedGift.getCost()) {
            game.deductWatts(selectedGift.getCost());
            System.out.println("Which Pokemon do you want to give the gift to?");
            int pokemonIndex = scanner.nextInt();
            Pokemon selectedPokemon = game.getPokemons().get(pokemonIndex);
            selectedPokemon.increaseRelationship(selectedGift.getRelationshipEffect());
            selectedPokemon.addGift(selectedGift);
        } else {
            System.out.println("You don't have enough watts to buy this gift.");
        }
    }

    private void showAvailableGifts() {
        for (int i = 0; i < availableGifts.size(); i++) {
            Gift gift = availableGifts.get(i);
            System.out.println((i + 1) + ". " + gift.getName() + " - " + gift.getCost() + " Watts");
        }
    }
}
