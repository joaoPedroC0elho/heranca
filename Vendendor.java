public class Vendendor extends  Empregado{
    protected Double valorVendas;
    protected int qntVendas;

    public Vendendor(String nome,int idade,String sexo,Double salario,String matricula,Double valorVendas, int qntVendas){
        super(nome,idade,sexo,salario,matricula );

        setValorVendas(valorVendas);
        this.qntVendas = qntVendas;

    }

    public void setValorVendas(Double valorVendas){
        this.valorVendas = valorVendas;

    }
 public int getqntVendas(){
    return qntVendas;
 }

 public int setqntVendas(int qntVendas){
    return this.qntVendas = qntVendas;
 }
 @Override
 public String toString(){
     return super.toString()
     +"\nValorVendas:" +valorVendas
     +"\nQntVendas:" +qntVendas;
 }
}