package me.david.lcore.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SlayCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String alias, String[] args) {
        Player p = (Player) sender;
        if (p.hasPermission("lcore.slay")){
            if (args.length == 0) {
                p.setHealth(0);
                return true;
            } else {
                Player target = Bukkit.getPlayerExact(args[0]);
                if (target == null) {
                    p.sendMessage(ChatColor.translateAlternateColorCodes
                            ('&', "&6"+ args[0] +" &ano esta conectado."));
                } else {
                    target.setHealth(0);
                }
            }
        }
        return false;
    }
}
