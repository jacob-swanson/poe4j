package com.swandiggy.poe4j.util.collection;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

/**
 * Tree node data structure.
 *
 * @author Jacob Swanson
 * @since 9/4/2015
 */
@Data
public class Node<T> {
    private T data;
    private Node<T> parent;
    private Set<Node<T>> children = new HashSet<>();

    public Node(T data) {
        this.data = data;
    }

    public void addChild(Node<T> node) {
        children.add(node);
    }
}
