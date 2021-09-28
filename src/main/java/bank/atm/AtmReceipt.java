package bank.atm;

public class AtmReceipt {

    public static String SUCCESS_MESSAGE = "Great Success!";
    public static String ERROR_MESSAGE = "Oh, snap!";

    private String message;

    public AtmReceipt(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "AtmReceipt{" +
                "message='" + message + '\'' +
                '}';
    }
}
