package config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfiguration {
    @Bean("giovanni")
    @Primary
    IStudent be() {
        return new BackendStudent(name());
    }
}
