package level_0;

import java.net.URI;

import javax.swing.JOptionPane;

public class SoundtrackToLife {

	public static void main(String[] args) {

		int userMood = JOptionPane.showOptionDialog(null, "What mood are you in?", "Pop-up Title", 0,
		JOptionPane.INFORMATION_MESSAGE, null, new String[] { "happy", "angry", "sad" }, null);
		JOptionPane.showMessageDialog(null, userMood);
		if (userMood == 0) {
			playVideo("https://bit.ly/video-for-sad");
		} else if (userMood == 1) {
			playVideo("https://bit.ly/video-for-angry");
		} else if (userMood == 2) {
			playVideo("https://bit.ly/video-for-happy");
		}
	}

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
