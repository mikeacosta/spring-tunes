package net.postcore.springtunes.controllers;

import net.postcore.springtunes.models.Song;
import net.postcore.springtunes.services.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SongController {

    @Autowired
    SongService service;

    @GetMapping("/api/songs")
    public ResponseEntity<List<Song>> list(){
        List<Song> list = service.list();
        return ResponseEntity.ok().body(list);
    }

}
