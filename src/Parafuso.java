public class Parafuso  extends Produto{
   
    private double comprimento, diametro;
    
    public Parafuso(String c, String n, String d, double p, double co, double di) {
        super(c, n, d, p);
        this.setComprimento(co);
        this.setDiametro(di);
    }
    
     public double calcularPrecoFinal() {
       return getPreco() + getPreco()*0.15;
    }
   
    public String imprimirDados() {
        return "Codigo: "+getCodigo()+ "|| Nome: " + getNome() + "|| Descrição: " + getDescricao() + "|| Valor: " + getPreco()+"\n Potencia: " + this.getComprimento()+"|| RPM: "+ this.getDiametro();
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
}