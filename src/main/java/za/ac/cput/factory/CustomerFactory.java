package za.ac.cput.factory;

//Amanda Satu (21094008)

import za.ac.cput.domain.Customer;

import java.util.regex.Pattern;


public class CustomerFactory {

    public static Customer createCustomer(String customerID, String name, String email, String password,
                                          String phoneNumber, String address, String role) {


        if (customerID == null || customerID.isEmpty() || name == null || name.isEmpty() || email == null || email.isEmpty() ||
                password == null || password.isEmpty() || role == null || role.isEmpty()) {
            throw new IllegalArgumentException("Fields cannot be empty or null");
        }

        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email format");
        }

    return new Customer.Builder()
                .setCustomerID(customerID)
                .setName(name)
                .setEmail(email)
                .setPassword(password)
                .setPhoneNumber(phoneNumber)
                .setAddress(address)
                .setRole(role)
                .build();
    }

//    public static boolean patternMatches(String email, String regexPattern) {
//        return Pattern.compile(regexPattern)
//                .matcher(email)
//                .matches();
//    }
        private static boolean isValidEmail(String email) {

        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(emailRegex);
            return pattern.matcher(email).matches();
}




}//end



