package atvd11;

public class Main {
    public static void main(String[] args) {
        Diretor diretor = new Diretor(null, null, 0, null, null);
        diretor.setNome("Marques");
        diretor.criarDescontos();
        diretor.gerenciarProfessores();
    }
}
