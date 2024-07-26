package musicPlayerManagementSystem;

public sealed interface Skippable permits CDPlayer, MP3Player, StreamingPlayer  {
    void skipForward();
    void skipBackward();
}
