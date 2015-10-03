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

    Scanner entrada = new Scanner(System.in);
    double raio, area, perimetro;

    public Circulo(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    public double calcularArea (){
        
        area = 3.141516*raio*raio;
        
        return area;
    }
     double calcularPerimetro (){
        
        perimetro = 2*3.141516*raio;
        
        return perimetro;
    }
    
 void imprimir(){
        
        System.out.println("O círculo de raio: "
                +raio+"\nÁrea: "+calcularArea()
                +"\nPerimetro: "+calcularPerimetro());
    }
    
    void construtor(){
        
        System.out.println("Informe do valor do raio do círculo");
        raio = entrada.nextDouble();
       
    }
    
}
