package com.spring.web;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

//public class WebInitializer implements WebApplicationInitializer {
//    @Override
//    public void onStartup(ServletContext servletContext) throws ServletException {
//        //configure rootContext
////        AnnotationConfigWebApplicationContext rootContext=new AnnotationConfigWebApplicationContext();
////        rootContext.register(RootConfig.class);
////        rootContext.refresh();
//        //manage the life cycle of rootContext
//        //  servletContext.addListener(new ContextLoaderListener(rootContext));
//        //configure WEB MVC and MVC related bean
//        AnnotationConfigWebApplicationContext servletRegister = new AnnotationConfigWebApplicationContext();
//        servletRegister.register(MyConfig.class);
//        ServletRegistration.Dynamic servletRegistration = servletContext.addServlet("servlet", new DispatcherServlet(servletRegister));
//        //addmapping
//        servletRegistration.addMapping("/");
//        servletRegistration.setLoadOnStartup(1);
//
//    }
//}




//another approach using Abtract
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {MyConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
