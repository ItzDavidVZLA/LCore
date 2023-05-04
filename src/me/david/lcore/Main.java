package me.david.lcore;

import me.david.lcore.commands.*;
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
        this.getCommand("creative").setExecutor(new CreativeCommand());
        this.getCommand("survival").setExecutor(new SurvivalCommand());
        this.getCommand("spectator").setExecutor(new SpectatorCommand());
        this.getCommand("heal").setExecutor(new HealCommand());
        this.getCommand("feed").setExecutor(new FeedCommand());
        this.getCommand("mending").setExecutor(new MendingCommand());
        this.getCommand("slay").setExecutor(new SlayCommand());



    }
}

