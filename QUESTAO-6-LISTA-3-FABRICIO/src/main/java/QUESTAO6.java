// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Escreva um programa que peça ao usuário que insira um número de 1 a 4, correspondendo a cada estação do ano (1 para Primavera, 2 para Verão, 3 para Outono, e 4 para Inverno) para identificar a estação escolhida e imprimir uma mensagem característica daquela estação.

import java.util.Scanner;

public class QUESTAO6 {
  static Scanner enterScanner = new Scanner(System.in);
  static int estacao;

  public static void main(String[] args) {
    System.out.println("Informe uma estação do ano");
    System.out.println(" 1 - Primavera \n 2 - Verao \n 3 - Outono \n 4 - Inverno");
    estacao = enterScanner.nextInt();

    switch(estacao) {
      case 1:
        System.out.println("A estação da Primavera as plantas começam a ter flores");
        break;
      case 2:
        System.out.println("A estação do Verao é muito calor");
        break;
      case 3:
        System.out.println("A estação do Outono as plantas comecam a perder suas folhas");
        break;
      case 4:
        System.out.println("A estação do Inverno é muito frio");
        break;
      default:
        System.out.println("Estação inválida");
        break;
    }
    enterScanner.close();
  }
}

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
