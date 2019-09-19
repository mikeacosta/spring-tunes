package net.postcore.springtunes.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "Artist")
@Table(name = "artist")
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "artist_id")
    private Long artistId;

    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "artist")
    private Set<Single> singles = new HashSet<>();

    public Long getArtistId() {
        return artistId;
    }

    public void setArtistId(Long artistId) {
        this.artistId = artistId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Single> getSingles() {
        return singles;
    }

    public void setSingles(Set<Single> singles) {
        this.singles = singles;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "artistId=" + artistId +
                ", name='" + name + '\'' +
                ", singles=" + singles +
                '}';
    }
}
