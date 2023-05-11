package greefox.bundle;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class Bundle extends JavaPlugin {

    @Override
    public void onEnable() {
        BundleCrafting.init();
        ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
        console.sendMessage(ChatColor.AQUA + "******************************");
        console.sendMessage(ChatColor.AQUA + "| Bundles have been enabled! |");
        console.sendMessage(ChatColor.AQUA + "******************************");
    }

    @Override
    public void onDisable() {
        ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
        console.sendMessage(ChatColor.DARK_RED + "*******************************");
        console.sendMessage(ChatColor.DARK_RED + "| Bundles have been disabled! |");
        console.sendMessage(ChatColor.DARK_RED + "*******************************");
    }
}
