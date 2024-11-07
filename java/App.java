public class App {
    public static void main(String[] args) {
        Builder builder = new BuilderBolo();
        Diretor diretor = new Diretor(builder);

        Bolo boloPequeno = diretor.buildBoloPequenoSemCobertura();
        System.out.println(boloPequeno);

        Bolo boloGrande = diretor.buildBoloGrande();
        System.out.println(boloGrande);
    }
}
