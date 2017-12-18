
package implement;

import java.sql.SQLException;
import entidade.Usuario;
import persistencia.UsuarioDAO;
public class UsuarioDAOImp {


	private UsuarioDAO dao = null;
		
		public UsuarioDAOImp() {
			dao = new UsuarioDAO();
		}
		
		public boolean salvar(Usuario a) {
			try {
				dao.save(a);
				return Boolean.TRUE;
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return Boolean.FALSE;
		}
}
