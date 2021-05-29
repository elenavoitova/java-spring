package app;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PersonalUserDetails {
  String language;
  String timezone;
  String screen;
  Double extra;
  Integer counter = 0;
}
