public class ProfessorHorista extends Professores{

    private int horas;
    private double valorHora;
    
    public ProfessorHorista(String nome, int h, double v) {
        super(nome);
        this.setHoras(h);
        this.setValorHora(v);
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
     
    public double calculaSalarioLiquido() {
        double v;
        v = this.getHoras()*this.getValorHora();
        return v - v*0.05;
    }
    
}
