package net.farkas.crouch_cushion;

import com.mojang.logging.LogUtils;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(CrouchCushion.MOD_ID)
public class CrouchCushion {
    public static final String MOD_ID = "crouch_cushion";
    public static final Logger LOGGER = LogUtils.getLogger();

    public CrouchCushion(FMLJavaModLoadingContext context) {
        MinecraftForge.EVENT_BUS.register(this);

        context.registerConfig(ModConfig.Type.SERVER, Config.SPEC);
    }
}
