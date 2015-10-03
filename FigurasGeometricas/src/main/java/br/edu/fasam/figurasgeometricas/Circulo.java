/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasam.figurasgeometricas;

/**
 *
 * @author Fausto
 */
public class Circulo  {

    private double raio;
    private double area;
    private double perimetro;
    
    //Ola mundo
    public Circulo(){
        
    }
    //OLa Mundo
    public Circulo(int i) {
       this.raio = i;
    }
        
    public double calcularArea (){
        
        this.area = 3.141516*raio*raio;
        return this.area;
    }
     double calcularPerimetro (){
        
        this.perimetro = 2*3.141516*this.raio;
        return this.perimetro;
    }  
}
