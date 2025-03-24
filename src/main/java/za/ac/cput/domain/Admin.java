package za.ac.cput.domain;
/*
Siyamthanda Rolomana
 */
public class Admin {
    private String admin_Id;
    private String email;
    private String password;
    private String role;

    public Admin() {
    }

    private Admin (Builder builder) {
        this.admin_Id = builder.admin_Id;
        this.email = builder.email;
        this.password = builder.password;
        this.role = builder.role;
    }
    public  String Admin_Id(){
        return  admin_Id;
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
                "admin_Id='" + admin_Id + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public static class Builder {

        private String admin_Id;
        private String email;
        private String password;
        private String role;
        public Builder setAdmin_Id(String admin_Id) {
            this.admin_Id = admin_Id;
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
