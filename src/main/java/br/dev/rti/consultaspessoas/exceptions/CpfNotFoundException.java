package br.dev.rti.consultaspessoas.exceptions;

public class CpfNotFoundException extends RuntimeException {
    public CpfNotFoundException(String message) {
        super(message);
    }
}
