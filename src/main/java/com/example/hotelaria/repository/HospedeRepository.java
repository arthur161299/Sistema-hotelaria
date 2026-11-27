package com.example.hotelaria.repository;

import com.example.hotelaria.model.Hospede;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositório JPA para operações de persistência de hóspedes.
 */
@Repository
public interface HospedeRepository extends JpaRepository<Hospede, Long> {

    Optional<Hospede> findByCpf(String cpf);

    Optional<Hospede> findByEmail(String email);

    boolean existsByCpf(String cpf);

    boolean existsByEmail(String email);
}
