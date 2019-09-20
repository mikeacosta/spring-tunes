package net.postcore.springtunes.repositories;

import net.postcore.springtunes.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
}
