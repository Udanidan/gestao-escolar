public class Turma {
    // 1 turma tem N alunos
    // vamos usar vetor / Array

    private Aluno alunos[]; //Vetor de Alunos 1->N
    private String semestre;
    private int capacidade;
    private int tamanho;

    public Turma(int capacidade, String semestre){
        if(capacidade<=0){
            // System.out.println("Capacidade invalida");
            throw new IllegalArgumentException("Capacidade invalida");
        } else{
            // Definindo tamanho do vetor
            this.alunos = new Aluno[capacidade];
            this.semestre = semestre;
            this.tamanho = 0;
        }
    }

    public boolean inserir(Aluno aluno){
        if(tamanho == alunos.length){
            return false;
        } else{
            alunos[tamanho++] = aluno;
            return true; // O aluno foi inserido no vetor
        }
    }
    public boolean remover(int ra){
        for(int i = 0; i<tamanho; i++){
            if(alunos[i].getRa() == ra){
                alunos[i] = alunos[tamanho-1];
                alunos[tamanho-1] = null;
                tamanho--;
                return true;
            }
        }
        return false;
    }

    public Aluno localizarRA(int ra){
        for(int i = 0; i<tamanho; i++){
            if(alunos[i].getRa() == ra){
                return alunos[i];
            }
        }
        return null;
    }

    public Aluno[] listar(){
        Aluno[] copia = new Aluno[tamanho]; //Copia os elementos da lista original
        for(int i = 0; i < tamanho; i++){
            copia[i] = alunos[i];
        }
        return copia;
    }

    public int capacidadeTurma(){
        return alunos.length - tamanho;
    }
}
