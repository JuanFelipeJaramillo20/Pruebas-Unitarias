/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpruebas;

/**
 *
 * @author juanf
 */
public class Punto9 {
    
    
    public int add(String text){
        int suma = 0;
        String[] tokens = text.split("[\\n,]");
        int[] numeros = new int[tokens.length];
        for(int i = 0 ; i < numeros.length ; i++){
            if(Integer.valueOf(tokens[i]) < 1000){
                numeros[i] = Integer.valueOf(tokens[i]);
            }else{
                numeros[i] = 0;
            }
            suma += numeros[i];
        }
        return suma;
    }
}
