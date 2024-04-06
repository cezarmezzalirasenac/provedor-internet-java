import java.util.Scanner;

public class EntradaDados {
  public static void main(String[] args) {
    // entrada
    // Scanner
    Scanner scanner = new Scanner(System.in);

    // Texto
    System.out.print("Informe o seu nome: ");
    String nome = scanner.next();

    // Caractere
    System.out.print("Escolha uma cor: (Azul, Verde, Amarelo) ");
    char cor = scanner.next().charAt(0);

    // Números
    System.out.print("\nInforme sua idade: ");
    int idade = scanner.nextInt();

    System.out.print("Informe sua altura: ");
    double altura = scanner.nextDouble();

    // processamento
    nome = nome.toUpperCase();

    // saída
    System.out.println(nome);
    System.out.println(idade);
    System.out.println(altura);
    System.out.println(cor);

    scanner.close();
  }
}
