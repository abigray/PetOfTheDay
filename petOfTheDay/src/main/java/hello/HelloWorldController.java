package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/hello-world")
    @ResponseBody
    public Greeting sayHello(@RequestParam(name="name", required=false, defaultValue="Abigail") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }


    @GetMapping("/pet")
    @ResponseBody
    public Greeting sayHelloFido(@RequestParam(name="name", required=false, defaultValue="Fido") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

/**
Content-Type: application/json
...
{
  "uid": "urn:uuid:1335c695-cfb8-4ebb-abbd-80da344efa6b",
  "updateDate": "2016-05-23T00:00:00.0Z",
  "titleText": "Amazon Developer Blog, week in review May 23rd",
  "mainText": "Meet Echosim. A new online community tool for developers that simulates the look and feel of an Amazon Echo.",
  "redirectionUrl": "https://developer.amazon.com/public/community/blog"
}
*/

}
