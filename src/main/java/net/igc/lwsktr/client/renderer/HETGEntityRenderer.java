
package net.igc.lwsktr.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.igc.lwsktr.entity.HETGEntityEntity;
import net.igc.lwsktr.client.model.ModelHE_Tech_Grenade_Entity_Converted;

public class HETGEntityRenderer extends MobRenderer<HETGEntityEntity, ModelHE_Tech_Grenade_Entity_Converted<HETGEntityEntity>> {
	public HETGEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelHE_Tech_Grenade_Entity_Converted(context.bakeLayer(ModelHE_Tech_Grenade_Entity_Converted.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<HETGEntityEntity, ModelHE_Tech_Grenade_Entity_Converted<HETGEntityEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("lwsk_tr:textures/entities/hetg_texture_glow.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(HETGEntityEntity entity) {
		return new ResourceLocation("lwsk_tr:textures/entities/hetg_entity_texture.png");
	}
}
