import java.util.Date;

public class Customer {
    private String fullName;
    private Date dateOfBirth;
    private String CMTND;

    public Customer() {
    }

    public Customer(String fullName, Date dateOfBirth, String CMTND) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.CMTND = CMTND;
    }

    public String getFullName() {
        return fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getCMTND() {
        return CMTND;
    }
}
