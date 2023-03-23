package com.danielF.praticaPOO.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import com.danielF.praticaPOO.classes.Aluno;
import com.danielF.praticaPOO.classes.Diretor;
import com.danielF.praticaPOO.classes.Disciplina;
import com.danielF.praticaPOO.classesAuxiliares.Autenticar;
import com.danielF.praticaPOO.constantes.StatusAluno;

/*Este  é um projeto com intuito de praticar meus conhecimentos em Java (Logica de Programaçao e Orientaçao a objetos: 
 * herança, polimorfismo, interfaces, listas, arrays, matrizes, etc.)
 * Consiste em uma simulação de um sistema de uma escola,
 * onde temos alunos, diretor, e secretario, para cada aluno temos disciplinas e por sua vez notas de cada disciplina;
 */

public class TesteExecutavel {

	public static void main(String[] args) {

		try {

			// simples validação com login e senha;
			String login = JOptionPane.showInputDialog("Login: ");
			String senha = JOptionPane.showInputDialog("Senha: ");

			// esse modo trabalhamos interface e construtores
			// com o "permitiracesso" fazendo referencia a interface, é instanciado um
			// objeto da classe secretario passando parametros "login" e "senha" no
			// construtor da classe

			/*
			 * travando o contrato de autenticar somenete para quem realmente tem o contrato
			 */
			if (new Autenticar(new Diretor(login, senha)).autenticar()) {// se TRUE acessa, se FALSE nao acessa;

				List<Aluno> alunos = new ArrayList<Aluno>();// lista de alunos;

				// utilizaçao do hashmap para trabalhar com varias listas apartir de uma lista
				// principal(lista de alunos);

				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

				int addAluno = 0; /*
									 * contador para saber se usuario quer adicionar mais alunos ou não- opcao de
									 * SIM sera 0;
									 */
				while (addAluno == 0) {
					String nome = JOptionPane.showInputDialog("Para adicionar alunos, insira o Nome do aluno: ");

					/*
					 * String RegistroGeral = JOptionPane.showInputDialog("Insira o RG: "); String
					 * idade = JOptionPane.showInputDialog("Insira a idade: "); String
					 * dataNascimento = JOptionPane.showInputDialog("Data de Nascimento: "); String
					 * nomeEscola = JOptionPane.showInputDialog("Nome da Escola: "); String nomeMae
					 * = JOptionPane.showInputDialog("Nome da Mãe: "); String dataMatricula =
					 * JOptionPane.showInputDialog("Data da Matricula: "); String serieMatriculado =
					 * JOptionPane.showInputDialog("Serie Matriculado: ");
					 */

					Aluno aluno = new Aluno();

					aluno.setNome(nome);

					/*
					 * aluno.setRegistroGeral(RegistroGeral);
					 * aluno.setIdade(Integer.parseInt(idade));
					 * aluno.setDataNascimento(dataNascimento); aluno.setNomeEscola(nomeEscola);
					 * aluno.setNomeMae(nomeMae); aluno.setDataMatricula(dataMatricula);
					 * aluno.setSerieMatriculado(serieMatriculado);
					 */

					int addDisciplinas = 0;
					while (addDisciplinas == 0) {// condiçao para adicionar quantas disciplinas o usuario desejar. Opção
													// de
													// sim é 0;

						String numDisciplinas = JOptionPane.showInputDialog(null,
								"Quantas disciplinas deseja adicionar?");

						for (int posi = 1; posi <= (Integer.valueOf(numDisciplinas)); posi++) {
							String nomeDisciplina = JOptionPane
							.showInputDialog("Qual o nome da disciplina " + posi + "?");							
							String notaDisciplina = JOptionPane.showInputDialog("Qual o valor da nota " + posi + "?");
							
							Disciplina disciplina = new Disciplina();
							disciplina.setDisciplina(nomeDisciplina);
							//disciplina.setNota(Double.parseDouble(notaDisciplina));

							aluno.getDisciplinas().add(disciplina);
						}

						addDisciplinas = JOptionPane.showConfirmDialog(null, "Deseja adicionar mais alguma materia?");
					}

					/* condiçao se usuario quer remover disciplina. Opçao SIM é Zero; */
					int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
					if (escolha == 0) {

						int continuarRemover = 0;
						int posicao = 1;

						while (continuarRemover == 0) {// bloco de codigo onde pode remover disciplinas criadas pelo
														// usuario;
							String removerDisciplina = JOptionPane
									.showInputDialog("Qual disciplina deseja remover: 1, 2, 3?");
							aluno.getDisciplinas().remove(Integer.valueOf(removerDisciplina).intValue() - posicao);
							posicao++;
							continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar removendo disciplinas?");
						}
					}

					alunos.add(aluno);// adicionando alunos criados à lista de alunos;
					addAluno = JOptionPane.showConfirmDialog(null, "Gostaria de adicionar mais alunos?");

				}

				/*
				 * percorrendo lista de alunos pelas posições; for(int posi = 0 ; posi <
				 * alunos.size() ; posi++) {
				 * 
				 * Aluno aluno = alunos.get(posi);
				 * 
				 * //Lógica criada para Subistituir um aluno de dentro da lista quando
				 * necessário; if(aluno.getNome().equalsIgnoreCase("Aluno a ser substituido")) {
				 * Aluno nvAluno = new Aluno(); nvAluno.setNome("Novo aluno");
				 * 
				 * Disciplina disciplinas = new Disciplina();
				 * disciplinas.setDisciplina("Disciplina a ser substituida");
				 * disciplinas.setNota(100.0);//nota a ser substituida;
				 * 
				 * nvAluno.getDisciplinas().add(disciplinas);//adicionando novas disciplinas;
				 * alunos.set(posi, nvAluno);//definindo que na lista de alunos, na posicao do
				 * aluno a ser trocado, um novo aluno ira ser criado; aluno =
				 * alunos.get(posi);//definindo que a posiçao do novo aluno sera colocado no
				 * lugar do aluno antigo; }
				 * 
				 * 
				 * System.out.println("Aluno = " + aluno.getNome());
				 * System.out.println("Media = " + aluno.getMediaNota());
				 * System.out.println("Situaçao = " + aluno.getAlunoAprovado());
				 * 
				 * //percorrendo lista de disciplina pelas posições; for(int posiD = 0 ; posiD <
				 * aluno.getDisciplinas().size(); posiD++) { Disciplina disc =
				 * aluno.getDisciplinas().get(posiD); System.out.println("Materia = " +
				 * disc.getDisciplina() + " Nota = " + disc.getNota()); }
				 * 
				 * }
				 */

				maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
				maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

				// processando lista de alunos e separando alunos em listas de acordo com a
				// situaçao deles;
				for (Aluno aluno : alunos) {

					if (aluno.getSituacaoAluno().equalsIgnoreCase(StatusAluno.APROVADO)) {
						maps.get(StatusAluno.APROVADO).add(aluno);
					} else if (aluno.getSituacaoAluno().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						maps.get(StatusAluno.RECUPERACAO).add(aluno);
					} else if (aluno.getSituacaoAluno().equalsIgnoreCase(StatusAluno.REPROVADO)) {
						maps.get(StatusAluno.REPROVADO).add(aluno);
					}
				}

				System.out.println("--------------Lista de alunos Aprovados-----------------");
				for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
					System.out.println("Nome =" + aluno.getNome() + " Resultado = " + aluno.getSituacaoAluno()
							+ " com a média de = " + aluno.getMediaNota());
				}

				System.out.println("--------------Lista de alunos em Recuperação-----------------");
				for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
					System.out.println("Nome =" + aluno.getNome() + " Resultado = " + aluno.getSituacaoAluno()
							+ " com a média de = " + aluno.getMediaNota());
				}

				System.out.println("--------------Lista de alunos Reprovados-----------------");
				for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
					System.out.println("Nome =" + aluno.getNome() + " Resultado = " + aluno.getSituacaoAluno()
							+ " com a média de = " + aluno.getMediaNota());
				}

			} else {
				System.out.println("Entre com login e senha corretos.");
			}

		} catch (Exception e) {/* mostra excecoes do tipo de formato numero */
			/* ira mostrar excecoes em tela */
			StringBuilder saida = new StringBuilder();

			e.printStackTrace(); /* exibe o log de erro no console */

			/* Manipulando as excecoes exibindo conforme posiçoes do array */
			for (int i = 0; i < e.getStackTrace().length; i++) {
				saida.append("\n Classe erro: " + e.getStackTrace()[i].getClassName());
				saida.append("\n Metodo erro: " + e.getStackTrace()[i].getMethodName());
				saida.append("\n Linha erro: " + e.getStackTrace()[i].getLineNumber());
				saida.append("Tipo da exceção: " + e.getStackTrace()[i].getClass());
			}

			JOptionPane.showMessageDialog(null,
					"Erro ao processar notas. " + saida.toString());/* exibe mensagem das excecoes */

		}

	}

}
