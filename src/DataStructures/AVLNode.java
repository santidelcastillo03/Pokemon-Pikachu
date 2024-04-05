/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;



/**
 *
 * @author santiagodelcastillo
 * @param <T>
 */
public class AVLNode<T> {
    int key;
    T data;
    int qty;
    int height;
    AVLNode<T> left, right;

    /**
     *
     * @param key
     * @param data
     */
    public AVLNode(int key, T data) {
        this.key = key;
        this.data = data;
        this.qty = 1;
        this.height = 1;
    }

    /**
     *
     * @return
     */
    public int getQty() {
        return qty;
    }

    /**
     *
     * @param qty
     */
    public void setQty(int qty) {
        this.qty = qty;
    }
    
    /**
     *
     * @return
     */
    public int getKey() {
        return key;
    }

    /**
     *
     * @param key
     */
    public void setKey(int key) {
        this.key = key;
    }

    /**
     *
     * @return
     */
    public T getData() {
        return data;
    }

    /**
     *
     * @param data
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     *
     * @return
     */
    public int getHeight() {
        return height;
    }

    /**
     *
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     *
     * @return
     */
    public AVLNode<T> getLeft() {
        return left;
    }

    /**
     *
     * @param left
     */
    public void setLeft(AVLNode<T> left) {
        this.left = left;
    }

    /**
     *
     * @return
     */
    public AVLNode<T> getRight() {
        return right;
    }

    /**
     *
     * @param right
     */
    public void setRight(AVLNode<T> right) {
        this.right = right;
    }
    
}