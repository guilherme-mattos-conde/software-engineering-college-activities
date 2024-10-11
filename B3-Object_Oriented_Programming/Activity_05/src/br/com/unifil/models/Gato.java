package br.com.unifil.models;

public class Gato extends Animal {
    public void miando() {
        System.out.println("O gato está miando!");
    }

    @Override
    public String toString() {
        return "O nome do gato é " + getNome() + ", e sua idade é " + getIdade();
    }
}
