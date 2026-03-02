
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

  
}
