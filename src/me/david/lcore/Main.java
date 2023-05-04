package me.david.lcore;

import me.david.lcore.commands.AdventureCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Plugin activado.");
        getLogger().info("Fase: 1.0-DEV");
        registerCommands();
    }

    public void registerCommands(){
        this.getCommand("adventure").setExecutor(new AdventureCommand());
    }
}

