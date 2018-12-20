package numbers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NumbersController {

    private static final String template = "Numbers, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/numbers")
    @ResponseBody
    public NumberSet getNumberSet(@RequestParam(name="name", required=false, defaultValue="Nameless") String name) {
        return new NumberSet(counter.incrementAndGet(), String.format(template, name));
    }

}
