package net.pseudow.receivers;

import org.bukkit.entity.Player;

import java.util.Map;

public interface IReceiverManager {

    /**
     * This method allows you to change recievertype of a player.
     *
     * @param player - Player
     * @param type - ReceiverType
     * @return true if the player's receivertype has been changed in the type in parameter and false if the parameter was already set.
     */
    boolean setReceiver(Player player, ReceiverType type);

    /**
     * This method will disable the pet's view of a player.
     *
     * @param player - Player
     */
    void removeReceiver(Player player);

    /**
     * This method is a getter of an Map which contains
     * in key a player and in value his receivertype.
     *
     * @return Map<Player, ReceiverType>
     */
    Map<Player, ReceiverType> getReceivers();
}
