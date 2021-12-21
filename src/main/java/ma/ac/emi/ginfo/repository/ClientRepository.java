package ma.ac.emi.ginfo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.ac.emi.ginfo.models.ClientModel;


@Repository

public interface ClientRepository extends JpaRepository<ClientModel,Long>   {

}
