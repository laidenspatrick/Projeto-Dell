
/**
 * Escreva uma descrição da classe App aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class App
{
    public static void main (String args[]){

        Startup s1 = new Startup("Facilidade Total", 2022, "Automacao total de tarefas sem voce se preocupar");
        Startup s2 = new Startup ("EcoPioneer", 1999, "Os pioneiros na solucao para um mundo mais verde");
        Startup s3 = new Startup ("Ingles Rapido", 2012, "Para voce que nao tem tempo e quer virar fluente");
        Startup s4 = new Startup ("Saude Sempre", 2009, "Voce com acesso a todos hospitais do Brasil");
        Startup s5 = new Startup("FinGuard", 2015, "Seguranca financeira para voce se aposentar tranquilo");
        Startup s6 = new Startup("BioTec" , 2019, "Tecnolgia em dia para um mundo sustentavel");
        Startup s7 = new Startup ("EducaAgora", 2011, "Desenvolvendo mentes para o presente");
        Startup s8 = new Startup ("RecebaAqui", 2023, "Sua nova forma de organizar seus dinheiros pendentes");

        CadastroStartup cadastroStartup = new CadastroStartup();
        cadastroStartup.adicionaStartup(s1);
        cadastroStartup.adicionaStartup(s2);
        cadastroStartup.adicionaStartup(s3);
        cadastroStartup.adicionaStartup(s4);
        //cadastroStartup.adicionaStartup(s5);
        //cadastroStartup.adicionaStartup(s6);
        //cadastroStartup.adicionaStartup(s7);
        //cadastroStartup.adicionaStartup(s8);
        s1.setPontuacao(70);
        s2.setPontuacao(70);
        s4.setPontuacao(70);
        s3.setPontuacao(70);
        s5.setPontuacao(70);
        s6.setPontuacao(70);
        s7.setPontuacao(70);
        s8.setPontuacao(70);
        cadastroStartup.mostraStartups();
        
        Torneio torneio = new Torneio();
        Startup[] participantes = cadastroStartup.getStartups();

        torneio.comecaTorneio(cadastroStartup);
        }
}
