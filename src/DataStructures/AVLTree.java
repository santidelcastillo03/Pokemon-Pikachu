/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

import java.util.function.Consumer;

/**
 *
 * @author santiagodelcastillo
 * @param <T>
 */
public class AVLTree<T> {
    private AVLNode<T> root;

    private int height(AVLNode<T> N) {
        if (N == null)
            return 0;
        return N.height;
    }

    private int max(int a, int b) {
        return (a > b) ? a : b;
    }

    private AVLNode<T> rightRotate(AVLNode<T> node) {
       
    if (node.getLeft() == null) {
        // Perform a single rotation
        return node.getRight();
    }
    AVLNode<T> l = node.getLeft();
    AVLNode<T> c = l.getRight();
    l.setRight(node);
    node.setLeft(c);
    updateHeight(node);
    updateHeight(l);
    return l;
}

private AVLNode<T> leftRotate(AVLNode<T> node) {
   
    if (node.getRight() == null) {
        // Perform a single rotation
        return node.getLeft();
    }
    AVLNode<T> r = node.getRight();
    AVLNode<T> c = r.getLeft();
    r.setLeft(node);
    node.setRight(c);
    updateHeight(node);
    updateHeight(r);
    return r;
}

    private int getBalance(AVLNode<T> N) {
        if (N == null)
            return 0;
        return height(N.left) - height(N.right);
    }

    /**
     *
     * @param key
     * @param data
     */
    public void addLeaf(int key, T data) {
        root = insert(this.root, key, data);
    }

    /**
     *
     * @param node
     * @param key
     * @param data
     * @return
     */
    public AVLNode<T> insert(AVLNode<T> node, int key, T data){
        if (node == null){
            AVLNode<T> a = new AVLNode(key, data);
            System.out.println("nuevo nodo");
            return a;
        }
        if (key < node.key){
            node.setLeft(insert(node.getLeft(), key, data));
        }
        else if (key > node.key){
            node.setRight(insert(node.getRight(), key, data));
        }else if(key == node.key && data.equals(node.getData())){
            int qty = node.getQty() +1;
            node.setQty(qty);
        }else{
            return node;
        }
        updateHeight(node);
        return rotate(node);
    }
    
    private void updateHeight(AVLNode<T> node){
        int a = height(node.getLeft());
        int b = height(node.getRight());
        int maxHeight = Math.max(a, b);
        node.setHeight(maxHeight +1);
    }
    
    private AVLNode<T> rotate(AVLNode<T> node){

        int balance = getBalance(node);

        if (balance > 1){
            if (getBalance(node.getLeft()) < 0){
                node.setLeft(leftRotate(node.getLeft()));
            }
            
           return rightRotate(node);
        }

        if (balance < -1){
            if (getBalance(node.getRight()) > 0){
                node.setRight(rightRotate(node.getRight()));
            }
           
           return leftRotate(node);
        }
        return node;
    }

    /**
     *
     * @return
     */
    public AVLNode<T> getRoot() {
        return root;
    }

    /**
     *
     * @param root
     */
    public void setRoot(AVLNode<T> root) {
        this.root = root;
    }
    
    /**
     *
     * @param key
     * @return
     */
    public AVLNode<T> search(int key) {
    AVLNode<T> current = root;
    while (current != null) {
        if (key < current.key) {
            current = current.left;
        } else if (key > current.key) {
            current = current.right;
        } else {
            return current;
        }
    }
    return null;
}
    
    /**
     *
     * @param key
     * @param data
     */
    public void delete(int key, T data) {
        root = deleteNode(root, key, data);
    }

    private AVLNode<T> deleteNode(AVLNode<T> node, int key, T data){
        if (node == null){
            return null;
        }
        if (key < node.key){
            node.setLeft(deleteNode(node.getLeft(), key, data));
        }
        else if (key > node.key){
            node.setRight(deleteNode(node.getRight(), key, data));
        }else{
            if (node.left == null || node.right == null) {
                AVLNode temp = (node.left != null) ? node.left : node.right;
                if (temp == null)
                    temp = node;
                node = null;
                return temp;
        }
            AVLNode temp = minValueNode(node.right);
            node.key = temp.key;
            node.right = deleteNode(node.right, temp.key, (T) temp.getData());
        }
        updateHeight(node);
        return rotate(node);
    }
    
    /**
     *
     * @param node
     * @return
     */
    public AVLNode minValueNode(AVLNode node) {
        AVLNode current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }
    
    /**
     *
     * @param consumer
     */
    public void inOrderTraversal(Consumer<T> consumer) {
        inOrderTraversal(root, consumer);
    }

    private void inOrderTraversal(AVLNode<T> node, Consumer<T> consumer) {
        if (node != null) {
            inOrderTraversal(node.getLeft(), consumer);
            consumer.accept(node.getData());
            inOrderTraversal(node.getRight(), consumer);
        }
    }
    
    private int size(AVLNode<T> node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + size(node.getLeft()) + size(node.getRight());
        }
    }

    /**
     *
     * @return
     */
    public int size() {
        return size(root);
    }

    private T get(AVLNode<T> node, int key) {
        if (node == null) {
            return null;
        } else if (key < node.key) {
            return get(node.getLeft(), key);
        } else if (key > node.key) {
            return get(node.getRight(), key);
        } else {
            return node.getData();
        }
    }

    /**
     *
     * @param key
     * @return
     */
    public T get(int key) {
        return get(root, key);
    }

}
