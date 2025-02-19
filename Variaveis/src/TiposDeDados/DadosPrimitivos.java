package TiposDeDados;

/*
Conceito de boilerplate - basicamente uma "receita de bolo" que o Java inicia automaticamente
 */

// Classe Publica
public class DadosPrimitivos {
    //Tudo que esta dentro do {} é a nossa aplicação
    public static void main(String[] args) {
        /*
            public (Modificador de Acesso)
            static (Método Estático)
            void (Tipo de Retorno)
            main (Nome do Método)
            (String[] args) (Parâmetro do Método)
         */

        /*
            - Dados Primitivos - int, double, float, char, boolean, short
            - Objetivo da aula: Criar um aluno Hogwarts
            - ";" significa que aquela linha acabou e pode ir para a próxima
         */

        int idade = 11; // Valor Máximo 2 147 483 647
        double altura = 1.40;
        char inicial = 'H';
        boolean vivoOuMorto = true;
        long saldo = 10000; // Usei o Long para evitar futuros problemas
    }
}
