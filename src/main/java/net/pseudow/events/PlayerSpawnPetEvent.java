package net.pseudow.events;

import net.pseudow.pets.IPet;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerSpawnPetEvent extends Event implements Cancellable {
    private static final HandlerList handlerList = new HandlerList();
    private final Player player;
    private final IPet pet;
    private boolean cancelled;

    public PlayerSpawnPetEvent(Player player, IPet pet) {
        this.player = player;
        this.pet = pet;
        this.cancelled = false;
    }

    public Player getPlayer() {
        return player;
    }

    public IPet getPet() {
        return pet;
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
