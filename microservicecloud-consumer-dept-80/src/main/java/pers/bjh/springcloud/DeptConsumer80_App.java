package pers.bjh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import pers.bjh.rule.RuleConfig;

//在启动该微服务的时候就会加载我们自定义Ribbon配置类，从而使配置生效
@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration=RuleConfig.class)
@EnableEurekaClient
@SpringBootApplication
public class DeptConsumer80_App {

	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer80_App.class, args);
	}

}
