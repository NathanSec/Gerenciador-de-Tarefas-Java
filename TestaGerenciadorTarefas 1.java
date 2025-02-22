package GerenciadorDeTarefas;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

public class TestaGerenciadorTarefas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // List<Tarefas> listaTarefas = new ArrayList<>();

        Tarefas newTarefa1 = new Tarefas("Jogar", "Entrar no game com tal persongem", 0);
        Tarefas newTarefa2 = new Tarefas("Lavar a louça", "lol", 0);
        Tarefas newTarefa3 = new Tarefas("Jogar Free Fire", "lol", 0);
        Tarefas t1 = new Tarefas(null, null, 0);
        Tarefas t2 = new Tarefas(null, null, 0);
        Tarefas t3 = new Tarefas(null, null, 0);

        System.out.println("Bem Vindo ao Gerenciador de Tarefas");

        while (true) {
            System.out.println("=====  MENU  ====");
            System.out.println("1- Ver Tarefas");
            System.out.println("2- Adicionar Uma Nova Tarefa?");
            System.out.println("4- Gerenciar Tarefas");
            System.out.println("3- Sair");
            int escolha = sc.nextInt();

            switch (escolha) {

                case 1:

                    System.out.println("1- Ver Tarefa 1");
                    System.out.println("2- Ver Tarefa 2");
                    System.out.println("3- Ver Tarefa 3");
                    System.out.println("4- Ver Tarefas Adicionadas");
                    int escolhaTarefa = sc.nextInt();

                    if (escolhaTarefa == 1) {
                        System.out.println(newTarefa1.exibirTarefas());
                    } else if (escolhaTarefa == 2) {
                        System.out.println(newTarefa2.exibirTarefas());
                    } else if (escolhaTarefa == 3) {
                        System.out.println(newTarefa3.exibirTarefas());
                    } else if (escolhaTarefa == 4) {
                        // Variavel de Iteração //Coleção
                        t1.exibirTarefas();
                        System.out.println("");
                        t2.exibirTarefas();
                        System.out.println("");
                        t3.exibirTarefas();
                        System.out.println("");
                    } else {
                        System.out.println("Opção Inválida");
                    }
                    break;

                case 2:
                    System.out.println("Slots disponivéis:");
                    System.out.println("1, 2 e 3");
                    System.out.println("Qual slot deseja preencher?");
                    int slot = sc.nextInt();

                    if (slot == 1) {
                        if (t1.getTitulo() == null) {
                            System.out.println("Criar tarefa?");
                            String response = sc.next();
                            if (response.equals("y")) {

                                System.out.println("Qual o nome da tarefa?");
                                String titulo1 = sc.next();
                                t1.setTitulo(titulo1);

                                System.out.println("Qual a descrição da tarefa?");
                                String descricao1 = sc.next();
                                t1.setDescricao(descricao1);

                                System.out.println("Qual o status?");
                                int status1 = sc.nextInt();
                                t1.setStatus(status1);

                                System.out.println("Tarefa adicionada com sucesso!");
                            }

                        } else {
                            System.out.println("Slot ocupado");
                            break;
                        }
                    }

                    if (slot == 2) {
                        if (t2.getTitulo() == null) {
                            System.out.println("Criar tarefa?");
                            String response = sc.next();
                            if (response.equals("y")) {

                                System.out.println("Qual o nome da tarefa?");
                                String titulo1 = sc.next();
                                t2.setTitulo(titulo1);

                                System.out.println("Qual a descrição da tarefa?");
                                String descricao1 = sc.next();
                                t2.setDescricao(descricao1);

                                System.out.println("Qual o status?");
                                int status1 = sc.nextInt();
                                t2.setStatus(status1);

                                System.out.println("Tarefa adicionada com sucesso!");
                            }
                        } else {
                            System.out.println("Slot ocupado");
                            break;
                        }
                    }

                        if (slot == 3) {
                            if (t3.getTitulo() == null) {
                                System.out.println("Criar tarefa?");
                                String response = sc.next();
                                if (response.equals("y")) {

                                    System.out.println("Qual o nome da tarefa?");
                                    String titulo1 = sc.next();
                                    t3.setTitulo(titulo1);

                                    System.out.println("Qual a descrição da tarefa?");
                                    String descricao1 = sc.next();
                                    t3.setDescricao(descricao1);

                                    System.out.println("Qual o status?");
                                    int status1 = sc.nextInt();
                                    t3.setStatus(status1);

                                    System.out.println("Tarefa adicionada com sucesso!");
                                }
                            }
                        } else {
                            System.out.println("Slot ocupado");
                            break;
                        }

                    break;
                    

                case 3:
                    System.out.println("Saindo...");
                    sc.close();
                    System.exit(0);
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Qual tarefa deseja alterar o status?");
                    System.out.println("1 \n 2 \n 3 \n 4 \n 5 \n 6 \n");
                    int gerenciarn = sc.nextInt();
                    if (gerenciarn == 1) {
                        System.out.println("Deseja concluir a tarefa?");
                        String resposta = sc.next();
                        if (resposta.equals("y")) {
                            newTarefa1.setStatus(1);
                            System.out.println("Status alterado com sucesso!");
                        } else {
                            newTarefa1.setStatus(0);
                        }
                    }
                    if (gerenciarn == 2) {
                        System.out.println("Deseja concluir a tarefa?");
                        String resposta = sc.next();
                        if (resposta.equals("y")) {
                            newTarefa2.setStatus(1);
                            System.out.println("Status alterado com sucesso!");
                        } else {
                            newTarefa2.setStatus(0);
                        }
                    }
                    if (gerenciarn == 3) {
                        System.out.println("Deseja concluir a tarefa?");
                        String resposta = sc.next();
                        if (resposta.equals("y")) {
                            newTarefa3.setStatus(1);
                            System.out.println("Status alterado com sucesso!");
                        } else {
                            newTarefa3.setStatus(0);
                        }
                    }
                    if (gerenciarn == 4) {
                        System.out.println("Deseja concluir a tarefa?");
                        String resposta = sc.next();
                        if (resposta.equals("y")) {
                            t1.setStatus(1);
                            System.out.println("Status alterado com sucesso!");
                        } else {
                            t1.setStatus(0);
                        }
                    }
                    if (gerenciarn == 5) {
                        System.out.println("Deseja concluir a tarefa?");
                        String resposta = sc.next();
                        if (resposta.equals("y")) {
                            t2.setStatus(1);
                            System.out.println("Status alterado com sucesso!");
                        } else {
                            t2.setStatus(0);
                        }
                    }
                    if (gerenciarn == 6) {
                        System.out.println("Deseja concluir a tarefa?");
                        String resposta = sc.next();
                        if (resposta.equals("y")) {
                            t3.setStatus(1);
                            System.out.println(t1.getStatus() ? "Concluido" : "Pendente");
                            
                            System.out.println("Status alterado com sucesso!");
                        }
                        if (resposta.equals("n")) {
                            t3.setStatus(0);
                        }
                    }

                default:
                    System.out.println("Opção Inválida");
            }
        }
    }
}
