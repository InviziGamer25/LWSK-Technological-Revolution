// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelLWSK_Fire_Eater<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "lwsk_fire_eater"), "main");
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart leftArm;
	private final ModelPart rightArm;
	private final ModelPart leftLeg;
	private final ModelPart rightLeg;

	public ModelLWSK_Fire_Eater(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.leftArm = root.getChild("leftArm");
		this.rightArm = root.getChild("rightArm");
		this.leftLeg = root.getChild("leftLeg");
		this.rightLeg = root.getChild("rightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(96, 0).mirror()
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 116).addBox(-5.0F, -9.0F, -5.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
						.texOffs(114, 90).addBox(-3.0F, -7.0F, 4.0F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(91, 122).addBox(3.0F, -7.0F, 4.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(91, 122).addBox(-5.0F, -7.0F, 4.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(63, 121).addBox(-5.0F, -7.0F, 2.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(63, 121).addBox(4.0F, -7.0F, 2.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(45, 117).addBox(-5.0F, -7.0F, -5.0F, 1.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
						.texOffs(45, 117).addBox(4.0F, -7.0F, -5.0F, 1.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
						.texOffs(124, 124).addBox(-4.0F, -7.0F, -5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(124, 124).addBox(3.0F, -7.0F, -5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(115, 126).addBox(2.0F, -6.5F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(72, 126).addBox(-3.0F, -7.0F, -5.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(115, 126).addBox(-3.0F, -6.5F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(103, 126).addBox(-1.0F, -6.25F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(0, 0).addBox(-3.0F, -3.0F, -4.5F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(0, 0).addBox(-4.0F, -7.0F, -4.5F, 8.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4363F, -0.4363F, -0.2182F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).mirror()
				.addBox(-4.0F, 0.0F, -1.95F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(16, 16)
				.mirror().addBox(-4.0F, 0.0F, -2.05F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leftArm = partdefinition.addOrReplaceChild("leftArm",
				CubeListBuilder.create().texOffs(63, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 2.0F, 0.0F, -0.9599F, -0.6981F, -0.3927F));

		PartDefinition bone = leftArm.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 69)
						.addBox(-0.5F, 1.0F, -7.0F, 0.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 85)
						.addBox(-0.5F, 17.0F, -7.0F, 0.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 85)
						.addBox(-1.5F, 17.0F, -7.0F, 0.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 69)
						.addBox(-1.5F, 1.0F, -7.0F, 0.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(10, 97)
						.addBox(-1.5F, 14.0F, -2.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(10, 102)
						.addBox(-1.5F, 18.0F, -2.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(33, 82)
						.addBox(-1.5F, 18.0F, -3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(10, 96)
						.addBox(-1.5F, 12.0F, -2.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(11, 100)
						.addBox(-1.5F, 16.0F, -3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(12, 102)
						.addBox(-1.5F, 18.0F, -4.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(12, 99)
						.addBox(-1.5F, 15.0F, -4.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(10, 97)
						.addBox(-1.5F, 16.0F, -2.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(10, 95)
						.addBox(-1.5F, 11.0F, -2.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(12, 94)
						.addBox(-1.5F, 10.0F, -4.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(12, 96)
						.addBox(-1.5F, 12.0F, -4.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(39, 74)
						.addBox(-1.5F, 10.0F, -2.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(10, 88)
						.addBox(-1.5F, 3.0F, -3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(12, 90)
						.addBox(-1.5F, 6.0F, -4.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(12, 91)
						.addBox(-1.5F, 7.0F, -4.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(10, 87)
						.addBox(-1.5F, 4.0F, -4.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(38, 69)
						.addBox(-1.5F, 15.0F, -3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(10, 88)
						.addBox(-1.5F, 3.0F, -3.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 88)
						.addBox(-1.5F, 4.0F, -4.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 102)
						.addBox(-1.5F, 19.0F, -4.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 93)
						.addBox(-1.5F, 11.0F, -2.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 102)
						.addBox(-1.5F, 18.0F, -4.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 99)
						.addBox(-1.5F, 16.0F, -4.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(9, 102)
						.addBox(-1.5F, 19.0F, -3.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 92)
						.addBox(-1.5F, 15.0F, -4.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(43, 82)
						.addBox(-1.5F, 14.0F, -4.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 85)
						.addBox(-1.5F, 17.0F, -3.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 85)
						.addBox(-1.5F, 18.0F, -3.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition rightArm = partdefinition.addOrReplaceChild("rightArm",
				CubeListBuilder.create().texOffs(41, 38).mirror()
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.0F, 2.0F, 0.0F, -0.9599F, 0.4363F, 0.4363F));

		PartDefinition leftLeg = partdefinition.addOrReplaceChild("leftLeg",
				CubeListBuilder.create().texOffs(0, 41)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(74, 43)
						.addBox(-2.0F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition rightLeg = partdefinition.addOrReplaceChild("rightLeg",
				CubeListBuilder.create().texOffs(21, 40).mirror()
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(74, 43).mirror()
						.addBox(-2.0F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.rightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}