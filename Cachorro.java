
public class Cachorro extends Animal {

    protected String raca;

    public Cachorro(String nome, String raça, double peso){
        super(nome,peso);

        this.raca=raça;

    }

public String getRaça(){
        return raca;
}
    public void setRaça(String raça){
        this.raca=raça;
    }


/* 
@Override
    public String toString(){
        return "Nome:" +nome
                +"\nPeso:" +peso
                +"\nRaça:" +raca;

  }
*/
@Override
    public String toString(){
        return super.toString() 
                +"\nRaça:" +raca;

  }
}
