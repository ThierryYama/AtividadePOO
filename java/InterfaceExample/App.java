package InterfaceExample;

public class App {
    
    public static void main(String[] args) {
        AnimalDeEstimacao cachorro = new Cachorro();
        AnimalDeEstimacao peixe = new Peixe();

        Animal formiga = new Formiga();

        cachorro.setNome("Dog");
        System.out.println(cachorro.getNome());
        System.out.println(cachorro.brincar());

        peixe.setNome("Fish");
        System.out.println(peixe.getNome());
        System.out.println(peixe.brincar());

        formiga.caminhar();
        formiga.comer();

    }

}
