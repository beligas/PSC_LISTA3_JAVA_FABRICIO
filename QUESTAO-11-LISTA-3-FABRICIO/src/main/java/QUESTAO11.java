// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Crie um programa para exibir o menu de um caixa eletrônico. Ele deve possuir as opções: Exibir saldo, Exibir extrato, Realizar depósito, Realizar saque, e Sair. Se alguma opção inválida for fornecida, exiba uma mensagem de erro e saia do programa. Observação: Utilize a estrutura de seleção Switch/Case para implementar seu produto. Utilize números inteiros para indicar cada opção.

import java.util.Scanner;

public class QUESTAO11 {
  public static void main(String[] args) {

    Scanner enterScanner = new Scanner(System.in);

    int opcao = 0;
    int deposito;
    int saque;
    
    System.out.println("Bem vindo ao caixa eletronico, digite a opção desejada");
    System.out.println(" 1 - Exibir saldo\n 2 - Exibir extrato \n 3 - Realizar deposito \n 4 - Realizar saque \n 5 - Sair");
    opcao = enterScanner.nextInt();  

    switch(opcao){
      case 1 :
        System.out.println("Seu saldo no momento é de R$1000,00");
        break;

    
      case 2 :
        System.out.println("Seu extrato no momento é de R$1000,00");
        break;


      case 3: 
        System.out.println("Digite o valor que deseja depositar");
        deposito = enterScanner.nextInt();
        System.out.println("Deposito realizado com sucesso");
        break;


      case 4:
      System.out.println("Digite o valor que deseja sacar");
      saque = enterScanner.nextInt();
        System.out.println("Saque realizado com sucesso");

        break;


      case 5:
      System.out.println("Saindo do programa");
        break;

      default:
        System.out.println("Opção inválida");
        break;
    }
    
    
    enterScanner.close();
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}