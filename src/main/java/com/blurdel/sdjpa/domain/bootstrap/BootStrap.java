package com.blurdel.sdjpa.domain.bootstrap;

import com.blurdel.sdjpa.domain.joined.ElectricGuitar;
import com.blurdel.sdjpa.domain.repositories.ElectricGuitarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrap implements CommandLineRunner {

    @Autowired
    ElectricGuitarRepository electricGuitarRepo;

    @Override
    public void run(String... args) throws Exception {

        ElectricGuitar eg = new ElectricGuitar();
        eg.setNumberOfStrings(6);
        eg.setNumberOfPickups(2);
        electricGuitarRepo.save(eg);
    }
}
