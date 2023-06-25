package io.cmartinez.carcrud.endpoint;

import io.cmartinez.carcrud.endpoint.model.Car;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetCarsResponse {
  private List<Car> cars;
}
