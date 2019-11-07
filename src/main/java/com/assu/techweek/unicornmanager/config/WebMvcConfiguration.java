package com.assu.techweek.unicornmanager.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CommonsRequestLoggingFilter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Configuration des composants Web Spring MVC
 *
 * @author f002908
 */
@Configuration
@EnableWebMvc
public class WebMvcConfiguration
{
    /** Logger de la classe */
    private static final Logger LOGGER = LoggerFactory.getLogger(WebMvcConfiguration.class);

    /** Classpath d'accès au template Angular */
    private static final String CLASSPATH_RESOURCE_LOCATIONS = "classpath:/dist/";

    /** Page d'acceuil du Angular */
    private static final String STATIC_INDEX_HTML = "forward:/static/index.html";


    /**
     * Création du bean Spring 'viewControllers'.
     *
     * @return Bean Spring 'viewControllers'
     */
    public void addViewControllers(final ViewControllerRegistry registry)
    {
        registry.addRedirectViewController("/", WebMvcConfiguration.STATIC_INDEX_HTML);
    }

    

    /** {@inheritDoc} */
    public void addResourceHandlers(final ResourceHandlerRegistry registry)
    {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }


    /**
     * Bean permettant de logger les requêtes HTTP REST
     *
     * <p>
     * Parametré dans application.properties (logging.level.org.springframework.web.filter.CommonsRequestLoggingFilter)
     *
     * @return le bean 'requestLoggingFilter'
     */
    @Bean
    public CommonsRequestLoggingFilter requestLoggingFilter()
    {
        WebMvcConfiguration.LOGGER.debug("Déclaration du bean 'requestLoggingFilter'");
        final CommonsRequestLoggingFilter loggingFilter = new CommonsRequestLoggingFilter();
        loggingFilter.setIncludeClientInfo(true);
        loggingFilter.setIncludeQueryString(true);
        loggingFilter.setIncludePayload(true);
        return loggingFilter;
    }

    /**
     * Création du bean Spring 'viewResolver'.
     *
     * @return Bean Spring 'viewResolver'
     */
    @Bean
    public ViewResolver getViewResolver()
    {
        WebMvcConfiguration.LOGGER.debug("Configuration du bean 'viewResolver'");

        final InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix(WebMvcConfiguration.CLASSPATH_RESOURCE_LOCATIONS);
        resolver.setSuffix(".html");
        return resolver;
    }

}
