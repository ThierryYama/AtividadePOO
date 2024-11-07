public class BuilderBolo implements Builder {

    private Bolo bolo;

    public BuilderBolo() {
        this.bolo = new Bolo();
    }

    @Override
    public Builder adicionarCobertura(String cobertura) {
        bolo.setCobertura(cobertura);
        return this;
    }

    @Override
    public Builder adicionarRecheio(String recheio) {
        bolo.setRecheio(recheio);
        return this;
    }

    @Override
    public Builder adicionarTamanho(String tamanho) {
        bolo.setTamanho(tamanho);
        return this;
    }

    @Override
    public Bolo getBolo() {
        return this.bolo;
    }

}
