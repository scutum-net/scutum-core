package scutum.core.contracts;

public class Alert {
    private String details;

    public Alert(String details) {
        this.details = details;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
