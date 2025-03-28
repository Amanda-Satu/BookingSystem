package za.ac.cput.factory;
/*
Author: Siyamthanda Rolomana (217149073)
Date: 26 March 2025
 */
import za.ac.cput.domain.Admin;
import za.ac.cput.util.Helper;

public class AdminFactory {

    public static Admin createAdmin(String email, String password, String role) {
        if (Helper.isNullorEmpty(password) || Helper.isNullorEmpty(role))
            return null;
        if (!Helper.isValidEmail(email))
            return null;

        return new Admin.Builder()
                .setEmail(email)
                .setPassword(password)
                .setRole(role)
                .build();
    }
}

