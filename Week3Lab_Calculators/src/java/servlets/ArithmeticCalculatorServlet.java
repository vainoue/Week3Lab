
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author vitor
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("result_arithmetic", "---<br>");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String f_value = request.getParameter("first_value");
        String s_value = request.getParameter("second_value");
        String button = request.getParameter("click_button");
        int f_number;
        int s_number;
        int result;
        
        request.setAttribute("first_value_att", f_value);
        request.setAttribute("second_value_att", s_value);
        
        if (f_value.equals("") || s_value.equals("")) {
            request.setAttribute("result_arithmetic", "invalid<br>");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
        return;
        }
        
        try {
            f_number = Integer.parseInt(f_value);
            s_number = Integer.parseInt(s_value);
        } catch (NumberFormatException nfe) {
            request.setAttribute("result_arithmetic", "invalid<br>");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
        return;
        }
        
        if (button.equals("+")) {
            result = f_number + s_number;
            request.setAttribute("result_arithmetic", result + "<br>");
            
        }
        else if (button.equals("-")) {
            result = f_number - s_number;
            request.setAttribute("result_arithmetic", result + "<br>");
            
        }
        else if (button.equals("*")) {
            result = f_number * s_number;
            request.setAttribute("result_arithmetic", result + "<br>");
            
        } else {
            
            if (s_number == 0) {
                request.setAttribute("result_arithmetic", "Invalid. Second number should not be 0<br>");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
            return;
            }
            
            result = f_number % s_number;
            request.setAttribute("result_arithmetic", result + "<br>");
            
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
        
    }
}
