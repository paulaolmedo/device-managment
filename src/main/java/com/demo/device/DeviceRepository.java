package com.demo.device;

import java.util.List;
import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;

public interface DeviceRepository extends DatastoreRepository<Device, Long> {
    List<Device> findByHardwareAddress(String hardwareAddress);
}