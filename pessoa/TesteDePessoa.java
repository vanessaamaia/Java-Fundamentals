package pessoa;

public class TesteDePessoa {
    
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setCpf("11122233344");
        professor.setNome("Vanessa");
        professor.setIdade(20);
        professor.setSalario(5000);

        System.out.println(professor.imprimirDadosDaPessoa());

        Aluno aluno = new Aluno();
        aluno.setCpf("44433322211");
        aluno.setNome("Alícia");
        aluno.setIdade(35);
        aluno.setMatricula("958712");

        System.out.println(aluno.imprimirDadosDaPessoa());
    }
}
