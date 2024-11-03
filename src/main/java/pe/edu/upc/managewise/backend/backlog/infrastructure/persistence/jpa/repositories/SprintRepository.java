package pe.edu.upc.managewise.backend.backlog.infrastructure.persistence.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.managewise.backend.backlog.domain.model.aggregates.Sprint;

import java.util.Optional;

@Repository
public interface SprintRepository extends JpaRepository<Sprint, Long> {
    //para validaciones
    boolean existsByTitle(String title);
    boolean existsByTitleAndIdIsNot(String title, Long id);
    Optional<Sprint> findByTitle(String title);
}
