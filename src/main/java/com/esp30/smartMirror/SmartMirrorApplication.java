package com.esp30.smartMirror;

import nu.pattern.OpenCV;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmartMirrorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartMirrorApplication.class, args);
		OpenCV.loadShared();
	}

}
