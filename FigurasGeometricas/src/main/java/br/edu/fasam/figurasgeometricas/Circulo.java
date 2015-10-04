/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasam.figurasgeometricas;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Circulo  {

    double raio, area, perimetro;
    //Ola mundo
    public Circulo(){
        
    }
    public Circulo(int i) {
       this.raio = i;
    }
        
    public double calcularArea (){
        
        area = 3.141516*raio*raio;
        
        return area;
    }
     double calcularPerimetro (){
        
        perimetro = 2*3.141516*raio;
        
        return perimetro;
    }  
}
