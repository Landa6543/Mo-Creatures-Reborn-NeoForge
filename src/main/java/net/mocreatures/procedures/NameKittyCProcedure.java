package net.mocreatures.procedures;

import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.HashMap;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.mocreatures.entity.KittyCEntity;
import net.mocreatures.world.inventory.NamingKittyCMenu;

public class NameKittyCProcedure {
   public static void execute(LevelAccessor var0, double var1, double var3, double var5, Entity var7, HashMap var8) {
      if (var7 != null && var8 != null) {
         if (var7 instanceof Player var9 && var9.containerMenu instanceof NamingKittyCMenu && var8.containsKey("text:Name")) {
            Object var10 = var8.get("text:Name");
            String var11 = null;
            if (var10 instanceof String var12) {
               var11 = var12;
            } else if (var10 != null) {
               try {
                  Method var13 = var10.getClass().getMethod("getValue");
                  var11 = (String)var13.invoke(var10);
               } catch (Exception var14) {
               }
            }

            if (var11 != null && !var11.trim().isEmpty()) {
               String var15 = var11.trim();
               Entity var16 = var0.getEntitiesOfClass(KittyCEntity.class, AABB.ofSize(new Vec3(var1, var3, var5), 8.0, 8.0, 8.0), var0x -> true)
                  .stream()
                  .min(Comparator.comparingDouble(var6 -> var6.distanceToSqr(var1, var3, var5)))
                  .orElse(null);
               if (var16 != null) {
                  var16.setCustomName(Component.literal(var15));
                  var16.setCustomNameVisible(true);
               }
            }
         }
      }
   }
}
