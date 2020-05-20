package library.mediatypes;

import library.libraryitems.Media;

public class Audio extends Media {

    private String artistOrNarrator;
    private boolean music;

    public Audio(String name, int id, int checkoutDurationInDays, double checkoutFee, boolean stocked, String producer,
                 boolean matureAudiencesOnly, boolean needComputerToUse, String genre, String artistOrNarrator,
                 boolean music, float duration) {
        super(name, id, checkoutDurationInDays, checkoutFee, stocked, producer, matureAudiencesOnly, needComputerToUse,
                genre, duration);
        setArtistOrNarrator(artistOrNarrator);
        setMusic(music);
    }

    public String getArtistOrNarrator() {
        return artistOrNarrator;
    }

    public void setArtistOrNarrator(String artistOrNarrator) {
        this.artistOrNarrator = artistOrNarrator;
    }

    public boolean isMusic() {
        return music;
    }

    public void setMusic(boolean music) {
        this.music = music;
    }

    public String isItMusic() {
        return music ? "This is music!" : "This is an audio book!";
    }
}
