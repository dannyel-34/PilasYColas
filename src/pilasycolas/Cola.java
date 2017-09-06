/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilasycolas;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Cola {

    //Atributos propios y privados
    private Object cola[];
    private int Final, Front, Max;

    //Constructor Vacio
    public Cola() {

    }

    public Cola(int N) {
        Max = N;//Se determina la capacidad maxima de cola 
        cola = new Object[Max];//Asignamos los espacios en la cola tipo objecto
        Final = Front = -1;//Final y Front se inicializan en -1, como referencia
        //a que no exisite datos en la cola
    }

    public boolean isEmpty() {
        if (Final == -1 && Front == -1) {
            JOptionPane.showMessageDialog(null, "...Pila Vacia...<<SUBDESBORDAMIENTO>>");
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (Final == Max - 1) {
            JOptionPane.showMessageDialog(null, "...Pila LLena...<<DESBORDAMIENTO>>");
            return true;
        } else {
            return false;
        }
    }

    public void push(Object dato) {
        if (isFull() == false) {
            Final += 1;
            cola[Final] = dato;

            if (Final == 0) {
                Front = 0;
            }
        }
    }

    public Object pop() {
        Object dato = 0;

        if (isEmpty() == false) {
            dato = cola[Front];
            cola[Front] = null;

            if (Front == Final) {
                Final = -1;
                Front = -1;
            } else {
                Front += 1;
            }
        }

        return dato;
    }
}
