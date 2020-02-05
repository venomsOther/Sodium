package me.jellysquid.mods.sodium.mixin.render.biome_color;

import me.jellysquid.mods.sodium.client.SodiumClientMod;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.world.BlockRenderView;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(BiomeColors.class)
public class MixinBiomeColors {
    @Inject(method = "getWaterColor", at = @At("RETURN"), cancellable = true)
    private static void getWaterColor(BlockRenderView view, BlockPos pos, CallbackInfoReturnable<Integer> cir){
//        SodiumClientMod.logger().info("Water Color: " + cir.getReturnValue() );
        cir.setReturnValue(4159204);
    }

    @Inject(method = "getFoliageColor", at = @At("RETURN"), cancellable = true)
    private static void getFoliageColor(BlockRenderView view, BlockPos pos, CallbackInfoReturnable<Integer> cir){
//        SodiumClientMod.logger().info("FOLIAGE_COLOR: " + cir.getReturnValue() );
        cir.setReturnValue(5877296);
    }

    @Inject(method = "getGrassColor", at = @At("RETURN"), cancellable = true)
    private static void getGrassColor(BlockRenderView view, BlockPos pos, CallbackInfoReturnable<Integer> cir){
//        SodiumClientMod.logger().info("GRASS_COLOR: " + cir.getReturnValue() );
        // !8828803
        cir.setReturnValue(7979098);
    }
}
