package guru.spring5.repositories;

import guru.spring5.domain.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublishRepository extends JpaRepository<Publisher, Long> {
}
