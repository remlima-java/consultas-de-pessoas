package br.dev.rti.consultaspessoas.exceptions;

public class CashNotFoundException extends RuntimeException {
    public CashNotFoundException(String message) {
        super(message);
    }
}
