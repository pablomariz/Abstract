public class TestaProfessor {
    public static void main(String[] args) {
        
        ProfessorIntegral pI = new ProfessorIntegral("João", 1000);
        ProfessorHorista pH = new ProfessorHorista("Pablo", 450, 10);
        
        System.out.println("Salario do Professor Integral " + pI.getNome() +", é: "+ pI.calculaSalarioLiquido());
        System.out.println("Salario do Professor Horista " + pH.getNome() +", é: "+ pH.calculaSalarioLiquido());
        
    }
}