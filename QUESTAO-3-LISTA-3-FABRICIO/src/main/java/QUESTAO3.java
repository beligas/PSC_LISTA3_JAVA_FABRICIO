
import java.util.Scanner;

public class QUESTAO3 {
  public static void main(String[] args) {

    Scanner enterScanner = new Scanner(System.in);

    double pop;
    double votBranco, percBc;
    double votNulo, percNl;
    double votValido, percVl;
    double votTotal;
    
    System.out.println("Digite o número total de eleitores: ");
    pop = enterScanner.nextDouble();
    
    System.out.println("Digite o número de votos brancos: ");
    votBranco = enterScanner.nextDouble();

    System.out.println("Digite o número de votos nulo:");
    votNulo = enterScanner.nextDouble();

    System.out.println("Digite o número de votos validos");
    votValido = enterScanner.nextDouble();

    votTotal = votBranco + votNulo + votValido;
    votValido = pop - (votBranco + votNulo);

    percBc = (votBranco / pop) * 100;
    percNl = (votNulo / pop) * 100;
    percVl = (votValido / pop) * 100;
    
    if (votTotal == pop){
    
    System.out.println("O percentual de votos brancos é: " + percBc + "%");
    System.out.println("O percentual de votos nulos é: " + percNl + "%");
    System.out.println("O percentual de votos validos é: " + percVl + "%");
    } else {
      System.out.println("O número de eleitores não corresponde ao número de votos");
    }    
    enterScanner.close();
    
  }

 }
