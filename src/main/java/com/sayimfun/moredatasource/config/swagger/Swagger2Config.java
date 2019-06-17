package com.sayimfun.moredatasource.config.swagger;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {



    @Bean
    public Docket adminApiConfig() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("moredatasource")//组名
                .apiInfo(adminApiInfo())// 调用apiInfo方法,创建一个ApiInfo实例,里面是展示在文档页面信息内容
                .select()//开启选择
                .apis(RequestHandlerSelectors.basePackage("com.sayimfun.moredatasource.controller"))
                .paths(PathSelectors.any())
                .paths(Predicates.not(PathSelectors.regex("/error.*")))//排除error下的多所有接口方法
                .build();
    }
    private ApiInfo adminApiInfo() {
        return new ApiInfoBuilder()
                .title("moredatasource")//大标题
                .description("此文档描述了springboot2整合mybatis并且实现多数据源")//详细描述
                .version("1.0")//版本
                .contact(new Contact("李文杰", "http://1922.168.1.6:8081", "liwenjieemail@163.com"))//作者
                .build();
    }
}
