package heyits.red.Scoreboard.rr.util;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Func {

    public static void msg(Player p, String message)
    {
        p.sendMessage(color("&cScoreboard: &7" + message));
    }

    public static void smsg(Player p, String message)
    {
        p.sendMessage(color("&c[SB] &7" + message));
    }

    public static String color(String s)
    {
        return ChatColor.translateAlternateColorCodes('&', s);
    }

    public static boolean perm(Player p, String perm)
    {
        if(p.hasPermission("scoreboard." + perm))
        {
            return true;
        } else{
            smsg(p, "You lack the permission &cscoreboard." + perm);
            return false;
        }
    }

}
