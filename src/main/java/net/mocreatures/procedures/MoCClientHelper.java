package net.mocreatures.procedures;

import net.minecraft.client.Minecraft;

public class MoCClientHelper {
   public static boolean isSprintDown() {
      try {
         return Minecraft.getInstance().options.keySprint.isDown();
      } catch (Throwable var1) {
         return false;
      }
   }

   public static boolean isJumpDown() {
      try {
         return Minecraft.getInstance().options.keyJump.isDown();
      } catch (Throwable var1) {
         return false;
      }
   }
}
