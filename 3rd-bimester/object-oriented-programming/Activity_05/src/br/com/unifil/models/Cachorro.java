package br.com.unifil.models;

public class Cachorro extends Animal {
    public void latindo() {
        System.out.println("O cachorro está latindo");
    }

    @Override
    public String toString() {
        return "O nome do cachorro é " + getNome() + ", e sua idade é " + getIdade();
    }
}
