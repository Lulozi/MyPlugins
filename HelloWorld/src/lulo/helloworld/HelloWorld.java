package lulo.helloworld;

import lulo.helloworld.Listener.PlayerChat;
import lulo.helloworld.Listener.PlayerJoin;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class HelloWorld extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage("hello world"); //在控制台不显示[HelloWorld]
        String msg = "§bHellWorld";
        getLogger().info(ChatColor.translateAlternateColorCodes('§',msg));
        getLogger().info(ChatColor.GOLD+"Hello,World!");
        getLogger().warning("HELLO(Waring)");
        getLogger().severe("Hi!(error)");

        getServer().getPluginManager().registerEvents(new PlayerJoin(),this); //注册
        getServer().getPluginManager().registerEvents(new PlayerChat(),this);
    }


    @Override
    public void onDisable(){
        getLogger().warning(ChatColor.RED + "插件已卸载!");
    }
}
