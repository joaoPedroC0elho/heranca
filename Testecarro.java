public class Testecarro {

    public static void main(String[] args){
        Carro carro1 = new Carro("rx-7","mazda",1997,"13B-REW",2000.0,"vermelho");
        Motor motor1 = new Motor("challenger","Dodge",2023," V8 6.2 l",2500.0,"preto",700, 88,6.2,"Super charger");
        Motorv8 motorv81 = new Motorv8("maverick","ford",1970,"302-V8",2000.0,"Nardo grey",4950,200,5.0,"aspirado",8);
        Pneu pneu1 = new Pneu("TOYO R888R","toyo tires",2023,"13B-REW",15.0,"Preto","toyo tires",15,15);

        System.out.println("Dados da pessoa: \n" + carro1.toString());

        System.out.println("----------------//------------");

        System.out.println("Dados do Fornecedor: \n" + motor1.toString());

        System.out.println("----------------//------------");

        System.out.println("Dados do empregado: \n" + motorv81.toString());

        System.out.println("----------------//------------");
    }
}
