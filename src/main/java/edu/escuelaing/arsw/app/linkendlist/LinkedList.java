/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arsw.app.linkendlist;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Implementación de las Linked List 
 *
 * @author ceseg
 */
public class LinkedList<E> implements List<E> {

    int size;
    Node<E> first;
    Node<E> last;

    public LinkedList() {
        first = null;
        last = null;
        size = 0;
    }
    /**
     * Permite agregar un objeto de cualquier ripo a la lista
     * 
     * @param E item dato a agregar.
     */
    public boolean add(E item) {
        if (!isEmpty()) {
            Node <E> prev = last;
            last = new Node<E>(item, null);
            prev.next = last;
        } else {
            last = new Node<E>(item, null);
            first = last;
        }
        size++;
        return true;
    }

    /**
     * Elimina un objeto de la lista
     * 
     * @param Object item a remover
     */
    public boolean remove(Object item) {
        boolean result = false;
        Node<E> prev = first;
        Node<E> curr = first;
        while (curr.next != null || curr == last) {
            if (curr.data.equals(item)) {
                // Elimina el unico elemento en la lista
                if (size == 1) {
                    first = null;
                    last = null;
                } // Elimina el primer elemento
                else if (curr.equals(first)) {
                    first = first.next;
                } // Elimina el ultimo elemento
                else if (curr.equals(last)) {
                    last = prev;
                    last.next = null;
                } // Elimina elemento
                else {
                    prev.next = curr.next;
                }
                size--;
                result = true;
                break;
            }
            prev = curr;
            curr = prev.next;
        }
        return result;
    }

    public Iterator<E> iterator() {
        return new Iterator<E>() {

            Node<E> current = first;

            public boolean hasNext() {
                return current != null;
            }

            public E next() {
                if (hasNext()) {
                    E data = current.data;
                    current = current.next;
                    return data;
                }
                return null;
            }

            public void remove() {
                throw new UnsupportedOperationException("Remove not implemented.");
            }

        };

    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (E item : this) {
            s.append(item + " ");
        }
        return s.toString();
    }


    public boolean contains(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean addAll(Collection<? extends E> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean addAll(int index, Collection<? extends E> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public E get(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public E set(int index, E element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void add(int index, E element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public E remove(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int indexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ListIterator<E> listIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ListIterator<E> listIterator(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<E> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
