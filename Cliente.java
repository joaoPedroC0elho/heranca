public class Cliente extends  Pessoa {
    protected Double valorDivida;
    protected int anoNascim;

    public Cliente(String nome, int idade, String sexo, Double valorDivida, int anoNascim){
        super(nome, idade, sexo);
        setvalorDivida(valorDivida);
        
       this.anoNascim = anoNascim;


    }

    public void setvalorDivida(Double valorDivida){
        this.valorDivida = valorDivida;

    }

    public int getAnoNascim(){
        return anoNascim;
    }
    public int setAnoNascim(int anoNascim){
        return this.anoNascim = anoNascim;
    }
     @Override
     public String toString(){
        return super.toString()
         +"\nValorDivida:" +valorDivida
         +"\nAnoNascim:"  +anoNascim;
     }
}  