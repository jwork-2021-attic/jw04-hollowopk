package com.anish.calabashbros;

import asciiPanel.AsciiPanel;

public class Wall extends Thing {

    Wall(World world) {
        super(AsciiPanel.black, (char) 177, world);
    }

}
