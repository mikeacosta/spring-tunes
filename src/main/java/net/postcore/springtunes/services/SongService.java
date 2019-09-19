package net.postcore.springtunes.services;

import net.postcore.springtunes.models.Song;

import java.util.List;

public interface SongService {

    long save(Song song);

    Song get(long id);

    List<Song> list();

    void update(long id, Song song);

    void delete(long id);
}
