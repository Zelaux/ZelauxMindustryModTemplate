package yourmod;

import arc.*;
import arc.util.*;
import mindustry.ctype.*;
import mindustry.game.EventType.*;
import mindustry.ui.dialogs.*;
import mma.*;
import mma.annotations.*;
import mma.annotations.ModAnnotations.*;
import static yourmod.YourModVars.*;

@MainClass
public class YourMod extends MMAMod {

    public YourMod() {
        super();
        YourModVars.load();
        Log.info("Loaded ExampleJavaMod constructor.");
        // listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            // show dialog upon startup
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("frog");
                dialog.cont.add("behold").row();
                // mod sprites are prefixed with the mod name (you can use ModVars.fullName(NAME) for get name with mod prefix)
                dialog.cont.image(Core.atlas.find(fullName("frog"))).pad(20f).row();
                dialog.cont.button("I see", dialog::hide).size(100f, 50f);
                dialog.show();
            });
        });
    }

    @Override
    protected void modContent(Content content) {
        super.modContent(content);
        /*
        * if you use Load annotation in any class that extends MappableContent,
        * ZelauxModCore will generate YOUR_PREFIXContentRegions class and here you can apply that on instances of those classes
        *
        if(content instanceof MappableContent){
            YOUR_PREFIXContentRegions.loadRegions((MappableContent)content);
        }
        */
    }

    public void init() {
        if (!loaded)
            return;
        super.init();
        // if you do not need ModListener just remove line after this comment
        if (neededInit)
            listener.init();
    }

    /**
     * All content types should be loaded into loadContent from {@link YourModVars}
     * There is you can load extra things like ModMusic or ModSounds etc.
     */
    public void loadContent() {
        super.loadContent();
    }
}
