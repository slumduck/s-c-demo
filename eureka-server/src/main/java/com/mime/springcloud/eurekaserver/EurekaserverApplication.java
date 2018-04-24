package com.mime.springcloud.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author SlumDuck
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaserverApplication {

	public static void main(String[] args) {
		//SpringApplication.run(EurekaserverApplication.class, args);
        new SpringApplicationBuilder(EurekaserverApplication.class).web(true).run(args);
	}
}
