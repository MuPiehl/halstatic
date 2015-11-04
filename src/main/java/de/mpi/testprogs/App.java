package de.mpi.testprogs;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@EnableAutoConfiguration
@ComponentScan("de.mpi.testprogs")
public class App
{
    private static org.slf4j.Logger log = LoggerFactory.getLogger(App.class);

    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
        log.debug("Hello World!");
    }
}
