package za.ac.cput.domain;

public class Service {
    private int serviceId;
    private String serviceName;
    private double price;
    private String description;

    private Service(){

    }
    private Service(Builder Builder){
        this.serviceId = Builder.serviceId;
        this.serviceName = Builder.serviceName;
        this.price = Builder.price;
        this.description = Builder.description;

    }
    public int getServiceId(){
        return serviceId;
    }
    public String getServiceName(){
        return serviceName;
    }
    public double getPrice(){
        return price;
    }
    public String getDescription(){
        return description;
    }
    @Override
    public String toString() {
        return "Service{" +
                "serviceId=" + serviceId +
                ", serviceName='" + serviceName + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

    public static class Builder{
        private int serviceId;
        private String serviceName;
        private double price;
        private String description;


        public Builder setServiceId(int serviceId){
            this.serviceId = serviceId;
            return this;}

        public Builder setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;}

        public Builder setPrice(double price){
            this.price = price;
            return this;}

        public Builder setDescription(String description){
            this.description = description;
            return this;}

        public Service build(){return new Service(this);}

    }
}




