package com.soinikov.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.soinikov.game.MyGdxGame;

public class DesktopLauncher {
	public static void main (String[] arg) {

		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 900;
		config.height = 700;
		config.title = ("Bird. Score: " );
		new LwjglApplication(new MyGdxGame(), config);
	}
}

