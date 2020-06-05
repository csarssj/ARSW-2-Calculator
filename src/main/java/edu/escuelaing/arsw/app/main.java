/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arsw.app;

import java.io.File;


import edu.escuelaing.arsw.app.calculator.Reader;

/**
 *
 *
 * @author ceseg
 */
public class main {
   public static void main(String[] args) {
	  Reader a = new Reader();
	  File file = new File(args[0]);
	  Reader.readFile(file);
   }  
}
