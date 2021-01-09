package net.pseudow.events;

import net.pseudow.receivers.ReceiverType;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerReceiverEvent extends Event implements Cancellable {
    private static final HandlerList handlerList = new HandlerList();
    private final Player player;
    private final ReceiverType receiverType;
    private boolean cancelled;

    public PlayerReceiverEvent(Player player, ReceiverType receiverType) {
        this.player = player;
        this.receiverType = receiverType;
        this.cancelled = false;
    }

    public Player getPlayer() {
        return player;
    }

    public ReceiverType getReceiverType() {
        return receiverType;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        this.cancelled = b;
    }

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }
}
