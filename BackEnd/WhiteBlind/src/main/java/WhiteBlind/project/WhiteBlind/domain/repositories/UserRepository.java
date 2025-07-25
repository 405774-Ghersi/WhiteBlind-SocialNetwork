package WhiteBlind.project.WhiteBlind.domain.repositories;

import WhiteBlind.project.WhiteBlind.domain.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
