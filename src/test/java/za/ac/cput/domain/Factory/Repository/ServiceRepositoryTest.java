package za.ac.cput.domain.Factory.Repository;

import za.ac.cput.domain.Service;
import static org.junit.jupiter.api.Assertions.*;
//import za.ac.cput.Factory.Repository.ServiceRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/* author:sphesihle slingile
230310257
date: 28 March 2025
 */
class ServiceRepositoryTest {
    private ServiceRepository repository;
    private Service service;

    @BeforeEach
    void setUp() {
        repository = ServiceRepository.getRepository();
        service = new Service.Builder()
                .setServiceId(100)
                .setServiceName("Painting")
                .build();
    }
    @Test
    public void create(){
        Service serviceCreated = repository.create(service);
        assertNotNull(serviceCreated);
        assertEquals(service.getServiceId(), serviceCreated.getServiceId());
    }
    @Test
    public void read(){
        repository.create(service);
        Service serviceRead = repository.read(service.getServiceId());
        assertNotNull(serviceRead);
        assertEquals(100, serviceRead.getServiceId());
    }
    @Test
    public void update(){
        repository.create(service);

        service = new Service.Builder()
                .setServiceId(100)
                .setServiceName("Plastering")
                .build();
        Service serviceUpdated = repository.update(service);
        assertNotNull(serviceUpdated);
        assertEquals("Plastering", serviceUpdated.getServiceName());

    }
    @Test
    public void delete(){
        repository.create(service);
        boolean deleted = repository.delete(100);
        assertFalse(deleted);

    }

}