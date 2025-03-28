package za.ac.cput.repository;


import za.ac.cput.domain.Admin;
import java.util.ArrayList;
import java.util.List;

public class AdminRepository implements IAdminRepository {
    private static AdminRepository repository = null;
    private List<Admin> adminList;

    private AdminRepository() {
        adminList = new ArrayList<>();
    }

    public static AdminRepository getRepository() {
        if (repository == null) {
            repository = new AdminRepository();
        }
        return repository;
    }

    @Override
    public List<Admin> getAll() {
        return adminList;
    }

    @Override
    public Admin create(Admin admin) {
        boolean success = adminList.add(admin);
        return success ? admin : null;
    }

    @Override
    public Admin read(String email) {
        for (Admin admin : adminList) {
            if (admin.getEmail().equals(email)) {
                return admin;
            }
        }
        return null;
    }

    @Override
    public Admin update(Admin admin) {
        Admin oldAdmin = read(admin.getEmail());
        if (oldAdmin != null) {
            adminList.remove(oldAdmin);
            adminList.add(admin);
            return admin;
        }
        return null;
    }

    @Override
    public boolean delete(String email) {
        Admin admin = read(email);
        if (admin != null) {
            adminList.remove(admin);
            return true;
        }
        return false;
    }
}
