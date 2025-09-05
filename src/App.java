import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Turma turma = new Turma(10, "3SEM_ADS");
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        do {
            try {
                System.out.println(" \n [1] inserir \n [2] Buscar \n [3] Remover \n [4] Listar \n [5] capacidade atual \n [0] sair");
                opcao = Integer.parseInt(sc.nextLine());
                switch (opcao) {
                    case 1:
                        System.out.println("RA: ");
                        int ra = Integer.parseInt(sc.nextLine());

                        System.out.println("Nome: ");
                        String nome = sc.nextLine();

                        boolean status = turma.inserir(new Aluno(ra, nome));

                        // ternario
                        // condicao_logica ? if:else
                        System.out.println(status ? "Inserido com Sucesso": "Falha ao Inserir");

                        break;
                    
                    case 2:
                        System.out.println("RA: ");
                        ra = Integer.parseInt(sc.nextLine());
                        Aluno aluno = turma.localizarRA(ra);

                        System.out.println(aluno.getNome());
                        break;
                    case 3:
                        System.out.println("RA: ");
                        ra = Integer.parseInt(sc.nextLine());
                        boolean removido = turma.remover(ra);
                        System.out.println(removido ? "Aluno removido com Sucesso" : "Falha ao remover");
                        break;
                    case 4:
                        Aluno[] alunos = turma.listar();
                        for(Aluno aluna : alunos){
                            System.out.println("Aluno: " + aluna.getNome());
                        }
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {
            
            }
        } while (opcao != 0);
        sc.close();

        // Aluno a1 = new Aluno(1, "Francisco");
        // Aluno a2 = new Aluno(2, "Gabriel");
        // Aluno a3 = new Aluno(3, "Yago");

        // System.out.println(turma.capacidadeTurma());
        // turma.inserir(a1);
        // turma.inserir(a2);
        // turma.inserir(a3);
        // System.out.println(turma.capacidadeTurma());
        
    }
}
