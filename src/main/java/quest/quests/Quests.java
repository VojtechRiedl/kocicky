package quest.quests;

import org.bukkit.plugin.java.JavaPlugin;
import quest.quests.commands.op;
import quest.quests.commands.spawnKocicek;
import quest.quests.listerners.JumpEvent;

public final class Quests extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new JumpEvent(), this);
        getCommand("kocicka").setExecutor(new spawnKocicek());
        getCommand("op").setExecutor(new op());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
