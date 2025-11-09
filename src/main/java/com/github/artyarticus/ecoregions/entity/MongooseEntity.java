package com.github.artyarticus.ecoregions.entity;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Tuple;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import org.zawamod.zawa.config.ZawaSpawnCategory;
import org.zawamod.zawa.world.entity.SpeciesVariantsEntity;
import org.zawamod.zawa.world.entity.animal.ZawaLandEntity;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MongooseEntity extends ZawaLandEntity implements SpeciesVariantsEntity {
    public MongooseEntity(EntityType<? extends ZawaLandEntity> type, Level world) {
        super(type, world);
    }

    public static final List<Tuple<String, ZawaSpawnCategory>> VARIANT_SPAWNS;

    public static AttributeSupplier.Builder registerAttributes() {
        return createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.30F).add(Attributes.MAX_HEALTH, 8.0).add(Attributes.ATTACK_DAMAGE, 0.5);
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel world, AgeableMob entity) {
        return EcoRegionsEntities.MONGOOSE.get().create(world);
    }

    @Override
    protected void customServerAiStep() {
        if (getMoveControl().hasWanted()) setSprinting(getMoveControl().getSpeedModifier() >= 1.33D);
        super.customServerAiStep();
    }

    protected float getStandingEyeHeight(Pose pose, EntityDimensions size) {
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

    public int getVariantByBiome(LevelAccessor level) {
        return random.nextInt(getWildVariants());
    }

    static {
        VARIANT_SPAWNS = new ArrayList(Arrays.asList(new Tuple("yellow", ZawaSpawnCategory.WET_SAVANNA), new Tuple("egyptian", ZawaSpawnCategory.WET_SAVANNA), new Tuple("banded", ZawaSpawnCategory.WET_SAVANNA), new Tuple("narrow_striped", ZawaSpawnCategory.DRY_FOREST)));
    }
}




