package controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.Pessoa;

public class PessoaController extends HttpServlet{
	
	public PessoaController() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Pessoa pessoa = new Pessoa(
				request.getParameter("nome"),
				request.getParameter("email"),
				request.getParameter("senha")
				);
			
				
	}
	

}
