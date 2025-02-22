package GerenciadorDeTarefas;
import java.util.Scanner;

public class Tarefas {
    private String titulo;
    private String descricao;
    private int status;
    
    Scanner sc = new Scanner(System.in);

    public Tarefas(String titulo, String descricao, int status){
        setTitulo(titulo);
        setDescricao(descricao);
        setStatus(status);

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean getStatus() {

        return true;
    }

    public void setStatus(int status) {
        this.status = status;
        
    }
    

    public boolean exibirTarefas() {

        System.out.println("Título "+getTitulo() + "\nDescrição: " + getDescricao() + "\nConclusão: " + getStatus());
        return true;
    }

    public boolean tarefasAdicionadas(){
        System.out.println("Tarefa adicionada com sucesso!");
        exibirTarefas();
        
        return true;

    }


    
}
