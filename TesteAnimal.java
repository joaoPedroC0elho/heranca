

public class TesteAnimal {
   

        public static void main(String[] args){
            Animal a = new Animal("Cachorro e peixe",(double) 20);
            Cachorro c = new Cachorro("iron",  "shih tzu", (double)7);
            Peixe p = new Peixe("agua doce", "tilapia", (double)50);
    
            System.out.println("dados dos animais: \n" +a.toString());

            System.out.println("------//----------");
        
            System.out.println("Dados do cachorro: \n" +c.toString());

            System.out.println("------//----------");
        
            System.out.println("Dados do peixe: \n" +p.toString());
        }

    }
    

