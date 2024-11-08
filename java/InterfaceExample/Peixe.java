package InterfaceExample;

public class Peixe extends Animal implements AnimalDeEstimacao {

    private String nome;

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public Void setNome(String nome) {
        this.nome = nome;
        return null;
    }

    
    public Void brincar() {
        System.out.println("Brincando de nadar");
        return null;
    }

    @Override
    public void comer() {
        super.comer();
    }

}
