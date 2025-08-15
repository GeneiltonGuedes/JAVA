import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("===== CONVERSOR DE TEMPERATURA =====");
        System.out.println("Escolha a conversão desejada:");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Celsius para Kelvin");
        System.out.println("3 - Fahrenheit para Celsius");
        System.out.println("4 - Fahrenheit para Kelvin");
        System.out.println("5 - Kelvin para Celsius");
        System.out.println("6 - Kelvin para Fahrenheit");
        System.out.print("Opção: ");
        
        int opcao = entrada.nextInt();
        
        System.out.print("Digite a temperatura: ");
        double temperatura = entrada.nextDouble();
        
        double resultado;
        
        if (opcao == 1) {
            resultado = (temperatura * 9/5) + 32;
            System.out.println("Resultado: " + resultado + " °F");
        } 
        else if (opcao == 2) {
            resultado = temperatura + 273.15;
            System.out.println("Resultado: " + resultado + " K");
        } 
        else if (opcao == 3) {
            resultado = (temperatura - 32) * 5/9;
            System.out.println("Resultado: " + resultado + " °C");
        } 
        else if (opcao == 4) {
            resultado = ((temperatura - 32) * 5/9) + 273.15;
            System.out.println("Resultado: " + resultado + " K");
        } 
        else if (opcao == 5) {
            resultado = temperatura - 273.15;
            System.out.println("Resultado: " + resultado + " °C");
        } 
        else if (opcao == 6) {
            resultado = ((temperatura - 273.15) * 9/5) + 32;
            System.out.println("Resultado: " + resultado + " °F");
        } 
        else {
            System.out.println("Opção inválida!");
        }
        
        entrada.close();
    }
}
