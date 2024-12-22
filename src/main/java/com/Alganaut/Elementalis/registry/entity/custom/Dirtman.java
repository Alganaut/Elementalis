package com.Alganaut.Elementalis.registry.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.RandomSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.monster.AbstractSkeleton;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.Blocks;

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
        if (abstractarrow instanceof Arrow)
            //This is 30 Seconds of Weakness 1
            ((Arrow)abstractarrow).addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 600));

        return abstractarrow;
    }

    //Example of making it so that it only occasionally shoots Weakness arrows
    //protected AbstractArrow getArrow(ItemStack stack, float velocity, @Nullable ItemStack weapon)
    //{
    //    AbstractArrow abstractArrow = super.getArrow(stack, velocity, weapon);
    //    if (abstractArrow instanceof Arrow arrow && this.random.nextFloat() < 0.25)
    //        //6 Seconds of Weakness 2
    //        arrow.addEffect(new MobEffectInstance(MobEffects.WITHER, 120, 1));
    //    return abstractArrow;
    //}
}

