/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemonpikachu;

import DataStructures.DynamicArray;
import UI.Watts;

/**
 *
 * @author Santiago
 */
public class Game {
    private long startTime;
    private long playTime;
    private static Game instance;
    private int wattsBalance;
    private DynamicArray<Pokemon> pokemons;
    private DynamicArray<Gift> shopGifts;
    private long lastUpdateTime;

    /**
     *
     */
    public Game() {
        this.startTime = System.currentTimeMillis();
        this.wattsBalance = 0;
        this.pokemons = new DynamicArray<>();
        this.shopGifts = new DynamicArray<>();
        this.lastUpdateTime = System.currentTimeMillis();
        
    }

    /**
     *
     * @return
     */
    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    /**
     *
     * @return
     */
    public long getPlayTime() {
        return playTime;
    }

    /**
     *
     */
    public void incrementPlayTime() {
        playTime += 1000; // increment by one second
    }

    /**
     *
     * @return
     */
    public long getStartTime() {
        return startTime;
    }

    /**
     *
     * @param startTime
     */
    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    /**
     *
     * @return
     */
    public int getWattsBalance() {
        return wattsBalance;
    }

    /**
     *
     * @param wattsBalance
     */
    public void setWattsBalance(int wattsBalance) {
        this.wattsBalance = wattsBalance;
    }

    /**
     *
     * @return
     */
    public DynamicArray<Pokemon> getPokemons() {
        return pokemons;
    }

    /**
     *
     * @param pokemons
     */
    public void setPokemons(DynamicArray<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    /**
     *
     * @return
     */
    public DynamicArray<Gift> getShopGifts() {
        return shopGifts;
    }

    /**
     *
     * @param shopGifts
     */
    public void setShopGifts(DynamicArray<Gift> shopGifts) {
        this.shopGifts = shopGifts;
    }

    /**
     *updated the watts and the relationship by the second pased
     * @author Santiago del Castillo
     */
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

    /**
     *
     */
    public void performAction() {
        wattsBalance += 10;

        update();
    }

    /**
     *deducts watts
     * @author santiago del Castillo
     * @param amount
     */
    public void deductWatts(int amount) {
        if (amount <= wattsBalance) {
            wattsBalance -= amount;
        } else {
            System.out.println("Not enough watts.");
        }
    }

    /**
     *checks if you can unlock pachirisu
     * @author Santiago del castillo
     * @return
     */
    public boolean canUnlockPachirisu() {
        for (int i = 0; i < pokemons.size(); i++) {
            Pokemon pokemon = pokemons.get(i);
            if (pokemon.getName().equals("Pikachu") && pokemon.getRelationship() >= 8000) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param name
     * @return
     */
    public Pokemon getPokemonByName(String name) {
        for (Pokemon pokemon : pokemons) {
            if (pokemon.getName().equals(name)) {
                return pokemon;
            }
        }
        return null;
    }
    
    }
