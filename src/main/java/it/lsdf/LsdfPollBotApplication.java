package it.lsdf;

import java.util.Collections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/** This class serves as an entry point for the Spring Boot app. */
@SpringBootApplication
@Controller
@EnableScheduling
public class LsdfPollBotApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(LsdfPollBotApplication.class);
	
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello World!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(LsdfPollBotApplication.class, args);
	}
}
