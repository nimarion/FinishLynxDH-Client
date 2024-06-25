package de.nimarion.lynx.protocol;

public interface Packet {

    public abstract boolean isPacket(byte[] data);

    public abstract Event handleData(String data);
    
}
