package cl.curso.java.login;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 
 * @author usuario
 *
 */
public class Conexion {

	private static Conexion _conexion;
	private Connection connection;

	/**
	 * @return the connection
	 */
	public Connection getConnection() {
		return connection;
	}

	/**
	 * @param connection
	 *            the connection to set
	 */
	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	private Conexion() {

	}

	public static Conexion getInsncia() {
		if (_conexion == null) {

			try {
				Class.forName("com.mysql.jdbc.Driver");

				System.out.println("el programa se conecto");
				Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.0.108:3306/curso", "alumnos",
						"java123");
				Conexion conexion = new Conexion();
				conexion.setConnection(conn);
				_conexion = conexion;

			} catch (Exception e) {

				throw new ConexionException("Ocurrio un error " + "al conectar con la base de datos",e);

			}

		}
		return _conexion;

	}
}
