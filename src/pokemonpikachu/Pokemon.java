/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemonpikachu;

import DataStructures.AVLTree;
import DataStructures.DynamicArray;

/**
 *
 * @author Santiago
 */
public class Pokemon {
    private String name;
    private String emotionalState;
    private int relationship;
    private AVLTree<Gift> giftsReceived;

    public Pokemon(String name) {
        this.name = name;
        this.emotionalState = "Normal";
        this.relationship = 0;
        this.giftsReceived = new AVLTree<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmotionalState() {
        return emotionalState;
    }

    public void setEmotionalState(String emotionalState) {
        this.emotionalState = emotionalState;
    }

    public int getRelationship() {
        return relationship;
    }

    public void setRelationship(int relationship) {
        this.relationship = relationship;
    }

    public AVLTree<Gift> getGiftsReceived() {
        return giftsReceived;
    }

    public void setGiftsReceived(AVLTree<Gift> giftsReceived) {
        this.giftsReceived = giftsReceived;
    }

    public void addGift(Gift gift) {
        giftsReceived.insert(gift, gift.getCost(), gift);
    }

    public void increaseRelationship(int effect) {
        relationship += effect;
    }
}
