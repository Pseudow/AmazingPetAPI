package net.pseudow.pets;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public interface IPet {
    Player getOwner();
    Location getLocation();

    void setAMInvisible(boolean option);
    void setLocation(Location location);
    void setRightFlank(boolean option);

    boolean isRightFlank();
    boolean isInvisible();

    void setInvisible(boolean option);
    void update();
    void sendInitPacket(Player player);
    void sendDestroyPacket(Player player);
    void setName(String name);

    String getName();
}
