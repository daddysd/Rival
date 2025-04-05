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
import net.minecraft.world.entity.projectile.SmallFireball;
import net.minecraft.world.phys.Vec3;
import net.mcreator.rival.entity.DayiciUstaPhase2Entity;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.HashSet;
import java.util.Set;

@Mod.EventBusSubscriber
public class DayiciUstaPhase2OnEntityTickUpdateProcedure {
    // Use a map to track which health thresholds have been triggered for each entity
    private static final Map<UUID, Set<Integer>> triggeredThresholdsMap = new HashMap<>();
    
    // Define all health thresholds where we want the fireball attack to trigger
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
        
        if (entity instanceof DayiciUstaPhase2Entity && entity instanceof LivingEntity) {
            LivingEntity livingEntity = (LivingEntity) entity;
            DayiciUstaPhase2Entity dayiciPhase2Entity = (DayiciUstaPhase2Entity) entity;
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
                    dayiciPhase2Entity.setAnimation("attack2");
                    
                    // Shoot fireballs in facing direction
                    shootFireballsPattern(entity);
                    
                    // Mark this threshold as triggered for this entity
                    triggeredThresholds.add(threshold);
                    
                    // We only want to trigger one threshold at a time, so break after finding one
                    break;
                }
            }
        }
    }
    
    // Method to shoot fireballs in the direction the entity is facing
    private static void shootFireballsPattern(Entity entity) {
        // Get entity position
        double x = entity.getX();
        double y = entity.getY() + 1.5; // Offset to shoot from entity eyes
        double z = entity.getZ();
        Level level = entity.level();
        
        // Ensure we're on the server side
        if (level instanceof ServerLevel && entity instanceof LivingEntity) {
            ServerLevel serverLevel = (ServerLevel) level;
            LivingEntity livingEntity = (LivingEntity) entity;
            
            // Get entity's look direction
            Vec3 lookVec = livingEntity.getLookAngle();
            double fireballSpeed = 0.1; // Base speed of fireballs
            
            // Calculate the main direction vector (normalized and scaled)
            double mainDirX = lookVec.x * fireballSpeed;
            double mainDirY = lookVec.y * fireballSpeed;
            double mainDirZ = lookVec.z * fireballSpeed;
            
            // Calculate perpendicular vector for side directions (cross product with UP vector)
            Vec3 perpVec = lookVec.cross(new Vec3(0, 1, 0)).normalize();
            
            // Fireball straight ahead
            spawnLargeFireball(serverLevel, livingEntity, x, y, z, mainDirX, mainDirY, mainDirZ);
            
            // Fireballs angled to the sides
            // Left side (-1)
            spawnLargeFireball(serverLevel, livingEntity, x, y, z, 
                mainDirX + perpVec.x * -0.25, 
                mainDirY, 
                mainDirZ + perpVec.z * -0.25);
            
            // Right side (+1)
            spawnLargeFireball(serverLevel, livingEntity, x, y, z, 
                mainDirX + perpVec.x * 0.25, 
                mainDirY, 
                mainDirZ + perpVec.z * 0.25);
            
            // Further left (-2)
            spawnLargeFireball(serverLevel, livingEntity, x, y, z, 
                mainDirX + perpVec.x * -0.5, 
                mainDirY, 
                mainDirZ + perpVec.z * -0.5);
            
            // Further right (+2)
            spawnLargeFireball(serverLevel, livingEntity, x, y, z, 
                mainDirX + perpVec.x * 0.5, 
                mainDirY, 
                mainDirZ + perpVec.z * 0.5);
            
            // Furthest left (-3)
            spawnLargeFireball(serverLevel, livingEntity, x, y, z, 
                mainDirX + perpVec.x * -0.75, 
                mainDirY, 
                mainDirZ + perpVec.z * -0.75);
            
            // Furthest right (+3)
            spawnLargeFireball(serverLevel, livingEntity, x, y, z, 
                mainDirX + perpVec.x * 0.75, 
                mainDirY, 
                mainDirZ + perpVec.z * 0.75);
        }
    }
    
    // Helper method to spawn a fireball with specific velocity
    private static void spawnLargeFireball(ServerLevel level, LivingEntity shooter, double x, double y, double z, double xVel, double yVel, double zVel) {
        SmallFireball fireball = EntityType.SMALL_FIREBALL.create(level);
        if (fireball != null) {
            fireball.setPos(x, y, z);
            fireball.setOwner(shooter);
            fireball.xPower = xVel;
            fireball.yPower = yVel;
            fireball.zPower = zVel;
            level.addFreshEntity(fireball);
        }
    }
}