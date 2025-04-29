
/**
 * Escreva uma descrição da classe Rodada aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.*;

/**
 * Classe que representa uma batalha entre duas startups,
 * permitindo registrar eventos, calcular pontuação e definir o vencedor.
 */
public class Rodada {
    private Scanner sc = new Scanner(System.in);
    private Random random = new Random();
    public List<Startup> processarRodada(Startup[] startups) {
        List<Startup> vencedores = new ArrayList<>();
        List<Integer> batalhasDisponiveis = new ArrayList<>();

        for (int i = 0; i < startups.length - 1; i += 2) {
            batalhasDisponiveis.add(i);
        }

        while (!batalhasDisponiveis.isEmpty()) {
            System.out.println("\n--- Batalhas Disponíveis ---");
            for (int i = 0; i < batalhasDisponiveis.size(); i++) {
                int aux = batalhasDisponiveis.get(i);
                System.out.println((i + 1) + ". " + startups[aux].getNome() + " vs " + startups[aux + 1].getNome());
            }

            System.out.print("Escolha o número da batalha que deseja iniciar: ");
            int escolha = Integer.parseInt(sc.nextLine()) - 1;

            if (escolha < 0 || escolha >= batalhasDisponiveis.size()) {
                System.out.println("Escolha inválida. Tente novamente.");
                continue;
            }

            int aux = batalhasDisponiveis.remove(escolha);
            Startup s1 = startups[aux];
            Startup s2 = startups[aux + 1];

            System.out.println("\nIniciando batalha entre " + s1.getNome() + " que tem pontuacao de: " + s1.getPontuacao()+ " versus " + s2.getNome() + " que tem pontuacao de: " + s2.getPontuacao());
            registrarEventos(s1);
            registrarEventos(s2);

            Startup vencedor = decidirVencedor(s1, s2);
            vencedor.somarVitoria();
            System.out.println("Vencedora: " + vencedor.getNome() + " (+30 pontos)");
            vencedores.add(vencedor);

            s1.resetarPontuacaoRodada();
            s2.resetarPontuacaoRodada();
        }
        
        return vencedores;
    }

    private void registrarEventos(Startup s) {
        System.out.println("\nRegistrando eventos para " + s.getNome());

        System.out.print("Pitches convicentes (+6 cada): ");
        int pitch = Integer.parseInt(sc.nextLine());
        if (pitch >= 2) {
            pitch = 1;
            s.adicionarPitch(pitch);
            System.out.println ("Contabilizado apenas uma vez");
        } else {
            s.adicionarPitch(pitch);
        }

        System.out.print("Produtos com bugs (-4 cada): ");
        int bugs = Integer.parseInt(sc.nextLine());
        if ( bugs >= 2 ) {
            bugs = 1;
            s.adicionarBug(bugs);
            System.out.println ("Contabilizado apenas uma vez");
        } else {
            s.adicionarBug(bugs);
        }

        System.out.print("Boa tracao com usuarios (+3 cada): ");
        int tracao = Integer.parseInt(sc.nextLine());
        if ( tracao >= 2 ) {
            tracao = 1;
            s.adicionarTracao(tracao);
            System.out.println ("Contabilizado apenas uma vez");
        } else {
            s.adicionarTracao(tracao);
        }
        System.out.print("Investidor irritado (-6 cada): ");
        int investidor = Integer.parseInt(sc.nextLine());
        if ( investidor >= 2 ) {
            investidor = 1;
            s.adicionarInvestidorIrritado(investidor);
            System.out.println ("Contabilizado apenas uma vez");
        } else {
            s.adicionarInvestidorIrritado(investidor);
        }
        System.out.print("Fake News no pitch (-8 cada): ");
        int fakeNews = Integer.parseInt(sc.nextLine());
        if ( fakeNews >= 2 ) {
            fakeNews = 1;
            s.adicionarFakeNews(fakeNews);
            System.out.println ("Contabilizado apenas uma vez");
        } else {
            s.adicionarFakeNews(fakeNews);
        }

        int total = pitch * 6 + bugs * -4 + tracao * 3 + investidor * -6 + fakeNews * -8; ;
        s.adicionarPontosRodada(total);
        s.adicionarPontos (total);
        System.out.println("Total da rodada: " + total + " pontos");
    }

    private Startup decidirVencedor(Startup s1, Startup s2) {
        int pontos1 = s1.getPontuacaoRodada();
        int pontos2 = s2.getPontuacaoRodada();

        System.out.println("\nPontuação da rodada:");
        System.out.println(s1.getNome() + ": " + pontos1 + " pontos");
        System.out.println(s2.getNome() + ": " + pontos2 + " pontos");

        if (pontos1 > pontos2) {
            return s1;
        } else if (pontos2 > pontos1) {
            return s2;
        } else {
            System.out.println("Empate! Sorteando vencedor...");
            return random.nextBoolean() ? s1 : s2;
        }
    }
    
}
