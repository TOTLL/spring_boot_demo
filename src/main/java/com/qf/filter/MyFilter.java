package com.qf.filter;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("过滤前。。。。。。。。。");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("过滤后。。。。。。。");
    }
}
