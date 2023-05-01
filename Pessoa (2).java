public class Pessoa{
    protected String nome;
    protected int idade;
    protected String sexo;

    public Pessoa(String nome,int idade,String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;

    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;

    }
    
    public int getIdade(){
        return idade;
    }
    public int setIdade(int idade){
        return this.idade = idade;

    }

    public String getSexo(){
        return sexo;

    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    @Override
    public String toString(){
        return "NOME:" +nome
        +"\nIdade:" +idade
        +"\nSexo:"  +sexo;
    }

}