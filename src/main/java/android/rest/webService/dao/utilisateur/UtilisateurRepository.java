package android.rest.webService.dao.utilisateur;

import android.rest.webService.domain.utilisateur.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long>, UtilisateurRepositoryCustom {

    List<Utilisateur> findByEmail(String emailAddress);

}
