/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dia2;

import java.util.Scanner;

/**
 *
 * @author reate
 */
public class ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //acentos en java
        System.out.println("Albac\u00e1"+"\t"+"\u00edtalo"+"\t"+"\u00f1a\u00f1o");
        System.out.println("\u00c1bacp"+"\t"+"\u00eddolo"+"\t"+"\u00daandu");
        System.out.println("\u00c1rbol"+"\t"+"\u00ednter"+"\t"+"\u00f1o\u00f1o");
        System.out.println("\u00c1caro"+"\t"+"\u00edbero"+"\t"+"pa\u00f1uelo");
        System.out.println("\n");
        //abecedario en java
        System.out.println("Esto es una tabla de abecedario en min\u00fasculas");
        System.out.println("\t"+"a"+"\t"+"b"+"\t"+"c"+"\t"+"d");
        System.out.println("\t"+"e"+"\t"+"f"+"\t"+"g"+"\t"+"h");
        System.out.println("\t"+"i"+"\t"+"j"+"\t"+"k"+"\t"+"l");
        System.out.println("\t"+"m"+"\t"+"n"+"\t"+"\u00f1"+"\t"+"o");
        System.out.println("\t"+"p"+"\t"+"q"+"\t"+"r"+"\t"+"s");
        System.out.println("\t"+"t"+"\t"+"u"+"\t"+"v"+"\t"+"w");
        System.out.println("\t"+"x"+"\t"+"y"+"\t"+"z");
        
        System.out.println("\n");
        //numero positivo o negativo
        Scanner n = new Scanner(System.in);
            System.out.println("INGRESE UN NUMERO");
             int numero = n.nextInt();
               if(numero<0){
                   System.out.println(""+numero+"Es Negativo");
               }
               else
                System.out.println(""+numero+"Es positivo");
        
        
    }
}
