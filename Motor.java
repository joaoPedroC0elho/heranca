public class Motor extends Carro {
    private int cilindradas;
    private int potencia;
    private double combustivel;
    private String tipo;

    public Motor(String modelo, String fabricante, int ano, String motor, double peso, String cor, int cilindradas, int potencia, double combustivel, String tipo) {
        super(modelo, fabricante, ano, motor, peso, cor);
        setcombustivel(combustivel);
        this.cilindradas = cilindradas;
        this.potencia = potencia;
        this.tipo = tipo;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setcombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nValorDivida:" + cilindradas
                + "\nQual o fabricante:" + potencia
                + "\nAno do carro:" + combustivel
                + "\nMotor:" + tipo;
    }
}
