package me.david.lcore.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CreativeCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String alias, String[] args) {
        Player p = (Player) sender;
        if (p.hasPermission("lcore.creative")){
            if (args.length == 0) {
                p.setGameMode(GameMode.CREATIVE);
                p.sendMessage(ChatColor.translateAlternateColorCodes
                        ('&', "&aModo de juego cambiado a &6creativo&a."));
                p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                return true;
            } else {
                Player target = Bukkit.getPlayerExact(args[0]);
                if (target == null) {
                    p.sendMessage(ChatColor.translateAlternateColorCodes
                            ('&', "&6"+ args[0] +" &ano esta conectado."));
                    p.playSound(p.getLocation(), Sound.NOTE_BASS, 1, 1);
                } else {
                    p.sendMessage(ChatColor.translateAlternateColorCodes
                            ('&', "&aEl modo de juego de &6 "+ args[0] +" &afue establecido a &6creativo&a."));
                    p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                    target.setGameMode(GameMode.CREATIVE);
                }
            }
        }
        return false;
    }
}
