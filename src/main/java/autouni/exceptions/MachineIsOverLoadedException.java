package autouni.exceptions;

public class MachineIsOverLoadedException extends RuntimeException

{
    public MachineIsOverLoadedException(String message) {
        super(message);
    }
}
