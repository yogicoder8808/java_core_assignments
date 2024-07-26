package musicPlayerManagementSystem;

public final class StreamingPlayer implements Playable, Skippable, Shuffleable {
    private String currentTrack;

    public StreamingPlayer(String currentTrack) {
        this.currentTrack = currentTrack;
    }

    @Override
    public void play() {
        System.out.println("Playing streaming: " + currentTrack);
    }

    @Override
    public void pause() {
        System.out.println("Pausing streaming: " + currentTrack);
    }

    @Override
    public void stop() {
        System.out.println("Stopping streaming: " + currentTrack);
    }

    @Override
    public void skipForward() {
        System.out.println("Skipping to next streaming track.");
    }

    @Override
    public void skipBackward() {
        System.out.println("Skipping to previous streaming track.");
    }

    @Override
    public void shuffle() {
        System.out.println("Shuffling streaming tracks.");
    }
}

