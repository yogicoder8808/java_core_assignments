package musicPlayerManagementSystem;

public sealed interface Shuffleable permits MP3Player, StreamingPlayer  {
	void shuffle();
}
