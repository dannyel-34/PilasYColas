/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilasycolas;

/**
 *
 * @author Daniel P.Calle
 * Fecha: 05-09-2017
 * @version: 1.0
 * Descripcion: Implementacion de clase pila
 */

import javax.swing.JOptionPane;

public class Pila {

    private Object pila[];//Estrutura de la Pila utilizando un Vector
    private int top, max;//Variables axuliares para la pila

    //Constructor vacio
    public Pila() {
    }

    public Pila(int N) {
        max = N;
        pila = new Object[max];
        top = -1;
    }

    public boolean isEmpty() {
        if (top == -1) {
            JOptionPane.showMessageDialog(null, "...Pila Vacia...<<SUBDESBORDAMIENTO>>");
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (top == max - 1) {
            JOptionPane.showMessageDialog(null, "...Pila LLena...<<DESBORDAMIENTO>>");
            return true;
        } else {
            return false;
        }
    }

    public void push(Object dato) {
        if(isFull()== false){
            top+=1;
            pila[top]=dato;
        }
    }
    
    public Object pop(){
        Object dato=0;
        
        if(isEmpty()==false){
            dato=pila[top];
            pila[top]=null;
            top-=1;
        }
        
        return dato;
    }

}
