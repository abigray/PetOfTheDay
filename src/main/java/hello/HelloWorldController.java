package hello;

import java.util.concurrent.atomic.AtomicLong;
import java.time.LocalDateTime;
import java.time.format.*;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    private static final String template = "Your pet of the day is %s!";
    private static final String redirectUrl = "http://petfinder.org";
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'.0Z'");
    private final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);


    @GetMapping("/pet")
    @ResponseBody
    public Pet  sayHelloFido(@RequestParam(name="name", required=false, defaultValue="Fido") String name) {
        logger.info("Woof");         
 	return new Pet(UUID.randomUUID().toString(), LocalDateTime.now().format(formatter), String.format(template, name), 
	"woof", redirectUrl);
    }


}
