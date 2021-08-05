/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author alejo
 */
public class Calculadora {
    /**
     * @param num1
     * @param num2
     * @return la suma de num1 y num2.
     */
    public double suma(double num1, double num2) {
        return num1 + num2;
    }
    /**
     * @param num1
     * @param num2
     * @return la resta entre num1 y num2.
     */
    public double resta(double num1, double num2) {
        return num1 - num2;
    }

    /**
     *
     * @param num1
     * @param num2
     * @return
     */
    public double multiplicacion(double num1, double num2) {
        return num1 * num2;
    }
    /**
     * @param num1
     * @param num2
     * @return num1 / num2, si num2 es diferente de 0 
     */
    public double division(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        else {
            return Double.NaN;
        }
    }
}
