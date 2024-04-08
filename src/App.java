import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // 1- Imprima a informação do provedor
        String provedor = "CineMax";
        System.out.printf("Olá, bem-vindo a central de atendimento %s", provedor);
  
        // 2- Imprima a informação do assistente
        String atendente = "Mary Jane";
        System.out.printf("\nMeu nome é %s, sou seu assistente virtual", atendente);

        // 3- Imprima a informação das instruções
        System.out.print("\nDurante o atendimento siga minhas instruções");

        // 4- Leia o nome da pessoa
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nPrimeiramente informe seu nome");
        String nome = scanner.nextLine();

        // 5- Leia a pergunta da pessoa
        System.out.printf("Obrigado %s, como posso lhe ajudar?", nome);
        String pergunta = scanner.nextLine();

        // Imprimindo texto concatenado
        // 6- Imprima a pergunta da pessoa
        System.out.println("Sua pergunta foi: " + pergunta);

        // 7 - Feche o scanner
        scanner.close();
    }
}
