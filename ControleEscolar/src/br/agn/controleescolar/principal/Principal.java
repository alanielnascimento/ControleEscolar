package br.agn.controleescolar.principal;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.agn.controleescolar.classes.Aluno;
import br.agn.controleescolar.classes.Disciplina;

public class Principal {
	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<>();

		for (int qtd = 1; qtd <= 2; qtd++) {

			String nome = JOptionPane.showInputDialog("Nome do aluno " + qtd + " ");
			String idade = JOptionPane.showInputDialog("Idade: ");

			Aluno aluno = new Aluno();

			aluno.setNome(nome);
			aluno.setIdade(Integer.valueOf(idade));

			for (int pos = 1; pos <= 4; pos++) {
				String nomeDis = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
				String nota = JOptionPane.showInputDialog("Nota da disciplina " + pos + " ?");
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDis);
				disciplina.setNota(Double.parseDouble(nota));

				aluno.getDisciplinas().add(disciplina);

			}
			// System.out.println(aluno);

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina? ");

			if (escolha == 0) { // Opçao sim = 0

				int continuaRemovendo = 0;
				int posicao = 1;

				while (continuaRemovendo == 0) {
					String removerDis = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3, 4 ?");
					aluno.getDisciplinas().remove(Integer.valueOf(removerDis).intValue() - posicao);
					posicao++;
					continuaRemovendo = JOptionPane.showConfirmDialog(null, "Continuar a Remover ");
				}
			}
			alunos.add(aluno);
		}
		for (Aluno a : alunos) {
			System.out.println(a);
		}
	}
}
