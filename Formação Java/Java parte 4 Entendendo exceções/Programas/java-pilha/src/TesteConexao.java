
public class TesteConexao {

	public static void main(String[] args) throws Exception {

		// ------------Implementação nova no java 1.7

		try (Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch(IllegalStateException ex) {
			System.out.println("Deu erro na conexao");
			
		}

//	---------------------------------------------------------
//		Conexao  con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//			
//		}catch(IllegalStateException ex) {
//			System.out.println("Deu erro na conexao");
//		}finally { // sempre executara mesmo tendo o erro para isto que serve o finally.
//			System.out.println("finally");
//			if (con != null) {
//				con.close();
//			}
//			
//		}
//		
//	}
//
	}
}