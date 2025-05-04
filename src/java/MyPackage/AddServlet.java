
package MyPackage;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/AddServlet")      //Annotation to AddServlet instead of <servlet-mapping> in web.xml
public class AddServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));
        
        int addition = i + j;

        Cookie cookie = new Cookie("additionCookie", addition + "");
        res.addCookie(cookie);
        
        res.sendRedirect("Sq");
    }

}