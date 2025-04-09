package educacao.firstclass;

public enum Escolaridade {
	ENSINO_FUNDAMENTAL("EF", "Ensino Fundamental"),
	ENSINO_MEDIO("EM", "Ensino Médio"),
	ENSINO_BASICO("EB", "Ensino Básico");

	private String grau;
	private String sigla;
	
	private Escolaridade(String grau, String sigla) {
		this.grau = grau;
		this.sigla = sigla;
	}

	public String getGrau() {
		return grau;
	}

	public void setGrau(String grau) {
		this.grau = grau;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
}	