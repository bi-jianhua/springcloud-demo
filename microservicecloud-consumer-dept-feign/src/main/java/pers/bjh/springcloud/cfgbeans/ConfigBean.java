package pers.bjh.springcloud.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class ConfigBean {

	@Bean
	public IRule rule() {
		return new RandomRule();
	}

}
