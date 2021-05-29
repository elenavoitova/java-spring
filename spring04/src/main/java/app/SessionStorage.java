package app;

import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class SessionStorage<A> {

  private final Map<String, A> data = new ConcurrentHashMap<>();

  public void add(String key, A x) {
    data.put(key, x);
  }

  public A get(String key) {
    return data.get(key);
  }

}
