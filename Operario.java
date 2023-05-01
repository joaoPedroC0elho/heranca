public class Operario extends Empregado {
    private double valorProducao;
    private double comissao;

    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        setvalorProducao(valorProducao);
        setcomissao(comissao);

    }

    public void setvalorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public void setcomissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nValor de producao:" + valorProducao
                + "\nComissao:" + comissao;

    }
}