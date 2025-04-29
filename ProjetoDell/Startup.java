public class Startup
{
    private String nome;
    private int pontuacao;
    private int anoFundacao;
    private String slogan;
    private int pontuacaoRodada;
    private int contPitch;
    private int contBugs;
    private int contTracao;
    private int contFakeNews;
    private int contIrritado;

    // métodos Construtores
    public Startup(){
        this.nome = null;
        this.pontuacao = 70;
        this.anoFundacao = 0;
        this.slogan = null;
        this.pontuacaoRodada = 0;
    }    

    public Startup (String nome, int anoFundacao, String slogan) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.anoFundacao = anoFundacao;
        this.slogan = slogan;
        this.pontuacaoRodada = pontuacaoRodada;
    }
    // métodos setters
    public void setNome (String nome){
        this.nome = nome;
    }

    public void setPontuacao (int pontuacao){
        this.pontuacao = 70;
    }

    public void setAnoFundacao (int anoFundacao){
        this.anoFundacao = anoFundacao;
    }
    
    public void setPontuacaoRodada (int pontuacaoRodada){
        this.pontuacaoRodada = pontuacaoRodada;
    }

    // métodos getters
    public String getNome (){
        return this.nome;
    }

    public int getPontuacao (){
        return this.pontuacao;
    }

    public int getAnoFundacao (){
        return this.anoFundacao;
    }

    public String getSlogan () {
        return this.slogan;
    }
    
    public int getPontuacaoRodada (){
        return this.pontuacaoRodada;
    }
    
    public int getContPitch () {
        return this.contPitch;
    }
    
    public int getContTracao () {
        return this.contTracao;
    }
    
    public int getContIrritado () {
        return this.contIrritado;
    }
    
    public int getContFakeNews () {
        return this.contFakeNews;
    }
    
    public int getContBugs () {
        return this.contBugs;
    }
    
     public void somarVitoria() {
        this.pontuacao += 30;
    }

    public void resetarPontuacaoRodada() {
        this.pontuacaoRodada = 0;
    }
    
    public void adicionarPontosRodada(int pontos) {
        this.pontuacaoRodada += pontos;
    }
    
     public void adicionarPontos(int pontos) {
        this.pontuacao += pontos;
    }

    public void adicionarPitch(int qtd) { 
          contPitch += qtd; 
    }
    public void adicionarBug(int qtd) { 
        contBugs+= qtd; 
    }
    public void adicionarTracao(int qtd) { 
        contTracao+= qtd;
    }
    public void adicionarInvestidorIrritado(int qtd) {
        contIrritado+= qtd; 
    }
    public void adicionarFakeNews(int qtd) { 
        contFakeNews+= qtd; 
    }

    public String toString(){
       return ("Nome da Startup: " + this.nome + " Slogan da Startup: "+ this.slogan + " Ano de fundacao da Startup: " + anoFundacao);
    }

}
