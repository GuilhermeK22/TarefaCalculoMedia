public class TarefaCalculoMedia {
    public static void main(String arg []) {
        mediaAlunos();
    }
    private static void mediaAlunos() {
        System.out.println("   Média Aluno EBAC    ");
        int num1 = 7;
        int num2 = 7;
        int num3 = 9;
        int num4 = 6;
        int num5 = (num1 + num2 + num3 + num4)/4;
        if (num5 >= 6) {
            System.out.println("Aluno Aprovado, Média Final:" + num5);
        }
        else if (num5 < 6) {
            System.out.println("Aluno Reprovado, Média Final:" + num5);
        }
    }
}
