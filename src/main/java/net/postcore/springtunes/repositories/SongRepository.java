package net.postcore.springtunes.repositories;

import net.postcore.springtunes.models.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}
