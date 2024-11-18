public class Leao extends Animal implements ComportamentoAlimentar{

    public Leao(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void fazerSom() {
        System.out.println("soom leao");
    }

    @Override
    public void alimentar() {

    }
}
