/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ProgramaMedia.ProgramaMedia;

import java.util.Scanner;
/**
 *
 * @author Jefferson
 */
public class ProgramaMedia {
/* Média Condição Simples  */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.print("Segunda nota: ");
        float n2 = teclado.nextFloat();
        float m = (n1+n2)/2;
        System.out.println("Sua média foi " + m);
        if (m>6.99) { 
            System.out.println("Aprovado, Parabéns !!! ");}
        if (m<7) {
            System.out.println("Reprovado");
        } 
        /*Depois de escrever a primeira e a segunda nota se a nota for maior que 
        6,99 aparecerá a mensagem: Aprovado, Parabéns !!!, se não aparecerá 
        Reprovado  */
    }
}
