package com.Alganaut.Elementalis.registry.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.RandomSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.monster.AbstractSkeleton;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.Stray;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.event.EventHooks;

import javax.annotation.Nullable;

public class Dirtman extends AbstractSkeleton {
    public Dirtman(EntityType<? extends Dirtman> entityType, Level level) {
        super(entityType, level);
    }

    public static boolean checkStraySpawnRules(EntityType<Dirtman> dirtman, ServerLevelAccessor level, MobSpawnType spawnType, BlockPos pos, RandomSource random) {
        BlockPos blockpos = pos;

        do {
            blockpos = blockpos.above();
        } while(level.getBlockState(blockpos).is(Blocks.POWDER_SNOW));

        return checkMonsterSpawnRules(dirtman, level, spawnType, pos, random) && (MobSpawnType.isSpawner(spawnType) || level.canSeeSky(blockpos.below()));
    }

    protected SoundEvent getAmbientSound() {
        return SoundEvents.STRAY_AMBIENT;
    }

    protected SoundEvent getHurtSound(DamageSource damageSource) {
        return SoundEvents.STRAY_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.STRAY_DEATH;
    }

    protected SoundEvent getStepSound() {
        return SoundEvents.STRAY_STEP;
    }

    protected AbstractArrow getArrow(ItemStack arrow, float velocity, @Nullable ItemStack weapon) {
        AbstractArrow abstractarrow = super.getArrow(arrow, velocity, weapon);
        if (abstractarrow instanceof Arrow) {
            ((Arrow)abstractarrow).addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 600));
        }

        return abstractarrow;
    }
}

