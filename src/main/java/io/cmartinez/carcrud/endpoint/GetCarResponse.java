package io.cmartinez.carcrud.endpoint;

import io.cmartinez.carcrud.endpoint.model.Car;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetCarResponse {
  private Car car;
}
