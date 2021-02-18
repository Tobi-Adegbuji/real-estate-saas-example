package dev.tobiadegbuji.realestatesaas.configuration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


//https://dev.to/stack-labs/how-to-test-configuration-class-in-spring-boot-16ai

class AppSecurityConfigTest {

    ApplicationContextRunner applicationContext;

    @BeforeEach
    void setUp() {
        //Populating application context
        applicationContext = new ApplicationContextRunner()
                .withUserConfiguration(AppSecurityConfig.class);
    }

    @Test
    void passwordEncoder() {
        //Running the context and asserting there is a single bean in the app context
        applicationContext.run(ctx -> {
            assertTrue(ctx.containsBean("passwordEncoder"));
            assertFalse(ctx.containsBean("nonExistentBean"));
        });
    }
}