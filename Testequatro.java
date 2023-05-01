public class Testequatro {
    public static void main(String[] args){
        Pessoa people1 = new Pessoa("Joao", "qi31", "123455");
        Fornecedor fornecedor1 = new Fornecedor("fidalgo", "sla", "123333", 1000.0, 500.0);
        Empregado pregado1 = new Empregado("FRANKLIN", "rua 20", "333333", 11111, 7000.0, 200.0);
        Administrador administrador1 = new Administrador("Trevor", "rua 31", "222222", 232323, 15000.0, 2500.0, 3500.0);
        Operario operario1 = new Operario("Limas","30trinta","21212121",343434,65000.0,1200.0,54.0,2000.0);



        System.out.println("Dados da pessoa: \n" + people1.toString());

        System.out.println("----------------//------------");

        System.out.println("Dados do Fornecedor: \n" + fornecedor1.toString());

        System.out.println("----------------//------------");

        System.out.println("Dados do empregado: \n" + pregado1.toString());

        System.out.println("----------------//------------");

        System.out.println("Dados de operario: \n" + operario1.toString());
    }
}
