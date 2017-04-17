package next.web;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by junghk on 2017. 4. 17..
 */
@WebFilter("/*")
public class MyServletFilter implements Filter {

    private FilterConfig _filterConfig = null;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        _filterConfig = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        _filterConfig = null;

        long start = System.currentTimeMillis();
        filterChain.doFilter(servletRequest, servletResponse);
        long end = System.currentTimeMillis();

        System.out.println("execT = " + (end-start));
    }

    @Override
    public void destroy() {

    }
}
