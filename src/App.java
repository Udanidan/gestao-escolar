public class App {
    public static void main(String[] args) throws Exception {
        Turma turma = new Turma(0, "3SEM_ADS");

        Aluno a1 = new Aluno(1, "Francisco");
        Aluno a2 = new Aluno(2, "Gabriel");
        Aluno a3 = new Aluno(3, "Yago");

        System.out.println(turma.capacidadeTurma());
        turma.inserir(a1);
        turma.inserir(a2);
        turma.inserir(a3);
        System.out.println(turma.capacidadeTurma());
        
    }
}
