package lulo.helloworld.Listener;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.ArrayList;
import java.util.List;

public class PlayerChat implements Listener {
    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {
        Player P = e.getPlayer();
        String news = e.getMessage();
        if (news.contains("SB")) {
            e.setCancelled(true);
        }

        List<String> keywords = new ArrayList<>();
        keywords.add("sb");
        keywords.add("nt");
        keywords.add("傻子");
        keywords.add("傻");
        keywords.add("傻逼");

        for (String keyword : keywords) {
            if (news.contains(keyword)) {
                P.sendMessage(ChatColor.RED + "请文明用语！！！");
                e.setCancelled(true);
                return;
            }
        }

        //[世界名]玩家：消息
        e.setFormat(ChatColor.translateAlternateColorCodes('§',
                "§7[§6"+ P.getWorld().getName() +"§7]§a" + P.getName()+"§b：§d"+ e.getMessage()));
    }
}
