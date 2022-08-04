package notaFiscal;

public class EnviarEmail implements AcaoAposGerarNota{
	
	@Override
    public void executa(NotaFiscal nf) {
        System.out.println("envia email da nf " + nf.getId());
    }
}