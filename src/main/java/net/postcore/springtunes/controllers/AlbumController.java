package net.postcore.springtunes.controllers;

import net.postcore.springtunes.models.Album;
import net.postcore.springtunes.services.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlbumController {

    @Autowired
    private AlbumService service;

    @GetMapping("/api/albums")
    public ResponseEntity<List<Album>> list(){
        List<Album> list = service.list();
        return ResponseEntity.ok().body(list);
    }
}
