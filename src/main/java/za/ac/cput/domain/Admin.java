package za.ac.cput.domain;
/*
Author: Siyamthanda Rolomana (217149073)
Date: 26 March 2025
 */
public class Admin {
    private String email;
    private String password;
    private String role;

    public Admin() {
    }

    private Admin (Builder builder) {
        this.email = builder.email;
        this.password = builder.password;
        this.role = builder.role;

    }
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Admin{" +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public static class Builder {
        private String email;
        private String password;
        private String role;
        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setRole(String role) {
            this.role = role;
            return this;
        }

        public Builder copy(Admin admin) {
            this.email = admin.email;
            this.password = admin.password;
            this.role = admin.role;
            return this;
        }

        public Admin build(){
            return new Admin(this);
        }
    }
}
