package za.ac.cput.factory;

import za.ac.cput.domain.Service;
/* author:sphesihle slingile
          230310257
   date: 26 March 2025
 */
public class ServiceFactory {
    public static Service serviceCreation(int serviceId, String serviceName, double price,
                                          String description){
        if(serviceId <=0){
            throw new IllegalArgumentException("serviceId must be greater than 0");
        }
        if(serviceName.isEmpty()){
            throw new IllegalArgumentException("serviceName cannot be left empty");
        }
        if(price<=0){
            throw new IllegalArgumentException("price must be greater than 0");
        }
        if(description.isEmpty()){
            throw new IllegalArgumentException("description cannot be left empty");
        }
        return new Service.Builder()
                .setServiceId(serviceId)
                .setServiceName(serviceName)
                .setPrice(price)
                .setDescription(description)
                .build();

    }
}
