package com.va11halla.casualness_delight.registry;

import com.va11halla.casualness_delight.CasualnessDelightFabric;
import net.fabricmc.fabric.impl.tag.convention.TagRegistration;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class TagsRegistry {
    public static final TagKey<Block> FERMENT_ACTIVATORS;


    private static <E> TagKey<E> create(String pathName, RegistryKey<? extends Registry<E>> registry) {
        return TagKey.of(registry, new Identifier("casualness_delight", pathName));
    }

    private TagsRegistry() throws InstantiationException {
        throw new InstantiationException("Constant class cannot be instantiate");
    }

    static {
        FERMENT_ACTIVATORS = create("ferment_activators", RegistryKeys.BLOCK);
    }
    public static void register(){
        CasualnessDelightFabric.LOGGER.info("Registering Mod Tags for " + CasualnessDelightFabric.MODID);
    }
}

