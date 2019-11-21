public  abstract class Professores {
    private String nome;

    public Professores(String nome) {
        this.nome = nome;
    }
    
    public abstract double calculaSalarioLiquido();
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
     
     
}