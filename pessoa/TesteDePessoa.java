package pessoa;

public class TesteDePessoa {
    
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.cpf = "11122233344";
        pessoa1.nome = "Vanessa";
        pessoa1.idade = 20;

        System.out.println(pessoa1.imprimirDadosDaPessoa(1));

        Pessoa pessoa2 = new Pessoa();
        pessoa2.cpf = "44433322211";
        pessoa2.nome = "Jaqueline";
        pessoa2.idade = 58;

        System.out.println(pessoa2.imprimirDadosDaPessoa(2));
    }
}
