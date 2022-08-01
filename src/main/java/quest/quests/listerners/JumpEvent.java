package quest.quests.listerners;

import com.destroystokyo.paper.event.player.PlayerJumpEvent;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class JumpEvent implements Listener {

    @EventHandler

    public void playerJump(PlayerJumpEvent event){

        //System.out.println("vyskocil z " + event.getFrom().getBlock() + "hrac" + event.getPlayer().getName() + "na" + event.getTo().getBlock());
        Player player = event.getPlayer();
        ItemStack diamond = new ItemStack(Material.DIAMOND, 1 );
        ItemMeta meta = diamond.getItemMeta();
        meta.setDisplayName("negr");
        meta.addEnchant(Enchantment.DURABILITY, 999, true);
        diamond.setItemMeta(meta);

        player.getInventory().addItem(diamond);
    }


}
