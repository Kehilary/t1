import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import br.dao.ConexaoDB;
import java.sql.Connection;
import br.dao.InterfacePassageiro;
import br.dao.PassageiroDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.MultipartConfig;


@WebServlet(urlPatterns = {"/InserirPassageiro"})

public abstract class CadastroPassageiro extends HttpServlet implements InterfacePassageiro{

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
            String nome = request.getParameter("nome");
            String dataNascimento = request.getParameter("dataNascimento");
            String sexo = request.getParameter("sexo");
            String cpf = request.getParameter("cpf");
            String rg = request.getParameter("rg");
            String civil = request.getParameter("civil");
            String email = request.getParameter("email");
            String telefone = request.getParameter("telefone");
            String medico = request.getParameter("medico");
            String pacote = request.getParameter("pacote");
            String foto = request.getParameter("foto");
            String senha = gerarSenha();
            
           InserirDadosPassageiro(pacote, cpf,  rg, nome, dataNascimento, email, senha,  telefone, sexo, civil, medico);
           
           String url = "ExibePassageiro.html";
           ServletContext context = getServletContext();
           RequestDispatcher dispatcher = context.getRequestDispatcher(url);
           dispatcher.forward(request, response);

        } finally {
            out.close();
        }
    }
}
