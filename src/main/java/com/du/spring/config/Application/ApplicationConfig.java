package com.du.spring.config.Application;

import com.du.spring.filter.MyFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;
import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

/**
 * Created by hnyd1 on 2016/10/26.
 */
public class ApplicationConfig extends AbstractAnnotationConfigDispatcherServletInitializer {


    /**
     * ContextLoaderListener
     *
     * @return
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{SpringRootConfig.class};
    }

    /**
     * DispatcherServlet
     *
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{SpringMVCConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        registration.setMultipartConfig(new MultipartConfigElement("/tmp/app/uploads"));
    }

    @Override
    protected Filter[] getServletFilters() {
        return new Filter[]{new MyFilter()};
    }
}
