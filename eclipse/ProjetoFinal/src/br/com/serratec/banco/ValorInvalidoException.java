package br.com.serratec.banco;

public class ValorInvalidoException  extends RuntimeException {

	private static final long serialVersionUID = 6292376724039125771L;

	public ValorInvalidoException(String message)  {
		super(message);
	}
}