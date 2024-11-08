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
    public String brincar() {
        return "Brincando de pegar a bolinha"; 
    }

    @Override
    public void comer() {
        super.comer();
    }
}
