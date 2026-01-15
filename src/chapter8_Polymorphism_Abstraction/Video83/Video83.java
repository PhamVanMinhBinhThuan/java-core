package chapter8_Polymorphism_Abstraction.Video83;

public class Video83 {
	public static void main(String[] args) {
		Song mySong = new Song("Shape of You", "Ed Sheeran");
		Video myVideo = new Video("Inception", 148);

		Playable[] list = { mySong, myVideo };

		for (Playable playable : list) {
			playable.play();
			playable.pause();
			System.out.println();
		}
	}
}
