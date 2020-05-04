import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SumaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        int numero1 = Integer.parseInt(httpServletRequest.getParameter("num1"));
        int numero2 = Integer.parseInt(httpServletRequest.getParameter("num2"));
        int resultado = Suma.sumar(numero1,numero2);
        MiLog miLog = new MiLog();
        miLog.controlarValores(numero1,numero2);
        httpServletRequest.setAttribute("resultado", resultado);
        miLog.controlarResultado(resultado);
        RequestDispatcher view = httpServletRequest.getRequestDispatcher("suma.jsp");
        view.forward(httpServletRequest,httpServletResponse);
    }
}
