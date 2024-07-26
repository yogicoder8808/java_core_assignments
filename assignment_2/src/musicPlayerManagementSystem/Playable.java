package musicPlayerManagementSystem;

public sealed interface Playable permits CDPlayer, MP3Player, StreamingPlayer{
 void play();
 void pause();
 void stop();
}
