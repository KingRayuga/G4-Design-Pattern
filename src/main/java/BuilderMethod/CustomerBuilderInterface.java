package BuilderMethod;

public interface CustomerBuilderInterface {
    CustomerBuilderInterface firstName(String firstName);
    CustomerBuilderInterface lastName(String lastName);
    CustomerBuilderInterface middleName(String middleName);
    CustomerBuilderInterface primaryEmail(String primaryEmail);
    CustomerBuilderInterface secondaryEmail(String secondaryEmail);
    CustomerBuilderInterface primaryMobileNumber(String primaryMobileNumber);
    CustomerBuilderInterface secondaryMobileNumber(String secondaryMobileNumber);
}
