package devlaunchers.tamingplus;

import org.bukkit.plugin.java.JavaPlugin;
public final class Tamingplus extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new MyListener(), this);
        System.out.println("running plugin");
        this.getCommand("giveTamingItem").setExecutor(new GiveTamingItemCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}
