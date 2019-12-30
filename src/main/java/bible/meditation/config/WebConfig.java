package bible.meditation.config;



import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;


@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "bible.meditation")
@Slf4j
public class WebConfig {


    //
    public static final String RESOLVER_PREFIX = "/WEB-INF/view/";
    public static final String RESOLVER_SUFFIX = ".jsp";
//    public static final String RESOLVER_SUFFIX = ".html";

    @Bean
    public ViewResolver viewResolver(){

        log.info("WebConfig.viewResolver");

        UrlBasedViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix(RESOLVER_PREFIX);
        viewResolver.setSuffix(RESOLVER_SUFFIX);

//        log.info("viewResolver = {}", viewResolver);

        return viewResolver;
    }


}
