/*
FAMILIA   -   TIPO PRIMITIVO  -   WRAPPER CLASS   -   TAMANHO
LOGICO      -   boolen          -   Boolean         -   1 Byte
LITETAIS    -   char            -   Character       -   1 byte
            -                   -   String          -   1 Byte / cada
INTEIROS    -   byte            -   Byte            -   1 Byte
            -   short           -   Short           -   2 byte
            -   int             -   Integer         -   4 Byte   
            -   long            -   Long            -   8 Byte
REAIS       -   float           -   Float           -   4 Byte
            -   double          -   Double          -   8 Byte

            <Tipo> <nomeVariavel> <atribuicaoDeValorOpcional>
 */


public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        byte idade = 123;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo; precisa terminar com L
		float pi = 3.14F; // precisa terminar com F 
		double salario = 1275.33;
    // Definindo Constantes
        /*
		 * ao usar a palavra reservada final, você determina que jamais
		 * esta variavel poderá obter outro valor;
		 * logo a linha 25 vai apresentar um erro de compilação
		 * isso é considerado uma CONSTANTE na linguagem Java
		 */
		final double VALOR_DE_PI = 3.14;
		
		VALOR_DE_PI=3.15; //Esta linha vai apresentar erro de compilação!

    }
}
