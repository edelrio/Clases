/**
 * 
 */
package cl.curso.java.login;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cl.curso.java.login.Usuario;

/**
 * @author usuario
 *
 */
public class UsuarioDAO {

	public static boolean validar(Usuario usuario) throws SQLException {
		Conexion con = Conexion.getInsncia();
		PreparedStatement st = con.getConnection().prepareStatement(
				"INSERT INTO alumnos(idalumno, nombre, apellido, apellidoMaterno)" + " VALUES (?,?,?,?);");

		st.setString(1, usuario.getUsuario());
		st.setString(2, usuario.getPassword());
		ResultSet rs = st.executeQuery();
		return rs.next();

	}
}
