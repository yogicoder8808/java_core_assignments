package musicPlayerManagementSystem;

public final class MP3Player implements Playable, Skippable, Shuffleable{
	private String currentTrack;

    public MP3Player(String currentTrack) {
        this.currentTrack = currentTrack;
    }

    @Override
    public void play() {
        System.out.println("Playing MP3: " + currentTrack);
    }

    @Override
    public void pause() {
        System.out.println("Pausing MP3: " + currentTrack);
    }

    @Override
    public void stop() {
        System.out.println("Stopping MP3: " + currentTrack);
    }

    @Override
    public void skipForward() {
        System.out.println("Skipping to next MP3 track.");
    }

    @Override
    public void skipBackward() {
        System.out.println("Skipping to previous MP3 track.");
    }

    @Override
    public void shuffle() {
        System.out.println("Shuffling MP3 tracks.");
    }
}
