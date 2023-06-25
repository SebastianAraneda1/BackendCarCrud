package io.cmartinez.carcrud.repository;

import io.cmartinez.carcrud.endpoint.model.Car;

import java.util.ArrayList;
import java.util.List;

public class DataBaseCars {

  public static List<Car> cars;

  private static void generateCarList(){
    cars = new ArrayList<>();

    Car carOne = new Car();
    carOne.setId(1);
    carOne.setColor("Black");
    carOne.setBrand("Chevrolet");
    carOne.setModel("Sail");
    carOne.setPlateCode("BBCC-00");
    cars.add(carOne);

    Car carTwo = new Car();
    carTwo.setId(2);
    carTwo.setColor("White");
    carTwo.setBrand("Chevrolet");
    carTwo.setModel("Sail");
    carTwo.setPlateCode("ZZYY-99");
    cars.add(carTwo);
  }

  public static List<Car> getAllCars(){
    if(cars == null){
      generateCarList();
    }
    return cars;
  }
}