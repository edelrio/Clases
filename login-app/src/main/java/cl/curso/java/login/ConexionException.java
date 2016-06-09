package cl.curso.java.login;

public class ConexionException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7392589709537793653L;

	/**
	 * @param arg0
	 * @param arg1
	 */
	public ConexionException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	/**
	 * @param arg0
	 */
	public ConexionException(String arg0) {
		super(arg0);
	}
	
	
	
}
