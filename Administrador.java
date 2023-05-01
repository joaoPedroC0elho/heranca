public class Administrador extends Empregado{

    private double ajudaDeCusto;

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase,double imposto,double ajudaDeCusto){
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        setajudaDeCusto(ajudaDeCusto);
    }

    public void setajudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;

    }
    @Override
public String toString(){
        return super.toString()
                +"\nAjuda de custo:" +ajudaDeCusto;



    }

}
