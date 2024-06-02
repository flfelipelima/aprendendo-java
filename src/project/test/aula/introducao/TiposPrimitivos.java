package project.test.aula.introducao;

//psvm, para public static void main//
//sout, para System.out.println()//
//tipos primitivos: int, float, double, char, byte, boolean, short, long//

import java.net.SocketOption;

public class TiposPrimitivos {
    public static void main(String[] args) {
        int age = 18;
        long numeroGrande = 100000L;
        double salarioDouble = 2000.0D;
        float salarioFloat = 2000.0F;
        byte idadeByte = 127;
        short idadeShort = 10;
        boolean falso = false;
        boolean verdadeiro = true;
        char caractere = '\u0041';
        String nome = "Felipe";

        System.out.println("A idade é: "+age+" anos.");
        System.out.println("char " +caractere);
        System.out.println(verdadeiro);
        System.out.println("Meu nome é "+nome);
    }
}
