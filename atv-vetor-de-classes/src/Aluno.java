public class Aluno {

    int matricula;
    String nome;
    double nota1;
    double nota2;
    double nota3;
    double mediafinal;

    Aluno (int matricula, String nome, double nota1, double nota2, double nota3, double mediafinal){
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.mediafinal = mediafinal;
    }
    public String toString() {
        return String.format("{ Nome = %s, Matricula = %d, , Média final = %.2f }",
                this.nome, this.matricula, this.mediafinal);
    }
}
