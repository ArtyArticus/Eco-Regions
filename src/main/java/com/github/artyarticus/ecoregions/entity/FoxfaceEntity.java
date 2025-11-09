package com.github.artyarticus.ecoregions.entity;

import com.github.artyarticus.ecoregions.item.EcoRegionsItems;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.zawamod.zawa.world.entity.ambient.ZawaAmbientFishEntity;

import javax.annotation.Nullable;

public class FoxfaceEntity extends ZawaAmbientFishEntity {
    public FoxfaceEntity(EntityType<? extends ZawaAmbientFishEntity> type, Level world) {
        super(type, world);
    }

    public static AttributeSupplier.Builder registerAttributes() {
        return createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.255F).add(Attributes.MAX_HEALTH, 4.0);
    }

    @Override
    public @NotNull ItemStack getBucketItemStack() {
        return new ItemStack(EcoRegionsItems.FOXFACE_BUCKET.get());
    }

    @Override
    protected SoundEvent getFlopSound() {
        return SoundEvents.COD_FLOP;
    }


    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel world, AgeableMob entity) {
        return EcoRegionsEntities.FOXFACE.get().create(world);
    }

    protected float getStandingEyeHeight(Pose pose, EntityDimensions size) {
        return size.height * 0.85F;
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.33));
    }
}

