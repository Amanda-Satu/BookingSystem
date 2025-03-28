package za.ac.cput.domain.Factory.Repository;

/* author:sphesihle slingile
230310257
date: 28 March 2025
 */
import java.util.List;
import za.ac.cput.domain.Service;
public interface IServiceRepository extends IRepository<Service, Integer>{
    List<Service> getAll();
}
