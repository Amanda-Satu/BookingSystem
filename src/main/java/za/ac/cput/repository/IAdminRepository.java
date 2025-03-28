package za.ac.cput.repository;
/*
Author: Siyamthanda Rolomana (217149073)
Date: 26 March 2025
 */
import za.ac.cput.domain.Admin;
import java.util.List;

public interface IAdminRepository extends IRepository<Admin, String> {
    List<Admin> getAll();
}
