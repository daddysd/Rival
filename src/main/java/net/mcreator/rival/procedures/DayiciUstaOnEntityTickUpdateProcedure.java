package net.mcreator.rival.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraft.world.level.Level;
// Replacing line 8 with correct imports
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;
import net.mcreator.rival.entity.DayiciUstaEntity;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.HashSet;
import java.util.Set;

@Mod.EventBusSubscriber
public class DayiciUstaOnEntityTickUpdateProcedure {
    // Use a map to track which health thresholds have been triggered for each entity
    private static final Map<UUID, Set<Integer>> triggeredThresholdsMap = new HashMap<>();
    
    // Define all health thresholds where we want the lightning attack to trigger
    private static final int[] HEALTH_THRESHOLDS = {950, 900, 800, 700, 500, 400, 300, 200, 100};
    
    @SubscribeEvent
    public static void onEntityTick(LivingEvent.LivingTickEvent event) {
        execute(event, event.getEntity());
    }

    public static void execute(Entity entity) {
        execute(null, entity);
    }

    private static void execute(@Nullable Event event, Entity entity) {
        if (entity == null)
            return;
        
        if (entity instanceof DayiciUstaEntity && entity instanceof LivingEntity) {
            LivingEntity livingEntity = (LivingEntity) entity;
            DayiciUstaEntity dayiciEntity = (DayiciUstaEntity) entity;
            UUID entityId = entity.getUUID();
            
            float health = livingEntity.getHealth();
            
            // Initialize the set of triggered thresholds for this entity if needed
            if (!triggeredThresholdsMap.containsKey(entityId)) {
                triggeredThresholdsMap.put(entityId, new HashSet<>());
            }
            
            // Get the set of already triggered thresholds for this entity
            Set<Integer> triggeredThresholds = triggeredThresholdsMap.get(entityId);
            
            // Check each threshold
            for (int threshold : HEALTH_THRESHOLDS) {
                // If health is below threshold and we haven't triggered this threshold yet
                if (health < threshold && !triggeredThresholds.contains(threshold)) {
                    // Play attack2 animation
                    dayiciEntity.setAnimation("attack2");
                    
                    // Summon lightning bolts
                    summonLightningPattern(entity);
                    
                    // Mark this threshold as triggered for this entity
                    triggeredThresholds.add(threshold);
                    
                    // We only want to trigger one threshold at a time, so break after finding one
                    break;


                    
                }
                
            }
        }
    }
    
    // Extracted method to handle the lightning summoning pattern
    private static void summonLightningPattern(Entity entity) {
        // Get entity position
        double x = entity.getX();
        double y = entity.getY();
        double z = entity.getZ();
        Level level = entity.level();
        
        // Ensure we're on the server side
        if (level instanceof ServerLevel) {
            ServerLevel serverLevel = (ServerLevel) level;
            
            // First lightning bolt
            LightningBolt bolt1 = EntityType.LIGHTNING_BOLT.create(serverLevel);
            bolt1.moveTo(Vec3.atBottomCenterOf(new BlockPos((int)(x - 1), (int)y, (int)z)));
            serverLevel.addFreshEntity(bolt1);
            
            // Second lightning bolt
            LightningBolt bolt2 = EntityType.LIGHTNING_BOLT.create(serverLevel);
            bolt2.moveTo(Vec3.atBottomCenterOf(new BlockPos((int)(x - 2), (int)y, (int)(z + 1))));
            serverLevel.addFreshEntity(bolt2);
            
            // Third lightning bolt
            LightningBolt bolt3 = EntityType.LIGHTNING_BOLT.create(serverLevel);
            bolt3.moveTo(Vec3.atBottomCenterOf(new BlockPos((int)(x - 2), (int)y, (int)(z - 1))));
            serverLevel.addFreshEntity(bolt3);
            
            // Fourth lightning bolt
            LightningBolt bolt4 = EntityType.LIGHTNING_BOLT.create(serverLevel);
            bolt4.moveTo(Vec3.atBottomCenterOf(new BlockPos((int)(x - 2), (int)y, (int)z)));
            serverLevel.addFreshEntity(bolt4);
            
            // Fifth lightning bolt
            LightningBolt bolt5 = EntityType.LIGHTNING_BOLT.create(serverLevel);
            bolt5.moveTo(Vec3.atBottomCenterOf(new BlockPos((int)(x - 3), (int)y, (int)(z + 2))));
            serverLevel.addFreshEntity(bolt5);
            
            // Sixth lightning bolt
            LightningBolt bolt6 = EntityType.LIGHTNING_BOLT.create(serverLevel);
            bolt6.moveTo(Vec3.atBottomCenterOf(new BlockPos((int)(x - 3), (int)y, (int)(z + 1))));
            serverLevel.addFreshEntity(bolt6);
            
            // Seventh lightning bolt
            LightningBolt bolt7 = EntityType.LIGHTNING_BOLT.create(serverLevel);
            bolt7.moveTo(Vec3.atBottomCenterOf(new BlockPos((int)(x - 3), (int)y, (int)z)));
            serverLevel.addFreshEntity(bolt7);
            
            // Eighth lightning bolt
            LightningBolt bolt8 = EntityType.LIGHTNING_BOLT.create(serverLevel);
            bolt8.moveTo(Vec3.atBottomCenterOf(new BlockPos((int)(x - 3), (int)y, (int)(z - 1))));
            serverLevel.addFreshEntity(bolt8);
            
            // Ninth lightning bolt
            LightningBolt bolt9 = EntityType.LIGHTNING_BOLT.create(serverLevel);
            bolt9.moveTo(Vec3.atBottomCenterOf(new BlockPos((int)(x - 3), (int)y, (int)(z - 2))));
            serverLevel.addFreshEntity(bolt9);

            LightningBolt bolt10 = EntityType.LIGHTNING_BOLT.create(serverLevel);
            bolt10.moveTo(Vec3.atBottomCenterOf(new BlockPos((int)(x - 3), (int)y, (int)(z - 3))));
            serverLevel.addFreshEntity(bolt10);

            LightningBolt bolt11 = EntityType.LIGHTNING_BOLT.create(serverLevel);
            bolt11.moveTo(Vec3.atBottomCenterOf(new BlockPos((int)(x - 3), (int)y, (int)(z - 2))));
            serverLevel.addFreshEntity(bolt11);

            LightningBolt bolt12 = EntityType.LIGHTNING_BOLT.create(serverLevel);
            bolt12.moveTo(Vec3.atBottomCenterOf(new BlockPos((int)(x - 3), (int)y, (int)(z - 1))));
            serverLevel.addFreshEntity(bolt12);

            LightningBolt bolt13 = EntityType.LIGHTNING_BOLT.create(serverLevel);
            bolt13.moveTo(Vec3.atBottomCenterOf(new BlockPos((int)(x - 3), (int)y, (int)(z))));
            serverLevel.addFreshEntity(bolt13);

            LightningBolt bolt14 = EntityType.LIGHTNING_BOLT.create(serverLevel);
            bolt14.moveTo(Vec3.atBottomCenterOf(new BlockPos((int)(x - 3), (int)y, (int)(z + 1))));
            serverLevel.addFreshEntity(bolt14);

            LightningBolt bolt15 = EntityType.LIGHTNING_BOLT.create(serverLevel);
            bolt15.moveTo(Vec3.atBottomCenterOf(new BlockPos((int)(x - 3), (int)y, (int)(z + 2))));
            serverLevel.addFreshEntity(bolt15);
            
            LightningBolt bolt16 = EntityType.LIGHTNING_BOLT.create(serverLevel);
            bolt16.moveTo(Vec3.atBottomCenterOf(new BlockPos((int)(x - 3), (int)y, (int)(z + 3))));
            serverLevel.addFreshEntity(bolt16);
        }
    }
}