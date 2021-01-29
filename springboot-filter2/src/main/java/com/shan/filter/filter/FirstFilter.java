package com.shan.filter.filter;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class FirstFilter  implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        System.out.println(request.getRequestURI() + "----------FirstFilter------------------- doFilter - before");

        //执行下一个filter
        filterChain.doFilter(servletRequest, servletResponse);

        System.out.println(request.getRequestURI() + "-------------FirstFilter---------------- doFilter - after");

    }
}
