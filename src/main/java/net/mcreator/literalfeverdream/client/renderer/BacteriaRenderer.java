
package net.mcreator.literalfeverdream.client.renderer;

public class BacteriaRenderer extends HumanoidMobRenderer<BacteriaEntity, HumanoidModel<BacteriaEntity>> {

	public BacteriaRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 1f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));

	}

	@Override
	public ResourceLocation getTextureLocation(BacteriaEntity entity) {
		return new ResourceLocation("literal_fever_dream:textures/entities/bacteria.png");
	}

}
