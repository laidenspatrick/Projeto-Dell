import java.util.Random;

/**
 * Escreva uma descrição da classe Quiz aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class PosTorneio
{
    private Random random = new Random();
    public void PosTorneio (Startup s) {
       System.out.println ("\n ******* Agora vamos simular o futuro da empresa que ganhou *******");
       
       int futuro = random.nextInt(9) + 1;
       if (futuro == 1){
           System.out.println ("A " + s.getNome() + " faliu");
       } else if (futuro == 2){
           System.out.println ("A " + s.getNome() + " foi vendida por 5 milhoes");
       } if (futuro == 3){
           System.out.println ("A " + s.getNome() + " expandiu para 18 paises");
       } if (futuro == 4){
           System.out.println ("A " + s.getNome() + " diminuiu de tamanho mas segue ativa");
       } if (futuro == 5){
           System.out.println ("A " + s.getNome() + " abriu seu IPO");
       } if (futuro == 6){
           System.out.println ("A " + s.getNome() + " era uma fraude e muito gente perdeu seu dinheiro");
       } if (futuro == 7){
           System.out.println ("A " + s.getNome() +" esta passando por mudancas no seu foco de vendas");
       } if (futuro == 8){
           System.out.println ("A " + s.getNome() + " desvalorizou e vai fechar");
       } if (futuro == 9){
           System.out.println ("A "+ s.getNome() + " foi vendida para o grupo Google");
       } 
    }
}
