package dga;

public class Cavalo extends Animal {
    
    public Cavalo(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public void emitirSom() {
        System.out.println("nome: " + this.nome);
        System.out.println("idade: " + this.idade);
        System.out.println("YENOGENO");
    }
    
}
