

public class Peixe extends Animal {

    
    protected String habitat;


    public Peixe(String habitat, String nome, double peso){
        super(nome, peso);
        

        this.habitat = habitat;
    }


    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

 /*  
@Override
    public String toString(){

return"nome:" +nome
        +"\nPeso:" +peso
        +"\nHabitat:" +habitat;

   }
   */  
  @Override
    public String toString(){
        return super.toString() 
                +"\nhabitat:" +habitat;

  }
}
