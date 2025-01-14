package com.github.artyarticus.ecoregions.entity;

import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.NonTamedTargetGoal;
import net.minecraft.entity.ai.goal.PanicGoal;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.ClimberPathNavigator;
import net.minecraft.pathfinding.PathNavigator;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.zawamod.zawa.world.entity.ClimbingEntity;
import org.zawamod.zawa.world.entity.SittingEntity;
import org.zawamod.zawa.world.entity.SpeciesVariantsEntity;
import org.zawamod.zawa.world.entity.ai.goal.ZawaMeleeAttackGoal;
import org.zawamod.zawa.world.entity.animal.ZawaLandEntity;

import javax.annotation.Nullable;

public class BaboonEntity extends ZawaLandEntity implements ClimbingEntity {
    public static final DataParameter<Boolean> CLIMBING;

    public BaboonEntity(EntityType<? extends ZawaLandEntity> type, World world) {
        super(type, world);
    }

    public static AttributeModifierMap.MutableAttribute registerAttributes() {
        return createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.225F).add(Attributes.MAX_HEALTH, 12.0).add(Attributes.ATTACK_DAMAGE, 1.5);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(5, new ZawaMeleeAttackGoal(this, 2.0, 1.33, true));
        this.targetSelector.addGoal(2, new HurtByTargetGoal(this));
        this.targetSelector.addGoal(3, new NonTamedTargetGoal<>(this, PlayerEntity.class, true, (entity) -> this.distanceToSqr(entity) <= 10.0));
    }

    @Override
    protected void customServerAiStep() {
        if (getMoveControl().hasWanted()) setSprinting(getMoveControl().getSpeedModifier() >= 1.33D);
        super.customServerAiStep();
    }

    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(CLIMBING, false);
    }

    protected PathNavigator createNavigation(World world) {
        return new ClimberPathNavigator(this, world);
    }

    public void tick() {
        super.tick();
        if (!this.level.isClientSide && this.horizontalCollision) {
            this.setClimbing(this.isClimbableBlock(this.level, this.blockPosition().relative(this.getDirection())));
        }

    }

    public boolean onClimbable() {
        return this.isClimbing();
    }

    public boolean causeFallDamage(float distance, float damageMultiplier) {
        return false;
    }

    protected float getStandingEyeHeight(Pose pose, EntitySize size) {
        return size.height * 0.85F;
    }

    @Nullable
    @Override
    public AgeableEntity getBreedOffspring(ServerWorld world, AgeableEntity entity) {
        return EcoRegionsEntities.BABOON.get().create(world);
    }
    @Override
    public float getMaleRatio() {
        return 0.20F;
    }

    public boolean isClimbing() {
        return this.entityData.get(CLIMBING);
    }

    public void setClimbing(boolean climbing) {
        this.entityData.set(CLIMBING, climbing);
    }

    static {
        CLIMBING = EntityDataManager.defineId(BaboonEntity.class, DataSerializers.BOOLEAN);
    }
}
