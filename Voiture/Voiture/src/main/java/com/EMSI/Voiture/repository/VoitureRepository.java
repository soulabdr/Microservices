package com.EMSI.Voiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EMSI.Voiture.model.voiture;

@Repository
public interface VoitureRepository extends JpaRepository<voiture, Long> {

}
