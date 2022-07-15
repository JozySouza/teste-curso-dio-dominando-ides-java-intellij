package br.com.dio;

import br.com.dio.model.Gato;

import java.util.Scanner;

public class PrimeiroPrograma {
   
    public static void main(String[] args, String nome, Integer numPaginas) {
        Gato gato = new Gato();
        System.out.println(gato);
        Scanner scan = new Scanner(System.in);

        Livro livro1 = new Livro(nome:"o problema dos 3 corpos", numPaginas: 300);
        System.out.println(livro1);

        /*int a = 5;
        int b = 3;
        System.out.println("Hello World! " + (a+b));*/
    }
    public class Livro{
        private String nome;
        private Integer numPaginas;

        public Livro(String nome, Integer numPaginas) {
            this.nome = nome;
            this.numPaginas = numPaginas;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Integer getNumPaginas() {
            return numPaginas;
        }

        public void setNumPaginas(Integer numPaginas) {
            this.numPaginas = numPaginas;
        }

        @Override
        public String toString() {
            return "Livro{" +
                    "nome='" + nome + '\'' +
                    ", numPaginas=" + numPaginas +
                    '}';
        }
    }
}
