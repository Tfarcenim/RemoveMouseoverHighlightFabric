package tfar.removemouseoverhighlight.mixin;

import net.minecraft.client.render.GameRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(GameRenderer.class)
public class GameRendererMixin {
	@Inject(at = @At("HEAD"), method = "shouldRenderBlockOutline",cancellable = true)
	private void init(CallbackInfoReturnable<Boolean> cir) {
		cir.setReturnValue(false);
	}
}
