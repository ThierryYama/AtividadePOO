package InterfaceExample;

public class App {
    
    public static void main(String[] args) {
        AnimalDeEstimacao cachorro = new Cachorro();
        AnimalDeEstimacao peixe = new Peixe();

        Animal formiga = new Formiga();

        cachorro.setNome("dog");
        System.out.println(cachorro.getNome());

        peixe.setNome("FISH");
        System.out.println(peixe.getNome());

        formiga.caminhar();
        formiga.comer();

    }

}
