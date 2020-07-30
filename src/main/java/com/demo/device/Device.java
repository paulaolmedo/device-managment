package com.demo.device;
import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;
import org.springframework.data.annotation.Id;

@Entity(name = "devices")
public class Device {
    @Id
    Long id;

    private String hardwareAddress;
    private String timestamp;

    public Device(String hardwareAddress, String timestamp) {
        this.hardwareAddress = hardwareAddress;
        this.timestamp = timestamp;
    }

    public long getId() {
        return this.id;
    }

    public String getHardwareAddress(){
        return hardwareAddress;
    }
    public String getTimestamp(){
        return timestamp;
    }

}
