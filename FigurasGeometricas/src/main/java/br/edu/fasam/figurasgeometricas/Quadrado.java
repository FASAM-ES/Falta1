/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasam.figurasgeometricas;

import java.util.Scanner;


 public class Quadrado {
    
    Scanner entrada = new Scanner(System.in);
    double lado, area, perimetro;
    
    
    double calcularArea (){
        
        area = lado*lado;
        
        return area;
    }
     double calcularPerimetro (){
        
        perimetro = 4*lado;
        
        return perimetro;
    }
     
    void imprimir(){
        
        System.out.println("O quadrado de lado: "
                +lado+"\n Área: "+calcularArea()
                +"\nPerimetro: "+calcularPerimetro());
    }
 }