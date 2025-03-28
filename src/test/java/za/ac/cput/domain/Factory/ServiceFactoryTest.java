package za.ac.cput.domain.Factory;

/* author:sphesihle slingile
230310257
date: 26 March 2025
 */
import za.ac.cput.domain.Service;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServiceFactoryTest {
    @Test
    public void testServiceCreation(){
        int serviceId = 1001;
        String serviceName = "painting";
        double price = 100.50;
        String description = "painting the interior of house";

        Service service1 = ServiceFactory.serviceCreation(serviceId, serviceName, price, description);

        assertNotNull(service1);
        assertEquals(serviceId, service1.getServiceId());
        assertEquals(serviceName, service1.getServiceName());
        assertEquals(price, service1.getPrice());
        assertEquals(description, service1.getDescription());

    }
    @Test
    public void testCreateServiceWithInvalidServiceId(){
        int serviceId = -1001;
        String serviceName = "painting";
        double price = 100.50;
        String description = "painting the interior of house";
        IllegalArgumentException iaException = assertThrows(IllegalArgumentException.class, ()->{
            ServiceFactory.serviceCreation(serviceId, serviceName, price, description);
        });
        assertEquals("serviceId must be greater than 0", iaException.getMessage());
    }
    @Test
    public void testCreateServiceWithInvalidServiceName(){
        int serviceId = 1001;
        String serviceName = "";
        double price = 100.50;
        String description = "painting the interior of house";
        IllegalArgumentException iaException = assertThrows(IllegalArgumentException.class, ()->{
            ServiceFactory.serviceCreation(serviceId, serviceName, price, description);
        });
        assertEquals("serviceName cannot be left empty", iaException.getMessage());
    }
    @Test
    public void testCreateServiceWithInvalidPrice(){
        int serviceId = 1001;
        String serviceName = "painting";
        double price = -100.50;
        String description = "painting the interior of house";
        IllegalArgumentException iaException = assertThrows(IllegalArgumentException.class, ()->{
            ServiceFactory.serviceCreation(serviceId, serviceName, price, description);
        });
        assertEquals("price must be greater than 0", iaException.getMessage());
    }
    @Test
    public void testCreateServiceWithInvalidDescription(){
        int serviceId = 1001;
        String serviceName = "painting";
        double price = 100.50;
        String description = "";
        IllegalArgumentException iaException = assertThrows(IllegalArgumentException.class, ()->{
            ServiceFactory.serviceCreation(serviceId, serviceName, price, description);
        });
        assertEquals("description cannot be left empty", iaException.getMessage());
    }}

