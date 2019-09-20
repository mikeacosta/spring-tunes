package net.postcore.springtunes.services;

import net.postcore.springtunes.models.Album;

import java.util.List;

public interface AlbumService {

    long save(Album album);

    Album get(long id);

    List<Album> list();

    void update(long id, Album album);

    void delete(long id);
}
