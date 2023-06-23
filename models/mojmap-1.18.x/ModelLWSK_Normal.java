// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelLWSK_Normal<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "lwsk_normal"), "main");
	private final ModelPart head;
	private final ModelPart rightLeg;
	private final ModelPart leftLeg;
	private final ModelPart rightArm;
	private final ModelPart leftArm;
	private final ModelPart body;

	public ModelLWSK_Normal(ModelPart root) {
		this.head = root.getChild("head");
		this.rightLeg = root.getChild("rightLeg");
		this.leftLeg = root.getChild("leftLeg");
		this.rightArm = root.getChild("rightArm");
		this.leftArm = root.getChild("leftArm");
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(96, 0).mirror()
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 116).addBox(-5.0F, -9.0F, -5.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
						.texOffs(79, 121).addBox(-3.0F, -7.0F, 4.0F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(59, 122).addBox(3.0F, -7.0F, 4.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(59, 122).addBox(-5.0F, -7.0F, 4.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(47, 121).addBox(-5.0F, -7.0F, 2.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(47, 121).addBox(4.0F, -7.0F, 2.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(101, 108).addBox(-5.0F, -7.0F, -5.0F, 1.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
						.texOffs(101, 108).addBox(4.0F, -7.0F, -5.0F, 1.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
						.texOffs(123, 115).addBox(-4.0F, -7.0F, -5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(123, 115).addBox(3.0F, -7.0F, -5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(124, 124).addBox(2.0F, -6.5F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(105, 126).addBox(-3.0F, -7.0F, -5.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(124, 126).addBox(-3.0F, -6.5F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(122, 126).addBox(-1.0F, -6.25F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(0, 0).addBox(-3.0F, -3.0F, -4.5F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(0, 0).addBox(-4.0F, -7.0F, -4.5F, 8.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition rightLeg = partdefinition.addOrReplaceChild("rightLeg",
				CubeListBuilder.create().texOffs(21, 40).mirror()
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(74, 43).mirror()
						.addBox(-2.0F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition leftLeg = partdefinition.addOrReplaceChild("leftLeg",
				CubeListBuilder.create().texOffs(0, 41)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(74, 43)
						.addBox(-2.0F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition rightArm = partdefinition.addOrReplaceChild("rightArm",
				CubeListBuilder.create().texOffs(41, 38).mirror()
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition leftArm = partdefinition.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(63, 16)
				.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).mirror()
				.addBox(-4.0F, 0.0F, -1.95F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(16, 16)
				.mirror().addBox(-4.0F, 0.0F, -2.05F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.rightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.rightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.leftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.leftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}