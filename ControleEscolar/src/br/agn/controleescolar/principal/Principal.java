package br.agn.controleescolar.principal;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.agn.controleescolar.classes.Aluno;
import br.agn.controleescolar.classes.Disciplina;
import br.agn.controleescolar.constantes.Situacao;

public class Principal {
	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<>();
		List<Aluno> alunosAprovados = new ArrayList<>();
		List<Aluno> alunosRecuperacao = new ArrayList<>();
		List<Aluno> alunosReprovados = new ArrayList<>();

		for (int qtd = 1; qtd <= 6; qtd++) {

			String nome = JOptionPane.showInputDialog("Nome do aluno " + qtd + " ");
			String idade = JOptionPane.showInputDialog("Idade: ");

			Aluno aluno = new Aluno();

			aluno.setNome(nome);
			aluno.setIdade(Integer.valueOf(idade));

			for (int pos = 1; pos <= 1; pos++) {
				String nomeDis = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
				String nota = JOptionPane.showInputDialog("Nota da disciplina " + pos + " ?");
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDis);
				disciplina.setNota(Double.parseDouble(nota));

				aluno.getDisciplinas().add(disciplina);

			}
			// System.out.println(aluno);

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina? ");

			if (escolha == 0) { // Op�ao sim = 0

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
		/*//PECORRENDO LISTAS POR POSICAO
		for (int pos = 0; pos < alunos.size(); pos++) {
			Aluno aluno = alunos.get(pos);
			//SUBSTITUIR ALUNO NA LISTA
			if (aluno.getNome().equals("Alaniel")) {
				Aluno trocar = new Aluno();
				trocar.setNome("Aluno foi trocado");
				
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina("TCC I");
				disciplina.setNota(100);
				
				trocar.getDisciplinas().add(disciplina);
				
				alunos.set(pos, trocar);
				aluno = alunos.get(pos);
			}
			System.out.println("Aluno: " + aluno.getNome());
			System.out.println("-----------------------------------------------------------------------");
			
			
		}*/
		//for (Aluno a : alunos) {
			//System.out.println(a);
		//}
		for (Aluno a1 : alunos) {
			if(a1.getSituacao().equals(Situacao.APROVADO)) {
				alunosAprovados.add(a1);
			}else if(a1.getSituacao().equals(Situacao.RECUPERACAO)) {
				alunosRecuperacao.add(a1);
			}else {
				alunosReprovados.add(a1);
			}
		}
		System.out.println("-------------------Lista dos Aprovados--------------------");
		for (Aluno a : alunosAprovados) {
			System.out.println(a);
		}
		System.out.println("-------------------Lista dos em Recuperacao--------------------");
		for (Aluno a : alunosRecuperacao) {
			System.out.println(a);
		}
		System.out.println("-------------------Lista dos Reprovados--------------------");
		for (Aluno a : alunosReprovados) {
			System.out.println(a);
		}
	}
}
