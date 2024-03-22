// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Para auxiliar o Sr. Aboo, codifique um programa que leia o valor da compra de um produto de informática e imprima a porcentagem do lucro e o valor da venda.  O programa deve exibir a mensagem "Lojinha do Sr. Aboo" e em seguida solicitar o valor da compra com o fornecedor, e, em seguida, exibir qual será a porcentagem de lucro e o valor que o item deve ser colocado para venda.

import java.util.Scanner;

public class QUESTAO10 {
  public static void main(String[] args) {

    Scanner enterScanner =  new Scanner (System.in);

    double valorCompra;
    double valorVenda; 
    
    System.out.println("Lojinha do Sr. Aboo");
    System.out.println("Informe o valor da compra ");
    valorCompra = enterScanner.nextDouble();

    if(valorCompra < 10){
    
    valorVenda = valorCompra + (valorCompra * 0.7);
      System.out.println("O valor da venda será de R$" + valorVenda +" com um lucro de 70% para o senhor Aboo ");
      
    }else if(valorCompra >=10 && valorCompra < 30){
      
    valorVenda = valorCompra + (valorCompra * 0.5);
      System.out.println("O valor da venda será de R$" + valorVenda +" com um lucro de 50% para o senhor Aboo");
    }else if (valorCompra >= 30 && valorCompra < 50){
      
      valorVenda = valorCompra + (valorCompra * 0.4);
      System.out.println("O valor da venda será de R$"+ valorVenda +" com um lucro de 40% para o senhor Aboo");
    }else if (valorCompra >= 50){
      
      valorVenda = valorCompra + (valorCompra * 0.3);
      System.out.println("O valor da venda sera de R$"+ valorVenda +" com um lucro de 30% para o senhor Aboo");
    }
  enterScanner.close();
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}