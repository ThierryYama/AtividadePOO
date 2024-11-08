package InterfaceExample;

public class Cachorro extends Animal implements AnimalDeEstimacao {
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

    @Override
    public Void brincar() {
        System.out.println("Brincando de pegar a bolinha");
        return null;
    }

    @Override
    public void comer() {
        super.comer();
    }
}
