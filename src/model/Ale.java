/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.PrintStream;
import java.util.ArrayList;
import vista.vista;

/**
 *
 * @author xSYN
 */
public class Ale extends vista{
    
    
    private int valorInicial;
    private int valorFinal;
    private ArrayList listaNumero;
    private PrintStream out = null;//Stream para el Debbugging(println)...

    
    public Ale(int valorInicial, int valorFinal) {
        this.valorInicial = valorInicial;
        this.valorFinal = valorFinal;
        listaNumero = new ArrayList();
    }

    private int numeroAleatorio() {
        return (int) (Math.random() * (valorFinal - valorInicial + 1) + valorInicial);
    }

    public int generar() {
        if (listaNumero.size() < (valorFinal - valorInicial) + 1) {
            //Aun no se han generado todos los numeros
            int numero = numeroAleatorio();//genero un numero
            if (listaNumero.isEmpty()) {//si la lista esta vacia
                listaNumero.add(numero);
                return numero;
            } else {//si no esta vacia
                if (listaNumero.contains(numero)) {//Si el numero que generé esta contenido en la lista
                    return generar();//recursivamente lo mando a generar otra vez
                } else {//Si no esta contenido en la lista
                    listaNumero.add(numero);
                    return numero;
                }
            }
        } else {// ya se generaron todos los numeros
            return -1;
        }
    }
}
