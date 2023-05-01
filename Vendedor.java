public class Vendedor extends Empregado {
    private double valorVendas;
    private double C0missao;


    public reseller(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        setvalorVendas(valorVendas);
        setC0missao(C0missao);
    }


    public void setvalorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public void setC0missao(double c0missao) {
        C0missao = c0missao;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nValor de vendas:" + valorVendas
                + "\nComissao:" + C0missao;
    }
}
