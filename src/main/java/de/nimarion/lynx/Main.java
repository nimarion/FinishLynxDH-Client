package de.nimarion.lynx;

import de.nimarion.lynx.protocol.lynx.FinishLynxClient;
public class Main {

    public static void main(String... args) {
        FinishLynxClient geminiClient = new FinishLynxClient("127.0.0.1", 9998);
        geminiClient.start();
    }

}
