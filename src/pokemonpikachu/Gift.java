/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemonpikachu;

/**
 *
 * @author Santiago
 */
public class Gift implements Comparable<Gift> {
    private String name;
    private int cost;
    private int relationshipEffect;

    /**
     *
     * @param name
     * @param cost
     * @param relationshipEffect
     */
    public Gift(String name, int cost, int relationshipEffect) {
        this.name = name;
        this.cost = cost;
        this.relationshipEffect = relationshipEffect;
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
    public int getCost() {
        return cost;
    }

    /**
     *
     * @param cost
     */
    public void setCost(int cost) {
        this.cost = cost;
    }

    /**
     *
     * @return
     */
    public int getRelationshipEffect() {
        return relationshipEffect;
    }

    /**
     *
     * @param relationshipEffect
     */
    public void setRelationshipEffect(int relationshipEffect) {
        this.relationshipEffect = relationshipEffect;
    }

    /**
     *
     * @param other
     * @return
     */
    @Override
    public int compareTo(Gift other) {
        return Integer.compare(this.cost, other.cost);
    }
}
