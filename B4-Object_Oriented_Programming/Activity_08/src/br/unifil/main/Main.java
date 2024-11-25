package br.unifil.main;
import br.unifil.model.Disco;
import br.unifil.service.DiscoService;
import br.unifil.service.ArtistaService;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static DiscoService discoService = new DiscoService();
    private static ArtistaService artistaService = new ArtistaService();

    public static void main(String[] args) {
        while (true) {
            mostrarMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> cadastrarDisco();
                case 2 -> listarDiscos();
                case 3 -> editarDisco();
                case 4 -> removerDisco();
                case 5 -> cadastrarArtista();
                case 6 -> listarArtistas();
                case 7 -> {
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opção inválida!");
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("\n***** Catálogo de Discos *****");
        System.out.println("[1] Cadastrar Disco");
        System.out.println("[2] Listar Discos");
        System.out.println("[3] Editar Disco");
        System.out.println("[4] Remover Disco");
        System.out.println("[5] Cadastrar Artista");
        System.out.println("[6] Listar Artistas");
        System.out.println("[7] Sair");
        System.out.print("Opção: ");
    }

    private static void cadastrarDisco() {
        System.out.print("Título do disco: ");
        String titulo = scanner.nextLine();
        System.out.print("Ano de lançamento: ");
        int ano = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Faixas (separadas por vírgula): ");
        String[] faixas = scanner.nextLine().split(",");
        discoService.cadastrarDisco(titulo, ano, Arrays.asList(faixas));
        System.out.println("Disco cadastrado com sucesso!");
    }

    private static void listarDiscos() {
        System.out.println("\n***** Lista de Discos *****");
        discoService.listarDiscos();
    }

    private static void editarDisco() {
        System.out.print("Título do disco: ");
        String titulo = scanner.nextLine();
        Disco disco = discoService.buscarDiscoPorTitulo(titulo);
        if (disco != null) {
            System.out.print("Novo título: ");
            String novoTitulo = scanner.nextLine();
            System.out.print("Novo ano de lançamento: ");
            int novoAno = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Novas faixas (separadas por vírgula): ");
            String[] novasFaixas = scanner.nextLine().split(",");
            discoService.editarDisco(disco, novoTitulo, novoAno, Arrays.asList(novasFaixas));
            System.out.println("Disco editado com sucesso!");
        } else {
            System.out.println("Disco não encontrado.");
        }
    }

    private static void removerDisco() {
        System.out.print("Título do disco: ");
        String titulo = scanner.nextLine();
        Disco disco = discoService.buscarDiscoPorTitulo(titulo);
        if (disco != null) {
            discoService.removerDisco(disco);
            System.out.println("Disco removido com sucesso!");
        } else {
            System.out.println("Disco não encontrado.");
        }
    }

    private static void cadastrarArtista() {
        System.out.print("Nome do artista: ");
        String nomeArtista = scanner.nextLine();
        System.out.print("Gênero musical: ");
        String genero = scanner.nextLine();
        System.out.print("Título do disco associado: ");
        String discoTitulo = scanner.nextLine();
        Disco disco = discoService.buscarDiscoPorTitulo(discoTitulo);
        if (disco != null) {
            artistaService.cadastrarArtista(nomeArtista, genero, disco);
            System.out.println("Artista cadastrado com sucesso!");
        } else {
            System.out.println("Disco não encontrado.");
        }
    }

    private static void listarArtistas() {
        System.out.println("\n***** Lista de Artistas *****");
        artistaService.listarArtistas();
    }
}
