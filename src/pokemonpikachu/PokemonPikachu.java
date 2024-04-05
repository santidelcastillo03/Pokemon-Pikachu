/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pokemonpikachu;

import DataStructures.AVLNode;
import DataStructures.DynamicArray;
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
        Pokemon pachirisu = Pokemon.getInstance("Pachirisu");
        Pokemon pikachu = Pokemon.getInstance("Pikachu");
        
        game.getPokemons().add(pikachu);
        game.getPokemons().add(pachirisu);
        pikachu.setRelationship(9000);
        game.setWattsBalance(3000);
        game.update();
//        Shop shop = new Shop(game);
////
//shop.buyGift();
        
        //System.out.println(pikachu.getGiftsReceived().getRoot().getData().getName());
        AVLNode<Gift> root = pikachu.getGiftsReceived().getRoot();
pikachu.listGiftsReceived(root);
DynamicArray<AVLNode<Gift>> list = pikachu.getListGifts();
for(AVLNode<Gift> node : list){
    System.out.println(node.getData().getName());
}

        InitialMenu initialMenu = new InitialMenu();
        SoundPlayer soundPlayer = SoundPlayer.getInstance();
        
        
        
    
       // System.out.println(game.getWattsBalance());
//        System.out.println( game.getWattsBalance());
//        GamePlayer player = new GamePlayer(game);

//        SoundPlayer sound = new SoundPlayer();
//        //sound.playSound("src/Sounds/1-17 Battle! Trainer.wav");
 game.update();
     
//        
//
//
        //
       System.out.println( pikachu.getRelationship());
        
//        System.out.println( game.getWattsBalance());
//
//        shop.buyGift();
//        player.playGame();
//        game.update();
      System.out.println(pikachu.currentStatus());
    }




}
