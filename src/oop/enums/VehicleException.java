package oop.enums;

public class VehicleException extends RuntimeException {
    public VehicleException(Constants constant) {
        super(constant.getValue());
    }
}
