package quest.quests.commands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.*;
import org.jetbrains.annotations.NotNull;



public class spawnKocicek implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(sender instanceof Player){
            Player player = ((Player) sender);
            if(args.length >= 2){
                Location TargetLocation = player.getLocation();
                World world = player.getWorld();
                if(Integer.parseInt(args[1]) > 0 && Integer.parseInt(args[1]) < 100) {
                    for (int i = 0; i < Integer.parseInt(args[1]); i++) {
                        Cat cat = (Cat) world.spawnEntity(TargetLocation, EntityType.CAT);
                        Cat macicka;
                        cat.setCustomName(ChatColor.DARK_PURPLE + args[0]);
                        if (args.length >= 3) {
                            macicka = (Cat) world.spawnEntity(TargetLocation, EntityType.CAT);
                            macicka.setCustomName(ChatColor.BLUE + args[2]);
                            macicka.setBaby();
                            macicka.setTamed(true);
                            cat.setPassenger(macicka);
                        }
                    }
                    sender.sendMessage(ChatColor.DARK_PURPLE + "Mačeny!!!!!!!!");
                    return true;
                }
                sender.sendMessage("Only 0-99");

                return true;
            }
            else {
                sender.sendMessage("Tento příkaz neexistuje");
            }
            return  false;
        }
        return false;
    }
}
