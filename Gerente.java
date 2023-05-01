public class Gerente extends Empregado{
    protected String nomegerencia;


    public Gerente(String nome,int idade,String sexo,Double salario, String matricula, String nomegerencia){
        super(nome,idade,sexo,salario,matricula);
        this.nomegerencia = nomegerencia;

    }

    public String getNomegerencia(){
        return nomegerencia;

    }

    public void setNomeGerencia(String nomegerencia){
        this.nomegerencia = nomegerencia;
    }

   @Override
    public String toString(){
        return super.toString()
        +"\nNomeGerencia:" +nomegerencia;
   }
}