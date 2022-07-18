package lulo.MyEventProcessor;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class MyEventProcessor extends JavaPlugin implements Listener {
    @EventHandler
    public void dontMove(PlayerMoveEvent e) {
        double distance = e.getFrom().distance(e.getTo());
        if (distance != 0) {
            e.setCancelled(true);
        }
    }
    public void onEnable(){
        Bukkit.getPluginManager().registerEvents(new MyEventProcessor(), this);
    }
}
