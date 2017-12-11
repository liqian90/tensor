package com.ai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class TensorApplication {

	public static void main(String[] args) {
		SpringApplication.run(TensorApplication.class, args);
	}
}
/*
public class TensorApplication  extends SpringBootServletInitializer {
	public static void main(String[] args) {

		SpringApplication.run(TensorApplication.class, args);
	}
	// 重写方法
	@Override

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {

		return application.sources(applicationClass);

	}


	private static Class applicationClass = TensorApplication.class;

}



*/
