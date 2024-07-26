package musicPlayerManagementSystem;

public final class CDPlayer implements Playable, Skippable {
    private String currentTrack;

    public CDPlayer(String currentTrack) {
        this.currentTrack = currentTrack;
    }

    @Override
    public void play() {
        System.out.println("Playing CD: " + currentTrack);
    }

    @Override
    public void pause() {
        System.out.println("Pausing CD: " + currentTrack);
    }

    @Override
    public void stop() {
        System.out.println("Stopping CD: " + currentTrack);
    }

    @Override
    public void skipForward() {
        System.out.println("Skipping to next CD track.");
    }

    @Override
    public void skipBackward() {
        System.out.println("Skipping to previous CD track.");
    }
}

