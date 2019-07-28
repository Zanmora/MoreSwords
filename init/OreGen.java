package com.kowloon.moreswords.init;


import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import java.util.Random;

public class OreGen implements IWorldGenerator {

    private final WorldGenMinable genBlackGem;
    private final WorldGenMinable genBlueGem;
    private final WorldGenMinable genBrownGem;
    private final WorldGenMinable genGreenGem;
    private final WorldGenMinable genOrangeGem;
    private final WorldGenMinable genPurpleGem;
    private final WorldGenMinable genRedGem;
    private final WorldGenMinable genYellowGem;
    private final WorldGenMinable genDarkSteel;
    private final WorldGenMinable genRustOre;

    public OreGen(){
        genBlackGem = new WorldGenMinable(BlockInit.blackGemOre.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));
        genBlueGem = new WorldGenMinable(BlockInit.blueGemOre.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));
        genBrownGem = new WorldGenMinable(BlockInit.brownGemOre.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));
        genGreenGem = new WorldGenMinable(BlockInit.greenGemOre.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));
        genOrangeGem = new WorldGenMinable(BlockInit.orangeGemOre.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));
        genPurpleGem = new WorldGenMinable(BlockInit.purpleGemOre.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));
        genRedGem = new WorldGenMinable(BlockInit.redGemOre.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));
        genYellowGem = new WorldGenMinable(BlockInit.yellowGemOre.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));

        genDarkSteel = new WorldGenMinable(BlockInit.darkOre.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.STONE));
        genRustOre = new WorldGenMinable(BlockInit.rustOre.getDefaultState(), 3, BlockMatcher.forBlock(Blocks.STONE));
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider){
        switch (world.provider.getDimensionType()){
            case NETHER:
                break;
            case OVERWORLD:
                runGenerator(genBlackGem, world, random, chunkX, chunkZ, 1, 0, 16);
                runGenerator(genBlueGem, world, random, chunkX, chunkZ, 1, 0, 16);
                runGenerator(genBrownGem, world, random, chunkX, chunkZ, 1, 0, 16);
                runGenerator(genGreenGem, world, random, chunkX, chunkZ, 1, 0, 16);
                runGenerator(genOrangeGem, world, random, chunkX, chunkZ, 1, 0, 16);
                runGenerator(genPurpleGem, world, random, chunkX, chunkZ, 1, 0, 16);
                runGenerator(genRedGem, world, random, chunkX, chunkZ, 1, 0, 16);
                runGenerator(genYellowGem, world, random, chunkX, chunkZ, 1, 0, 16);
                runGenerator(genDarkSteel, world, random, chunkX, chunkZ, 4, 0 , 32);
                runGenerator(genRustOre, world, random, chunkX, chunkZ, 3, 0 , 24);
                break;
            case THE_END:
                break;
        }
    }

    private void runGenerator(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int tries, int minH, int maxH){
        if(minH < 0) minH = 0;
        if(maxH > 255) maxH = 255;
        if(maxH < minH) {
            int i = minH;
            minH = maxH;
            maxH = i;
        } else if(maxH == minH) {
            if(maxH < 255) {
                maxH++;
            } else minH--;
        }

        BlockPos chunkPos = new BlockPos(chunkX * 16, 0, chunkZ * 16);
        int heightDiff = maxH - minH + 1;

        for (int i = 0; i < tries; i++) {
            generator.generate(world, random, chunkPos.add(random.nextInt(16), minH + random.nextInt(heightDiff), random.nextInt(16)));
        }
    }




}
