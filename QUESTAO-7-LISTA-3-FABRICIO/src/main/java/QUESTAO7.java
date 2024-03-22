// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;


// Escreva um programa em Java para ler: a descrição do produto (nome), a quantidade adquirida e o preço unitário. Calcular e escrever o total (total = quantidade adquirida * preço unitário), o desconto e o total a pagar (total a pagar = total - desconto), sabendo-se que:
// - Se quantidade <= 5, o desconto será de 2%
// - Se quantidade > 5 e quantidade <=10, o desconto será de 3%
// - Se quantidade > 10 e quantidade <30, o desconto será de 5%
// - Se quantidade >= 30 o desconto será de 10%

import java.util.Scanner;

public class QUESTAO7 {
  public static void main(String[] args) {

    Scanner enterScanner = new Scanner(System.in);

    int quant;
    double preco;
    String prod;
    double desc;
    double valTotal;
    double total;
    
    System.out.println("Digite o nome do produto que deseja comprar:\n Refrigerante\n Leite\n Cafe \n Açucar ");
    prod = enterScanner.nextLine();
    
    System.out.println("Digite o valor do produto: ");
    preco = enterScanner.nextDouble();
        
    System.out.println("Digite a quantidade que deseja comprar");
    quant = enterScanner.nextInt();

    valTotal = quant * preco;
    
    if (quant <= 5){
      
        desc = valTotal * 0.02;
        total = valTotal - desc;
        System.out.println("O valor total da compra é de : " + total);
    } else if (quant > 5 && quant <= 10){
      
        desc = valTotal * 0.03;
        total = valTotal - desc;
        System.out.println("O valor total da compra é de : " + total);
    } else if (quant > 10 && quant < 30){
      
        desc = valTotal * 0.05;
        total = valTotal - desc;
        System.out.println("O valor total da compra é de : " + total);
    } else if (quant >=30 ){
      
        desc = valTotal * 0.10;
        total = valTotal - desc;
        System.out.println("O valor total da compra é de : " + total);
    }


    enterScanner.close();
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}