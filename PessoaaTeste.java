public class PessoaaTeste {
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa("joao",20,"masculino");
        Cliente cliente1 = new Cliente("isa", 30,"femino", 20.0, 1990);
        Empregado empregadoa1 = new Empregado("Vini",20,"masculino",5000.0,"123456");
        Gerente gerente1 = new Gerente("Antonio",40,"masculino",35000.0,"098765","dcAntonio");
        Vendendor vendendor1 = new Vendendor("Lucas",23,"masculino",50000.0,"23456",1000000000000.0,100);

    System.out.println("Dados da pessoa: \n" +pessoa1.toString());


         System.out.println("----------------//------------");

    System.out.println("Dados do cliente \n" +cliente1.toString());


        System.out.println("----------------//------------");

    System.out.println("Dados do empregado \n" +empregadoa1.toString());


        System.out.println("----------------//------------");



    System.out.println("Dados do vendedor \n " +vendendor1.toString());

    }


}
