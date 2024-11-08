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

    
    public String brincar() {
        return "Brincando de nadar";
    }

    @Override
    public void comer() {
        super.comer();
    }

}
