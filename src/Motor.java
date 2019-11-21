public class Motor extends Produto{
    
    private double potencia, rpm;
    
    public Motor(String c, String n, String d, double p, double po, double r) {
        super(c, n, d, p);
        this.setPotencia(po);
        this.setRpm(r);
    }

    public double calcularPrecoFinal() {
       return getPreco() - getPreco()*0.05;
    }
   
    public String imprimirDados() {
        return "Codigo: "+getCodigo()+ "|| Nome: " + getNome() + "|| Descrição: " + getDescricao() + "|| Valor: " + getPreco()+"\n Potencia: " + this.getPotencia()+"|| RPM: "+ this.getRpm();
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getRpm() {
        return rpm;
    }

    public void setRpm(double rpm) {
        this.rpm = rpm;
    }    
}