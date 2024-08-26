package group1.application.car.dto;

public class CarDto {
    private String name;
    private String type;
    private int seatCount;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public CarDto(String name, String type, int seatCount) {
        this.name = name;
        this.type = type;
        this.seatCount = seatCount;
    }
}
