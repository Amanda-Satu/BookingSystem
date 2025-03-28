package za.ac.cput.domain.Factory.Repository;

/* author:sphesihle slingile
230310257
date: 28 March 2025
 */
import za.ac.cput.domain.Service;
import java.util.List;
import java.util.ArrayList;

public class ServiceRepository implements IServiceRepository{
    private static ServiceRepository repository = null;
    private List<Service> serviceList ;

    private ServiceRepository(){
        serviceList = new ArrayList<Service>();
    }
    public static ServiceRepository getRepository(){
        if(repository == null){
            repository = new ServiceRepository();
        } return repository;
    }
    @Override
    public List<Service> getAll(){
        return null;
    }
    @Override
    public Service create(Service service){
        boolean success = serviceList.add(service);
        if(success){
            return service;
        }
        return null;
    }
    @Override
    public Service read(Integer id){
        for (Service service: serviceList){
            if(service.getServiceId()==id){
                return service;
            }
        }
        return null;}

    @Override
    public Service update(Service service){
        Service oldService = read(service.getServiceId());
        if(oldService != null){
            serviceList.remove(oldService);
            serviceList.add(service);
            return service;
        }
        return null;}
    public boolean delete(Integer id){
        Service oldService = read(id);
        if(oldService != null){
            serviceList.remove(oldService);
        }

        return false;
    }
}

