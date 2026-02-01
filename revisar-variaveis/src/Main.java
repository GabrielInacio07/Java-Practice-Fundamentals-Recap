import D01.PessoaEstudante;

class Main{
    public static void main(String[] args) {
    System.out.println("Revisão de TIPOS/VARIÁVEIS");

        PessoaEstudante pessoa_estudante = new PessoaEstudante("João",21,1.90,false);

        //Verificando escopo

        if (pessoa_estudante.isEstudante()){
            System.out.println(pessoa_estudante.getNome() + " é um estudante");
            System.out.println(pessoa_estudante.toString());
        }else{
            System.out.println(pessoa_estudante.getNome() + " não é um estudante");
        }

    }
}