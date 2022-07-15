package Tiposdevariaveis;

public class CriacaoVariaveis {
    public static void main(String[] args) {

        int i; //variável simples inteira
        //int i; //variáveis não devem ter o mesmo nome
        int I;
        //int 1a; //não devem iniciar com números
        int _1a; //não devem iniciar com _
        int $aq;

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10;//variável constante
        //j = 15; //não pode mudar o valor da constante
        int asrn24678md;
        //int asrn246 78md;
        int asrn2$4678_md = 10;
        //int asrn2$46%78_md = 10; //erro devido a caracteres especiais

        asrn24678md = 100;
        asrn2$4678_md = 10;

        int quantidadeProduto = 50;
        //int QuantidadeProduto;
        final int NUMERO_TENTATIVAS = 5;
        //final int numeroTentativas = 5; //NÃO SEGUE BOAS PRÁTICAS
        int QUANTIDADE_OPCOES = 25;//NÃO SEGUE BOAS PRÁTICAS
        //int qtdProd; //SEM EXPRESSIVIDADE

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);

    }
}
