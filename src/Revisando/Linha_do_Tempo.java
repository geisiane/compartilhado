/*
 Escreva um algoritimo que leia o ano do nascimento de uma pessoa e apresente uma linha do tempo,
 mostrando cada ano de vida de uma pessoa e quantos anos ela tinha em cada até o ano atual;
 */
package Revisando;

import java.util.Scanner;

public class Linha_do_Tempo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);//system.in significa uma entrada do sistema;

        int idade, anoNascimento, anoAtual, mes, cont;
        
        System.out.println("Digite o mês do seu nasimento");
        mes=teclado.nextInt();

        System.out.println("Digite o ano de seu nascimento");
        anoNascimento = teclado.nextInt();//o nextint armazena a entrada do usuario via teclado;
        
        System.out.println("Digite o ano atual");
        anoAtual = teclado.nextInt();
        
        System.out.println("Linha do tempo");
        System.out.println("Ano - Idade");
        
        for (cont=anoNascimento,idade=0;cont<=anoAtual;cont++,idade++){
        System.out.println(cont+ " - "+idade);
        
    }
        
    }

}
