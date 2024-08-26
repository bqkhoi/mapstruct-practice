package group1.application.car.mapper;

import group1.application.car.dto.CarDto1;
import group1.application.car.entity.Car1;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface Car1Mapper {
    @Mapping(target = "numberOfSeats", source = "car1.seatCount")
    CarDto1 toCarDto(Car1 car1);
}
