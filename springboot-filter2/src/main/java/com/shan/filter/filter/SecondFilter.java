package com.shan.filter.filter;

import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class SecondFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        System.out.println(request.getRequestURI() + "----------SecondFilter------------------- doFilter - before");

        //执行下一个filter
        filterChain.doFilter(servletRequest, servletResponse);

        System.out.println(request.getRequestURI() + "-------------SecondFilter---------------- doFilter - after");
    }
}
