package net.mcreator.rival.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraft.world.level.Level;
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
                    
                    // Summon lightning bolts based on entity's direction
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
        
        // Get the direction the entity is facing
        float yRot = entity.getYRot(); // Yaw angle (horizontal rotation)
        
        // Convert yaw to radians (Minecraft uses degrees)
        double radians = Math.toRadians(yRot);
        
        // Calculate directional vectors
        // In Minecraft, 0 degrees is south, 90 is west, 180 is north, 270 is east
        double dirX = -Math.sin(radians); // X component of direction vector
        double dirZ = Math.cos(radians);  // Z component of direction vector
        
        // Ensure we're on the server side
        if (level instanceof ServerLevel) {
            ServerLevel serverLevel = (ServerLevel) level;
            
            // Pattern layout points transformed according to direction
            // Original design had a pattern going in -X direction, we'll now rotate it
            spawnLightningAt(serverLevel, x + dirX, y, z + dirZ);
            spawnLightningAt(serverLevel, x + dirX * 2, y, z + dirZ * 2 + dirX);  // Added rotation offset
            spawnLightningAt(serverLevel, x + dirX * 2, y, z + dirZ * 2 - dirX);  // Subtracted rotation offset
            spawnLightningAt(serverLevel, x + dirX * 2, y, z + dirZ * 2);
            spawnLightningAt(serverLevel, x + dirX * 3, y, z + dirZ * 3 + dirX * 2);
            spawnLightningAt(serverLevel, x + dirX * 3, y, z + dirZ * 3 + dirX);
            spawnLightningAt(serverLevel, x + dirX * 3, y, z + dirZ * 3);
            spawnLightningAt(serverLevel, x + dirX * 3, y, z + dirZ * 3 - dirX);
            spawnLightningAt(serverLevel, x + dirX * 3, y, z + dirZ * 3 - dirX * 2);
            spawnLightningAt(serverLevel, x + dirX * 3, y, z + dirZ * 3 - dirX * 3);
            spawnLightningAt(serverLevel, x + dirX * 3, y, z + dirZ * 3 - dirX * 2);
            spawnLightningAt(serverLevel, x + dirX * 3, y, z + dirZ * 3 - dirX);
            spawnLightningAt(serverLevel, x + dirX * 3, y, z + dirZ * 3);
            spawnLightningAt(serverLevel, x + dirX * 3, y, z + dirZ * 3 + dirX);
            spawnLightningAt(serverLevel, x + dirX * 3, y, z + dirZ * 3 + dirX * 2);
            spawnLightningAt(serverLevel, x + dirX * 3, y, z + dirZ * 3 + dirX * 3);
            spawnLightningAt(serverLevel, x + dirX * 4, y, z + dirZ * 4 - dirX * 4);
            spawnLightningAt(serverLevel, x + dirX * 4, y, z + dirZ * 4 - dirX * 3);
            spawnLightningAt(serverLevel, x + dirX * 4, y, z + dirZ * 4 - dirX * 2);
            spawnLightningAt(serverLevel, x + dirX * 4, y, z + dirZ * 4 - dirX);
            spawnLightningAt(serverLevel, x + dirX * 4, y, z + dirZ * 4);
            spawnLightningAt(serverLevel, x + dirX * 4, y, z + dirZ * 4 + dirX * 4);
            spawnLightningAt(serverLevel, x + dirX * 4, y, z + dirZ * 4 + dirX * 3);
            spawnLightningAt(serverLevel, x + dirX * 4, y, z + dirZ * 4 + dirX * 2);
            spawnLightningAt(serverLevel, x + dirX * 4, y, z + dirZ * 4 + dirX);
        }
    }
    
    // Helper method to spawn a single lightning bolt
    private static void spawnLightningAt(ServerLevel serverLevel, double x, double y, double z) {
        LightningBolt bolt = EntityType.LIGHTNING_BOLT.create(serverLevel);
        bolt.moveTo(Vec3.atBottomCenterOf(new BlockPos((int)x, (int)y, (int)z)));
        serverLevel.addFreshEntity(bolt);
    }
}