public class Testedois {

    public static void main(String[] args){
       Pessoa people1 = new Pessoa("Joao","qi31","123455");
        Fornecedor fornecedor1 = new Fornecedor("fidalgo","sla","123333",1000.0,500.0);
        Empregado pregado1 = new Empregado("FRANKLIN","rua 20","333333",11111,7000.0,200.0);

        System.out.println("Dados da pessoa: \n" +people1.toString());

        System.out.println("----------------//------------");

        System.out.println("Dados do Fornecedor: \n" +fornecedor1.toString());

        System.out.println("----------------//------------");

        System.out.println("Dados do empregado: \n" +pregado1.toString());

    }
}