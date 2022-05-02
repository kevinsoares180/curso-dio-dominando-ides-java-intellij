package br.com.dio;
import model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);
        Livro livro = new Livro("O segredo dos 3 porcos", 300);
        System.out.println(livro);
/*      int a = 5;
        int b = 3;
        System.out.println("Hello World " + (a+b));*/
    }
}
class Livro {
    private String nome;
    private int numPages;

    public Livro(String nome, int numPages) {
        this.nome = nome;
        this.numPages = numPages;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPages=" + numPages +
                '}';
    }
}
