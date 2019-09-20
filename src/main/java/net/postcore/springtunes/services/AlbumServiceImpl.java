package net.postcore.springtunes.services;

import net.postcore.springtunes.models.Album;
import net.postcore.springtunes.repositories.AlbumRepository;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class AlbumServiceImpl implements AlbumService {

    @Autowired
    AlbumRepository repository;

    @Override
    public long save(Album album) {
        return 0;
    }

    @Override
    public Album get(long id) {
        return null;
    }

    @Override
    @Transactional
    public List<Album> list() {
        List<Album> albums = repository.findAll();
        for (Album album : albums) {
            Hibernate.initialize(album.getTracks());
        }
        return albums;
    }

    @Override
    public void update(long id, Album album) {

    }

    @Override
    public void delete(long id) {

    }
}
