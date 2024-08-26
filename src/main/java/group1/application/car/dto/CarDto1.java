package group1.application.car.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
public class CarDto1 {
    private int id;
    private String name;
    private String carType;
    private int numberOfSeats;
}
