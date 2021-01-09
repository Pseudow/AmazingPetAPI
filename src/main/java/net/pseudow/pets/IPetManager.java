package net.pseudow.pets;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.List;

public interface IPetManager {

    /**
     * This method will spawn a pet who will follow the player.
     * To obtain a IPet there is an List who returns all PetType.
     * In PetType class there is a method createPet.
     * (If a player already has a pet, it will replace the last by the new).
     *
     * @param pet - IPet
     */
    void setPlayerPet(IPet pet);

    /**
     * This method allows you to remove a player's pet.
     *
     * @param owner - Player
     * @return true if the pet is removed and false if the player does not have any pets.
     */
    boolean removePlayersPet(Player owner);

    /**
     * This method will change the player pet's name.
     *
     * @param player - Player
     * @param name - String
     * @return true if the name is changed and false if the player does not have any pets.
     */
    boolean setName(Player player, String name);

    /**
     * This method will change the flank of the player's pet.
     * If the pet is at the right of the player, it will be changed into the left.
     * If the pet is at the left of the player, it will be changed into the right.
     *
     * @param player - Player
     * @return true if the flank is changed and false if the player does not have any pets.
     */
    boolean switchPetFlank(Player player);

    /**
     * This method will return an HashMap with in key the players,
     * and in values their pet.
     *
     * @return HashMap<Player, IPet>
     */
    HashMap<Player, IPet> getPlayersPet();

    /**
     * This method will return a list of all current pets.
     * You can remove some pets.
     * Warning: If you are not using the Premium Version,
     * you won't be allowed to add pets.
     *
     * @return List<PetType>
     */
    List<PetType> getPetTypes();
}
