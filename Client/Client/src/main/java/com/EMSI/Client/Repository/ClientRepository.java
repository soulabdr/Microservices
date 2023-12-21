package com.EMSI.Client.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EMSI.Client.Model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client , Long>{

}
