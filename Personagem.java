package aula07;

public class Personagem {

    String nome;
    String classe;
    int nivel;

    // Construtor 1: O jogador deve escolher tudo
    public Personagem(String nome, String classe, int nivel){
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
    }

    // Construtor 2: O jogador só escolher o nome (Personagem)
    public Personagem(String nome){
        this.nome = nome;
        this.classe = "Camponês";
        this.nivel = 10;
    }
    
    public void alterarClasse(String classe, int nivel){
        this.classe = classe;
        this.nivel = nivel;
        System.out.println("O jogador " + this.nome + " alterou o nível para " 
        + this.nivel);
    }

    public void exibirStatus(){
        System.out.println("=".repeat(40));
        System.out.println("Nome: " + this.nome);
        System.out.println("Classe: " + this.classe);
        System.out.println("Nível: " + this.nivel);
        System.out.println("*".repeat(40));
    }

}
