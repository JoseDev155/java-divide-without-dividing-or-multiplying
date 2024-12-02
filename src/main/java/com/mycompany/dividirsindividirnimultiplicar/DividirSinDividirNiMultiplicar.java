/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dividirsindividirnimultiplicar;

/**
 *
 * @author Jose Ramos
 */
public class DividirSinDividirNiMultiplicar {

    public static void main(String[] args) {
        int dividendo = 31;
        int divisor = 5;
        int cociente = getCociente2(dividendo, divisor);
        int residuo = getResiduo2(dividendo, divisor);
        
        System.out.println("Cociente = " + cociente);
        System.out.println("Residuo = " + residuo);
    }

    private static int getCociente2(int dividC, int divisC) {
        int coci = 0;
        
        while(dividC >= divisC) {
            dividC -= divisC;
            coci++;
        }
        
        return coci;
    }

    private static int getResiduo2(int dividR, int divisR) {
        int resi = 0;
        
        while(dividR >= divisR) {
            dividR -= divisR;
            resi = dividR;
        }
        
        return resi;
    }
}
