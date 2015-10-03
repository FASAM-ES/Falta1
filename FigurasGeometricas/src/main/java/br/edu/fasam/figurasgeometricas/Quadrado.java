/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasam.figurasgeometricas;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import java.util.Scanner;


 public class Quadrado {
      
    private double lado;
    //private double area;   
    
    public Quadrado(){
        
    }

    public Quadrado(double lado) {
        this.lado = lado;
    }
    
     public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    public double calcularArea (){
        return Math.pow(this.getLado(), 2);
    }
    public double CalcularPerimetro(){
        return this.getLado() * 4;
    }
 }