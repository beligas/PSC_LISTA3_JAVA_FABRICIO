// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Crie um programa capaz de ler a idade de uma pessoa e imprimir sua classificação eleitoral. Entrada: QUAL A IDADE DA PESSOA?: 17
// Saída: ELEITOR FACULTATIVO

import java.util.Scanner;

public class QUESTAO9 {
  public static void main(String[] args) {
    Scanner enterScanner = new Scanner(System.in);

    int idade;
      
    System.out.println("Informe sua idade");
    idade = enterScanner.nextInt();

    if(idade < 16){

      System.out.println("Voce não é eleitor");
    } else if( idade >= 16 && idade <= 17){

      System.out.println("Voce é um eleitor facultativo");
    }else if(idade >=18 && idade <= 65){

      System.out.println("Voce é um eleitor obrigatorio");
    }else if (idade > 65){
      
      System.out.println("Voce é um eleitor facultativo");
    }
    enterScanner.close();
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}