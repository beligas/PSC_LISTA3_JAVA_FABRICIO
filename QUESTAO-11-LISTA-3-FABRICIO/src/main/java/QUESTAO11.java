

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

  
}
