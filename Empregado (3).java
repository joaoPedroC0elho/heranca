public class Empregado extends Pessoa {

    private int codigoSetor;
    private double SalarioBase;
    private double Imposto;

    public pregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase,double imposto){
        super(nome, endereco, telefone);
        setSalarioBase(salarioBase);
        setImposto(imposto);

    }



    public int getCodigoSetor(){
        return codigoSetor;
     }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }



    public void setSalarioBase(double salarioBase) {
        this.SalarioBase = salarioBase;
    }




    public void setImposto(double imposto) {
        this.Imposto = imposto;
    }
    public double calcularSalario() {
        return SalarioBase - (SalarioBase * (Imposto / 100));
    }

    @Override
    public String toString(){
        return super.toString()
                +"\nCodigoSetor:" +codigoSetor
                +"\nSalariobase:" +SalarioBase
                +"\nImposto:" +Imposto;

    }
}
