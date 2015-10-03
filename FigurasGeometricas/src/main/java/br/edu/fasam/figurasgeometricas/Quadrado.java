/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasam.figurasgeometricas;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import java.util.Scanner;


 public class Quadrado {
      
    private double lado;
    public double area;
    public double perimetro;
    
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
        this.area = Math.pow(this.getLado(), 2);
        return this.area;
    }
    public double CalcularPerimetro(){
        this.perimetro = this.getLado() * 4;
        return this.perimetro;
    }
 }