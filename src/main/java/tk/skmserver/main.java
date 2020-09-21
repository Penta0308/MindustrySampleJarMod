package tk.skmserver;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import arc.files.Fi;
import arc.struct.Seq;
import arc.util.CommandHandler;
import mindustry.mod.Scripts;

public class main extends mindustry.mod.Plugin {
    public Fi getConfig() {
        return super.getConfig();
    }

    /** Called after all plugins have been created and commands have been registered.*/
    public void init() {
        try {
            Class<?> cScripts = Class.forName("mindustry.mod.Scripts");
            Scripts cScriptsRoot = new Scripts();
            Field fblacklist = cScripts.getDeclaredField("blacklist");
            fblacklist.setAccessible(true);
            ((Seq<String>)fblacklist.get(cScriptsRoot)).clear();
        } catch (ClassNotFoundException | NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /** Called on clientside mods. Load content here. */
    public void loadContent() {

    }

    /** Register any commands to be used on the server side, e.g. from the console. */
    public void registerServerCommands(CommandHandler handler) {

    }

    /** Register any commands to be used on the client side, e.g. sent from an in-game player.. */
    public void registerClientCommands(CommandHandler handler){

    }
}
