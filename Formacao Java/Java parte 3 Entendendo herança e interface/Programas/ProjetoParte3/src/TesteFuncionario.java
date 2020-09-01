
public class TesteFuncionario {

	public static void main(String[] args) {
		
		
		
		
		
		Gerente luan = new Gerente();
		luan.setNome("Luan Reinheimer");
		luan.setCpf("035.199.580-31");
		luan.setSalario(2600.00);
		
		System.out.println(luan.getNome());
		System.out.println(luan.getBonificacao());
	}

}
