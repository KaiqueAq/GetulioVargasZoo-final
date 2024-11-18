public class Elefante extends Animal implements ComportamentoAlimentar{

    public Elefante(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void fazerSom() {
        System.out.println("soom elefante");
    }

    @Override
    public void alimentar() {

    }
}
