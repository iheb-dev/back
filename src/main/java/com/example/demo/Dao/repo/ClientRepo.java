
package com.example.demo.Dao.repo;

import com.example.demo.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepo extends JpaRepository <Client,Long>{



    Client findByIdClient(Long idClient );
    Client findByEmail(String email);
    Client save(Client client);
    void deleteClientByIdClient(Long idClient );
}
