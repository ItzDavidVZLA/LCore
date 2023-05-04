package me.david.lcore.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MendingCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String alias, String[] args) {
        Player p = (Player) sender;
        if (p.hasPermission("lcore.mending")){
            if (args.length == 0) {
                p.setHealth(20);
                p.setFoodLevel(20);
                p.sendMessage(ChatColor.translateAlternateColorCodes
                        ('&', "&aEstado de salud regenerado."));
                p.playSound(p.getLocation(), Sound.DRINK, 1, 1);
                return true;
            } else {
                Player target = Bukkit.getPlayerExact(args[0]);
                if (target == null) {
                    p.sendMessage(ChatColor.translateAlternateColorCodes
                            ('&', "&6"+ args[0] +" &ano esta conectado."));
                    p.playSound(p.getLocation(), Sound.NOTE_BASS, 1, 1);
                } else {
                    p.sendMessage(ChatColor.translateAlternateColorCodes
                            ('&', "&aHas regenerado el estado de salud de &6"+ args[0] +"&a."));
                    p.playSound(p.getLocation(), Sound.DRINK, 1, 1);
                    target.setHealth(20);
                    target.setFoodLevel(20);
                }
            }
        }
        return false;
    }
}
