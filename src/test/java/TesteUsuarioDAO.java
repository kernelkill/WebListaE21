import java.util.Scanner;

import com.fabweblist21.persistencia.entidade.Aluno;
import com.fabweblist21.persistencia.jdbc.AlunoDAO;


public class TesteUsuarioDAO {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Aluno aluno = new Aluno();
		AlunoDAO dao = new AlunoDAO();
		
		CadastrarAluno(teclado, aluno, dao);
		
		teclado.close();
	}
	
	public static void CadastrarAluno(Scanner teclado, Aluno aluno, AlunoDAO dao){
		
		System.out.println("Digite o nome do Aluno");
		aluno.setNome(teclado.nextLine());
		
		System.out.println("Digite a Nota");
		aluno.setNota(teclado.nextDouble());
		
		dao.cadastrarAluno(aluno);
		
		System.out.println("Aluno Cadastrado!");
		
	}

}
