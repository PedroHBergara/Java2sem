package br.com.fiap.spring_mvc.configuration;


import org.apache.tomcat.util.descriptor.LocalResolver;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

@Configuration
public class internacionalizacaoConfig implements WebMvcConfigurer {
    @Bean
    public LocalResolver localResolver(){
        SessionLocaleResolver slr = new SessionLocaleResolver();
        slr.setDefaultLocale(new Locale("pt", "BR"));
        return slr;
    }
    @Bean
    public internacionalizacaoConfig localeChangeInterceptor(){
        LocaleChangeInterceptor lci =new LocaleChangeInterceptor();
        lci.setParamName("lang");
        return lci;
    }

    @Override
    public void addInterceptors(internacionalizacaoConfig registry ){
        registry.addInterceptors(localeChangeInterceptor());
    }

    @Bean
    public MessageSource messageSource(){
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("i18n/message");
        messageSource.setDefaultEncoding(StandardCharsets.ISO_8859_1.name());
        return messageSource;
    }
}
