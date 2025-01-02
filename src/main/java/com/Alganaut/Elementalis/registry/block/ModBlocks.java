package com.Alganaut.Elementalis.registry.block;

import com.Alganaut.Elementalis.Elementalis;
import com.Alganaut.Elementalis.registry.block.custom.ModFlammableRotatedPillarBlock;
import com.Alganaut.Elementalis.registry.item.ModItems;
import com.Alganaut.Elementalis.registry.worldgen.tree.ModTreeGrowers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Elementalis.MODID);

    public static final DeferredBlock<Block> TOMBSTONE = registerBlock("tombstone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> TOMBSOIL = registerBlock("tombsoil",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DIRT)
                    .strength(0.5f).sound(SoundType.GRAVEL)));

    public static final DeferredBlock<Block> POLISHED_TOMBSTONE = registerBlock("polished_tombstone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5f).requiresCorrectToolForDrops().sound(SoundType.POLISHED_DEEPSLATE)));
    public static final DeferredBlock<Block> TOMBSTONE_BRICKS = registerBlock("tombstone_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS)));
    public static final DeferredBlock<Block> BLOOMING_TOMBSTONE_BRICKS = registerBlock("blooming_tombstone_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS)));
    public static final DeferredBlock<Block> CRACKED_TOMBSTONE_BRICKS = registerBlock("cracked_tombstone_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS)));
    public static final DeferredBlock<Block> CHISELED_TOMBSTONE_BRICKS = registerBlock("chiseled_tombstone_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS)));

    public static final DeferredBlock<StairBlock> TOMBSTONE_STAIRS = registerBlock("tombstone_stairs",
            () -> new StairBlock(ModBlocks.TOMBSTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(1.5f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> POLISHED_TOMBSTONE_STAIRS = registerBlock("polished_tombstone_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_TOMBSTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(1.5f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> TOMBSTONE_BRICK_STAIRS = registerBlock("tombstone_brick_stairs",
            () -> new StairBlock(ModBlocks.TOMBSTONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(1.5f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<SlabBlock> TOMBSTONE_SLAB = registerBlock("tombstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(1.5f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> POLISHED_TOMBSTONE_SLAB = registerBlock("polished_tombstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(1.5f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> TOMBSTONE_BRICK_SLAB = registerBlock("tombstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(1.5f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<WallBlock> TOMBSTONE_WALL = registerBlock("tombstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(1.5f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> POLISHED_TOMBSTONE_WALL = registerBlock("polished_tombstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(1.5f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> TOMBSTONE_BRICK_WALL = registerBlock("tombstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(1.5f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<DoorBlock> BLACK_IRON_DOOR = registerBlock("black_iron_door",
            () -> new DoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(5.0f).requiresCorrectToolForDrops().noOcclusion()));
    public static final DeferredBlock<TrapDoorBlock> BLACK_IRON_TRAPDOOR = registerBlock("black_iron_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(5.0f).requiresCorrectToolForDrops().noOcclusion()));

    public static final DeferredBlock<IronBarsBlock> BLACK_IRON_BARS = registerBlock("black_iron_bars",
            () -> new IronBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));

    public static final DeferredBlock<Block> MOROSE_BRANCH = registerBlock("morose_branch",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> MOROSE_WOOD = registerBlock("morose_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> STRIPPED_MOROSE_BRANCH = registerBlock("stripped_morose_branch",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> STRIPPED_MOROSE_WOOD = registerBlock("stripped_morose_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));

    public static final DeferredBlock<Block> CASKET_LOG = registerBlock("casket_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> CASKET_WOOD = registerBlock("casket_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> STRIPPED_CASKET_LOG = registerBlock("stripped_casket_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> STRIPPED_CASKET_WOOD = registerBlock("stripped_casket_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));

    public static final DeferredBlock<Block> TOMBSTONE_PILLAR = registerBlock("tombstone_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR)));

    public static final DeferredBlock<PressurePlateBlock> MOROSE_PRESSURE_PLATE = registerBlock("morose_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.of().strength(0.5f)));

    public static final DeferredBlock<PressurePlateBlock> CASKET_PRESSURE_PLATE = registerBlock("casket_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.of().strength(0.5f)));

    public static final DeferredBlock<Block> MOROSE_PLANKS = registerBlock("morose_planks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final DeferredBlock<Block> CASKET_PLANKS = registerBlock("casket_planks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final DeferredBlock<Block> MOROSE_LEAVES = registerBlock("morose_leaves",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });

    public static final DeferredBlock<Block> BUDDING_MOROSE_LEAVES = registerBlock("budding_morose_leaves",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });

    public static final DeferredBlock<Block> MOROSE_BUD = registerBlock("morose_bud",
            () -> new SaplingBlock(ModTreeGrowers.MOROSE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));

    public static final DeferredBlock<Block> CASKET_SAPLING = registerBlock("casket_sapling",
            () -> new SaplingBlock(ModTreeGrowers.CASKET, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));

    public static final DeferredBlock<StairBlock> MOROSE_STAIRS = registerBlock("morose_stairs",
            () -> new StairBlock(ModBlocks.MOROSE_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(0.5f)));

    public static final DeferredBlock<StairBlock> CASKET_STAIRS = registerBlock("casket_stairs",
            () -> new StairBlock(ModBlocks.CASKET_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(0.5f)));

    public static final DeferredBlock<SlabBlock> MOROSE_SLAB = registerBlock("morose_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(0.5f)));

    public static final DeferredBlock<SlabBlock> CASKET_SLAB = registerBlock("casket_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(0.5f)));

    public static final DeferredBlock<ButtonBlock> MOROSE_BUTTON = registerBlock("morose_button",
            () -> new ButtonBlock(BlockSetType.OAK, 20, BlockBehaviour.Properties.of().strength(0.5f).noCollission()));

    public static final DeferredBlock<ButtonBlock> CASKET_BUTTON = registerBlock("casket_button",
            () -> new ButtonBlock(BlockSetType.OAK, 20, BlockBehaviour.Properties.of().strength(0.5f).noCollission()));

    public static final DeferredBlock<FenceBlock> MOROSE_FENCE = registerBlock("morose_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(0.5f)));

    public static final DeferredBlock<FenceBlock> CASKET_FENCE = registerBlock("casket_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(0.5f)));

    public static final DeferredBlock<FenceGateBlock> MOROSE_FENCE_GATE = registerBlock("morose_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.of().strength(0.5f)));

    public static final DeferredBlock<FenceGateBlock> CASKET_FENCE_GATE = registerBlock("casket_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.of().strength(0.5f)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static final DeferredBlock<DoorBlock> MOROSE_DOOR = registerBlock("morose_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<TrapDoorBlock> MOROSE_TRAPDOOR = registerBlock("morose_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));

    public static final DeferredBlock<DoorBlock> CASKET_DOOR = registerBlock("casket_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<TrapDoorBlock> CASKET_TRAPDOOR = registerBlock("casket_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));

private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
