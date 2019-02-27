/*
	* WebMvcConfigurer
		- Java 기반 설정 (Spring MVC를 설정해줌)
		- @EnableWebMvc 사용해야 함?????????????????
*/

package com.pms3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
public class WebMVCConfig implements WebMvcConfigurer {

	@Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("forward:/index.html");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
    }

	// this will map uri to jsp view directly without a controller
	// Request Mapping으로 최상단 주소("/", Welcome Page)로 입력해도 메인 컨트롤러로 forward 해주는 방법을 검색했을 때 찾은 방법 (?????)
	// 질문 : Java Spring Boot _ How to map my app root("/") to index.html?
	/*
	 * @Override public void addViewControllers(ViewControllerRegistry registry) {
	 * WebMvcConfigurer.super.addViewControllers(registry); }
	 */
	
	/*
	 * @Bean public InternalResourceViewResolver jspViewResolver() {
	 * InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	 * resolver.setPrefix("/templates/"); resolver.setSuffix(".jsp"); return
	 * resolver; }
	 */
    @Bean
    public InternalResourceViewResolver jspViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        // resolver.setPrefix("/templates/");
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        // resolver.setOrder(2);
        return resolver;
    }
    
	/*
	 * @Bean public RequestContextListener requestContextListener() { return new
	 * RequestContextListener(); }
	 * 
	 * @Override public void
	 * configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	 * configurer.enable(); }
	 */
	
}
