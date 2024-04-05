/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemonpikachu;

import javax.swing.JFileChooser;
import java.io.*;
/**
 *
 * @author Santiago
 */
public class GameIO {
    private Game game;

    /**
     *
     * @param game
     */
    public GameIO(Game game) {
        this.game = game;
    }

    /**
     *loads the game object
     * @author Santiago del Castillo
     * @return
     */
    public Game loadGame() {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            String filePath = fileChooser.getSelectedFile().getPath();
            try {
                FileInputStream fileStream = new FileInputStream(filePath);
                ObjectInputStream objectStream = new ObjectInputStream(fileStream);

                game = (Game) objectStream.readObject();

                objectStream.close();
                fileStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return game;
    }

    /**
     *saves the game object
     * @author Santiago del Castillo
     */
    public void saveGame() {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showSaveDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            String filePath = fileChooser.getSelectedFile().getPath();
            try {
                FileOutputStream fileStream = new FileOutputStream(filePath);
                ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);

                objectStream.writeObject(game);

                objectStream.close();
                fileStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
