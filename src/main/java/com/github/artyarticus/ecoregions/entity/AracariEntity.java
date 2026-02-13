package com.github.artyarticus.ecoregions.entity;

import com.github.artyarticus.ecoregions.item.EcoRegionsItems;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.entity.ai.goal.PanicGoal;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.zawamod.zawa.world.entity.OviparousEntity;
import org.zawamod.zawa.world.entity.SpeciesVariantsEntity;
import org.zawamod.zawa.world.entity.animal.ZawaFlyingEntity;

import javax.annotation.Nullable;

public class AracariEntity extends ZawaFlyingEntity implements SpeciesVariantsEntity, OviparousEntity {
    public AracariEntity(EntityType<? extends ZawaFlyingEntity> type, World world) {
        super(type, world);
    }

    public static AttributeModifierMap.MutableAttribute registerAttributes() {
        return createMobAttributes().add(Attributes.FLYING_SPEED, 0.6F).add(Attributes.MOVEMENT_SPEED, 0.225F).add(Attributes.MAX_HEALTH, 6.0).add(Attributes.ATTACK_DAMAGE, 0.5);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.33));
        this.goalSelector.addGoal(4, new AvoidEntityGoal<>(this, PlayerEntity.class, 16.0F, 0.8, 1.33, (entity) -> AVOID_PLAYERS.test(entity) && !this.isTame()));
    }

    @Nullable
    @Override
    public AgeableEntity getBreedOffspring(ServerWorld world, AgeableEntity entity) {
        return EcoRegionsEntities.ARACARI.get().create(world);
    }

    @Override
    public float getMaleRatio() {
        return 0.25F;
    }

    @Override
    public int getVariantByBiome(IWorld iWorld) {
        return random.nextInt(getWildVariants());
    }

    protected float getStandingEyeHeight(Pose pose, EntitySize size) {
        return size.height * 0.85F;
    }

    @Override
    public ItemStack getBreedEggItem() {
        return EcoRegionsItems.ARACARI_EGG.get().getDefaultInstance();
    }
}
