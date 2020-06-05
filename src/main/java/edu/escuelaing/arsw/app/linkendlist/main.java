/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arsw.app.linkendlist;

import java.util.Iterator;

/**
 *
 * @author ceseg
 */
public class main {
   public static void main(String[] args) {
      LinkedList <String> l = new LinkedList <String>();
      l.add("John");
      l.add("Sara");
      l.add("Susan");
      l.add("Betty");
      l.add("Nathan");
      System.out.println("The LinkedList elements are: ");
      for (Iterator i = l.iterator(); i.hasNext();) {
         System.out.println(i.next());
      }
   }  
}
