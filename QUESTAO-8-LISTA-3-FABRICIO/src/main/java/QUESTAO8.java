// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Você está trabalhando em uma startup voltada para educação, e ficou responsável por criar a lógica de uma das atividades. Seu programa deve receber o valor dos três lados de um triângulo, e informar se ele é equilátero, isósceles ou escaleno. Restrição: Em um triângulo, o comprimento de um lado é sempre menor do que a soma dos outros dois!

import java.util.Scanner;

public class QUESTAO8 {
  public static void main(String[] args) {

    Scanner enterScanner = new Scanner(System.in);

    double lado1;
    double lado2;
    double lado3;

    System.out.println("Digite o tamanho dos tres lados do triangulo");
    lado1 = enterScanner.nextDouble();
    lado2 = enterScanner.nextDouble();
    lado3 = enterScanner.nextDouble();

    if (lado1 == lado2 && lado1 == lado3) {

      System.out.println("Isso é um triângulo equilátero");

    } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
      System.out.println("Isso é um triângulo isósceles");

    } else {
      System.out.println("Isso é um triângulo escaleno");
    }

    enterScanner.close();
  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}