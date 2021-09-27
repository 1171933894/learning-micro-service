package com.gupaoedu.p5.example.springcloudeurekaserverreplica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringCloudEurekaServerReplicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaServerReplicaApplication.class, args);
	}

}
