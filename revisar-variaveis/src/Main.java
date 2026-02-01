import D01.PessoaEstudante;

import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        System.out.println("Revisão de TIPOS/VARIÁVEIS");
        System.out.println("Exercício fazendo arredondamento DE VALORES");
        Scanner input = new Scanner(System.in);


        double nota = 0;
        double nota2 = 0;
        double nota3 = 0;
        double resultado = 0;

        System.out.println("=============================");
        System.out.println("Digite a sua [PRIMEIRA] nota");
        nota = Double.parseDouble(input.nextLine());
        System.out.println("Digite a sua [SEGUNDA] nota");
        nota2 = Double.parseDouble(input.nextLine());
        System.out.println("Digite a sua [TERCEIRA] nota");
        nota3 = Double.parseDouble(input.nextLine());

        resultado = (nota + nota2 + nota3) / 3;

        System.out.println("A média das notas: " + resultado);
        System.out.println("Média arredondada: " + Math.round(resultado));

        input.close();
    }
}