public class Bolo{
    
    private String cobertura;
    private String recheio;
    private String tamanho;
    
    public void setCobertura(String cobertura) {
        this.cobertura= cobertura;
    }
    
    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }
    
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    @Override
    public String toString() {
        return "Tamanho do Bolo: " + tamanho + ", cobertura: " + cobertura + ", recheio: " + recheio;
    }


}