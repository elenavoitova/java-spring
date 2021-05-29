package app;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class OrdersControllerV1 {

  private final SessionStorage<PersonalUserDetails> ss;
  final String cookieID = "XID";

  @GetMapping
  public void a1(HttpServletRequest rq, HttpServletResponse rs) {
    Cookie[] cookies = rq.getCookies();
    if (cookies!=null) {
      for (Cookie c: cookies) {
        if (c.getName().equals(cookieID)) {
          PersonalUserDetails ud = ss.get(c.getValue());
          ud.counter++;
          System.out.println(ud);
          return;
        }
      }
    }
    String key = UUID.randomUUID().toString();
    rs.addCookie(new Cookie(cookieID, key));
    PersonalUserDetails x = PersonalUserDetails.builder().counter(0).extra(Math.random()).build();
    ss.add(key, x);
  }



}
