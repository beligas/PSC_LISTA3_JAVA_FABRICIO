// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Escreva um programa em Java para ler as notas da 1ª, 2ª e  3ª avaliações de um aluno. Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado (considerar que média igual ou maior que 7 o aluno é aprovado). Escrever também a média calculada.

import java.util.Scanner;

public class QUESTAO2 {
  public static void main(String[] args) {

    Scanner enterScanner = new Scanner (System.in);
    double nota1;
    double nota2;
    double nota3;
    double media;
    
  System.out.println("Digite as notas do aluno:");
    nota1 = enterScanner.nextDouble();
    nota2 = enterScanner.nextDouble();
    nota3 = enterScanner.nextDouble();

    media = (nota1 + nota2 + nota3) / 3;

    if (media >= 7){
      System.out.printf("O aluno foi aprovado com media %.2f\n ", media);
    } else{
      System.out.printf("O aluno foi reprovado, sua media foi %.2f\n ", media);
    }     
      enterScanner.close();
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}