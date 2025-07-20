package henrique.igor.library_system;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Slf4j
@EnableJpaAuditing
@SpringBootApplication
public class LibrarySystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibrarySystemApplication.class, args);

		log.info("""
                 \s
                   _____  ______ ______     _    _ _   _______   _____  _____   ____       _ ______ _____ _______\s
                  |  __ \\|  ____|  ____/\\  | |  | | | |__   __| |  __ \\|  __ \\ / __ \\     | |  ____/ ____|__   __|
                  | |  | | |__  | |__ /  \\ | |  | | |    | |    | |__) | |__) | |  | |    | | |__ | |       | |  \s
                  | |  | |  __| |  __/ /\\ \\| |  | | |    | |    |  ___/|  _  /| |  | |_   | |  __|| |       | |  \s
                  | |__| | |____| | / ____ \\ |__| | |____| |    | |    | | \\ \\| |__| | |__| | |___| |____   | |  \s
                  |_____/|______|_|/_/    \\_\\____/|______|_|    |_|    |_|  \\_\\\\____/ \\____/|______\\_____|  |_|  \s
                 \s
                  DEFAULT PROJECT :: 0.1
                \s""");
	}
}