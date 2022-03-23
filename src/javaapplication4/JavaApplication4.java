/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;
import java.util.Scanner; 


/**
 *
 * @author ALUNO
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int anos, meses, dias, soma, total;
        
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite numero de anos");
        anos = leia.nextInt();
        System.out.print("Digite o numero de meses");
        meses = leia.nextInt();
        System.out.print("Digite o numero de dias");
        dias= leia.nextInt();
        
        soma = (anos*365) + (meses*30) + dias;
        
        System.out.print(soma);
        
        
        
    
    }
}
