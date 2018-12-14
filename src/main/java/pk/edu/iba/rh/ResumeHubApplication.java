package pk.edu.iba.rh;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pk.edu.iba.rh.model.Education;
import pk.edu.iba.rh.model.User;
import pk.edu.iba.rh.repository.EducationRepository;
import pk.edu.iba.rh.service.EducationService;
import pk.edu.iba.rh.service.UserService;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ResumeHubApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResumeHubApplication.class, args);
	}

}