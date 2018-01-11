package uamalls;

import static com.google.common.collect.Lists.newArrayList;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/welcome")
    public String welcome(Map<String, Object> model) {
        model.put("message", "SHEVCHENKO");
        return "welcome";
    }

    @RequestMapping("/malls")
    public String malls(Map<String, Object> model) {
        model.put("mallList", newArrayList("Ocean Plaza", "Lavina Mall"));
        return "malls";
    }

    @RequestMapping("/malls/{name}")
    public String mall(@PathVariable("name") String name, Map<String, Object> model) {
        model.put("mallName", name);
        return "mall";
    }

    @RequestMapping("/stores")
    public String stores(Map<String, Object> model) {
        return "stores";
    }
}