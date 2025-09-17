package com.salamafazlul.reactivestudentapi;

import com.salamafazlul.reactivestudentapi.student.Student;
import com.salamafazlul.reactivestudentapi.student.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReactiveStudentApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveStudentApiApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			StudentService service
	){
		return args -> {
			for (int i = 0; i < 100; i++){
				service.save(
						Student.builder()
								.firstname("John " + i)
								.lastname("Doe "+ i)
								.age(i)
								.build()
				).subscribe();
			}
		};
	}
}
