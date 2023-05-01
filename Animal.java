
public class Animal {
    protected String nome;
    protected Double peso;

    public Animal(String nome, Double peso) {
        setPeso(peso);
        this.nome = nome;

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(double peso) {
      
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Nome:" + nome
             +"\nPeso:" +peso;
    }
}