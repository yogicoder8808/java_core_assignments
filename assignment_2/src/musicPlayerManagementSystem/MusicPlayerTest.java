package musicPlayerManagementSystem;

public class MusicPlayerTest {

	public static void main(String[] args) {
		Playable mp3Player = new MP3Player("Song1.mp3");
        Playable cdPlayer = new CDPlayer("Track1");
        Playable streamingPlayer = new StreamingPlayer("Stream1");

        Skippable mp3Skippable = (Skippable) mp3Player;
        Skippable cdSkippable = (Skippable) cdPlayer;
        Skippable streamingSkippable = (Skippable) streamingPlayer;

        Shuffleable mp3Shuffleable = (Shuffleable) mp3Player;
        Shuffleable streamingShuffleable = (Shuffleable) streamingPlayer;

        System.out.println("Testing MP3 Player:");
        mp3Player.play();
        mp3Player.pause();
        mp3Player.stop();
        mp3Skippable.skipForward();
        mp3Skippable.skipBackward();
        mp3Shuffleable.shuffle();

        System.out.println("\nTesting CD Player:");
        cdPlayer.play();
        cdPlayer.pause();
        cdPlayer.stop();
        cdSkippable.skipForward();
        cdSkippable.skipBackward();

        System.out.println("\nTesting Streaming Player:");
        streamingPlayer.play();
        streamingPlayer.pause();
        streamingPlayer.stop();
        streamingSkippable.skipForward();
        streamingSkippable.skipBackward();
        streamingShuffleable.shuffle();

	}

}
