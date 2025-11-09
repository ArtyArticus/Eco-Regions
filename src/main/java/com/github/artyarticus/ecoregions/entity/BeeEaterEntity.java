package com.github.artyarticus.ecoregions.entity;

import com.github.artyarticus.ecoregions.item.EcoRegionsItems;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import org.zawamod.zawa.world.entity.OviparousEntity;
import org.zawamod.zawa.world.entity.SpeciesVariantsEntity;
import org.zawamod.zawa.world.entity.animal.ZawaFlyingEntity;

import javax.annotation.Nullable;

public class BeeEaterEntity extends ZawaFlyingEntity implements SpeciesVariantsEntity, OviparousEntity {
    public BeeEaterEntity(EntityType<? extends ZawaFlyingEntity> type, Level world) {
        super(type, world);
    }

    public static AttributeSupplier.Builder registerAttributes() {
        return createMobAttributes().add(Attributes.FLYING_SPEED, 0.6F).add(Attributes.MOVEMENT_SPEED, 1.20F).add(Attributes.MAX_HEALTH, 6.0).add(Attributes.ATTACK_DAMAGE, 0.5);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.33));
        this.goalSelector.addGoal(4, new AvoidEntityGoal<>(this, Player.class, 16.0F, 0.8, 1.33, (entity) -> AVOID_PLAYERS.test(entity) && !this.isTame()));
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel world, AgeableMob entity) {
        return EcoRegionsEntities.BEE_EATER.get().create(world);
    }

    @Override
    public int getVariantByBiome(LevelAccessor iWorld) {
        return random.nextInt(getWildVariants());
    }

    protected float getStandingEyeHeight(Pose pose, EntityDimensions size) {
        return size.height * 0.85F;
    }

    @Override
    public ItemStack getBreedEggItem() {
        return EcoRegionsItems.BEE_EATER_EGG.get().getDefaultInstance();
    }
}
