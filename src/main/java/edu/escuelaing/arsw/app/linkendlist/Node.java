/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arsw.app.linkendlist;

/**
 * Nodos utilizados por las Linked List
 *
 * @author ceseg
 */
public class Node <E> {
            E data; 
            Node<E> next;
            
        public Node(E d) 
        { 
            data = d; 
            next = null; 
        } 
        public Node(E d, Node<E> next) 
        { 
            data = d; 
            next = null; 
        } 
        
}
