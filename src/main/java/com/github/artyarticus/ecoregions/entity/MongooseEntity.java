package com.github.artyarticus.ecoregions.entity;

import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.PanicGoal;
import net.minecraft.util.Tuple;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.zawamod.zawa.config.ZawaSpawnCategory;
import org.zawamod.zawa.world.entity.SpeciesVariantsEntity;
import org.zawamod.zawa.world.entity.animal.ZawaLandEntity;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MongooseEntity extends ZawaLandEntity implements SpeciesVariantsEntity {
    public MongooseEntity(EntityType<? extends ZawaLandEntity> type, World world) {
        super(type, world);
    }

    public static final List<Tuple<String, ZawaSpawnCategory>> VARIANT_SPAWNS;

    public static AttributeModifierMap.MutableAttribute registerAttributes() {
        return createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.30F).add(Attributes.MAX_HEALTH, 8.0).add(Attributes.ATTACK_DAMAGE, 0.5);
    }

    @Nullable
    @Override
    public AgeableEntity getBreedOffspring(ServerWorld world, AgeableEntity entity) {
        return EcoRegionsEntities.MONGOOSE.get().create(world);
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
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.33));
    }

    @Override
    public float getMaleRatio() {
        return 0.14F;
    }


    public int getVariantByBiome(IWorld level) {
        String biome = level.getBiome(this.blockPosition()).getRegistryName().toString();
        if (ZawaSpawnCategory.WET_SAVANNA.getBiomes().contains(biome))
            return this.random.nextInt(3);
        if (ZawaSpawnCategory.DRY_FOREST.getBiomes().contains(biome))
            return 3;

        return random.nextInt(this.getWildVariants());
    }

    static {
        VARIANT_SPAWNS = new ArrayList(Arrays.asList(new Tuple("yellow", ZawaSpawnCategory.WET_SAVANNA), new Tuple("egyptian", ZawaSpawnCategory.WET_SAVANNA), new Tuple("banded", ZawaSpawnCategory.WET_SAVANNA), new Tuple("narrow_striped", ZawaSpawnCategory.DRY_FOREST)));
    }
}




