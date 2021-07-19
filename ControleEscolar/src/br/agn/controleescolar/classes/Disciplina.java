package br.agn.controleescolar.classes;

public class Disciplina {
	private String disciplina;
	private double nota;

	public String getDisciplina() {
		return disciplina;
	}

	public double getNota() {
		return nota;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		String output = "";
		output += "Disciplina " + this.getDisciplina();
		output += " Nota " + this.getNota();
		return output;
	}
}
