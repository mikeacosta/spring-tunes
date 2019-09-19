package net.postcore.springtunes.controllers;

import net.postcore.springtunes.models.Artist;
import net.postcore.springtunes.services.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArtistController {

    @Autowired
    private ArtistService service;

    @GetMapping("/api/artists")
    public ResponseEntity<List<Artist>> list(){
        List<Artist> list = service.list();
        return ResponseEntity.ok().body(list);
    }
}