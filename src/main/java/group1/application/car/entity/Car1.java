package group1.application.car.entity;

import group1.application.common.CarType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
public class Car1 {
    private int id;
    private CarType carType;
    private String name;
    private int seatCount;
}
