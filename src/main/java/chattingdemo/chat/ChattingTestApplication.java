package chattingdemo.chat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ChattingTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChattingTestApplication.class, args);
    }

}
