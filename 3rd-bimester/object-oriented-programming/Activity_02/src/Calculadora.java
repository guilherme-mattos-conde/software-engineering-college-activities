import java.util.Scanner; // Importação da classe Scanner

public class Calculadora { // Classe pública
    public static void main(String[] args) { // Método público, estático e sem retorno que recebe parâmetro do tipo String[] (array de String)
        Scanner scanner = new Scanner(System.in); // Instância da classe Scanner

        /* Código Antigo
            int opcao;

            do {
            ...
            } while (opcao != 9);
        */

        // Código Atualizado
        int opcao = 0; // Declaração de váriavel do tipo int

        while (opcao != 9) { // Laço de repetição que só é quebrado quando a condição dentro dos () é satisfeita
            exibirMenu(); // Invocação do método exibirMenu()
            opcao = scanner.nextInt(); // Atribuição do proximo valor int recebido pelo sistema, para a variável descrita

            switch (opcao) { // Estrutura condicional que percorre todos os casos descritos para a variavel chave dentro dos parenteses
                case 1: realizarOperacaoBasica(scanner, "adição"); break; // caso opcao = 1 chama metodo descrito com os parametros necessários e interrompe o fluxo atual do switch
                case 2: realizarOperacaoBasica(scanner, "subtração"); break; // caso opcao = 2 chama metodo descrito com os parametros necessários e interrompe o fluxo atual do switch
                case 3: realizarOperacaoBasica(scanner, "multiplicação"); break; // caso opcao = 3 chama metodo descrito com os parametros necessários e interrompe o fluxo atual do switch
                case 4: realizarOperacaoBasica(scanner, "divisão"); break; // caso opcao = 4 chama metodo descrito com os parametros necessários e interrompe o fluxo atual do switch
                case 5: calcularRaizQuadrada(scanner); break; // caso opcao = 5 chama metodo descrito com os parametros necessários e interrompe o fluxo atual do switch
                case 6: calcularPotencia(scanner); break; // caso opcao = 6 chama metodo descrito com os parametros necessários e interrompe o fluxo atual do switch
                case 7: calcularFatorial(scanner); break; // caso opcao = 7 chama metodo descrito com os parametros necessários e interrompe o fluxo atual do switch
                case 8: mudarSinal(scanner); break; // caso opcao = 8 chama metodo descrito com os parametros necessários e interrompe o fluxo atual do switch
                case 9: System.out.println("Saindo..."); break; // caso opcao = 9 exibe mensagem descrita dentro dos parenteses e interrompe o fluxo atual do switch
                default: System.out.println("Opção inválida. Tente novamente."); // caso nenhuma das anteriores exibe mensagem descrita dentro dos parenteses
            }
        }

        scanner.close(); // Encerra a instância do scanner
    }

    public static void exibirMenu() { // Método público, estático e sem retorno que não recebe parâmetros
        // Exibe todas as mensagens descritas dentro dos parenteses na tela, pulando linha
        System.out.println("\nCalculadora Simples:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("5. Raiz Quadrada");
        System.out.println("6. Potência");
        System.out.println("7. Fatorial");
        System.out.println("8. Mudar Sinal");
        System.out.println("9. Sair");
        System.out.print("Escolha uma opção: "); // Sem pular linha
    }

    public static void realizarOperacaoBasica(Scanner scanner, String operacao) { // Método público, estático e sem retorno que recebe parâmetros do tipo Scanner e String
        System.out.print("Digite o primeiro número: "); // Exibe mensagem descrita dentro dos parenteses
        double num1 = scanner.nextDouble(); // Atribuição do proximo valor double recebido pelo sistema, para a variável descrita
        System.out.print("Digite o segundo número: "); // Exibe mensagem descrita dentro dos parenteses
        double num2 = scanner.nextDouble(); // Atribuição do proximo valor double recebido pelo sistema, para a variável descrita

        double resultado = 0; // Declaração de váriavel do tipo double

        switch (operacao) { // Estrutura condicional que percorre todos os casos descritos para a variavel chave dentro dos parenteses
            case "adição": resultado = somar(num1, num2); break; // Caso operacao = "adição" atribui valor retornado pelo metodo descrito com os parametros necessários para a variável resultado e interrompe o fluxo atual do switch
            case "subtração": resultado = subtrair(num1, num2); break; // Caso operacao = "subtração" atribui valor retornado pelo metodo descrito com os parametros necessários para a variável resultado e interrompe o fluxo atual do switch
            case "multiplicação": resultado = multiplicar(num1, num2); break; // Caso operacao = "multiplicação" atribui valor retornado pelo metodo descrito com os parametros necessários para a variável resultado e interrompe o fluxo atual do switch
            case "divisão": // Caso operacao = "divisão" executa o código descrito abaixo
                if (num2 != 0) { // Estrutura condicional que executará o código descrito abaixo caso a condição dentro dos parenteses seja cumprida
                    resultado = dividir(num1, num2); // Atribui valor retornado pelo metodo descrito com os parametros necessários para a variável resultado
                } else { // Caso a condição dentro dos parenteses não seja cumprida executará o código descrito abaixo
                    System.out.println("Erro: Divisão por zero."); // Exibe mensagem descrita dentro dos parenteses
                    return; // Encerra a execução do método atual
                }
                break; // Interrompe o fluxo atual do switch
        }

        System.out.printf("Resultado da %s: %.2f\n", operacao, resultado); // Exibe mensagem e variáveis descritas dentro dos parenteses
    }

    public static double somar(double a, double b) { // Método público, estático e com retorno double que recebe dois parâmetros do tipo Double
        return a + b; // Retorna valor double
    }

    public static double subtrair(double a, double b) { // Método público, estático e com retorno double que recebe dois parâmetros do tipo Double
        return a - b; // Retorna valor double
    }

    public static double multiplicar(double a, double b) { // Método público, estático e com retorno double que recebe dois parâmetros do tipo Double
        return a * b; // Retorna valor double
    }

    public static double dividir(double a, double b) { // Método público, estático e com retorno double que recebe dois parâmetros do tipo Double
        return a / b; // Retorna valor double
    }

    public static void calcularRaizQuadrada(Scanner scanner) { // Método público, estático e sem retorno que recebe parâmetro do tipo Scanner
        System.out.print("Digite o número: "); // Exibe mensagem descrita dentro dos parenteses
        double num = scanner.nextDouble();// Atribuição do proximo valor double recebido pelo sistema, para a variável descrita
        double resultado = Math.sqrt(num); // Atribui valor retornado pelo metodo descrito com os parametros necessários para a variável resultado
        System.out.printf("Raiz quadrada de %.2f: %.2f\n", num, resultado); // Exibe mensagem e variáveis descritas dentro dos parenteses
    }

    public static void calcularPotencia(Scanner scanner) { // Método público, estático e sem retorno que recebe parâmetro do tipo Scanner
        System.out.print("Digite a base: "); // Exibe mensagem descrita dentro dos parenteses
        double base = scanner.nextDouble(); // Atribuição do proximo valor double recebido pelo sistema, para a variável descrita
        System.out.print("Digite o expoente: "); // Exibe mensagem descrita dentro dos parenteses
        double expoente = scanner.nextDouble(); // Atribuição do proximo valor double recebido pelo sistema, para a variável descrita
        double resultado = Math.pow(base, expoente); // Atribui valor retornado pelo metodo descrito com os parametros necessários para a variável resultado
        System.out.printf("Resultado de %.2f elevado a %.2f: %.2f\n", base, expoente, resultado); // Exibe mensagem e variáveis descritas dentro dos parenteses
    }

    public static void calcularFatorial(Scanner scanner) { // Método público, estático e sem retorno que recebe parâmetro do tipo Scanner
        System.out.print("Digite um número inteiro: "); // Exibe mensagem descrita dentro dos parenteses
        int num = scanner.nextInt(); // Atribuição do proximo valor int recebido pelo sistema, para a variável descrita
        if (num < 0) { // Estrutura condicional que executará o código descrito abaixo caso a condição dentro dos parenteses seja cumprida
            System.out.println("Erro: Fatorial de número negativo não é definido."); // Exibe mensagem descrita dentro dos parenteses
            return; // Encerra a execução do método atual
        }
        long resultado = fatorial(num); // Atribui valor retornado pelo metodo descrito com os parametros necessários para a variável resultado
        System.out.printf("Fatorial de %d: %d\n", num, resultado); // Exibe mensagem e variáveis descritas dentro dos parenteses
    }

    public static long fatorial(int n) { // Método público, estático e com retorno long que recebe parâmetro do tipo int
        if (n == 0) { // Estrutura condicional que executará o código descrito abaixo caso a condição dentro dos parenteses seja cumprida
            return 1; // Retorna valor long
        } else { // Caso a condição dentro dos parenteses não seja cumprida executará o código descrito abaixo
            return n * fatorial(n - 1); // Retorna valor long
        }
    }

    public static void mudarSinal(Scanner scanner) { // Método público, estático e sem retorno que recebe parâmetro do tipo Scanner
        System.out.print("Digite o número: "); // Exibe mensagem descrita dentro dos parenteses
        double num = scanner.nextDouble(); // Atribuição do proximo valor double recebido pelo sistema, para a variável descrita
        double resultado = -num; // Atribui valor descrito para a variável resultado
        System.out.printf("O número com sinal trocado: %.2f\n", resultado); // Exibe mensagem e variáveis descritas dentro dos parenteses
    }
}
