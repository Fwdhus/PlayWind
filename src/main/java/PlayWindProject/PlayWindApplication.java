package PlayWindProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlayWindApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlayWindApplication.class, args);
	}

	public int simpleAddition(int x1, int x2){
		return x1 + x2;
	}
}
