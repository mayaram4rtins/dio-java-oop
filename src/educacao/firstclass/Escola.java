package educacao.firstclass;

public class Escola {
	public static void main(String[] args) {
		Aluno felipe = new Aluno("Felipe José");
		
		felipe.setIdade(7);
		
		System.out.println("O aluno ".concat(felipe.getNome()).concat(" tem ").concat(String.valueOf(felipe.getIdade())).concat(" anos."));
	}
}
