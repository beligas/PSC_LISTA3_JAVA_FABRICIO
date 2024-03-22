// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Crie um algoritmo que leia dois números e exiba o resultado da divisão entre eles. O algoritmo deverá seguir todas as regras da divisão de números reais.

import java.util.Scanner;

public class QUESTAO1 {
  public static void main(String[] args) {

    Scanner enterScanner =  new Scanner(System.in);

      double numerador;
      double denominador;
     double resultado;
    
    System.out.println("Informe um numero e outro numero que ira dividi-lo ");
    numerador = enterScanner.nextDouble();
    denominador = enterScanner.nextDouble();

    if (denominador == 0){
      System.out.println("Não é possivel concluir a divisao, ela nao segue as regras da divisao de numeros reais");
    } else {
      resultado = numerador / denominador;
      System.out.println("O resultado da divisao é: " + resultado);
    }
    enterScanner.close();
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}