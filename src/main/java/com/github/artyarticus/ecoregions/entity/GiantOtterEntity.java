package com.github.artyarticus.ecoregions.entity;

import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.PanicGoal;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.zawamod.zawa.world.entity.OviparousEntity;
import org.zawamod.zawa.world.entity.ai.goal.ZawaMeleeAttackGoal;
import org.zawamod.zawa.world.entity.animal.ZawaLandEntity;
import org.zawamod.zawa.world.entity.animal.ZawaSemiAquaticEntity;

import javax.annotation.Nullable;

public class GiantOtterEntity extends ZawaSemiAquaticEntity{
    public GiantOtterEntity(EntityType<? extends ZawaSemiAquaticEntity> type, World world) {
        super(type, world);
    }

    public static AttributeModifierMap.MutableAttribute registerAttributes() {
        return createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.30F).add(Attributes.MAX_HEALTH, 14.0).add(Attributes.ATTACK_DAMAGE, 2.0);
    }

    @Nullable
    @Override
    public AgeableEntity getBreedOffspring(ServerWorld world, AgeableEntity entity) {
        return EcoRegionsEntities.GIANT_OTTER.get().create(world);
    }
    @Override
    protected void registerGoals() {
        //super.registerGoals();
       // this.goalSelector.addGoal(5, new ZawaMeleeAttackGoal(this, 2.0D, 2.5D, true));
        //this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
    }
    @Override
    public boolean canBabySwim() {
        return false;
    }
    @Override
    public float swimSpeedMultiplier() {
        return 2.0F;
    }
}
