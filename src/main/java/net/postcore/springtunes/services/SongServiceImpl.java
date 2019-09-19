package net.postcore.springtunes.services;

import net.postcore.springtunes.models.Song;
import net.postcore.springtunes.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements SongService {

    @Autowired
    SongRepository repository;

    @Override
    public long save(Song song) {
        return 0;
    }

    @Override
    public Song get(long id) {
        return null;
    }

    @Override
    public List<Song> list() {
        return repository.findAll();
    }

    @Override
    public void update(long id, Song song) {

    }

    @Override
    public void delete(long id) {

    }
}
