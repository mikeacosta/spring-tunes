package net.postcore.springtunes.services;

import net.postcore.springtunes.models.Artist;

import java.util.List;

public interface ArtistService {

    long save(Artist artists);

    Artist get(long id);

    List<Artist> list();

    void update(long id, Artist artist);

    void delete(long id);
}
