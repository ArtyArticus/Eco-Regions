package com.github.artyarticus.ecoregions.entity;

import com.github.artyarticus.ecoregions.item.EcoRegionsItems;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.PanicGoal;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.zawamod.zawa.world.entity.SittingEntity;
import org.zawamod.zawa.world.entity.ai.goal.GroupPanicGoal;
import org.zawamod.zawa.world.entity.ambient.ZawaAmbientFishEntity;

import javax.annotation.Nullable;

public class FoxfaceEntity extends ZawaAmbientFishEntity {
    public FoxfaceEntity(EntityType<? extends ZawaAmbientFishEntity> type, World world) {
        super(type, world);
    }

    public static AttributeModifierMap.MutableAttribute registerAttributes() {
        return createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.255F).add(Attributes.MAX_HEALTH, 4.0);
    }

    @Override
    protected ItemStack getBucketItemStack() {
        return new ItemStack(EcoRegionsItems.FOXFACE_BUCKET.get());
    }

    @Override
    protected SoundEvent getFlopSound() {
        return SoundEvents.COD_FLOP;
    }


    @Nullable
    @Override
    public AgeableEntity getBreedOffspring(ServerWorld world, AgeableEntity entity) {
        return EcoRegionsEntities.FOXFACE.get().create(world);
    }

    protected float getStandingEyeHeight(Pose pose, EntitySize size) {
        return size.height * 0.85F;
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.33));
    }
}

