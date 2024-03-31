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
public class Game {
    private long startTime;
    private int wattsBalance;
    private DynamicArray<Pokemon> pokemons;
    private DynamicArray<Gift> shopGifts;
    private long lastUpdateTime;

    public Game() {
        this.startTime = System.currentTimeMillis();
        this.wattsBalance = 0;
        this.pokemons = new DynamicArray<>();
        this.shopGifts = new DynamicArray<>();
        this.lastUpdateTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public int getWattsBalance() {
        return wattsBalance;
    }

    public void setWattsBalance(int wattsBalance) {
        this.wattsBalance = wattsBalance;
    }

    public DynamicArray<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(DynamicArray<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public DynamicArray<Gift> getShopGifts() {
        return shopGifts;
    }

    public void setShopGifts(DynamicArray<Gift> shopGifts) {
        this.shopGifts = shopGifts;
    }

     public void update() {
        long currentTime = System.currentTimeMillis();
        long elapsedSeconds = (currentTime - lastUpdateTime) / 1000;

        wattsBalance += elapsedSeconds;

        for (int i = 0; i < pokemons.size(); i++) {
            Pokemon pokemon = pokemons.get(i);
            pokemon.setRelationship(Math.max(0, pokemon.getRelationship() - (int)elapsedSeconds)); //validar si relacion es igual a 0
        }

        lastUpdateTime = currentTime;
    }

    public void performAction() {
        wattsBalance += 10;

        update();
    }

    public void deductWatts(int amount) {
        if (amount <= wattsBalance) {
            wattsBalance -= amount;
        } else {
            System.out.println("Not enough watts.");
        }
    }

    public boolean canUnlockPachirisu() {
        for (int i = 0; i < pokemons.size(); i++) {
            Pokemon pokemon = pokemons.get(i);
            if (pokemon.getName().equals("Pikachu") && pokemon.getRelationship() >= 8000) {
                return true;
            }
        }
        return false;
    }

}
