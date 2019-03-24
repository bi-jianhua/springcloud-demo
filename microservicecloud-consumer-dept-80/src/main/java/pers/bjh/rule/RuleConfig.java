package pers.bjh.rule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;

@Configuration
public class RuleConfig {
	
	@Bean
	public IRule rule() {
		return new MyRule();
	}
}
