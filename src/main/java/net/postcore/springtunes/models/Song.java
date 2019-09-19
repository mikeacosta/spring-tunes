package net.postcore.springtunes.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "Song")
@Table(name = "song")
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "song_id")
    private Long songId;
    private String title;
    @OneToMany(mappedBy = "song")
    private Set<Single> singles = new HashSet<>();
}
