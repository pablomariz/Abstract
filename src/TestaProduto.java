public class TestaProduto {
    public static void main(String[] args) {
        
    
    
    Motor m = new Motor("XXXX1", "Fusca", "Motor tals", 1000.10, 100, 1000);
    Parafuso f = new Parafuso("XXXX1", "Parafuso de Rosca", "Bom", 10.10, 10, 5);
    
    System.out.println(m.imprimirDados());
    System.out.println("Preço Final: "+ m.calcularPrecoFinal());
    
    System.out.println(f.imprimirDados());
    System.out.println("Preço Final: "+ f.calcularPrecoFinal());
    
    } 
}