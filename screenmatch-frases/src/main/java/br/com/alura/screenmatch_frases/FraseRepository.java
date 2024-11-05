package br.com.alura.screenmatch_frases;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FraseRepository extends JpaRepository<Frase, Long> {
    @Query("SELECT f FROM Frase f ORDER BY function('RAND') LIMIT 1")
    Frase buscaFraseAleatoria();
}
