package com.blurdel.sdjpa.domain.repositories;

import com.blurdel.sdjpa.domain.joined.ElectricGuitar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElectricGuitarRepository extends JpaRepository<ElectricGuitar, Long> {
}
