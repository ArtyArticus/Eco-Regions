package com.github.artyarticus.ecoregions.entity;

import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.PanicGoal;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.zawamod.zawa.world.entity.SpeciesVariantsEntity;
import org.zawamod.zawa.world.entity.ai.goal.ZawaMeleeAttackGoal;
import org.zawamod.zawa.world.entity.animal.ZawaLandEntity;

import javax.annotation.Nullable;

public class LorisEntity extends ZawaLandEntity implements SpeciesVariantsEntity {
    public LorisEntity(EntityType<? extends ZawaLandEntity> type, World world) {
        super(type, world);
    }

    public static AttributeModifierMap.MutableAttribute registerAttributes() {
        return createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.30F).add(Attributes.MAX_HEALTH, 21.0).add(Attributes.ATTACK_DAMAGE, 3.0);
    }

    @Nullable
    @Override
    public AgeableEntity getBreedOffspring(ServerWorld world, AgeableEntity entity) {
        return EcoRegionsEntities.LORIS.get().create(world);
    }

    @Override
    public int getVariantByBiome(IWorld iWorld) {
        return random.nextInt(getWildVariants());
    }

    @Override
    protected void registerGoals() {
        //super.registerGoals();
        //this.goalSelector.addGoal(1, new PanicGoal(this, 1.33D));
    }
    @Override
    public float getMaleRatio() {
        return 0.14F;
    }

    @Override
    public float getScale() {
        if (isBaby()) return 0.6F;
        int variant = getVariant();
        if (variant == 1) return 1.15F;
        if (variant == 2) return 0.95F;
        return 1.0F;
    }
}
