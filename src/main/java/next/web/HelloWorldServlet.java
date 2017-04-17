package next.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by junghk on 2017. 4. 17..
 */
@WebServlet(urlPatterns = "/hello", loadOnStartup = 1)
public class HelloWorldServlet extends HttpServlet {


    @Override
    public void init()throws ServletException{
        System.out.println("init");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        String name = request.getParameter("name");
        response.getWriter().println(String.format("<h1>hello %s</h1>",name));
    }


    @Override
    public void destroy(){
        System.out.println("destroy");
    }
}
