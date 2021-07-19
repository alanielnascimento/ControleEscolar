package br.agn.controleescolar.classes;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private String nome;
	private int idade;

	private List<Disciplina> disciplinas;

	public Aluno() {
		disciplinas = new ArrayList<>();
	}

	public Aluno(String nome) {
		this.nome = nome;
	}

	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
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

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public double getMediaNotas() {
		double somaNotas = 0.0;
		for (Disciplina d : disciplinas) {
			somaNotas += d.getNota();
		}
		return somaNotas / disciplinas.size();
	}

	public String getSituacao() {
		double media = this.getMediaNotas();
		if (media >= 50) {
			if (media >= 70) {
				return "Aprovado";
			} else {
				return "Aluno em Recupera��o";
			}

		} else {
			return "Reprovado";
		}
	}

	@Override
	public String toString() {
		String output = "";
		output += "Nome: " + this.getNome() + "\n";
		output += "M�dia: " + this.getMediaNotas() + "\n";
		output += "Situacao: " + this.getSituacao() + "\n";
		output += "Disciplinas: " + this.getDisciplinas() + "\n";
		return output;
	}
}
