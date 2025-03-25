package za.ac.cput.domain;

public class Painter {

    private String painterID;
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private String address;
    private String role;


    private Painter() {

    }
    private Painter(Builder builder) {
        this.painterID = builder.painterID;
        this.name = builder.name;
        this.email = builder.email;
        this.password = builder.password;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
        this.role = builder.role;
    }
    public String getPainterID() {
        return painterID;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
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
        return "Painter{" +
                "address='" + address + '\'' +
                ", painterID='" + painterID + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
    public static class Builder {
        private String painterID;
        private String name;
        private String email;
        private String password;
        private String phoneNumber;
        private String address;
        private String role;


        public Painter.Builder setPainterID(int customerID) {
            this.painterID = painterID;
            return this;
        }

        public Painter.Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Painter.Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Painter.Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Painter.Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Painter.Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Painter.Builder setRole(String role) {
            this.role = role;
            return this;
        }
        public Builder copy(Painter painter) {
            this.painterID = painter.painterID;
            this.name = painter.name;
            this.email = painter.email;
            this.password = painter.password;
            this.phoneNumber = painter.phoneNumber;
            this.address = painter.address;
            this.role = painter.role;
            return this;
        }
        public Painter build(){
            return new Painter(this);
        }
    }
}

