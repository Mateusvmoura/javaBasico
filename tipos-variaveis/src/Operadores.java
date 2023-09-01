public class Operadores {
    public static void main (String [] args) {
        // Atribuição
            // O operador de atribuição é utilizado para definir o valor inicial ou sobrescrever o valor de uma variável. 
            String nome = "GLEYSON";
            int idade = 22;
            double peso = 68.5;
            char sexo = 'M';
            boolean doadorOrgao = false;
        
        // Aritméticos
            // O operador aritmético, é utilizado para realizar operações matemáticas entre valores numéricos, podendo se tornar ou não uma expressão mais complexa.
            double soma = 10.5 + 15.7;
            int subtração = 113 - 25;
            int multiplicacao = 20 * 7;
            int divisao = 15 / 3;
            int modulo = 18 % 3; // Resto da divisão
            double resultado = (10 * 7) + (20/4);

            // O operador de adição (+), quando utilizado em variáveis do tipo texto, realizará a “concatenação de textos”.
            String concatenacao ="?"; 

            concatenacao = 1+1+1+"1";
            concatenacao = 1+"1"+1+1;
            concatenacao = 1+"1"+1+"1";
            concatenacao = "1"+1+1+1;
            concatenacao = "1"+(1+1+1);

        // Unários
            /*
            * (+) Operador unário de valor positivo – números são positivos sem esse operador explicitamente;
            * (-) Operador unário de valor negativo – nega um número ou expressão aritmética;
            * (++) Operador unário de incremento de valor – incrementa o valor em 1 unidade;
            * (--) Operador unário de decremento de valor – decrementa o valor em 1 unidade;
            * (!) Operador unário lógico de negação – nega o valor de uma expressão booleana.
            */

            //Ternário
            // <Expressão Condicional>`` ?``<Caso condição seja true>``: ``<Caso condição seja false> 

            int a, b;

            a = 5;
            b = 6;

            /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
            if(a==b)
            resultado = "verdadeiro";
            else
            resultado = "falso";
            */

            //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
            String resultado = (a==b) ? "verdadeiro" : "false";

            System.out.println(resultado);
        
        // Relacionais
            /*
            * == Quando desejamos verificar se uma variável é IGUAL A outra.
            * != Quando desejamos verificar se uma variável é DIFERENTE da outra.
            *  > Quando desejamos verificar se uma variável é MAIOR QUE a outra.
            * >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
            * < Quando desejamos verificar se uma variável é MENOR QUE outra.
            * <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.
            */

            int numero1 = 1;
            int numero2 = 2;

            if(numero1 > numero2)
               System.out.print("Numero 1 maior que numero 2");

            if(numero1 < numero2)
               System.out.print("Numero 1 menor que numero 2");

            if(numero1 >= numero2)
               System.out.print("Numero 1 maior ou igual que numero 2");

            if(numero1 <= numero2)
               System.out.print("Numero 1 menor ou igual que numero 2");

            if(numero1 != numero2)
               System.out.print("Numero 1 é diferente de numero 2");

        // Lógicos
            // Os operadores lógicos, representam o recurso que nos permite criar expressões lógicas maiores, a partir da junção de duas ou mais expressões.
            /*
             * && Operador Lógico "E"
             * || Operador Lógico "OU"
            */
    }
}
