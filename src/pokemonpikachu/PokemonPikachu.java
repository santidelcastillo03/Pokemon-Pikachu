/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pokemonpikachu;

/**
 *
 * @author Santiago
 */
public class PokemonPikachu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game game = new Game();

        GamePlayer player = new GamePlayer(game);
        Pokemon pikachu = new Pokemon("Pikachu");
           game.getPokemons().add(pikachu);
        SoundPlayer sound = new SoundPlayer();
        sound.playSound("src/Sounds/1-17 Battle! Trainer.wav");
        game.update();
        pikachu.setRelationship(1000);
        game.setWattsBalance(3000);


        Shop shop = new Shop(game);

        shop.buyGift();

        System.out.println( pikachu.getRelationship());
        System.out.println( game.getWattsBalance());

        System.out.println("Pikachu's gifts:");
        System.out.println(pikachu.getGiftsReceived());

        player.playGame();
        game.update();
        System.out.println( game.getWattsBalance());
    }




}
