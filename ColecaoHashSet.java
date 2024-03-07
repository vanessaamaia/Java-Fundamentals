import java.util.HashSet;
import java.util.Set;

public class ColecaoHashSet {
    
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();
        numeros.add(10);
        numeros.add(11);
        numeros.add(12);
        numeros.add(13);

        // verificar tamanho do hash set
        System.out.println(numeros.size());

        // percorrer a lista
        for (Integer elemento : numeros) {
            System.out.println(elemento);
        }

        // remover um item do hash set
        numeros.remove(12);

        //verificar se existe um item dentro da estrutura
        System.out.println(numeros.contains(12));
    }
}
