package net.postcore.springtunes.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "Single")
@Table(name = "single")
public class Single {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "single_id")
    Long singleId;

    @ManyToOne
    @MapsId("artist_id")
    @JoinColumn(name = "artist_id")
    Artist artist;

    @ManyToOne
    @MapsId("song_id")
    @JoinColumn(name = "song_id")
    Song song;

    @OneToMany(mappedBy = "single")
    private Set<Track> tracks = new HashSet<>();

    public Single() {
    }

    public Long getSingleId() {
        return singleId;
    }

    public void setSingleId(Long singleId) {
        this.singleId = singleId;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public Set<Track> getTracks() {
        return tracks;
    }

    public void setTracks(Set<Track> tracks) {
        this.tracks = tracks;
    }
}
