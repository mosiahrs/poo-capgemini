package ExerciciosPooJava;

/*
5. Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina. Cada objeto dessa
classe deve guardar os seguintes dados do aluno: matrícula, nome, 2 notas de prova e 1 nota de trabalho.
Escreva os seguintes métodos para esta classe:
a. media: calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2)
b. final: calcula quanto o aluno precisa para a prova final (retorna zero se ele não for para a final)

 */
public class AlunosMatriculados {

    private String matricula;
    private String nome;
    private float notaProva1;
    private float notaProva2;
    private float notaTrabalho;
    private float media;

    public AlunosMatriculados(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public float getNotaProva1() {
        return notaProva1;
    }

    public void setNotaProva1(float notaProva1) {
        this.notaProva1 = notaProva1;
    }

    public float getNotaProva2() {
        return notaProva2;
    }

    public void setNotaProva2(float notaProva2) {
        this.notaProva2 = notaProva2;
    }

    public float getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(float notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

    public float calculaMedia(float notaProva1, float notaProva2, float notaTrabalho) {
        this.media = ((notaProva1 * 2.5f) + (notaProva2 * 2.5f) + (notaTrabalho * 2.0f)) / notaProva1 + notaProva2 + notaTrabalho;
        return this.media;
    }

}
