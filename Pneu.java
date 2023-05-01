public class Pneu extends Carro{
    private String marca;
    private int largura;
    private int aro;

    public Pneu(String modelo, String fabricante, int ano, String motor, double peso, String cor,String marca,int largura,int aro){
        super(modelo, fabricante, ano, motor, peso, cor);
        this.marca = marca;
        this.largura = largura;
        this.aro = aro;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    @Override
    public String toString() {
        return super.toString()
                + "\nValorDivida:" +marca
                + "\nValorDivida:" +largura
                + "\nValorDivida:" +aro;
    }

}
