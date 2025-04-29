import java.util.Arrays;

public class CadastroStartup
{
    private Startup[] vetorStartups;
    private int index;

    public CadastroStartup(){
        //criação de vetor de objetos
        this.vetorStartups = new Startup[8];
        this.index = 0;
    }

    public void validaParticipantes() {
    if(index != 4 && index != 8 && index !=6){
        throw new IndexOutOfBoundsException("Índice invalido!");
     }
    }
     
    public boolean adicionaStartup(Startup s1){
        if(this.index >= this.vetorStartups.length){
            return false;
        } else {
            this.vetorStartups[this.index] = s1;
            this.index++;
            return true;
        }
    }

    public Startup[] getStartups() {
        return Arrays.copyOf(this.vetorStartups, this.index);
    }

    public void mostraStartups(){
        for(int i = 0; i < this.index; i++)
            {
            System.out.println("\nCadastro de Startups " + (i+1)+ 
                                 "\n******** ** ******* ** *******");            
            System.out.println(this.vetorStartups[i].toString());
            }        
        }
    }
