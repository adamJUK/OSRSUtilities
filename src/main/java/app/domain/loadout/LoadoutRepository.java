package app.domain.loadout;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoadoutRepository extends JpaRepository<Loadout, Integer> {

    List<Loadout> findAllByAccountId(int accountId);
}
