package net.postcore.springtunes.repositories;

import net.postcore.springtunes.models.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
}
