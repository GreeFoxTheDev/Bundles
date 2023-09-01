package greefox.bundle;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class BundleCrafting extends JavaPlugin {
    public static void init(){
        createBundle();
    }
    public static ItemStack bundle;

    private static void createBundle(){
        ItemStack item = new ItemStack(Material.BUNDLE, 1);
        bundle = item;
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("greefox_bundle"), item);
        sr.shape("SRS", "R R", "RRR");
        sr.setIngredient('S', Material.STRING);
        sr.setIngredient('R', Material.RABBIT_HIDE);
        Bukkit.getServer().addRecipe(sr);
    }
}
