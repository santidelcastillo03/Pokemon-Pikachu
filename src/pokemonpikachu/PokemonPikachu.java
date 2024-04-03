/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pokemonpikachu;

import UI.InitialMenu;

/**
 *
 * @author Santiago
 */
public class PokemonPikachu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game game = Game.getInstance();
        game.setWattsBalance(3000);
        game.update();
        InitialMenu initialMenu = new InitialMenu();
        SoundPlayer soundPlayer = SoundPlayer.getInstance();
        
        
        
    
        System.out.println(game.getWattsBalance());
//        System.out.println( game.getWattsBalance());
//        GamePlayer player = new GamePlayer(game);
Pokemon pikachu = new Pokemon("Pikachu");
//        Pokemon pachirisu = new Pokemon("Pachirisu");
 game.getPokemons().add(pikachu);
//        game.getPokemons().add(pachirisu);
//        SoundPlayer sound = new SoundPlayer();
//        //sound.playSound("src/Sounds/1-17 Battle! Trainer.wav");
 game.update();
     pikachu.setRelationship(8000);
//        
//
//
//        Shop shop = new Shop(game);
//
//        shop.buyGift();
//
//        System.out.println( pikachu.getRelationship());
//        System.out.println( game.getWattsBalance());
//
//        shop.buyGift();
//        player.playGame();
//        game.update();
//        System.out.println(pikachu.currentStatus());
    }




}
