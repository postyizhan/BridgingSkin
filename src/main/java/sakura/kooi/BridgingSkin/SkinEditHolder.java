package sakura.kooi.BridgingSkin;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import sakura.kooi.BridgingSkin.data.PlayerSkin;

public class SkinEditHolder implements InventoryHolder {
    @Getter
    private final PlayerSkin skins;
    @Setter
    private Inventory inv;

    public SkinEditHolder(final PlayerSkin skins) {
        this.skins = skins;
    }

    @Override
    public Inventory getInventory() {
        return inv;
    }

}
