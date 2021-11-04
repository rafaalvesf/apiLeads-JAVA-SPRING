package br.com.elogroup.elogroup.repository;

import br.com.elogroup.elogroup.model.LeadModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LeadRepository extends JpaRepository<LeadModel, Long> {
}
