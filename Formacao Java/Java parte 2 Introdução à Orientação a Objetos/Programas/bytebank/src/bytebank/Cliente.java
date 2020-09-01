package bytebank;

public class Cliente {
	
	private String nome; 
	private String cpf;
	private String profissao;
	private String endereco;
	
	public Cliente(String nome,String cpf, String profissao, String endereco) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setProfissao(profissao);
		this.setEndereco(endereco);
	}
	
	public String getNome() {
		return nome;
		
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	//public Cliente(String nome, String cpf,String profissao,String endereco ) {
		//this.nome = nome;
		//this.cpf = cpf;
		//this.profissao = profissao;
		//this.endereco = endereco;
		
	//}
}

