/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemonpikachu;

import DataStructures.AVLNode;
import DataStructures.AVLTree;
import DataStructures.DynamicArray;

/**
 *
 * @author Santiago
 */
public class Pokemon {
    private String name;
    private static Pokemon pikachuInstance = null;
    private static Pokemon pachirisuInstance = null;
    private String emotionalState;
    private int relationship;
    AVLTree<Gift> giftsReceived;
    DynamicArray<AVLNode<Gift>> listGifts;

    /**
     *
     * @return
     */
    public DynamicArray<AVLNode<Gift>> getListGifts() {
        return listGifts;
    }

    /**
     *
     * @param listGifts
     */
    public void setListGifts(DynamicArray<AVLNode<Gift>> listGifts) {
        this.listGifts = listGifts;
    }

    /**
     *
     * @param name
     */
    public Pokemon(String name) {
        this.name = name;
        this.emotionalState = "Normal";
        this.relationship = 0;
        this.giftsReceived = new AVLTree<>();
        this.listGifts = new DynamicArray<AVLNode<Gift>>();
    }

    /**
     *
     * @param name
     * @return
     */
    public static Pokemon getInstance(String name) {
        if (name.equals("Pikachu")) {
            if (pikachuInstance == null) {
                pikachuInstance = new Pokemon(name);
            }
            return pikachuInstance;
        } else if (name.equals("Pachirisu")) {
            if (pachirisuInstance == null) {
                pachirisuInstance = new Pokemon(name);
            }
            return pachirisuInstance;
        }
        return null;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getEmotionalState() {
        return emotionalState;
    }

    /**
     *
     * @param emotionalState
     */
    public void setEmotionalState(String emotionalState) {
        this.emotionalState = emotionalState;
    }

    /**
     *
     * @return
     */
    public int getRelationship() {
        return relationship;
    }

    /**
     *
     * @param relationship
     */
    public void setRelationship(int relationship) {
        this.relationship = relationship;
    }

    /**
     *@author Vicente Tralci
     * @return
     */
    public AVLTree<Gift> getGiftsReceived() {
        return giftsReceived;
    }

    /**
     *@author Vicente Tralci
     * @param giftsReceived
     */
    public void setGiftsReceived(AVLTree<Gift> giftsReceived) {
        this.giftsReceived = giftsReceived;
    }

    /**
     *@author Vicente Tralci
     * @param gift
     */
    public void addGift(Gift gift) {
        giftsReceived.addLeaf(gift.getCost(), gift);

    }

    /**
     *
     * @param effect
     */
    public void increaseRelationship(int effect) {
        relationship += effect;
        if (relationship > 10000) {
            relationship = 10000;
        }

        if (relationship >= 0 && relationship < 2000) {
            emotionalState = "Sigh";
        } else if (relationship >= 2000 && relationship < 4000) {
            emotionalState = "Angry";
        } else if (relationship >= 4000 && relationship < 6000) {
            emotionalState = "Normal";
        } else if (relationship >= 6000 && relationship < 8000) {
            emotionalState = "Happy";
        } else if (relationship >= 8000 && relationship <= 10000) {
            emotionalState = "Inspired";
        }
    }

    /**
     *@author Vicente Tralci
     * @param root
     */
    public void listGiftsReceived(AVLNode<Gift> root) {
        if (root == null) {
            return;
        }

        if(root.getLeft() !=null){
        listGiftsReceived(root.getLeft());
        }

        if(root.getData() !=null){
            System.out.println("regalo: "+root.getData().getName());
            listGifts.add(root);
        }
        if(root.getRight() !=null){
            listGiftsReceived(root.getRight());
        }

}

    /**
     *@author Vicente Tralci
     * @return
     */
    public String currentStatus() {
        StringBuilder infoSB = new StringBuilder();
        infoSB.append("Relación: \n" + relationship + "\n");
        infoSB.append("Estado emocional: \n" + emotionalState + "\n");
        listGifts = new DynamicArray();
        listGiftsReceived(giftsReceived.getRoot());
        for (AVLNode<Gift> gift : listGifts) {
            infoSB.append(gift.getData().getName()+" " + gift.getQty() + "\n");
        }
        String info = infoSB.toString();
        return info;
    }
}

