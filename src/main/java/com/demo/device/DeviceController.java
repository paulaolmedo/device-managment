package com.demo.device;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/device")
public class DeviceController {
    //@Autowired
    //DeviceRepository deviceRepository;

    private final DeviceRepository deviceRepository;

    DeviceController(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<Object> newDevice(@RequestBody Device device){
        return ResponseEntity.ok(this.deviceRepository.save(device));
    }

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Object> getAll(){ 
        return ResponseEntity.ok(this.deviceRepository.findAll());
    }

    @RequestMapping(value = "/{Id}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Object> getById(@PathVariable (value="Id") final Long Id) {
        return ResponseEntity.ok(this.deviceRepository.findById(Id));
    }

    @RequestMapping(value = "/findByMAC/{hardwareAddress}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Object> getByHardwareAddress(@PathVariable (value="hardwareAddress") final String hardwareAddress) {
        return ResponseEntity.ok(this.deviceRepository.findByHardwareAddress(hardwareAddress));
    }
}
