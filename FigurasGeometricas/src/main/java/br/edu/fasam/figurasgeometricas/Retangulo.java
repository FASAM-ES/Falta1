/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasam.figurasgeometricas;

import java.util.Scanner;

/**
 *Deivid
 * @author Aluno
 */ 
public class Retangulo {
    //construtor
    private Scanner entrada = new Scanner(System.in);
    
    private double area;
    private double perimetro;
    private double lado;
    private double comprimento;
    private double largura;
    
    public Retangulo(){
        
    }
    
    public Retangulo(double lado){
        this.lado = lado;
    }
        
    double calculoArea(){        
        area = comprimento * largura;
        return area;
    }
    double calculoPerimetro(){
        perimetro = (2 * comprimento) + (2 * largura);
        return perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }   
}