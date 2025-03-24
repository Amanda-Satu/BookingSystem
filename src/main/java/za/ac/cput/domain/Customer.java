package za.ac.cput.domain;

//Amanda Satu

public class Customer {

    private int customerID;
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private String address;
    private String role;

    private Customer() {
    }

    private Customer(Builder builder) {
        this.customerID = builder.customerID;
        this.name = builder.name;
        this.email = builder.email;
        this.password = builder.password;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
        this.role = builder.role;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public static class Builder {
        private int customerID;
        private String name;
        private String email;
        private String password;
        private String phoneNumber;
        private String address;
        private String role;


        public Builder setCustomerID(int customerID) {
            this.customerID = customerID;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setRole(String role) {
            this.role = role;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }




}//end

