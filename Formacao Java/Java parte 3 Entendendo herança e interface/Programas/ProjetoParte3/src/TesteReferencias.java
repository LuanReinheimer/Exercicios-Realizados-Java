
public class TesteReferencias {

	public static void main(String[] args) {
		Gerente gerente01 = new Gerente();
		  gerente01.setNome("Marcos");
		  gerente01.setSalario(5000.0);

		  EditorDeVideo editorvideo01 = new EditorDeVideo();
          editorvideo01.setNome("Jose");
          editorvideo01.setSalario(2500.0);
          
          Designer designer01 = new Designer();
          editorvideo01.setNome("Joao");
          editorvideo01.setSalario(2200.0);

          ControleBonificacao controle = new ControleBonificacao();
          controle.registra(gerente01);
          controle.registra(designer01);
          controle.registra(editorvideo01);

          System.out.println(controle.getSoma());

      }
}