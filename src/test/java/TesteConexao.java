import com.fabweblist21.persistencia.jdbc.ConexaoFactory;


public class TesteConexao {

	public static void main(String[] args) {
			testaConexao();
			System.out.println("Conexao com o BD_21 efetuada com sucesso!!!");
		}
		
		public static void testaConexao(){
			ConexaoFactory.getConexao();
		}
	}
