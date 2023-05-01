public class Motorv8 extends Motor{
    private double litragem;



    public Motorv8(String modelo, String fabricante, int ano, String motor, double peso, String cor, int cilindradas, int potencia, double combustivel, String tipo, double litragem){
        super(modelo, fabricante, ano, motor, peso, cor, cilindradas, potencia, combustivel, tipo);
        setlitragem(litragem);


    }

    public void setlitragem(double litragem) {
        this.litragem = litragem;
    }



    @Override
    public String toString() {
        return super.toString()
                + "\nValorDivida:" +litragem;
    }
}
