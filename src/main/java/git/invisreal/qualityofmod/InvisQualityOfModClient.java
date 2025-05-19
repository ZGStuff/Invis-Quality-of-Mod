package git.invisreal.qualityofmod;

import git.invisreal.qualityofmod.item.ModItems;
import net.fabricmc.api.ClientModInitializer;

public class InvisQualityOfModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModItems.registerModItems();
    }
}
