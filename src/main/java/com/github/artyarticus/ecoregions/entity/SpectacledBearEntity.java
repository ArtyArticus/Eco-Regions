package com.github.artyarticus.ecoregions.entity;

import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.zawamod.zawa.world.entity.animal.ZawaBaseEntity;
import org.zawamod.zawa.world.entity.animal.ZawaLandEntity;

import javax.annotation.Nullable;

public class SpectacledBearEntity extends ZawaLandEntity {
    public SpectacledBearEntity(EntityType<? extends ZawaLandEntity> type, World world) {
        super(type, world);
    }

    public static AttributeModifierMap.MutableAttribute registerAttributes() {
        return createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.225F).add(Attributes.MAX_HEALTH, 34.0).add(Attributes.ATTACK_DAMAGE, 4.0);
    }

    @Nullable
    @Override
    public AgeableEntity getBreedOffspring(ServerWorld world, AgeableEntity entity) {
        return EcoEntities.SPECTACLED_BEAR.get().create(world);
    }

    @Override
    protected void registerGoals() {
        //super.registerGoals();
        //this.goalSelector.addGoal(5, new ZawaMeleeAttackGoal(this, 2.0D, 2.5D, true));
        //this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
        //this.targetSelector.addGoal(3, new NonTamedTargetGoal<>(this, PlayerEntity.class, true, (entity) -> this.distanceToSqr(entity) <= 10.0D));
    }
    @Override
    public float getMaleRatio() {
        return 0.33F;
    }
    }
