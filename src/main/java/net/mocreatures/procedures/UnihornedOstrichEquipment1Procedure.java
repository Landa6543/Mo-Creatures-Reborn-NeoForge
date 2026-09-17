package net.mocreatures.procedures;

import javax.annotation.Nullable;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent.EntityInteract;

@EventBusSubscriber
public class UnihornedOstrichEquipment1Procedure {
   @SubscribeEvent
   public static void onRightClickEntity(EntityInteract event) {
      if (event.getHand() == event.getEntity().getUsedItemHand()) {
         execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getTarget(), event.getEntity());
      }
   }

   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
      execute(null, world, x, y, z, entity, sourceentity);
   }

   private static void execute(@Nullable Event param0, LevelAccessor param1, double param2, double param4, double param6, Entity param8, Entity param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.OutOfMemoryError: Java heap space
      //   at java.base/java.util.HashMap.resize(HashMap.java:710)
      //   at java.base/java.util.HashMap.putVal(HashMap.java:635)
      //   at java.base/java.util.HashMap.put(HashMap.java:618)
      //   at java.base/java.util.HashSet.add(HashSet.java:229)
      //   at java.base/java.util.AbstractCollection.addAll(AbstractCollection.java:338)
      //   at java.base/java.util.HashSet.<init>(HashSet.java:121)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.Statement.getNeighboursSet(Statement.java:767)
      //   at org.jetbrains.java.decompiler.modules.decompiler.MergeHelper.isDirectPath(MergeHelper.java:299)
      //   at org.jetbrains.java.decompiler.modules.decompiler.MergeHelper.isDirectPath(MergeHelper.java:329)
      //   at org.jetbrains.java.decompiler.modules.decompiler.IfHelper.hasDirectEndEdge(IfHelper.java:792)
      //   at org.jetbrains.java.decompiler.modules.decompiler.IfHelper.reorderIf(IfHelper.java:606)
      //   at org.jetbrains.java.decompiler.modules.decompiler.IfHelper.mergeIfs(IfHelper.java:109)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SimplifyExprentsHelper.simplifyStackVarsStatement(SimplifyExprentsHelper.java:72)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SimplifyExprentsHelper.simplifyStackVarsStatement(SimplifyExprentsHelper.java:70)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SimplifyExprentsHelper.simplifyStackVarsStatement(SimplifyExprentsHelper.java:70)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SimplifyExprentsHelper.simplifyStackVarsStatement(SimplifyExprentsHelper.java:70)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SimplifyExprentsHelper.simplifyStackVarsStatement(SimplifyExprentsHelper.java:70)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SimplifyExprentsHelper.simplifyStackVarsStatement(SimplifyExprentsHelper.java:70)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SimplifyExprentsHelper.simplifyStackVarsStatement(SimplifyExprentsHelper.java:70)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SimplifyExprentsHelper.simplifyStackVarsStatement(SimplifyExprentsHelper.java:70)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SimplifyExprentsHelper.simplifyStackVarsStatement(SimplifyExprentsHelper.java:70)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SimplifyExprentsHelper.simplifyStackVarsStatement(SimplifyExprentsHelper.java:70)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SimplifyExprentsHelper.simplifyStackVarsStatement(SimplifyExprentsHelper.java:70)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SimplifyExprentsHelper.simplifyStackVarsStatement(SimplifyExprentsHelper.java:70)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SimplifyExprentsHelper.simplifyStackVarsStatement(SimplifyExprentsHelper.java:70)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:56)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:43)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:317)
      //
      // Bytecode:
      // 0000: aload 8
      // 0002: ifnull 000a
      // 0005: aload 9
      // 0007: ifnonnull 000b
      // 000a: return
      // 000b: aload 8
      // 000d: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 0010: ifeq 6162
      // 0013: aload 8
      // 0015: instanceof net/minecraft/world/entity/TamableAnimal
      // 0018: ifeq 6162
      // 001b: aload 8
      // 001d: checkcast net/minecraft/world/entity/TamableAnimal
      // 0020: astore 10
      // 0022: aload 10
      // 0024: invokevirtual net/minecraft/world/entity/TamableAnimal.isTame ()Z
      // 0027: ifeq 6162
      // 002a: aload 8
      // 002c: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 002f: ifeq 0051
      // 0032: aload 8
      // 0034: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 0037: astore 11
      // 0039: aload 11
      // 003b: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 003e: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Saddle Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0041: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 0044: checkcast java/lang/Boolean
      // 0047: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 004a: ifeq 0051
      // 004d: bipush 1
      // 004e: goto 0052
      // 0051: bipush 0
      // 0052: ifne 00d3
      // 0055: aload 9
      // 0057: instanceof net/minecraft/world/entity/LivingEntity
      // 005a: ifeq 006c
      // 005d: aload 9
      // 005f: checkcast net/minecraft/world/entity/LivingEntity
      // 0062: astore 12
      // 0064: aload 12
      // 0066: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 0069: goto 006f
      // 006c: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 006f: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 0072: getstatic net/mocreatures/init/MocreaturesModItems.CRAFTED_SADDLE Lnet/neoforged/neoforge/registries/DeferredItem;
      // 0075: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 0078: if_acmpne 00d3
      // 007b: aload 9
      // 007d: instanceof net/minecraft/world/entity/player/Player
      // 0080: ifeq 00b5
      // 0083: aload 9
      // 0085: checkcast net/minecraft/world/entity/player/Player
      // 0088: astore 13
      // 008a: new net/minecraft/world/item/ItemStack
      // 008d: dup
      // 008e: getstatic net/mocreatures/init/MocreaturesModItems.CRAFTED_SADDLE Lnet/neoforged/neoforge/registries/DeferredItem;
      // 0091: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 0094: checkcast net/minecraft/world/level/ItemLike
      // 0097: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 009a: astore 14
      // 009c: aload 13
      // 009e: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 00a1: aload 14
      // 00a3: invokedynamic test (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, net/mocreatures/procedures/UnihornedOstrichEquipment1Procedure.lambda$execute$0 (Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z, (Lnet/minecraft/world/item/ItemStack;)Z ]
      // 00a8: bipush 1
      // 00a9: aload 13
      // 00ab: getfield net/minecraft/world/entity/player/Player.inventoryMenu Lnet/minecraft/world/inventory/InventoryMenu;
      // 00ae: invokevirtual net/minecraft/world/inventory/InventoryMenu.getCraftSlots ()Lnet/minecraft/world/inventory/CraftingContainer;
      // 00b1: invokevirtual net/minecraft/world/entity/player/Inventory.clearOrCountMatchingItems (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
      // 00b4: pop
      // 00b5: aload 8
      // 00b7: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 00ba: ifeq 00d3
      // 00bd: aload 8
      // 00bf: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 00c2: astore 13
      // 00c4: aload 13
      // 00c6: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 00c9: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Saddle Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 00cc: bipush 1
      // 00cd: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 00d0: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 00d3: aload 8
      // 00d5: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 00d8: ifeq 00fa
      // 00db: aload 8
      // 00dd: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 00e0: astore 11
      // 00e2: aload 11
      // 00e4: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 00e7: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Chest Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 00ea: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 00ed: checkcast java/lang/Boolean
      // 00f0: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 00f3: ifeq 00fa
      // 00f6: bipush 1
      // 00f7: goto 00fb
      // 00fa: bipush 0
      // 00fb: ifne 0176
      // 00fe: aload 9
      // 0100: instanceof net/minecraft/world/entity/LivingEntity
      // 0103: ifeq 0115
      // 0106: aload 9
      // 0108: checkcast net/minecraft/world/entity/LivingEntity
      // 010b: astore 12
      // 010d: aload 12
      // 010f: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 0112: goto 0118
      // 0115: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 0118: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 011b: getstatic net/minecraft/world/level/block/Blocks.CHEST Lnet/minecraft/world/level/block/Block;
      // 011e: invokevirtual net/minecraft/world/level/block/Block.asItem ()Lnet/minecraft/world/item/Item;
      // 0121: if_acmpne 0176
      // 0124: aload 9
      // 0126: instanceof net/minecraft/world/entity/player/Player
      // 0129: ifeq 0158
      // 012c: aload 9
      // 012e: checkcast net/minecraft/world/entity/player/Player
      // 0131: astore 13
      // 0133: new net/minecraft/world/item/ItemStack
      // 0136: dup
      // 0137: getstatic net/minecraft/world/level/block/Blocks.CHEST Lnet/minecraft/world/level/block/Block;
      // 013a: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 013d: astore 14
      // 013f: aload 13
      // 0141: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 0144: aload 14
      // 0146: invokedynamic test (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, net/mocreatures/procedures/UnihornedOstrichEquipment1Procedure.lambda$execute$1 (Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z, (Lnet/minecraft/world/item/ItemStack;)Z ]
      // 014b: bipush 1
      // 014c: aload 13
      // 014e: getfield net/minecraft/world/entity/player/Player.inventoryMenu Lnet/minecraft/world/inventory/InventoryMenu;
      // 0151: invokevirtual net/minecraft/world/inventory/InventoryMenu.getCraftSlots ()Lnet/minecraft/world/inventory/CraftingContainer;
      // 0154: invokevirtual net/minecraft/world/entity/player/Inventory.clearOrCountMatchingItems (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
      // 0157: pop
      // 0158: aload 8
      // 015a: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 015d: ifeq 0176
      // 0160: aload 8
      // 0162: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 0165: astore 13
      // 0167: aload 13
      // 0169: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 016c: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Chest Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 016f: bipush 1
      // 0170: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0173: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 0176: aload 8
      // 0178: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 017b: ifeq 019d
      // 017e: aload 8
      // 0180: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 0183: astore 11
      // 0185: aload 11
      // 0187: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 018a: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Saddle Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 018d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 0190: checkcast java/lang/Boolean
      // 0193: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0196: ifeq 019d
      // 0199: bipush 1
      // 019a: goto 019e
      // 019d: bipush 0
      // 019e: bipush 1
      // 019f: if_icmpne 01f6
      // 01a2: aload 9
      // 01a4: instanceof net/minecraft/world/entity/LivingEntity
      // 01a7: ifeq 01b9
      // 01aa: aload 9
      // 01ac: checkcast net/minecraft/world/entity/LivingEntity
      // 01af: astore 12
      // 01b1: aload 12
      // 01b3: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 01b6: goto 01bc
      // 01b9: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 01bc: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 01bf: getstatic net/minecraft/world/level/block/Blocks.AIR Lnet/minecraft/world/level/block/Block;
      // 01c2: invokevirtual net/minecraft/world/level/block/Block.asItem ()Lnet/minecraft/world/item/Item;
      // 01c5: if_acmpne 01f6
      // 01c8: aload 9
      // 01ca: instanceof net/minecraft/world/entity/LivingEntity
      // 01cd: ifeq 01df
      // 01d0: aload 9
      // 01d2: checkcast net/minecraft/world/entity/LivingEntity
      // 01d5: astore 13
      // 01d7: aload 13
      // 01d9: invokevirtual net/minecraft/world/entity/LivingEntity.getOffhandItem ()Lnet/minecraft/world/item/ItemStack;
      // 01dc: goto 01e2
      // 01df: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 01e2: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 01e5: getstatic net/minecraft/world/level/block/Blocks.AIR Lnet/minecraft/world/level/block/Block;
      // 01e8: invokevirtual net/minecraft/world/level/block/Block.asItem ()Lnet/minecraft/world/item/Item;
      // 01eb: if_acmpne 01f6
      // 01ee: aload 9
      // 01f0: aload 8
      // 01f2: invokevirtual net/minecraft/world/entity/Entity.startRiding (Lnet/minecraft/world/entity/Entity;)Z
      // 01f5: pop
      // 01f6: aload 8
      // 01f8: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 01fb: ifeq 021d
      // 01fe: aload 8
      // 0200: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 0203: astore 11
      // 0205: aload 11
      // 0207: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 020a: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Gold_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 020d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 0210: checkcast java/lang/Boolean
      // 0213: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0216: ifeq 021d
      // 0219: bipush 1
      // 021a: goto 021e
      // 021d: bipush 0
      // 021e: ifne 0942
      // 0221: aload 9
      // 0223: instanceof net/minecraft/world/entity/LivingEntity
      // 0226: ifeq 0238
      // 0229: aload 9
      // 022b: checkcast net/minecraft/world/entity/LivingEntity
      // 022e: astore 12
      // 0230: aload 12
      // 0232: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 0235: goto 023b
      // 0238: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 023b: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 023e: getstatic net/minecraft/world/item/Items.GOLDEN_HELMET Lnet/minecraft/world/item/Item;
      // 0241: if_acmpne 0942
      // 0244: aload 9
      // 0246: instanceof net/minecraft/world/entity/player/Player
      // 0249: ifeq 0278
      // 024c: aload 9
      // 024e: checkcast net/minecraft/world/entity/player/Player
      // 0251: astore 13
      // 0253: new net/minecraft/world/item/ItemStack
      // 0256: dup
      // 0257: getstatic net/minecraft/world/item/Items.GOLDEN_HELMET Lnet/minecraft/world/item/Item;
      // 025a: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 025d: astore 14
      // 025f: aload 13
      // 0261: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 0264: aload 14
      // 0266: invokedynamic test (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, net/mocreatures/procedures/UnihornedOstrichEquipment1Procedure.lambda$execute$2 (Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z, (Lnet/minecraft/world/item/ItemStack;)Z ]
      // 026b: bipush 1
      // 026c: aload 13
      // 026e: getfield net/minecraft/world/entity/player/Player.inventoryMenu Lnet/minecraft/world/inventory/InventoryMenu;
      // 0271: invokevirtual net/minecraft/world/inventory/InventoryMenu.getCraftSlots ()Lnet/minecraft/world/inventory/CraftingContainer;
      // 0274: invokevirtual net/minecraft/world/entity/player/Inventory.clearOrCountMatchingItems (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
      // 0277: pop
      // 0278: aload 8
      // 027a: astore 13
      // 027c: aload 13
      // 027e: instanceof net/minecraft/world/entity/player/Player
      // 0281: ifeq 02ad
      // 0284: aload 13
      // 0286: checkcast net/minecraft/world/entity/player/Player
      // 0289: astore 14
      // 028b: aload 14
      // 028d: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 0290: getfield net/minecraft/world/entity/player/Inventory.armor Lnet/minecraft/core/NonNullList;
      // 0293: bipush 0
      // 0294: new net/minecraft/world/item/ItemStack
      // 0297: dup
      // 0298: getstatic net/minecraft/world/item/Items.GOLDEN_HELMET Lnet/minecraft/world/item/Item;
      // 029b: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 029e: invokevirtual net/minecraft/core/NonNullList.set (ILjava/lang/Object;)Ljava/lang/Object;
      // 02a1: pop
      // 02a2: aload 14
      // 02a4: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 02a7: invokevirtual net/minecraft/world/entity/player/Inventory.setChanged ()V
      // 02aa: goto 02ce
      // 02ad: aload 13
      // 02af: instanceof net/minecraft/world/entity/LivingEntity
      // 02b2: ifeq 02ce
      // 02b5: aload 13
      // 02b7: checkcast net/minecraft/world/entity/LivingEntity
      // 02ba: astore 15
      // 02bc: aload 15
      // 02be: getstatic net/minecraft/world/entity/EquipmentSlot.FEET Lnet/minecraft/world/entity/EquipmentSlot;
      // 02c1: new net/minecraft/world/item/ItemStack
      // 02c4: dup
      // 02c5: getstatic net/minecraft/world/item/Items.GOLDEN_HELMET Lnet/minecraft/world/item/Item;
      // 02c8: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 02cb: invokevirtual net/minecraft/world/entity/LivingEntity.setItemSlot (Lnet/minecraft/world/entity/EquipmentSlot;Lnet/minecraft/world/item/ItemStack;)V
      // 02ce: aload 8
      // 02d0: instanceof net/minecraft/world/entity/LivingEntity
      // 02d3: ifeq 02e8
      // 02d6: aload 8
      // 02d8: checkcast net/minecraft/world/entity/LivingEntity
      // 02db: astore 13
      // 02dd: aload 13
      // 02df: getstatic net/minecraft/world/entity/EquipmentSlot.FEET Lnet/minecraft/world/entity/EquipmentSlot;
      // 02e2: invokevirtual net/minecraft/world/entity/LivingEntity.getItemBySlot (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
      // 02e5: goto 02eb
      // 02e8: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 02eb: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 02ee: getstatic net/minecraft/world/item/Items.GOLDEN_HELMET Lnet/minecraft/world/item/Item;
      // 02f1: if_acmpne 0942
      // 02f4: aload 8
      // 02f6: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 02f9: ifeq 0312
      // 02fc: aload 8
      // 02fe: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 0301: astore 14
      // 0303: aload 14
      // 0305: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0308: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Gold_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 030b: bipush 1
      // 030c: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 030f: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 0312: aload 8
      // 0314: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 0317: ifeq 0339
      // 031a: aload 8
      // 031c: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 031f: astore 14
      // 0321: aload 14
      // 0323: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0326: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Diamond_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0329: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 032c: checkcast java/lang/Boolean
      // 032f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0332: ifeq 0339
      // 0335: bipush 1
      // 0336: goto 033a
      // 0339: bipush 0
      // 033a: bipush 1
      // 033b: if_icmpne 0392
      // 033e: aload 1
      // 033f: instanceof net/minecraft/server/level/ServerLevel
      // 0342: ifeq 0374
      // 0345: aload 1
      // 0346: checkcast net/minecraft/server/level/ServerLevel
      // 0349: astore 15
      // 034b: new net/minecraft/world/entity/item/ItemEntity
      // 034e: dup
      // 034f: aload 15
      // 0351: dload 2
      // 0352: dload 4
      // 0354: dload 6
      // 0356: new net/minecraft/world/item/ItemStack
      // 0359: dup
      // 035a: getstatic net/minecraft/world/item/Items.DIAMOND_HELMET Lnet/minecraft/world/item/Item;
      // 035d: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 0360: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 0363: astore 16
      // 0365: aload 16
      // 0367: bipush 10
      // 0369: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 036c: aload 15
      // 036e: aload 16
      // 0370: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 0373: pop
      // 0374: aload 8
      // 0376: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 0379: ifeq 0392
      // 037c: aload 8
      // 037e: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 0381: astore 15
      // 0383: aload 15
      // 0385: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0388: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Diamond_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 038b: bipush 0
      // 038c: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 038f: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 0392: aload 8
      // 0394: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 0397: ifeq 03b9
      // 039a: aload 8
      // 039c: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 039f: astore 14
      // 03a1: aload 14
      // 03a3: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 03a6: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Iron_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 03a9: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 03ac: checkcast java/lang/Boolean
      // 03af: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 03b2: ifeq 03b9
      // 03b5: bipush 1
      // 03b6: goto 03ba
      // 03b9: bipush 0
      // 03ba: bipush 1
      // 03bb: if_icmpne 0412
      // 03be: aload 1
      // 03bf: instanceof net/minecraft/server/level/ServerLevel
      // 03c2: ifeq 03f4
      // 03c5: aload 1
      // 03c6: checkcast net/minecraft/server/level/ServerLevel
      // 03c9: astore 15
      // 03cb: new net/minecraft/world/entity/item/ItemEntity
      // 03ce: dup
      // 03cf: aload 15
      // 03d1: dload 2
      // 03d2: dload 4
      // 03d4: dload 6
      // 03d6: new net/minecraft/world/item/ItemStack
      // 03d9: dup
      // 03da: getstatic net/minecraft/world/item/Items.IRON_HELMET Lnet/minecraft/world/item/Item;
      // 03dd: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 03e0: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 03e3: astore 16
      // 03e5: aload 16
      // 03e7: bipush 10
      // 03e9: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 03ec: aload 15
      // 03ee: aload 16
      // 03f0: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 03f3: pop
      // 03f4: aload 8
      // 03f6: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 03f9: ifeq 0412
      // 03fc: aload 8
      // 03fe: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 0401: astore 15
      // 0403: aload 15
      // 0405: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0408: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Iron_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 040b: bipush 0
      // 040c: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 040f: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 0412: aload 8
      // 0414: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 0417: ifeq 0439
      // 041a: aload 8
      // 041c: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 041f: astore 14
      // 0421: aload 14
      // 0423: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0426: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Fur_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0429: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 042c: checkcast java/lang/Boolean
      // 042f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0432: ifeq 0439
      // 0435: bipush 1
      // 0436: goto 043a
      // 0439: bipush 0
      // 043a: bipush 1
      // 043b: if_icmpne 0498
      // 043e: aload 1
      // 043f: instanceof net/minecraft/server/level/ServerLevel
      // 0442: ifeq 047a
      // 0445: aload 1
      // 0446: checkcast net/minecraft/server/level/ServerLevel
      // 0449: astore 15
      // 044b: new net/minecraft/world/entity/item/ItemEntity
      // 044e: dup
      // 044f: aload 15
      // 0451: dload 2
      // 0452: dload 4
      // 0454: dload 6
      // 0456: new net/minecraft/world/item/ItemStack
      // 0459: dup
      // 045a: getstatic net/mocreatures/init/MocreaturesModItems.FUR_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 045d: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 0460: checkcast net/minecraft/world/level/ItemLike
      // 0463: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 0466: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 0469: astore 16
      // 046b: aload 16
      // 046d: bipush 10
      // 046f: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 0472: aload 15
      // 0474: aload 16
      // 0476: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 0479: pop
      // 047a: aload 8
      // 047c: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 047f: ifeq 0498
      // 0482: aload 8
      // 0484: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 0487: astore 15
      // 0489: aload 15
      // 048b: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 048e: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Fur_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0491: bipush 0
      // 0492: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0495: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 0498: aload 8
      // 049a: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 049d: ifeq 04bf
      // 04a0: aload 8
      // 04a2: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 04a5: astore 14
      // 04a7: aload 14
      // 04a9: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 04ac: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Reptile_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 04af: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 04b2: checkcast java/lang/Boolean
      // 04b5: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 04b8: ifeq 04bf
      // 04bb: bipush 1
      // 04bc: goto 04c0
      // 04bf: bipush 0
      // 04c0: bipush 1
      // 04c1: if_icmpne 051e
      // 04c4: aload 1
      // 04c5: instanceof net/minecraft/server/level/ServerLevel
      // 04c8: ifeq 0500
      // 04cb: aload 1
      // 04cc: checkcast net/minecraft/server/level/ServerLevel
      // 04cf: astore 15
      // 04d1: new net/minecraft/world/entity/item/ItemEntity
      // 04d4: dup
      // 04d5: aload 15
      // 04d7: dload 2
      // 04d8: dload 4
      // 04da: dload 6
      // 04dc: new net/minecraft/world/item/ItemStack
      // 04df: dup
      // 04e0: getstatic net/mocreatures/init/MocreaturesModItems.REPTILE_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 04e3: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 04e6: checkcast net/minecraft/world/level/ItemLike
      // 04e9: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 04ec: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 04ef: astore 16
      // 04f1: aload 16
      // 04f3: bipush 10
      // 04f5: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 04f8: aload 15
      // 04fa: aload 16
      // 04fc: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 04ff: pop
      // 0500: aload 8
      // 0502: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 0505: ifeq 051e
      // 0508: aload 8
      // 050a: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 050d: astore 15
      // 050f: aload 15
      // 0511: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0514: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Reptile_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0517: bipush 0
      // 0518: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 051b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 051e: aload 8
      // 0520: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 0523: ifeq 0545
      // 0526: aload 8
      // 0528: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 052b: astore 14
      // 052d: aload 14
      // 052f: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0532: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Hide_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0535: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 0538: checkcast java/lang/Boolean
      // 053b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 053e: ifeq 0545
      // 0541: bipush 1
      // 0542: goto 0546
      // 0545: bipush 0
      // 0546: bipush 1
      // 0547: if_icmpne 05a4
      // 054a: aload 1
      // 054b: instanceof net/minecraft/server/level/ServerLevel
      // 054e: ifeq 0586
      // 0551: aload 1
      // 0552: checkcast net/minecraft/server/level/ServerLevel
      // 0555: astore 15
      // 0557: new net/minecraft/world/entity/item/ItemEntity
      // 055a: dup
      // 055b: aload 15
      // 055d: dload 2
      // 055e: dload 4
      // 0560: dload 6
      // 0562: new net/minecraft/world/item/ItemStack
      // 0565: dup
      // 0566: getstatic net/mocreatures/init/MocreaturesModItems.HIDE_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 0569: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 056c: checkcast net/minecraft/world/level/ItemLike
      // 056f: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 0572: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 0575: astore 16
      // 0577: aload 16
      // 0579: bipush 10
      // 057b: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 057e: aload 15
      // 0580: aload 16
      // 0582: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 0585: pop
      // 0586: aload 8
      // 0588: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 058b: ifeq 05a4
      // 058e: aload 8
      // 0590: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 0593: astore 15
      // 0595: aload 15
      // 0597: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 059a: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Hide_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 059d: bipush 0
      // 059e: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 05a1: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 05a4: aload 8
      // 05a6: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 05a9: ifeq 05cb
      // 05ac: aload 8
      // 05ae: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 05b1: astore 14
      // 05b3: aload 14
      // 05b5: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 05b8: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Leather_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 05bb: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 05be: checkcast java/lang/Boolean
      // 05c1: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 05c4: ifeq 05cb
      // 05c7: bipush 1
      // 05c8: goto 05cc
      // 05cb: bipush 0
      // 05cc: bipush 1
      // 05cd: if_icmpne 0624
      // 05d0: aload 1
      // 05d1: instanceof net/minecraft/server/level/ServerLevel
      // 05d4: ifeq 0606
      // 05d7: aload 1
      // 05d8: checkcast net/minecraft/server/level/ServerLevel
      // 05db: astore 15
      // 05dd: new net/minecraft/world/entity/item/ItemEntity
      // 05e0: dup
      // 05e1: aload 15
      // 05e3: dload 2
      // 05e4: dload 4
      // 05e6: dload 6
      // 05e8: new net/minecraft/world/item/ItemStack
      // 05eb: dup
      // 05ec: getstatic net/minecraft/world/item/Items.LEATHER_HELMET Lnet/minecraft/world/item/Item;
      // 05ef: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 05f2: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 05f5: astore 16
      // 05f7: aload 16
      // 05f9: bipush 10
      // 05fb: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 05fe: aload 15
      // 0600: aload 16
      // 0602: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 0605: pop
      // 0606: aload 8
      // 0608: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 060b: ifeq 0624
      // 060e: aload 8
      // 0610: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 0613: astore 15
      // 0615: aload 15
      // 0617: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 061a: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Leather_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 061d: bipush 0
      // 061e: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0621: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 0624: aload 8
      // 0626: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 0629: ifeq 064b
      // 062c: aload 8
      // 062e: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 0631: astore 14
      // 0633: aload 14
      // 0635: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0638: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Frost_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 063b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 063e: checkcast java/lang/Boolean
      // 0641: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0644: ifeq 064b
      // 0647: bipush 1
      // 0648: goto 064c
      // 064b: bipush 0
      // 064c: bipush 1
      // 064d: if_icmpne 06aa
      // 0650: aload 1
      // 0651: instanceof net/minecraft/server/level/ServerLevel
      // 0654: ifeq 068c
      // 0657: aload 1
      // 0658: checkcast net/minecraft/server/level/ServerLevel
      // 065b: astore 15
      // 065d: new net/minecraft/world/entity/item/ItemEntity
      // 0660: dup
      // 0661: aload 15
      // 0663: dload 2
      // 0664: dload 4
      // 0666: dload 6
      // 0668: new net/minecraft/world/item/ItemStack
      // 066b: dup
      // 066c: getstatic net/mocreatures/init/MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 066f: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 0672: checkcast net/minecraft/world/level/ItemLike
      // 0675: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 0678: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 067b: astore 16
      // 067d: aload 16
      // 067f: bipush 10
      // 0681: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 0684: aload 15
      // 0686: aload 16
      // 0688: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 068b: pop
      // 068c: aload 8
      // 068e: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 0691: ifeq 06aa
      // 0694: aload 8
      // 0696: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 0699: astore 15
      // 069b: aload 15
      // 069d: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 06a0: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Frost_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 06a3: bipush 0
      // 06a4: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 06a7: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 06aa: aload 8
      // 06ac: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 06af: ifeq 06d1
      // 06b2: aload 8
      // 06b4: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 06b7: astore 14
      // 06b9: aload 14
      // 06bb: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 06be: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Dirt_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 06c1: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 06c4: checkcast java/lang/Boolean
      // 06c7: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 06ca: ifeq 06d1
      // 06cd: bipush 1
      // 06ce: goto 06d2
      // 06d1: bipush 0
      // 06d2: bipush 1
      // 06d3: if_icmpne 0730
      // 06d6: aload 1
      // 06d7: instanceof net/minecraft/server/level/ServerLevel
      // 06da: ifeq 0712
      // 06dd: aload 1
      // 06de: checkcast net/minecraft/server/level/ServerLevel
      // 06e1: astore 15
      // 06e3: new net/minecraft/world/entity/item/ItemEntity
      // 06e6: dup
      // 06e7: aload 15
      // 06e9: dload 2
      // 06ea: dload 4
      // 06ec: dload 6
      // 06ee: new net/minecraft/world/item/ItemStack
      // 06f1: dup
      // 06f2: getstatic net/mocreatures/init/MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 06f5: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 06f8: checkcast net/minecraft/world/level/ItemLike
      // 06fb: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 06fe: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 0701: astore 16
      // 0703: aload 16
      // 0705: bipush 10
      // 0707: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 070a: aload 15
      // 070c: aload 16
      // 070e: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 0711: pop
      // 0712: aload 8
      // 0714: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 0717: ifeq 0730
      // 071a: aload 8
      // 071c: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 071f: astore 15
      // 0721: aload 15
      // 0723: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0726: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Dirt_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0729: bipush 0
      // 072a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 072d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 0730: aload 8
      // 0732: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 0735: ifeq 0757
      // 0738: aload 8
      // 073a: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 073d: astore 14
      // 073f: aload 14
      // 0741: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0744: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Cave_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0747: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 074a: checkcast java/lang/Boolean
      // 074d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0750: ifeq 0757
      // 0753: bipush 1
      // 0754: goto 0758
      // 0757: bipush 0
      // 0758: bipush 1
      // 0759: if_icmpne 07b6
      // 075c: aload 1
      // 075d: instanceof net/minecraft/server/level/ServerLevel
      // 0760: ifeq 0798
      // 0763: aload 1
      // 0764: checkcast net/minecraft/server/level/ServerLevel
      // 0767: astore 15
      // 0769: new net/minecraft/world/entity/item/ItemEntity
      // 076c: dup
      // 076d: aload 15
      // 076f: dload 2
      // 0770: dload 4
      // 0772: dload 6
      // 0774: new net/minecraft/world/item/ItemStack
      // 0777: dup
      // 0778: getstatic net/mocreatures/init/MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 077b: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 077e: checkcast net/minecraft/world/level/ItemLike
      // 0781: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 0784: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 0787: astore 16
      // 0789: aload 16
      // 078b: bipush 10
      // 078d: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 0790: aload 15
      // 0792: aload 16
      // 0794: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 0797: pop
      // 0798: aload 8
      // 079a: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 079d: ifeq 07b6
      // 07a0: aload 8
      // 07a2: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 07a5: astore 15
      // 07a7: aload 15
      // 07a9: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 07ac: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Cave_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 07af: bipush 0
      // 07b0: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 07b3: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 07b6: aload 8
      // 07b8: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 07bb: ifeq 07dd
      // 07be: aload 8
      // 07c0: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 07c3: astore 14
      // 07c5: aload 14
      // 07c7: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 07ca: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Nether_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 07cd: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 07d0: checkcast java/lang/Boolean
      // 07d3: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 07d6: ifeq 07dd
      // 07d9: bipush 1
      // 07da: goto 07de
      // 07dd: bipush 0
      // 07de: bipush 1
      // 07df: if_icmpne 083c
      // 07e2: aload 1
      // 07e3: instanceof net/minecraft/server/level/ServerLevel
      // 07e6: ifeq 081e
      // 07e9: aload 1
      // 07ea: checkcast net/minecraft/server/level/ServerLevel
      // 07ed: astore 15
      // 07ef: new net/minecraft/world/entity/item/ItemEntity
      // 07f2: dup
      // 07f3: aload 15
      // 07f5: dload 2
      // 07f6: dload 4
      // 07f8: dload 6
      // 07fa: new net/minecraft/world/item/ItemStack
      // 07fd: dup
      // 07fe: getstatic net/mocreatures/init/MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 0801: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 0804: checkcast net/minecraft/world/level/ItemLike
      // 0807: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 080a: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 080d: astore 16
      // 080f: aload 16
      // 0811: bipush 10
      // 0813: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 0816: aload 15
      // 0818: aload 16
      // 081a: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 081d: pop
      // 081e: aload 8
      // 0820: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 0823: ifeq 083c
      // 0826: aload 8
      // 0828: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 082b: astore 15
      // 082d: aload 15
      // 082f: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0832: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Nether_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0835: bipush 0
      // 0836: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0839: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 083c: aload 8
      // 083e: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 0841: ifeq 0863
      // 0844: aload 8
      // 0846: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 0849: astore 14
      // 084b: aload 14
      // 084d: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0850: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Undead_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0853: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 0856: checkcast java/lang/Boolean
      // 0859: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 085c: ifeq 0863
      // 085f: bipush 1
      // 0860: goto 0864
      // 0863: bipush 0
      // 0864: bipush 1
      // 0865: if_icmpne 08c2
      // 0868: aload 1
      // 0869: instanceof net/minecraft/server/level/ServerLevel
      // 086c: ifeq 08a4
      // 086f: aload 1
      // 0870: checkcast net/minecraft/server/level/ServerLevel
      // 0873: astore 15
      // 0875: new net/minecraft/world/entity/item/ItemEntity
      // 0878: dup
      // 0879: aload 15
      // 087b: dload 2
      // 087c: dload 4
      // 087e: dload 6
      // 0880: new net/minecraft/world/item/ItemStack
      // 0883: dup
      // 0884: getstatic net/mocreatures/init/MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 0887: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 088a: checkcast net/minecraft/world/level/ItemLike
      // 088d: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 0890: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 0893: astore 16
      // 0895: aload 16
      // 0897: bipush 10
      // 0899: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 089c: aload 15
      // 089e: aload 16
      // 08a0: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 08a3: pop
      // 08a4: aload 8
      // 08a6: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 08a9: ifeq 08c2
      // 08ac: aload 8
      // 08ae: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 08b1: astore 15
      // 08b3: aload 15
      // 08b5: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 08b8: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Undead_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 08bb: bipush 0
      // 08bc: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 08bf: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 08c2: aload 8
      // 08c4: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 08c7: ifeq 08e9
      // 08ca: aload 8
      // 08cc: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 08cf: astore 14
      // 08d1: aload 14
      // 08d3: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 08d6: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Netherite_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 08d9: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 08dc: checkcast java/lang/Boolean
      // 08df: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 08e2: ifeq 08e9
      // 08e5: bipush 1
      // 08e6: goto 08ea
      // 08e9: bipush 0
      // 08ea: bipush 1
      // 08eb: if_icmpne 0942
      // 08ee: aload 1
      // 08ef: instanceof net/minecraft/server/level/ServerLevel
      // 08f2: ifeq 0924
      // 08f5: aload 1
      // 08f6: checkcast net/minecraft/server/level/ServerLevel
      // 08f9: astore 15
      // 08fb: new net/minecraft/world/entity/item/ItemEntity
      // 08fe: dup
      // 08ff: aload 15
      // 0901: dload 2
      // 0902: dload 4
      // 0904: dload 6
      // 0906: new net/minecraft/world/item/ItemStack
      // 0909: dup
      // 090a: getstatic net/minecraft/world/item/Items.NETHERITE_HELMET Lnet/minecraft/world/item/Item;
      // 090d: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 0910: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 0913: astore 16
      // 0915: aload 16
      // 0917: bipush 10
      // 0919: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 091c: aload 15
      // 091e: aload 16
      // 0920: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 0923: pop
      // 0924: aload 8
      // 0926: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 0929: ifeq 0942
      // 092c: aload 8
      // 092e: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 0931: astore 15
      // 0933: aload 15
      // 0935: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0938: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Netherite_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 093b: bipush 0
      // 093c: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 093f: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 0942: aload 8
      // 0944: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 0947: ifeq 0969
      // 094a: aload 8
      // 094c: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 094f: astore 11
      // 0951: aload 11
      // 0953: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0956: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Diamond_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0959: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 095c: checkcast java/lang/Boolean
      // 095f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0962: ifeq 0969
      // 0965: bipush 1
      // 0966: goto 096a
      // 0969: bipush 0
      // 096a: ifne 108e
      // 096d: aload 9
      // 096f: instanceof net/minecraft/world/entity/LivingEntity
      // 0972: ifeq 0984
      // 0975: aload 9
      // 0977: checkcast net/minecraft/world/entity/LivingEntity
      // 097a: astore 12
      // 097c: aload 12
      // 097e: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 0981: goto 0987
      // 0984: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 0987: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 098a: getstatic net/minecraft/world/item/Items.DIAMOND_HELMET Lnet/minecraft/world/item/Item;
      // 098d: if_acmpne 108e
      // 0990: aload 9
      // 0992: instanceof net/minecraft/world/entity/player/Player
      // 0995: ifeq 09c4
      // 0998: aload 9
      // 099a: checkcast net/minecraft/world/entity/player/Player
      // 099d: astore 13
      // 099f: new net/minecraft/world/item/ItemStack
      // 09a2: dup
      // 09a3: getstatic net/minecraft/world/item/Items.DIAMOND_HELMET Lnet/minecraft/world/item/Item;
      // 09a6: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 09a9: astore 14
      // 09ab: aload 13
      // 09ad: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 09b0: aload 14
      // 09b2: invokedynamic test (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, net/mocreatures/procedures/UnihornedOstrichEquipment1Procedure.lambda$execute$3 (Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z, (Lnet/minecraft/world/item/ItemStack;)Z ]
      // 09b7: bipush 1
      // 09b8: aload 13
      // 09ba: getfield net/minecraft/world/entity/player/Player.inventoryMenu Lnet/minecraft/world/inventory/InventoryMenu;
      // 09bd: invokevirtual net/minecraft/world/inventory/InventoryMenu.getCraftSlots ()Lnet/minecraft/world/inventory/CraftingContainer;
      // 09c0: invokevirtual net/minecraft/world/entity/player/Inventory.clearOrCountMatchingItems (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
      // 09c3: pop
      // 09c4: aload 8
      // 09c6: astore 13
      // 09c8: aload 13
      // 09ca: instanceof net/minecraft/world/entity/player/Player
      // 09cd: ifeq 09f9
      // 09d0: aload 13
      // 09d2: checkcast net/minecraft/world/entity/player/Player
      // 09d5: astore 14
      // 09d7: aload 14
      // 09d9: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 09dc: getfield net/minecraft/world/entity/player/Inventory.armor Lnet/minecraft/core/NonNullList;
      // 09df: bipush 0
      // 09e0: new net/minecraft/world/item/ItemStack
      // 09e3: dup
      // 09e4: getstatic net/minecraft/world/item/Items.DIAMOND_HELMET Lnet/minecraft/world/item/Item;
      // 09e7: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 09ea: invokevirtual net/minecraft/core/NonNullList.set (ILjava/lang/Object;)Ljava/lang/Object;
      // 09ed: pop
      // 09ee: aload 14
      // 09f0: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 09f3: invokevirtual net/minecraft/world/entity/player/Inventory.setChanged ()V
      // 09f6: goto 0a1a
      // 09f9: aload 13
      // 09fb: instanceof net/minecraft/world/entity/LivingEntity
      // 09fe: ifeq 0a1a
      // 0a01: aload 13
      // 0a03: checkcast net/minecraft/world/entity/LivingEntity
      // 0a06: astore 15
      // 0a08: aload 15
      // 0a0a: getstatic net/minecraft/world/entity/EquipmentSlot.FEET Lnet/minecraft/world/entity/EquipmentSlot;
      // 0a0d: new net/minecraft/world/item/ItemStack
      // 0a10: dup
      // 0a11: getstatic net/minecraft/world/item/Items.DIAMOND_HELMET Lnet/minecraft/world/item/Item;
      // 0a14: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 0a17: invokevirtual net/minecraft/world/entity/LivingEntity.setItemSlot (Lnet/minecraft/world/entity/EquipmentSlot;Lnet/minecraft/world/item/ItemStack;)V
      // 0a1a: aload 8
      // 0a1c: instanceof net/minecraft/world/entity/LivingEntity
      // 0a1f: ifeq 0a34
      // 0a22: aload 8
      // 0a24: checkcast net/minecraft/world/entity/LivingEntity
      // 0a27: astore 13
      // 0a29: aload 13
      // 0a2b: getstatic net/minecraft/world/entity/EquipmentSlot.FEET Lnet/minecraft/world/entity/EquipmentSlot;
      // 0a2e: invokevirtual net/minecraft/world/entity/LivingEntity.getItemBySlot (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
      // 0a31: goto 0a37
      // 0a34: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 0a37: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 0a3a: getstatic net/minecraft/world/item/Items.DIAMOND_HELMET Lnet/minecraft/world/item/Item;
      // 0a3d: if_acmpne 108e
      // 0a40: aload 8
      // 0a42: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 0a45: ifeq 0a5e
      // 0a48: aload 8
      // 0a4a: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 0a4d: astore 14
      // 0a4f: aload 14
      // 0a51: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0a54: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Diamond_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0a57: bipush 1
      // 0a58: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0a5b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 0a5e: aload 8
      // 0a60: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 0a63: ifeq 0a85
      // 0a66: aload 8
      // 0a68: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 0a6b: astore 14
      // 0a6d: aload 14
      // 0a6f: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0a72: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Gold_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0a75: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 0a78: checkcast java/lang/Boolean
      // 0a7b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0a7e: ifeq 0a85
      // 0a81: bipush 1
      // 0a82: goto 0a86
      // 0a85: bipush 0
      // 0a86: bipush 1
      // 0a87: if_icmpne 0ade
      // 0a8a: aload 1
      // 0a8b: instanceof net/minecraft/server/level/ServerLevel
      // 0a8e: ifeq 0ac0
      // 0a91: aload 1
      // 0a92: checkcast net/minecraft/server/level/ServerLevel
      // 0a95: astore 15
      // 0a97: new net/minecraft/world/entity/item/ItemEntity
      // 0a9a: dup
      // 0a9b: aload 15
      // 0a9d: dload 2
      // 0a9e: dload 4
      // 0aa0: dload 6
      // 0aa2: new net/minecraft/world/item/ItemStack
      // 0aa5: dup
      // 0aa6: getstatic net/minecraft/world/item/Items.GOLDEN_HELMET Lnet/minecraft/world/item/Item;
      // 0aa9: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 0aac: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 0aaf: astore 16
      // 0ab1: aload 16
      // 0ab3: bipush 10
      // 0ab5: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 0ab8: aload 15
      // 0aba: aload 16
      // 0abc: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 0abf: pop
      // 0ac0: aload 8
      // 0ac2: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 0ac5: ifeq 0ade
      // 0ac8: aload 8
      // 0aca: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 0acd: astore 15
      // 0acf: aload 15
      // 0ad1: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0ad4: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Gold_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0ad7: bipush 0
      // 0ad8: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0adb: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 0ade: aload 8
      // 0ae0: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 0ae3: ifeq 0b05
      // 0ae6: aload 8
      // 0ae8: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 0aeb: astore 14
      // 0aed: aload 14
      // 0aef: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0af2: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Iron_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0af5: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 0af8: checkcast java/lang/Boolean
      // 0afb: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0afe: ifeq 0b05
      // 0b01: bipush 1
      // 0b02: goto 0b06
      // 0b05: bipush 0
      // 0b06: bipush 1
      // 0b07: if_icmpne 0b5e
      // 0b0a: aload 1
      // 0b0b: instanceof net/minecraft/server/level/ServerLevel
      // 0b0e: ifeq 0b40
      // 0b11: aload 1
      // 0b12: checkcast net/minecraft/server/level/ServerLevel
      // 0b15: astore 15
      // 0b17: new net/minecraft/world/entity/item/ItemEntity
      // 0b1a: dup
      // 0b1b: aload 15
      // 0b1d: dload 2
      // 0b1e: dload 4
      // 0b20: dload 6
      // 0b22: new net/minecraft/world/item/ItemStack
      // 0b25: dup
      // 0b26: getstatic net/minecraft/world/item/Items.IRON_HELMET Lnet/minecraft/world/item/Item;
      // 0b29: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 0b2c: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 0b2f: astore 16
      // 0b31: aload 16
      // 0b33: bipush 10
      // 0b35: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 0b38: aload 15
      // 0b3a: aload 16
      // 0b3c: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 0b3f: pop
      // 0b40: aload 8
      // 0b42: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 0b45: ifeq 0b5e
      // 0b48: aload 8
      // 0b4a: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 0b4d: astore 15
      // 0b4f: aload 15
      // 0b51: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0b54: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Iron_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0b57: bipush 0
      // 0b58: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0b5b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 0b5e: aload 8
      // 0b60: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 0b63: ifeq 0b85
      // 0b66: aload 8
      // 0b68: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 0b6b: astore 14
      // 0b6d: aload 14
      // 0b6f: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0b72: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Fur_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0b75: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 0b78: checkcast java/lang/Boolean
      // 0b7b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0b7e: ifeq 0b85
      // 0b81: bipush 1
      // 0b82: goto 0b86
      // 0b85: bipush 0
      // 0b86: bipush 1
      // 0b87: if_icmpne 0be4
      // 0b8a: aload 1
      // 0b8b: instanceof net/minecraft/server/level/ServerLevel
      // 0b8e: ifeq 0bc6
      // 0b91: aload 1
      // 0b92: checkcast net/minecraft/server/level/ServerLevel
      // 0b95: astore 15
      // 0b97: new net/minecraft/world/entity/item/ItemEntity
      // 0b9a: dup
      // 0b9b: aload 15
      // 0b9d: dload 2
      // 0b9e: dload 4
      // 0ba0: dload 6
      // 0ba2: new net/minecraft/world/item/ItemStack
      // 0ba5: dup
      // 0ba6: getstatic net/mocreatures/init/MocreaturesModItems.FUR_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 0ba9: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 0bac: checkcast net/minecraft/world/level/ItemLike
      // 0baf: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 0bb2: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 0bb5: astore 16
      // 0bb7: aload 16
      // 0bb9: bipush 10
      // 0bbb: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 0bbe: aload 15
      // 0bc0: aload 16
      // 0bc2: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 0bc5: pop
      // 0bc6: aload 8
      // 0bc8: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 0bcb: ifeq 0be4
      // 0bce: aload 8
      // 0bd0: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 0bd3: astore 15
      // 0bd5: aload 15
      // 0bd7: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0bda: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Fur_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0bdd: bipush 0
      // 0bde: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0be1: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 0be4: aload 8
      // 0be6: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 0be9: ifeq 0c0b
      // 0bec: aload 8
      // 0bee: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 0bf1: astore 14
      // 0bf3: aload 14
      // 0bf5: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0bf8: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Reptile_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0bfb: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 0bfe: checkcast java/lang/Boolean
      // 0c01: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0c04: ifeq 0c0b
      // 0c07: bipush 1
      // 0c08: goto 0c0c
      // 0c0b: bipush 0
      // 0c0c: bipush 1
      // 0c0d: if_icmpne 0c6a
      // 0c10: aload 1
      // 0c11: instanceof net/minecraft/server/level/ServerLevel
      // 0c14: ifeq 0c4c
      // 0c17: aload 1
      // 0c18: checkcast net/minecraft/server/level/ServerLevel
      // 0c1b: astore 15
      // 0c1d: new net/minecraft/world/entity/item/ItemEntity
      // 0c20: dup
      // 0c21: aload 15
      // 0c23: dload 2
      // 0c24: dload 4
      // 0c26: dload 6
      // 0c28: new net/minecraft/world/item/ItemStack
      // 0c2b: dup
      // 0c2c: getstatic net/mocreatures/init/MocreaturesModItems.REPTILE_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 0c2f: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 0c32: checkcast net/minecraft/world/level/ItemLike
      // 0c35: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 0c38: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 0c3b: astore 16
      // 0c3d: aload 16
      // 0c3f: bipush 10
      // 0c41: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 0c44: aload 15
      // 0c46: aload 16
      // 0c48: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 0c4b: pop
      // 0c4c: aload 8
      // 0c4e: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 0c51: ifeq 0c6a
      // 0c54: aload 8
      // 0c56: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 0c59: astore 15
      // 0c5b: aload 15
      // 0c5d: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0c60: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Reptile_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0c63: bipush 0
      // 0c64: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0c67: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 0c6a: aload 8
      // 0c6c: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 0c6f: ifeq 0c91
      // 0c72: aload 8
      // 0c74: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 0c77: astore 14
      // 0c79: aload 14
      // 0c7b: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0c7e: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Hide_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0c81: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 0c84: checkcast java/lang/Boolean
      // 0c87: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0c8a: ifeq 0c91
      // 0c8d: bipush 1
      // 0c8e: goto 0c92
      // 0c91: bipush 0
      // 0c92: bipush 1
      // 0c93: if_icmpne 0cf0
      // 0c96: aload 1
      // 0c97: instanceof net/minecraft/server/level/ServerLevel
      // 0c9a: ifeq 0cd2
      // 0c9d: aload 1
      // 0c9e: checkcast net/minecraft/server/level/ServerLevel
      // 0ca1: astore 15
      // 0ca3: new net/minecraft/world/entity/item/ItemEntity
      // 0ca6: dup
      // 0ca7: aload 15
      // 0ca9: dload 2
      // 0caa: dload 4
      // 0cac: dload 6
      // 0cae: new net/minecraft/world/item/ItemStack
      // 0cb1: dup
      // 0cb2: getstatic net/mocreatures/init/MocreaturesModItems.HIDE_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 0cb5: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 0cb8: checkcast net/minecraft/world/level/ItemLike
      // 0cbb: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 0cbe: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 0cc1: astore 16
      // 0cc3: aload 16
      // 0cc5: bipush 10
      // 0cc7: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 0cca: aload 15
      // 0ccc: aload 16
      // 0cce: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 0cd1: pop
      // 0cd2: aload 8
      // 0cd4: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 0cd7: ifeq 0cf0
      // 0cda: aload 8
      // 0cdc: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 0cdf: astore 15
      // 0ce1: aload 15
      // 0ce3: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0ce6: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Hide_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0ce9: bipush 0
      // 0cea: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0ced: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 0cf0: aload 8
      // 0cf2: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 0cf5: ifeq 0d17
      // 0cf8: aload 8
      // 0cfa: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 0cfd: astore 14
      // 0cff: aload 14
      // 0d01: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0d04: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Leather_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0d07: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 0d0a: checkcast java/lang/Boolean
      // 0d0d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0d10: ifeq 0d17
      // 0d13: bipush 1
      // 0d14: goto 0d18
      // 0d17: bipush 0
      // 0d18: bipush 1
      // 0d19: if_icmpne 0d70
      // 0d1c: aload 1
      // 0d1d: instanceof net/minecraft/server/level/ServerLevel
      // 0d20: ifeq 0d52
      // 0d23: aload 1
      // 0d24: checkcast net/minecraft/server/level/ServerLevel
      // 0d27: astore 15
      // 0d29: new net/minecraft/world/entity/item/ItemEntity
      // 0d2c: dup
      // 0d2d: aload 15
      // 0d2f: dload 2
      // 0d30: dload 4
      // 0d32: dload 6
      // 0d34: new net/minecraft/world/item/ItemStack
      // 0d37: dup
      // 0d38: getstatic net/minecraft/world/item/Items.LEATHER_HELMET Lnet/minecraft/world/item/Item;
      // 0d3b: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 0d3e: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 0d41: astore 16
      // 0d43: aload 16
      // 0d45: bipush 10
      // 0d47: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 0d4a: aload 15
      // 0d4c: aload 16
      // 0d4e: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 0d51: pop
      // 0d52: aload 8
      // 0d54: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 0d57: ifeq 0d70
      // 0d5a: aload 8
      // 0d5c: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 0d5f: astore 15
      // 0d61: aload 15
      // 0d63: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0d66: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Leather_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0d69: bipush 0
      // 0d6a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0d6d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 0d70: aload 8
      // 0d72: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 0d75: ifeq 0d97
      // 0d78: aload 8
      // 0d7a: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 0d7d: astore 14
      // 0d7f: aload 14
      // 0d81: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0d84: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Frost_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0d87: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 0d8a: checkcast java/lang/Boolean
      // 0d8d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0d90: ifeq 0d97
      // 0d93: bipush 1
      // 0d94: goto 0d98
      // 0d97: bipush 0
      // 0d98: bipush 1
      // 0d99: if_icmpne 0df6
      // 0d9c: aload 1
      // 0d9d: instanceof net/minecraft/server/level/ServerLevel
      // 0da0: ifeq 0dd8
      // 0da3: aload 1
      // 0da4: checkcast net/minecraft/server/level/ServerLevel
      // 0da7: astore 15
      // 0da9: new net/minecraft/world/entity/item/ItemEntity
      // 0dac: dup
      // 0dad: aload 15
      // 0daf: dload 2
      // 0db0: dload 4
      // 0db2: dload 6
      // 0db4: new net/minecraft/world/item/ItemStack
      // 0db7: dup
      // 0db8: getstatic net/mocreatures/init/MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 0dbb: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 0dbe: checkcast net/minecraft/world/level/ItemLike
      // 0dc1: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 0dc4: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 0dc7: astore 16
      // 0dc9: aload 16
      // 0dcb: bipush 10
      // 0dcd: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 0dd0: aload 15
      // 0dd2: aload 16
      // 0dd4: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 0dd7: pop
      // 0dd8: aload 8
      // 0dda: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 0ddd: ifeq 0df6
      // 0de0: aload 8
      // 0de2: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 0de5: astore 15
      // 0de7: aload 15
      // 0de9: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0dec: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Frost_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0def: bipush 0
      // 0df0: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0df3: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 0df6: aload 8
      // 0df8: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 0dfb: ifeq 0e1d
      // 0dfe: aload 8
      // 0e00: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 0e03: astore 14
      // 0e05: aload 14
      // 0e07: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0e0a: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Dirt_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0e0d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 0e10: checkcast java/lang/Boolean
      // 0e13: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0e16: ifeq 0e1d
      // 0e19: bipush 1
      // 0e1a: goto 0e1e
      // 0e1d: bipush 0
      // 0e1e: bipush 1
      // 0e1f: if_icmpne 0e7c
      // 0e22: aload 1
      // 0e23: instanceof net/minecraft/server/level/ServerLevel
      // 0e26: ifeq 0e5e
      // 0e29: aload 1
      // 0e2a: checkcast net/minecraft/server/level/ServerLevel
      // 0e2d: astore 15
      // 0e2f: new net/minecraft/world/entity/item/ItemEntity
      // 0e32: dup
      // 0e33: aload 15
      // 0e35: dload 2
      // 0e36: dload 4
      // 0e38: dload 6
      // 0e3a: new net/minecraft/world/item/ItemStack
      // 0e3d: dup
      // 0e3e: getstatic net/mocreatures/init/MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 0e41: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 0e44: checkcast net/minecraft/world/level/ItemLike
      // 0e47: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 0e4a: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 0e4d: astore 16
      // 0e4f: aload 16
      // 0e51: bipush 10
      // 0e53: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 0e56: aload 15
      // 0e58: aload 16
      // 0e5a: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 0e5d: pop
      // 0e5e: aload 8
      // 0e60: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 0e63: ifeq 0e7c
      // 0e66: aload 8
      // 0e68: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 0e6b: astore 15
      // 0e6d: aload 15
      // 0e6f: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0e72: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Dirt_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0e75: bipush 0
      // 0e76: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0e79: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 0e7c: aload 8
      // 0e7e: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 0e81: ifeq 0ea3
      // 0e84: aload 8
      // 0e86: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 0e89: astore 14
      // 0e8b: aload 14
      // 0e8d: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0e90: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Cave_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0e93: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 0e96: checkcast java/lang/Boolean
      // 0e99: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0e9c: ifeq 0ea3
      // 0e9f: bipush 1
      // 0ea0: goto 0ea4
      // 0ea3: bipush 0
      // 0ea4: bipush 1
      // 0ea5: if_icmpne 0f02
      // 0ea8: aload 1
      // 0ea9: instanceof net/minecraft/server/level/ServerLevel
      // 0eac: ifeq 0ee4
      // 0eaf: aload 1
      // 0eb0: checkcast net/minecraft/server/level/ServerLevel
      // 0eb3: astore 15
      // 0eb5: new net/minecraft/world/entity/item/ItemEntity
      // 0eb8: dup
      // 0eb9: aload 15
      // 0ebb: dload 2
      // 0ebc: dload 4
      // 0ebe: dload 6
      // 0ec0: new net/minecraft/world/item/ItemStack
      // 0ec3: dup
      // 0ec4: getstatic net/mocreatures/init/MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 0ec7: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 0eca: checkcast net/minecraft/world/level/ItemLike
      // 0ecd: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 0ed0: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 0ed3: astore 16
      // 0ed5: aload 16
      // 0ed7: bipush 10
      // 0ed9: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 0edc: aload 15
      // 0ede: aload 16
      // 0ee0: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 0ee3: pop
      // 0ee4: aload 8
      // 0ee6: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 0ee9: ifeq 0f02
      // 0eec: aload 8
      // 0eee: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 0ef1: astore 15
      // 0ef3: aload 15
      // 0ef5: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0ef8: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Cave_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0efb: bipush 0
      // 0efc: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0eff: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 0f02: aload 8
      // 0f04: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 0f07: ifeq 0f29
      // 0f0a: aload 8
      // 0f0c: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 0f0f: astore 14
      // 0f11: aload 14
      // 0f13: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0f16: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Nether_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0f19: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 0f1c: checkcast java/lang/Boolean
      // 0f1f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0f22: ifeq 0f29
      // 0f25: bipush 1
      // 0f26: goto 0f2a
      // 0f29: bipush 0
      // 0f2a: bipush 1
      // 0f2b: if_icmpne 0f88
      // 0f2e: aload 1
      // 0f2f: instanceof net/minecraft/server/level/ServerLevel
      // 0f32: ifeq 0f6a
      // 0f35: aload 1
      // 0f36: checkcast net/minecraft/server/level/ServerLevel
      // 0f39: astore 15
      // 0f3b: new net/minecraft/world/entity/item/ItemEntity
      // 0f3e: dup
      // 0f3f: aload 15
      // 0f41: dload 2
      // 0f42: dload 4
      // 0f44: dload 6
      // 0f46: new net/minecraft/world/item/ItemStack
      // 0f49: dup
      // 0f4a: getstatic net/mocreatures/init/MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 0f4d: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 0f50: checkcast net/minecraft/world/level/ItemLike
      // 0f53: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 0f56: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 0f59: astore 16
      // 0f5b: aload 16
      // 0f5d: bipush 10
      // 0f5f: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 0f62: aload 15
      // 0f64: aload 16
      // 0f66: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 0f69: pop
      // 0f6a: aload 8
      // 0f6c: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 0f6f: ifeq 0f88
      // 0f72: aload 8
      // 0f74: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 0f77: astore 15
      // 0f79: aload 15
      // 0f7b: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0f7e: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Nether_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0f81: bipush 0
      // 0f82: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0f85: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 0f88: aload 8
      // 0f8a: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 0f8d: ifeq 0faf
      // 0f90: aload 8
      // 0f92: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 0f95: astore 14
      // 0f97: aload 14
      // 0f99: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0f9c: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Undead_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0f9f: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 0fa2: checkcast java/lang/Boolean
      // 0fa5: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0fa8: ifeq 0faf
      // 0fab: bipush 1
      // 0fac: goto 0fb0
      // 0faf: bipush 0
      // 0fb0: bipush 1
      // 0fb1: if_icmpne 100e
      // 0fb4: aload 1
      // 0fb5: instanceof net/minecraft/server/level/ServerLevel
      // 0fb8: ifeq 0ff0
      // 0fbb: aload 1
      // 0fbc: checkcast net/minecraft/server/level/ServerLevel
      // 0fbf: astore 15
      // 0fc1: new net/minecraft/world/entity/item/ItemEntity
      // 0fc4: dup
      // 0fc5: aload 15
      // 0fc7: dload 2
      // 0fc8: dload 4
      // 0fca: dload 6
      // 0fcc: new net/minecraft/world/item/ItemStack
      // 0fcf: dup
      // 0fd0: getstatic net/mocreatures/init/MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 0fd3: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 0fd6: checkcast net/minecraft/world/level/ItemLike
      // 0fd9: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 0fdc: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 0fdf: astore 16
      // 0fe1: aload 16
      // 0fe3: bipush 10
      // 0fe5: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 0fe8: aload 15
      // 0fea: aload 16
      // 0fec: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 0fef: pop
      // 0ff0: aload 8
      // 0ff2: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 0ff5: ifeq 100e
      // 0ff8: aload 8
      // 0ffa: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 0ffd: astore 15
      // 0fff: aload 15
      // 1001: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1004: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Undead_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1007: bipush 0
      // 1008: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 100b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 100e: aload 8
      // 1010: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 1013: ifeq 1035
      // 1016: aload 8
      // 1018: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 101b: astore 14
      // 101d: aload 14
      // 101f: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1022: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Netherite_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1025: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 1028: checkcast java/lang/Boolean
      // 102b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 102e: ifeq 1035
      // 1031: bipush 1
      // 1032: goto 1036
      // 1035: bipush 0
      // 1036: bipush 1
      // 1037: if_icmpne 108e
      // 103a: aload 1
      // 103b: instanceof net/minecraft/server/level/ServerLevel
      // 103e: ifeq 1070
      // 1041: aload 1
      // 1042: checkcast net/minecraft/server/level/ServerLevel
      // 1045: astore 15
      // 1047: new net/minecraft/world/entity/item/ItemEntity
      // 104a: dup
      // 104b: aload 15
      // 104d: dload 2
      // 104e: dload 4
      // 1050: dload 6
      // 1052: new net/minecraft/world/item/ItemStack
      // 1055: dup
      // 1056: getstatic net/minecraft/world/item/Items.NETHERITE_HELMET Lnet/minecraft/world/item/Item;
      // 1059: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 105c: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 105f: astore 16
      // 1061: aload 16
      // 1063: bipush 10
      // 1065: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1068: aload 15
      // 106a: aload 16
      // 106c: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 106f: pop
      // 1070: aload 8
      // 1072: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 1075: ifeq 108e
      // 1078: aload 8
      // 107a: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 107d: astore 15
      // 107f: aload 15
      // 1081: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1084: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Netherite_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1087: bipush 0
      // 1088: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 108b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 108e: aload 8
      // 1090: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 1093: ifeq 10b5
      // 1096: aload 8
      // 1098: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 109b: astore 11
      // 109d: aload 11
      // 109f: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 10a2: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Iron_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 10a5: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 10a8: checkcast java/lang/Boolean
      // 10ab: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 10ae: ifeq 10b5
      // 10b1: bipush 1
      // 10b2: goto 10b6
      // 10b5: bipush 0
      // 10b6: ifne 17da
      // 10b9: aload 9
      // 10bb: instanceof net/minecraft/world/entity/LivingEntity
      // 10be: ifeq 10d0
      // 10c1: aload 9
      // 10c3: checkcast net/minecraft/world/entity/LivingEntity
      // 10c6: astore 12
      // 10c8: aload 12
      // 10ca: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 10cd: goto 10d3
      // 10d0: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 10d3: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 10d6: getstatic net/minecraft/world/item/Items.IRON_HELMET Lnet/minecraft/world/item/Item;
      // 10d9: if_acmpne 17da
      // 10dc: aload 9
      // 10de: instanceof net/minecraft/world/entity/player/Player
      // 10e1: ifeq 1110
      // 10e4: aload 9
      // 10e6: checkcast net/minecraft/world/entity/player/Player
      // 10e9: astore 13
      // 10eb: new net/minecraft/world/item/ItemStack
      // 10ee: dup
      // 10ef: getstatic net/minecraft/world/item/Items.IRON_HELMET Lnet/minecraft/world/item/Item;
      // 10f2: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 10f5: astore 14
      // 10f7: aload 13
      // 10f9: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 10fc: aload 14
      // 10fe: invokedynamic test (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, net/mocreatures/procedures/UnihornedOstrichEquipment1Procedure.lambda$execute$4 (Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z, (Lnet/minecraft/world/item/ItemStack;)Z ]
      // 1103: bipush 1
      // 1104: aload 13
      // 1106: getfield net/minecraft/world/entity/player/Player.inventoryMenu Lnet/minecraft/world/inventory/InventoryMenu;
      // 1109: invokevirtual net/minecraft/world/inventory/InventoryMenu.getCraftSlots ()Lnet/minecraft/world/inventory/CraftingContainer;
      // 110c: invokevirtual net/minecraft/world/entity/player/Inventory.clearOrCountMatchingItems (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
      // 110f: pop
      // 1110: aload 8
      // 1112: astore 13
      // 1114: aload 13
      // 1116: instanceof net/minecraft/world/entity/player/Player
      // 1119: ifeq 1145
      // 111c: aload 13
      // 111e: checkcast net/minecraft/world/entity/player/Player
      // 1121: astore 14
      // 1123: aload 14
      // 1125: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 1128: getfield net/minecraft/world/entity/player/Inventory.armor Lnet/minecraft/core/NonNullList;
      // 112b: bipush 0
      // 112c: new net/minecraft/world/item/ItemStack
      // 112f: dup
      // 1130: getstatic net/minecraft/world/item/Items.IRON_HELMET Lnet/minecraft/world/item/Item;
      // 1133: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 1136: invokevirtual net/minecraft/core/NonNullList.set (ILjava/lang/Object;)Ljava/lang/Object;
      // 1139: pop
      // 113a: aload 14
      // 113c: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 113f: invokevirtual net/minecraft/world/entity/player/Inventory.setChanged ()V
      // 1142: goto 1166
      // 1145: aload 13
      // 1147: instanceof net/minecraft/world/entity/LivingEntity
      // 114a: ifeq 1166
      // 114d: aload 13
      // 114f: checkcast net/minecraft/world/entity/LivingEntity
      // 1152: astore 15
      // 1154: aload 15
      // 1156: getstatic net/minecraft/world/entity/EquipmentSlot.FEET Lnet/minecraft/world/entity/EquipmentSlot;
      // 1159: new net/minecraft/world/item/ItemStack
      // 115c: dup
      // 115d: getstatic net/minecraft/world/item/Items.IRON_HELMET Lnet/minecraft/world/item/Item;
      // 1160: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 1163: invokevirtual net/minecraft/world/entity/LivingEntity.setItemSlot (Lnet/minecraft/world/entity/EquipmentSlot;Lnet/minecraft/world/item/ItemStack;)V
      // 1166: aload 8
      // 1168: instanceof net/minecraft/world/entity/LivingEntity
      // 116b: ifeq 1180
      // 116e: aload 8
      // 1170: checkcast net/minecraft/world/entity/LivingEntity
      // 1173: astore 13
      // 1175: aload 13
      // 1177: getstatic net/minecraft/world/entity/EquipmentSlot.FEET Lnet/minecraft/world/entity/EquipmentSlot;
      // 117a: invokevirtual net/minecraft/world/entity/LivingEntity.getItemBySlot (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
      // 117d: goto 1183
      // 1180: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 1183: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 1186: getstatic net/minecraft/world/item/Items.IRON_HELMET Lnet/minecraft/world/item/Item;
      // 1189: if_acmpne 17da
      // 118c: aload 8
      // 118e: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 1191: ifeq 11aa
      // 1194: aload 8
      // 1196: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 1199: astore 14
      // 119b: aload 14
      // 119d: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 11a0: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Iron_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 11a3: bipush 1
      // 11a4: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 11a7: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 11aa: aload 8
      // 11ac: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 11af: ifeq 11d1
      // 11b2: aload 8
      // 11b4: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 11b7: astore 14
      // 11b9: aload 14
      // 11bb: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 11be: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Gold_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 11c1: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 11c4: checkcast java/lang/Boolean
      // 11c7: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 11ca: ifeq 11d1
      // 11cd: bipush 1
      // 11ce: goto 11d2
      // 11d1: bipush 0
      // 11d2: bipush 1
      // 11d3: if_icmpne 122a
      // 11d6: aload 1
      // 11d7: instanceof net/minecraft/server/level/ServerLevel
      // 11da: ifeq 120c
      // 11dd: aload 1
      // 11de: checkcast net/minecraft/server/level/ServerLevel
      // 11e1: astore 15
      // 11e3: new net/minecraft/world/entity/item/ItemEntity
      // 11e6: dup
      // 11e7: aload 15
      // 11e9: dload 2
      // 11ea: dload 4
      // 11ec: dload 6
      // 11ee: new net/minecraft/world/item/ItemStack
      // 11f1: dup
      // 11f2: getstatic net/minecraft/world/item/Items.GOLDEN_HELMET Lnet/minecraft/world/item/Item;
      // 11f5: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 11f8: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 11fb: astore 16
      // 11fd: aload 16
      // 11ff: bipush 10
      // 1201: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1204: aload 15
      // 1206: aload 16
      // 1208: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 120b: pop
      // 120c: aload 8
      // 120e: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 1211: ifeq 122a
      // 1214: aload 8
      // 1216: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 1219: astore 15
      // 121b: aload 15
      // 121d: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1220: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Gold_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1223: bipush 0
      // 1224: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1227: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 122a: aload 8
      // 122c: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 122f: ifeq 1251
      // 1232: aload 8
      // 1234: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 1237: astore 14
      // 1239: aload 14
      // 123b: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 123e: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Diamond_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1241: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 1244: checkcast java/lang/Boolean
      // 1247: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 124a: ifeq 1251
      // 124d: bipush 1
      // 124e: goto 1252
      // 1251: bipush 0
      // 1252: bipush 1
      // 1253: if_icmpne 12aa
      // 1256: aload 1
      // 1257: instanceof net/minecraft/server/level/ServerLevel
      // 125a: ifeq 128c
      // 125d: aload 1
      // 125e: checkcast net/minecraft/server/level/ServerLevel
      // 1261: astore 15
      // 1263: new net/minecraft/world/entity/item/ItemEntity
      // 1266: dup
      // 1267: aload 15
      // 1269: dload 2
      // 126a: dload 4
      // 126c: dload 6
      // 126e: new net/minecraft/world/item/ItemStack
      // 1271: dup
      // 1272: getstatic net/minecraft/world/item/Items.DIAMOND_HELMET Lnet/minecraft/world/item/Item;
      // 1275: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 1278: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 127b: astore 16
      // 127d: aload 16
      // 127f: bipush 10
      // 1281: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1284: aload 15
      // 1286: aload 16
      // 1288: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 128b: pop
      // 128c: aload 8
      // 128e: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 1291: ifeq 12aa
      // 1294: aload 8
      // 1296: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 1299: astore 15
      // 129b: aload 15
      // 129d: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 12a0: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Diamond_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 12a3: bipush 0
      // 12a4: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 12a7: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 12aa: aload 8
      // 12ac: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 12af: ifeq 12d1
      // 12b2: aload 8
      // 12b4: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 12b7: astore 14
      // 12b9: aload 14
      // 12bb: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 12be: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Fur_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 12c1: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 12c4: checkcast java/lang/Boolean
      // 12c7: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 12ca: ifeq 12d1
      // 12cd: bipush 1
      // 12ce: goto 12d2
      // 12d1: bipush 0
      // 12d2: bipush 1
      // 12d3: if_icmpne 1330
      // 12d6: aload 1
      // 12d7: instanceof net/minecraft/server/level/ServerLevel
      // 12da: ifeq 1312
      // 12dd: aload 1
      // 12de: checkcast net/minecraft/server/level/ServerLevel
      // 12e1: astore 15
      // 12e3: new net/minecraft/world/entity/item/ItemEntity
      // 12e6: dup
      // 12e7: aload 15
      // 12e9: dload 2
      // 12ea: dload 4
      // 12ec: dload 6
      // 12ee: new net/minecraft/world/item/ItemStack
      // 12f1: dup
      // 12f2: getstatic net/mocreatures/init/MocreaturesModItems.FUR_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 12f5: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 12f8: checkcast net/minecraft/world/level/ItemLike
      // 12fb: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 12fe: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1301: astore 16
      // 1303: aload 16
      // 1305: bipush 10
      // 1307: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 130a: aload 15
      // 130c: aload 16
      // 130e: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1311: pop
      // 1312: aload 8
      // 1314: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 1317: ifeq 1330
      // 131a: aload 8
      // 131c: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 131f: astore 15
      // 1321: aload 15
      // 1323: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1326: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Fur_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1329: bipush 0
      // 132a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 132d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 1330: aload 8
      // 1332: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 1335: ifeq 1357
      // 1338: aload 8
      // 133a: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 133d: astore 14
      // 133f: aload 14
      // 1341: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1344: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Reptile_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1347: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 134a: checkcast java/lang/Boolean
      // 134d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1350: ifeq 1357
      // 1353: bipush 1
      // 1354: goto 1358
      // 1357: bipush 0
      // 1358: bipush 1
      // 1359: if_icmpne 13b6
      // 135c: aload 1
      // 135d: instanceof net/minecraft/server/level/ServerLevel
      // 1360: ifeq 1398
      // 1363: aload 1
      // 1364: checkcast net/minecraft/server/level/ServerLevel
      // 1367: astore 15
      // 1369: new net/minecraft/world/entity/item/ItemEntity
      // 136c: dup
      // 136d: aload 15
      // 136f: dload 2
      // 1370: dload 4
      // 1372: dload 6
      // 1374: new net/minecraft/world/item/ItemStack
      // 1377: dup
      // 1378: getstatic net/mocreatures/init/MocreaturesModItems.REPTILE_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 137b: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 137e: checkcast net/minecraft/world/level/ItemLike
      // 1381: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 1384: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1387: astore 16
      // 1389: aload 16
      // 138b: bipush 10
      // 138d: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1390: aload 15
      // 1392: aload 16
      // 1394: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1397: pop
      // 1398: aload 8
      // 139a: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 139d: ifeq 13b6
      // 13a0: aload 8
      // 13a2: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 13a5: astore 15
      // 13a7: aload 15
      // 13a9: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 13ac: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Reptile_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 13af: bipush 0
      // 13b0: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 13b3: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 13b6: aload 8
      // 13b8: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 13bb: ifeq 13dd
      // 13be: aload 8
      // 13c0: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 13c3: astore 14
      // 13c5: aload 14
      // 13c7: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 13ca: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Hide_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 13cd: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 13d0: checkcast java/lang/Boolean
      // 13d3: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 13d6: ifeq 13dd
      // 13d9: bipush 1
      // 13da: goto 13de
      // 13dd: bipush 0
      // 13de: bipush 1
      // 13df: if_icmpne 143c
      // 13e2: aload 1
      // 13e3: instanceof net/minecraft/server/level/ServerLevel
      // 13e6: ifeq 141e
      // 13e9: aload 1
      // 13ea: checkcast net/minecraft/server/level/ServerLevel
      // 13ed: astore 15
      // 13ef: new net/minecraft/world/entity/item/ItemEntity
      // 13f2: dup
      // 13f3: aload 15
      // 13f5: dload 2
      // 13f6: dload 4
      // 13f8: dload 6
      // 13fa: new net/minecraft/world/item/ItemStack
      // 13fd: dup
      // 13fe: getstatic net/mocreatures/init/MocreaturesModItems.HIDE_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 1401: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 1404: checkcast net/minecraft/world/level/ItemLike
      // 1407: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 140a: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 140d: astore 16
      // 140f: aload 16
      // 1411: bipush 10
      // 1413: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1416: aload 15
      // 1418: aload 16
      // 141a: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 141d: pop
      // 141e: aload 8
      // 1420: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 1423: ifeq 143c
      // 1426: aload 8
      // 1428: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 142b: astore 15
      // 142d: aload 15
      // 142f: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1432: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Hide_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1435: bipush 0
      // 1436: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1439: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 143c: aload 8
      // 143e: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 1441: ifeq 1463
      // 1444: aload 8
      // 1446: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 1449: astore 14
      // 144b: aload 14
      // 144d: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1450: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Leather_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1453: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 1456: checkcast java/lang/Boolean
      // 1459: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 145c: ifeq 1463
      // 145f: bipush 1
      // 1460: goto 1464
      // 1463: bipush 0
      // 1464: bipush 1
      // 1465: if_icmpne 14bc
      // 1468: aload 1
      // 1469: instanceof net/minecraft/server/level/ServerLevel
      // 146c: ifeq 149e
      // 146f: aload 1
      // 1470: checkcast net/minecraft/server/level/ServerLevel
      // 1473: astore 15
      // 1475: new net/minecraft/world/entity/item/ItemEntity
      // 1478: dup
      // 1479: aload 15
      // 147b: dload 2
      // 147c: dload 4
      // 147e: dload 6
      // 1480: new net/minecraft/world/item/ItemStack
      // 1483: dup
      // 1484: getstatic net/minecraft/world/item/Items.LEATHER_HELMET Lnet/minecraft/world/item/Item;
      // 1487: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 148a: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 148d: astore 16
      // 148f: aload 16
      // 1491: bipush 10
      // 1493: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1496: aload 15
      // 1498: aload 16
      // 149a: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 149d: pop
      // 149e: aload 8
      // 14a0: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 14a3: ifeq 14bc
      // 14a6: aload 8
      // 14a8: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 14ab: astore 15
      // 14ad: aload 15
      // 14af: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 14b2: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Leather_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 14b5: bipush 0
      // 14b6: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 14b9: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 14bc: aload 8
      // 14be: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 14c1: ifeq 14e3
      // 14c4: aload 8
      // 14c6: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 14c9: astore 14
      // 14cb: aload 14
      // 14cd: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 14d0: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Frost_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 14d3: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 14d6: checkcast java/lang/Boolean
      // 14d9: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 14dc: ifeq 14e3
      // 14df: bipush 1
      // 14e0: goto 14e4
      // 14e3: bipush 0
      // 14e4: bipush 1
      // 14e5: if_icmpne 1542
      // 14e8: aload 1
      // 14e9: instanceof net/minecraft/server/level/ServerLevel
      // 14ec: ifeq 1524
      // 14ef: aload 1
      // 14f0: checkcast net/minecraft/server/level/ServerLevel
      // 14f3: astore 15
      // 14f5: new net/minecraft/world/entity/item/ItemEntity
      // 14f8: dup
      // 14f9: aload 15
      // 14fb: dload 2
      // 14fc: dload 4
      // 14fe: dload 6
      // 1500: new net/minecraft/world/item/ItemStack
      // 1503: dup
      // 1504: getstatic net/mocreatures/init/MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 1507: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 150a: checkcast net/minecraft/world/level/ItemLike
      // 150d: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 1510: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1513: astore 16
      // 1515: aload 16
      // 1517: bipush 10
      // 1519: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 151c: aload 15
      // 151e: aload 16
      // 1520: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1523: pop
      // 1524: aload 8
      // 1526: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 1529: ifeq 1542
      // 152c: aload 8
      // 152e: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 1531: astore 15
      // 1533: aload 15
      // 1535: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1538: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Frost_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 153b: bipush 0
      // 153c: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 153f: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 1542: aload 8
      // 1544: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 1547: ifeq 1569
      // 154a: aload 8
      // 154c: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 154f: astore 14
      // 1551: aload 14
      // 1553: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1556: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Dirt_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1559: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 155c: checkcast java/lang/Boolean
      // 155f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1562: ifeq 1569
      // 1565: bipush 1
      // 1566: goto 156a
      // 1569: bipush 0
      // 156a: bipush 1
      // 156b: if_icmpne 15c8
      // 156e: aload 1
      // 156f: instanceof net/minecraft/server/level/ServerLevel
      // 1572: ifeq 15aa
      // 1575: aload 1
      // 1576: checkcast net/minecraft/server/level/ServerLevel
      // 1579: astore 15
      // 157b: new net/minecraft/world/entity/item/ItemEntity
      // 157e: dup
      // 157f: aload 15
      // 1581: dload 2
      // 1582: dload 4
      // 1584: dload 6
      // 1586: new net/minecraft/world/item/ItemStack
      // 1589: dup
      // 158a: getstatic net/mocreatures/init/MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 158d: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 1590: checkcast net/minecraft/world/level/ItemLike
      // 1593: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 1596: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1599: astore 16
      // 159b: aload 16
      // 159d: bipush 10
      // 159f: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 15a2: aload 15
      // 15a4: aload 16
      // 15a6: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 15a9: pop
      // 15aa: aload 8
      // 15ac: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 15af: ifeq 15c8
      // 15b2: aload 8
      // 15b4: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 15b7: astore 15
      // 15b9: aload 15
      // 15bb: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 15be: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Dirt_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 15c1: bipush 0
      // 15c2: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 15c5: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 15c8: aload 8
      // 15ca: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 15cd: ifeq 15ef
      // 15d0: aload 8
      // 15d2: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 15d5: astore 14
      // 15d7: aload 14
      // 15d9: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 15dc: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Cave_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 15df: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 15e2: checkcast java/lang/Boolean
      // 15e5: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 15e8: ifeq 15ef
      // 15eb: bipush 1
      // 15ec: goto 15f0
      // 15ef: bipush 0
      // 15f0: bipush 1
      // 15f1: if_icmpne 164e
      // 15f4: aload 1
      // 15f5: instanceof net/minecraft/server/level/ServerLevel
      // 15f8: ifeq 1630
      // 15fb: aload 1
      // 15fc: checkcast net/minecraft/server/level/ServerLevel
      // 15ff: astore 15
      // 1601: new net/minecraft/world/entity/item/ItemEntity
      // 1604: dup
      // 1605: aload 15
      // 1607: dload 2
      // 1608: dload 4
      // 160a: dload 6
      // 160c: new net/minecraft/world/item/ItemStack
      // 160f: dup
      // 1610: getstatic net/mocreatures/init/MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 1613: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 1616: checkcast net/minecraft/world/level/ItemLike
      // 1619: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 161c: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 161f: astore 16
      // 1621: aload 16
      // 1623: bipush 10
      // 1625: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1628: aload 15
      // 162a: aload 16
      // 162c: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 162f: pop
      // 1630: aload 8
      // 1632: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 1635: ifeq 164e
      // 1638: aload 8
      // 163a: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 163d: astore 15
      // 163f: aload 15
      // 1641: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1644: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Cave_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1647: bipush 0
      // 1648: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 164b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 164e: aload 8
      // 1650: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 1653: ifeq 1675
      // 1656: aload 8
      // 1658: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 165b: astore 14
      // 165d: aload 14
      // 165f: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1662: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Nether_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1665: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 1668: checkcast java/lang/Boolean
      // 166b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 166e: ifeq 1675
      // 1671: bipush 1
      // 1672: goto 1676
      // 1675: bipush 0
      // 1676: bipush 1
      // 1677: if_icmpne 16d4
      // 167a: aload 1
      // 167b: instanceof net/minecraft/server/level/ServerLevel
      // 167e: ifeq 16b6
      // 1681: aload 1
      // 1682: checkcast net/minecraft/server/level/ServerLevel
      // 1685: astore 15
      // 1687: new net/minecraft/world/entity/item/ItemEntity
      // 168a: dup
      // 168b: aload 15
      // 168d: dload 2
      // 168e: dload 4
      // 1690: dload 6
      // 1692: new net/minecraft/world/item/ItemStack
      // 1695: dup
      // 1696: getstatic net/mocreatures/init/MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 1699: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 169c: checkcast net/minecraft/world/level/ItemLike
      // 169f: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 16a2: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 16a5: astore 16
      // 16a7: aload 16
      // 16a9: bipush 10
      // 16ab: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 16ae: aload 15
      // 16b0: aload 16
      // 16b2: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 16b5: pop
      // 16b6: aload 8
      // 16b8: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 16bb: ifeq 16d4
      // 16be: aload 8
      // 16c0: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 16c3: astore 15
      // 16c5: aload 15
      // 16c7: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 16ca: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Nether_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 16cd: bipush 0
      // 16ce: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 16d1: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 16d4: aload 8
      // 16d6: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 16d9: ifeq 16fb
      // 16dc: aload 8
      // 16de: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 16e1: astore 14
      // 16e3: aload 14
      // 16e5: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 16e8: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Undead_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 16eb: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 16ee: checkcast java/lang/Boolean
      // 16f1: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 16f4: ifeq 16fb
      // 16f7: bipush 1
      // 16f8: goto 16fc
      // 16fb: bipush 0
      // 16fc: bipush 1
      // 16fd: if_icmpne 175a
      // 1700: aload 1
      // 1701: instanceof net/minecraft/server/level/ServerLevel
      // 1704: ifeq 173c
      // 1707: aload 1
      // 1708: checkcast net/minecraft/server/level/ServerLevel
      // 170b: astore 15
      // 170d: new net/minecraft/world/entity/item/ItemEntity
      // 1710: dup
      // 1711: aload 15
      // 1713: dload 2
      // 1714: dload 4
      // 1716: dload 6
      // 1718: new net/minecraft/world/item/ItemStack
      // 171b: dup
      // 171c: getstatic net/mocreatures/init/MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 171f: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 1722: checkcast net/minecraft/world/level/ItemLike
      // 1725: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 1728: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 172b: astore 16
      // 172d: aload 16
      // 172f: bipush 10
      // 1731: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1734: aload 15
      // 1736: aload 16
      // 1738: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 173b: pop
      // 173c: aload 8
      // 173e: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 1741: ifeq 175a
      // 1744: aload 8
      // 1746: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 1749: astore 15
      // 174b: aload 15
      // 174d: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1750: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Undead_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1753: bipush 0
      // 1754: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1757: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 175a: aload 8
      // 175c: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 175f: ifeq 1781
      // 1762: aload 8
      // 1764: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 1767: astore 14
      // 1769: aload 14
      // 176b: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 176e: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Netherite_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1771: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 1774: checkcast java/lang/Boolean
      // 1777: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 177a: ifeq 1781
      // 177d: bipush 1
      // 177e: goto 1782
      // 1781: bipush 0
      // 1782: bipush 1
      // 1783: if_icmpne 17da
      // 1786: aload 1
      // 1787: instanceof net/minecraft/server/level/ServerLevel
      // 178a: ifeq 17bc
      // 178d: aload 1
      // 178e: checkcast net/minecraft/server/level/ServerLevel
      // 1791: astore 15
      // 1793: new net/minecraft/world/entity/item/ItemEntity
      // 1796: dup
      // 1797: aload 15
      // 1799: dload 2
      // 179a: dload 4
      // 179c: dload 6
      // 179e: new net/minecraft/world/item/ItemStack
      // 17a1: dup
      // 17a2: getstatic net/minecraft/world/item/Items.NETHERITE_HELMET Lnet/minecraft/world/item/Item;
      // 17a5: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 17a8: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 17ab: astore 16
      // 17ad: aload 16
      // 17af: bipush 10
      // 17b1: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 17b4: aload 15
      // 17b6: aload 16
      // 17b8: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 17bb: pop
      // 17bc: aload 8
      // 17be: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 17c1: ifeq 17da
      // 17c4: aload 8
      // 17c6: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 17c9: astore 15
      // 17cb: aload 15
      // 17cd: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 17d0: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Netherite_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 17d3: bipush 0
      // 17d4: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 17d7: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 17da: aload 8
      // 17dc: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 17df: ifeq 1801
      // 17e2: aload 8
      // 17e4: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 17e7: astore 11
      // 17e9: aload 11
      // 17eb: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 17ee: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Fur_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 17f1: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 17f4: checkcast java/lang/Boolean
      // 17f7: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 17fa: ifeq 1801
      // 17fd: bipush 1
      // 17fe: goto 1802
      // 1801: bipush 0
      // 1802: ifne 1f38
      // 1805: aload 9
      // 1807: instanceof net/minecraft/world/entity/LivingEntity
      // 180a: ifeq 181c
      // 180d: aload 9
      // 180f: checkcast net/minecraft/world/entity/LivingEntity
      // 1812: astore 12
      // 1814: aload 12
      // 1816: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 1819: goto 181f
      // 181c: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 181f: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 1822: getstatic net/mocreatures/init/MocreaturesModItems.FUR_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 1825: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 1828: if_acmpne 1f38
      // 182b: aload 9
      // 182d: instanceof net/minecraft/world/entity/player/Player
      // 1830: ifeq 1865
      // 1833: aload 9
      // 1835: checkcast net/minecraft/world/entity/player/Player
      // 1838: astore 13
      // 183a: new net/minecraft/world/item/ItemStack
      // 183d: dup
      // 183e: getstatic net/mocreatures/init/MocreaturesModItems.FUR_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 1841: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 1844: checkcast net/minecraft/world/level/ItemLike
      // 1847: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 184a: astore 14
      // 184c: aload 13
      // 184e: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 1851: aload 14
      // 1853: invokedynamic test (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, net/mocreatures/procedures/UnihornedOstrichEquipment1Procedure.lambda$execute$5 (Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z, (Lnet/minecraft/world/item/ItemStack;)Z ]
      // 1858: bipush 1
      // 1859: aload 13
      // 185b: getfield net/minecraft/world/entity/player/Player.inventoryMenu Lnet/minecraft/world/inventory/InventoryMenu;
      // 185e: invokevirtual net/minecraft/world/inventory/InventoryMenu.getCraftSlots ()Lnet/minecraft/world/inventory/CraftingContainer;
      // 1861: invokevirtual net/minecraft/world/entity/player/Inventory.clearOrCountMatchingItems (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
      // 1864: pop
      // 1865: aload 8
      // 1867: astore 13
      // 1869: aload 13
      // 186b: instanceof net/minecraft/world/entity/player/Player
      // 186e: ifeq 18a0
      // 1871: aload 13
      // 1873: checkcast net/minecraft/world/entity/player/Player
      // 1876: astore 14
      // 1878: aload 14
      // 187a: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 187d: getfield net/minecraft/world/entity/player/Inventory.armor Lnet/minecraft/core/NonNullList;
      // 1880: bipush 0
      // 1881: new net/minecraft/world/item/ItemStack
      // 1884: dup
      // 1885: getstatic net/mocreatures/init/MocreaturesModItems.FUR_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 1888: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 188b: checkcast net/minecraft/world/level/ItemLike
      // 188e: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 1891: invokevirtual net/minecraft/core/NonNullList.set (ILjava/lang/Object;)Ljava/lang/Object;
      // 1894: pop
      // 1895: aload 14
      // 1897: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 189a: invokevirtual net/minecraft/world/entity/player/Inventory.setChanged ()V
      // 189d: goto 18c7
      // 18a0: aload 13
      // 18a2: instanceof net/minecraft/world/entity/LivingEntity
      // 18a5: ifeq 18c7
      // 18a8: aload 13
      // 18aa: checkcast net/minecraft/world/entity/LivingEntity
      // 18ad: astore 15
      // 18af: aload 15
      // 18b1: getstatic net/minecraft/world/entity/EquipmentSlot.FEET Lnet/minecraft/world/entity/EquipmentSlot;
      // 18b4: new net/minecraft/world/item/ItemStack
      // 18b7: dup
      // 18b8: getstatic net/mocreatures/init/MocreaturesModItems.FUR_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 18bb: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 18be: checkcast net/minecraft/world/level/ItemLike
      // 18c1: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 18c4: invokevirtual net/minecraft/world/entity/LivingEntity.setItemSlot (Lnet/minecraft/world/entity/EquipmentSlot;Lnet/minecraft/world/item/ItemStack;)V
      // 18c7: aload 8
      // 18c9: instanceof net/minecraft/world/entity/LivingEntity
      // 18cc: ifeq 18e1
      // 18cf: aload 8
      // 18d1: checkcast net/minecraft/world/entity/LivingEntity
      // 18d4: astore 13
      // 18d6: aload 13
      // 18d8: getstatic net/minecraft/world/entity/EquipmentSlot.FEET Lnet/minecraft/world/entity/EquipmentSlot;
      // 18db: invokevirtual net/minecraft/world/entity/LivingEntity.getItemBySlot (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
      // 18de: goto 18e4
      // 18e1: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 18e4: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 18e7: getstatic net/mocreatures/init/MocreaturesModItems.FUR_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 18ea: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 18ed: if_acmpne 1f38
      // 18f0: aload 8
      // 18f2: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 18f5: ifeq 190e
      // 18f8: aload 8
      // 18fa: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 18fd: astore 14
      // 18ff: aload 14
      // 1901: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1904: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Fur_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1907: bipush 1
      // 1908: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 190b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 190e: aload 8
      // 1910: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 1913: ifeq 1935
      // 1916: aload 8
      // 1918: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 191b: astore 14
      // 191d: aload 14
      // 191f: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1922: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Gold_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1925: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 1928: checkcast java/lang/Boolean
      // 192b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 192e: ifeq 1935
      // 1931: bipush 1
      // 1932: goto 1936
      // 1935: bipush 0
      // 1936: bipush 1
      // 1937: if_icmpne 198e
      // 193a: aload 1
      // 193b: instanceof net/minecraft/server/level/ServerLevel
      // 193e: ifeq 1970
      // 1941: aload 1
      // 1942: checkcast net/minecraft/server/level/ServerLevel
      // 1945: astore 15
      // 1947: new net/minecraft/world/entity/item/ItemEntity
      // 194a: dup
      // 194b: aload 15
      // 194d: dload 2
      // 194e: dload 4
      // 1950: dload 6
      // 1952: new net/minecraft/world/item/ItemStack
      // 1955: dup
      // 1956: getstatic net/minecraft/world/item/Items.GOLDEN_HELMET Lnet/minecraft/world/item/Item;
      // 1959: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 195c: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 195f: astore 16
      // 1961: aload 16
      // 1963: bipush 10
      // 1965: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1968: aload 15
      // 196a: aload 16
      // 196c: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 196f: pop
      // 1970: aload 8
      // 1972: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 1975: ifeq 198e
      // 1978: aload 8
      // 197a: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 197d: astore 15
      // 197f: aload 15
      // 1981: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1984: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Gold_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1987: bipush 0
      // 1988: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 198b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 198e: aload 8
      // 1990: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 1993: ifeq 19b5
      // 1996: aload 8
      // 1998: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 199b: astore 14
      // 199d: aload 14
      // 199f: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 19a2: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Diamond_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 19a5: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 19a8: checkcast java/lang/Boolean
      // 19ab: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 19ae: ifeq 19b5
      // 19b1: bipush 1
      // 19b2: goto 19b6
      // 19b5: bipush 0
      // 19b6: bipush 1
      // 19b7: if_icmpne 1a0e
      // 19ba: aload 1
      // 19bb: instanceof net/minecraft/server/level/ServerLevel
      // 19be: ifeq 19f0
      // 19c1: aload 1
      // 19c2: checkcast net/minecraft/server/level/ServerLevel
      // 19c5: astore 15
      // 19c7: new net/minecraft/world/entity/item/ItemEntity
      // 19ca: dup
      // 19cb: aload 15
      // 19cd: dload 2
      // 19ce: dload 4
      // 19d0: dload 6
      // 19d2: new net/minecraft/world/item/ItemStack
      // 19d5: dup
      // 19d6: getstatic net/minecraft/world/item/Items.DIAMOND_HELMET Lnet/minecraft/world/item/Item;
      // 19d9: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 19dc: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 19df: astore 16
      // 19e1: aload 16
      // 19e3: bipush 10
      // 19e5: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 19e8: aload 15
      // 19ea: aload 16
      // 19ec: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 19ef: pop
      // 19f0: aload 8
      // 19f2: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 19f5: ifeq 1a0e
      // 19f8: aload 8
      // 19fa: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 19fd: astore 15
      // 19ff: aload 15
      // 1a01: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1a04: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Diamond_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1a07: bipush 0
      // 1a08: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1a0b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 1a0e: aload 8
      // 1a10: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 1a13: ifeq 1a35
      // 1a16: aload 8
      // 1a18: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 1a1b: astore 14
      // 1a1d: aload 14
      // 1a1f: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1a22: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Iron_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1a25: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 1a28: checkcast java/lang/Boolean
      // 1a2b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1a2e: ifeq 1a35
      // 1a31: bipush 1
      // 1a32: goto 1a36
      // 1a35: bipush 0
      // 1a36: bipush 1
      // 1a37: if_icmpne 1a8e
      // 1a3a: aload 1
      // 1a3b: instanceof net/minecraft/server/level/ServerLevel
      // 1a3e: ifeq 1a70
      // 1a41: aload 1
      // 1a42: checkcast net/minecraft/server/level/ServerLevel
      // 1a45: astore 15
      // 1a47: new net/minecraft/world/entity/item/ItemEntity
      // 1a4a: dup
      // 1a4b: aload 15
      // 1a4d: dload 2
      // 1a4e: dload 4
      // 1a50: dload 6
      // 1a52: new net/minecraft/world/item/ItemStack
      // 1a55: dup
      // 1a56: getstatic net/minecraft/world/item/Items.IRON_HELMET Lnet/minecraft/world/item/Item;
      // 1a59: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 1a5c: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1a5f: astore 16
      // 1a61: aload 16
      // 1a63: bipush 10
      // 1a65: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1a68: aload 15
      // 1a6a: aload 16
      // 1a6c: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1a6f: pop
      // 1a70: aload 8
      // 1a72: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 1a75: ifeq 1a8e
      // 1a78: aload 8
      // 1a7a: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 1a7d: astore 15
      // 1a7f: aload 15
      // 1a81: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1a84: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Iron_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1a87: bipush 0
      // 1a88: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1a8b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 1a8e: aload 8
      // 1a90: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 1a93: ifeq 1ab5
      // 1a96: aload 8
      // 1a98: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 1a9b: astore 14
      // 1a9d: aload 14
      // 1a9f: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1aa2: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Reptile_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1aa5: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 1aa8: checkcast java/lang/Boolean
      // 1aab: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1aae: ifeq 1ab5
      // 1ab1: bipush 1
      // 1ab2: goto 1ab6
      // 1ab5: bipush 0
      // 1ab6: bipush 1
      // 1ab7: if_icmpne 1b14
      // 1aba: aload 1
      // 1abb: instanceof net/minecraft/server/level/ServerLevel
      // 1abe: ifeq 1af6
      // 1ac1: aload 1
      // 1ac2: checkcast net/minecraft/server/level/ServerLevel
      // 1ac5: astore 15
      // 1ac7: new net/minecraft/world/entity/item/ItemEntity
      // 1aca: dup
      // 1acb: aload 15
      // 1acd: dload 2
      // 1ace: dload 4
      // 1ad0: dload 6
      // 1ad2: new net/minecraft/world/item/ItemStack
      // 1ad5: dup
      // 1ad6: getstatic net/mocreatures/init/MocreaturesModItems.REPTILE_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 1ad9: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 1adc: checkcast net/minecraft/world/level/ItemLike
      // 1adf: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 1ae2: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1ae5: astore 16
      // 1ae7: aload 16
      // 1ae9: bipush 10
      // 1aeb: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1aee: aload 15
      // 1af0: aload 16
      // 1af2: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1af5: pop
      // 1af6: aload 8
      // 1af8: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 1afb: ifeq 1b14
      // 1afe: aload 8
      // 1b00: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 1b03: astore 15
      // 1b05: aload 15
      // 1b07: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1b0a: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Reptile_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1b0d: bipush 0
      // 1b0e: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1b11: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 1b14: aload 8
      // 1b16: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 1b19: ifeq 1b3b
      // 1b1c: aload 8
      // 1b1e: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 1b21: astore 14
      // 1b23: aload 14
      // 1b25: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1b28: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Hide_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1b2b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 1b2e: checkcast java/lang/Boolean
      // 1b31: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1b34: ifeq 1b3b
      // 1b37: bipush 1
      // 1b38: goto 1b3c
      // 1b3b: bipush 0
      // 1b3c: bipush 1
      // 1b3d: if_icmpne 1b9a
      // 1b40: aload 1
      // 1b41: instanceof net/minecraft/server/level/ServerLevel
      // 1b44: ifeq 1b7c
      // 1b47: aload 1
      // 1b48: checkcast net/minecraft/server/level/ServerLevel
      // 1b4b: astore 15
      // 1b4d: new net/minecraft/world/entity/item/ItemEntity
      // 1b50: dup
      // 1b51: aload 15
      // 1b53: dload 2
      // 1b54: dload 4
      // 1b56: dload 6
      // 1b58: new net/minecraft/world/item/ItemStack
      // 1b5b: dup
      // 1b5c: getstatic net/mocreatures/init/MocreaturesModItems.HIDE_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 1b5f: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 1b62: checkcast net/minecraft/world/level/ItemLike
      // 1b65: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 1b68: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1b6b: astore 16
      // 1b6d: aload 16
      // 1b6f: bipush 10
      // 1b71: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1b74: aload 15
      // 1b76: aload 16
      // 1b78: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1b7b: pop
      // 1b7c: aload 8
      // 1b7e: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 1b81: ifeq 1b9a
      // 1b84: aload 8
      // 1b86: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 1b89: astore 15
      // 1b8b: aload 15
      // 1b8d: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1b90: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Hide_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1b93: bipush 0
      // 1b94: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1b97: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 1b9a: aload 8
      // 1b9c: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 1b9f: ifeq 1bc1
      // 1ba2: aload 8
      // 1ba4: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 1ba7: astore 14
      // 1ba9: aload 14
      // 1bab: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1bae: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Leather_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1bb1: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 1bb4: checkcast java/lang/Boolean
      // 1bb7: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1bba: ifeq 1bc1
      // 1bbd: bipush 1
      // 1bbe: goto 1bc2
      // 1bc1: bipush 0
      // 1bc2: bipush 1
      // 1bc3: if_icmpne 1c1a
      // 1bc6: aload 1
      // 1bc7: instanceof net/minecraft/server/level/ServerLevel
      // 1bca: ifeq 1bfc
      // 1bcd: aload 1
      // 1bce: checkcast net/minecraft/server/level/ServerLevel
      // 1bd1: astore 15
      // 1bd3: new net/minecraft/world/entity/item/ItemEntity
      // 1bd6: dup
      // 1bd7: aload 15
      // 1bd9: dload 2
      // 1bda: dload 4
      // 1bdc: dload 6
      // 1bde: new net/minecraft/world/item/ItemStack
      // 1be1: dup
      // 1be2: getstatic net/minecraft/world/item/Items.LEATHER_HELMET Lnet/minecraft/world/item/Item;
      // 1be5: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 1be8: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1beb: astore 16
      // 1bed: aload 16
      // 1bef: bipush 10
      // 1bf1: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1bf4: aload 15
      // 1bf6: aload 16
      // 1bf8: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1bfb: pop
      // 1bfc: aload 8
      // 1bfe: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 1c01: ifeq 1c1a
      // 1c04: aload 8
      // 1c06: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 1c09: astore 15
      // 1c0b: aload 15
      // 1c0d: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1c10: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Leather_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1c13: bipush 0
      // 1c14: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1c17: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 1c1a: aload 8
      // 1c1c: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 1c1f: ifeq 1c41
      // 1c22: aload 8
      // 1c24: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 1c27: astore 14
      // 1c29: aload 14
      // 1c2b: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1c2e: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Frost_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1c31: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 1c34: checkcast java/lang/Boolean
      // 1c37: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1c3a: ifeq 1c41
      // 1c3d: bipush 1
      // 1c3e: goto 1c42
      // 1c41: bipush 0
      // 1c42: bipush 1
      // 1c43: if_icmpne 1ca0
      // 1c46: aload 1
      // 1c47: instanceof net/minecraft/server/level/ServerLevel
      // 1c4a: ifeq 1c82
      // 1c4d: aload 1
      // 1c4e: checkcast net/minecraft/server/level/ServerLevel
      // 1c51: astore 15
      // 1c53: new net/minecraft/world/entity/item/ItemEntity
      // 1c56: dup
      // 1c57: aload 15
      // 1c59: dload 2
      // 1c5a: dload 4
      // 1c5c: dload 6
      // 1c5e: new net/minecraft/world/item/ItemStack
      // 1c61: dup
      // 1c62: getstatic net/mocreatures/init/MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 1c65: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 1c68: checkcast net/minecraft/world/level/ItemLike
      // 1c6b: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 1c6e: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1c71: astore 16
      // 1c73: aload 16
      // 1c75: bipush 10
      // 1c77: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1c7a: aload 15
      // 1c7c: aload 16
      // 1c7e: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1c81: pop
      // 1c82: aload 8
      // 1c84: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 1c87: ifeq 1ca0
      // 1c8a: aload 8
      // 1c8c: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 1c8f: astore 15
      // 1c91: aload 15
      // 1c93: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1c96: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Frost_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1c99: bipush 0
      // 1c9a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1c9d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 1ca0: aload 8
      // 1ca2: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 1ca5: ifeq 1cc7
      // 1ca8: aload 8
      // 1caa: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 1cad: astore 14
      // 1caf: aload 14
      // 1cb1: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1cb4: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Dirt_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1cb7: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 1cba: checkcast java/lang/Boolean
      // 1cbd: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1cc0: ifeq 1cc7
      // 1cc3: bipush 1
      // 1cc4: goto 1cc8
      // 1cc7: bipush 0
      // 1cc8: bipush 1
      // 1cc9: if_icmpne 1d26
      // 1ccc: aload 1
      // 1ccd: instanceof net/minecraft/server/level/ServerLevel
      // 1cd0: ifeq 1d08
      // 1cd3: aload 1
      // 1cd4: checkcast net/minecraft/server/level/ServerLevel
      // 1cd7: astore 15
      // 1cd9: new net/minecraft/world/entity/item/ItemEntity
      // 1cdc: dup
      // 1cdd: aload 15
      // 1cdf: dload 2
      // 1ce0: dload 4
      // 1ce2: dload 6
      // 1ce4: new net/minecraft/world/item/ItemStack
      // 1ce7: dup
      // 1ce8: getstatic net/mocreatures/init/MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 1ceb: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 1cee: checkcast net/minecraft/world/level/ItemLike
      // 1cf1: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 1cf4: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1cf7: astore 16
      // 1cf9: aload 16
      // 1cfb: bipush 10
      // 1cfd: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1d00: aload 15
      // 1d02: aload 16
      // 1d04: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1d07: pop
      // 1d08: aload 8
      // 1d0a: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 1d0d: ifeq 1d26
      // 1d10: aload 8
      // 1d12: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 1d15: astore 15
      // 1d17: aload 15
      // 1d19: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1d1c: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Dirt_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1d1f: bipush 0
      // 1d20: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1d23: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 1d26: aload 8
      // 1d28: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 1d2b: ifeq 1d4d
      // 1d2e: aload 8
      // 1d30: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 1d33: astore 14
      // 1d35: aload 14
      // 1d37: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1d3a: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Cave_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1d3d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 1d40: checkcast java/lang/Boolean
      // 1d43: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1d46: ifeq 1d4d
      // 1d49: bipush 1
      // 1d4a: goto 1d4e
      // 1d4d: bipush 0
      // 1d4e: bipush 1
      // 1d4f: if_icmpne 1dac
      // 1d52: aload 1
      // 1d53: instanceof net/minecraft/server/level/ServerLevel
      // 1d56: ifeq 1d8e
      // 1d59: aload 1
      // 1d5a: checkcast net/minecraft/server/level/ServerLevel
      // 1d5d: astore 15
      // 1d5f: new net/minecraft/world/entity/item/ItemEntity
      // 1d62: dup
      // 1d63: aload 15
      // 1d65: dload 2
      // 1d66: dload 4
      // 1d68: dload 6
      // 1d6a: new net/minecraft/world/item/ItemStack
      // 1d6d: dup
      // 1d6e: getstatic net/mocreatures/init/MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 1d71: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 1d74: checkcast net/minecraft/world/level/ItemLike
      // 1d77: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 1d7a: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1d7d: astore 16
      // 1d7f: aload 16
      // 1d81: bipush 10
      // 1d83: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1d86: aload 15
      // 1d88: aload 16
      // 1d8a: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1d8d: pop
      // 1d8e: aload 8
      // 1d90: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 1d93: ifeq 1dac
      // 1d96: aload 8
      // 1d98: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 1d9b: astore 15
      // 1d9d: aload 15
      // 1d9f: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1da2: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Cave_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1da5: bipush 0
      // 1da6: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1da9: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 1dac: aload 8
      // 1dae: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 1db1: ifeq 1dd3
      // 1db4: aload 8
      // 1db6: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 1db9: astore 14
      // 1dbb: aload 14
      // 1dbd: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1dc0: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Nether_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1dc3: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 1dc6: checkcast java/lang/Boolean
      // 1dc9: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1dcc: ifeq 1dd3
      // 1dcf: bipush 1
      // 1dd0: goto 1dd4
      // 1dd3: bipush 0
      // 1dd4: bipush 1
      // 1dd5: if_icmpne 1e32
      // 1dd8: aload 1
      // 1dd9: instanceof net/minecraft/server/level/ServerLevel
      // 1ddc: ifeq 1e14
      // 1ddf: aload 1
      // 1de0: checkcast net/minecraft/server/level/ServerLevel
      // 1de3: astore 15
      // 1de5: new net/minecraft/world/entity/item/ItemEntity
      // 1de8: dup
      // 1de9: aload 15
      // 1deb: dload 2
      // 1dec: dload 4
      // 1dee: dload 6
      // 1df0: new net/minecraft/world/item/ItemStack
      // 1df3: dup
      // 1df4: getstatic net/mocreatures/init/MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 1df7: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 1dfa: checkcast net/minecraft/world/level/ItemLike
      // 1dfd: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 1e00: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1e03: astore 16
      // 1e05: aload 16
      // 1e07: bipush 10
      // 1e09: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1e0c: aload 15
      // 1e0e: aload 16
      // 1e10: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1e13: pop
      // 1e14: aload 8
      // 1e16: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 1e19: ifeq 1e32
      // 1e1c: aload 8
      // 1e1e: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 1e21: astore 15
      // 1e23: aload 15
      // 1e25: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1e28: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Nether_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1e2b: bipush 0
      // 1e2c: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1e2f: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 1e32: aload 8
      // 1e34: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 1e37: ifeq 1e59
      // 1e3a: aload 8
      // 1e3c: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 1e3f: astore 14
      // 1e41: aload 14
      // 1e43: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1e46: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Undead_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1e49: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 1e4c: checkcast java/lang/Boolean
      // 1e4f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1e52: ifeq 1e59
      // 1e55: bipush 1
      // 1e56: goto 1e5a
      // 1e59: bipush 0
      // 1e5a: bipush 1
      // 1e5b: if_icmpne 1eb8
      // 1e5e: aload 1
      // 1e5f: instanceof net/minecraft/server/level/ServerLevel
      // 1e62: ifeq 1e9a
      // 1e65: aload 1
      // 1e66: checkcast net/minecraft/server/level/ServerLevel
      // 1e69: astore 15
      // 1e6b: new net/minecraft/world/entity/item/ItemEntity
      // 1e6e: dup
      // 1e6f: aload 15
      // 1e71: dload 2
      // 1e72: dload 4
      // 1e74: dload 6
      // 1e76: new net/minecraft/world/item/ItemStack
      // 1e79: dup
      // 1e7a: getstatic net/mocreatures/init/MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 1e7d: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 1e80: checkcast net/minecraft/world/level/ItemLike
      // 1e83: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 1e86: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1e89: astore 16
      // 1e8b: aload 16
      // 1e8d: bipush 10
      // 1e8f: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1e92: aload 15
      // 1e94: aload 16
      // 1e96: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1e99: pop
      // 1e9a: aload 8
      // 1e9c: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 1e9f: ifeq 1eb8
      // 1ea2: aload 8
      // 1ea4: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 1ea7: astore 15
      // 1ea9: aload 15
      // 1eab: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1eae: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Undead_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1eb1: bipush 0
      // 1eb2: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1eb5: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 1eb8: aload 8
      // 1eba: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 1ebd: ifeq 1edf
      // 1ec0: aload 8
      // 1ec2: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 1ec5: astore 14
      // 1ec7: aload 14
      // 1ec9: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1ecc: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Netherite_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1ecf: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 1ed2: checkcast java/lang/Boolean
      // 1ed5: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1ed8: ifeq 1edf
      // 1edb: bipush 1
      // 1edc: goto 1ee0
      // 1edf: bipush 0
      // 1ee0: bipush 1
      // 1ee1: if_icmpne 1f38
      // 1ee4: aload 1
      // 1ee5: instanceof net/minecraft/server/level/ServerLevel
      // 1ee8: ifeq 1f1a
      // 1eeb: aload 1
      // 1eec: checkcast net/minecraft/server/level/ServerLevel
      // 1eef: astore 15
      // 1ef1: new net/minecraft/world/entity/item/ItemEntity
      // 1ef4: dup
      // 1ef5: aload 15
      // 1ef7: dload 2
      // 1ef8: dload 4
      // 1efa: dload 6
      // 1efc: new net/minecraft/world/item/ItemStack
      // 1eff: dup
      // 1f00: getstatic net/minecraft/world/item/Items.NETHERITE_HELMET Lnet/minecraft/world/item/Item;
      // 1f03: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 1f06: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1f09: astore 16
      // 1f0b: aload 16
      // 1f0d: bipush 10
      // 1f0f: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1f12: aload 15
      // 1f14: aload 16
      // 1f16: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1f19: pop
      // 1f1a: aload 8
      // 1f1c: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 1f1f: ifeq 1f38
      // 1f22: aload 8
      // 1f24: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 1f27: astore 15
      // 1f29: aload 15
      // 1f2b: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1f2e: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Netherite_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1f31: bipush 0
      // 1f32: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1f35: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 1f38: aload 8
      // 1f3a: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 1f3d: ifeq 1f5f
      // 1f40: aload 8
      // 1f42: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 1f45: astore 11
      // 1f47: aload 11
      // 1f49: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1f4c: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Reptile_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1f4f: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 1f52: checkcast java/lang/Boolean
      // 1f55: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1f58: ifeq 1f5f
      // 1f5b: bipush 1
      // 1f5c: goto 1f60
      // 1f5f: bipush 0
      // 1f60: ifne 2696
      // 1f63: aload 9
      // 1f65: instanceof net/minecraft/world/entity/LivingEntity
      // 1f68: ifeq 1f7a
      // 1f6b: aload 9
      // 1f6d: checkcast net/minecraft/world/entity/LivingEntity
      // 1f70: astore 12
      // 1f72: aload 12
      // 1f74: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 1f77: goto 1f7d
      // 1f7a: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 1f7d: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 1f80: getstatic net/mocreatures/init/MocreaturesModItems.REPTILE_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 1f83: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 1f86: if_acmpne 2696
      // 1f89: aload 9
      // 1f8b: instanceof net/minecraft/world/entity/player/Player
      // 1f8e: ifeq 1fc3
      // 1f91: aload 9
      // 1f93: checkcast net/minecraft/world/entity/player/Player
      // 1f96: astore 13
      // 1f98: new net/minecraft/world/item/ItemStack
      // 1f9b: dup
      // 1f9c: getstatic net/mocreatures/init/MocreaturesModItems.REPTILE_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 1f9f: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 1fa2: checkcast net/minecraft/world/level/ItemLike
      // 1fa5: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 1fa8: astore 14
      // 1faa: aload 13
      // 1fac: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 1faf: aload 14
      // 1fb1: invokedynamic test (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, net/mocreatures/procedures/UnihornedOstrichEquipment1Procedure.lambda$execute$6 (Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z, (Lnet/minecraft/world/item/ItemStack;)Z ]
      // 1fb6: bipush 1
      // 1fb7: aload 13
      // 1fb9: getfield net/minecraft/world/entity/player/Player.inventoryMenu Lnet/minecraft/world/inventory/InventoryMenu;
      // 1fbc: invokevirtual net/minecraft/world/inventory/InventoryMenu.getCraftSlots ()Lnet/minecraft/world/inventory/CraftingContainer;
      // 1fbf: invokevirtual net/minecraft/world/entity/player/Inventory.clearOrCountMatchingItems (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
      // 1fc2: pop
      // 1fc3: aload 8
      // 1fc5: astore 13
      // 1fc7: aload 13
      // 1fc9: instanceof net/minecraft/world/entity/player/Player
      // 1fcc: ifeq 1ffe
      // 1fcf: aload 13
      // 1fd1: checkcast net/minecraft/world/entity/player/Player
      // 1fd4: astore 14
      // 1fd6: aload 14
      // 1fd8: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 1fdb: getfield net/minecraft/world/entity/player/Inventory.armor Lnet/minecraft/core/NonNullList;
      // 1fde: bipush 0
      // 1fdf: new net/minecraft/world/item/ItemStack
      // 1fe2: dup
      // 1fe3: getstatic net/mocreatures/init/MocreaturesModItems.REPTILE_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 1fe6: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 1fe9: checkcast net/minecraft/world/level/ItemLike
      // 1fec: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 1fef: invokevirtual net/minecraft/core/NonNullList.set (ILjava/lang/Object;)Ljava/lang/Object;
      // 1ff2: pop
      // 1ff3: aload 14
      // 1ff5: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 1ff8: invokevirtual net/minecraft/world/entity/player/Inventory.setChanged ()V
      // 1ffb: goto 2025
      // 1ffe: aload 13
      // 2000: instanceof net/minecraft/world/entity/LivingEntity
      // 2003: ifeq 2025
      // 2006: aload 13
      // 2008: checkcast net/minecraft/world/entity/LivingEntity
      // 200b: astore 15
      // 200d: aload 15
      // 200f: getstatic net/minecraft/world/entity/EquipmentSlot.FEET Lnet/minecraft/world/entity/EquipmentSlot;
      // 2012: new net/minecraft/world/item/ItemStack
      // 2015: dup
      // 2016: getstatic net/mocreatures/init/MocreaturesModItems.REPTILE_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 2019: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 201c: checkcast net/minecraft/world/level/ItemLike
      // 201f: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 2022: invokevirtual net/minecraft/world/entity/LivingEntity.setItemSlot (Lnet/minecraft/world/entity/EquipmentSlot;Lnet/minecraft/world/item/ItemStack;)V
      // 2025: aload 8
      // 2027: instanceof net/minecraft/world/entity/LivingEntity
      // 202a: ifeq 203f
      // 202d: aload 8
      // 202f: checkcast net/minecraft/world/entity/LivingEntity
      // 2032: astore 13
      // 2034: aload 13
      // 2036: getstatic net/minecraft/world/entity/EquipmentSlot.FEET Lnet/minecraft/world/entity/EquipmentSlot;
      // 2039: invokevirtual net/minecraft/world/entity/LivingEntity.getItemBySlot (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
      // 203c: goto 2042
      // 203f: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 2042: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 2045: getstatic net/mocreatures/init/MocreaturesModItems.REPTILE_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 2048: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 204b: if_acmpne 2696
      // 204e: aload 8
      // 2050: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 2053: ifeq 206c
      // 2056: aload 8
      // 2058: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 205b: astore 14
      // 205d: aload 14
      // 205f: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2062: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Reptile_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2065: bipush 1
      // 2066: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2069: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 206c: aload 8
      // 206e: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 2071: ifeq 2093
      // 2074: aload 8
      // 2076: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 2079: astore 14
      // 207b: aload 14
      // 207d: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2080: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Gold_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2083: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2086: checkcast java/lang/Boolean
      // 2089: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 208c: ifeq 2093
      // 208f: bipush 1
      // 2090: goto 2094
      // 2093: bipush 0
      // 2094: bipush 1
      // 2095: if_icmpne 20ec
      // 2098: aload 1
      // 2099: instanceof net/minecraft/server/level/ServerLevel
      // 209c: ifeq 20ce
      // 209f: aload 1
      // 20a0: checkcast net/minecraft/server/level/ServerLevel
      // 20a3: astore 15
      // 20a5: new net/minecraft/world/entity/item/ItemEntity
      // 20a8: dup
      // 20a9: aload 15
      // 20ab: dload 2
      // 20ac: dload 4
      // 20ae: dload 6
      // 20b0: new net/minecraft/world/item/ItemStack
      // 20b3: dup
      // 20b4: getstatic net/minecraft/world/item/Items.GOLDEN_HELMET Lnet/minecraft/world/item/Item;
      // 20b7: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 20ba: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 20bd: astore 16
      // 20bf: aload 16
      // 20c1: bipush 10
      // 20c3: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 20c6: aload 15
      // 20c8: aload 16
      // 20ca: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 20cd: pop
      // 20ce: aload 8
      // 20d0: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 20d3: ifeq 20ec
      // 20d6: aload 8
      // 20d8: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 20db: astore 15
      // 20dd: aload 15
      // 20df: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 20e2: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Gold_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 20e5: bipush 0
      // 20e6: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 20e9: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 20ec: aload 8
      // 20ee: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 20f1: ifeq 2113
      // 20f4: aload 8
      // 20f6: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 20f9: astore 14
      // 20fb: aload 14
      // 20fd: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2100: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Diamond_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2103: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2106: checkcast java/lang/Boolean
      // 2109: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 210c: ifeq 2113
      // 210f: bipush 1
      // 2110: goto 2114
      // 2113: bipush 0
      // 2114: bipush 1
      // 2115: if_icmpne 216c
      // 2118: aload 1
      // 2119: instanceof net/minecraft/server/level/ServerLevel
      // 211c: ifeq 214e
      // 211f: aload 1
      // 2120: checkcast net/minecraft/server/level/ServerLevel
      // 2123: astore 15
      // 2125: new net/minecraft/world/entity/item/ItemEntity
      // 2128: dup
      // 2129: aload 15
      // 212b: dload 2
      // 212c: dload 4
      // 212e: dload 6
      // 2130: new net/minecraft/world/item/ItemStack
      // 2133: dup
      // 2134: getstatic net/minecraft/world/item/Items.DIAMOND_HELMET Lnet/minecraft/world/item/Item;
      // 2137: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 213a: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 213d: astore 16
      // 213f: aload 16
      // 2141: bipush 10
      // 2143: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 2146: aload 15
      // 2148: aload 16
      // 214a: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 214d: pop
      // 214e: aload 8
      // 2150: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 2153: ifeq 216c
      // 2156: aload 8
      // 2158: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 215b: astore 15
      // 215d: aload 15
      // 215f: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2162: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Diamond_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2165: bipush 0
      // 2166: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2169: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 216c: aload 8
      // 216e: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 2171: ifeq 2193
      // 2174: aload 8
      // 2176: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 2179: astore 14
      // 217b: aload 14
      // 217d: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2180: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Iron_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2183: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2186: checkcast java/lang/Boolean
      // 2189: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 218c: ifeq 2193
      // 218f: bipush 1
      // 2190: goto 2194
      // 2193: bipush 0
      // 2194: bipush 1
      // 2195: if_icmpne 21ec
      // 2198: aload 1
      // 2199: instanceof net/minecraft/server/level/ServerLevel
      // 219c: ifeq 21ce
      // 219f: aload 1
      // 21a0: checkcast net/minecraft/server/level/ServerLevel
      // 21a3: astore 15
      // 21a5: new net/minecraft/world/entity/item/ItemEntity
      // 21a8: dup
      // 21a9: aload 15
      // 21ab: dload 2
      // 21ac: dload 4
      // 21ae: dload 6
      // 21b0: new net/minecraft/world/item/ItemStack
      // 21b3: dup
      // 21b4: getstatic net/minecraft/world/item/Items.IRON_HELMET Lnet/minecraft/world/item/Item;
      // 21b7: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 21ba: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 21bd: astore 16
      // 21bf: aload 16
      // 21c1: bipush 10
      // 21c3: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 21c6: aload 15
      // 21c8: aload 16
      // 21ca: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 21cd: pop
      // 21ce: aload 8
      // 21d0: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 21d3: ifeq 21ec
      // 21d6: aload 8
      // 21d8: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 21db: astore 15
      // 21dd: aload 15
      // 21df: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 21e2: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Iron_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 21e5: bipush 0
      // 21e6: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 21e9: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 21ec: aload 8
      // 21ee: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 21f1: ifeq 2213
      // 21f4: aload 8
      // 21f6: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 21f9: astore 14
      // 21fb: aload 14
      // 21fd: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2200: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Fur_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2203: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2206: checkcast java/lang/Boolean
      // 2209: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 220c: ifeq 2213
      // 220f: bipush 1
      // 2210: goto 2214
      // 2213: bipush 0
      // 2214: bipush 1
      // 2215: if_icmpne 2272
      // 2218: aload 1
      // 2219: instanceof net/minecraft/server/level/ServerLevel
      // 221c: ifeq 2254
      // 221f: aload 1
      // 2220: checkcast net/minecraft/server/level/ServerLevel
      // 2223: astore 15
      // 2225: new net/minecraft/world/entity/item/ItemEntity
      // 2228: dup
      // 2229: aload 15
      // 222b: dload 2
      // 222c: dload 4
      // 222e: dload 6
      // 2230: new net/minecraft/world/item/ItemStack
      // 2233: dup
      // 2234: getstatic net/mocreatures/init/MocreaturesModItems.FUR_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 2237: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 223a: checkcast net/minecraft/world/level/ItemLike
      // 223d: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 2240: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 2243: astore 16
      // 2245: aload 16
      // 2247: bipush 10
      // 2249: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 224c: aload 15
      // 224e: aload 16
      // 2250: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 2253: pop
      // 2254: aload 8
      // 2256: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 2259: ifeq 2272
      // 225c: aload 8
      // 225e: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 2261: astore 15
      // 2263: aload 15
      // 2265: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2268: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Fur_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 226b: bipush 0
      // 226c: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 226f: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 2272: aload 8
      // 2274: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 2277: ifeq 2299
      // 227a: aload 8
      // 227c: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 227f: astore 14
      // 2281: aload 14
      // 2283: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2286: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Hide_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2289: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 228c: checkcast java/lang/Boolean
      // 228f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2292: ifeq 2299
      // 2295: bipush 1
      // 2296: goto 229a
      // 2299: bipush 0
      // 229a: bipush 1
      // 229b: if_icmpne 22f8
      // 229e: aload 1
      // 229f: instanceof net/minecraft/server/level/ServerLevel
      // 22a2: ifeq 22da
      // 22a5: aload 1
      // 22a6: checkcast net/minecraft/server/level/ServerLevel
      // 22a9: astore 15
      // 22ab: new net/minecraft/world/entity/item/ItemEntity
      // 22ae: dup
      // 22af: aload 15
      // 22b1: dload 2
      // 22b2: dload 4
      // 22b4: dload 6
      // 22b6: new net/minecraft/world/item/ItemStack
      // 22b9: dup
      // 22ba: getstatic net/mocreatures/init/MocreaturesModItems.HIDE_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 22bd: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 22c0: checkcast net/minecraft/world/level/ItemLike
      // 22c3: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 22c6: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 22c9: astore 16
      // 22cb: aload 16
      // 22cd: bipush 10
      // 22cf: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 22d2: aload 15
      // 22d4: aload 16
      // 22d6: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 22d9: pop
      // 22da: aload 8
      // 22dc: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 22df: ifeq 22f8
      // 22e2: aload 8
      // 22e4: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 22e7: astore 15
      // 22e9: aload 15
      // 22eb: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 22ee: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Hide_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 22f1: bipush 0
      // 22f2: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 22f5: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 22f8: aload 8
      // 22fa: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 22fd: ifeq 231f
      // 2300: aload 8
      // 2302: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 2305: astore 14
      // 2307: aload 14
      // 2309: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 230c: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Leather_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 230f: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2312: checkcast java/lang/Boolean
      // 2315: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2318: ifeq 231f
      // 231b: bipush 1
      // 231c: goto 2320
      // 231f: bipush 0
      // 2320: bipush 1
      // 2321: if_icmpne 2378
      // 2324: aload 1
      // 2325: instanceof net/minecraft/server/level/ServerLevel
      // 2328: ifeq 235a
      // 232b: aload 1
      // 232c: checkcast net/minecraft/server/level/ServerLevel
      // 232f: astore 15
      // 2331: new net/minecraft/world/entity/item/ItemEntity
      // 2334: dup
      // 2335: aload 15
      // 2337: dload 2
      // 2338: dload 4
      // 233a: dload 6
      // 233c: new net/minecraft/world/item/ItemStack
      // 233f: dup
      // 2340: getstatic net/minecraft/world/item/Items.LEATHER_HELMET Lnet/minecraft/world/item/Item;
      // 2343: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 2346: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 2349: astore 16
      // 234b: aload 16
      // 234d: bipush 10
      // 234f: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 2352: aload 15
      // 2354: aload 16
      // 2356: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 2359: pop
      // 235a: aload 8
      // 235c: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 235f: ifeq 2378
      // 2362: aload 8
      // 2364: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 2367: astore 15
      // 2369: aload 15
      // 236b: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 236e: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Leather_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2371: bipush 0
      // 2372: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2375: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 2378: aload 8
      // 237a: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 237d: ifeq 239f
      // 2380: aload 8
      // 2382: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 2385: astore 14
      // 2387: aload 14
      // 2389: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 238c: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Frost_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 238f: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2392: checkcast java/lang/Boolean
      // 2395: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2398: ifeq 239f
      // 239b: bipush 1
      // 239c: goto 23a0
      // 239f: bipush 0
      // 23a0: bipush 1
      // 23a1: if_icmpne 23fe
      // 23a4: aload 1
      // 23a5: instanceof net/minecraft/server/level/ServerLevel
      // 23a8: ifeq 23e0
      // 23ab: aload 1
      // 23ac: checkcast net/minecraft/server/level/ServerLevel
      // 23af: astore 15
      // 23b1: new net/minecraft/world/entity/item/ItemEntity
      // 23b4: dup
      // 23b5: aload 15
      // 23b7: dload 2
      // 23b8: dload 4
      // 23ba: dload 6
      // 23bc: new net/minecraft/world/item/ItemStack
      // 23bf: dup
      // 23c0: getstatic net/mocreatures/init/MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 23c3: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 23c6: checkcast net/minecraft/world/level/ItemLike
      // 23c9: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 23cc: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 23cf: astore 16
      // 23d1: aload 16
      // 23d3: bipush 10
      // 23d5: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 23d8: aload 15
      // 23da: aload 16
      // 23dc: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 23df: pop
      // 23e0: aload 8
      // 23e2: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 23e5: ifeq 23fe
      // 23e8: aload 8
      // 23ea: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 23ed: astore 15
      // 23ef: aload 15
      // 23f1: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 23f4: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Frost_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 23f7: bipush 0
      // 23f8: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 23fb: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 23fe: aload 8
      // 2400: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 2403: ifeq 2425
      // 2406: aload 8
      // 2408: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 240b: astore 14
      // 240d: aload 14
      // 240f: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2412: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Dirt_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2415: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2418: checkcast java/lang/Boolean
      // 241b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 241e: ifeq 2425
      // 2421: bipush 1
      // 2422: goto 2426
      // 2425: bipush 0
      // 2426: bipush 1
      // 2427: if_icmpne 2484
      // 242a: aload 1
      // 242b: instanceof net/minecraft/server/level/ServerLevel
      // 242e: ifeq 2466
      // 2431: aload 1
      // 2432: checkcast net/minecraft/server/level/ServerLevel
      // 2435: astore 15
      // 2437: new net/minecraft/world/entity/item/ItemEntity
      // 243a: dup
      // 243b: aload 15
      // 243d: dload 2
      // 243e: dload 4
      // 2440: dload 6
      // 2442: new net/minecraft/world/item/ItemStack
      // 2445: dup
      // 2446: getstatic net/mocreatures/init/MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 2449: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 244c: checkcast net/minecraft/world/level/ItemLike
      // 244f: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 2452: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 2455: astore 16
      // 2457: aload 16
      // 2459: bipush 10
      // 245b: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 245e: aload 15
      // 2460: aload 16
      // 2462: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 2465: pop
      // 2466: aload 8
      // 2468: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 246b: ifeq 2484
      // 246e: aload 8
      // 2470: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 2473: astore 15
      // 2475: aload 15
      // 2477: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 247a: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Dirt_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 247d: bipush 0
      // 247e: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2481: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 2484: aload 8
      // 2486: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 2489: ifeq 24ab
      // 248c: aload 8
      // 248e: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 2491: astore 14
      // 2493: aload 14
      // 2495: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2498: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Cave_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 249b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 249e: checkcast java/lang/Boolean
      // 24a1: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 24a4: ifeq 24ab
      // 24a7: bipush 1
      // 24a8: goto 24ac
      // 24ab: bipush 0
      // 24ac: bipush 1
      // 24ad: if_icmpne 250a
      // 24b0: aload 1
      // 24b1: instanceof net/minecraft/server/level/ServerLevel
      // 24b4: ifeq 24ec
      // 24b7: aload 1
      // 24b8: checkcast net/minecraft/server/level/ServerLevel
      // 24bb: astore 15
      // 24bd: new net/minecraft/world/entity/item/ItemEntity
      // 24c0: dup
      // 24c1: aload 15
      // 24c3: dload 2
      // 24c4: dload 4
      // 24c6: dload 6
      // 24c8: new net/minecraft/world/item/ItemStack
      // 24cb: dup
      // 24cc: getstatic net/mocreatures/init/MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 24cf: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 24d2: checkcast net/minecraft/world/level/ItemLike
      // 24d5: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 24d8: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 24db: astore 16
      // 24dd: aload 16
      // 24df: bipush 10
      // 24e1: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 24e4: aload 15
      // 24e6: aload 16
      // 24e8: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 24eb: pop
      // 24ec: aload 8
      // 24ee: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 24f1: ifeq 250a
      // 24f4: aload 8
      // 24f6: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 24f9: astore 15
      // 24fb: aload 15
      // 24fd: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2500: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Cave_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2503: bipush 0
      // 2504: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2507: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 250a: aload 8
      // 250c: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 250f: ifeq 2531
      // 2512: aload 8
      // 2514: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 2517: astore 14
      // 2519: aload 14
      // 251b: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 251e: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Nether_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2521: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2524: checkcast java/lang/Boolean
      // 2527: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 252a: ifeq 2531
      // 252d: bipush 1
      // 252e: goto 2532
      // 2531: bipush 0
      // 2532: bipush 1
      // 2533: if_icmpne 2590
      // 2536: aload 1
      // 2537: instanceof net/minecraft/server/level/ServerLevel
      // 253a: ifeq 2572
      // 253d: aload 1
      // 253e: checkcast net/minecraft/server/level/ServerLevel
      // 2541: astore 15
      // 2543: new net/minecraft/world/entity/item/ItemEntity
      // 2546: dup
      // 2547: aload 15
      // 2549: dload 2
      // 254a: dload 4
      // 254c: dload 6
      // 254e: new net/minecraft/world/item/ItemStack
      // 2551: dup
      // 2552: getstatic net/mocreatures/init/MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 2555: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 2558: checkcast net/minecraft/world/level/ItemLike
      // 255b: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 255e: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 2561: astore 16
      // 2563: aload 16
      // 2565: bipush 10
      // 2567: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 256a: aload 15
      // 256c: aload 16
      // 256e: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 2571: pop
      // 2572: aload 8
      // 2574: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 2577: ifeq 2590
      // 257a: aload 8
      // 257c: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 257f: astore 15
      // 2581: aload 15
      // 2583: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2586: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Nether_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2589: bipush 0
      // 258a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 258d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 2590: aload 8
      // 2592: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 2595: ifeq 25b7
      // 2598: aload 8
      // 259a: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 259d: astore 14
      // 259f: aload 14
      // 25a1: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 25a4: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Undead_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 25a7: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 25aa: checkcast java/lang/Boolean
      // 25ad: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 25b0: ifeq 25b7
      // 25b3: bipush 1
      // 25b4: goto 25b8
      // 25b7: bipush 0
      // 25b8: bipush 1
      // 25b9: if_icmpne 2616
      // 25bc: aload 1
      // 25bd: instanceof net/minecraft/server/level/ServerLevel
      // 25c0: ifeq 25f8
      // 25c3: aload 1
      // 25c4: checkcast net/minecraft/server/level/ServerLevel
      // 25c7: astore 15
      // 25c9: new net/minecraft/world/entity/item/ItemEntity
      // 25cc: dup
      // 25cd: aload 15
      // 25cf: dload 2
      // 25d0: dload 4
      // 25d2: dload 6
      // 25d4: new net/minecraft/world/item/ItemStack
      // 25d7: dup
      // 25d8: getstatic net/mocreatures/init/MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 25db: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 25de: checkcast net/minecraft/world/level/ItemLike
      // 25e1: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 25e4: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 25e7: astore 16
      // 25e9: aload 16
      // 25eb: bipush 10
      // 25ed: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 25f0: aload 15
      // 25f2: aload 16
      // 25f4: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 25f7: pop
      // 25f8: aload 8
      // 25fa: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 25fd: ifeq 2616
      // 2600: aload 8
      // 2602: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 2605: astore 15
      // 2607: aload 15
      // 2609: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 260c: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Undead_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 260f: bipush 0
      // 2610: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2613: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 2616: aload 8
      // 2618: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 261b: ifeq 263d
      // 261e: aload 8
      // 2620: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 2623: astore 14
      // 2625: aload 14
      // 2627: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 262a: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Netherite_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 262d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2630: checkcast java/lang/Boolean
      // 2633: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2636: ifeq 263d
      // 2639: bipush 1
      // 263a: goto 263e
      // 263d: bipush 0
      // 263e: bipush 1
      // 263f: if_icmpne 2696
      // 2642: aload 1
      // 2643: instanceof net/minecraft/server/level/ServerLevel
      // 2646: ifeq 2678
      // 2649: aload 1
      // 264a: checkcast net/minecraft/server/level/ServerLevel
      // 264d: astore 15
      // 264f: new net/minecraft/world/entity/item/ItemEntity
      // 2652: dup
      // 2653: aload 15
      // 2655: dload 2
      // 2656: dload 4
      // 2658: dload 6
      // 265a: new net/minecraft/world/item/ItemStack
      // 265d: dup
      // 265e: getstatic net/minecraft/world/item/Items.NETHERITE_HELMET Lnet/minecraft/world/item/Item;
      // 2661: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 2664: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 2667: astore 16
      // 2669: aload 16
      // 266b: bipush 10
      // 266d: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 2670: aload 15
      // 2672: aload 16
      // 2674: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 2677: pop
      // 2678: aload 8
      // 267a: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 267d: ifeq 2696
      // 2680: aload 8
      // 2682: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 2685: astore 15
      // 2687: aload 15
      // 2689: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 268c: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Netherite_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 268f: bipush 0
      // 2690: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2693: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 2696: aload 8
      // 2698: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 269b: ifeq 26bd
      // 269e: aload 8
      // 26a0: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 26a3: astore 11
      // 26a5: aload 11
      // 26a7: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 26aa: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Hide_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 26ad: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 26b0: checkcast java/lang/Boolean
      // 26b3: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 26b6: ifeq 26bd
      // 26b9: bipush 1
      // 26ba: goto 26be
      // 26bd: bipush 0
      // 26be: ifne 2df4
      // 26c1: aload 9
      // 26c3: instanceof net/minecraft/world/entity/LivingEntity
      // 26c6: ifeq 26d8
      // 26c9: aload 9
      // 26cb: checkcast net/minecraft/world/entity/LivingEntity
      // 26ce: astore 12
      // 26d0: aload 12
      // 26d2: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 26d5: goto 26db
      // 26d8: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 26db: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 26de: getstatic net/mocreatures/init/MocreaturesModItems.HIDE_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 26e1: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 26e4: if_acmpne 2df4
      // 26e7: aload 9
      // 26e9: instanceof net/minecraft/world/entity/player/Player
      // 26ec: ifeq 2721
      // 26ef: aload 9
      // 26f1: checkcast net/minecraft/world/entity/player/Player
      // 26f4: astore 13
      // 26f6: new net/minecraft/world/item/ItemStack
      // 26f9: dup
      // 26fa: getstatic net/mocreatures/init/MocreaturesModItems.HIDE_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 26fd: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 2700: checkcast net/minecraft/world/level/ItemLike
      // 2703: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 2706: astore 14
      // 2708: aload 13
      // 270a: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 270d: aload 14
      // 270f: invokedynamic test (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, net/mocreatures/procedures/UnihornedOstrichEquipment1Procedure.lambda$execute$7 (Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z, (Lnet/minecraft/world/item/ItemStack;)Z ]
      // 2714: bipush 1
      // 2715: aload 13
      // 2717: getfield net/minecraft/world/entity/player/Player.inventoryMenu Lnet/minecraft/world/inventory/InventoryMenu;
      // 271a: invokevirtual net/minecraft/world/inventory/InventoryMenu.getCraftSlots ()Lnet/minecraft/world/inventory/CraftingContainer;
      // 271d: invokevirtual net/minecraft/world/entity/player/Inventory.clearOrCountMatchingItems (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
      // 2720: pop
      // 2721: aload 8
      // 2723: astore 13
      // 2725: aload 13
      // 2727: instanceof net/minecraft/world/entity/player/Player
      // 272a: ifeq 275c
      // 272d: aload 13
      // 272f: checkcast net/minecraft/world/entity/player/Player
      // 2732: astore 14
      // 2734: aload 14
      // 2736: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 2739: getfield net/minecraft/world/entity/player/Inventory.armor Lnet/minecraft/core/NonNullList;
      // 273c: bipush 0
      // 273d: new net/minecraft/world/item/ItemStack
      // 2740: dup
      // 2741: getstatic net/mocreatures/init/MocreaturesModItems.HIDE_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 2744: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 2747: checkcast net/minecraft/world/level/ItemLike
      // 274a: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 274d: invokevirtual net/minecraft/core/NonNullList.set (ILjava/lang/Object;)Ljava/lang/Object;
      // 2750: pop
      // 2751: aload 14
      // 2753: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 2756: invokevirtual net/minecraft/world/entity/player/Inventory.setChanged ()V
      // 2759: goto 2783
      // 275c: aload 13
      // 275e: instanceof net/minecraft/world/entity/LivingEntity
      // 2761: ifeq 2783
      // 2764: aload 13
      // 2766: checkcast net/minecraft/world/entity/LivingEntity
      // 2769: astore 15
      // 276b: aload 15
      // 276d: getstatic net/minecraft/world/entity/EquipmentSlot.FEET Lnet/minecraft/world/entity/EquipmentSlot;
      // 2770: new net/minecraft/world/item/ItemStack
      // 2773: dup
      // 2774: getstatic net/mocreatures/init/MocreaturesModItems.HIDE_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 2777: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 277a: checkcast net/minecraft/world/level/ItemLike
      // 277d: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 2780: invokevirtual net/minecraft/world/entity/LivingEntity.setItemSlot (Lnet/minecraft/world/entity/EquipmentSlot;Lnet/minecraft/world/item/ItemStack;)V
      // 2783: aload 8
      // 2785: instanceof net/minecraft/world/entity/LivingEntity
      // 2788: ifeq 279d
      // 278b: aload 8
      // 278d: checkcast net/minecraft/world/entity/LivingEntity
      // 2790: astore 13
      // 2792: aload 13
      // 2794: getstatic net/minecraft/world/entity/EquipmentSlot.FEET Lnet/minecraft/world/entity/EquipmentSlot;
      // 2797: invokevirtual net/minecraft/world/entity/LivingEntity.getItemBySlot (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
      // 279a: goto 27a0
      // 279d: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 27a0: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 27a3: getstatic net/mocreatures/init/MocreaturesModItems.HIDE_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 27a6: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 27a9: if_acmpne 2df4
      // 27ac: aload 8
      // 27ae: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 27b1: ifeq 27ca
      // 27b4: aload 8
      // 27b6: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 27b9: astore 14
      // 27bb: aload 14
      // 27bd: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 27c0: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Hide_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 27c3: bipush 1
      // 27c4: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 27c7: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 27ca: aload 8
      // 27cc: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 27cf: ifeq 27f1
      // 27d2: aload 8
      // 27d4: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 27d7: astore 14
      // 27d9: aload 14
      // 27db: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 27de: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Gold_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 27e1: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 27e4: checkcast java/lang/Boolean
      // 27e7: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 27ea: ifeq 27f1
      // 27ed: bipush 1
      // 27ee: goto 27f2
      // 27f1: bipush 0
      // 27f2: bipush 1
      // 27f3: if_icmpne 284a
      // 27f6: aload 1
      // 27f7: instanceof net/minecraft/server/level/ServerLevel
      // 27fa: ifeq 282c
      // 27fd: aload 1
      // 27fe: checkcast net/minecraft/server/level/ServerLevel
      // 2801: astore 15
      // 2803: new net/minecraft/world/entity/item/ItemEntity
      // 2806: dup
      // 2807: aload 15
      // 2809: dload 2
      // 280a: dload 4
      // 280c: dload 6
      // 280e: new net/minecraft/world/item/ItemStack
      // 2811: dup
      // 2812: getstatic net/minecraft/world/item/Items.GOLDEN_HELMET Lnet/minecraft/world/item/Item;
      // 2815: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 2818: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 281b: astore 16
      // 281d: aload 16
      // 281f: bipush 10
      // 2821: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 2824: aload 15
      // 2826: aload 16
      // 2828: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 282b: pop
      // 282c: aload 8
      // 282e: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 2831: ifeq 284a
      // 2834: aload 8
      // 2836: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 2839: astore 15
      // 283b: aload 15
      // 283d: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2840: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Gold_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2843: bipush 0
      // 2844: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2847: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 284a: aload 8
      // 284c: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 284f: ifeq 2871
      // 2852: aload 8
      // 2854: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 2857: astore 14
      // 2859: aload 14
      // 285b: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 285e: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Diamond_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2861: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2864: checkcast java/lang/Boolean
      // 2867: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 286a: ifeq 2871
      // 286d: bipush 1
      // 286e: goto 2872
      // 2871: bipush 0
      // 2872: bipush 1
      // 2873: if_icmpne 28ca
      // 2876: aload 1
      // 2877: instanceof net/minecraft/server/level/ServerLevel
      // 287a: ifeq 28ac
      // 287d: aload 1
      // 287e: checkcast net/minecraft/server/level/ServerLevel
      // 2881: astore 15
      // 2883: new net/minecraft/world/entity/item/ItemEntity
      // 2886: dup
      // 2887: aload 15
      // 2889: dload 2
      // 288a: dload 4
      // 288c: dload 6
      // 288e: new net/minecraft/world/item/ItemStack
      // 2891: dup
      // 2892: getstatic net/minecraft/world/item/Items.DIAMOND_HELMET Lnet/minecraft/world/item/Item;
      // 2895: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 2898: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 289b: astore 16
      // 289d: aload 16
      // 289f: bipush 10
      // 28a1: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 28a4: aload 15
      // 28a6: aload 16
      // 28a8: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 28ab: pop
      // 28ac: aload 8
      // 28ae: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 28b1: ifeq 28ca
      // 28b4: aload 8
      // 28b6: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 28b9: astore 15
      // 28bb: aload 15
      // 28bd: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 28c0: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Diamond_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 28c3: bipush 0
      // 28c4: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 28c7: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 28ca: aload 8
      // 28cc: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 28cf: ifeq 28f1
      // 28d2: aload 8
      // 28d4: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 28d7: astore 14
      // 28d9: aload 14
      // 28db: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 28de: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Iron_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 28e1: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 28e4: checkcast java/lang/Boolean
      // 28e7: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 28ea: ifeq 28f1
      // 28ed: bipush 1
      // 28ee: goto 28f2
      // 28f1: bipush 0
      // 28f2: bipush 1
      // 28f3: if_icmpne 294a
      // 28f6: aload 1
      // 28f7: instanceof net/minecraft/server/level/ServerLevel
      // 28fa: ifeq 292c
      // 28fd: aload 1
      // 28fe: checkcast net/minecraft/server/level/ServerLevel
      // 2901: astore 15
      // 2903: new net/minecraft/world/entity/item/ItemEntity
      // 2906: dup
      // 2907: aload 15
      // 2909: dload 2
      // 290a: dload 4
      // 290c: dload 6
      // 290e: new net/minecraft/world/item/ItemStack
      // 2911: dup
      // 2912: getstatic net/minecraft/world/item/Items.IRON_HELMET Lnet/minecraft/world/item/Item;
      // 2915: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 2918: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 291b: astore 16
      // 291d: aload 16
      // 291f: bipush 10
      // 2921: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 2924: aload 15
      // 2926: aload 16
      // 2928: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 292b: pop
      // 292c: aload 8
      // 292e: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 2931: ifeq 294a
      // 2934: aload 8
      // 2936: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 2939: astore 15
      // 293b: aload 15
      // 293d: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2940: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Iron_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2943: bipush 0
      // 2944: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2947: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 294a: aload 8
      // 294c: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 294f: ifeq 2971
      // 2952: aload 8
      // 2954: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 2957: astore 14
      // 2959: aload 14
      // 295b: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 295e: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Fur_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2961: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2964: checkcast java/lang/Boolean
      // 2967: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 296a: ifeq 2971
      // 296d: bipush 1
      // 296e: goto 2972
      // 2971: bipush 0
      // 2972: bipush 1
      // 2973: if_icmpne 29d0
      // 2976: aload 1
      // 2977: instanceof net/minecraft/server/level/ServerLevel
      // 297a: ifeq 29b2
      // 297d: aload 1
      // 297e: checkcast net/minecraft/server/level/ServerLevel
      // 2981: astore 15
      // 2983: new net/minecraft/world/entity/item/ItemEntity
      // 2986: dup
      // 2987: aload 15
      // 2989: dload 2
      // 298a: dload 4
      // 298c: dload 6
      // 298e: new net/minecraft/world/item/ItemStack
      // 2991: dup
      // 2992: getstatic net/mocreatures/init/MocreaturesModItems.FUR_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 2995: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 2998: checkcast net/minecraft/world/level/ItemLike
      // 299b: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 299e: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 29a1: astore 16
      // 29a3: aload 16
      // 29a5: bipush 10
      // 29a7: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 29aa: aload 15
      // 29ac: aload 16
      // 29ae: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 29b1: pop
      // 29b2: aload 8
      // 29b4: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 29b7: ifeq 29d0
      // 29ba: aload 8
      // 29bc: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 29bf: astore 15
      // 29c1: aload 15
      // 29c3: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 29c6: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Fur_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 29c9: bipush 0
      // 29ca: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 29cd: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 29d0: aload 8
      // 29d2: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 29d5: ifeq 29f7
      // 29d8: aload 8
      // 29da: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 29dd: astore 14
      // 29df: aload 14
      // 29e1: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 29e4: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Reptile_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 29e7: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 29ea: checkcast java/lang/Boolean
      // 29ed: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 29f0: ifeq 29f7
      // 29f3: bipush 1
      // 29f4: goto 29f8
      // 29f7: bipush 0
      // 29f8: bipush 1
      // 29f9: if_icmpne 2a56
      // 29fc: aload 1
      // 29fd: instanceof net/minecraft/server/level/ServerLevel
      // 2a00: ifeq 2a38
      // 2a03: aload 1
      // 2a04: checkcast net/minecraft/server/level/ServerLevel
      // 2a07: astore 15
      // 2a09: new net/minecraft/world/entity/item/ItemEntity
      // 2a0c: dup
      // 2a0d: aload 15
      // 2a0f: dload 2
      // 2a10: dload 4
      // 2a12: dload 6
      // 2a14: new net/minecraft/world/item/ItemStack
      // 2a17: dup
      // 2a18: getstatic net/mocreatures/init/MocreaturesModItems.REPTILE_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 2a1b: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 2a1e: checkcast net/minecraft/world/level/ItemLike
      // 2a21: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 2a24: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 2a27: astore 16
      // 2a29: aload 16
      // 2a2b: bipush 10
      // 2a2d: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 2a30: aload 15
      // 2a32: aload 16
      // 2a34: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 2a37: pop
      // 2a38: aload 8
      // 2a3a: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 2a3d: ifeq 2a56
      // 2a40: aload 8
      // 2a42: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 2a45: astore 15
      // 2a47: aload 15
      // 2a49: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2a4c: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Reptile_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2a4f: bipush 0
      // 2a50: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2a53: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 2a56: aload 8
      // 2a58: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 2a5b: ifeq 2a7d
      // 2a5e: aload 8
      // 2a60: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 2a63: astore 14
      // 2a65: aload 14
      // 2a67: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2a6a: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Leather_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2a6d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2a70: checkcast java/lang/Boolean
      // 2a73: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2a76: ifeq 2a7d
      // 2a79: bipush 1
      // 2a7a: goto 2a7e
      // 2a7d: bipush 0
      // 2a7e: bipush 1
      // 2a7f: if_icmpne 2ad6
      // 2a82: aload 1
      // 2a83: instanceof net/minecraft/server/level/ServerLevel
      // 2a86: ifeq 2ab8
      // 2a89: aload 1
      // 2a8a: checkcast net/minecraft/server/level/ServerLevel
      // 2a8d: astore 15
      // 2a8f: new net/minecraft/world/entity/item/ItemEntity
      // 2a92: dup
      // 2a93: aload 15
      // 2a95: dload 2
      // 2a96: dload 4
      // 2a98: dload 6
      // 2a9a: new net/minecraft/world/item/ItemStack
      // 2a9d: dup
      // 2a9e: getstatic net/minecraft/world/item/Items.LEATHER_HELMET Lnet/minecraft/world/item/Item;
      // 2aa1: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 2aa4: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 2aa7: astore 16
      // 2aa9: aload 16
      // 2aab: bipush 10
      // 2aad: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 2ab0: aload 15
      // 2ab2: aload 16
      // 2ab4: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 2ab7: pop
      // 2ab8: aload 8
      // 2aba: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 2abd: ifeq 2ad6
      // 2ac0: aload 8
      // 2ac2: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 2ac5: astore 15
      // 2ac7: aload 15
      // 2ac9: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2acc: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Leather_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2acf: bipush 0
      // 2ad0: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2ad3: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 2ad6: aload 8
      // 2ad8: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 2adb: ifeq 2afd
      // 2ade: aload 8
      // 2ae0: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 2ae3: astore 14
      // 2ae5: aload 14
      // 2ae7: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2aea: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Frost_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2aed: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2af0: checkcast java/lang/Boolean
      // 2af3: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2af6: ifeq 2afd
      // 2af9: bipush 1
      // 2afa: goto 2afe
      // 2afd: bipush 0
      // 2afe: bipush 1
      // 2aff: if_icmpne 2b5c
      // 2b02: aload 1
      // 2b03: instanceof net/minecraft/server/level/ServerLevel
      // 2b06: ifeq 2b3e
      // 2b09: aload 1
      // 2b0a: checkcast net/minecraft/server/level/ServerLevel
      // 2b0d: astore 15
      // 2b0f: new net/minecraft/world/entity/item/ItemEntity
      // 2b12: dup
      // 2b13: aload 15
      // 2b15: dload 2
      // 2b16: dload 4
      // 2b18: dload 6
      // 2b1a: new net/minecraft/world/item/ItemStack
      // 2b1d: dup
      // 2b1e: getstatic net/mocreatures/init/MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 2b21: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 2b24: checkcast net/minecraft/world/level/ItemLike
      // 2b27: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 2b2a: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 2b2d: astore 16
      // 2b2f: aload 16
      // 2b31: bipush 10
      // 2b33: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 2b36: aload 15
      // 2b38: aload 16
      // 2b3a: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 2b3d: pop
      // 2b3e: aload 8
      // 2b40: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 2b43: ifeq 2b5c
      // 2b46: aload 8
      // 2b48: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 2b4b: astore 15
      // 2b4d: aload 15
      // 2b4f: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2b52: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Frost_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2b55: bipush 0
      // 2b56: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2b59: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 2b5c: aload 8
      // 2b5e: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 2b61: ifeq 2b83
      // 2b64: aload 8
      // 2b66: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 2b69: astore 14
      // 2b6b: aload 14
      // 2b6d: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2b70: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Dirt_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2b73: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2b76: checkcast java/lang/Boolean
      // 2b79: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2b7c: ifeq 2b83
      // 2b7f: bipush 1
      // 2b80: goto 2b84
      // 2b83: bipush 0
      // 2b84: bipush 1
      // 2b85: if_icmpne 2be2
      // 2b88: aload 1
      // 2b89: instanceof net/minecraft/server/level/ServerLevel
      // 2b8c: ifeq 2bc4
      // 2b8f: aload 1
      // 2b90: checkcast net/minecraft/server/level/ServerLevel
      // 2b93: astore 15
      // 2b95: new net/minecraft/world/entity/item/ItemEntity
      // 2b98: dup
      // 2b99: aload 15
      // 2b9b: dload 2
      // 2b9c: dload 4
      // 2b9e: dload 6
      // 2ba0: new net/minecraft/world/item/ItemStack
      // 2ba3: dup
      // 2ba4: getstatic net/mocreatures/init/MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 2ba7: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 2baa: checkcast net/minecraft/world/level/ItemLike
      // 2bad: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 2bb0: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 2bb3: astore 16
      // 2bb5: aload 16
      // 2bb7: bipush 10
      // 2bb9: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 2bbc: aload 15
      // 2bbe: aload 16
      // 2bc0: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 2bc3: pop
      // 2bc4: aload 8
      // 2bc6: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 2bc9: ifeq 2be2
      // 2bcc: aload 8
      // 2bce: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 2bd1: astore 15
      // 2bd3: aload 15
      // 2bd5: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2bd8: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Dirt_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2bdb: bipush 0
      // 2bdc: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2bdf: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 2be2: aload 8
      // 2be4: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 2be7: ifeq 2c09
      // 2bea: aload 8
      // 2bec: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 2bef: astore 14
      // 2bf1: aload 14
      // 2bf3: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2bf6: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Cave_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2bf9: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2bfc: checkcast java/lang/Boolean
      // 2bff: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2c02: ifeq 2c09
      // 2c05: bipush 1
      // 2c06: goto 2c0a
      // 2c09: bipush 0
      // 2c0a: bipush 1
      // 2c0b: if_icmpne 2c68
      // 2c0e: aload 1
      // 2c0f: instanceof net/minecraft/server/level/ServerLevel
      // 2c12: ifeq 2c4a
      // 2c15: aload 1
      // 2c16: checkcast net/minecraft/server/level/ServerLevel
      // 2c19: astore 15
      // 2c1b: new net/minecraft/world/entity/item/ItemEntity
      // 2c1e: dup
      // 2c1f: aload 15
      // 2c21: dload 2
      // 2c22: dload 4
      // 2c24: dload 6
      // 2c26: new net/minecraft/world/item/ItemStack
      // 2c29: dup
      // 2c2a: getstatic net/mocreatures/init/MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 2c2d: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 2c30: checkcast net/minecraft/world/level/ItemLike
      // 2c33: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 2c36: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 2c39: astore 16
      // 2c3b: aload 16
      // 2c3d: bipush 10
      // 2c3f: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 2c42: aload 15
      // 2c44: aload 16
      // 2c46: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 2c49: pop
      // 2c4a: aload 8
      // 2c4c: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 2c4f: ifeq 2c68
      // 2c52: aload 8
      // 2c54: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 2c57: astore 15
      // 2c59: aload 15
      // 2c5b: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2c5e: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Cave_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2c61: bipush 0
      // 2c62: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2c65: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 2c68: aload 8
      // 2c6a: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 2c6d: ifeq 2c8f
      // 2c70: aload 8
      // 2c72: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 2c75: astore 14
      // 2c77: aload 14
      // 2c79: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2c7c: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Nether_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2c7f: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2c82: checkcast java/lang/Boolean
      // 2c85: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2c88: ifeq 2c8f
      // 2c8b: bipush 1
      // 2c8c: goto 2c90
      // 2c8f: bipush 0
      // 2c90: bipush 1
      // 2c91: if_icmpne 2cee
      // 2c94: aload 1
      // 2c95: instanceof net/minecraft/server/level/ServerLevel
      // 2c98: ifeq 2cd0
      // 2c9b: aload 1
      // 2c9c: checkcast net/minecraft/server/level/ServerLevel
      // 2c9f: astore 15
      // 2ca1: new net/minecraft/world/entity/item/ItemEntity
      // 2ca4: dup
      // 2ca5: aload 15
      // 2ca7: dload 2
      // 2ca8: dload 4
      // 2caa: dload 6
      // 2cac: new net/minecraft/world/item/ItemStack
      // 2caf: dup
      // 2cb0: getstatic net/mocreatures/init/MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 2cb3: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 2cb6: checkcast net/minecraft/world/level/ItemLike
      // 2cb9: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 2cbc: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 2cbf: astore 16
      // 2cc1: aload 16
      // 2cc3: bipush 10
      // 2cc5: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 2cc8: aload 15
      // 2cca: aload 16
      // 2ccc: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 2ccf: pop
      // 2cd0: aload 8
      // 2cd2: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 2cd5: ifeq 2cee
      // 2cd8: aload 8
      // 2cda: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 2cdd: astore 15
      // 2cdf: aload 15
      // 2ce1: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2ce4: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Nether_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2ce7: bipush 0
      // 2ce8: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2ceb: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 2cee: aload 8
      // 2cf0: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 2cf3: ifeq 2d15
      // 2cf6: aload 8
      // 2cf8: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 2cfb: astore 14
      // 2cfd: aload 14
      // 2cff: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2d02: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Undead_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2d05: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2d08: checkcast java/lang/Boolean
      // 2d0b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2d0e: ifeq 2d15
      // 2d11: bipush 1
      // 2d12: goto 2d16
      // 2d15: bipush 0
      // 2d16: bipush 1
      // 2d17: if_icmpne 2d74
      // 2d1a: aload 1
      // 2d1b: instanceof net/minecraft/server/level/ServerLevel
      // 2d1e: ifeq 2d56
      // 2d21: aload 1
      // 2d22: checkcast net/minecraft/server/level/ServerLevel
      // 2d25: astore 15
      // 2d27: new net/minecraft/world/entity/item/ItemEntity
      // 2d2a: dup
      // 2d2b: aload 15
      // 2d2d: dload 2
      // 2d2e: dload 4
      // 2d30: dload 6
      // 2d32: new net/minecraft/world/item/ItemStack
      // 2d35: dup
      // 2d36: getstatic net/mocreatures/init/MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 2d39: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 2d3c: checkcast net/minecraft/world/level/ItemLike
      // 2d3f: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 2d42: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 2d45: astore 16
      // 2d47: aload 16
      // 2d49: bipush 10
      // 2d4b: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 2d4e: aload 15
      // 2d50: aload 16
      // 2d52: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 2d55: pop
      // 2d56: aload 8
      // 2d58: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 2d5b: ifeq 2d74
      // 2d5e: aload 8
      // 2d60: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 2d63: astore 15
      // 2d65: aload 15
      // 2d67: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2d6a: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Undead_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2d6d: bipush 0
      // 2d6e: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2d71: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 2d74: aload 8
      // 2d76: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 2d79: ifeq 2d9b
      // 2d7c: aload 8
      // 2d7e: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 2d81: astore 14
      // 2d83: aload 14
      // 2d85: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2d88: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Netherite_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2d8b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2d8e: checkcast java/lang/Boolean
      // 2d91: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2d94: ifeq 2d9b
      // 2d97: bipush 1
      // 2d98: goto 2d9c
      // 2d9b: bipush 0
      // 2d9c: bipush 1
      // 2d9d: if_icmpne 2df4
      // 2da0: aload 1
      // 2da1: instanceof net/minecraft/server/level/ServerLevel
      // 2da4: ifeq 2dd6
      // 2da7: aload 1
      // 2da8: checkcast net/minecraft/server/level/ServerLevel
      // 2dab: astore 15
      // 2dad: new net/minecraft/world/entity/item/ItemEntity
      // 2db0: dup
      // 2db1: aload 15
      // 2db3: dload 2
      // 2db4: dload 4
      // 2db6: dload 6
      // 2db8: new net/minecraft/world/item/ItemStack
      // 2dbb: dup
      // 2dbc: getstatic net/minecraft/world/item/Items.NETHERITE_HELMET Lnet/minecraft/world/item/Item;
      // 2dbf: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 2dc2: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 2dc5: astore 16
      // 2dc7: aload 16
      // 2dc9: bipush 10
      // 2dcb: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 2dce: aload 15
      // 2dd0: aload 16
      // 2dd2: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 2dd5: pop
      // 2dd6: aload 8
      // 2dd8: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 2ddb: ifeq 2df4
      // 2dde: aload 8
      // 2de0: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 2de3: astore 15
      // 2de5: aload 15
      // 2de7: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2dea: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Netherite_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2ded: bipush 0
      // 2dee: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2df1: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 2df4: aload 8
      // 2df6: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 2df9: ifeq 2e1b
      // 2dfc: aload 8
      // 2dfe: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 2e01: astore 11
      // 2e03: aload 11
      // 2e05: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2e08: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Leather_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2e0b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2e0e: checkcast java/lang/Boolean
      // 2e11: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2e14: ifeq 2e1b
      // 2e17: bipush 1
      // 2e18: goto 2e1c
      // 2e1b: bipush 0
      // 2e1c: ifne 3540
      // 2e1f: aload 9
      // 2e21: instanceof net/minecraft/world/entity/LivingEntity
      // 2e24: ifeq 2e36
      // 2e27: aload 9
      // 2e29: checkcast net/minecraft/world/entity/LivingEntity
      // 2e2c: astore 12
      // 2e2e: aload 12
      // 2e30: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 2e33: goto 2e39
      // 2e36: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 2e39: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 2e3c: getstatic net/minecraft/world/item/Items.LEATHER_HELMET Lnet/minecraft/world/item/Item;
      // 2e3f: if_acmpne 3540
      // 2e42: aload 9
      // 2e44: instanceof net/minecraft/world/entity/player/Player
      // 2e47: ifeq 2e76
      // 2e4a: aload 9
      // 2e4c: checkcast net/minecraft/world/entity/player/Player
      // 2e4f: astore 13
      // 2e51: new net/minecraft/world/item/ItemStack
      // 2e54: dup
      // 2e55: getstatic net/minecraft/world/item/Items.LEATHER_HELMET Lnet/minecraft/world/item/Item;
      // 2e58: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 2e5b: astore 14
      // 2e5d: aload 13
      // 2e5f: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 2e62: aload 14
      // 2e64: invokedynamic test (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, net/mocreatures/procedures/UnihornedOstrichEquipment1Procedure.lambda$execute$8 (Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z, (Lnet/minecraft/world/item/ItemStack;)Z ]
      // 2e69: bipush 1
      // 2e6a: aload 13
      // 2e6c: getfield net/minecraft/world/entity/player/Player.inventoryMenu Lnet/minecraft/world/inventory/InventoryMenu;
      // 2e6f: invokevirtual net/minecraft/world/inventory/InventoryMenu.getCraftSlots ()Lnet/minecraft/world/inventory/CraftingContainer;
      // 2e72: invokevirtual net/minecraft/world/entity/player/Inventory.clearOrCountMatchingItems (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
      // 2e75: pop
      // 2e76: aload 8
      // 2e78: astore 13
      // 2e7a: aload 13
      // 2e7c: instanceof net/minecraft/world/entity/player/Player
      // 2e7f: ifeq 2eab
      // 2e82: aload 13
      // 2e84: checkcast net/minecraft/world/entity/player/Player
      // 2e87: astore 14
      // 2e89: aload 14
      // 2e8b: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 2e8e: getfield net/minecraft/world/entity/player/Inventory.armor Lnet/minecraft/core/NonNullList;
      // 2e91: bipush 0
      // 2e92: new net/minecraft/world/item/ItemStack
      // 2e95: dup
      // 2e96: getstatic net/minecraft/world/item/Items.LEATHER_HELMET Lnet/minecraft/world/item/Item;
      // 2e99: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 2e9c: invokevirtual net/minecraft/core/NonNullList.set (ILjava/lang/Object;)Ljava/lang/Object;
      // 2e9f: pop
      // 2ea0: aload 14
      // 2ea2: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 2ea5: invokevirtual net/minecraft/world/entity/player/Inventory.setChanged ()V
      // 2ea8: goto 2ecc
      // 2eab: aload 13
      // 2ead: instanceof net/minecraft/world/entity/LivingEntity
      // 2eb0: ifeq 2ecc
      // 2eb3: aload 13
      // 2eb5: checkcast net/minecraft/world/entity/LivingEntity
      // 2eb8: astore 15
      // 2eba: aload 15
      // 2ebc: getstatic net/minecraft/world/entity/EquipmentSlot.FEET Lnet/minecraft/world/entity/EquipmentSlot;
      // 2ebf: new net/minecraft/world/item/ItemStack
      // 2ec2: dup
      // 2ec3: getstatic net/minecraft/world/item/Items.LEATHER_HELMET Lnet/minecraft/world/item/Item;
      // 2ec6: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 2ec9: invokevirtual net/minecraft/world/entity/LivingEntity.setItemSlot (Lnet/minecraft/world/entity/EquipmentSlot;Lnet/minecraft/world/item/ItemStack;)V
      // 2ecc: aload 8
      // 2ece: instanceof net/minecraft/world/entity/LivingEntity
      // 2ed1: ifeq 2ee6
      // 2ed4: aload 8
      // 2ed6: checkcast net/minecraft/world/entity/LivingEntity
      // 2ed9: astore 13
      // 2edb: aload 13
      // 2edd: getstatic net/minecraft/world/entity/EquipmentSlot.FEET Lnet/minecraft/world/entity/EquipmentSlot;
      // 2ee0: invokevirtual net/minecraft/world/entity/LivingEntity.getItemBySlot (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
      // 2ee3: goto 2ee9
      // 2ee6: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 2ee9: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 2eec: getstatic net/minecraft/world/item/Items.LEATHER_HELMET Lnet/minecraft/world/item/Item;
      // 2eef: if_acmpne 3540
      // 2ef2: aload 8
      // 2ef4: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 2ef7: ifeq 2f10
      // 2efa: aload 8
      // 2efc: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 2eff: astore 14
      // 2f01: aload 14
      // 2f03: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2f06: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Leather_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2f09: bipush 1
      // 2f0a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2f0d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 2f10: aload 8
      // 2f12: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 2f15: ifeq 2f37
      // 2f18: aload 8
      // 2f1a: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 2f1d: astore 14
      // 2f1f: aload 14
      // 2f21: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2f24: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Gold_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2f27: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2f2a: checkcast java/lang/Boolean
      // 2f2d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2f30: ifeq 2f37
      // 2f33: bipush 1
      // 2f34: goto 2f38
      // 2f37: bipush 0
      // 2f38: bipush 1
      // 2f39: if_icmpne 2f90
      // 2f3c: aload 1
      // 2f3d: instanceof net/minecraft/server/level/ServerLevel
      // 2f40: ifeq 2f72
      // 2f43: aload 1
      // 2f44: checkcast net/minecraft/server/level/ServerLevel
      // 2f47: astore 15
      // 2f49: new net/minecraft/world/entity/item/ItemEntity
      // 2f4c: dup
      // 2f4d: aload 15
      // 2f4f: dload 2
      // 2f50: dload 4
      // 2f52: dload 6
      // 2f54: new net/minecraft/world/item/ItemStack
      // 2f57: dup
      // 2f58: getstatic net/minecraft/world/item/Items.GOLDEN_HELMET Lnet/minecraft/world/item/Item;
      // 2f5b: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 2f5e: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 2f61: astore 16
      // 2f63: aload 16
      // 2f65: bipush 10
      // 2f67: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 2f6a: aload 15
      // 2f6c: aload 16
      // 2f6e: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 2f71: pop
      // 2f72: aload 8
      // 2f74: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 2f77: ifeq 2f90
      // 2f7a: aload 8
      // 2f7c: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 2f7f: astore 15
      // 2f81: aload 15
      // 2f83: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2f86: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Gold_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2f89: bipush 0
      // 2f8a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2f8d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 2f90: aload 8
      // 2f92: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 2f95: ifeq 2fb7
      // 2f98: aload 8
      // 2f9a: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 2f9d: astore 14
      // 2f9f: aload 14
      // 2fa1: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2fa4: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Diamond_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2fa7: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2faa: checkcast java/lang/Boolean
      // 2fad: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2fb0: ifeq 2fb7
      // 2fb3: bipush 1
      // 2fb4: goto 2fb8
      // 2fb7: bipush 0
      // 2fb8: bipush 1
      // 2fb9: if_icmpne 3010
      // 2fbc: aload 1
      // 2fbd: instanceof net/minecraft/server/level/ServerLevel
      // 2fc0: ifeq 2ff2
      // 2fc3: aload 1
      // 2fc4: checkcast net/minecraft/server/level/ServerLevel
      // 2fc7: astore 15
      // 2fc9: new net/minecraft/world/entity/item/ItemEntity
      // 2fcc: dup
      // 2fcd: aload 15
      // 2fcf: dload 2
      // 2fd0: dload 4
      // 2fd2: dload 6
      // 2fd4: new net/minecraft/world/item/ItemStack
      // 2fd7: dup
      // 2fd8: getstatic net/minecraft/world/item/Items.DIAMOND_HELMET Lnet/minecraft/world/item/Item;
      // 2fdb: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 2fde: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 2fe1: astore 16
      // 2fe3: aload 16
      // 2fe5: bipush 10
      // 2fe7: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 2fea: aload 15
      // 2fec: aload 16
      // 2fee: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 2ff1: pop
      // 2ff2: aload 8
      // 2ff4: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 2ff7: ifeq 3010
      // 2ffa: aload 8
      // 2ffc: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 2fff: astore 15
      // 3001: aload 15
      // 3003: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3006: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Diamond_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3009: bipush 0
      // 300a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 300d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 3010: aload 8
      // 3012: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 3015: ifeq 3037
      // 3018: aload 8
      // 301a: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 301d: astore 14
      // 301f: aload 14
      // 3021: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3024: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Iron_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3027: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 302a: checkcast java/lang/Boolean
      // 302d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3030: ifeq 3037
      // 3033: bipush 1
      // 3034: goto 3038
      // 3037: bipush 0
      // 3038: bipush 1
      // 3039: if_icmpne 3090
      // 303c: aload 1
      // 303d: instanceof net/minecraft/server/level/ServerLevel
      // 3040: ifeq 3072
      // 3043: aload 1
      // 3044: checkcast net/minecraft/server/level/ServerLevel
      // 3047: astore 15
      // 3049: new net/minecraft/world/entity/item/ItemEntity
      // 304c: dup
      // 304d: aload 15
      // 304f: dload 2
      // 3050: dload 4
      // 3052: dload 6
      // 3054: new net/minecraft/world/item/ItemStack
      // 3057: dup
      // 3058: getstatic net/minecraft/world/item/Items.IRON_HELMET Lnet/minecraft/world/item/Item;
      // 305b: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 305e: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3061: astore 16
      // 3063: aload 16
      // 3065: bipush 10
      // 3067: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 306a: aload 15
      // 306c: aload 16
      // 306e: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3071: pop
      // 3072: aload 8
      // 3074: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 3077: ifeq 3090
      // 307a: aload 8
      // 307c: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 307f: astore 15
      // 3081: aload 15
      // 3083: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3086: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Iron_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3089: bipush 0
      // 308a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 308d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 3090: aload 8
      // 3092: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 3095: ifeq 30b7
      // 3098: aload 8
      // 309a: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 309d: astore 14
      // 309f: aload 14
      // 30a1: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 30a4: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Fur_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 30a7: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 30aa: checkcast java/lang/Boolean
      // 30ad: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 30b0: ifeq 30b7
      // 30b3: bipush 1
      // 30b4: goto 30b8
      // 30b7: bipush 0
      // 30b8: bipush 1
      // 30b9: if_icmpne 3116
      // 30bc: aload 1
      // 30bd: instanceof net/minecraft/server/level/ServerLevel
      // 30c0: ifeq 30f8
      // 30c3: aload 1
      // 30c4: checkcast net/minecraft/server/level/ServerLevel
      // 30c7: astore 15
      // 30c9: new net/minecraft/world/entity/item/ItemEntity
      // 30cc: dup
      // 30cd: aload 15
      // 30cf: dload 2
      // 30d0: dload 4
      // 30d2: dload 6
      // 30d4: new net/minecraft/world/item/ItemStack
      // 30d7: dup
      // 30d8: getstatic net/mocreatures/init/MocreaturesModItems.FUR_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 30db: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 30de: checkcast net/minecraft/world/level/ItemLike
      // 30e1: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 30e4: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 30e7: astore 16
      // 30e9: aload 16
      // 30eb: bipush 10
      // 30ed: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 30f0: aload 15
      // 30f2: aload 16
      // 30f4: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 30f7: pop
      // 30f8: aload 8
      // 30fa: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 30fd: ifeq 3116
      // 3100: aload 8
      // 3102: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 3105: astore 15
      // 3107: aload 15
      // 3109: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 310c: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Fur_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 310f: bipush 0
      // 3110: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3113: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 3116: aload 8
      // 3118: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 311b: ifeq 313d
      // 311e: aload 8
      // 3120: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 3123: astore 14
      // 3125: aload 14
      // 3127: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 312a: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Reptile_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 312d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 3130: checkcast java/lang/Boolean
      // 3133: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3136: ifeq 313d
      // 3139: bipush 1
      // 313a: goto 313e
      // 313d: bipush 0
      // 313e: bipush 1
      // 313f: if_icmpne 319c
      // 3142: aload 1
      // 3143: instanceof net/minecraft/server/level/ServerLevel
      // 3146: ifeq 317e
      // 3149: aload 1
      // 314a: checkcast net/minecraft/server/level/ServerLevel
      // 314d: astore 15
      // 314f: new net/minecraft/world/entity/item/ItemEntity
      // 3152: dup
      // 3153: aload 15
      // 3155: dload 2
      // 3156: dload 4
      // 3158: dload 6
      // 315a: new net/minecraft/world/item/ItemStack
      // 315d: dup
      // 315e: getstatic net/mocreatures/init/MocreaturesModItems.REPTILE_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 3161: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 3164: checkcast net/minecraft/world/level/ItemLike
      // 3167: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 316a: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 316d: astore 16
      // 316f: aload 16
      // 3171: bipush 10
      // 3173: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3176: aload 15
      // 3178: aload 16
      // 317a: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 317d: pop
      // 317e: aload 8
      // 3180: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 3183: ifeq 319c
      // 3186: aload 8
      // 3188: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 318b: astore 15
      // 318d: aload 15
      // 318f: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3192: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Reptile_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3195: bipush 0
      // 3196: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3199: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 319c: aload 8
      // 319e: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 31a1: ifeq 31c3
      // 31a4: aload 8
      // 31a6: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 31a9: astore 14
      // 31ab: aload 14
      // 31ad: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 31b0: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Hide_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 31b3: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 31b6: checkcast java/lang/Boolean
      // 31b9: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 31bc: ifeq 31c3
      // 31bf: bipush 1
      // 31c0: goto 31c4
      // 31c3: bipush 0
      // 31c4: bipush 1
      // 31c5: if_icmpne 3222
      // 31c8: aload 1
      // 31c9: instanceof net/minecraft/server/level/ServerLevel
      // 31cc: ifeq 3204
      // 31cf: aload 1
      // 31d0: checkcast net/minecraft/server/level/ServerLevel
      // 31d3: astore 15
      // 31d5: new net/minecraft/world/entity/item/ItemEntity
      // 31d8: dup
      // 31d9: aload 15
      // 31db: dload 2
      // 31dc: dload 4
      // 31de: dload 6
      // 31e0: new net/minecraft/world/item/ItemStack
      // 31e3: dup
      // 31e4: getstatic net/mocreatures/init/MocreaturesModItems.HIDE_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 31e7: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 31ea: checkcast net/minecraft/world/level/ItemLike
      // 31ed: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 31f0: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 31f3: astore 16
      // 31f5: aload 16
      // 31f7: bipush 10
      // 31f9: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 31fc: aload 15
      // 31fe: aload 16
      // 3200: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3203: pop
      // 3204: aload 8
      // 3206: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 3209: ifeq 3222
      // 320c: aload 8
      // 320e: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 3211: astore 15
      // 3213: aload 15
      // 3215: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3218: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Hide_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 321b: bipush 0
      // 321c: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 321f: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 3222: aload 8
      // 3224: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 3227: ifeq 3249
      // 322a: aload 8
      // 322c: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 322f: astore 14
      // 3231: aload 14
      // 3233: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3236: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Frost_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3239: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 323c: checkcast java/lang/Boolean
      // 323f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3242: ifeq 3249
      // 3245: bipush 1
      // 3246: goto 324a
      // 3249: bipush 0
      // 324a: bipush 1
      // 324b: if_icmpne 32a8
      // 324e: aload 1
      // 324f: instanceof net/minecraft/server/level/ServerLevel
      // 3252: ifeq 328a
      // 3255: aload 1
      // 3256: checkcast net/minecraft/server/level/ServerLevel
      // 3259: astore 15
      // 325b: new net/minecraft/world/entity/item/ItemEntity
      // 325e: dup
      // 325f: aload 15
      // 3261: dload 2
      // 3262: dload 4
      // 3264: dload 6
      // 3266: new net/minecraft/world/item/ItemStack
      // 3269: dup
      // 326a: getstatic net/mocreatures/init/MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 326d: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 3270: checkcast net/minecraft/world/level/ItemLike
      // 3273: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 3276: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3279: astore 16
      // 327b: aload 16
      // 327d: bipush 10
      // 327f: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3282: aload 15
      // 3284: aload 16
      // 3286: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3289: pop
      // 328a: aload 8
      // 328c: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 328f: ifeq 32a8
      // 3292: aload 8
      // 3294: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 3297: astore 15
      // 3299: aload 15
      // 329b: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 329e: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Frost_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 32a1: bipush 0
      // 32a2: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 32a5: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 32a8: aload 8
      // 32aa: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 32ad: ifeq 32cf
      // 32b0: aload 8
      // 32b2: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 32b5: astore 14
      // 32b7: aload 14
      // 32b9: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 32bc: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Dirt_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 32bf: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 32c2: checkcast java/lang/Boolean
      // 32c5: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 32c8: ifeq 32cf
      // 32cb: bipush 1
      // 32cc: goto 32d0
      // 32cf: bipush 0
      // 32d0: bipush 1
      // 32d1: if_icmpne 332e
      // 32d4: aload 1
      // 32d5: instanceof net/minecraft/server/level/ServerLevel
      // 32d8: ifeq 3310
      // 32db: aload 1
      // 32dc: checkcast net/minecraft/server/level/ServerLevel
      // 32df: astore 15
      // 32e1: new net/minecraft/world/entity/item/ItemEntity
      // 32e4: dup
      // 32e5: aload 15
      // 32e7: dload 2
      // 32e8: dload 4
      // 32ea: dload 6
      // 32ec: new net/minecraft/world/item/ItemStack
      // 32ef: dup
      // 32f0: getstatic net/mocreatures/init/MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 32f3: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 32f6: checkcast net/minecraft/world/level/ItemLike
      // 32f9: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 32fc: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 32ff: astore 16
      // 3301: aload 16
      // 3303: bipush 10
      // 3305: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3308: aload 15
      // 330a: aload 16
      // 330c: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 330f: pop
      // 3310: aload 8
      // 3312: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 3315: ifeq 332e
      // 3318: aload 8
      // 331a: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 331d: astore 15
      // 331f: aload 15
      // 3321: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3324: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Dirt_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3327: bipush 0
      // 3328: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 332b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 332e: aload 8
      // 3330: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 3333: ifeq 3355
      // 3336: aload 8
      // 3338: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 333b: astore 14
      // 333d: aload 14
      // 333f: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3342: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Cave_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3345: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 3348: checkcast java/lang/Boolean
      // 334b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 334e: ifeq 3355
      // 3351: bipush 1
      // 3352: goto 3356
      // 3355: bipush 0
      // 3356: bipush 1
      // 3357: if_icmpne 33b4
      // 335a: aload 1
      // 335b: instanceof net/minecraft/server/level/ServerLevel
      // 335e: ifeq 3396
      // 3361: aload 1
      // 3362: checkcast net/minecraft/server/level/ServerLevel
      // 3365: astore 15
      // 3367: new net/minecraft/world/entity/item/ItemEntity
      // 336a: dup
      // 336b: aload 15
      // 336d: dload 2
      // 336e: dload 4
      // 3370: dload 6
      // 3372: new net/minecraft/world/item/ItemStack
      // 3375: dup
      // 3376: getstatic net/mocreatures/init/MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 3379: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 337c: checkcast net/minecraft/world/level/ItemLike
      // 337f: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 3382: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3385: astore 16
      // 3387: aload 16
      // 3389: bipush 10
      // 338b: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 338e: aload 15
      // 3390: aload 16
      // 3392: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3395: pop
      // 3396: aload 8
      // 3398: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 339b: ifeq 33b4
      // 339e: aload 8
      // 33a0: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 33a3: astore 15
      // 33a5: aload 15
      // 33a7: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 33aa: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Cave_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 33ad: bipush 0
      // 33ae: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 33b1: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 33b4: aload 8
      // 33b6: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 33b9: ifeq 33db
      // 33bc: aload 8
      // 33be: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 33c1: astore 14
      // 33c3: aload 14
      // 33c5: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 33c8: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Nether_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 33cb: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 33ce: checkcast java/lang/Boolean
      // 33d1: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 33d4: ifeq 33db
      // 33d7: bipush 1
      // 33d8: goto 33dc
      // 33db: bipush 0
      // 33dc: bipush 1
      // 33dd: if_icmpne 343a
      // 33e0: aload 1
      // 33e1: instanceof net/minecraft/server/level/ServerLevel
      // 33e4: ifeq 341c
      // 33e7: aload 1
      // 33e8: checkcast net/minecraft/server/level/ServerLevel
      // 33eb: astore 15
      // 33ed: new net/minecraft/world/entity/item/ItemEntity
      // 33f0: dup
      // 33f1: aload 15
      // 33f3: dload 2
      // 33f4: dload 4
      // 33f6: dload 6
      // 33f8: new net/minecraft/world/item/ItemStack
      // 33fb: dup
      // 33fc: getstatic net/mocreatures/init/MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 33ff: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 3402: checkcast net/minecraft/world/level/ItemLike
      // 3405: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 3408: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 340b: astore 16
      // 340d: aload 16
      // 340f: bipush 10
      // 3411: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3414: aload 15
      // 3416: aload 16
      // 3418: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 341b: pop
      // 341c: aload 8
      // 341e: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 3421: ifeq 343a
      // 3424: aload 8
      // 3426: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 3429: astore 15
      // 342b: aload 15
      // 342d: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3430: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Nether_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3433: bipush 0
      // 3434: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3437: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 343a: aload 8
      // 343c: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 343f: ifeq 3461
      // 3442: aload 8
      // 3444: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 3447: astore 14
      // 3449: aload 14
      // 344b: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 344e: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Undead_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3451: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 3454: checkcast java/lang/Boolean
      // 3457: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 345a: ifeq 3461
      // 345d: bipush 1
      // 345e: goto 3462
      // 3461: bipush 0
      // 3462: bipush 1
      // 3463: if_icmpne 34c0
      // 3466: aload 1
      // 3467: instanceof net/minecraft/server/level/ServerLevel
      // 346a: ifeq 34a2
      // 346d: aload 1
      // 346e: checkcast net/minecraft/server/level/ServerLevel
      // 3471: astore 15
      // 3473: new net/minecraft/world/entity/item/ItemEntity
      // 3476: dup
      // 3477: aload 15
      // 3479: dload 2
      // 347a: dload 4
      // 347c: dload 6
      // 347e: new net/minecraft/world/item/ItemStack
      // 3481: dup
      // 3482: getstatic net/mocreatures/init/MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 3485: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 3488: checkcast net/minecraft/world/level/ItemLike
      // 348b: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 348e: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3491: astore 16
      // 3493: aload 16
      // 3495: bipush 10
      // 3497: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 349a: aload 15
      // 349c: aload 16
      // 349e: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 34a1: pop
      // 34a2: aload 8
      // 34a4: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 34a7: ifeq 34c0
      // 34aa: aload 8
      // 34ac: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 34af: astore 15
      // 34b1: aload 15
      // 34b3: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 34b6: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Undead_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 34b9: bipush 0
      // 34ba: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 34bd: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 34c0: aload 8
      // 34c2: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 34c5: ifeq 34e7
      // 34c8: aload 8
      // 34ca: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 34cd: astore 14
      // 34cf: aload 14
      // 34d1: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 34d4: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Netherite_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 34d7: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 34da: checkcast java/lang/Boolean
      // 34dd: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 34e0: ifeq 34e7
      // 34e3: bipush 1
      // 34e4: goto 34e8
      // 34e7: bipush 0
      // 34e8: bipush 1
      // 34e9: if_icmpne 3540
      // 34ec: aload 1
      // 34ed: instanceof net/minecraft/server/level/ServerLevel
      // 34f0: ifeq 3522
      // 34f3: aload 1
      // 34f4: checkcast net/minecraft/server/level/ServerLevel
      // 34f7: astore 15
      // 34f9: new net/minecraft/world/entity/item/ItemEntity
      // 34fc: dup
      // 34fd: aload 15
      // 34ff: dload 2
      // 3500: dload 4
      // 3502: dload 6
      // 3504: new net/minecraft/world/item/ItemStack
      // 3507: dup
      // 3508: getstatic net/minecraft/world/item/Items.NETHERITE_HELMET Lnet/minecraft/world/item/Item;
      // 350b: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 350e: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3511: astore 16
      // 3513: aload 16
      // 3515: bipush 10
      // 3517: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 351a: aload 15
      // 351c: aload 16
      // 351e: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3521: pop
      // 3522: aload 8
      // 3524: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 3527: ifeq 3540
      // 352a: aload 8
      // 352c: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 352f: astore 15
      // 3531: aload 15
      // 3533: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3536: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Netherite_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3539: bipush 0
      // 353a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 353d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 3540: aload 8
      // 3542: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 3545: ifeq 3567
      // 3548: aload 8
      // 354a: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 354d: astore 11
      // 354f: aload 11
      // 3551: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3554: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Frost_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3557: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 355a: checkcast java/lang/Boolean
      // 355d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3560: ifeq 3567
      // 3563: bipush 1
      // 3564: goto 3568
      // 3567: bipush 0
      // 3568: ifne 3c9e
      // 356b: aload 9
      // 356d: instanceof net/minecraft/world/entity/LivingEntity
      // 3570: ifeq 3582
      // 3573: aload 9
      // 3575: checkcast net/minecraft/world/entity/LivingEntity
      // 3578: astore 12
      // 357a: aload 12
      // 357c: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 357f: goto 3585
      // 3582: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 3585: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 3588: getstatic net/mocreatures/init/MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 358b: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 358e: if_acmpne 3c9e
      // 3591: aload 9
      // 3593: instanceof net/minecraft/world/entity/player/Player
      // 3596: ifeq 35cb
      // 3599: aload 9
      // 359b: checkcast net/minecraft/world/entity/player/Player
      // 359e: astore 13
      // 35a0: new net/minecraft/world/item/ItemStack
      // 35a3: dup
      // 35a4: getstatic net/mocreatures/init/MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 35a7: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 35aa: checkcast net/minecraft/world/level/ItemLike
      // 35ad: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 35b0: astore 14
      // 35b2: aload 13
      // 35b4: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 35b7: aload 14
      // 35b9: invokedynamic test (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, net/mocreatures/procedures/UnihornedOstrichEquipment1Procedure.lambda$execute$9 (Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z, (Lnet/minecraft/world/item/ItemStack;)Z ]
      // 35be: bipush 1
      // 35bf: aload 13
      // 35c1: getfield net/minecraft/world/entity/player/Player.inventoryMenu Lnet/minecraft/world/inventory/InventoryMenu;
      // 35c4: invokevirtual net/minecraft/world/inventory/InventoryMenu.getCraftSlots ()Lnet/minecraft/world/inventory/CraftingContainer;
      // 35c7: invokevirtual net/minecraft/world/entity/player/Inventory.clearOrCountMatchingItems (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
      // 35ca: pop
      // 35cb: aload 8
      // 35cd: astore 13
      // 35cf: aload 13
      // 35d1: instanceof net/minecraft/world/entity/player/Player
      // 35d4: ifeq 3606
      // 35d7: aload 13
      // 35d9: checkcast net/minecraft/world/entity/player/Player
      // 35dc: astore 14
      // 35de: aload 14
      // 35e0: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 35e3: getfield net/minecraft/world/entity/player/Inventory.armor Lnet/minecraft/core/NonNullList;
      // 35e6: bipush 0
      // 35e7: new net/minecraft/world/item/ItemStack
      // 35ea: dup
      // 35eb: getstatic net/mocreatures/init/MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 35ee: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 35f1: checkcast net/minecraft/world/level/ItemLike
      // 35f4: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 35f7: invokevirtual net/minecraft/core/NonNullList.set (ILjava/lang/Object;)Ljava/lang/Object;
      // 35fa: pop
      // 35fb: aload 14
      // 35fd: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 3600: invokevirtual net/minecraft/world/entity/player/Inventory.setChanged ()V
      // 3603: goto 362d
      // 3606: aload 13
      // 3608: instanceof net/minecraft/world/entity/LivingEntity
      // 360b: ifeq 362d
      // 360e: aload 13
      // 3610: checkcast net/minecraft/world/entity/LivingEntity
      // 3613: astore 15
      // 3615: aload 15
      // 3617: getstatic net/minecraft/world/entity/EquipmentSlot.FEET Lnet/minecraft/world/entity/EquipmentSlot;
      // 361a: new net/minecraft/world/item/ItemStack
      // 361d: dup
      // 361e: getstatic net/mocreatures/init/MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 3621: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 3624: checkcast net/minecraft/world/level/ItemLike
      // 3627: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 362a: invokevirtual net/minecraft/world/entity/LivingEntity.setItemSlot (Lnet/minecraft/world/entity/EquipmentSlot;Lnet/minecraft/world/item/ItemStack;)V
      // 362d: aload 8
      // 362f: instanceof net/minecraft/world/entity/LivingEntity
      // 3632: ifeq 3647
      // 3635: aload 8
      // 3637: checkcast net/minecraft/world/entity/LivingEntity
      // 363a: astore 13
      // 363c: aload 13
      // 363e: getstatic net/minecraft/world/entity/EquipmentSlot.FEET Lnet/minecraft/world/entity/EquipmentSlot;
      // 3641: invokevirtual net/minecraft/world/entity/LivingEntity.getItemBySlot (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
      // 3644: goto 364a
      // 3647: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 364a: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 364d: getstatic net/mocreatures/init/MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 3650: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 3653: if_acmpne 3c9e
      // 3656: aload 8
      // 3658: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 365b: ifeq 3674
      // 365e: aload 8
      // 3660: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 3663: astore 14
      // 3665: aload 14
      // 3667: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 366a: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Frost_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 366d: bipush 1
      // 366e: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3671: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 3674: aload 8
      // 3676: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 3679: ifeq 369b
      // 367c: aload 8
      // 367e: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 3681: astore 14
      // 3683: aload 14
      // 3685: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3688: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Gold_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 368b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 368e: checkcast java/lang/Boolean
      // 3691: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3694: ifeq 369b
      // 3697: bipush 1
      // 3698: goto 369c
      // 369b: bipush 0
      // 369c: bipush 1
      // 369d: if_icmpne 36f4
      // 36a0: aload 1
      // 36a1: instanceof net/minecraft/server/level/ServerLevel
      // 36a4: ifeq 36d6
      // 36a7: aload 1
      // 36a8: checkcast net/minecraft/server/level/ServerLevel
      // 36ab: astore 15
      // 36ad: new net/minecraft/world/entity/item/ItemEntity
      // 36b0: dup
      // 36b1: aload 15
      // 36b3: dload 2
      // 36b4: dload 4
      // 36b6: dload 6
      // 36b8: new net/minecraft/world/item/ItemStack
      // 36bb: dup
      // 36bc: getstatic net/minecraft/world/item/Items.GOLDEN_HELMET Lnet/minecraft/world/item/Item;
      // 36bf: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 36c2: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 36c5: astore 16
      // 36c7: aload 16
      // 36c9: bipush 10
      // 36cb: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 36ce: aload 15
      // 36d0: aload 16
      // 36d2: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 36d5: pop
      // 36d6: aload 8
      // 36d8: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 36db: ifeq 36f4
      // 36de: aload 8
      // 36e0: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 36e3: astore 15
      // 36e5: aload 15
      // 36e7: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 36ea: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Gold_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 36ed: bipush 0
      // 36ee: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 36f1: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 36f4: aload 8
      // 36f6: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 36f9: ifeq 371b
      // 36fc: aload 8
      // 36fe: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 3701: astore 14
      // 3703: aload 14
      // 3705: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3708: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Diamond_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 370b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 370e: checkcast java/lang/Boolean
      // 3711: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3714: ifeq 371b
      // 3717: bipush 1
      // 3718: goto 371c
      // 371b: bipush 0
      // 371c: bipush 1
      // 371d: if_icmpne 3774
      // 3720: aload 1
      // 3721: instanceof net/minecraft/server/level/ServerLevel
      // 3724: ifeq 3756
      // 3727: aload 1
      // 3728: checkcast net/minecraft/server/level/ServerLevel
      // 372b: astore 15
      // 372d: new net/minecraft/world/entity/item/ItemEntity
      // 3730: dup
      // 3731: aload 15
      // 3733: dload 2
      // 3734: dload 4
      // 3736: dload 6
      // 3738: new net/minecraft/world/item/ItemStack
      // 373b: dup
      // 373c: getstatic net/minecraft/world/item/Items.DIAMOND_HELMET Lnet/minecraft/world/item/Item;
      // 373f: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 3742: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3745: astore 16
      // 3747: aload 16
      // 3749: bipush 10
      // 374b: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 374e: aload 15
      // 3750: aload 16
      // 3752: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3755: pop
      // 3756: aload 8
      // 3758: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 375b: ifeq 3774
      // 375e: aload 8
      // 3760: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 3763: astore 15
      // 3765: aload 15
      // 3767: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 376a: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Diamond_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 376d: bipush 0
      // 376e: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3771: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 3774: aload 8
      // 3776: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 3779: ifeq 379b
      // 377c: aload 8
      // 377e: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 3781: astore 14
      // 3783: aload 14
      // 3785: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3788: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Iron_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 378b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 378e: checkcast java/lang/Boolean
      // 3791: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3794: ifeq 379b
      // 3797: bipush 1
      // 3798: goto 379c
      // 379b: bipush 0
      // 379c: bipush 1
      // 379d: if_icmpne 37f4
      // 37a0: aload 1
      // 37a1: instanceof net/minecraft/server/level/ServerLevel
      // 37a4: ifeq 37d6
      // 37a7: aload 1
      // 37a8: checkcast net/minecraft/server/level/ServerLevel
      // 37ab: astore 15
      // 37ad: new net/minecraft/world/entity/item/ItemEntity
      // 37b0: dup
      // 37b1: aload 15
      // 37b3: dload 2
      // 37b4: dload 4
      // 37b6: dload 6
      // 37b8: new net/minecraft/world/item/ItemStack
      // 37bb: dup
      // 37bc: getstatic net/minecraft/world/item/Items.IRON_HELMET Lnet/minecraft/world/item/Item;
      // 37bf: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 37c2: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 37c5: astore 16
      // 37c7: aload 16
      // 37c9: bipush 10
      // 37cb: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 37ce: aload 15
      // 37d0: aload 16
      // 37d2: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 37d5: pop
      // 37d6: aload 8
      // 37d8: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 37db: ifeq 37f4
      // 37de: aload 8
      // 37e0: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 37e3: astore 15
      // 37e5: aload 15
      // 37e7: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 37ea: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Iron_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 37ed: bipush 0
      // 37ee: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 37f1: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 37f4: aload 8
      // 37f6: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 37f9: ifeq 381b
      // 37fc: aload 8
      // 37fe: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 3801: astore 14
      // 3803: aload 14
      // 3805: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3808: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Fur_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 380b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 380e: checkcast java/lang/Boolean
      // 3811: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3814: ifeq 381b
      // 3817: bipush 1
      // 3818: goto 381c
      // 381b: bipush 0
      // 381c: bipush 1
      // 381d: if_icmpne 387a
      // 3820: aload 1
      // 3821: instanceof net/minecraft/server/level/ServerLevel
      // 3824: ifeq 385c
      // 3827: aload 1
      // 3828: checkcast net/minecraft/server/level/ServerLevel
      // 382b: astore 15
      // 382d: new net/minecraft/world/entity/item/ItemEntity
      // 3830: dup
      // 3831: aload 15
      // 3833: dload 2
      // 3834: dload 4
      // 3836: dload 6
      // 3838: new net/minecraft/world/item/ItemStack
      // 383b: dup
      // 383c: getstatic net/mocreatures/init/MocreaturesModItems.FUR_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 383f: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 3842: checkcast net/minecraft/world/level/ItemLike
      // 3845: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 3848: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 384b: astore 16
      // 384d: aload 16
      // 384f: bipush 10
      // 3851: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3854: aload 15
      // 3856: aload 16
      // 3858: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 385b: pop
      // 385c: aload 8
      // 385e: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 3861: ifeq 387a
      // 3864: aload 8
      // 3866: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 3869: astore 15
      // 386b: aload 15
      // 386d: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3870: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Fur_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3873: bipush 0
      // 3874: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3877: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 387a: aload 8
      // 387c: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 387f: ifeq 38a1
      // 3882: aload 8
      // 3884: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 3887: astore 14
      // 3889: aload 14
      // 388b: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 388e: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Reptile_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3891: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 3894: checkcast java/lang/Boolean
      // 3897: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 389a: ifeq 38a1
      // 389d: bipush 1
      // 389e: goto 38a2
      // 38a1: bipush 0
      // 38a2: bipush 1
      // 38a3: if_icmpne 3900
      // 38a6: aload 1
      // 38a7: instanceof net/minecraft/server/level/ServerLevel
      // 38aa: ifeq 38e2
      // 38ad: aload 1
      // 38ae: checkcast net/minecraft/server/level/ServerLevel
      // 38b1: astore 15
      // 38b3: new net/minecraft/world/entity/item/ItemEntity
      // 38b6: dup
      // 38b7: aload 15
      // 38b9: dload 2
      // 38ba: dload 4
      // 38bc: dload 6
      // 38be: new net/minecraft/world/item/ItemStack
      // 38c1: dup
      // 38c2: getstatic net/mocreatures/init/MocreaturesModItems.REPTILE_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 38c5: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 38c8: checkcast net/minecraft/world/level/ItemLike
      // 38cb: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 38ce: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 38d1: astore 16
      // 38d3: aload 16
      // 38d5: bipush 10
      // 38d7: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 38da: aload 15
      // 38dc: aload 16
      // 38de: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 38e1: pop
      // 38e2: aload 8
      // 38e4: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 38e7: ifeq 3900
      // 38ea: aload 8
      // 38ec: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 38ef: astore 15
      // 38f1: aload 15
      // 38f3: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 38f6: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Reptile_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 38f9: bipush 0
      // 38fa: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 38fd: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 3900: aload 8
      // 3902: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 3905: ifeq 3927
      // 3908: aload 8
      // 390a: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 390d: astore 14
      // 390f: aload 14
      // 3911: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3914: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Hide_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3917: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 391a: checkcast java/lang/Boolean
      // 391d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3920: ifeq 3927
      // 3923: bipush 1
      // 3924: goto 3928
      // 3927: bipush 0
      // 3928: bipush 1
      // 3929: if_icmpne 3986
      // 392c: aload 1
      // 392d: instanceof net/minecraft/server/level/ServerLevel
      // 3930: ifeq 3968
      // 3933: aload 1
      // 3934: checkcast net/minecraft/server/level/ServerLevel
      // 3937: astore 15
      // 3939: new net/minecraft/world/entity/item/ItemEntity
      // 393c: dup
      // 393d: aload 15
      // 393f: dload 2
      // 3940: dload 4
      // 3942: dload 6
      // 3944: new net/minecraft/world/item/ItemStack
      // 3947: dup
      // 3948: getstatic net/mocreatures/init/MocreaturesModItems.HIDE_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 394b: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 394e: checkcast net/minecraft/world/level/ItemLike
      // 3951: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 3954: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3957: astore 16
      // 3959: aload 16
      // 395b: bipush 10
      // 395d: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3960: aload 15
      // 3962: aload 16
      // 3964: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3967: pop
      // 3968: aload 8
      // 396a: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 396d: ifeq 3986
      // 3970: aload 8
      // 3972: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 3975: astore 15
      // 3977: aload 15
      // 3979: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 397c: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Hide_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 397f: bipush 0
      // 3980: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3983: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 3986: aload 8
      // 3988: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 398b: ifeq 39ad
      // 398e: aload 8
      // 3990: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 3993: astore 14
      // 3995: aload 14
      // 3997: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 399a: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Leather_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 399d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 39a0: checkcast java/lang/Boolean
      // 39a3: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 39a6: ifeq 39ad
      // 39a9: bipush 1
      // 39aa: goto 39ae
      // 39ad: bipush 0
      // 39ae: bipush 1
      // 39af: if_icmpne 3a06
      // 39b2: aload 1
      // 39b3: instanceof net/minecraft/server/level/ServerLevel
      // 39b6: ifeq 39e8
      // 39b9: aload 1
      // 39ba: checkcast net/minecraft/server/level/ServerLevel
      // 39bd: astore 15
      // 39bf: new net/minecraft/world/entity/item/ItemEntity
      // 39c2: dup
      // 39c3: aload 15
      // 39c5: dload 2
      // 39c6: dload 4
      // 39c8: dload 6
      // 39ca: new net/minecraft/world/item/ItemStack
      // 39cd: dup
      // 39ce: getstatic net/minecraft/world/item/Items.LEATHER_HELMET Lnet/minecraft/world/item/Item;
      // 39d1: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 39d4: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 39d7: astore 16
      // 39d9: aload 16
      // 39db: bipush 10
      // 39dd: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 39e0: aload 15
      // 39e2: aload 16
      // 39e4: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 39e7: pop
      // 39e8: aload 8
      // 39ea: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 39ed: ifeq 3a06
      // 39f0: aload 8
      // 39f2: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 39f5: astore 15
      // 39f7: aload 15
      // 39f9: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 39fc: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Leather_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 39ff: bipush 0
      // 3a00: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3a03: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 3a06: aload 8
      // 3a08: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 3a0b: ifeq 3a2d
      // 3a0e: aload 8
      // 3a10: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 3a13: astore 14
      // 3a15: aload 14
      // 3a17: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3a1a: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Dirt_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3a1d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 3a20: checkcast java/lang/Boolean
      // 3a23: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3a26: ifeq 3a2d
      // 3a29: bipush 1
      // 3a2a: goto 3a2e
      // 3a2d: bipush 0
      // 3a2e: bipush 1
      // 3a2f: if_icmpne 3a8c
      // 3a32: aload 1
      // 3a33: instanceof net/minecraft/server/level/ServerLevel
      // 3a36: ifeq 3a6e
      // 3a39: aload 1
      // 3a3a: checkcast net/minecraft/server/level/ServerLevel
      // 3a3d: astore 15
      // 3a3f: new net/minecraft/world/entity/item/ItemEntity
      // 3a42: dup
      // 3a43: aload 15
      // 3a45: dload 2
      // 3a46: dload 4
      // 3a48: dload 6
      // 3a4a: new net/minecraft/world/item/ItemStack
      // 3a4d: dup
      // 3a4e: getstatic net/mocreatures/init/MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 3a51: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 3a54: checkcast net/minecraft/world/level/ItemLike
      // 3a57: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 3a5a: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3a5d: astore 16
      // 3a5f: aload 16
      // 3a61: bipush 10
      // 3a63: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3a66: aload 15
      // 3a68: aload 16
      // 3a6a: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3a6d: pop
      // 3a6e: aload 8
      // 3a70: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 3a73: ifeq 3a8c
      // 3a76: aload 8
      // 3a78: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 3a7b: astore 15
      // 3a7d: aload 15
      // 3a7f: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3a82: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Dirt_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3a85: bipush 0
      // 3a86: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3a89: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 3a8c: aload 8
      // 3a8e: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 3a91: ifeq 3ab3
      // 3a94: aload 8
      // 3a96: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 3a99: astore 14
      // 3a9b: aload 14
      // 3a9d: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3aa0: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Cave_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3aa3: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 3aa6: checkcast java/lang/Boolean
      // 3aa9: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3aac: ifeq 3ab3
      // 3aaf: bipush 1
      // 3ab0: goto 3ab4
      // 3ab3: bipush 0
      // 3ab4: bipush 1
      // 3ab5: if_icmpne 3b12
      // 3ab8: aload 1
      // 3ab9: instanceof net/minecraft/server/level/ServerLevel
      // 3abc: ifeq 3af4
      // 3abf: aload 1
      // 3ac0: checkcast net/minecraft/server/level/ServerLevel
      // 3ac3: astore 15
      // 3ac5: new net/minecraft/world/entity/item/ItemEntity
      // 3ac8: dup
      // 3ac9: aload 15
      // 3acb: dload 2
      // 3acc: dload 4
      // 3ace: dload 6
      // 3ad0: new net/minecraft/world/item/ItemStack
      // 3ad3: dup
      // 3ad4: getstatic net/mocreatures/init/MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 3ad7: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 3ada: checkcast net/minecraft/world/level/ItemLike
      // 3add: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 3ae0: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3ae3: astore 16
      // 3ae5: aload 16
      // 3ae7: bipush 10
      // 3ae9: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3aec: aload 15
      // 3aee: aload 16
      // 3af0: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3af3: pop
      // 3af4: aload 8
      // 3af6: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 3af9: ifeq 3b12
      // 3afc: aload 8
      // 3afe: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 3b01: astore 15
      // 3b03: aload 15
      // 3b05: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3b08: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Cave_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3b0b: bipush 0
      // 3b0c: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3b0f: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 3b12: aload 8
      // 3b14: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 3b17: ifeq 3b39
      // 3b1a: aload 8
      // 3b1c: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 3b1f: astore 14
      // 3b21: aload 14
      // 3b23: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3b26: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Nether_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3b29: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 3b2c: checkcast java/lang/Boolean
      // 3b2f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3b32: ifeq 3b39
      // 3b35: bipush 1
      // 3b36: goto 3b3a
      // 3b39: bipush 0
      // 3b3a: bipush 1
      // 3b3b: if_icmpne 3b98
      // 3b3e: aload 1
      // 3b3f: instanceof net/minecraft/server/level/ServerLevel
      // 3b42: ifeq 3b7a
      // 3b45: aload 1
      // 3b46: checkcast net/minecraft/server/level/ServerLevel
      // 3b49: astore 15
      // 3b4b: new net/minecraft/world/entity/item/ItemEntity
      // 3b4e: dup
      // 3b4f: aload 15
      // 3b51: dload 2
      // 3b52: dload 4
      // 3b54: dload 6
      // 3b56: new net/minecraft/world/item/ItemStack
      // 3b59: dup
      // 3b5a: getstatic net/mocreatures/init/MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 3b5d: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 3b60: checkcast net/minecraft/world/level/ItemLike
      // 3b63: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 3b66: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3b69: astore 16
      // 3b6b: aload 16
      // 3b6d: bipush 10
      // 3b6f: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3b72: aload 15
      // 3b74: aload 16
      // 3b76: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3b79: pop
      // 3b7a: aload 8
      // 3b7c: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 3b7f: ifeq 3b98
      // 3b82: aload 8
      // 3b84: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 3b87: astore 15
      // 3b89: aload 15
      // 3b8b: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3b8e: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Nether_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3b91: bipush 0
      // 3b92: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3b95: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 3b98: aload 8
      // 3b9a: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 3b9d: ifeq 3bbf
      // 3ba0: aload 8
      // 3ba2: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 3ba5: astore 14
      // 3ba7: aload 14
      // 3ba9: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3bac: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Undead_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3baf: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 3bb2: checkcast java/lang/Boolean
      // 3bb5: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3bb8: ifeq 3bbf
      // 3bbb: bipush 1
      // 3bbc: goto 3bc0
      // 3bbf: bipush 0
      // 3bc0: bipush 1
      // 3bc1: if_icmpne 3c1e
      // 3bc4: aload 1
      // 3bc5: instanceof net/minecraft/server/level/ServerLevel
      // 3bc8: ifeq 3c00
      // 3bcb: aload 1
      // 3bcc: checkcast net/minecraft/server/level/ServerLevel
      // 3bcf: astore 15
      // 3bd1: new net/minecraft/world/entity/item/ItemEntity
      // 3bd4: dup
      // 3bd5: aload 15
      // 3bd7: dload 2
      // 3bd8: dload 4
      // 3bda: dload 6
      // 3bdc: new net/minecraft/world/item/ItemStack
      // 3bdf: dup
      // 3be0: getstatic net/mocreatures/init/MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 3be3: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 3be6: checkcast net/minecraft/world/level/ItemLike
      // 3be9: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 3bec: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3bef: astore 16
      // 3bf1: aload 16
      // 3bf3: bipush 10
      // 3bf5: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3bf8: aload 15
      // 3bfa: aload 16
      // 3bfc: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3bff: pop
      // 3c00: aload 8
      // 3c02: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 3c05: ifeq 3c1e
      // 3c08: aload 8
      // 3c0a: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 3c0d: astore 15
      // 3c0f: aload 15
      // 3c11: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3c14: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Undead_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3c17: bipush 0
      // 3c18: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3c1b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 3c1e: aload 8
      // 3c20: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 3c23: ifeq 3c45
      // 3c26: aload 8
      // 3c28: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 3c2b: astore 14
      // 3c2d: aload 14
      // 3c2f: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3c32: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Netherite_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3c35: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 3c38: checkcast java/lang/Boolean
      // 3c3b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3c3e: ifeq 3c45
      // 3c41: bipush 1
      // 3c42: goto 3c46
      // 3c45: bipush 0
      // 3c46: bipush 1
      // 3c47: if_icmpne 3c9e
      // 3c4a: aload 1
      // 3c4b: instanceof net/minecraft/server/level/ServerLevel
      // 3c4e: ifeq 3c80
      // 3c51: aload 1
      // 3c52: checkcast net/minecraft/server/level/ServerLevel
      // 3c55: astore 15
      // 3c57: new net/minecraft/world/entity/item/ItemEntity
      // 3c5a: dup
      // 3c5b: aload 15
      // 3c5d: dload 2
      // 3c5e: dload 4
      // 3c60: dload 6
      // 3c62: new net/minecraft/world/item/ItemStack
      // 3c65: dup
      // 3c66: getstatic net/minecraft/world/item/Items.NETHERITE_HELMET Lnet/minecraft/world/item/Item;
      // 3c69: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 3c6c: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3c6f: astore 16
      // 3c71: aload 16
      // 3c73: bipush 10
      // 3c75: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3c78: aload 15
      // 3c7a: aload 16
      // 3c7c: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3c7f: pop
      // 3c80: aload 8
      // 3c82: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 3c85: ifeq 3c9e
      // 3c88: aload 8
      // 3c8a: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 3c8d: astore 15
      // 3c8f: aload 15
      // 3c91: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3c94: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Netherite_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3c97: bipush 0
      // 3c98: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3c9b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 3c9e: aload 8
      // 3ca0: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 3ca3: ifeq 3cc5
      // 3ca6: aload 8
      // 3ca8: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 3cab: astore 11
      // 3cad: aload 11
      // 3caf: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3cb2: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Dirt_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3cb5: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 3cb8: checkcast java/lang/Boolean
      // 3cbb: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3cbe: ifeq 3cc5
      // 3cc1: bipush 1
      // 3cc2: goto 3cc6
      // 3cc5: bipush 0
      // 3cc6: ifne 43fc
      // 3cc9: aload 9
      // 3ccb: instanceof net/minecraft/world/entity/LivingEntity
      // 3cce: ifeq 3ce0
      // 3cd1: aload 9
      // 3cd3: checkcast net/minecraft/world/entity/LivingEntity
      // 3cd6: astore 12
      // 3cd8: aload 12
      // 3cda: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 3cdd: goto 3ce3
      // 3ce0: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 3ce3: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 3ce6: getstatic net/mocreatures/init/MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 3ce9: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 3cec: if_acmpne 43fc
      // 3cef: aload 9
      // 3cf1: instanceof net/minecraft/world/entity/player/Player
      // 3cf4: ifeq 3d29
      // 3cf7: aload 9
      // 3cf9: checkcast net/minecraft/world/entity/player/Player
      // 3cfc: astore 13
      // 3cfe: new net/minecraft/world/item/ItemStack
      // 3d01: dup
      // 3d02: getstatic net/mocreatures/init/MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 3d05: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 3d08: checkcast net/minecraft/world/level/ItemLike
      // 3d0b: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 3d0e: astore 14
      // 3d10: aload 13
      // 3d12: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 3d15: aload 14
      // 3d17: invokedynamic test (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, net/mocreatures/procedures/UnihornedOstrichEquipment1Procedure.lambda$execute$10 (Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z, (Lnet/minecraft/world/item/ItemStack;)Z ]
      // 3d1c: bipush 1
      // 3d1d: aload 13
      // 3d1f: getfield net/minecraft/world/entity/player/Player.inventoryMenu Lnet/minecraft/world/inventory/InventoryMenu;
      // 3d22: invokevirtual net/minecraft/world/inventory/InventoryMenu.getCraftSlots ()Lnet/minecraft/world/inventory/CraftingContainer;
      // 3d25: invokevirtual net/minecraft/world/entity/player/Inventory.clearOrCountMatchingItems (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
      // 3d28: pop
      // 3d29: aload 8
      // 3d2b: astore 13
      // 3d2d: aload 13
      // 3d2f: instanceof net/minecraft/world/entity/player/Player
      // 3d32: ifeq 3d64
      // 3d35: aload 13
      // 3d37: checkcast net/minecraft/world/entity/player/Player
      // 3d3a: astore 14
      // 3d3c: aload 14
      // 3d3e: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 3d41: getfield net/minecraft/world/entity/player/Inventory.armor Lnet/minecraft/core/NonNullList;
      // 3d44: bipush 0
      // 3d45: new net/minecraft/world/item/ItemStack
      // 3d48: dup
      // 3d49: getstatic net/mocreatures/init/MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 3d4c: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 3d4f: checkcast net/minecraft/world/level/ItemLike
      // 3d52: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 3d55: invokevirtual net/minecraft/core/NonNullList.set (ILjava/lang/Object;)Ljava/lang/Object;
      // 3d58: pop
      // 3d59: aload 14
      // 3d5b: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 3d5e: invokevirtual net/minecraft/world/entity/player/Inventory.setChanged ()V
      // 3d61: goto 3d8b
      // 3d64: aload 13
      // 3d66: instanceof net/minecraft/world/entity/LivingEntity
      // 3d69: ifeq 3d8b
      // 3d6c: aload 13
      // 3d6e: checkcast net/minecraft/world/entity/LivingEntity
      // 3d71: astore 15
      // 3d73: aload 15
      // 3d75: getstatic net/minecraft/world/entity/EquipmentSlot.FEET Lnet/minecraft/world/entity/EquipmentSlot;
      // 3d78: new net/minecraft/world/item/ItemStack
      // 3d7b: dup
      // 3d7c: getstatic net/mocreatures/init/MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 3d7f: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 3d82: checkcast net/minecraft/world/level/ItemLike
      // 3d85: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 3d88: invokevirtual net/minecraft/world/entity/LivingEntity.setItemSlot (Lnet/minecraft/world/entity/EquipmentSlot;Lnet/minecraft/world/item/ItemStack;)V
      // 3d8b: aload 8
      // 3d8d: instanceof net/minecraft/world/entity/LivingEntity
      // 3d90: ifeq 3da5
      // 3d93: aload 8
      // 3d95: checkcast net/minecraft/world/entity/LivingEntity
      // 3d98: astore 13
      // 3d9a: aload 13
      // 3d9c: getstatic net/minecraft/world/entity/EquipmentSlot.FEET Lnet/minecraft/world/entity/EquipmentSlot;
      // 3d9f: invokevirtual net/minecraft/world/entity/LivingEntity.getItemBySlot (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
      // 3da2: goto 3da8
      // 3da5: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 3da8: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 3dab: getstatic net/mocreatures/init/MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 3dae: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 3db1: if_acmpne 43fc
      // 3db4: aload 8
      // 3db6: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 3db9: ifeq 3dd2
      // 3dbc: aload 8
      // 3dbe: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 3dc1: astore 14
      // 3dc3: aload 14
      // 3dc5: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3dc8: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Dirt_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3dcb: bipush 1
      // 3dcc: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3dcf: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 3dd2: aload 8
      // 3dd4: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 3dd7: ifeq 3df9
      // 3dda: aload 8
      // 3ddc: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 3ddf: astore 14
      // 3de1: aload 14
      // 3de3: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3de6: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Gold_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3de9: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 3dec: checkcast java/lang/Boolean
      // 3def: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3df2: ifeq 3df9
      // 3df5: bipush 1
      // 3df6: goto 3dfa
      // 3df9: bipush 0
      // 3dfa: bipush 1
      // 3dfb: if_icmpne 3e52
      // 3dfe: aload 1
      // 3dff: instanceof net/minecraft/server/level/ServerLevel
      // 3e02: ifeq 3e34
      // 3e05: aload 1
      // 3e06: checkcast net/minecraft/server/level/ServerLevel
      // 3e09: astore 15
      // 3e0b: new net/minecraft/world/entity/item/ItemEntity
      // 3e0e: dup
      // 3e0f: aload 15
      // 3e11: dload 2
      // 3e12: dload 4
      // 3e14: dload 6
      // 3e16: new net/minecraft/world/item/ItemStack
      // 3e19: dup
      // 3e1a: getstatic net/minecraft/world/item/Items.GOLDEN_HELMET Lnet/minecraft/world/item/Item;
      // 3e1d: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 3e20: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3e23: astore 16
      // 3e25: aload 16
      // 3e27: bipush 10
      // 3e29: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3e2c: aload 15
      // 3e2e: aload 16
      // 3e30: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3e33: pop
      // 3e34: aload 8
      // 3e36: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 3e39: ifeq 3e52
      // 3e3c: aload 8
      // 3e3e: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 3e41: astore 15
      // 3e43: aload 15
      // 3e45: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3e48: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Gold_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3e4b: bipush 0
      // 3e4c: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3e4f: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 3e52: aload 8
      // 3e54: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 3e57: ifeq 3e79
      // 3e5a: aload 8
      // 3e5c: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 3e5f: astore 14
      // 3e61: aload 14
      // 3e63: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3e66: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Diamond_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3e69: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 3e6c: checkcast java/lang/Boolean
      // 3e6f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3e72: ifeq 3e79
      // 3e75: bipush 1
      // 3e76: goto 3e7a
      // 3e79: bipush 0
      // 3e7a: bipush 1
      // 3e7b: if_icmpne 3ed2
      // 3e7e: aload 1
      // 3e7f: instanceof net/minecraft/server/level/ServerLevel
      // 3e82: ifeq 3eb4
      // 3e85: aload 1
      // 3e86: checkcast net/minecraft/server/level/ServerLevel
      // 3e89: astore 15
      // 3e8b: new net/minecraft/world/entity/item/ItemEntity
      // 3e8e: dup
      // 3e8f: aload 15
      // 3e91: dload 2
      // 3e92: dload 4
      // 3e94: dload 6
      // 3e96: new net/minecraft/world/item/ItemStack
      // 3e99: dup
      // 3e9a: getstatic net/minecraft/world/item/Items.DIAMOND_HELMET Lnet/minecraft/world/item/Item;
      // 3e9d: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 3ea0: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3ea3: astore 16
      // 3ea5: aload 16
      // 3ea7: bipush 10
      // 3ea9: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3eac: aload 15
      // 3eae: aload 16
      // 3eb0: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3eb3: pop
      // 3eb4: aload 8
      // 3eb6: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 3eb9: ifeq 3ed2
      // 3ebc: aload 8
      // 3ebe: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 3ec1: astore 15
      // 3ec3: aload 15
      // 3ec5: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3ec8: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Diamond_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3ecb: bipush 0
      // 3ecc: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3ecf: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 3ed2: aload 8
      // 3ed4: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 3ed7: ifeq 3ef9
      // 3eda: aload 8
      // 3edc: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 3edf: astore 14
      // 3ee1: aload 14
      // 3ee3: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3ee6: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Iron_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3ee9: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 3eec: checkcast java/lang/Boolean
      // 3eef: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3ef2: ifeq 3ef9
      // 3ef5: bipush 1
      // 3ef6: goto 3efa
      // 3ef9: bipush 0
      // 3efa: bipush 1
      // 3efb: if_icmpne 3f52
      // 3efe: aload 1
      // 3eff: instanceof net/minecraft/server/level/ServerLevel
      // 3f02: ifeq 3f34
      // 3f05: aload 1
      // 3f06: checkcast net/minecraft/server/level/ServerLevel
      // 3f09: astore 15
      // 3f0b: new net/minecraft/world/entity/item/ItemEntity
      // 3f0e: dup
      // 3f0f: aload 15
      // 3f11: dload 2
      // 3f12: dload 4
      // 3f14: dload 6
      // 3f16: new net/minecraft/world/item/ItemStack
      // 3f19: dup
      // 3f1a: getstatic net/minecraft/world/item/Items.IRON_HELMET Lnet/minecraft/world/item/Item;
      // 3f1d: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 3f20: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3f23: astore 16
      // 3f25: aload 16
      // 3f27: bipush 10
      // 3f29: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3f2c: aload 15
      // 3f2e: aload 16
      // 3f30: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3f33: pop
      // 3f34: aload 8
      // 3f36: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 3f39: ifeq 3f52
      // 3f3c: aload 8
      // 3f3e: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 3f41: astore 15
      // 3f43: aload 15
      // 3f45: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3f48: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Iron_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3f4b: bipush 0
      // 3f4c: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3f4f: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 3f52: aload 8
      // 3f54: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 3f57: ifeq 3f79
      // 3f5a: aload 8
      // 3f5c: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 3f5f: astore 14
      // 3f61: aload 14
      // 3f63: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3f66: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Fur_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3f69: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 3f6c: checkcast java/lang/Boolean
      // 3f6f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3f72: ifeq 3f79
      // 3f75: bipush 1
      // 3f76: goto 3f7a
      // 3f79: bipush 0
      // 3f7a: bipush 1
      // 3f7b: if_icmpne 3fd8
      // 3f7e: aload 1
      // 3f7f: instanceof net/minecraft/server/level/ServerLevel
      // 3f82: ifeq 3fba
      // 3f85: aload 1
      // 3f86: checkcast net/minecraft/server/level/ServerLevel
      // 3f89: astore 15
      // 3f8b: new net/minecraft/world/entity/item/ItemEntity
      // 3f8e: dup
      // 3f8f: aload 15
      // 3f91: dload 2
      // 3f92: dload 4
      // 3f94: dload 6
      // 3f96: new net/minecraft/world/item/ItemStack
      // 3f99: dup
      // 3f9a: getstatic net/mocreatures/init/MocreaturesModItems.FUR_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 3f9d: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 3fa0: checkcast net/minecraft/world/level/ItemLike
      // 3fa3: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 3fa6: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3fa9: astore 16
      // 3fab: aload 16
      // 3fad: bipush 10
      // 3faf: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3fb2: aload 15
      // 3fb4: aload 16
      // 3fb6: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3fb9: pop
      // 3fba: aload 8
      // 3fbc: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 3fbf: ifeq 3fd8
      // 3fc2: aload 8
      // 3fc4: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 3fc7: astore 15
      // 3fc9: aload 15
      // 3fcb: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3fce: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Fur_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3fd1: bipush 0
      // 3fd2: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3fd5: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 3fd8: aload 8
      // 3fda: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 3fdd: ifeq 3fff
      // 3fe0: aload 8
      // 3fe2: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 3fe5: astore 14
      // 3fe7: aload 14
      // 3fe9: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3fec: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Reptile_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3fef: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 3ff2: checkcast java/lang/Boolean
      // 3ff5: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3ff8: ifeq 3fff
      // 3ffb: bipush 1
      // 3ffc: goto 4000
      // 3fff: bipush 0
      // 4000: bipush 1
      // 4001: if_icmpne 405e
      // 4004: aload 1
      // 4005: instanceof net/minecraft/server/level/ServerLevel
      // 4008: ifeq 4040
      // 400b: aload 1
      // 400c: checkcast net/minecraft/server/level/ServerLevel
      // 400f: astore 15
      // 4011: new net/minecraft/world/entity/item/ItemEntity
      // 4014: dup
      // 4015: aload 15
      // 4017: dload 2
      // 4018: dload 4
      // 401a: dload 6
      // 401c: new net/minecraft/world/item/ItemStack
      // 401f: dup
      // 4020: getstatic net/mocreatures/init/MocreaturesModItems.REPTILE_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 4023: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 4026: checkcast net/minecraft/world/level/ItemLike
      // 4029: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 402c: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 402f: astore 16
      // 4031: aload 16
      // 4033: bipush 10
      // 4035: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4038: aload 15
      // 403a: aload 16
      // 403c: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 403f: pop
      // 4040: aload 8
      // 4042: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 4045: ifeq 405e
      // 4048: aload 8
      // 404a: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 404d: astore 15
      // 404f: aload 15
      // 4051: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4054: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Reptile_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4057: bipush 0
      // 4058: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 405b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 405e: aload 8
      // 4060: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 4063: ifeq 4085
      // 4066: aload 8
      // 4068: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 406b: astore 14
      // 406d: aload 14
      // 406f: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4072: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Hide_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4075: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 4078: checkcast java/lang/Boolean
      // 407b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 407e: ifeq 4085
      // 4081: bipush 1
      // 4082: goto 4086
      // 4085: bipush 0
      // 4086: bipush 1
      // 4087: if_icmpne 40e4
      // 408a: aload 1
      // 408b: instanceof net/minecraft/server/level/ServerLevel
      // 408e: ifeq 40c6
      // 4091: aload 1
      // 4092: checkcast net/minecraft/server/level/ServerLevel
      // 4095: astore 15
      // 4097: new net/minecraft/world/entity/item/ItemEntity
      // 409a: dup
      // 409b: aload 15
      // 409d: dload 2
      // 409e: dload 4
      // 40a0: dload 6
      // 40a2: new net/minecraft/world/item/ItemStack
      // 40a5: dup
      // 40a6: getstatic net/mocreatures/init/MocreaturesModItems.HIDE_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 40a9: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 40ac: checkcast net/minecraft/world/level/ItemLike
      // 40af: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 40b2: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 40b5: astore 16
      // 40b7: aload 16
      // 40b9: bipush 10
      // 40bb: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 40be: aload 15
      // 40c0: aload 16
      // 40c2: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 40c5: pop
      // 40c6: aload 8
      // 40c8: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 40cb: ifeq 40e4
      // 40ce: aload 8
      // 40d0: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 40d3: astore 15
      // 40d5: aload 15
      // 40d7: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 40da: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Hide_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 40dd: bipush 0
      // 40de: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 40e1: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 40e4: aload 8
      // 40e6: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 40e9: ifeq 410b
      // 40ec: aload 8
      // 40ee: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 40f1: astore 14
      // 40f3: aload 14
      // 40f5: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 40f8: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Leather_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 40fb: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 40fe: checkcast java/lang/Boolean
      // 4101: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4104: ifeq 410b
      // 4107: bipush 1
      // 4108: goto 410c
      // 410b: bipush 0
      // 410c: bipush 1
      // 410d: if_icmpne 4164
      // 4110: aload 1
      // 4111: instanceof net/minecraft/server/level/ServerLevel
      // 4114: ifeq 4146
      // 4117: aload 1
      // 4118: checkcast net/minecraft/server/level/ServerLevel
      // 411b: astore 15
      // 411d: new net/minecraft/world/entity/item/ItemEntity
      // 4120: dup
      // 4121: aload 15
      // 4123: dload 2
      // 4124: dload 4
      // 4126: dload 6
      // 4128: new net/minecraft/world/item/ItemStack
      // 412b: dup
      // 412c: getstatic net/minecraft/world/item/Items.LEATHER_HELMET Lnet/minecraft/world/item/Item;
      // 412f: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 4132: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4135: astore 16
      // 4137: aload 16
      // 4139: bipush 10
      // 413b: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 413e: aload 15
      // 4140: aload 16
      // 4142: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4145: pop
      // 4146: aload 8
      // 4148: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 414b: ifeq 4164
      // 414e: aload 8
      // 4150: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 4153: astore 15
      // 4155: aload 15
      // 4157: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 415a: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Leather_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 415d: bipush 0
      // 415e: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4161: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 4164: aload 8
      // 4166: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 4169: ifeq 418b
      // 416c: aload 8
      // 416e: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 4171: astore 14
      // 4173: aload 14
      // 4175: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4178: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Frost_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 417b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 417e: checkcast java/lang/Boolean
      // 4181: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4184: ifeq 418b
      // 4187: bipush 1
      // 4188: goto 418c
      // 418b: bipush 0
      // 418c: bipush 1
      // 418d: if_icmpne 41ea
      // 4190: aload 1
      // 4191: instanceof net/minecraft/server/level/ServerLevel
      // 4194: ifeq 41cc
      // 4197: aload 1
      // 4198: checkcast net/minecraft/server/level/ServerLevel
      // 419b: astore 15
      // 419d: new net/minecraft/world/entity/item/ItemEntity
      // 41a0: dup
      // 41a1: aload 15
      // 41a3: dload 2
      // 41a4: dload 4
      // 41a6: dload 6
      // 41a8: new net/minecraft/world/item/ItemStack
      // 41ab: dup
      // 41ac: getstatic net/mocreatures/init/MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 41af: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 41b2: checkcast net/minecraft/world/level/ItemLike
      // 41b5: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 41b8: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 41bb: astore 16
      // 41bd: aload 16
      // 41bf: bipush 10
      // 41c1: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 41c4: aload 15
      // 41c6: aload 16
      // 41c8: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 41cb: pop
      // 41cc: aload 8
      // 41ce: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 41d1: ifeq 41ea
      // 41d4: aload 8
      // 41d6: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 41d9: astore 15
      // 41db: aload 15
      // 41dd: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 41e0: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Frost_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 41e3: bipush 0
      // 41e4: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 41e7: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 41ea: aload 8
      // 41ec: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 41ef: ifeq 4211
      // 41f2: aload 8
      // 41f4: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 41f7: astore 14
      // 41f9: aload 14
      // 41fb: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 41fe: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Cave_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4201: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 4204: checkcast java/lang/Boolean
      // 4207: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 420a: ifeq 4211
      // 420d: bipush 1
      // 420e: goto 4212
      // 4211: bipush 0
      // 4212: bipush 1
      // 4213: if_icmpne 4270
      // 4216: aload 1
      // 4217: instanceof net/minecraft/server/level/ServerLevel
      // 421a: ifeq 4252
      // 421d: aload 1
      // 421e: checkcast net/minecraft/server/level/ServerLevel
      // 4221: astore 15
      // 4223: new net/minecraft/world/entity/item/ItemEntity
      // 4226: dup
      // 4227: aload 15
      // 4229: dload 2
      // 422a: dload 4
      // 422c: dload 6
      // 422e: new net/minecraft/world/item/ItemStack
      // 4231: dup
      // 4232: getstatic net/mocreatures/init/MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 4235: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 4238: checkcast net/minecraft/world/level/ItemLike
      // 423b: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 423e: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4241: astore 16
      // 4243: aload 16
      // 4245: bipush 10
      // 4247: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 424a: aload 15
      // 424c: aload 16
      // 424e: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4251: pop
      // 4252: aload 8
      // 4254: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 4257: ifeq 4270
      // 425a: aload 8
      // 425c: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 425f: astore 15
      // 4261: aload 15
      // 4263: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4266: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Cave_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4269: bipush 0
      // 426a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 426d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 4270: aload 8
      // 4272: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 4275: ifeq 4297
      // 4278: aload 8
      // 427a: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 427d: astore 14
      // 427f: aload 14
      // 4281: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4284: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Nether_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4287: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 428a: checkcast java/lang/Boolean
      // 428d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4290: ifeq 4297
      // 4293: bipush 1
      // 4294: goto 4298
      // 4297: bipush 0
      // 4298: bipush 1
      // 4299: if_icmpne 42f6
      // 429c: aload 1
      // 429d: instanceof net/minecraft/server/level/ServerLevel
      // 42a0: ifeq 42d8
      // 42a3: aload 1
      // 42a4: checkcast net/minecraft/server/level/ServerLevel
      // 42a7: astore 15
      // 42a9: new net/minecraft/world/entity/item/ItemEntity
      // 42ac: dup
      // 42ad: aload 15
      // 42af: dload 2
      // 42b0: dload 4
      // 42b2: dload 6
      // 42b4: new net/minecraft/world/item/ItemStack
      // 42b7: dup
      // 42b8: getstatic net/mocreatures/init/MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 42bb: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 42be: checkcast net/minecraft/world/level/ItemLike
      // 42c1: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 42c4: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 42c7: astore 16
      // 42c9: aload 16
      // 42cb: bipush 10
      // 42cd: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 42d0: aload 15
      // 42d2: aload 16
      // 42d4: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 42d7: pop
      // 42d8: aload 8
      // 42da: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 42dd: ifeq 42f6
      // 42e0: aload 8
      // 42e2: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 42e5: astore 15
      // 42e7: aload 15
      // 42e9: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 42ec: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Nether_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 42ef: bipush 0
      // 42f0: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 42f3: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 42f6: aload 8
      // 42f8: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 42fb: ifeq 431d
      // 42fe: aload 8
      // 4300: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 4303: astore 14
      // 4305: aload 14
      // 4307: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 430a: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Undead_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 430d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 4310: checkcast java/lang/Boolean
      // 4313: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4316: ifeq 431d
      // 4319: bipush 1
      // 431a: goto 431e
      // 431d: bipush 0
      // 431e: bipush 1
      // 431f: if_icmpne 437c
      // 4322: aload 1
      // 4323: instanceof net/minecraft/server/level/ServerLevel
      // 4326: ifeq 435e
      // 4329: aload 1
      // 432a: checkcast net/minecraft/server/level/ServerLevel
      // 432d: astore 15
      // 432f: new net/minecraft/world/entity/item/ItemEntity
      // 4332: dup
      // 4333: aload 15
      // 4335: dload 2
      // 4336: dload 4
      // 4338: dload 6
      // 433a: new net/minecraft/world/item/ItemStack
      // 433d: dup
      // 433e: getstatic net/mocreatures/init/MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 4341: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 4344: checkcast net/minecraft/world/level/ItemLike
      // 4347: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 434a: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 434d: astore 16
      // 434f: aload 16
      // 4351: bipush 10
      // 4353: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4356: aload 15
      // 4358: aload 16
      // 435a: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 435d: pop
      // 435e: aload 8
      // 4360: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 4363: ifeq 437c
      // 4366: aload 8
      // 4368: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 436b: astore 15
      // 436d: aload 15
      // 436f: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4372: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Undead_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4375: bipush 0
      // 4376: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4379: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 437c: aload 8
      // 437e: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 4381: ifeq 43a3
      // 4384: aload 8
      // 4386: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 4389: astore 14
      // 438b: aload 14
      // 438d: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4390: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Netherite_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4393: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 4396: checkcast java/lang/Boolean
      // 4399: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 439c: ifeq 43a3
      // 439f: bipush 1
      // 43a0: goto 43a4
      // 43a3: bipush 0
      // 43a4: bipush 1
      // 43a5: if_icmpne 43fc
      // 43a8: aload 1
      // 43a9: instanceof net/minecraft/server/level/ServerLevel
      // 43ac: ifeq 43de
      // 43af: aload 1
      // 43b0: checkcast net/minecraft/server/level/ServerLevel
      // 43b3: astore 15
      // 43b5: new net/minecraft/world/entity/item/ItemEntity
      // 43b8: dup
      // 43b9: aload 15
      // 43bb: dload 2
      // 43bc: dload 4
      // 43be: dload 6
      // 43c0: new net/minecraft/world/item/ItemStack
      // 43c3: dup
      // 43c4: getstatic net/minecraft/world/item/Items.NETHERITE_HELMET Lnet/minecraft/world/item/Item;
      // 43c7: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 43ca: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 43cd: astore 16
      // 43cf: aload 16
      // 43d1: bipush 10
      // 43d3: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 43d6: aload 15
      // 43d8: aload 16
      // 43da: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 43dd: pop
      // 43de: aload 8
      // 43e0: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 43e3: ifeq 43fc
      // 43e6: aload 8
      // 43e8: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 43eb: astore 15
      // 43ed: aload 15
      // 43ef: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 43f2: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Netherite_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 43f5: bipush 0
      // 43f6: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 43f9: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 43fc: aload 8
      // 43fe: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 4401: ifeq 4423
      // 4404: aload 8
      // 4406: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 4409: astore 11
      // 440b: aload 11
      // 440d: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4410: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Cave_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4413: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 4416: checkcast java/lang/Boolean
      // 4419: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 441c: ifeq 4423
      // 441f: bipush 1
      // 4420: goto 4424
      // 4423: bipush 0
      // 4424: ifne 4b5a
      // 4427: aload 9
      // 4429: instanceof net/minecraft/world/entity/LivingEntity
      // 442c: ifeq 443e
      // 442f: aload 9
      // 4431: checkcast net/minecraft/world/entity/LivingEntity
      // 4434: astore 12
      // 4436: aload 12
      // 4438: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 443b: goto 4441
      // 443e: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 4441: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 4444: getstatic net/mocreatures/init/MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 4447: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 444a: if_acmpne 4b5a
      // 444d: aload 9
      // 444f: instanceof net/minecraft/world/entity/player/Player
      // 4452: ifeq 4487
      // 4455: aload 9
      // 4457: checkcast net/minecraft/world/entity/player/Player
      // 445a: astore 13
      // 445c: new net/minecraft/world/item/ItemStack
      // 445f: dup
      // 4460: getstatic net/mocreatures/init/MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 4463: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 4466: checkcast net/minecraft/world/level/ItemLike
      // 4469: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 446c: astore 14
      // 446e: aload 13
      // 4470: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 4473: aload 14
      // 4475: invokedynamic test (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, net/mocreatures/procedures/UnihornedOstrichEquipment1Procedure.lambda$execute$11 (Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z, (Lnet/minecraft/world/item/ItemStack;)Z ]
      // 447a: bipush 1
      // 447b: aload 13
      // 447d: getfield net/minecraft/world/entity/player/Player.inventoryMenu Lnet/minecraft/world/inventory/InventoryMenu;
      // 4480: invokevirtual net/minecraft/world/inventory/InventoryMenu.getCraftSlots ()Lnet/minecraft/world/inventory/CraftingContainer;
      // 4483: invokevirtual net/minecraft/world/entity/player/Inventory.clearOrCountMatchingItems (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
      // 4486: pop
      // 4487: aload 8
      // 4489: astore 13
      // 448b: aload 13
      // 448d: instanceof net/minecraft/world/entity/player/Player
      // 4490: ifeq 44c2
      // 4493: aload 13
      // 4495: checkcast net/minecraft/world/entity/player/Player
      // 4498: astore 14
      // 449a: aload 14
      // 449c: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 449f: getfield net/minecraft/world/entity/player/Inventory.armor Lnet/minecraft/core/NonNullList;
      // 44a2: bipush 0
      // 44a3: new net/minecraft/world/item/ItemStack
      // 44a6: dup
      // 44a7: getstatic net/mocreatures/init/MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 44aa: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 44ad: checkcast net/minecraft/world/level/ItemLike
      // 44b0: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 44b3: invokevirtual net/minecraft/core/NonNullList.set (ILjava/lang/Object;)Ljava/lang/Object;
      // 44b6: pop
      // 44b7: aload 14
      // 44b9: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 44bc: invokevirtual net/minecraft/world/entity/player/Inventory.setChanged ()V
      // 44bf: goto 44e9
      // 44c2: aload 13
      // 44c4: instanceof net/minecraft/world/entity/LivingEntity
      // 44c7: ifeq 44e9
      // 44ca: aload 13
      // 44cc: checkcast net/minecraft/world/entity/LivingEntity
      // 44cf: astore 15
      // 44d1: aload 15
      // 44d3: getstatic net/minecraft/world/entity/EquipmentSlot.FEET Lnet/minecraft/world/entity/EquipmentSlot;
      // 44d6: new net/minecraft/world/item/ItemStack
      // 44d9: dup
      // 44da: getstatic net/mocreatures/init/MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 44dd: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 44e0: checkcast net/minecraft/world/level/ItemLike
      // 44e3: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 44e6: invokevirtual net/minecraft/world/entity/LivingEntity.setItemSlot (Lnet/minecraft/world/entity/EquipmentSlot;Lnet/minecraft/world/item/ItemStack;)V
      // 44e9: aload 8
      // 44eb: instanceof net/minecraft/world/entity/LivingEntity
      // 44ee: ifeq 4503
      // 44f1: aload 8
      // 44f3: checkcast net/minecraft/world/entity/LivingEntity
      // 44f6: astore 13
      // 44f8: aload 13
      // 44fa: getstatic net/minecraft/world/entity/EquipmentSlot.FEET Lnet/minecraft/world/entity/EquipmentSlot;
      // 44fd: invokevirtual net/minecraft/world/entity/LivingEntity.getItemBySlot (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
      // 4500: goto 4506
      // 4503: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 4506: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 4509: getstatic net/mocreatures/init/MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 450c: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 450f: if_acmpne 4b5a
      // 4512: aload 8
      // 4514: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 4517: ifeq 4530
      // 451a: aload 8
      // 451c: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 451f: astore 14
      // 4521: aload 14
      // 4523: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4526: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Cave_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4529: bipush 1
      // 452a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 452d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 4530: aload 8
      // 4532: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 4535: ifeq 4557
      // 4538: aload 8
      // 453a: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 453d: astore 14
      // 453f: aload 14
      // 4541: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4544: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Gold_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4547: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 454a: checkcast java/lang/Boolean
      // 454d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4550: ifeq 4557
      // 4553: bipush 1
      // 4554: goto 4558
      // 4557: bipush 0
      // 4558: bipush 1
      // 4559: if_icmpne 45b0
      // 455c: aload 1
      // 455d: instanceof net/minecraft/server/level/ServerLevel
      // 4560: ifeq 4592
      // 4563: aload 1
      // 4564: checkcast net/minecraft/server/level/ServerLevel
      // 4567: astore 15
      // 4569: new net/minecraft/world/entity/item/ItemEntity
      // 456c: dup
      // 456d: aload 15
      // 456f: dload 2
      // 4570: dload 4
      // 4572: dload 6
      // 4574: new net/minecraft/world/item/ItemStack
      // 4577: dup
      // 4578: getstatic net/minecraft/world/item/Items.GOLDEN_HELMET Lnet/minecraft/world/item/Item;
      // 457b: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 457e: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4581: astore 16
      // 4583: aload 16
      // 4585: bipush 10
      // 4587: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 458a: aload 15
      // 458c: aload 16
      // 458e: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4591: pop
      // 4592: aload 8
      // 4594: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 4597: ifeq 45b0
      // 459a: aload 8
      // 459c: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 459f: astore 15
      // 45a1: aload 15
      // 45a3: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 45a6: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Gold_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 45a9: bipush 0
      // 45aa: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 45ad: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 45b0: aload 8
      // 45b2: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 45b5: ifeq 45d7
      // 45b8: aload 8
      // 45ba: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 45bd: astore 14
      // 45bf: aload 14
      // 45c1: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 45c4: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Diamond_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 45c7: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 45ca: checkcast java/lang/Boolean
      // 45cd: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 45d0: ifeq 45d7
      // 45d3: bipush 1
      // 45d4: goto 45d8
      // 45d7: bipush 0
      // 45d8: bipush 1
      // 45d9: if_icmpne 4630
      // 45dc: aload 1
      // 45dd: instanceof net/minecraft/server/level/ServerLevel
      // 45e0: ifeq 4612
      // 45e3: aload 1
      // 45e4: checkcast net/minecraft/server/level/ServerLevel
      // 45e7: astore 15
      // 45e9: new net/minecraft/world/entity/item/ItemEntity
      // 45ec: dup
      // 45ed: aload 15
      // 45ef: dload 2
      // 45f0: dload 4
      // 45f2: dload 6
      // 45f4: new net/minecraft/world/item/ItemStack
      // 45f7: dup
      // 45f8: getstatic net/minecraft/world/item/Items.DIAMOND_HELMET Lnet/minecraft/world/item/Item;
      // 45fb: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 45fe: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4601: astore 16
      // 4603: aload 16
      // 4605: bipush 10
      // 4607: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 460a: aload 15
      // 460c: aload 16
      // 460e: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4611: pop
      // 4612: aload 8
      // 4614: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 4617: ifeq 4630
      // 461a: aload 8
      // 461c: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 461f: astore 15
      // 4621: aload 15
      // 4623: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4626: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Diamond_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4629: bipush 0
      // 462a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 462d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 4630: aload 8
      // 4632: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 4635: ifeq 4657
      // 4638: aload 8
      // 463a: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 463d: astore 14
      // 463f: aload 14
      // 4641: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4644: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Iron_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4647: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 464a: checkcast java/lang/Boolean
      // 464d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4650: ifeq 4657
      // 4653: bipush 1
      // 4654: goto 4658
      // 4657: bipush 0
      // 4658: bipush 1
      // 4659: if_icmpne 46b0
      // 465c: aload 1
      // 465d: instanceof net/minecraft/server/level/ServerLevel
      // 4660: ifeq 4692
      // 4663: aload 1
      // 4664: checkcast net/minecraft/server/level/ServerLevel
      // 4667: astore 15
      // 4669: new net/minecraft/world/entity/item/ItemEntity
      // 466c: dup
      // 466d: aload 15
      // 466f: dload 2
      // 4670: dload 4
      // 4672: dload 6
      // 4674: new net/minecraft/world/item/ItemStack
      // 4677: dup
      // 4678: getstatic net/minecraft/world/item/Items.IRON_HELMET Lnet/minecraft/world/item/Item;
      // 467b: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 467e: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4681: astore 16
      // 4683: aload 16
      // 4685: bipush 10
      // 4687: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 468a: aload 15
      // 468c: aload 16
      // 468e: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4691: pop
      // 4692: aload 8
      // 4694: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 4697: ifeq 46b0
      // 469a: aload 8
      // 469c: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 469f: astore 15
      // 46a1: aload 15
      // 46a3: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 46a6: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Iron_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 46a9: bipush 0
      // 46aa: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 46ad: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 46b0: aload 8
      // 46b2: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 46b5: ifeq 46d7
      // 46b8: aload 8
      // 46ba: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 46bd: astore 14
      // 46bf: aload 14
      // 46c1: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 46c4: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Fur_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 46c7: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 46ca: checkcast java/lang/Boolean
      // 46cd: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 46d0: ifeq 46d7
      // 46d3: bipush 1
      // 46d4: goto 46d8
      // 46d7: bipush 0
      // 46d8: bipush 1
      // 46d9: if_icmpne 4736
      // 46dc: aload 1
      // 46dd: instanceof net/minecraft/server/level/ServerLevel
      // 46e0: ifeq 4718
      // 46e3: aload 1
      // 46e4: checkcast net/minecraft/server/level/ServerLevel
      // 46e7: astore 15
      // 46e9: new net/minecraft/world/entity/item/ItemEntity
      // 46ec: dup
      // 46ed: aload 15
      // 46ef: dload 2
      // 46f0: dload 4
      // 46f2: dload 6
      // 46f4: new net/minecraft/world/item/ItemStack
      // 46f7: dup
      // 46f8: getstatic net/mocreatures/init/MocreaturesModItems.FUR_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 46fb: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 46fe: checkcast net/minecraft/world/level/ItemLike
      // 4701: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 4704: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4707: astore 16
      // 4709: aload 16
      // 470b: bipush 10
      // 470d: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4710: aload 15
      // 4712: aload 16
      // 4714: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4717: pop
      // 4718: aload 8
      // 471a: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 471d: ifeq 4736
      // 4720: aload 8
      // 4722: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 4725: astore 15
      // 4727: aload 15
      // 4729: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 472c: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Fur_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 472f: bipush 0
      // 4730: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4733: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 4736: aload 8
      // 4738: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 473b: ifeq 475d
      // 473e: aload 8
      // 4740: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 4743: astore 14
      // 4745: aload 14
      // 4747: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 474a: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Reptile_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 474d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 4750: checkcast java/lang/Boolean
      // 4753: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4756: ifeq 475d
      // 4759: bipush 1
      // 475a: goto 475e
      // 475d: bipush 0
      // 475e: bipush 1
      // 475f: if_icmpne 47bc
      // 4762: aload 1
      // 4763: instanceof net/minecraft/server/level/ServerLevel
      // 4766: ifeq 479e
      // 4769: aload 1
      // 476a: checkcast net/minecraft/server/level/ServerLevel
      // 476d: astore 15
      // 476f: new net/minecraft/world/entity/item/ItemEntity
      // 4772: dup
      // 4773: aload 15
      // 4775: dload 2
      // 4776: dload 4
      // 4778: dload 6
      // 477a: new net/minecraft/world/item/ItemStack
      // 477d: dup
      // 477e: getstatic net/mocreatures/init/MocreaturesModItems.REPTILE_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 4781: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 4784: checkcast net/minecraft/world/level/ItemLike
      // 4787: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 478a: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 478d: astore 16
      // 478f: aload 16
      // 4791: bipush 10
      // 4793: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4796: aload 15
      // 4798: aload 16
      // 479a: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 479d: pop
      // 479e: aload 8
      // 47a0: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 47a3: ifeq 47bc
      // 47a6: aload 8
      // 47a8: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 47ab: astore 15
      // 47ad: aload 15
      // 47af: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 47b2: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Reptile_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 47b5: bipush 0
      // 47b6: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 47b9: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 47bc: aload 8
      // 47be: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 47c1: ifeq 47e3
      // 47c4: aload 8
      // 47c6: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 47c9: astore 14
      // 47cb: aload 14
      // 47cd: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 47d0: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Hide_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 47d3: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 47d6: checkcast java/lang/Boolean
      // 47d9: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 47dc: ifeq 47e3
      // 47df: bipush 1
      // 47e0: goto 47e4
      // 47e3: bipush 0
      // 47e4: bipush 1
      // 47e5: if_icmpne 4842
      // 47e8: aload 1
      // 47e9: instanceof net/minecraft/server/level/ServerLevel
      // 47ec: ifeq 4824
      // 47ef: aload 1
      // 47f0: checkcast net/minecraft/server/level/ServerLevel
      // 47f3: astore 15
      // 47f5: new net/minecraft/world/entity/item/ItemEntity
      // 47f8: dup
      // 47f9: aload 15
      // 47fb: dload 2
      // 47fc: dload 4
      // 47fe: dload 6
      // 4800: new net/minecraft/world/item/ItemStack
      // 4803: dup
      // 4804: getstatic net/mocreatures/init/MocreaturesModItems.HIDE_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 4807: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 480a: checkcast net/minecraft/world/level/ItemLike
      // 480d: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 4810: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4813: astore 16
      // 4815: aload 16
      // 4817: bipush 10
      // 4819: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 481c: aload 15
      // 481e: aload 16
      // 4820: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4823: pop
      // 4824: aload 8
      // 4826: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 4829: ifeq 4842
      // 482c: aload 8
      // 482e: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 4831: astore 15
      // 4833: aload 15
      // 4835: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4838: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Hide_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 483b: bipush 0
      // 483c: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 483f: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 4842: aload 8
      // 4844: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 4847: ifeq 4869
      // 484a: aload 8
      // 484c: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 484f: astore 14
      // 4851: aload 14
      // 4853: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4856: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Leather_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4859: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 485c: checkcast java/lang/Boolean
      // 485f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4862: ifeq 4869
      // 4865: bipush 1
      // 4866: goto 486a
      // 4869: bipush 0
      // 486a: bipush 1
      // 486b: if_icmpne 48c2
      // 486e: aload 1
      // 486f: instanceof net/minecraft/server/level/ServerLevel
      // 4872: ifeq 48a4
      // 4875: aload 1
      // 4876: checkcast net/minecraft/server/level/ServerLevel
      // 4879: astore 15
      // 487b: new net/minecraft/world/entity/item/ItemEntity
      // 487e: dup
      // 487f: aload 15
      // 4881: dload 2
      // 4882: dload 4
      // 4884: dload 6
      // 4886: new net/minecraft/world/item/ItemStack
      // 4889: dup
      // 488a: getstatic net/minecraft/world/item/Items.LEATHER_HELMET Lnet/minecraft/world/item/Item;
      // 488d: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 4890: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4893: astore 16
      // 4895: aload 16
      // 4897: bipush 10
      // 4899: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 489c: aload 15
      // 489e: aload 16
      // 48a0: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 48a3: pop
      // 48a4: aload 8
      // 48a6: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 48a9: ifeq 48c2
      // 48ac: aload 8
      // 48ae: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 48b1: astore 15
      // 48b3: aload 15
      // 48b5: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 48b8: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Leather_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 48bb: bipush 0
      // 48bc: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 48bf: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 48c2: aload 8
      // 48c4: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 48c7: ifeq 48e9
      // 48ca: aload 8
      // 48cc: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 48cf: astore 14
      // 48d1: aload 14
      // 48d3: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 48d6: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Frost_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 48d9: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 48dc: checkcast java/lang/Boolean
      // 48df: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 48e2: ifeq 48e9
      // 48e5: bipush 1
      // 48e6: goto 48ea
      // 48e9: bipush 0
      // 48ea: bipush 1
      // 48eb: if_icmpne 4948
      // 48ee: aload 1
      // 48ef: instanceof net/minecraft/server/level/ServerLevel
      // 48f2: ifeq 492a
      // 48f5: aload 1
      // 48f6: checkcast net/minecraft/server/level/ServerLevel
      // 48f9: astore 15
      // 48fb: new net/minecraft/world/entity/item/ItemEntity
      // 48fe: dup
      // 48ff: aload 15
      // 4901: dload 2
      // 4902: dload 4
      // 4904: dload 6
      // 4906: new net/minecraft/world/item/ItemStack
      // 4909: dup
      // 490a: getstatic net/mocreatures/init/MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 490d: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 4910: checkcast net/minecraft/world/level/ItemLike
      // 4913: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 4916: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4919: astore 16
      // 491b: aload 16
      // 491d: bipush 10
      // 491f: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4922: aload 15
      // 4924: aload 16
      // 4926: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4929: pop
      // 492a: aload 8
      // 492c: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 492f: ifeq 4948
      // 4932: aload 8
      // 4934: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 4937: astore 15
      // 4939: aload 15
      // 493b: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 493e: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Frost_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4941: bipush 0
      // 4942: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4945: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 4948: aload 8
      // 494a: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 494d: ifeq 496f
      // 4950: aload 8
      // 4952: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 4955: astore 14
      // 4957: aload 14
      // 4959: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 495c: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Dirt_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 495f: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 4962: checkcast java/lang/Boolean
      // 4965: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4968: ifeq 496f
      // 496b: bipush 1
      // 496c: goto 4970
      // 496f: bipush 0
      // 4970: bipush 1
      // 4971: if_icmpne 49ce
      // 4974: aload 1
      // 4975: instanceof net/minecraft/server/level/ServerLevel
      // 4978: ifeq 49b0
      // 497b: aload 1
      // 497c: checkcast net/minecraft/server/level/ServerLevel
      // 497f: astore 15
      // 4981: new net/minecraft/world/entity/item/ItemEntity
      // 4984: dup
      // 4985: aload 15
      // 4987: dload 2
      // 4988: dload 4
      // 498a: dload 6
      // 498c: new net/minecraft/world/item/ItemStack
      // 498f: dup
      // 4990: getstatic net/mocreatures/init/MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 4993: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 4996: checkcast net/minecraft/world/level/ItemLike
      // 4999: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 499c: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 499f: astore 16
      // 49a1: aload 16
      // 49a3: bipush 10
      // 49a5: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 49a8: aload 15
      // 49aa: aload 16
      // 49ac: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 49af: pop
      // 49b0: aload 8
      // 49b2: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 49b5: ifeq 49ce
      // 49b8: aload 8
      // 49ba: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 49bd: astore 15
      // 49bf: aload 15
      // 49c1: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 49c4: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Dirt_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 49c7: bipush 0
      // 49c8: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 49cb: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 49ce: aload 8
      // 49d0: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 49d3: ifeq 49f5
      // 49d6: aload 8
      // 49d8: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 49db: astore 14
      // 49dd: aload 14
      // 49df: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 49e2: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Nether_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 49e5: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 49e8: checkcast java/lang/Boolean
      // 49eb: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 49ee: ifeq 49f5
      // 49f1: bipush 1
      // 49f2: goto 49f6
      // 49f5: bipush 0
      // 49f6: bipush 1
      // 49f7: if_icmpne 4a54
      // 49fa: aload 1
      // 49fb: instanceof net/minecraft/server/level/ServerLevel
      // 49fe: ifeq 4a36
      // 4a01: aload 1
      // 4a02: checkcast net/minecraft/server/level/ServerLevel
      // 4a05: astore 15
      // 4a07: new net/minecraft/world/entity/item/ItemEntity
      // 4a0a: dup
      // 4a0b: aload 15
      // 4a0d: dload 2
      // 4a0e: dload 4
      // 4a10: dload 6
      // 4a12: new net/minecraft/world/item/ItemStack
      // 4a15: dup
      // 4a16: getstatic net/mocreatures/init/MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 4a19: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 4a1c: checkcast net/minecraft/world/level/ItemLike
      // 4a1f: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 4a22: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4a25: astore 16
      // 4a27: aload 16
      // 4a29: bipush 10
      // 4a2b: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4a2e: aload 15
      // 4a30: aload 16
      // 4a32: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4a35: pop
      // 4a36: aload 8
      // 4a38: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 4a3b: ifeq 4a54
      // 4a3e: aload 8
      // 4a40: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 4a43: astore 15
      // 4a45: aload 15
      // 4a47: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4a4a: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Nether_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4a4d: bipush 0
      // 4a4e: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4a51: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 4a54: aload 8
      // 4a56: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 4a59: ifeq 4a7b
      // 4a5c: aload 8
      // 4a5e: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 4a61: astore 14
      // 4a63: aload 14
      // 4a65: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4a68: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Undead_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4a6b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 4a6e: checkcast java/lang/Boolean
      // 4a71: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4a74: ifeq 4a7b
      // 4a77: bipush 1
      // 4a78: goto 4a7c
      // 4a7b: bipush 0
      // 4a7c: bipush 1
      // 4a7d: if_icmpne 4ada
      // 4a80: aload 1
      // 4a81: instanceof net/minecraft/server/level/ServerLevel
      // 4a84: ifeq 4abc
      // 4a87: aload 1
      // 4a88: checkcast net/minecraft/server/level/ServerLevel
      // 4a8b: astore 15
      // 4a8d: new net/minecraft/world/entity/item/ItemEntity
      // 4a90: dup
      // 4a91: aload 15
      // 4a93: dload 2
      // 4a94: dload 4
      // 4a96: dload 6
      // 4a98: new net/minecraft/world/item/ItemStack
      // 4a9b: dup
      // 4a9c: getstatic net/mocreatures/init/MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 4a9f: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 4aa2: checkcast net/minecraft/world/level/ItemLike
      // 4aa5: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 4aa8: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4aab: astore 16
      // 4aad: aload 16
      // 4aaf: bipush 10
      // 4ab1: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4ab4: aload 15
      // 4ab6: aload 16
      // 4ab8: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4abb: pop
      // 4abc: aload 8
      // 4abe: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 4ac1: ifeq 4ada
      // 4ac4: aload 8
      // 4ac6: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 4ac9: astore 15
      // 4acb: aload 15
      // 4acd: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4ad0: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Undead_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4ad3: bipush 0
      // 4ad4: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4ad7: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 4ada: aload 8
      // 4adc: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 4adf: ifeq 4b01
      // 4ae2: aload 8
      // 4ae4: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 4ae7: astore 14
      // 4ae9: aload 14
      // 4aeb: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4aee: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Netherite_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4af1: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 4af4: checkcast java/lang/Boolean
      // 4af7: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4afa: ifeq 4b01
      // 4afd: bipush 1
      // 4afe: goto 4b02
      // 4b01: bipush 0
      // 4b02: bipush 1
      // 4b03: if_icmpne 4b5a
      // 4b06: aload 1
      // 4b07: instanceof net/minecraft/server/level/ServerLevel
      // 4b0a: ifeq 4b3c
      // 4b0d: aload 1
      // 4b0e: checkcast net/minecraft/server/level/ServerLevel
      // 4b11: astore 15
      // 4b13: new net/minecraft/world/entity/item/ItemEntity
      // 4b16: dup
      // 4b17: aload 15
      // 4b19: dload 2
      // 4b1a: dload 4
      // 4b1c: dload 6
      // 4b1e: new net/minecraft/world/item/ItemStack
      // 4b21: dup
      // 4b22: getstatic net/minecraft/world/item/Items.NETHERITE_HELMET Lnet/minecraft/world/item/Item;
      // 4b25: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 4b28: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4b2b: astore 16
      // 4b2d: aload 16
      // 4b2f: bipush 10
      // 4b31: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4b34: aload 15
      // 4b36: aload 16
      // 4b38: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4b3b: pop
      // 4b3c: aload 8
      // 4b3e: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 4b41: ifeq 4b5a
      // 4b44: aload 8
      // 4b46: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 4b49: astore 15
      // 4b4b: aload 15
      // 4b4d: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4b50: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Netherite_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4b53: bipush 0
      // 4b54: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4b57: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 4b5a: aload 8
      // 4b5c: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 4b5f: ifeq 4b81
      // 4b62: aload 8
      // 4b64: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 4b67: astore 11
      // 4b69: aload 11
      // 4b6b: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4b6e: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Nether_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4b71: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 4b74: checkcast java/lang/Boolean
      // 4b77: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4b7a: ifeq 4b81
      // 4b7d: bipush 1
      // 4b7e: goto 4b82
      // 4b81: bipush 0
      // 4b82: ifne 52b8
      // 4b85: aload 9
      // 4b87: instanceof net/minecraft/world/entity/LivingEntity
      // 4b8a: ifeq 4b9c
      // 4b8d: aload 9
      // 4b8f: checkcast net/minecraft/world/entity/LivingEntity
      // 4b92: astore 12
      // 4b94: aload 12
      // 4b96: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 4b99: goto 4b9f
      // 4b9c: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 4b9f: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 4ba2: getstatic net/mocreatures/init/MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 4ba5: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 4ba8: if_acmpne 52b8
      // 4bab: aload 9
      // 4bad: instanceof net/minecraft/world/entity/player/Player
      // 4bb0: ifeq 4be5
      // 4bb3: aload 9
      // 4bb5: checkcast net/minecraft/world/entity/player/Player
      // 4bb8: astore 13
      // 4bba: new net/minecraft/world/item/ItemStack
      // 4bbd: dup
      // 4bbe: getstatic net/mocreatures/init/MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 4bc1: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 4bc4: checkcast net/minecraft/world/level/ItemLike
      // 4bc7: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 4bca: astore 14
      // 4bcc: aload 13
      // 4bce: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 4bd1: aload 14
      // 4bd3: invokedynamic test (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, net/mocreatures/procedures/UnihornedOstrichEquipment1Procedure.lambda$execute$12 (Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z, (Lnet/minecraft/world/item/ItemStack;)Z ]
      // 4bd8: bipush 1
      // 4bd9: aload 13
      // 4bdb: getfield net/minecraft/world/entity/player/Player.inventoryMenu Lnet/minecraft/world/inventory/InventoryMenu;
      // 4bde: invokevirtual net/minecraft/world/inventory/InventoryMenu.getCraftSlots ()Lnet/minecraft/world/inventory/CraftingContainer;
      // 4be1: invokevirtual net/minecraft/world/entity/player/Inventory.clearOrCountMatchingItems (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
      // 4be4: pop
      // 4be5: aload 8
      // 4be7: astore 13
      // 4be9: aload 13
      // 4beb: instanceof net/minecraft/world/entity/player/Player
      // 4bee: ifeq 4c20
      // 4bf1: aload 13
      // 4bf3: checkcast net/minecraft/world/entity/player/Player
      // 4bf6: astore 14
      // 4bf8: aload 14
      // 4bfa: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 4bfd: getfield net/minecraft/world/entity/player/Inventory.armor Lnet/minecraft/core/NonNullList;
      // 4c00: bipush 0
      // 4c01: new net/minecraft/world/item/ItemStack
      // 4c04: dup
      // 4c05: getstatic net/mocreatures/init/MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 4c08: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 4c0b: checkcast net/minecraft/world/level/ItemLike
      // 4c0e: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 4c11: invokevirtual net/minecraft/core/NonNullList.set (ILjava/lang/Object;)Ljava/lang/Object;
      // 4c14: pop
      // 4c15: aload 14
      // 4c17: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 4c1a: invokevirtual net/minecraft/world/entity/player/Inventory.setChanged ()V
      // 4c1d: goto 4c47
      // 4c20: aload 13
      // 4c22: instanceof net/minecraft/world/entity/LivingEntity
      // 4c25: ifeq 4c47
      // 4c28: aload 13
      // 4c2a: checkcast net/minecraft/world/entity/LivingEntity
      // 4c2d: astore 15
      // 4c2f: aload 15
      // 4c31: getstatic net/minecraft/world/entity/EquipmentSlot.FEET Lnet/minecraft/world/entity/EquipmentSlot;
      // 4c34: new net/minecraft/world/item/ItemStack
      // 4c37: dup
      // 4c38: getstatic net/mocreatures/init/MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 4c3b: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 4c3e: checkcast net/minecraft/world/level/ItemLike
      // 4c41: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 4c44: invokevirtual net/minecraft/world/entity/LivingEntity.setItemSlot (Lnet/minecraft/world/entity/EquipmentSlot;Lnet/minecraft/world/item/ItemStack;)V
      // 4c47: aload 8
      // 4c49: instanceof net/minecraft/world/entity/LivingEntity
      // 4c4c: ifeq 4c61
      // 4c4f: aload 8
      // 4c51: checkcast net/minecraft/world/entity/LivingEntity
      // 4c54: astore 13
      // 4c56: aload 13
      // 4c58: getstatic net/minecraft/world/entity/EquipmentSlot.FEET Lnet/minecraft/world/entity/EquipmentSlot;
      // 4c5b: invokevirtual net/minecraft/world/entity/LivingEntity.getItemBySlot (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
      // 4c5e: goto 4c64
      // 4c61: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 4c64: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 4c67: getstatic net/mocreatures/init/MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 4c6a: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 4c6d: if_acmpne 52b8
      // 4c70: aload 8
      // 4c72: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 4c75: ifeq 4c8e
      // 4c78: aload 8
      // 4c7a: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 4c7d: astore 14
      // 4c7f: aload 14
      // 4c81: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4c84: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Nether_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4c87: bipush 1
      // 4c88: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4c8b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 4c8e: aload 8
      // 4c90: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 4c93: ifeq 4cb5
      // 4c96: aload 8
      // 4c98: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 4c9b: astore 14
      // 4c9d: aload 14
      // 4c9f: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4ca2: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Gold_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4ca5: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 4ca8: checkcast java/lang/Boolean
      // 4cab: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4cae: ifeq 4cb5
      // 4cb1: bipush 1
      // 4cb2: goto 4cb6
      // 4cb5: bipush 0
      // 4cb6: bipush 1
      // 4cb7: if_icmpne 4d0e
      // 4cba: aload 1
      // 4cbb: instanceof net/minecraft/server/level/ServerLevel
      // 4cbe: ifeq 4cf0
      // 4cc1: aload 1
      // 4cc2: checkcast net/minecraft/server/level/ServerLevel
      // 4cc5: astore 15
      // 4cc7: new net/minecraft/world/entity/item/ItemEntity
      // 4cca: dup
      // 4ccb: aload 15
      // 4ccd: dload 2
      // 4cce: dload 4
      // 4cd0: dload 6
      // 4cd2: new net/minecraft/world/item/ItemStack
      // 4cd5: dup
      // 4cd6: getstatic net/minecraft/world/item/Items.GOLDEN_HELMET Lnet/minecraft/world/item/Item;
      // 4cd9: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 4cdc: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4cdf: astore 16
      // 4ce1: aload 16
      // 4ce3: bipush 10
      // 4ce5: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4ce8: aload 15
      // 4cea: aload 16
      // 4cec: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4cef: pop
      // 4cf0: aload 8
      // 4cf2: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 4cf5: ifeq 4d0e
      // 4cf8: aload 8
      // 4cfa: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 4cfd: astore 15
      // 4cff: aload 15
      // 4d01: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4d04: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Gold_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4d07: bipush 0
      // 4d08: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4d0b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 4d0e: aload 8
      // 4d10: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 4d13: ifeq 4d35
      // 4d16: aload 8
      // 4d18: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 4d1b: astore 14
      // 4d1d: aload 14
      // 4d1f: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4d22: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Diamond_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4d25: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 4d28: checkcast java/lang/Boolean
      // 4d2b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4d2e: ifeq 4d35
      // 4d31: bipush 1
      // 4d32: goto 4d36
      // 4d35: bipush 0
      // 4d36: bipush 1
      // 4d37: if_icmpne 4d8e
      // 4d3a: aload 1
      // 4d3b: instanceof net/minecraft/server/level/ServerLevel
      // 4d3e: ifeq 4d70
      // 4d41: aload 1
      // 4d42: checkcast net/minecraft/server/level/ServerLevel
      // 4d45: astore 15
      // 4d47: new net/minecraft/world/entity/item/ItemEntity
      // 4d4a: dup
      // 4d4b: aload 15
      // 4d4d: dload 2
      // 4d4e: dload 4
      // 4d50: dload 6
      // 4d52: new net/minecraft/world/item/ItemStack
      // 4d55: dup
      // 4d56: getstatic net/minecraft/world/item/Items.DIAMOND_HELMET Lnet/minecraft/world/item/Item;
      // 4d59: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 4d5c: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4d5f: astore 16
      // 4d61: aload 16
      // 4d63: bipush 10
      // 4d65: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4d68: aload 15
      // 4d6a: aload 16
      // 4d6c: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4d6f: pop
      // 4d70: aload 8
      // 4d72: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 4d75: ifeq 4d8e
      // 4d78: aload 8
      // 4d7a: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 4d7d: astore 15
      // 4d7f: aload 15
      // 4d81: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4d84: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Diamond_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4d87: bipush 0
      // 4d88: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4d8b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 4d8e: aload 8
      // 4d90: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 4d93: ifeq 4db5
      // 4d96: aload 8
      // 4d98: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 4d9b: astore 14
      // 4d9d: aload 14
      // 4d9f: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4da2: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Iron_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4da5: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 4da8: checkcast java/lang/Boolean
      // 4dab: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4dae: ifeq 4db5
      // 4db1: bipush 1
      // 4db2: goto 4db6
      // 4db5: bipush 0
      // 4db6: bipush 1
      // 4db7: if_icmpne 4e0e
      // 4dba: aload 1
      // 4dbb: instanceof net/minecraft/server/level/ServerLevel
      // 4dbe: ifeq 4df0
      // 4dc1: aload 1
      // 4dc2: checkcast net/minecraft/server/level/ServerLevel
      // 4dc5: astore 15
      // 4dc7: new net/minecraft/world/entity/item/ItemEntity
      // 4dca: dup
      // 4dcb: aload 15
      // 4dcd: dload 2
      // 4dce: dload 4
      // 4dd0: dload 6
      // 4dd2: new net/minecraft/world/item/ItemStack
      // 4dd5: dup
      // 4dd6: getstatic net/minecraft/world/item/Items.IRON_HELMET Lnet/minecraft/world/item/Item;
      // 4dd9: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 4ddc: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4ddf: astore 16
      // 4de1: aload 16
      // 4de3: bipush 10
      // 4de5: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4de8: aload 15
      // 4dea: aload 16
      // 4dec: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4def: pop
      // 4df0: aload 8
      // 4df2: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 4df5: ifeq 4e0e
      // 4df8: aload 8
      // 4dfa: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 4dfd: astore 15
      // 4dff: aload 15
      // 4e01: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4e04: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Iron_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4e07: bipush 0
      // 4e08: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4e0b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 4e0e: aload 8
      // 4e10: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 4e13: ifeq 4e35
      // 4e16: aload 8
      // 4e18: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 4e1b: astore 14
      // 4e1d: aload 14
      // 4e1f: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4e22: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Fur_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4e25: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 4e28: checkcast java/lang/Boolean
      // 4e2b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4e2e: ifeq 4e35
      // 4e31: bipush 1
      // 4e32: goto 4e36
      // 4e35: bipush 0
      // 4e36: bipush 1
      // 4e37: if_icmpne 4e94
      // 4e3a: aload 1
      // 4e3b: instanceof net/minecraft/server/level/ServerLevel
      // 4e3e: ifeq 4e76
      // 4e41: aload 1
      // 4e42: checkcast net/minecraft/server/level/ServerLevel
      // 4e45: astore 15
      // 4e47: new net/minecraft/world/entity/item/ItemEntity
      // 4e4a: dup
      // 4e4b: aload 15
      // 4e4d: dload 2
      // 4e4e: dload 4
      // 4e50: dload 6
      // 4e52: new net/minecraft/world/item/ItemStack
      // 4e55: dup
      // 4e56: getstatic net/mocreatures/init/MocreaturesModItems.FUR_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 4e59: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 4e5c: checkcast net/minecraft/world/level/ItemLike
      // 4e5f: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 4e62: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4e65: astore 16
      // 4e67: aload 16
      // 4e69: bipush 10
      // 4e6b: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4e6e: aload 15
      // 4e70: aload 16
      // 4e72: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4e75: pop
      // 4e76: aload 8
      // 4e78: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 4e7b: ifeq 4e94
      // 4e7e: aload 8
      // 4e80: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 4e83: astore 15
      // 4e85: aload 15
      // 4e87: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4e8a: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Fur_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4e8d: bipush 0
      // 4e8e: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4e91: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 4e94: aload 8
      // 4e96: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 4e99: ifeq 4ebb
      // 4e9c: aload 8
      // 4e9e: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 4ea1: astore 14
      // 4ea3: aload 14
      // 4ea5: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4ea8: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Reptile_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4eab: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 4eae: checkcast java/lang/Boolean
      // 4eb1: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4eb4: ifeq 4ebb
      // 4eb7: bipush 1
      // 4eb8: goto 4ebc
      // 4ebb: bipush 0
      // 4ebc: bipush 1
      // 4ebd: if_icmpne 4f1a
      // 4ec0: aload 1
      // 4ec1: instanceof net/minecraft/server/level/ServerLevel
      // 4ec4: ifeq 4efc
      // 4ec7: aload 1
      // 4ec8: checkcast net/minecraft/server/level/ServerLevel
      // 4ecb: astore 15
      // 4ecd: new net/minecraft/world/entity/item/ItemEntity
      // 4ed0: dup
      // 4ed1: aload 15
      // 4ed3: dload 2
      // 4ed4: dload 4
      // 4ed6: dload 6
      // 4ed8: new net/minecraft/world/item/ItemStack
      // 4edb: dup
      // 4edc: getstatic net/mocreatures/init/MocreaturesModItems.REPTILE_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 4edf: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 4ee2: checkcast net/minecraft/world/level/ItemLike
      // 4ee5: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 4ee8: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4eeb: astore 16
      // 4eed: aload 16
      // 4eef: bipush 10
      // 4ef1: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4ef4: aload 15
      // 4ef6: aload 16
      // 4ef8: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4efb: pop
      // 4efc: aload 8
      // 4efe: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 4f01: ifeq 4f1a
      // 4f04: aload 8
      // 4f06: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 4f09: astore 15
      // 4f0b: aload 15
      // 4f0d: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4f10: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Reptile_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4f13: bipush 0
      // 4f14: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4f17: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 4f1a: aload 8
      // 4f1c: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 4f1f: ifeq 4f41
      // 4f22: aload 8
      // 4f24: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 4f27: astore 14
      // 4f29: aload 14
      // 4f2b: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4f2e: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Hide_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4f31: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 4f34: checkcast java/lang/Boolean
      // 4f37: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4f3a: ifeq 4f41
      // 4f3d: bipush 1
      // 4f3e: goto 4f42
      // 4f41: bipush 0
      // 4f42: bipush 1
      // 4f43: if_icmpne 4fa0
      // 4f46: aload 1
      // 4f47: instanceof net/minecraft/server/level/ServerLevel
      // 4f4a: ifeq 4f82
      // 4f4d: aload 1
      // 4f4e: checkcast net/minecraft/server/level/ServerLevel
      // 4f51: astore 15
      // 4f53: new net/minecraft/world/entity/item/ItemEntity
      // 4f56: dup
      // 4f57: aload 15
      // 4f59: dload 2
      // 4f5a: dload 4
      // 4f5c: dload 6
      // 4f5e: new net/minecraft/world/item/ItemStack
      // 4f61: dup
      // 4f62: getstatic net/mocreatures/init/MocreaturesModItems.HIDE_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 4f65: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 4f68: checkcast net/minecraft/world/level/ItemLike
      // 4f6b: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 4f6e: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4f71: astore 16
      // 4f73: aload 16
      // 4f75: bipush 10
      // 4f77: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4f7a: aload 15
      // 4f7c: aload 16
      // 4f7e: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4f81: pop
      // 4f82: aload 8
      // 4f84: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 4f87: ifeq 4fa0
      // 4f8a: aload 8
      // 4f8c: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 4f8f: astore 15
      // 4f91: aload 15
      // 4f93: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4f96: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Hide_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4f99: bipush 0
      // 4f9a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4f9d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 4fa0: aload 8
      // 4fa2: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 4fa5: ifeq 4fc7
      // 4fa8: aload 8
      // 4faa: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 4fad: astore 14
      // 4faf: aload 14
      // 4fb1: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4fb4: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Leather_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4fb7: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 4fba: checkcast java/lang/Boolean
      // 4fbd: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4fc0: ifeq 4fc7
      // 4fc3: bipush 1
      // 4fc4: goto 4fc8
      // 4fc7: bipush 0
      // 4fc8: bipush 1
      // 4fc9: if_icmpne 5020
      // 4fcc: aload 1
      // 4fcd: instanceof net/minecraft/server/level/ServerLevel
      // 4fd0: ifeq 5002
      // 4fd3: aload 1
      // 4fd4: checkcast net/minecraft/server/level/ServerLevel
      // 4fd7: astore 15
      // 4fd9: new net/minecraft/world/entity/item/ItemEntity
      // 4fdc: dup
      // 4fdd: aload 15
      // 4fdf: dload 2
      // 4fe0: dload 4
      // 4fe2: dload 6
      // 4fe4: new net/minecraft/world/item/ItemStack
      // 4fe7: dup
      // 4fe8: getstatic net/minecraft/world/item/Items.LEATHER_HELMET Lnet/minecraft/world/item/Item;
      // 4feb: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 4fee: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4ff1: astore 16
      // 4ff3: aload 16
      // 4ff5: bipush 10
      // 4ff7: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4ffa: aload 15
      // 4ffc: aload 16
      // 4ffe: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5001: pop
      // 5002: aload 8
      // 5004: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 5007: ifeq 5020
      // 500a: aload 8
      // 500c: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 500f: astore 15
      // 5011: aload 15
      // 5013: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5016: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Leather_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5019: bipush 0
      // 501a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 501d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 5020: aload 8
      // 5022: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 5025: ifeq 5047
      // 5028: aload 8
      // 502a: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 502d: astore 14
      // 502f: aload 14
      // 5031: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5034: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Frost_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5037: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 503a: checkcast java/lang/Boolean
      // 503d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 5040: ifeq 5047
      // 5043: bipush 1
      // 5044: goto 5048
      // 5047: bipush 0
      // 5048: bipush 1
      // 5049: if_icmpne 50a6
      // 504c: aload 1
      // 504d: instanceof net/minecraft/server/level/ServerLevel
      // 5050: ifeq 5088
      // 5053: aload 1
      // 5054: checkcast net/minecraft/server/level/ServerLevel
      // 5057: astore 15
      // 5059: new net/minecraft/world/entity/item/ItemEntity
      // 505c: dup
      // 505d: aload 15
      // 505f: dload 2
      // 5060: dload 4
      // 5062: dload 6
      // 5064: new net/minecraft/world/item/ItemStack
      // 5067: dup
      // 5068: getstatic net/mocreatures/init/MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 506b: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 506e: checkcast net/minecraft/world/level/ItemLike
      // 5071: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 5074: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5077: astore 16
      // 5079: aload 16
      // 507b: bipush 10
      // 507d: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5080: aload 15
      // 5082: aload 16
      // 5084: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5087: pop
      // 5088: aload 8
      // 508a: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 508d: ifeq 50a6
      // 5090: aload 8
      // 5092: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 5095: astore 15
      // 5097: aload 15
      // 5099: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 509c: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Frost_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 509f: bipush 0
      // 50a0: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 50a3: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 50a6: aload 8
      // 50a8: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 50ab: ifeq 50cd
      // 50ae: aload 8
      // 50b0: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 50b3: astore 14
      // 50b5: aload 14
      // 50b7: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 50ba: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Dirt_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 50bd: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 50c0: checkcast java/lang/Boolean
      // 50c3: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 50c6: ifeq 50cd
      // 50c9: bipush 1
      // 50ca: goto 50ce
      // 50cd: bipush 0
      // 50ce: bipush 1
      // 50cf: if_icmpne 512c
      // 50d2: aload 1
      // 50d3: instanceof net/minecraft/server/level/ServerLevel
      // 50d6: ifeq 510e
      // 50d9: aload 1
      // 50da: checkcast net/minecraft/server/level/ServerLevel
      // 50dd: astore 15
      // 50df: new net/minecraft/world/entity/item/ItemEntity
      // 50e2: dup
      // 50e3: aload 15
      // 50e5: dload 2
      // 50e6: dload 4
      // 50e8: dload 6
      // 50ea: new net/minecraft/world/item/ItemStack
      // 50ed: dup
      // 50ee: getstatic net/mocreatures/init/MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 50f1: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 50f4: checkcast net/minecraft/world/level/ItemLike
      // 50f7: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 50fa: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 50fd: astore 16
      // 50ff: aload 16
      // 5101: bipush 10
      // 5103: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5106: aload 15
      // 5108: aload 16
      // 510a: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 510d: pop
      // 510e: aload 8
      // 5110: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 5113: ifeq 512c
      // 5116: aload 8
      // 5118: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 511b: astore 15
      // 511d: aload 15
      // 511f: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5122: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Dirt_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5125: bipush 0
      // 5126: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5129: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 512c: aload 8
      // 512e: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 5131: ifeq 5153
      // 5134: aload 8
      // 5136: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 5139: astore 14
      // 513b: aload 14
      // 513d: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5140: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Cave_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5143: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 5146: checkcast java/lang/Boolean
      // 5149: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 514c: ifeq 5153
      // 514f: bipush 1
      // 5150: goto 5154
      // 5153: bipush 0
      // 5154: bipush 1
      // 5155: if_icmpne 51b2
      // 5158: aload 1
      // 5159: instanceof net/minecraft/server/level/ServerLevel
      // 515c: ifeq 5194
      // 515f: aload 1
      // 5160: checkcast net/minecraft/server/level/ServerLevel
      // 5163: astore 15
      // 5165: new net/minecraft/world/entity/item/ItemEntity
      // 5168: dup
      // 5169: aload 15
      // 516b: dload 2
      // 516c: dload 4
      // 516e: dload 6
      // 5170: new net/minecraft/world/item/ItemStack
      // 5173: dup
      // 5174: getstatic net/mocreatures/init/MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 5177: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 517a: checkcast net/minecraft/world/level/ItemLike
      // 517d: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 5180: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5183: astore 16
      // 5185: aload 16
      // 5187: bipush 10
      // 5189: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 518c: aload 15
      // 518e: aload 16
      // 5190: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5193: pop
      // 5194: aload 8
      // 5196: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 5199: ifeq 51b2
      // 519c: aload 8
      // 519e: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 51a1: astore 15
      // 51a3: aload 15
      // 51a5: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 51a8: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Cave_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 51ab: bipush 0
      // 51ac: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 51af: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 51b2: aload 8
      // 51b4: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 51b7: ifeq 51d9
      // 51ba: aload 8
      // 51bc: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 51bf: astore 14
      // 51c1: aload 14
      // 51c3: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 51c6: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Undead_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 51c9: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 51cc: checkcast java/lang/Boolean
      // 51cf: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 51d2: ifeq 51d9
      // 51d5: bipush 1
      // 51d6: goto 51da
      // 51d9: bipush 0
      // 51da: bipush 1
      // 51db: if_icmpne 5238
      // 51de: aload 1
      // 51df: instanceof net/minecraft/server/level/ServerLevel
      // 51e2: ifeq 521a
      // 51e5: aload 1
      // 51e6: checkcast net/minecraft/server/level/ServerLevel
      // 51e9: astore 15
      // 51eb: new net/minecraft/world/entity/item/ItemEntity
      // 51ee: dup
      // 51ef: aload 15
      // 51f1: dload 2
      // 51f2: dload 4
      // 51f4: dload 6
      // 51f6: new net/minecraft/world/item/ItemStack
      // 51f9: dup
      // 51fa: getstatic net/mocreatures/init/MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 51fd: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 5200: checkcast net/minecraft/world/level/ItemLike
      // 5203: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 5206: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5209: astore 16
      // 520b: aload 16
      // 520d: bipush 10
      // 520f: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5212: aload 15
      // 5214: aload 16
      // 5216: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5219: pop
      // 521a: aload 8
      // 521c: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 521f: ifeq 5238
      // 5222: aload 8
      // 5224: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 5227: astore 15
      // 5229: aload 15
      // 522b: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 522e: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Undead_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5231: bipush 0
      // 5232: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5235: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 5238: aload 8
      // 523a: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 523d: ifeq 525f
      // 5240: aload 8
      // 5242: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 5245: astore 14
      // 5247: aload 14
      // 5249: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 524c: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Netherite_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 524f: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 5252: checkcast java/lang/Boolean
      // 5255: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 5258: ifeq 525f
      // 525b: bipush 1
      // 525c: goto 5260
      // 525f: bipush 0
      // 5260: bipush 1
      // 5261: if_icmpne 52b8
      // 5264: aload 1
      // 5265: instanceof net/minecraft/server/level/ServerLevel
      // 5268: ifeq 529a
      // 526b: aload 1
      // 526c: checkcast net/minecraft/server/level/ServerLevel
      // 526f: astore 15
      // 5271: new net/minecraft/world/entity/item/ItemEntity
      // 5274: dup
      // 5275: aload 15
      // 5277: dload 2
      // 5278: dload 4
      // 527a: dload 6
      // 527c: new net/minecraft/world/item/ItemStack
      // 527f: dup
      // 5280: getstatic net/minecraft/world/item/Items.NETHERITE_HELMET Lnet/minecraft/world/item/Item;
      // 5283: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 5286: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5289: astore 16
      // 528b: aload 16
      // 528d: bipush 10
      // 528f: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5292: aload 15
      // 5294: aload 16
      // 5296: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5299: pop
      // 529a: aload 8
      // 529c: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 529f: ifeq 52b8
      // 52a2: aload 8
      // 52a4: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 52a7: astore 15
      // 52a9: aload 15
      // 52ab: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 52ae: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Netherite_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 52b1: bipush 0
      // 52b2: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 52b5: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 52b8: aload 8
      // 52ba: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 52bd: ifeq 52df
      // 52c0: aload 8
      // 52c2: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 52c5: astore 11
      // 52c7: aload 11
      // 52c9: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 52cc: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Undead_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 52cf: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 52d2: checkcast java/lang/Boolean
      // 52d5: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 52d8: ifeq 52df
      // 52db: bipush 1
      // 52dc: goto 52e0
      // 52df: bipush 0
      // 52e0: ifne 5a16
      // 52e3: aload 9
      // 52e5: instanceof net/minecraft/world/entity/LivingEntity
      // 52e8: ifeq 52fa
      // 52eb: aload 9
      // 52ed: checkcast net/minecraft/world/entity/LivingEntity
      // 52f0: astore 12
      // 52f2: aload 12
      // 52f4: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 52f7: goto 52fd
      // 52fa: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 52fd: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 5300: getstatic net/mocreatures/init/MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 5303: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 5306: if_acmpne 5a16
      // 5309: aload 9
      // 530b: instanceof net/minecraft/world/entity/player/Player
      // 530e: ifeq 5343
      // 5311: aload 9
      // 5313: checkcast net/minecraft/world/entity/player/Player
      // 5316: astore 13
      // 5318: new net/minecraft/world/item/ItemStack
      // 531b: dup
      // 531c: getstatic net/mocreatures/init/MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 531f: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 5322: checkcast net/minecraft/world/level/ItemLike
      // 5325: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 5328: astore 14
      // 532a: aload 13
      // 532c: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 532f: aload 14
      // 5331: invokedynamic test (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, net/mocreatures/procedures/UnihornedOstrichEquipment1Procedure.lambda$execute$13 (Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z, (Lnet/minecraft/world/item/ItemStack;)Z ]
      // 5336: bipush 1
      // 5337: aload 13
      // 5339: getfield net/minecraft/world/entity/player/Player.inventoryMenu Lnet/minecraft/world/inventory/InventoryMenu;
      // 533c: invokevirtual net/minecraft/world/inventory/InventoryMenu.getCraftSlots ()Lnet/minecraft/world/inventory/CraftingContainer;
      // 533f: invokevirtual net/minecraft/world/entity/player/Inventory.clearOrCountMatchingItems (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
      // 5342: pop
      // 5343: aload 8
      // 5345: astore 13
      // 5347: aload 13
      // 5349: instanceof net/minecraft/world/entity/player/Player
      // 534c: ifeq 537e
      // 534f: aload 13
      // 5351: checkcast net/minecraft/world/entity/player/Player
      // 5354: astore 14
      // 5356: aload 14
      // 5358: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 535b: getfield net/minecraft/world/entity/player/Inventory.armor Lnet/minecraft/core/NonNullList;
      // 535e: bipush 0
      // 535f: new net/minecraft/world/item/ItemStack
      // 5362: dup
      // 5363: getstatic net/mocreatures/init/MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 5366: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 5369: checkcast net/minecraft/world/level/ItemLike
      // 536c: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 536f: invokevirtual net/minecraft/core/NonNullList.set (ILjava/lang/Object;)Ljava/lang/Object;
      // 5372: pop
      // 5373: aload 14
      // 5375: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 5378: invokevirtual net/minecraft/world/entity/player/Inventory.setChanged ()V
      // 537b: goto 53a5
      // 537e: aload 13
      // 5380: instanceof net/minecraft/world/entity/LivingEntity
      // 5383: ifeq 53a5
      // 5386: aload 13
      // 5388: checkcast net/minecraft/world/entity/LivingEntity
      // 538b: astore 15
      // 538d: aload 15
      // 538f: getstatic net/minecraft/world/entity/EquipmentSlot.FEET Lnet/minecraft/world/entity/EquipmentSlot;
      // 5392: new net/minecraft/world/item/ItemStack
      // 5395: dup
      // 5396: getstatic net/mocreatures/init/MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 5399: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 539c: checkcast net/minecraft/world/level/ItemLike
      // 539f: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 53a2: invokevirtual net/minecraft/world/entity/LivingEntity.setItemSlot (Lnet/minecraft/world/entity/EquipmentSlot;Lnet/minecraft/world/item/ItemStack;)V
      // 53a5: aload 8
      // 53a7: instanceof net/minecraft/world/entity/LivingEntity
      // 53aa: ifeq 53bf
      // 53ad: aload 8
      // 53af: checkcast net/minecraft/world/entity/LivingEntity
      // 53b2: astore 13
      // 53b4: aload 13
      // 53b6: getstatic net/minecraft/world/entity/EquipmentSlot.FEET Lnet/minecraft/world/entity/EquipmentSlot;
      // 53b9: invokevirtual net/minecraft/world/entity/LivingEntity.getItemBySlot (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
      // 53bc: goto 53c2
      // 53bf: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 53c2: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 53c5: getstatic net/mocreatures/init/MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 53c8: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 53cb: if_acmpne 5a16
      // 53ce: aload 8
      // 53d0: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 53d3: ifeq 53ec
      // 53d6: aload 8
      // 53d8: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 53db: astore 14
      // 53dd: aload 14
      // 53df: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 53e2: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Undead_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 53e5: bipush 1
      // 53e6: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 53e9: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 53ec: aload 8
      // 53ee: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 53f1: ifeq 5413
      // 53f4: aload 8
      // 53f6: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 53f9: astore 14
      // 53fb: aload 14
      // 53fd: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5400: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Gold_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5403: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 5406: checkcast java/lang/Boolean
      // 5409: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 540c: ifeq 5413
      // 540f: bipush 1
      // 5410: goto 5414
      // 5413: bipush 0
      // 5414: bipush 1
      // 5415: if_icmpne 546c
      // 5418: aload 1
      // 5419: instanceof net/minecraft/server/level/ServerLevel
      // 541c: ifeq 544e
      // 541f: aload 1
      // 5420: checkcast net/minecraft/server/level/ServerLevel
      // 5423: astore 15
      // 5425: new net/minecraft/world/entity/item/ItemEntity
      // 5428: dup
      // 5429: aload 15
      // 542b: dload 2
      // 542c: dload 4
      // 542e: dload 6
      // 5430: new net/minecraft/world/item/ItemStack
      // 5433: dup
      // 5434: getstatic net/minecraft/world/item/Items.GOLDEN_HELMET Lnet/minecraft/world/item/Item;
      // 5437: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 543a: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 543d: astore 16
      // 543f: aload 16
      // 5441: bipush 10
      // 5443: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5446: aload 15
      // 5448: aload 16
      // 544a: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 544d: pop
      // 544e: aload 8
      // 5450: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 5453: ifeq 546c
      // 5456: aload 8
      // 5458: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 545b: astore 15
      // 545d: aload 15
      // 545f: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5462: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Gold_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5465: bipush 0
      // 5466: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5469: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 546c: aload 8
      // 546e: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 5471: ifeq 5493
      // 5474: aload 8
      // 5476: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 5479: astore 14
      // 547b: aload 14
      // 547d: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5480: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Diamond_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5483: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 5486: checkcast java/lang/Boolean
      // 5489: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 548c: ifeq 5493
      // 548f: bipush 1
      // 5490: goto 5494
      // 5493: bipush 0
      // 5494: bipush 1
      // 5495: if_icmpne 54ec
      // 5498: aload 1
      // 5499: instanceof net/minecraft/server/level/ServerLevel
      // 549c: ifeq 54ce
      // 549f: aload 1
      // 54a0: checkcast net/minecraft/server/level/ServerLevel
      // 54a3: astore 15
      // 54a5: new net/minecraft/world/entity/item/ItemEntity
      // 54a8: dup
      // 54a9: aload 15
      // 54ab: dload 2
      // 54ac: dload 4
      // 54ae: dload 6
      // 54b0: new net/minecraft/world/item/ItemStack
      // 54b3: dup
      // 54b4: getstatic net/minecraft/world/item/Items.DIAMOND_HELMET Lnet/minecraft/world/item/Item;
      // 54b7: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 54ba: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 54bd: astore 16
      // 54bf: aload 16
      // 54c1: bipush 10
      // 54c3: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 54c6: aload 15
      // 54c8: aload 16
      // 54ca: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 54cd: pop
      // 54ce: aload 8
      // 54d0: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 54d3: ifeq 54ec
      // 54d6: aload 8
      // 54d8: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 54db: astore 15
      // 54dd: aload 15
      // 54df: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 54e2: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Diamond_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 54e5: bipush 0
      // 54e6: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 54e9: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 54ec: aload 8
      // 54ee: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 54f1: ifeq 5513
      // 54f4: aload 8
      // 54f6: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 54f9: astore 14
      // 54fb: aload 14
      // 54fd: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5500: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Iron_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5503: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 5506: checkcast java/lang/Boolean
      // 5509: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 550c: ifeq 5513
      // 550f: bipush 1
      // 5510: goto 5514
      // 5513: bipush 0
      // 5514: bipush 1
      // 5515: if_icmpne 556c
      // 5518: aload 1
      // 5519: instanceof net/minecraft/server/level/ServerLevel
      // 551c: ifeq 554e
      // 551f: aload 1
      // 5520: checkcast net/minecraft/server/level/ServerLevel
      // 5523: astore 15
      // 5525: new net/minecraft/world/entity/item/ItemEntity
      // 5528: dup
      // 5529: aload 15
      // 552b: dload 2
      // 552c: dload 4
      // 552e: dload 6
      // 5530: new net/minecraft/world/item/ItemStack
      // 5533: dup
      // 5534: getstatic net/minecraft/world/item/Items.IRON_HELMET Lnet/minecraft/world/item/Item;
      // 5537: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 553a: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 553d: astore 16
      // 553f: aload 16
      // 5541: bipush 10
      // 5543: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5546: aload 15
      // 5548: aload 16
      // 554a: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 554d: pop
      // 554e: aload 8
      // 5550: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 5553: ifeq 556c
      // 5556: aload 8
      // 5558: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 555b: astore 15
      // 555d: aload 15
      // 555f: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5562: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Iron_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5565: bipush 0
      // 5566: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5569: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 556c: aload 8
      // 556e: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 5571: ifeq 5593
      // 5574: aload 8
      // 5576: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 5579: astore 14
      // 557b: aload 14
      // 557d: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5580: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Fur_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5583: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 5586: checkcast java/lang/Boolean
      // 5589: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 558c: ifeq 5593
      // 558f: bipush 1
      // 5590: goto 5594
      // 5593: bipush 0
      // 5594: bipush 1
      // 5595: if_icmpne 55f2
      // 5598: aload 1
      // 5599: instanceof net/minecraft/server/level/ServerLevel
      // 559c: ifeq 55d4
      // 559f: aload 1
      // 55a0: checkcast net/minecraft/server/level/ServerLevel
      // 55a3: astore 15
      // 55a5: new net/minecraft/world/entity/item/ItemEntity
      // 55a8: dup
      // 55a9: aload 15
      // 55ab: dload 2
      // 55ac: dload 4
      // 55ae: dload 6
      // 55b0: new net/minecraft/world/item/ItemStack
      // 55b3: dup
      // 55b4: getstatic net/mocreatures/init/MocreaturesModItems.FUR_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 55b7: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 55ba: checkcast net/minecraft/world/level/ItemLike
      // 55bd: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 55c0: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 55c3: astore 16
      // 55c5: aload 16
      // 55c7: bipush 10
      // 55c9: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 55cc: aload 15
      // 55ce: aload 16
      // 55d0: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 55d3: pop
      // 55d4: aload 8
      // 55d6: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 55d9: ifeq 55f2
      // 55dc: aload 8
      // 55de: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 55e1: astore 15
      // 55e3: aload 15
      // 55e5: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 55e8: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Fur_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 55eb: bipush 0
      // 55ec: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 55ef: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 55f2: aload 8
      // 55f4: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 55f7: ifeq 5619
      // 55fa: aload 8
      // 55fc: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 55ff: astore 14
      // 5601: aload 14
      // 5603: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5606: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Reptile_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5609: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 560c: checkcast java/lang/Boolean
      // 560f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 5612: ifeq 5619
      // 5615: bipush 1
      // 5616: goto 561a
      // 5619: bipush 0
      // 561a: bipush 1
      // 561b: if_icmpne 5678
      // 561e: aload 1
      // 561f: instanceof net/minecraft/server/level/ServerLevel
      // 5622: ifeq 565a
      // 5625: aload 1
      // 5626: checkcast net/minecraft/server/level/ServerLevel
      // 5629: astore 15
      // 562b: new net/minecraft/world/entity/item/ItemEntity
      // 562e: dup
      // 562f: aload 15
      // 5631: dload 2
      // 5632: dload 4
      // 5634: dload 6
      // 5636: new net/minecraft/world/item/ItemStack
      // 5639: dup
      // 563a: getstatic net/mocreatures/init/MocreaturesModItems.REPTILE_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 563d: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 5640: checkcast net/minecraft/world/level/ItemLike
      // 5643: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 5646: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5649: astore 16
      // 564b: aload 16
      // 564d: bipush 10
      // 564f: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5652: aload 15
      // 5654: aload 16
      // 5656: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5659: pop
      // 565a: aload 8
      // 565c: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 565f: ifeq 5678
      // 5662: aload 8
      // 5664: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 5667: astore 15
      // 5669: aload 15
      // 566b: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 566e: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Reptile_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5671: bipush 0
      // 5672: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5675: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 5678: aload 8
      // 567a: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 567d: ifeq 569f
      // 5680: aload 8
      // 5682: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 5685: astore 14
      // 5687: aload 14
      // 5689: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 568c: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Hide_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 568f: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 5692: checkcast java/lang/Boolean
      // 5695: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 5698: ifeq 569f
      // 569b: bipush 1
      // 569c: goto 56a0
      // 569f: bipush 0
      // 56a0: bipush 1
      // 56a1: if_icmpne 56fe
      // 56a4: aload 1
      // 56a5: instanceof net/minecraft/server/level/ServerLevel
      // 56a8: ifeq 56e0
      // 56ab: aload 1
      // 56ac: checkcast net/minecraft/server/level/ServerLevel
      // 56af: astore 15
      // 56b1: new net/minecraft/world/entity/item/ItemEntity
      // 56b4: dup
      // 56b5: aload 15
      // 56b7: dload 2
      // 56b8: dload 4
      // 56ba: dload 6
      // 56bc: new net/minecraft/world/item/ItemStack
      // 56bf: dup
      // 56c0: getstatic net/mocreatures/init/MocreaturesModItems.HIDE_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 56c3: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 56c6: checkcast net/minecraft/world/level/ItemLike
      // 56c9: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 56cc: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 56cf: astore 16
      // 56d1: aload 16
      // 56d3: bipush 10
      // 56d5: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 56d8: aload 15
      // 56da: aload 16
      // 56dc: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 56df: pop
      // 56e0: aload 8
      // 56e2: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 56e5: ifeq 56fe
      // 56e8: aload 8
      // 56ea: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 56ed: astore 15
      // 56ef: aload 15
      // 56f1: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 56f4: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Hide_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 56f7: bipush 0
      // 56f8: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 56fb: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 56fe: aload 8
      // 5700: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 5703: ifeq 5725
      // 5706: aload 8
      // 5708: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 570b: astore 14
      // 570d: aload 14
      // 570f: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5712: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Leather_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5715: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 5718: checkcast java/lang/Boolean
      // 571b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 571e: ifeq 5725
      // 5721: bipush 1
      // 5722: goto 5726
      // 5725: bipush 0
      // 5726: bipush 1
      // 5727: if_icmpne 577e
      // 572a: aload 1
      // 572b: instanceof net/minecraft/server/level/ServerLevel
      // 572e: ifeq 5760
      // 5731: aload 1
      // 5732: checkcast net/minecraft/server/level/ServerLevel
      // 5735: astore 15
      // 5737: new net/minecraft/world/entity/item/ItemEntity
      // 573a: dup
      // 573b: aload 15
      // 573d: dload 2
      // 573e: dload 4
      // 5740: dload 6
      // 5742: new net/minecraft/world/item/ItemStack
      // 5745: dup
      // 5746: getstatic net/minecraft/world/item/Items.LEATHER_HELMET Lnet/minecraft/world/item/Item;
      // 5749: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 574c: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 574f: astore 16
      // 5751: aload 16
      // 5753: bipush 10
      // 5755: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5758: aload 15
      // 575a: aload 16
      // 575c: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 575f: pop
      // 5760: aload 8
      // 5762: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 5765: ifeq 577e
      // 5768: aload 8
      // 576a: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 576d: astore 15
      // 576f: aload 15
      // 5771: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5774: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Leather_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5777: bipush 0
      // 5778: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 577b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 577e: aload 8
      // 5780: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 5783: ifeq 57a5
      // 5786: aload 8
      // 5788: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 578b: astore 14
      // 578d: aload 14
      // 578f: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5792: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Frost_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5795: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 5798: checkcast java/lang/Boolean
      // 579b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 579e: ifeq 57a5
      // 57a1: bipush 1
      // 57a2: goto 57a6
      // 57a5: bipush 0
      // 57a6: bipush 1
      // 57a7: if_icmpne 5804
      // 57aa: aload 1
      // 57ab: instanceof net/minecraft/server/level/ServerLevel
      // 57ae: ifeq 57e6
      // 57b1: aload 1
      // 57b2: checkcast net/minecraft/server/level/ServerLevel
      // 57b5: astore 15
      // 57b7: new net/minecraft/world/entity/item/ItemEntity
      // 57ba: dup
      // 57bb: aload 15
      // 57bd: dload 2
      // 57be: dload 4
      // 57c0: dload 6
      // 57c2: new net/minecraft/world/item/ItemStack
      // 57c5: dup
      // 57c6: getstatic net/mocreatures/init/MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 57c9: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 57cc: checkcast net/minecraft/world/level/ItemLike
      // 57cf: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 57d2: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 57d5: astore 16
      // 57d7: aload 16
      // 57d9: bipush 10
      // 57db: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 57de: aload 15
      // 57e0: aload 16
      // 57e2: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 57e5: pop
      // 57e6: aload 8
      // 57e8: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 57eb: ifeq 5804
      // 57ee: aload 8
      // 57f0: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 57f3: astore 15
      // 57f5: aload 15
      // 57f7: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 57fa: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Frost_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 57fd: bipush 0
      // 57fe: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5801: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 5804: aload 8
      // 5806: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 5809: ifeq 582b
      // 580c: aload 8
      // 580e: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 5811: astore 14
      // 5813: aload 14
      // 5815: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5818: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Dirt_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 581b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 581e: checkcast java/lang/Boolean
      // 5821: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 5824: ifeq 582b
      // 5827: bipush 1
      // 5828: goto 582c
      // 582b: bipush 0
      // 582c: bipush 1
      // 582d: if_icmpne 588a
      // 5830: aload 1
      // 5831: instanceof net/minecraft/server/level/ServerLevel
      // 5834: ifeq 586c
      // 5837: aload 1
      // 5838: checkcast net/minecraft/server/level/ServerLevel
      // 583b: astore 15
      // 583d: new net/minecraft/world/entity/item/ItemEntity
      // 5840: dup
      // 5841: aload 15
      // 5843: dload 2
      // 5844: dload 4
      // 5846: dload 6
      // 5848: new net/minecraft/world/item/ItemStack
      // 584b: dup
      // 584c: getstatic net/mocreatures/init/MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 584f: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 5852: checkcast net/minecraft/world/level/ItemLike
      // 5855: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 5858: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 585b: astore 16
      // 585d: aload 16
      // 585f: bipush 10
      // 5861: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5864: aload 15
      // 5866: aload 16
      // 5868: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 586b: pop
      // 586c: aload 8
      // 586e: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 5871: ifeq 588a
      // 5874: aload 8
      // 5876: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 5879: astore 15
      // 587b: aload 15
      // 587d: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5880: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Dirt_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5883: bipush 0
      // 5884: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5887: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 588a: aload 8
      // 588c: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 588f: ifeq 58b1
      // 5892: aload 8
      // 5894: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 5897: astore 14
      // 5899: aload 14
      // 589b: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 589e: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Cave_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 58a1: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 58a4: checkcast java/lang/Boolean
      // 58a7: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 58aa: ifeq 58b1
      // 58ad: bipush 1
      // 58ae: goto 58b2
      // 58b1: bipush 0
      // 58b2: bipush 1
      // 58b3: if_icmpne 5910
      // 58b6: aload 1
      // 58b7: instanceof net/minecraft/server/level/ServerLevel
      // 58ba: ifeq 58f2
      // 58bd: aload 1
      // 58be: checkcast net/minecraft/server/level/ServerLevel
      // 58c1: astore 15
      // 58c3: new net/minecraft/world/entity/item/ItemEntity
      // 58c6: dup
      // 58c7: aload 15
      // 58c9: dload 2
      // 58ca: dload 4
      // 58cc: dload 6
      // 58ce: new net/minecraft/world/item/ItemStack
      // 58d1: dup
      // 58d2: getstatic net/mocreatures/init/MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 58d5: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 58d8: checkcast net/minecraft/world/level/ItemLike
      // 58db: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 58de: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 58e1: astore 16
      // 58e3: aload 16
      // 58e5: bipush 10
      // 58e7: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 58ea: aload 15
      // 58ec: aload 16
      // 58ee: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 58f1: pop
      // 58f2: aload 8
      // 58f4: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 58f7: ifeq 5910
      // 58fa: aload 8
      // 58fc: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 58ff: astore 15
      // 5901: aload 15
      // 5903: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5906: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Cave_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5909: bipush 0
      // 590a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 590d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 5910: aload 8
      // 5912: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 5915: ifeq 5937
      // 5918: aload 8
      // 591a: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 591d: astore 14
      // 591f: aload 14
      // 5921: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5924: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Nether_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5927: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 592a: checkcast java/lang/Boolean
      // 592d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 5930: ifeq 5937
      // 5933: bipush 1
      // 5934: goto 5938
      // 5937: bipush 0
      // 5938: bipush 1
      // 5939: if_icmpne 5996
      // 593c: aload 1
      // 593d: instanceof net/minecraft/server/level/ServerLevel
      // 5940: ifeq 5978
      // 5943: aload 1
      // 5944: checkcast net/minecraft/server/level/ServerLevel
      // 5947: astore 15
      // 5949: new net/minecraft/world/entity/item/ItemEntity
      // 594c: dup
      // 594d: aload 15
      // 594f: dload 2
      // 5950: dload 4
      // 5952: dload 6
      // 5954: new net/minecraft/world/item/ItemStack
      // 5957: dup
      // 5958: getstatic net/mocreatures/init/MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 595b: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 595e: checkcast net/minecraft/world/level/ItemLike
      // 5961: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 5964: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5967: astore 16
      // 5969: aload 16
      // 596b: bipush 10
      // 596d: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5970: aload 15
      // 5972: aload 16
      // 5974: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5977: pop
      // 5978: aload 8
      // 597a: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 597d: ifeq 5996
      // 5980: aload 8
      // 5982: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 5985: astore 15
      // 5987: aload 15
      // 5989: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 598c: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Nether_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 598f: bipush 0
      // 5990: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5993: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 5996: aload 8
      // 5998: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 599b: ifeq 59bd
      // 599e: aload 8
      // 59a0: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 59a3: astore 14
      // 59a5: aload 14
      // 59a7: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 59aa: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Netherite_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 59ad: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 59b0: checkcast java/lang/Boolean
      // 59b3: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 59b6: ifeq 59bd
      // 59b9: bipush 1
      // 59ba: goto 59be
      // 59bd: bipush 0
      // 59be: bipush 1
      // 59bf: if_icmpne 5a16
      // 59c2: aload 1
      // 59c3: instanceof net/minecraft/server/level/ServerLevel
      // 59c6: ifeq 59f8
      // 59c9: aload 1
      // 59ca: checkcast net/minecraft/server/level/ServerLevel
      // 59cd: astore 15
      // 59cf: new net/minecraft/world/entity/item/ItemEntity
      // 59d2: dup
      // 59d3: aload 15
      // 59d5: dload 2
      // 59d6: dload 4
      // 59d8: dload 6
      // 59da: new net/minecraft/world/item/ItemStack
      // 59dd: dup
      // 59de: getstatic net/minecraft/world/item/Items.NETHERITE_HELMET Lnet/minecraft/world/item/Item;
      // 59e1: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 59e4: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 59e7: astore 16
      // 59e9: aload 16
      // 59eb: bipush 10
      // 59ed: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 59f0: aload 15
      // 59f2: aload 16
      // 59f4: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 59f7: pop
      // 59f8: aload 8
      // 59fa: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 59fd: ifeq 5a16
      // 5a00: aload 8
      // 5a02: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 5a05: astore 15
      // 5a07: aload 15
      // 5a09: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5a0c: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Netherite_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5a0f: bipush 0
      // 5a10: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5a13: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 5a16: aload 8
      // 5a18: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 5a1b: ifeq 5a3d
      // 5a1e: aload 8
      // 5a20: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 5a23: astore 11
      // 5a25: aload 11
      // 5a27: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5a2a: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Netherite_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5a2d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 5a30: checkcast java/lang/Boolean
      // 5a33: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 5a36: ifeq 5a3d
      // 5a39: bipush 1
      // 5a3a: goto 5a3e
      // 5a3d: bipush 0
      // 5a3e: ifne 6162
      // 5a41: aload 9
      // 5a43: instanceof net/minecraft/world/entity/LivingEntity
      // 5a46: ifeq 5a58
      // 5a49: aload 9
      // 5a4b: checkcast net/minecraft/world/entity/LivingEntity
      // 5a4e: astore 12
      // 5a50: aload 12
      // 5a52: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 5a55: goto 5a5b
      // 5a58: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 5a5b: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 5a5e: getstatic net/minecraft/world/item/Items.NETHERITE_HELMET Lnet/minecraft/world/item/Item;
      // 5a61: if_acmpne 6162
      // 5a64: aload 9
      // 5a66: instanceof net/minecraft/world/entity/player/Player
      // 5a69: ifeq 5a98
      // 5a6c: aload 9
      // 5a6e: checkcast net/minecraft/world/entity/player/Player
      // 5a71: astore 13
      // 5a73: new net/minecraft/world/item/ItemStack
      // 5a76: dup
      // 5a77: getstatic net/minecraft/world/item/Items.NETHERITE_HELMET Lnet/minecraft/world/item/Item;
      // 5a7a: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 5a7d: astore 14
      // 5a7f: aload 13
      // 5a81: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 5a84: aload 14
      // 5a86: invokedynamic test (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, net/mocreatures/procedures/UnihornedOstrichEquipment1Procedure.lambda$execute$14 (Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z, (Lnet/minecraft/world/item/ItemStack;)Z ]
      // 5a8b: bipush 1
      // 5a8c: aload 13
      // 5a8e: getfield net/minecraft/world/entity/player/Player.inventoryMenu Lnet/minecraft/world/inventory/InventoryMenu;
      // 5a91: invokevirtual net/minecraft/world/inventory/InventoryMenu.getCraftSlots ()Lnet/minecraft/world/inventory/CraftingContainer;
      // 5a94: invokevirtual net/minecraft/world/entity/player/Inventory.clearOrCountMatchingItems (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
      // 5a97: pop
      // 5a98: aload 8
      // 5a9a: astore 13
      // 5a9c: aload 13
      // 5a9e: instanceof net/minecraft/world/entity/player/Player
      // 5aa1: ifeq 5acd
      // 5aa4: aload 13
      // 5aa6: checkcast net/minecraft/world/entity/player/Player
      // 5aa9: astore 14
      // 5aab: aload 14
      // 5aad: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 5ab0: getfield net/minecraft/world/entity/player/Inventory.armor Lnet/minecraft/core/NonNullList;
      // 5ab3: bipush 0
      // 5ab4: new net/minecraft/world/item/ItemStack
      // 5ab7: dup
      // 5ab8: getstatic net/minecraft/world/item/Items.NETHERITE_HELMET Lnet/minecraft/world/item/Item;
      // 5abb: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 5abe: invokevirtual net/minecraft/core/NonNullList.set (ILjava/lang/Object;)Ljava/lang/Object;
      // 5ac1: pop
      // 5ac2: aload 14
      // 5ac4: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 5ac7: invokevirtual net/minecraft/world/entity/player/Inventory.setChanged ()V
      // 5aca: goto 5aee
      // 5acd: aload 13
      // 5acf: instanceof net/minecraft/world/entity/LivingEntity
      // 5ad2: ifeq 5aee
      // 5ad5: aload 13
      // 5ad7: checkcast net/minecraft/world/entity/LivingEntity
      // 5ada: astore 15
      // 5adc: aload 15
      // 5ade: getstatic net/minecraft/world/entity/EquipmentSlot.FEET Lnet/minecraft/world/entity/EquipmentSlot;
      // 5ae1: new net/minecraft/world/item/ItemStack
      // 5ae4: dup
      // 5ae5: getstatic net/minecraft/world/item/Items.NETHERITE_HELMET Lnet/minecraft/world/item/Item;
      // 5ae8: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 5aeb: invokevirtual net/minecraft/world/entity/LivingEntity.setItemSlot (Lnet/minecraft/world/entity/EquipmentSlot;Lnet/minecraft/world/item/ItemStack;)V
      // 5aee: aload 8
      // 5af0: instanceof net/minecraft/world/entity/LivingEntity
      // 5af3: ifeq 5b08
      // 5af6: aload 8
      // 5af8: checkcast net/minecraft/world/entity/LivingEntity
      // 5afb: astore 13
      // 5afd: aload 13
      // 5aff: getstatic net/minecraft/world/entity/EquipmentSlot.FEET Lnet/minecraft/world/entity/EquipmentSlot;
      // 5b02: invokevirtual net/minecraft/world/entity/LivingEntity.getItemBySlot (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
      // 5b05: goto 5b0b
      // 5b08: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 5b0b: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 5b0e: getstatic net/minecraft/world/item/Items.NETHERITE_HELMET Lnet/minecraft/world/item/Item;
      // 5b11: if_acmpne 6162
      // 5b14: aload 8
      // 5b16: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 5b19: ifeq 5b32
      // 5b1c: aload 8
      // 5b1e: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 5b21: astore 14
      // 5b23: aload 14
      // 5b25: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5b28: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Netherite_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5b2b: bipush 1
      // 5b2c: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5b2f: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 5b32: aload 8
      // 5b34: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 5b37: ifeq 5b59
      // 5b3a: aload 8
      // 5b3c: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 5b3f: astore 14
      // 5b41: aload 14
      // 5b43: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5b46: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Gold_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5b49: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 5b4c: checkcast java/lang/Boolean
      // 5b4f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 5b52: ifeq 5b59
      // 5b55: bipush 1
      // 5b56: goto 5b5a
      // 5b59: bipush 0
      // 5b5a: bipush 1
      // 5b5b: if_icmpne 5bb2
      // 5b5e: aload 1
      // 5b5f: instanceof net/minecraft/server/level/ServerLevel
      // 5b62: ifeq 5b94
      // 5b65: aload 1
      // 5b66: checkcast net/minecraft/server/level/ServerLevel
      // 5b69: astore 15
      // 5b6b: new net/minecraft/world/entity/item/ItemEntity
      // 5b6e: dup
      // 5b6f: aload 15
      // 5b71: dload 2
      // 5b72: dload 4
      // 5b74: dload 6
      // 5b76: new net/minecraft/world/item/ItemStack
      // 5b79: dup
      // 5b7a: getstatic net/minecraft/world/item/Items.GOLDEN_HELMET Lnet/minecraft/world/item/Item;
      // 5b7d: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 5b80: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5b83: astore 16
      // 5b85: aload 16
      // 5b87: bipush 10
      // 5b89: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5b8c: aload 15
      // 5b8e: aload 16
      // 5b90: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5b93: pop
      // 5b94: aload 8
      // 5b96: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 5b99: ifeq 5bb2
      // 5b9c: aload 8
      // 5b9e: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 5ba1: astore 15
      // 5ba3: aload 15
      // 5ba5: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5ba8: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Gold_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5bab: bipush 0
      // 5bac: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5baf: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 5bb2: aload 8
      // 5bb4: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 5bb7: ifeq 5bd9
      // 5bba: aload 8
      // 5bbc: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 5bbf: astore 14
      // 5bc1: aload 14
      // 5bc3: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5bc6: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Diamond_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5bc9: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 5bcc: checkcast java/lang/Boolean
      // 5bcf: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 5bd2: ifeq 5bd9
      // 5bd5: bipush 1
      // 5bd6: goto 5bda
      // 5bd9: bipush 0
      // 5bda: bipush 1
      // 5bdb: if_icmpne 5c32
      // 5bde: aload 1
      // 5bdf: instanceof net/minecraft/server/level/ServerLevel
      // 5be2: ifeq 5c14
      // 5be5: aload 1
      // 5be6: checkcast net/minecraft/server/level/ServerLevel
      // 5be9: astore 15
      // 5beb: new net/minecraft/world/entity/item/ItemEntity
      // 5bee: dup
      // 5bef: aload 15
      // 5bf1: dload 2
      // 5bf2: dload 4
      // 5bf4: dload 6
      // 5bf6: new net/minecraft/world/item/ItemStack
      // 5bf9: dup
      // 5bfa: getstatic net/minecraft/world/item/Items.DIAMOND_HELMET Lnet/minecraft/world/item/Item;
      // 5bfd: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 5c00: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5c03: astore 16
      // 5c05: aload 16
      // 5c07: bipush 10
      // 5c09: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5c0c: aload 15
      // 5c0e: aload 16
      // 5c10: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5c13: pop
      // 5c14: aload 8
      // 5c16: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 5c19: ifeq 5c32
      // 5c1c: aload 8
      // 5c1e: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 5c21: astore 15
      // 5c23: aload 15
      // 5c25: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5c28: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Diamond_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5c2b: bipush 0
      // 5c2c: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5c2f: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 5c32: aload 8
      // 5c34: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 5c37: ifeq 5c59
      // 5c3a: aload 8
      // 5c3c: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 5c3f: astore 14
      // 5c41: aload 14
      // 5c43: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5c46: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Iron_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5c49: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 5c4c: checkcast java/lang/Boolean
      // 5c4f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 5c52: ifeq 5c59
      // 5c55: bipush 1
      // 5c56: goto 5c5a
      // 5c59: bipush 0
      // 5c5a: bipush 1
      // 5c5b: if_icmpne 5cb2
      // 5c5e: aload 1
      // 5c5f: instanceof net/minecraft/server/level/ServerLevel
      // 5c62: ifeq 5c94
      // 5c65: aload 1
      // 5c66: checkcast net/minecraft/server/level/ServerLevel
      // 5c69: astore 15
      // 5c6b: new net/minecraft/world/entity/item/ItemEntity
      // 5c6e: dup
      // 5c6f: aload 15
      // 5c71: dload 2
      // 5c72: dload 4
      // 5c74: dload 6
      // 5c76: new net/minecraft/world/item/ItemStack
      // 5c79: dup
      // 5c7a: getstatic net/minecraft/world/item/Items.IRON_HELMET Lnet/minecraft/world/item/Item;
      // 5c7d: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 5c80: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5c83: astore 16
      // 5c85: aload 16
      // 5c87: bipush 10
      // 5c89: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5c8c: aload 15
      // 5c8e: aload 16
      // 5c90: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5c93: pop
      // 5c94: aload 8
      // 5c96: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 5c99: ifeq 5cb2
      // 5c9c: aload 8
      // 5c9e: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 5ca1: astore 15
      // 5ca3: aload 15
      // 5ca5: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5ca8: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Iron_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5cab: bipush 0
      // 5cac: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5caf: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 5cb2: aload 8
      // 5cb4: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 5cb7: ifeq 5cd9
      // 5cba: aload 8
      // 5cbc: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 5cbf: astore 14
      // 5cc1: aload 14
      // 5cc3: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5cc6: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Fur_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5cc9: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 5ccc: checkcast java/lang/Boolean
      // 5ccf: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 5cd2: ifeq 5cd9
      // 5cd5: bipush 1
      // 5cd6: goto 5cda
      // 5cd9: bipush 0
      // 5cda: bipush 1
      // 5cdb: if_icmpne 5d38
      // 5cde: aload 1
      // 5cdf: instanceof net/minecraft/server/level/ServerLevel
      // 5ce2: ifeq 5d1a
      // 5ce5: aload 1
      // 5ce6: checkcast net/minecraft/server/level/ServerLevel
      // 5ce9: astore 15
      // 5ceb: new net/minecraft/world/entity/item/ItemEntity
      // 5cee: dup
      // 5cef: aload 15
      // 5cf1: dload 2
      // 5cf2: dload 4
      // 5cf4: dload 6
      // 5cf6: new net/minecraft/world/item/ItemStack
      // 5cf9: dup
      // 5cfa: getstatic net/mocreatures/init/MocreaturesModItems.FUR_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 5cfd: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 5d00: checkcast net/minecraft/world/level/ItemLike
      // 5d03: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 5d06: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5d09: astore 16
      // 5d0b: aload 16
      // 5d0d: bipush 10
      // 5d0f: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5d12: aload 15
      // 5d14: aload 16
      // 5d16: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5d19: pop
      // 5d1a: aload 8
      // 5d1c: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 5d1f: ifeq 5d38
      // 5d22: aload 8
      // 5d24: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 5d27: astore 15
      // 5d29: aload 15
      // 5d2b: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5d2e: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Fur_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5d31: bipush 0
      // 5d32: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5d35: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 5d38: aload 8
      // 5d3a: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 5d3d: ifeq 5d5f
      // 5d40: aload 8
      // 5d42: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 5d45: astore 14
      // 5d47: aload 14
      // 5d49: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5d4c: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Reptile_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5d4f: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 5d52: checkcast java/lang/Boolean
      // 5d55: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 5d58: ifeq 5d5f
      // 5d5b: bipush 1
      // 5d5c: goto 5d60
      // 5d5f: bipush 0
      // 5d60: bipush 1
      // 5d61: if_icmpne 5dbe
      // 5d64: aload 1
      // 5d65: instanceof net/minecraft/server/level/ServerLevel
      // 5d68: ifeq 5da0
      // 5d6b: aload 1
      // 5d6c: checkcast net/minecraft/server/level/ServerLevel
      // 5d6f: astore 15
      // 5d71: new net/minecraft/world/entity/item/ItemEntity
      // 5d74: dup
      // 5d75: aload 15
      // 5d77: dload 2
      // 5d78: dload 4
      // 5d7a: dload 6
      // 5d7c: new net/minecraft/world/item/ItemStack
      // 5d7f: dup
      // 5d80: getstatic net/mocreatures/init/MocreaturesModItems.REPTILE_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 5d83: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 5d86: checkcast net/minecraft/world/level/ItemLike
      // 5d89: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 5d8c: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5d8f: astore 16
      // 5d91: aload 16
      // 5d93: bipush 10
      // 5d95: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5d98: aload 15
      // 5d9a: aload 16
      // 5d9c: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5d9f: pop
      // 5da0: aload 8
      // 5da2: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 5da5: ifeq 5dbe
      // 5da8: aload 8
      // 5daa: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 5dad: astore 15
      // 5daf: aload 15
      // 5db1: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5db4: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Reptile_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5db7: bipush 0
      // 5db8: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5dbb: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 5dbe: aload 8
      // 5dc0: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 5dc3: ifeq 5de5
      // 5dc6: aload 8
      // 5dc8: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 5dcb: astore 14
      // 5dcd: aload 14
      // 5dcf: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5dd2: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Hide_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5dd5: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 5dd8: checkcast java/lang/Boolean
      // 5ddb: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 5dde: ifeq 5de5
      // 5de1: bipush 1
      // 5de2: goto 5de6
      // 5de5: bipush 0
      // 5de6: bipush 1
      // 5de7: if_icmpne 5e44
      // 5dea: aload 1
      // 5deb: instanceof net/minecraft/server/level/ServerLevel
      // 5dee: ifeq 5e26
      // 5df1: aload 1
      // 5df2: checkcast net/minecraft/server/level/ServerLevel
      // 5df5: astore 15
      // 5df7: new net/minecraft/world/entity/item/ItemEntity
      // 5dfa: dup
      // 5dfb: aload 15
      // 5dfd: dload 2
      // 5dfe: dload 4
      // 5e00: dload 6
      // 5e02: new net/minecraft/world/item/ItemStack
      // 5e05: dup
      // 5e06: getstatic net/mocreatures/init/MocreaturesModItems.HIDE_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 5e09: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 5e0c: checkcast net/minecraft/world/level/ItemLike
      // 5e0f: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 5e12: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5e15: astore 16
      // 5e17: aload 16
      // 5e19: bipush 10
      // 5e1b: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5e1e: aload 15
      // 5e20: aload 16
      // 5e22: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5e25: pop
      // 5e26: aload 8
      // 5e28: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 5e2b: ifeq 5e44
      // 5e2e: aload 8
      // 5e30: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 5e33: astore 15
      // 5e35: aload 15
      // 5e37: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5e3a: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Hide_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5e3d: bipush 0
      // 5e3e: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5e41: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 5e44: aload 8
      // 5e46: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 5e49: ifeq 5e6b
      // 5e4c: aload 8
      // 5e4e: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 5e51: astore 14
      // 5e53: aload 14
      // 5e55: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5e58: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Leather_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5e5b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 5e5e: checkcast java/lang/Boolean
      // 5e61: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 5e64: ifeq 5e6b
      // 5e67: bipush 1
      // 5e68: goto 5e6c
      // 5e6b: bipush 0
      // 5e6c: bipush 1
      // 5e6d: if_icmpne 5ec4
      // 5e70: aload 1
      // 5e71: instanceof net/minecraft/server/level/ServerLevel
      // 5e74: ifeq 5ea6
      // 5e77: aload 1
      // 5e78: checkcast net/minecraft/server/level/ServerLevel
      // 5e7b: astore 15
      // 5e7d: new net/minecraft/world/entity/item/ItemEntity
      // 5e80: dup
      // 5e81: aload 15
      // 5e83: dload 2
      // 5e84: dload 4
      // 5e86: dload 6
      // 5e88: new net/minecraft/world/item/ItemStack
      // 5e8b: dup
      // 5e8c: getstatic net/minecraft/world/item/Items.LEATHER_HELMET Lnet/minecraft/world/item/Item;
      // 5e8f: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 5e92: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5e95: astore 16
      // 5e97: aload 16
      // 5e99: bipush 10
      // 5e9b: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5e9e: aload 15
      // 5ea0: aload 16
      // 5ea2: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5ea5: pop
      // 5ea6: aload 8
      // 5ea8: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 5eab: ifeq 5ec4
      // 5eae: aload 8
      // 5eb0: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 5eb3: astore 15
      // 5eb5: aload 15
      // 5eb7: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5eba: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Leather_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5ebd: bipush 0
      // 5ebe: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5ec1: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 5ec4: aload 8
      // 5ec6: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 5ec9: ifeq 5eeb
      // 5ecc: aload 8
      // 5ece: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 5ed1: astore 14
      // 5ed3: aload 14
      // 5ed5: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5ed8: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Frost_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5edb: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 5ede: checkcast java/lang/Boolean
      // 5ee1: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 5ee4: ifeq 5eeb
      // 5ee7: bipush 1
      // 5ee8: goto 5eec
      // 5eeb: bipush 0
      // 5eec: bipush 1
      // 5eed: if_icmpne 5f4a
      // 5ef0: aload 1
      // 5ef1: instanceof net/minecraft/server/level/ServerLevel
      // 5ef4: ifeq 5f2c
      // 5ef7: aload 1
      // 5ef8: checkcast net/minecraft/server/level/ServerLevel
      // 5efb: astore 15
      // 5efd: new net/minecraft/world/entity/item/ItemEntity
      // 5f00: dup
      // 5f01: aload 15
      // 5f03: dload 2
      // 5f04: dload 4
      // 5f06: dload 6
      // 5f08: new net/minecraft/world/item/ItemStack
      // 5f0b: dup
      // 5f0c: getstatic net/mocreatures/init/MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 5f0f: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 5f12: checkcast net/minecraft/world/level/ItemLike
      // 5f15: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 5f18: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5f1b: astore 16
      // 5f1d: aload 16
      // 5f1f: bipush 10
      // 5f21: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5f24: aload 15
      // 5f26: aload 16
      // 5f28: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5f2b: pop
      // 5f2c: aload 8
      // 5f2e: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 5f31: ifeq 5f4a
      // 5f34: aload 8
      // 5f36: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 5f39: astore 15
      // 5f3b: aload 15
      // 5f3d: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5f40: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Frost_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5f43: bipush 0
      // 5f44: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5f47: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 5f4a: aload 8
      // 5f4c: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 5f4f: ifeq 5f71
      // 5f52: aload 8
      // 5f54: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 5f57: astore 14
      // 5f59: aload 14
      // 5f5b: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5f5e: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Dirt_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5f61: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 5f64: checkcast java/lang/Boolean
      // 5f67: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 5f6a: ifeq 5f71
      // 5f6d: bipush 1
      // 5f6e: goto 5f72
      // 5f71: bipush 0
      // 5f72: bipush 1
      // 5f73: if_icmpne 5fd0
      // 5f76: aload 1
      // 5f77: instanceof net/minecraft/server/level/ServerLevel
      // 5f7a: ifeq 5fb2
      // 5f7d: aload 1
      // 5f7e: checkcast net/minecraft/server/level/ServerLevel
      // 5f81: astore 15
      // 5f83: new net/minecraft/world/entity/item/ItemEntity
      // 5f86: dup
      // 5f87: aload 15
      // 5f89: dload 2
      // 5f8a: dload 4
      // 5f8c: dload 6
      // 5f8e: new net/minecraft/world/item/ItemStack
      // 5f91: dup
      // 5f92: getstatic net/mocreatures/init/MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 5f95: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 5f98: checkcast net/minecraft/world/level/ItemLike
      // 5f9b: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 5f9e: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5fa1: astore 16
      // 5fa3: aload 16
      // 5fa5: bipush 10
      // 5fa7: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5faa: aload 15
      // 5fac: aload 16
      // 5fae: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5fb1: pop
      // 5fb2: aload 8
      // 5fb4: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 5fb7: ifeq 5fd0
      // 5fba: aload 8
      // 5fbc: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 5fbf: astore 15
      // 5fc1: aload 15
      // 5fc3: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5fc6: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Dirt_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5fc9: bipush 0
      // 5fca: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5fcd: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 5fd0: aload 8
      // 5fd2: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 5fd5: ifeq 5ff7
      // 5fd8: aload 8
      // 5fda: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 5fdd: astore 14
      // 5fdf: aload 14
      // 5fe1: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5fe4: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Cave_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5fe7: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 5fea: checkcast java/lang/Boolean
      // 5fed: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 5ff0: ifeq 5ff7
      // 5ff3: bipush 1
      // 5ff4: goto 5ff8
      // 5ff7: bipush 0
      // 5ff8: bipush 1
      // 5ff9: if_icmpne 6056
      // 5ffc: aload 1
      // 5ffd: instanceof net/minecraft/server/level/ServerLevel
      // 6000: ifeq 6038
      // 6003: aload 1
      // 6004: checkcast net/minecraft/server/level/ServerLevel
      // 6007: astore 15
      // 6009: new net/minecraft/world/entity/item/ItemEntity
      // 600c: dup
      // 600d: aload 15
      // 600f: dload 2
      // 6010: dload 4
      // 6012: dload 6
      // 6014: new net/minecraft/world/item/ItemStack
      // 6017: dup
      // 6018: getstatic net/mocreatures/init/MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 601b: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 601e: checkcast net/minecraft/world/level/ItemLike
      // 6021: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 6024: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6027: astore 16
      // 6029: aload 16
      // 602b: bipush 10
      // 602d: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 6030: aload 15
      // 6032: aload 16
      // 6034: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 6037: pop
      // 6038: aload 8
      // 603a: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 603d: ifeq 6056
      // 6040: aload 8
      // 6042: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 6045: astore 15
      // 6047: aload 15
      // 6049: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 604c: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Cave_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 604f: bipush 0
      // 6050: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 6053: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 6056: aload 8
      // 6058: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 605b: ifeq 607d
      // 605e: aload 8
      // 6060: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 6063: astore 14
      // 6065: aload 14
      // 6067: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 606a: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Nether_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 606d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 6070: checkcast java/lang/Boolean
      // 6073: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 6076: ifeq 607d
      // 6079: bipush 1
      // 607a: goto 607e
      // 607d: bipush 0
      // 607e: bipush 1
      // 607f: if_icmpne 60dc
      // 6082: aload 1
      // 6083: instanceof net/minecraft/server/level/ServerLevel
      // 6086: ifeq 60be
      // 6089: aload 1
      // 608a: checkcast net/minecraft/server/level/ServerLevel
      // 608d: astore 15
      // 608f: new net/minecraft/world/entity/item/ItemEntity
      // 6092: dup
      // 6093: aload 15
      // 6095: dload 2
      // 6096: dload 4
      // 6098: dload 6
      // 609a: new net/minecraft/world/item/ItemStack
      // 609d: dup
      // 609e: getstatic net/mocreatures/init/MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 60a1: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 60a4: checkcast net/minecraft/world/level/ItemLike
      // 60a7: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 60aa: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 60ad: astore 16
      // 60af: aload 16
      // 60b1: bipush 10
      // 60b3: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 60b6: aload 15
      // 60b8: aload 16
      // 60ba: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 60bd: pop
      // 60be: aload 8
      // 60c0: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 60c3: ifeq 60dc
      // 60c6: aload 8
      // 60c8: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 60cb: astore 15
      // 60cd: aload 15
      // 60cf: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 60d2: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Nether_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 60d5: bipush 0
      // 60d6: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 60d9: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 60dc: aload 8
      // 60de: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 60e1: ifeq 6103
      // 60e4: aload 8
      // 60e6: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 60e9: astore 14
      // 60eb: aload 14
      // 60ed: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 60f0: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Undead_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 60f3: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 60f6: checkcast java/lang/Boolean
      // 60f9: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 60fc: ifeq 6103
      // 60ff: bipush 1
      // 6100: goto 6104
      // 6103: bipush 0
      // 6104: bipush 1
      // 6105: if_icmpne 6162
      // 6108: aload 1
      // 6109: instanceof net/minecraft/server/level/ServerLevel
      // 610c: ifeq 6144
      // 610f: aload 1
      // 6110: checkcast net/minecraft/server/level/ServerLevel
      // 6113: astore 15
      // 6115: new net/minecraft/world/entity/item/ItemEntity
      // 6118: dup
      // 6119: aload 15
      // 611b: dload 2
      // 611c: dload 4
      // 611e: dload 6
      // 6120: new net/minecraft/world/item/ItemStack
      // 6123: dup
      // 6124: getstatic net/mocreatures/init/MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET Lnet/neoforged/neoforge/registries/DeferredItem;
      // 6127: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 612a: checkcast net/minecraft/world/level/ItemLike
      // 612d: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 6130: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6133: astore 16
      // 6135: aload 16
      // 6137: bipush 10
      // 6139: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 613c: aload 15
      // 613e: aload 16
      // 6140: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 6143: pop
      // 6144: aload 8
      // 6146: instanceof net/mocreatures/entity/UnihornedOstrichEntity
      // 6149: ifeq 6162
      // 614c: aload 8
      // 614e: checkcast net/mocreatures/entity/UnihornedOstrichEntity
      // 6151: astore 15
      // 6153: aload 15
      // 6155: invokevirtual net/mocreatures/entity/UnihornedOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 6158: getstatic net/mocreatures/entity/UnihornedOstrichEntity.DATA_Undead_Scorpion_Helmet Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 615b: bipush 0
      // 615c: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 615f: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 6162: return
   }
}
