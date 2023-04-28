/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2lab_test;

/**
 *
 * @author Aireen
 */
public class Node<T> {
    private T value;
    private String edgeName1;
    private String edgeName2;
    private Node<T> edgeNode1;
    private Node<T> edgeNode2;
    
    public Node(T value) {
        this.value = value;
    }
    
    public void setEdge1(String edgeName , Node<T> node) {
        this.edgeName1 = edgeName;
        this.edgeNode1 = node;
    }
    
    public void setEdge2(String edgeName , Node<T> node) {
        this.edgeName2 = edgeName;
        this.edgeNode2 = node;
    }
    
    public T getValue() {
        return this.value;
    }
    
    public void printEdgesAndNodes() {
        System.out.println("----------------------------");
        System.out.println(this.value.toString());
        if (this.edgeName1 != null & this.edgeNode1 != null) {
            System.out.println(" :" + this.edgeName1 + "->");
            System.out.println("   " + this.edgeNode1.getValue().toString());
        }
        if (this.edgeName2 != null & this.edgeNode2 != null) {
            System.out.println(" :" + this.edgeName2 + "->");
            System.out.println("   " + this.edgeNode2.getValue().toString());
        }
        System.out.println("----------------------------");
    }
    
    public Node<T> traverse(String edgeName) {
        if (edgeName.equals(this.edgeName1)) {
            return this.edgeNode1;
        } else if (edgeName.equals(this.edgeName2)) {
            return this.edgeNode2;
        } else {
            throw new IllegalArgumentException("Edge name not found.");
        }
    }
}
