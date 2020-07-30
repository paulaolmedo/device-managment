package com.demo.device;

@RestController
@RequestMapping("/device")
public class DeviceController {
    //@Autowired
    //DeviceRepository deviceRepository;

    private final DeviceRepository deviceRepository;

    DeviceController(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }
}
