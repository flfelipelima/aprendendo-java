package project.test.aula.introducao;

public class Operadores {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(b-a);
        System.out.println(a+b);
        System.out.println(b/a);
        System.out.println(a*b);

        /*
        * Operadores Logicos
        * % resto da divisao
        * == comparacao
        * =! diferente
        * < menor
        * > maior
        * <= menor igual
        * >= maior igual
        * */

        boolean isDezMaiorVinte = 10 > 20;
        boolean isDezMenorVinte = 10 < 20;
        boolean isDezMaiorIgualVinte = 10 >= 20;
        boolean isDezIgualDez = 10 <= 10;
        boolean isDezDiferenteVinte = 10 != 20;


        System.out.println(isDezMaiorVinte);
        System.out.println(isDezMenorVinte);
        System.out.println(isDezMaiorIgualVinte);
        System.out.println(isDezIgualDez);
        System.out.println(isDezDiferenteVinte);
    }
}
