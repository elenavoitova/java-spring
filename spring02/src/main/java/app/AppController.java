package app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class AppController {

  @Value("${a.b.c}")
  private Integer abc;

  @ResponseBody
  @GetMapping("/1")
  public Integer qqq() {
    return abc;
  }

  @ResponseBody
  @GetMapping("/2")
  public String qqq2() {
    return "hello world";
  }

  @ResponseBody
  @GetMapping("/3")
  public List<Person> people() {
    return Arrays.asList(
      new Person(1, "jim"),
      new Person(2, "jack")
    );
  }

  @GetMapping("/u1") // path
  public String users111() {
    return "users"; // HTML-file
  }

}
