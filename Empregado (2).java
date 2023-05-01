public class Empregado extends Pessoa{
    protected Double salario;
    protected String matricula;


    public Empregado(String nome, int idade, String sexo,Double salario, String matricula){
        super(nome, idade, sexo);
        setSalario(salario);
        this.matricula = matricula;

    }



    public void setSalario(Double salario){
        this.salario = salario;

    }

    public String getMatricula(){
        return matricula;
    }
    public void setMatriucla(String matricula){
        this.matricula = matricula;
    }
    
      public double valorInss() {
        return salario * 0.11;
    }

    public String toString(){
        return super.toString()
        +"\nSalario:" + salario
        +"\nMatricula" +matricula;
    }
}