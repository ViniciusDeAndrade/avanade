package com.avadade.rest.exception;

public class ErrorDTO {

    private String field, message;

    public ErrorDTO(String field, String message) {
        this.field = field;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String getField() {
        return field;
    }
}
