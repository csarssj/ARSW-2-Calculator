/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arsw.app.calculator;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

import edu.escuelaing.arsw.app.linkendlist.LinkedList;



/**
 * Lee los archivos ingresados por el usuario e imprime la media y desviación estandar. (La lectura se hace por columnas).
 *
 *
 * @author ceseg
 */
public class Reader {
	static Calculator calculator;
	static Double mean;
	static Double mean2;
	static Double deviation;
	static Double deviation2;
	public Reader () {
		calculator = new Calculator();
		mean = new Double (0);
		mean2 = new Double (0);
		deviation = new Double (0);
		deviation2  = new Double (0);
	}
	public static  void readFile(File file) {
		LinkedList <Double> column1 = new LinkedList <Double>();
		LinkedList <Double> column2 = new LinkedList <Double>();
		LineNumberReader  ln = null;
		try {
			FileReader f = new FileReader (file);
			ln = new LineNumberReader(f);
			String line = null;
			while((line = ln.readLine())!=null) {
				String[] par = line.split(" ");
				Double first = Double.parseDouble(par[0]);
				Double second = Double.parseDouble(par[1]);
				column1.add(first);
				column2.add(second);
			}
			ln.close();
			mean = calculator.Mean(column1);
			deviation = calculator.deviation(column1);
			mean2 = calculator.Mean(column2);
			deviation2 = calculator.deviation(column2);
			System.out.println("La media es: "+String.format("%.2f", mean)+" con una desviación de: " +String.format("%.2f", deviation));
			System.out.println("La media es: "+String.format("%.2f", mean2)+" con una desviación de: " +String.format("%.2f", deviation2));
		} catch (IOException e) {
			System.err.format("IOException: %s%n", e);
		}
		
	}
	public static Double getMean() {
		return mean;
	}
	public static Double getMean2() {
		return mean2;
	}
	public static Double getDeviation() {
		return deviation;
	}
	public static Double getDeviation2() {
		return deviation2;
	}
}
