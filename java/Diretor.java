public class Diretor {
    private Builder builder;

    public Diretor(Builder builder) {
        this.builder = builder;
    }

    public Bolo buildBoloPequenoSemCobertura() {
        return builder.adicionarRecheio("Creme de baunilha").adicionarTamanho("Pequeno").getBolo();
    }
    public Bolo buildBoloGrande () {
        return builder.adicionarCobertura("Morango").adicionarRecheio("Chantilly").adicionarTamanho("Grande").getBolo();
    }
}
