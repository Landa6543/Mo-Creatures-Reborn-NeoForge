package net.mocreatures.procedures;

import java.util.Comparator;
import net.minecraft.world.entity.Entity;

class NameTigerProcedure$1 {
   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
      return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
   }
}
