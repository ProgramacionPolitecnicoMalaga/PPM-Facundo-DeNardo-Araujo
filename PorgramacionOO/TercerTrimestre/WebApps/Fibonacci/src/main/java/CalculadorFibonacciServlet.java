import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CalculadorFibonacciServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        int tamaño = Integer.parseInt(httpServletRequest.getParameter("tamano"));
        CalculadorFibonacci calculadorFibonacci = new CalculadorFibonacci(tamaño);
        httpServletRequest.setAttribute("serie", calculadorFibonacci.mostrarSerie());
        RequestDispatcher view = httpServletRequest.getRequestDispatcher("resultadoFibonacci.jsp");
        view.forward(httpServletRequest,httpServletResponse);
    }

}
