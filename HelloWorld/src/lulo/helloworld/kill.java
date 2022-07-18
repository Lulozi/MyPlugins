package lulo.helloworld;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import javax.annotation.ParametersAreNonnullByDefault;

public class kill extends JavaPlugin implements CommandExecutor {
    @Override
    @ParametersAreNonnullByDefault
    public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args) {
        if (args.length == 0) {
            // 参数数量太少，拒绝处理
            return false;
        }
        Player player = Bukkit.getPlayer(args[0]);
        // args[0] 是参数的第一项，args[1] 是参数的第二项，以此类推
        if (player == null) {
            // 如果这个玩家不存在，getPlayer 将返回 null，如果调用 null 的方法，将引发 NullPointerException 异常
            return true;
            }
            player.setHealth(0); // setHealth 设置玩家血量，0 为死亡
            return true;
        }
    public void onEnable(){
        if (Bukkit.getPluginCommand("superkill") != null) {
            Bukkit.getPluginCommand("superkill").setExecutor(new kill());
        }
    }
}