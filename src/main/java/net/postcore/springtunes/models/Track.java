package net.postcore.springtunes.models;

import javax.persistence.*;

@Entity(name = "Track")
@Table(name = "track")
public class Track {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "track_id")
    Long trackId;

    @ManyToOne
    @MapsId("single_id")
    @JoinColumn(name = "single_id")
    Single single;

    @ManyToOne
    @MapsId("album_id")
    @JoinColumn(name = "album_id")
    Album album;

    @Column(name = "track_num")
    Integer trackNum;

    public Track() {
    }

    public Long getTrackId() {
        return trackId;
    }

    public void setTrackId(Long trackId) {
        this.trackId = trackId;
    }

    public Single getSingle() {
        return single;
    }

    public void setSingle(Single single) {
        this.single = single;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Integer getTrackNum() {
        return trackNum;
    }

    public void setTrackNum(Integer trackNum) {
        this.trackNum = trackNum;
    }
}
