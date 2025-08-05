package com.msnAntiSwear;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

/**
 * msnAntiSwear - Gelişmiş küfür algılama ve engelleme plugin'i
 * 
 * @author msncakma
 * @version 1.0.0
 */
public class msnAntiSwear extends JavaPlugin {
    
    // Plugin instance (Singleton pattern)
    private static msnAntiSwear instance;
    
    // Logger
    private static final Logger logger = Logger.getLogger("msnAntiSwear");
    
    // Plugin bileşenleri
    // private ConfigManager configManager;
    // private SwearDetector swearDetector;
    // private CommandManager commandManager;
    // private DiscordWebhook discordWebhook;
    // private UpdateChecker updateChecker;
    
    @Override
    public void onEnable() {
        // Plugin instance'ı ayarla
        instance = this;
        
        // Başlangıç mesajı
        logger.info("msnAntiSwear v" + getDescription().getVersion() + " başlatılıyor...");
        
        try {
            // Konfigürasyonları yükle
            loadConfigurations();
            
            // Bileşenleri başlat
            initializeComponents();
            
            // Event listener'ları kaydet
            registerListeners();
            
            // Komutları kaydet
            registerCommands();
            
            // Update checker'ı başlat
            checkForUpdates();
            
            // Başarı mesajı
            logger.info("msnAntiSwear başarıyla yüklendi!");
            
        } catch (Exception e) {
            logger.severe("Plugin başlatılırken hata oluştu: " + e.getMessage());
            e.printStackTrace();
            
            // Plugin'i devre dışı bırak
            Bukkit.getPluginManager().disablePlugin(this);
        }
    }
    
    @Override
    public void onDisable() {
        logger.info("msnAntiSwear kapatılıyor...");
        
        try {
            // Kaynakları temizle
            cleanup();
            
            logger.info("msnAntiSwear başarıyla kapatıldı!");
            
        } catch (Exception e) {
            logger.severe("Plugin kapatılırken hata oluştu: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    /**
     * Konfigürasyon dosyalarını yükler
     */
    private void loadConfigurations() {
        logger.info("Konfigürasyonlar yükleniyor...");
        
        // config.yml dosyasını kaydet (eğer yoksa)
        saveDefaultConfig();
        
        // TODO: ConfigManager'ı başlat
        // configManager = new ConfigManager(this);
        // configManager.loadConfigs();
        
        logger.info("Konfigürasyonlar yüklendi.");
    }
    
    /**
     * Plugin bileşenlerini başlatır
     */
    private void initializeComponents() {
        logger.info("Bileşenler başlatılıyor...");
        
        // TODO: Bileşenleri başlat
        // swearDetector = new SwearDetector(this);
        // commandManager = new CommandManager(this);
        // discordWebhook = new DiscordWebhook(this);
        // updateChecker = new UpdateChecker(this);
        
        logger.info("Bileşenler başlatıldı.");
    }
    
    /**
     * Event listener'ları kaydeder
     */
    private void registerListeners() {
        logger.info("Event listener'lar kaydediliyor...");
        
        // TODO: Listener'ları kaydet
        // getServer().getPluginManager().registerEvents(new ChatListener(this), this);
        // getServer().getPluginManager().registerEvents(new PlayerJoinListener(this), this);
        
        logger.info("Event listener'lar kaydedildi.");
    }
    
    /**
     * Komutları kaydeder
     */
    private void registerCommands() {
        logger.info("Komutlar kaydediliyor...");
        
        // TODO: Command executor'ları kaydet
        // getCommand("msnAntiSwear").setExecutor(commandManager);
        // getCommand("msnAntiSwear").setTabCompleter(commandManager);
        
        logger.info("Komutlar kaydedildi.");
    }
    
    /**
     * Güncelleme kontrolü yapar
     */
    private void checkForUpdates() {
        if (getConfig().getBoolean("update-checker.enabled", true)) {
            logger.info("Güncellemeler kontrol ediliyor...");
            
            // TODO: UpdateChecker'ı çalıştır
            // updateChecker.checkForUpdatesAsync();
        }
    }
    
    /**
     * Plugin kapatılırken kaynakları temizler
     */
    private void cleanup() {
        // TODO: Açık kaynakları kapat
        // Cache'leri temizle
        // Thread'leri sonlandır
    }
    
    /**
     * Plugin instance'ını döndürür (Singleton pattern)
     * 
     * @return msnAntiSwear plugin instance
     */
    public static msnAntiSwear getInstance() {
        return instance;
    }
    
    /**
     * Logger'ı döndürür
     * 
     * @return Plugin logger
     */
    public static Logger getPluginLogger() {
        return logger;
    }
    
    // TODO: Getter metodları
    // public ConfigManager getConfigManager() { return configManager; }
    // public SwearDetector getSwearDetector() { return swearDetector; }
    // public DiscordWebhook getDiscordWebhook() { return discordWebhook; }
    // public UpdateChecker getUpdateChecker() { return updateChecker; }
}