package net.pseudow.pets;

import org.bukkit.entity.Player;

@FunctionalInterface
public interface PetConsumer {
    IPet createPet(Player player);
}
