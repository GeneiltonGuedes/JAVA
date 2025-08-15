import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroSecreto = (int) (Math.random() * 100) + 1;
        int tentativa = 0;
        int chute = 0;

        while (chute != numeroSecreto) {
            System.out.print("Digite um número entre 1 e 100: ");
            chute = entrada.nextInt();
            tentativa++;

            if (chute < numeroSecreto) {
                System.out.println("O número secreto é maior.");
            } else if (chute > numeroSecreto) {
                System.out.println("O número secreto é menor.");
            } else {
                System.out.println("Parabéns! Você acertou em " + tentativa + " tentativas.");
            }
        }
        entrada.close();
    }
}
