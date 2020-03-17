import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Programa {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Neymar", "Meia atacante");
        Jogador j2 = new Jogador("Romário", "Centroavante");
        HashMap<Jogador, Integer> map = new HashMap();
        
        map.put(j1, 464);
        map.put(j2, 1002);

        for (Map.Entry<Jogador, Integer> relacao : map.entrySet()) {
            System.out.println("Jogador: " + relacao.getKey());
            System.out.println("Quantidade de Gols: " + relacao.getValue());
            System.out.println("----------------------------------");
        }

        map.remove(j1);
        System.out.println("=====================================");

        Set<Jogador> jogadores = map.keySet();

        for (Jogador j: jogadores) {
            System.out.println("Jogador: " + j);
            System.out.println("Quantidade de Gols: " + map.get(j));
        }
    }
}
