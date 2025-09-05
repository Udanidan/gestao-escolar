public class Aluno {
    private int ra;
    private String nome;

    // Construtor responsavel por atribuir valor aos nossos atributos
    public Aluno(int ra, String nome){
        this.ra = ra;
        this.nome = nome;
    }

    // Métodos setter para alterar os valores dos atributos 
    public void setRa(int ra){
        this.ra = ra;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    // Métodos getters para resgatar os atributos;
    public int getRa(){
        return this.ra;
    }
    public String getNome(){
        return this.nome;
    }
}
