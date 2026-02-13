package com.github.artyarticus.ecoregions.entity;

import com.github.artyarticus.ecoregions.item.EcoRegionsItems;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.PanicGoal;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.zawamod.zawa.world.entity.OviparousEntity;
import org.zawamod.zawa.world.entity.ai.goal.BreachGoal;
import org.zawamod.zawa.world.entity.ai.goal.ZawaMeleeAttackGoal;
import org.zawamod.zawa.world.entity.animal.ZawaLandEntity;
import org.zawamod.zawa.world.entity.animal.ZawaSemiAquaticEntity;

import javax.annotation.Nullable;

public class MonitorEntity extends ZawaSemiAquaticEntity implements OviparousEntity {
    public MonitorEntity(EntityType<? extends ZawaSemiAquaticEntity> type, World world) {
        super(type, world);
    }

    public static AttributeModifierMap.MutableAttribute registerAttributes() {
        return createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.225F).add(Attributes.MAX_HEALTH, 20.0).add(Attributes.ATTACK_DAMAGE, 2.0);
    }

    @Nullable
    @Override
    public AgeableEntity getBreedOffspring(ServerWorld world, AgeableEntity entity) {
        return EcoRegionsEntities.MONITOR.get().create(world);
    }

    @Override
    protected void customServerAiStep() {
        if (getMoveControl().hasWanted()) setSprinting(getMoveControl().getSpeedModifier() >= 1.33D);
        super.customServerAiStep();
    }

    protected float getStandingEyeHeight(Pose pose, EntitySize size) {
        return size.height * 0.85F;
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(4, new BreachGoal(this, 5));
        this.goalSelector.addGoal(5, new ZawaMeleeAttackGoal(this, 4.0, 1.33, true));
        this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
    }
    @Override
    public ItemStack getBreedEggItem() {
        return EcoRegionsItems.MONITOR_EGG.get().getDefaultInstance();
    }

    @Override
    public boolean canBabySwim() {
        return false;
    }

    @Override
    public float swimSpeedMultiplier() {
        return 0.5F;
    }


}

