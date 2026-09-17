package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.JellyFishEntity;

public class JellyFishSpawnProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (Math.random() < 0.2) {
            if (entity instanceof JellyFishEntity animatable) {
               animatable.setTexture("jellyfish_blue_dark");
            }
         } else if (Math.random() < 0.3) {
            if (entity instanceof JellyFishEntity animatable) {
               animatable.setTexture("jellyfish_blue_light");
            }
         } else if (Math.random() < 0.4) {
            if (entity instanceof JellyFishEntity animatable) {
               animatable.setTexture("jellyfish_blue_speckled");
            }
         } else if (Math.random() < 0.5) {
            if (entity instanceof JellyFishEntity animatable) {
               animatable.setTexture("jellyfish_green");
            }
         } else if (Math.random() < 0.6) {
            if (entity instanceof JellyFishEntity animatable) {
               animatable.setTexture("jellyfish_orange_dark");
            }
         } else if (Math.random() < 0.7) {
            if (entity instanceof JellyFishEntity animatable) {
               animatable.setTexture("jellyfish_orange_dark");
            }
         } else if (Math.random() < 0.8) {
            if (entity instanceof JellyFishEntity animatable) {
               animatable.setTexture("jellyfish_orange_light");
            }
         } else if (Math.random() < 0.9) {
            if (entity instanceof JellyFishEntity animatable) {
               animatable.setTexture("jellyfish_orange_red");
            }
         } else if (Math.random() < 0.7) {
            if (entity instanceof JellyFishEntity animatable) {
               animatable.setTexture("jellyfish_orange_yellow");
            }
         } else if (Math.random() < 0.7) {
            if (entity instanceof JellyFishEntity animatable) {
               animatable.setTexture("jellyfish_purple_gray");
            }
         } else if (Math.random() < 0.9) {
            if (entity instanceof JellyFishEntity animatable) {
               animatable.setTexture("jellyfish_red");
            }
         } else if (Math.random() < 0.8) {
            if (entity instanceof JellyFishEntity animatable) {
               animatable.setTexture("jellyfish_white");
            }
         } else if (Math.random() < 0.7 && entity instanceof JellyFishEntity animatable) {
            animatable.setTexture("jellyfish_purple");
         }
      }
   }
}
