package ejemplo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ejemplo.modelo.userIni;

@Repository
public interface EjemploRepository extends JpaRepository<userIni, Long> {
    
}