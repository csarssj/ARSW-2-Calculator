/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arsw.app.calculator;



import edu.escuelaing.arsw.app.linkendlist.LinkedList;

/**
 * Operaciones necesarias para calcular la media y la desviación estandar.
 *
 * @author ceseg
 */
public class Calculator {
	public Calculator (){}
	/**
	 * Este metodo permite calcular la media de una lista
     * @param e// este es de tipo LinkedList
	 * @return double
	 */
    public Double Mean( LinkedList<Double> e){
        Double mean;
        double c = 0;
        for(Double data : e){
            c += data;
        }
        mean = c / e.size();
        return mean;
     
    }


    /**
	 * Este metodo permite calcular la Desviacion de una lista
     * @param e// este es de tipo LinkedList
	 * @return double
	 */
    public Double deviation(LinkedList<Double> e){
    	Double deviation;
    	double c = 0;
        double mean = Mean(e);
        for(Double data : e){
            c += Math.pow((data - mean),2);
        }
        deviation = Math.sqrt((c / (e.size() - 1)));
        return deviation;
    }
    
}
