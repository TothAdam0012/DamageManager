package hu.xm.damagemanager;

import hu.xm.damagemanager.util.ConfigManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        ConfigManager.loadConfig();
        getLogger().log(Level.INFO, "[DamageManager v0.1] elindult!");
    }

    @Override
    public void onDisable() {
        getLogger().log(Level.INFO, "[DamageManager v0.1] leállítva!");
    }
}
