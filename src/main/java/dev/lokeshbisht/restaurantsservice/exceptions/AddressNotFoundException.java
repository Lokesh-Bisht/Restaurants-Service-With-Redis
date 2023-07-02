package dev.lokeshbisht.restaurantsservice.exceptions;

import java.io.Serial;

public class AddressNotFoundException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    public AddressNotFoundException(String message) {
        super(message);
    }
}
