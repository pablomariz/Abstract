public abstract class Produto {
     private String codigo, nome, descricao;
     private double preco;

    public Produto(String c, String n, String d, double p) {
        this.setCodigo(c);
        this.setNome(n);
        this.setDescricao(d);
        this.setPreco(p);
    }

    public abstract double calcularPrecoFinal();
     public abstract String imprimirDados();
         
     public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}