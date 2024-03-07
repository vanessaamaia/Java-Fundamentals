package primeirasAulas;
import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {
    
    public static void main(String[] args) {
        // Lista
        List<String> nomes = new ArrayList<>();
        nomes.add("Vanessa");
        nomes.add("Lílian");
        nomes.add("Amanda");

        System.out.println(nomes.get(1));

        // Percorrer a lista 
        for (String nome : nomes) {
            System.out.println("O nome é " + nome);
        }
        nomes.forEach((System.out::println));
    }
}
