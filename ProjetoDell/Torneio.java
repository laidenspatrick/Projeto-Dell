import java.util.Random;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class Torneio {
    private Random random = new Random();
    private Scanner sc = new Scanner(System.in);
    private Startup[] startup; // startups da rodada
    private int fase = 1;
    private Tabela tabela = new Tabela ();
    private Rodada rodada = new Rodada();

    /**
     * Inicia e executa todas as fases do torneio até restar apenas uma campeã.
     */
    public void comecaTorneio(CadastroStartup cadastro) {
        cadastro.validaParticipantes();

        // Inicializa o vetor com as startups do cadastro
        this.startup = cadastro.getStartups();

        while (startup.length > 1) {
            System.out.println("\n--- Rodada " + fase + " ---");

            gerarDisputas(startup);
            List<Startup> vencedores = rodada.processarRodada(startup);
            startup = vencedores.toArray(new Startup[0]);
            fase++;
        }

        System.out.println("\n*** CAMPEÃ DO TORNEIO: " + startup[0].getNome() + " slogan: " + startup[0].getSlogan() + " ***");
        Startup todas [] = cadastro.getStartups();
        tabela.exibirTabelaGeral (todas);
        
        PosTorneio pos = new PosTorneio ();
        pos.PosTorneio (startup[0]);
    }

    public static void gerarDisputas(Startup[] startup) {
        embaralhar(startup); // Embaralha o vetor
    }

    public static void embaralhar(Startup[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Startup temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    } 
}
