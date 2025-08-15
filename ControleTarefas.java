import java.util.ArrayList;
import java.util.Scanner;

class Tarefa {
    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public void marcarConcluida() {
        this.concluida = true;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    @Override
    public String toString() {
        return (concluida ? "[X] " : "[ ] ") + descricao;
    }
}

public class ControleTarefas {
    private static ArrayList<Tarefa> listaTarefas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            mostrarMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa buffer
            switch (opcao) {
    case 1:
        adicionarTarefa();
        break;
    case 2:
        listarTarefas();
        break;
    case 3:
        marcarTarefaConcluida();
        break;
    case 4:
        removerTarefa();
        break;
    case 0:
        System.out.println("Saindo...");
        break;
    default:
        System.out.println("Opção inválida.");
        break;
}
        } while (opcao != 0);
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Controle de Tarefas ---");
        System.out.println("1 - Adicionar tarefa");
        System.out.println("2 - Listar tarefas");
        System.out.println("3 - Marcar tarefa como concluída");
        System.out.println("4 - Remover tarefa");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void adicionarTarefa() {
        System.out.print("Digite a descrição da tarefa: ");
        String descricao = scanner.nextLine();
        listaTarefas.add(new Tarefa(descricao));
        System.out.println("Tarefa adicionada!");
    }

    private static void listarTarefas() {
        if (listaTarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa encontrada.");
            return;
        }
        System.out.println("\nLista de Tarefas:");
        for (int i = 0; i < listaTarefas.size(); i++) {
            System.out.println((i + 1) + " - " + listaTarefas.get(i));
        }
    }

    private static void marcarTarefaConcluida() {
        listarTarefas();
        if (listaTarefas.isEmpty()) return;
        System.out.print("Digite o número da tarefa a marcar como concluída: ");
        int num = scanner.nextInt();
        if (num > 0 && num <= listaTarefas.size()) {
            listaTarefas.get(num - 1).marcarConcluida();
            System.out.println("Tarefa marcada como concluída!");
        } else {
            System.out.println("Número inválido.");
        }
    }

    private static void removerTarefa() {
        listarTarefas();
        if (listaTarefas.isEmpty()) return;
        System.out.print("Digite o número da tarefa a remover: ");
        int num = scanner.nextInt();
        if (num > 0 && num <= listaTarefas.size()) {
            listaTarefas.remove(num - 1);
            System.out.println("Tarefa removida!");
        } else {
            System.out.println("Número inválido.");
        }
    }
}
