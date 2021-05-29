package app2;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

@RestController
@RequestMapping("/hello")
public class AppController {

  public Person aaa1() {
    return new Person(1, "Jim");
  }

  /**
   * http://localhost:8080/hello/abc
   * GET / POST / PUT .....
   */
  @RequestMapping("/abc")
  public Person aaa2() {
    return new Person(2, "Jackson");
  }

  @RequestMapping(path = "/abc1", method = RequestMethod.POST)
  public Person aaa3() {
    return new Person(2, "Jackson");
  }

  @PostMapping("/abc2")
  public Person aaa4() {
    return new Person(2, "Jackson");
  }

  @GetMapping("/users")
  public Person aaa5() {
    return new Person(2, "Jackson");
  }

  @GetMapping("/users/{id}")
  public Person aaa6(@PathVariable("id") Integer id) {
    return new Person(2, "Jackson");
  }

  /**
   * http://localhost:8080/hello/person?id=33&name=Alex
   */
  @GetMapping("/person")
  public Person aaa6(@RequestParam("id") Integer id, @RequestParam("name") String name) {
    return new Person(id, name);
  }

  @GetMapping("/xxx")
  public Person aaa7(HttpServletRequest rx) {
    return new Person(11, "Jim");
  }

  @GetMapping("/xxx1")
  public Person aaa8(@CookieValue("token") Cookie token) {
    return new Person(11, "Jim");
  }

}
