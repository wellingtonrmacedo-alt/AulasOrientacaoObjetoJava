package aula07;

public class MainConta {

    public static void main(String[] args) {

        // Criando um objeto com o construtor
        ContaBancaria conta1 = new ContaBancaria("Wellington",
                "568.975.456-00", "12.345-6");

        ContaBancaria conta2 = new ContaBancaria("Ana",
                "258.898.777-00", "11.556-01");

        ContaBancaria conta3 = new ContaBancaria("Solange",
                "309.555.639-11", "56.698-77");

        ContaBancaria conta4 = new ContaBancaria("Eduardo",
         "333.999.666-45", "65.693-12");

        conta1.exibirDados();
        conta2.exibirDados();
        conta3.exibirDados();
        conta4.exibirDados();

        

    }
}
