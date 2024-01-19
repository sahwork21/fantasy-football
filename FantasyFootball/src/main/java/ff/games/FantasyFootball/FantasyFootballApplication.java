package ff.games.FantasyFootball;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Class containing the entry point for the app
 *
 * @Sean Hinton
 */
@SpringBootApplication ( scanBasePackages = { "ff.games.FantasyFootball" } )
public class FantasyFootballApplication {

    /**
     * Entry Point of the application This is just the main function
     */
    public static void main ( final String[] args ) {
        SpringApplication.run( FantasyFootballApplication.class, args );
    }

}
