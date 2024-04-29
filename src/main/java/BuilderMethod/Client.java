package BuilderMethod;

public class Client {
    public static void main(String[] args) {
        Customer customer = new CustomerBuilder()
                .firstName("Yashraj")
                .lastName("Sinha")
                .primaryEmail("random@gmail.com")
                .primaryMobileNumber("xxxxxxxxxx")
                .build();

        System.out.println(customer.toString());
    }
}
