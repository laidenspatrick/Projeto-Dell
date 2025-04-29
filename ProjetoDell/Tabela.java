import java.util.Arrays;
/**
 * Escreva uma descrição da classe Tabela aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Tabela
{
    public void exibirTabelaGeral(Startup[] startups) {
     Arrays.sort(startups, (a, b) -> Integer.compare(b.getPontuacao(), a.getPontuacao()));

     System.out.println("\n===== TABELA FINAL DO TORNEIO =====");
     System.out.printf("%-20s %-10s %-8s %-6s %-9s %-12s %-12s\n",
        "Startup", "Pontos", "Pitches", "Bugs", "Trações", "Invest. Irr.", "Fake News");
     System.out.println("-------------------------------------------------------------------------------");

     for (Startup s : startups) {
        System.out.printf("%-20s %-10d %-8d %-6d %-9d %-12d %-12d\n",
            s.getNome(),
            s.getPontuacao(),
            s.getContPitch(),
            s.getContBugs(),
            s.getContTracao(),
            s.getContIrritado(),
            s.getContFakeNews());
      }
    }
}
