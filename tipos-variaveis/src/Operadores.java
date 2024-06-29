
public class Operadores {

    public static void main(String[] args) {

        int a, b, c, d;

        a = 5;
        b = 6;
        c = 7;
        d = 7;

        String resultado = "";

        if (a == b) {
            resultado = "verdadeiro"; 
        }else {
            resultado = "falso";
        }

        System.out.println(resultado);

        // classe Operadores.java
        // EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
//MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String resultado2 = (c == d) ? "verdadeiro" : "false";

        System.out.println(resultado2);

//Operadores Relacionais
        int numero1 = 1;
        int numero2 = 5;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual ao numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente do numeroDois? " + simNao);

        simNao = numero1 >= numero2;

        System.out.println("numeroUm é maior ou igual ao numeroDois? " + simNao);

        simNao = numero1 <= numero2;

        System.out.println("numeroUm é menor ou igual ao numeroDois? " + simNao);

        if (numero1 > numero2) {
            System.out.println("a nossa condição é verdadeira");
        }

        while (numero1 < numero2) {
            System.out.println(numero1);
            numero1++;
        }

        String nomeUm = "Thiago";
        String nomeDois = new String("Thiago");

        System.out.println(nomeUm == nomeDois);

        //Para comparar se o conteúdo de um objeto é igual ao conteúdo de outro objeto use o metodo:equals
        System.out.println(nomeUm.equals(nomeDois));

        // Operadores.java
        boolean condicao1 = true;

        boolean condicao2 = false;

        /* Aqui estamos utilizando o operador lógico 'E' para fazer a união de duas 
expressões. 
É como se estivesse escrito:
 "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
         */
        if (condicao1 && condicao2) {
            System.out.print("Os dois valores precisam ser verdadeiros");
        };

//Se condicao1 'OU' condicao2 for verdadeira, executar código.
        if (condicao1 || condicao2) {
            System.out.print("Um dos valores precisa ser verdadeiro");
        }

    }

}
