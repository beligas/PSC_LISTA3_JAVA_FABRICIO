
import java.util.Scanner;

public class QUESTAO5 {
  public static void main(String[] args) {

    Scanner enterScanner =  new Scanner(System.in);

    double peso;
    double altura;
    double imc; 
    
    System.out.println("Digite seu peso em kg ");
    peso = enterScanner.nextDouble();

    System.out.println("Digite sua altura em metros");
    altura = enterScanner.nextDouble();

    imc = peso / (altura * altura);
    
    if (imc < 20){
      
      System.out.println("Abaixo do peso");
    } else if (imc >= 20 && imc < 25){
      
     System.out.println("Peso normal");
    } else if ( imc >= 25 && imc<= 30) {
     
      System.out.println("Acima do peso");
    }else if( imc >= 30 && imc <= 40 ){
      
      System.out.println("Obeso");
    }else if (imc > 40){
      
      System.out.println("Obeso mórbido");
    }
    
   enterScanner.close();
  }

  
}
