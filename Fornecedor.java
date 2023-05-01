public class Fornecedor extends Pessoa{
    protected Double valorCredito;
    protected Double valorDivida;

    public Fornecedor(String nome, String endereco, String telefone, Double valorCredito, Double valorDivida){
        super(nome, endereco, telefone);
        setvalorDivida(valorDivida);
        setValorCredito(valorCredito);

    }



    public void setvalorDivida(Double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public void setValorCredito(Double valorCredito) {
        this.valorCredito = valorCredito;
    }
    public double obterSaldo() {
        return valorCredito - valorDivida;
    }
    @Override
    public String toString(){
        return super.toString()
                +"\nValor credito:" +valorCredito
                +"\nValor divida:" +valorDivida;

    }
}
