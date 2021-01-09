package net.pseudow;

import net.pseudow.pets.IPet;
import net.pseudow.pets.IPetManager;
import net.pseudow.receivers.IReceiverManager;
import net.pseudow.receivers.ReceiverType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.java.JavaPlugin;

public abstract class AmazingPetAPI {
    private static AmazingPetAPI instance;
    private final JavaPlugin plugin;

    public AmazingPetAPI(JavaPlugin javaPlugin) {
        instance = this;
        this.plugin = javaPlugin;
    }

    /**
     * This method returns an instance of IPetManager.
     * The pet's manager can help you if you want to spawn a pet
     * or remove one and have access to another methods.
     *
     * @return IPetManager
     */
    public abstract IPetManager getPetManager();

    /**
     * This method returns an instance of IReceiverManager.
     * You will be able to modify and control the players pet's visibility.
     *
     * @return IReceiverManager
     */
    public abstract IReceiverManager getReceiverManager();

    /**
     * This method returns a message in our configurable plugin file.
     * It automatically translate all chat colors (& to §).
     *
     * @param path - String
     * @return String
     */
    public abstract String getConfigMessage(String path);

    /**
     * This method returns a pet's name in our configurable plugin file.
     * It automatically translate all chat colors (& to §).
     *
     * @param petName - String
     * @return String
     */
    public abstract String getPetName(String petName);

    /**
     * This method let you modify and replace the main inventory when a
     * player use the command /amazingpet in our plugin.
     *
     * @param inventory - Inventory
     */
    public abstract void setGuiOnCommand(Inventory inventory);

    /**
     * This method allows you to check if a player can display a pet.
     * @param player - Player
     * @param type - ReceiverType
     * @param pet - IPet
     * @return Boolean
     */
    public abstract boolean shouldSendPet(Player player, ReceiverType type, IPet pet);

    /**
     * This method is a simple method which returns an instance
     * of the JavaPlugin of our main class plugin.
     * @return JavaPlugin
     */
    public JavaPlugin getPlugin() {
        return plugin;
    }
    /**
     * This method is a singleton which allows you to get an instance
     * of the AmazingPet API.
     * @return AmazingPetAPI
     */
    public static AmazingPetAPI get() {
        return instance;
    }
}
