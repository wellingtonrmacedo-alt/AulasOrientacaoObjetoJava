package aula07;

public class Produto {
    String nome;
    double preco;
    int quantidadeEstoque;

    //Construtor 1:
    public Produto(String nome, double preco, int quantidadeEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    //Construtor 2:
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = 0;
    }

    //Métodos:
    public void adicionarEstoque(int quantidadeEstoque){
        this.quantidadeEstoque += quantidadeEstoque;
        System.out.println("A quantidade de estoque atua é: " + quantidadeEstoque);
    }

    public void vender(int quantidadeEstoque){
        this.quantidadeEstoque -= quantidadeEstoque;
        System.out.println("A quantidade de estoque atual depois da venda é: " + quantidadeEstoque);

    }

    public void exibirResumo(){
        System.out.println("*".repeat(40));
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Quantidade de Estoque: " + this.quantidadeEstoque);
        System.out.println("*".repeat(40));
    }

}
