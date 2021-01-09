package net.pseudow.pets;

import net.pseudow.AmazingPetAPI;
import net.pseudow.utils.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class PetType {
    private final PetConsumer consumer;
    private final ItemStack icon;

    PetType(AmazingPetAPI amazingPet, String defaultName, Rarity rarity, PetConsumer consumer, ItemBuilder icon) {
        this.consumer = consumer;
        this.icon = icon.displayname(amazingPet.getPetName(defaultName)).lore("§7Rareté: " + rarity.getDisplayName(), "§C ", "§e§lCLIQUER POUR LE FAIRE APPARAITRE").build();
    }

    PetType(Rarity rarity, PetConsumer consumer, ItemStack icon) {
        this.consumer = consumer;
        this.icon = icon;
    }

    PetType(AmazingPetAPI amazingPet, String defaultName, Rarity rarity, PetConsumer consumer, Material material, List<String> lore) {
        this.consumer = consumer;

        List<String> newLore = new ArrayList<>();
        newLore.add("§7Rareté: " + rarity.getDisplayName());
        newLore.add("§c");
        newLore.addAll(lore);
        newLore.add("§b");
        newLore.add("§e§lCLIQUER POUR LE FAIRE APPARAITRE");

        this.icon = new ItemBuilder(material).displayname(amazingPet.getPetName(defaultName)).lore(newLore).build();
    }

    public PetConsumer getConsumer() {
        return consumer;
    }

    public ItemStack getIcon() {
        return icon;
    }

    public enum Rarity {
        COMMON("§aCommune"), RARE("§bRare"), EPIC("§dEpique"), LEGENDARY("§6Légendaire");

        private final String displayName;

        Rarity(String displayName) {
            this.displayName = displayName;
        }

        public String getDisplayName() {
            return displayName;
        }
    }
}
