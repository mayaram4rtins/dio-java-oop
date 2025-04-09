package educacao.firstclass;

public class Aluno {
	String nome;
	int idade;


    /* Getters e Setters:
     * São utilizados para buscar valores de atributos e definir novos valores de instâncias de classes.
     * O getter retorna o valor do atributo.
     * O setter define outro novo valor para o atributo.
     * 
     * Construtores:
     * Definição de alguns atributos essenciais (ou seja, não são todos) na instanciação de um objeto.
     * 
     * Enum:
     * É um tipo essencial de classe onde os objetos são previamente criados e 
     * são imutáveis e disponíveis por toda a aplicação. Usa-se isso quando existem condições pré-estabelecida
     * com a certeza de não haver tanta alteração de valores como estado civil, estados brasileiros, grau de escolaridade...
     * 
     * OBS: O Enum não é uma lista de objetos, mas um conjunto de objetos que podem ter atributos e métodos. 
     * Logo, são objetos, não variáveis.
     */
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
