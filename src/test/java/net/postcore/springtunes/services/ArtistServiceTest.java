package net.postcore.springtunes.services;

import net.postcore.springtunes.models.Artist;
import net.postcore.springtunes.repositories.ArtistRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ArtistServiceTest {

    @InjectMocks
    ArtistServiceImpl service;

    @Mock
    ArtistRepository repository;

    @Test
    public void getTest() {
        when(repository.getOne(1L)).thenReturn(new Artist("Taylor Swift"));

        Artist artist = service.get(1L);

        assertEquals("Taylor Swift", artist.getName());
    }
}
