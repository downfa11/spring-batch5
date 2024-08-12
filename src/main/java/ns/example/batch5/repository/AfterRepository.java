package ns.example.batch5.repository;

import ns.example.batch5.entity.AfterEntity;
import ns.example.batch5.entity.BeforeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AfterRepository extends JpaRepository<AfterEntity, Long> {

}
