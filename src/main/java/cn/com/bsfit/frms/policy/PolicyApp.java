package cn.com.bsfit.frms.policy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration(exclude = { SecurityAutoConfiguration.class })
public class PolicyApp {
	
    public static void main(final String[] args) throws Exception {
        SpringApplication.run(PolicyApp.class, args);
    }
}
