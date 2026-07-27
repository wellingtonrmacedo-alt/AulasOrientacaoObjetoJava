package aula07;

public class MainProduto {

    public static void main(String args[]){
        System.out.println("---- Produtos ----");
        Produto produto1 = new Produto("Playstation5", 3687.20, 100);
        produto1.exibirResumo();

        Produto produto2 = new Produto("Notebook DELL X3", 3600.23);
        produto2.exibirResumo();

        produto1.adicionarEstoque(3);
        produto1.exibirResumo();

        produto1.vender(10);
        produto1.exibirResumo();

        produto2.adicionarEstoque(10);
        produto2.exibirResumo();

        produto2.vender(6);
        produto2.exibirResumo();
    }
    
}
