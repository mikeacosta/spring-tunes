package net.postcore.springtunes.services;

import net.postcore.springtunes.models.Artist;
import net.postcore.springtunes.repositories.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ArtistServiceImpl implements ArtistService {

    @Autowired
    private ArtistRepository repository;

    @Override
    public long save(Artist artists) {
        return 0;
    }

    @Override
    public Artist get(long id) {
        return null;
    }

    @Override
    @Transactional
    public List<Artist> list() {
        return repository.findAll();
    }

    @Override
    public void update(long id, Artist artist) {

    }

    @Override
    public void delete(long id) {

    }
}
