package za.ac.cput.domain;

public class Painter {

    private String painterID;
    private String name;
    private String email;
    private String phoneNumber;
    private String role;

    private Painter() {

    }
    private Painter(Builder builder) {
        this.painterID = builder.painterID;
        this.name = builder.name;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
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
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Painter{" + 
                ", painterID='" + painterID + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
    public static class Builder {
        private String painterID;
        private String name;
        private String email;
        private String phoneNumber;
        private String role;

        
        public Painter.Builder setPainterID(String painterID) {
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


        public Painter.Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
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
            this.phoneNumber = painter.phoneNumber;
            this.role = painter.role;
            return this;
        }
        public Painter build(){
            return new Painter(this);
        }
    }
}

