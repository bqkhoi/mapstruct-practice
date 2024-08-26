package group1.application.helloworld;

import group1.application.car.dto.CarDto;
import group1.application.car.entity.Car;
import group1.application.car.mapper.CarMapper;
import group1.application.common.CarType;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    private CarMapper carMapper;

    public HelloWorldController(CarMapper carMapper){
        this.carMapper =carMapper;
    }

    @GetMapping("/hello")
    public CarDto getHello(){
        Car car = new Car("Camry", CarType.SEDAN, 5);
        return carMapper.carToCarDto(car);
        //return "hello";
    }
}
