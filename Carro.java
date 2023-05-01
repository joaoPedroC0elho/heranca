public class Carro {
    private String modelo;
    private String fabricante;
    private int ano;
    private String motor;
    private double pes0;
    private String cor;

    public Carro(String modelo, String fabricante, int ano, String motor, double peso, String cor) {
        setpes0(pes0);
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.ano = ano;
        this.motor = motor;
        this.cor = cor;

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getAno() {
        return ano;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setpes0(double pes0) {
        this.pes0 = pes0;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nValorDivida:" + modelo
                + "\nQual o fabricante:" + fabricante
                + "\nAno do carro:" + ano
                + "\nMotor:" + motor
                + "\nPeso do carro:" + pes0
                + "\nCor:" + cor;

    }
}
