package net.mocreatures.procedures;

import javax.annotation.Nullable;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent.EntityInteract;

@EventBusSubscriber
public class UndeadOstrichEquipmentSwapProcedure {
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
      //   at org.jetbrains.java.decompiler.util.collections.FastSparseSetFactory$FastSparseSet.getCopy(FastSparseSetFactory.java:95)
      //   at org.jetbrains.java.decompiler.util.collections.SFormsFastMapDirect.getCopy(SFormsFastMapDirect.java:67)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.getFilteredOutMap(SFormsConstructor.java:285)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.mergeInVarMaps(SFormsConstructor.java:244)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.ssaStatements(SFormsConstructor.java:108)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SSAUConstructorSparseEx.splitVariables(SSAUConstructorSparseEx.java:45)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:88)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:43)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:317)
      //
      // Bytecode:
      // 0000: aload 8
      // 0002: ifnonnull 0008
      // 0005: goto 0010
      // 0008: aload 9
      // 000a: ifnull 0010
      // 000d: goto 0011
      // 0010: return
      // 0011: aload 8
      // 0013: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 0016: ifne 001e
      // 0019: goto 9ad9
      // 001e: aload 8
      // 0020: instanceof net/minecraft/world/entity/TamableAnimal
      // 0023: ifne 002b
      // 0026: goto 9ad9
      // 002b: aload 8
      // 002d: checkcast net/minecraft/world/entity/TamableAnimal
      // 0030: astore 10
      // 0032: aload 10
      // 0034: invokevirtual net/minecraft/world/entity/TamableAnimal.isTame ()Z
      // 0037: ifne 003f
      // 003a: goto 9ad9
      // 003f: goto 0042
      // 0042: aload 8
      // 0044: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 0047: ifne 004d
      // 004a: goto 006f
      // 004d: aload 8
      // 004f: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 0052: astore 11
      // 0054: aload 11
      // 0056: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0059: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Chest Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 005c: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 005f: checkcast java/lang/Boolean
      // 0062: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0065: ifne 006b
      // 0068: goto 006f
      // 006b: bipush 1
      // 006c: goto 0070
      // 006f: bipush 0
      // 0070: bipush 1
      // 0071: if_icmpeq 0079
      // 0074: goto 9ad9
      // 0079: aload 8
      // 007b: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 007e: ifne 0084
      // 0081: goto 00a6
      // 0084: aload 8
      // 0086: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 0089: astore 12
      // 008b: aload 12
      // 008d: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0090: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Green_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0093: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 0096: checkcast java/lang/Boolean
      // 0099: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 009c: ifne 00a2
      // 009f: goto 00a6
      // 00a2: bipush 1
      // 00a3: goto 00a7
      // 00a6: bipush 0
      // 00a7: ifeq 00ad
      // 00aa: goto 0a1f
      // 00ad: aload 9
      // 00af: instanceof net/minecraft/world/entity/LivingEntity
      // 00b2: ifne 00b8
      // 00b5: goto 00c7
      // 00b8: aload 9
      // 00ba: checkcast net/minecraft/world/entity/LivingEntity
      // 00bd: astore 13
      // 00bf: aload 13
      // 00c1: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 00c4: goto 00ca
      // 00c7: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 00ca: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 00cd: getstatic net/minecraft/world/level/block/Blocks.GREEN_WOOL Lnet/minecraft/world/level/block/Block;
      // 00d0: invokevirtual net/minecraft/world/level/block/Block.asItem ()Lnet/minecraft/world/item/Item;
      // 00d3: if_acmpeq 00d9
      // 00d6: goto 0a1f
      // 00d9: aload 9
      // 00db: instanceof net/minecraft/world/entity/player/Player
      // 00de: ifne 00e4
      // 00e1: goto 0113
      // 00e4: aload 9
      // 00e6: checkcast net/minecraft/world/entity/player/Player
      // 00e9: astore 14
      // 00eb: new net/minecraft/world/item/ItemStack
      // 00ee: dup
      // 00ef: getstatic net/minecraft/world/level/block/Blocks.GREEN_WOOL Lnet/minecraft/world/level/block/Block;
      // 00f2: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 00f5: astore 15
      // 00f7: aload 14
      // 00f9: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 00fc: aload 15
      // 00fe: invokedynamic test (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, net/mocreatures/procedures/UndeadOstrichEquipmentSwapProcedure.lambda$execute$0 (Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z, (Lnet/minecraft/world/item/ItemStack;)Z ]
      // 0103: bipush 1
      // 0104: aload 14
      // 0106: getfield net/minecraft/world/entity/player/Player.inventoryMenu Lnet/minecraft/world/inventory/InventoryMenu;
      // 0109: invokevirtual net/minecraft/world/inventory/InventoryMenu.getCraftSlots ()Lnet/minecraft/world/inventory/CraftingContainer;
      // 010c: invokevirtual net/minecraft/world/entity/player/Inventory.clearOrCountMatchingItems (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
      // 010f: pop
      // 0110: goto 0113
      // 0113: aload 8
      // 0115: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 0118: ifne 011e
      // 011b: goto 0137
      // 011e: aload 8
      // 0120: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 0123: astore 14
      // 0125: aload 14
      // 0127: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 012a: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Green_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 012d: bipush 1
      // 012e: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0131: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 0134: goto 0137
      // 0137: aload 8
      // 0139: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 013c: ifne 0142
      // 013f: goto 0164
      // 0142: aload 8
      // 0144: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 0147: astore 14
      // 0149: aload 14
      // 014b: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 014e: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGreen_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0151: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 0154: checkcast java/lang/Boolean
      // 0157: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 015a: ifne 0160
      // 015d: goto 0164
      // 0160: bipush 1
      // 0161: goto 0165
      // 0164: bipush 0
      // 0165: bipush 1
      // 0166: if_icmpeq 016c
      // 0169: goto 01cf
      // 016c: aload 1
      // 016d: instanceof net/minecraft/server/level/ServerLevel
      // 0170: ifne 0176
      // 0173: goto 01a8
      // 0176: aload 1
      // 0177: checkcast net/minecraft/server/level/ServerLevel
      // 017a: astore 15
      // 017c: new net/minecraft/world/entity/item/ItemEntity
      // 017f: dup
      // 0180: aload 15
      // 0182: dload 2
      // 0183: dload 4
      // 0185: dload 6
      // 0187: new net/minecraft/world/item/ItemStack
      // 018a: dup
      // 018b: getstatic net/minecraft/world/level/block/Blocks.LIME_WOOL Lnet/minecraft/world/level/block/Block;
      // 018e: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 0191: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 0194: astore 16
      // 0196: aload 16
      // 0198: bipush 10
      // 019a: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 019d: aload 15
      // 019f: aload 16
      // 01a1: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 01a4: pop
      // 01a5: goto 01a8
      // 01a8: aload 8
      // 01aa: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 01ad: ifne 01b3
      // 01b0: goto 01cc
      // 01b3: aload 8
      // 01b5: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 01b8: astore 15
      // 01ba: aload 15
      // 01bc: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 01bf: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGreen_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 01c2: bipush 0
      // 01c3: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 01c6: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 01c9: goto 01cc
      // 01cc: goto 01cf
      // 01cf: aload 8
      // 01d1: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 01d4: ifne 01da
      // 01d7: goto 01fc
      // 01da: aload 8
      // 01dc: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 01df: astore 14
      // 01e1: aload 14
      // 01e3: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 01e6: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Blue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 01e9: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 01ec: checkcast java/lang/Boolean
      // 01ef: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 01f2: ifne 01f8
      // 01f5: goto 01fc
      // 01f8: bipush 1
      // 01f9: goto 01fd
      // 01fc: bipush 0
      // 01fd: bipush 1
      // 01fe: if_icmpeq 0204
      // 0201: goto 0267
      // 0204: aload 1
      // 0205: instanceof net/minecraft/server/level/ServerLevel
      // 0208: ifne 020e
      // 020b: goto 0240
      // 020e: aload 1
      // 020f: checkcast net/minecraft/server/level/ServerLevel
      // 0212: astore 15
      // 0214: new net/minecraft/world/entity/item/ItemEntity
      // 0217: dup
      // 0218: aload 15
      // 021a: dload 2
      // 021b: dload 4
      // 021d: dload 6
      // 021f: new net/minecraft/world/item/ItemStack
      // 0222: dup
      // 0223: getstatic net/minecraft/world/level/block/Blocks.BLUE_WOOL Lnet/minecraft/world/level/block/Block;
      // 0226: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 0229: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 022c: astore 16
      // 022e: aload 16
      // 0230: bipush 10
      // 0232: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 0235: aload 15
      // 0237: aload 16
      // 0239: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 023c: pop
      // 023d: goto 0240
      // 0240: aload 8
      // 0242: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 0245: ifne 024b
      // 0248: goto 0264
      // 024b: aload 8
      // 024d: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 0250: astore 15
      // 0252: aload 15
      // 0254: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0257: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Blue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 025a: bipush 0
      // 025b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 025e: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 0261: goto 0264
      // 0264: goto 0267
      // 0267: aload 8
      // 0269: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 026c: ifne 0272
      // 026f: goto 0294
      // 0272: aload 8
      // 0274: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 0277: astore 14
      // 0279: aload 14
      // 027b: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 027e: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightBlue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0281: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 0284: checkcast java/lang/Boolean
      // 0287: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 028a: ifne 0290
      // 028d: goto 0294
      // 0290: bipush 1
      // 0291: goto 0295
      // 0294: bipush 0
      // 0295: bipush 1
      // 0296: if_icmpeq 029c
      // 0299: goto 02ff
      // 029c: aload 1
      // 029d: instanceof net/minecraft/server/level/ServerLevel
      // 02a0: ifne 02a6
      // 02a3: goto 02d8
      // 02a6: aload 1
      // 02a7: checkcast net/minecraft/server/level/ServerLevel
      // 02aa: astore 15
      // 02ac: new net/minecraft/world/entity/item/ItemEntity
      // 02af: dup
      // 02b0: aload 15
      // 02b2: dload 2
      // 02b3: dload 4
      // 02b5: dload 6
      // 02b7: new net/minecraft/world/item/ItemStack
      // 02ba: dup
      // 02bb: getstatic net/minecraft/world/level/block/Blocks.LIGHT_BLUE_WOOL Lnet/minecraft/world/level/block/Block;
      // 02be: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 02c1: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 02c4: astore 16
      // 02c6: aload 16
      // 02c8: bipush 10
      // 02ca: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 02cd: aload 15
      // 02cf: aload 16
      // 02d1: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 02d4: pop
      // 02d5: goto 02d8
      // 02d8: aload 8
      // 02da: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 02dd: ifne 02e3
      // 02e0: goto 02fc
      // 02e3: aload 8
      // 02e5: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 02e8: astore 15
      // 02ea: aload 15
      // 02ec: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 02ef: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightBlue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 02f2: bipush 0
      // 02f3: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 02f6: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 02f9: goto 02fc
      // 02fc: goto 02ff
      // 02ff: aload 8
      // 0301: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 0304: ifne 030a
      // 0307: goto 032c
      // 030a: aload 8
      // 030c: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 030f: astore 14
      // 0311: aload 14
      // 0313: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0316: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Pink_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0319: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 031c: checkcast java/lang/Boolean
      // 031f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0322: ifne 0328
      // 0325: goto 032c
      // 0328: bipush 1
      // 0329: goto 032d
      // 032c: bipush 0
      // 032d: bipush 1
      // 032e: if_icmpeq 0334
      // 0331: goto 0397
      // 0334: aload 1
      // 0335: instanceof net/minecraft/server/level/ServerLevel
      // 0338: ifne 033e
      // 033b: goto 0370
      // 033e: aload 1
      // 033f: checkcast net/minecraft/server/level/ServerLevel
      // 0342: astore 15
      // 0344: new net/minecraft/world/entity/item/ItemEntity
      // 0347: dup
      // 0348: aload 15
      // 034a: dload 2
      // 034b: dload 4
      // 034d: dload 6
      // 034f: new net/minecraft/world/item/ItemStack
      // 0352: dup
      // 0353: getstatic net/minecraft/world/level/block/Blocks.PINK_WOOL Lnet/minecraft/world/level/block/Block;
      // 0356: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 0359: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 035c: astore 16
      // 035e: aload 16
      // 0360: bipush 10
      // 0362: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 0365: aload 15
      // 0367: aload 16
      // 0369: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 036c: pop
      // 036d: goto 0370
      // 0370: aload 8
      // 0372: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 0375: ifne 037b
      // 0378: goto 0394
      // 037b: aload 8
      // 037d: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 0380: astore 15
      // 0382: aload 15
      // 0384: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0387: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Pink_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 038a: bipush 0
      // 038b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 038e: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 0391: goto 0394
      // 0394: goto 0397
      // 0397: aload 8
      // 0399: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 039c: ifne 03a2
      // 039f: goto 03c4
      // 03a2: aload 8
      // 03a4: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 03a7: astore 14
      // 03a9: aload 14
      // 03ab: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 03ae: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Magenta_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 03b1: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 03b4: checkcast java/lang/Boolean
      // 03b7: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 03ba: ifne 03c0
      // 03bd: goto 03c4
      // 03c0: bipush 1
      // 03c1: goto 03c5
      // 03c4: bipush 0
      // 03c5: bipush 1
      // 03c6: if_icmpeq 03cc
      // 03c9: goto 042f
      // 03cc: aload 1
      // 03cd: instanceof net/minecraft/server/level/ServerLevel
      // 03d0: ifne 03d6
      // 03d3: goto 0408
      // 03d6: aload 1
      // 03d7: checkcast net/minecraft/server/level/ServerLevel
      // 03da: astore 15
      // 03dc: new net/minecraft/world/entity/item/ItemEntity
      // 03df: dup
      // 03e0: aload 15
      // 03e2: dload 2
      // 03e3: dload 4
      // 03e5: dload 6
      // 03e7: new net/minecraft/world/item/ItemStack
      // 03ea: dup
      // 03eb: getstatic net/minecraft/world/level/block/Blocks.MAGENTA_WOOL Lnet/minecraft/world/level/block/Block;
      // 03ee: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 03f1: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 03f4: astore 16
      // 03f6: aload 16
      // 03f8: bipush 10
      // 03fa: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 03fd: aload 15
      // 03ff: aload 16
      // 0401: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 0404: pop
      // 0405: goto 0408
      // 0408: aload 8
      // 040a: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 040d: ifne 0413
      // 0410: goto 042c
      // 0413: aload 8
      // 0415: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 0418: astore 15
      // 041a: aload 15
      // 041c: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 041f: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Magenta_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0422: bipush 0
      // 0423: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0426: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 0429: goto 042c
      // 042c: goto 042f
      // 042f: aload 8
      // 0431: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 0434: ifne 043a
      // 0437: goto 045c
      // 043a: aload 8
      // 043c: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 043f: astore 14
      // 0441: aload 14
      // 0443: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0446: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Purple_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0449: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 044c: checkcast java/lang/Boolean
      // 044f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0452: ifne 0458
      // 0455: goto 045c
      // 0458: bipush 1
      // 0459: goto 045d
      // 045c: bipush 0
      // 045d: bipush 1
      // 045e: if_icmpeq 0464
      // 0461: goto 04c7
      // 0464: aload 1
      // 0465: instanceof net/minecraft/server/level/ServerLevel
      // 0468: ifne 046e
      // 046b: goto 04a0
      // 046e: aload 1
      // 046f: checkcast net/minecraft/server/level/ServerLevel
      // 0472: astore 15
      // 0474: new net/minecraft/world/entity/item/ItemEntity
      // 0477: dup
      // 0478: aload 15
      // 047a: dload 2
      // 047b: dload 4
      // 047d: dload 6
      // 047f: new net/minecraft/world/item/ItemStack
      // 0482: dup
      // 0483: getstatic net/minecraft/world/level/block/Blocks.PURPLE_WOOL Lnet/minecraft/world/level/block/Block;
      // 0486: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 0489: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 048c: astore 16
      // 048e: aload 16
      // 0490: bipush 10
      // 0492: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 0495: aload 15
      // 0497: aload 16
      // 0499: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 049c: pop
      // 049d: goto 04a0
      // 04a0: aload 8
      // 04a2: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 04a5: ifne 04ab
      // 04a8: goto 04c4
      // 04ab: aload 8
      // 04ad: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 04b0: astore 15
      // 04b2: aload 15
      // 04b4: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 04b7: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Purple_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 04ba: bipush 0
      // 04bb: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 04be: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 04c1: goto 04c4
      // 04c4: goto 04c7
      // 04c7: aload 8
      // 04c9: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 04cc: ifne 04d2
      // 04cf: goto 04f4
      // 04d2: aload 8
      // 04d4: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 04d7: astore 14
      // 04d9: aload 14
      // 04db: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 04de: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Orange_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 04e1: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 04e4: checkcast java/lang/Boolean
      // 04e7: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 04ea: ifne 04f0
      // 04ed: goto 04f4
      // 04f0: bipush 1
      // 04f1: goto 04f5
      // 04f4: bipush 0
      // 04f5: bipush 1
      // 04f6: if_icmpeq 04fc
      // 04f9: goto 055f
      // 04fc: aload 1
      // 04fd: instanceof net/minecraft/server/level/ServerLevel
      // 0500: ifne 0506
      // 0503: goto 0538
      // 0506: aload 1
      // 0507: checkcast net/minecraft/server/level/ServerLevel
      // 050a: astore 15
      // 050c: new net/minecraft/world/entity/item/ItemEntity
      // 050f: dup
      // 0510: aload 15
      // 0512: dload 2
      // 0513: dload 4
      // 0515: dload 6
      // 0517: new net/minecraft/world/item/ItemStack
      // 051a: dup
      // 051b: getstatic net/minecraft/world/level/block/Blocks.ORANGE_WOOL Lnet/minecraft/world/level/block/Block;
      // 051e: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 0521: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 0524: astore 16
      // 0526: aload 16
      // 0528: bipush 10
      // 052a: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 052d: aload 15
      // 052f: aload 16
      // 0531: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 0534: pop
      // 0535: goto 0538
      // 0538: aload 8
      // 053a: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 053d: ifne 0543
      // 0540: goto 055c
      // 0543: aload 8
      // 0545: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 0548: astore 15
      // 054a: aload 15
      // 054c: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 054f: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Orange_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0552: bipush 0
      // 0553: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0556: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 0559: goto 055c
      // 055c: goto 055f
      // 055f: aload 8
      // 0561: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 0564: ifne 056a
      // 0567: goto 058c
      // 056a: aload 8
      // 056c: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 056f: astore 14
      // 0571: aload 14
      // 0573: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0576: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Cyan_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0579: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 057c: checkcast java/lang/Boolean
      // 057f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0582: ifne 0588
      // 0585: goto 058c
      // 0588: bipush 1
      // 0589: goto 058d
      // 058c: bipush 0
      // 058d: bipush 1
      // 058e: if_icmpeq 0594
      // 0591: goto 05f7
      // 0594: aload 1
      // 0595: instanceof net/minecraft/server/level/ServerLevel
      // 0598: ifne 059e
      // 059b: goto 05d0
      // 059e: aload 1
      // 059f: checkcast net/minecraft/server/level/ServerLevel
      // 05a2: astore 15
      // 05a4: new net/minecraft/world/entity/item/ItemEntity
      // 05a7: dup
      // 05a8: aload 15
      // 05aa: dload 2
      // 05ab: dload 4
      // 05ad: dload 6
      // 05af: new net/minecraft/world/item/ItemStack
      // 05b2: dup
      // 05b3: getstatic net/minecraft/world/level/block/Blocks.CYAN_WOOL Lnet/minecraft/world/level/block/Block;
      // 05b6: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 05b9: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 05bc: astore 16
      // 05be: aload 16
      // 05c0: bipush 10
      // 05c2: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 05c5: aload 15
      // 05c7: aload 16
      // 05c9: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 05cc: pop
      // 05cd: goto 05d0
      // 05d0: aload 8
      // 05d2: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 05d5: ifne 05db
      // 05d8: goto 05f4
      // 05db: aload 8
      // 05dd: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 05e0: astore 15
      // 05e2: aload 15
      // 05e4: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 05e7: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Cyan_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 05ea: bipush 0
      // 05eb: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 05ee: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 05f1: goto 05f4
      // 05f4: goto 05f7
      // 05f7: aload 8
      // 05f9: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 05fc: ifne 0602
      // 05ff: goto 0624
      // 0602: aload 8
      // 0604: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 0607: astore 14
      // 0609: aload 14
      // 060b: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 060e: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Red_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0611: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 0614: checkcast java/lang/Boolean
      // 0617: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 061a: ifne 0620
      // 061d: goto 0624
      // 0620: bipush 1
      // 0621: goto 0625
      // 0624: bipush 0
      // 0625: bipush 1
      // 0626: if_icmpeq 062c
      // 0629: goto 068f
      // 062c: aload 1
      // 062d: instanceof net/minecraft/server/level/ServerLevel
      // 0630: ifne 0636
      // 0633: goto 0668
      // 0636: aload 1
      // 0637: checkcast net/minecraft/server/level/ServerLevel
      // 063a: astore 15
      // 063c: new net/minecraft/world/entity/item/ItemEntity
      // 063f: dup
      // 0640: aload 15
      // 0642: dload 2
      // 0643: dload 4
      // 0645: dload 6
      // 0647: new net/minecraft/world/item/ItemStack
      // 064a: dup
      // 064b: getstatic net/minecraft/world/level/block/Blocks.RED_WOOL Lnet/minecraft/world/level/block/Block;
      // 064e: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 0651: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 0654: astore 16
      // 0656: aload 16
      // 0658: bipush 10
      // 065a: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 065d: aload 15
      // 065f: aload 16
      // 0661: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 0664: pop
      // 0665: goto 0668
      // 0668: aload 8
      // 066a: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 066d: ifne 0673
      // 0670: goto 068c
      // 0673: aload 8
      // 0675: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 0678: astore 15
      // 067a: aload 15
      // 067c: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 067f: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Red_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0682: bipush 0
      // 0683: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0686: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 0689: goto 068c
      // 068c: goto 068f
      // 068f: aload 8
      // 0691: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 0694: ifne 069a
      // 0697: goto 06bc
      // 069a: aload 8
      // 069c: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 069f: astore 14
      // 06a1: aload 14
      // 06a3: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 06a6: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Yellow_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 06a9: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 06ac: checkcast java/lang/Boolean
      // 06af: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 06b2: ifne 06b8
      // 06b5: goto 06bc
      // 06b8: bipush 1
      // 06b9: goto 06bd
      // 06bc: bipush 0
      // 06bd: bipush 1
      // 06be: if_icmpeq 06c4
      // 06c1: goto 0727
      // 06c4: aload 1
      // 06c5: instanceof net/minecraft/server/level/ServerLevel
      // 06c8: ifne 06ce
      // 06cb: goto 0700
      // 06ce: aload 1
      // 06cf: checkcast net/minecraft/server/level/ServerLevel
      // 06d2: astore 15
      // 06d4: new net/minecraft/world/entity/item/ItemEntity
      // 06d7: dup
      // 06d8: aload 15
      // 06da: dload 2
      // 06db: dload 4
      // 06dd: dload 6
      // 06df: new net/minecraft/world/item/ItemStack
      // 06e2: dup
      // 06e3: getstatic net/minecraft/world/level/block/Blocks.YELLOW_WOOL Lnet/minecraft/world/level/block/Block;
      // 06e6: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 06e9: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 06ec: astore 16
      // 06ee: aload 16
      // 06f0: bipush 10
      // 06f2: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 06f5: aload 15
      // 06f7: aload 16
      // 06f9: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 06fc: pop
      // 06fd: goto 0700
      // 0700: aload 8
      // 0702: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 0705: ifne 070b
      // 0708: goto 0724
      // 070b: aload 8
      // 070d: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 0710: astore 15
      // 0712: aload 15
      // 0714: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0717: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Yellow_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 071a: bipush 0
      // 071b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 071e: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 0721: goto 0724
      // 0724: goto 0727
      // 0727: aload 8
      // 0729: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 072c: ifne 0732
      // 072f: goto 0754
      // 0732: aload 8
      // 0734: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 0737: astore 14
      // 0739: aload 14
      // 073b: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 073e: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_White_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0741: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 0744: checkcast java/lang/Boolean
      // 0747: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 074a: ifne 0750
      // 074d: goto 0754
      // 0750: bipush 1
      // 0751: goto 0755
      // 0754: bipush 0
      // 0755: bipush 1
      // 0756: if_icmpeq 075c
      // 0759: goto 07bf
      // 075c: aload 1
      // 075d: instanceof net/minecraft/server/level/ServerLevel
      // 0760: ifne 0766
      // 0763: goto 0798
      // 0766: aload 1
      // 0767: checkcast net/minecraft/server/level/ServerLevel
      // 076a: astore 15
      // 076c: new net/minecraft/world/entity/item/ItemEntity
      // 076f: dup
      // 0770: aload 15
      // 0772: dload 2
      // 0773: dload 4
      // 0775: dload 6
      // 0777: new net/minecraft/world/item/ItemStack
      // 077a: dup
      // 077b: getstatic net/minecraft/world/level/block/Blocks.WHITE_WOOL Lnet/minecraft/world/level/block/Block;
      // 077e: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 0781: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 0784: astore 16
      // 0786: aload 16
      // 0788: bipush 10
      // 078a: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 078d: aload 15
      // 078f: aload 16
      // 0791: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 0794: pop
      // 0795: goto 0798
      // 0798: aload 8
      // 079a: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 079d: ifne 07a3
      // 07a0: goto 07bc
      // 07a3: aload 8
      // 07a5: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 07a8: astore 15
      // 07aa: aload 15
      // 07ac: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 07af: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_White_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 07b2: bipush 0
      // 07b3: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 07b6: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 07b9: goto 07bc
      // 07bc: goto 07bf
      // 07bf: aload 8
      // 07c1: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 07c4: ifne 07ca
      // 07c7: goto 07ec
      // 07ca: aload 8
      // 07cc: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 07cf: astore 14
      // 07d1: aload 14
      // 07d3: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 07d6: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Grey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 07d9: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 07dc: checkcast java/lang/Boolean
      // 07df: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 07e2: ifne 07e8
      // 07e5: goto 07ec
      // 07e8: bipush 1
      // 07e9: goto 07ed
      // 07ec: bipush 0
      // 07ed: bipush 1
      // 07ee: if_icmpeq 07f4
      // 07f1: goto 0857
      // 07f4: aload 1
      // 07f5: instanceof net/minecraft/server/level/ServerLevel
      // 07f8: ifne 07fe
      // 07fb: goto 0830
      // 07fe: aload 1
      // 07ff: checkcast net/minecraft/server/level/ServerLevel
      // 0802: astore 15
      // 0804: new net/minecraft/world/entity/item/ItemEntity
      // 0807: dup
      // 0808: aload 15
      // 080a: dload 2
      // 080b: dload 4
      // 080d: dload 6
      // 080f: new net/minecraft/world/item/ItemStack
      // 0812: dup
      // 0813: getstatic net/minecraft/world/level/block/Blocks.GRAY_WOOL Lnet/minecraft/world/level/block/Block;
      // 0816: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 0819: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 081c: astore 16
      // 081e: aload 16
      // 0820: bipush 10
      // 0822: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 0825: aload 15
      // 0827: aload 16
      // 0829: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 082c: pop
      // 082d: goto 0830
      // 0830: aload 8
      // 0832: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 0835: ifne 083b
      // 0838: goto 0854
      // 083b: aload 8
      // 083d: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 0840: astore 15
      // 0842: aload 15
      // 0844: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0847: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Grey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 084a: bipush 0
      // 084b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 084e: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 0851: goto 0854
      // 0854: goto 0857
      // 0857: aload 8
      // 0859: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 085c: ifne 0862
      // 085f: goto 0884
      // 0862: aload 8
      // 0864: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 0867: astore 14
      // 0869: aload 14
      // 086b: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 086e: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGrey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0871: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 0874: checkcast java/lang/Boolean
      // 0877: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 087a: ifne 0880
      // 087d: goto 0884
      // 0880: bipush 1
      // 0881: goto 0885
      // 0884: bipush 0
      // 0885: bipush 1
      // 0886: if_icmpeq 088c
      // 0889: goto 08ef
      // 088c: aload 1
      // 088d: instanceof net/minecraft/server/level/ServerLevel
      // 0890: ifne 0896
      // 0893: goto 08c8
      // 0896: aload 1
      // 0897: checkcast net/minecraft/server/level/ServerLevel
      // 089a: astore 15
      // 089c: new net/minecraft/world/entity/item/ItemEntity
      // 089f: dup
      // 08a0: aload 15
      // 08a2: dload 2
      // 08a3: dload 4
      // 08a5: dload 6
      // 08a7: new net/minecraft/world/item/ItemStack
      // 08aa: dup
      // 08ab: getstatic net/minecraft/world/level/block/Blocks.LIGHT_GRAY_WOOL Lnet/minecraft/world/level/block/Block;
      // 08ae: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 08b1: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 08b4: astore 16
      // 08b6: aload 16
      // 08b8: bipush 10
      // 08ba: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 08bd: aload 15
      // 08bf: aload 16
      // 08c1: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 08c4: pop
      // 08c5: goto 08c8
      // 08c8: aload 8
      // 08ca: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 08cd: ifne 08d3
      // 08d0: goto 08ec
      // 08d3: aload 8
      // 08d5: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 08d8: astore 15
      // 08da: aload 15
      // 08dc: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 08df: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGrey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 08e2: bipush 0
      // 08e3: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 08e6: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 08e9: goto 08ec
      // 08ec: goto 08ef
      // 08ef: aload 8
      // 08f1: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 08f4: ifne 08fa
      // 08f7: goto 091c
      // 08fa: aload 8
      // 08fc: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 08ff: astore 14
      // 0901: aload 14
      // 0903: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0906: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Black_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0909: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 090c: checkcast java/lang/Boolean
      // 090f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0912: ifne 0918
      // 0915: goto 091c
      // 0918: bipush 1
      // 0919: goto 091d
      // 091c: bipush 0
      // 091d: bipush 1
      // 091e: if_icmpeq 0924
      // 0921: goto 0987
      // 0924: aload 1
      // 0925: instanceof net/minecraft/server/level/ServerLevel
      // 0928: ifne 092e
      // 092b: goto 0960
      // 092e: aload 1
      // 092f: checkcast net/minecraft/server/level/ServerLevel
      // 0932: astore 15
      // 0934: new net/minecraft/world/entity/item/ItemEntity
      // 0937: dup
      // 0938: aload 15
      // 093a: dload 2
      // 093b: dload 4
      // 093d: dload 6
      // 093f: new net/minecraft/world/item/ItemStack
      // 0942: dup
      // 0943: getstatic net/minecraft/world/level/block/Blocks.BLACK_WOOL Lnet/minecraft/world/level/block/Block;
      // 0946: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 0949: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 094c: astore 16
      // 094e: aload 16
      // 0950: bipush 10
      // 0952: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 0955: aload 15
      // 0957: aload 16
      // 0959: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 095c: pop
      // 095d: goto 0960
      // 0960: aload 8
      // 0962: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 0965: ifne 096b
      // 0968: goto 0984
      // 096b: aload 8
      // 096d: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 0970: astore 15
      // 0972: aload 15
      // 0974: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0977: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Black_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 097a: bipush 0
      // 097b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 097e: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 0981: goto 0984
      // 0984: goto 0987
      // 0987: aload 8
      // 0989: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 098c: ifne 0992
      // 098f: goto 09b4
      // 0992: aload 8
      // 0994: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 0997: astore 14
      // 0999: aload 14
      // 099b: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 099e: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Brown_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 09a1: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 09a4: checkcast java/lang/Boolean
      // 09a7: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 09aa: ifne 09b0
      // 09ad: goto 09b4
      // 09b0: bipush 1
      // 09b1: goto 09b5
      // 09b4: bipush 0
      // 09b5: bipush 1
      // 09b6: if_icmpeq 09bc
      // 09b9: goto 0a1f
      // 09bc: aload 1
      // 09bd: instanceof net/minecraft/server/level/ServerLevel
      // 09c0: ifne 09c6
      // 09c3: goto 09f8
      // 09c6: aload 1
      // 09c7: checkcast net/minecraft/server/level/ServerLevel
      // 09ca: astore 15
      // 09cc: new net/minecraft/world/entity/item/ItemEntity
      // 09cf: dup
      // 09d0: aload 15
      // 09d2: dload 2
      // 09d3: dload 4
      // 09d5: dload 6
      // 09d7: new net/minecraft/world/item/ItemStack
      // 09da: dup
      // 09db: getstatic net/minecraft/world/level/block/Blocks.BROWN_WOOL Lnet/minecraft/world/level/block/Block;
      // 09de: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 09e1: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 09e4: astore 16
      // 09e6: aload 16
      // 09e8: bipush 10
      // 09ea: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 09ed: aload 15
      // 09ef: aload 16
      // 09f1: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 09f4: pop
      // 09f5: goto 09f8
      // 09f8: aload 8
      // 09fa: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 09fd: ifne 0a03
      // 0a00: goto 0a1c
      // 0a03: aload 8
      // 0a05: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 0a08: astore 15
      // 0a0a: aload 15
      // 0a0c: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0a0f: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Brown_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0a12: bipush 0
      // 0a13: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0a16: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 0a19: goto 0a1c
      // 0a1c: goto 0a1f
      // 0a1f: aload 8
      // 0a21: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 0a24: ifne 0a2a
      // 0a27: goto 0a4c
      // 0a2a: aload 8
      // 0a2c: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 0a2f: astore 12
      // 0a31: aload 12
      // 0a33: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0a36: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGreen_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0a39: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 0a3c: checkcast java/lang/Boolean
      // 0a3f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0a42: ifne 0a48
      // 0a45: goto 0a4c
      // 0a48: bipush 1
      // 0a49: goto 0a4d
      // 0a4c: bipush 0
      // 0a4d: ifeq 0a53
      // 0a50: goto 13c5
      // 0a53: aload 9
      // 0a55: instanceof net/minecraft/world/entity/LivingEntity
      // 0a58: ifne 0a5e
      // 0a5b: goto 0a6d
      // 0a5e: aload 9
      // 0a60: checkcast net/minecraft/world/entity/LivingEntity
      // 0a63: astore 13
      // 0a65: aload 13
      // 0a67: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 0a6a: goto 0a70
      // 0a6d: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 0a70: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 0a73: getstatic net/minecraft/world/level/block/Blocks.LIME_WOOL Lnet/minecraft/world/level/block/Block;
      // 0a76: invokevirtual net/minecraft/world/level/block/Block.asItem ()Lnet/minecraft/world/item/Item;
      // 0a79: if_acmpeq 0a7f
      // 0a7c: goto 13c5
      // 0a7f: aload 9
      // 0a81: instanceof net/minecraft/world/entity/player/Player
      // 0a84: ifne 0a8a
      // 0a87: goto 0ab9
      // 0a8a: aload 9
      // 0a8c: checkcast net/minecraft/world/entity/player/Player
      // 0a8f: astore 14
      // 0a91: new net/minecraft/world/item/ItemStack
      // 0a94: dup
      // 0a95: getstatic net/minecraft/world/level/block/Blocks.LIME_WOOL Lnet/minecraft/world/level/block/Block;
      // 0a98: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 0a9b: astore 15
      // 0a9d: aload 14
      // 0a9f: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 0aa2: aload 15
      // 0aa4: invokedynamic test (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, net/mocreatures/procedures/UndeadOstrichEquipmentSwapProcedure.lambda$execute$1 (Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z, (Lnet/minecraft/world/item/ItemStack;)Z ]
      // 0aa9: bipush 1
      // 0aaa: aload 14
      // 0aac: getfield net/minecraft/world/entity/player/Player.inventoryMenu Lnet/minecraft/world/inventory/InventoryMenu;
      // 0aaf: invokevirtual net/minecraft/world/inventory/InventoryMenu.getCraftSlots ()Lnet/minecraft/world/inventory/CraftingContainer;
      // 0ab2: invokevirtual net/minecraft/world/entity/player/Inventory.clearOrCountMatchingItems (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
      // 0ab5: pop
      // 0ab6: goto 0ab9
      // 0ab9: aload 8
      // 0abb: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 0abe: ifne 0ac4
      // 0ac1: goto 0add
      // 0ac4: aload 8
      // 0ac6: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 0ac9: astore 14
      // 0acb: aload 14
      // 0acd: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0ad0: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGreen_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0ad3: bipush 1
      // 0ad4: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0ad7: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 0ada: goto 0add
      // 0add: aload 8
      // 0adf: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 0ae2: ifne 0ae8
      // 0ae5: goto 0b0a
      // 0ae8: aload 8
      // 0aea: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 0aed: astore 14
      // 0aef: aload 14
      // 0af1: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0af4: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Green_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0af7: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 0afa: checkcast java/lang/Boolean
      // 0afd: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0b00: ifne 0b06
      // 0b03: goto 0b0a
      // 0b06: bipush 1
      // 0b07: goto 0b0b
      // 0b0a: bipush 0
      // 0b0b: bipush 1
      // 0b0c: if_icmpeq 0b12
      // 0b0f: goto 0b75
      // 0b12: aload 1
      // 0b13: instanceof net/minecraft/server/level/ServerLevel
      // 0b16: ifne 0b1c
      // 0b19: goto 0b4e
      // 0b1c: aload 1
      // 0b1d: checkcast net/minecraft/server/level/ServerLevel
      // 0b20: astore 15
      // 0b22: new net/minecraft/world/entity/item/ItemEntity
      // 0b25: dup
      // 0b26: aload 15
      // 0b28: dload 2
      // 0b29: dload 4
      // 0b2b: dload 6
      // 0b2d: new net/minecraft/world/item/ItemStack
      // 0b30: dup
      // 0b31: getstatic net/minecraft/world/level/block/Blocks.GREEN_WOOL Lnet/minecraft/world/level/block/Block;
      // 0b34: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 0b37: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 0b3a: astore 16
      // 0b3c: aload 16
      // 0b3e: bipush 10
      // 0b40: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 0b43: aload 15
      // 0b45: aload 16
      // 0b47: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 0b4a: pop
      // 0b4b: goto 0b4e
      // 0b4e: aload 8
      // 0b50: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 0b53: ifne 0b59
      // 0b56: goto 0b72
      // 0b59: aload 8
      // 0b5b: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 0b5e: astore 15
      // 0b60: aload 15
      // 0b62: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0b65: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Green_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0b68: bipush 0
      // 0b69: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0b6c: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 0b6f: goto 0b72
      // 0b72: goto 0b75
      // 0b75: aload 8
      // 0b77: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 0b7a: ifne 0b80
      // 0b7d: goto 0ba2
      // 0b80: aload 8
      // 0b82: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 0b85: astore 14
      // 0b87: aload 14
      // 0b89: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0b8c: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Blue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0b8f: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 0b92: checkcast java/lang/Boolean
      // 0b95: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0b98: ifne 0b9e
      // 0b9b: goto 0ba2
      // 0b9e: bipush 1
      // 0b9f: goto 0ba3
      // 0ba2: bipush 0
      // 0ba3: bipush 1
      // 0ba4: if_icmpeq 0baa
      // 0ba7: goto 0c0d
      // 0baa: aload 1
      // 0bab: instanceof net/minecraft/server/level/ServerLevel
      // 0bae: ifne 0bb4
      // 0bb1: goto 0be6
      // 0bb4: aload 1
      // 0bb5: checkcast net/minecraft/server/level/ServerLevel
      // 0bb8: astore 15
      // 0bba: new net/minecraft/world/entity/item/ItemEntity
      // 0bbd: dup
      // 0bbe: aload 15
      // 0bc0: dload 2
      // 0bc1: dload 4
      // 0bc3: dload 6
      // 0bc5: new net/minecraft/world/item/ItemStack
      // 0bc8: dup
      // 0bc9: getstatic net/minecraft/world/level/block/Blocks.BLUE_WOOL Lnet/minecraft/world/level/block/Block;
      // 0bcc: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 0bcf: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 0bd2: astore 16
      // 0bd4: aload 16
      // 0bd6: bipush 10
      // 0bd8: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 0bdb: aload 15
      // 0bdd: aload 16
      // 0bdf: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 0be2: pop
      // 0be3: goto 0be6
      // 0be6: aload 8
      // 0be8: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 0beb: ifne 0bf1
      // 0bee: goto 0c0a
      // 0bf1: aload 8
      // 0bf3: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 0bf6: astore 15
      // 0bf8: aload 15
      // 0bfa: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0bfd: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Blue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0c00: bipush 0
      // 0c01: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0c04: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 0c07: goto 0c0a
      // 0c0a: goto 0c0d
      // 0c0d: aload 8
      // 0c0f: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 0c12: ifne 0c18
      // 0c15: goto 0c3a
      // 0c18: aload 8
      // 0c1a: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 0c1d: astore 14
      // 0c1f: aload 14
      // 0c21: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0c24: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightBlue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0c27: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 0c2a: checkcast java/lang/Boolean
      // 0c2d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0c30: ifne 0c36
      // 0c33: goto 0c3a
      // 0c36: bipush 1
      // 0c37: goto 0c3b
      // 0c3a: bipush 0
      // 0c3b: bipush 1
      // 0c3c: if_icmpeq 0c42
      // 0c3f: goto 0ca5
      // 0c42: aload 1
      // 0c43: instanceof net/minecraft/server/level/ServerLevel
      // 0c46: ifne 0c4c
      // 0c49: goto 0c7e
      // 0c4c: aload 1
      // 0c4d: checkcast net/minecraft/server/level/ServerLevel
      // 0c50: astore 15
      // 0c52: new net/minecraft/world/entity/item/ItemEntity
      // 0c55: dup
      // 0c56: aload 15
      // 0c58: dload 2
      // 0c59: dload 4
      // 0c5b: dload 6
      // 0c5d: new net/minecraft/world/item/ItemStack
      // 0c60: dup
      // 0c61: getstatic net/minecraft/world/level/block/Blocks.LIGHT_BLUE_WOOL Lnet/minecraft/world/level/block/Block;
      // 0c64: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 0c67: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 0c6a: astore 16
      // 0c6c: aload 16
      // 0c6e: bipush 10
      // 0c70: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 0c73: aload 15
      // 0c75: aload 16
      // 0c77: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 0c7a: pop
      // 0c7b: goto 0c7e
      // 0c7e: aload 8
      // 0c80: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 0c83: ifne 0c89
      // 0c86: goto 0ca2
      // 0c89: aload 8
      // 0c8b: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 0c8e: astore 15
      // 0c90: aload 15
      // 0c92: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0c95: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightBlue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0c98: bipush 0
      // 0c99: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0c9c: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 0c9f: goto 0ca2
      // 0ca2: goto 0ca5
      // 0ca5: aload 8
      // 0ca7: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 0caa: ifne 0cb0
      // 0cad: goto 0cd2
      // 0cb0: aload 8
      // 0cb2: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 0cb5: astore 14
      // 0cb7: aload 14
      // 0cb9: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0cbc: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Pink_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0cbf: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 0cc2: checkcast java/lang/Boolean
      // 0cc5: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0cc8: ifne 0cce
      // 0ccb: goto 0cd2
      // 0cce: bipush 1
      // 0ccf: goto 0cd3
      // 0cd2: bipush 0
      // 0cd3: bipush 1
      // 0cd4: if_icmpeq 0cda
      // 0cd7: goto 0d3d
      // 0cda: aload 1
      // 0cdb: instanceof net/minecraft/server/level/ServerLevel
      // 0cde: ifne 0ce4
      // 0ce1: goto 0d16
      // 0ce4: aload 1
      // 0ce5: checkcast net/minecraft/server/level/ServerLevel
      // 0ce8: astore 15
      // 0cea: new net/minecraft/world/entity/item/ItemEntity
      // 0ced: dup
      // 0cee: aload 15
      // 0cf0: dload 2
      // 0cf1: dload 4
      // 0cf3: dload 6
      // 0cf5: new net/minecraft/world/item/ItemStack
      // 0cf8: dup
      // 0cf9: getstatic net/minecraft/world/level/block/Blocks.PINK_WOOL Lnet/minecraft/world/level/block/Block;
      // 0cfc: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 0cff: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 0d02: astore 16
      // 0d04: aload 16
      // 0d06: bipush 10
      // 0d08: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 0d0b: aload 15
      // 0d0d: aload 16
      // 0d0f: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 0d12: pop
      // 0d13: goto 0d16
      // 0d16: aload 8
      // 0d18: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 0d1b: ifne 0d21
      // 0d1e: goto 0d3a
      // 0d21: aload 8
      // 0d23: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 0d26: astore 15
      // 0d28: aload 15
      // 0d2a: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0d2d: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Pink_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0d30: bipush 0
      // 0d31: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0d34: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 0d37: goto 0d3a
      // 0d3a: goto 0d3d
      // 0d3d: aload 8
      // 0d3f: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 0d42: ifne 0d48
      // 0d45: goto 0d6a
      // 0d48: aload 8
      // 0d4a: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 0d4d: astore 14
      // 0d4f: aload 14
      // 0d51: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0d54: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Magenta_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0d57: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 0d5a: checkcast java/lang/Boolean
      // 0d5d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0d60: ifne 0d66
      // 0d63: goto 0d6a
      // 0d66: bipush 1
      // 0d67: goto 0d6b
      // 0d6a: bipush 0
      // 0d6b: bipush 1
      // 0d6c: if_icmpeq 0d72
      // 0d6f: goto 0dd5
      // 0d72: aload 1
      // 0d73: instanceof net/minecraft/server/level/ServerLevel
      // 0d76: ifne 0d7c
      // 0d79: goto 0dae
      // 0d7c: aload 1
      // 0d7d: checkcast net/minecraft/server/level/ServerLevel
      // 0d80: astore 15
      // 0d82: new net/minecraft/world/entity/item/ItemEntity
      // 0d85: dup
      // 0d86: aload 15
      // 0d88: dload 2
      // 0d89: dload 4
      // 0d8b: dload 6
      // 0d8d: new net/minecraft/world/item/ItemStack
      // 0d90: dup
      // 0d91: getstatic net/minecraft/world/level/block/Blocks.MAGENTA_WOOL Lnet/minecraft/world/level/block/Block;
      // 0d94: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 0d97: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 0d9a: astore 16
      // 0d9c: aload 16
      // 0d9e: bipush 10
      // 0da0: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 0da3: aload 15
      // 0da5: aload 16
      // 0da7: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 0daa: pop
      // 0dab: goto 0dae
      // 0dae: aload 8
      // 0db0: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 0db3: ifne 0db9
      // 0db6: goto 0dd2
      // 0db9: aload 8
      // 0dbb: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 0dbe: astore 15
      // 0dc0: aload 15
      // 0dc2: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0dc5: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Magenta_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0dc8: bipush 0
      // 0dc9: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0dcc: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 0dcf: goto 0dd2
      // 0dd2: goto 0dd5
      // 0dd5: aload 8
      // 0dd7: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 0dda: ifne 0de0
      // 0ddd: goto 0e02
      // 0de0: aload 8
      // 0de2: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 0de5: astore 14
      // 0de7: aload 14
      // 0de9: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0dec: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Purple_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0def: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 0df2: checkcast java/lang/Boolean
      // 0df5: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0df8: ifne 0dfe
      // 0dfb: goto 0e02
      // 0dfe: bipush 1
      // 0dff: goto 0e03
      // 0e02: bipush 0
      // 0e03: bipush 1
      // 0e04: if_icmpeq 0e0a
      // 0e07: goto 0e6d
      // 0e0a: aload 1
      // 0e0b: instanceof net/minecraft/server/level/ServerLevel
      // 0e0e: ifne 0e14
      // 0e11: goto 0e46
      // 0e14: aload 1
      // 0e15: checkcast net/minecraft/server/level/ServerLevel
      // 0e18: astore 15
      // 0e1a: new net/minecraft/world/entity/item/ItemEntity
      // 0e1d: dup
      // 0e1e: aload 15
      // 0e20: dload 2
      // 0e21: dload 4
      // 0e23: dload 6
      // 0e25: new net/minecraft/world/item/ItemStack
      // 0e28: dup
      // 0e29: getstatic net/minecraft/world/level/block/Blocks.PURPLE_WOOL Lnet/minecraft/world/level/block/Block;
      // 0e2c: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 0e2f: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 0e32: astore 16
      // 0e34: aload 16
      // 0e36: bipush 10
      // 0e38: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 0e3b: aload 15
      // 0e3d: aload 16
      // 0e3f: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 0e42: pop
      // 0e43: goto 0e46
      // 0e46: aload 8
      // 0e48: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 0e4b: ifne 0e51
      // 0e4e: goto 0e6a
      // 0e51: aload 8
      // 0e53: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 0e56: astore 15
      // 0e58: aload 15
      // 0e5a: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0e5d: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Purple_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0e60: bipush 0
      // 0e61: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0e64: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 0e67: goto 0e6a
      // 0e6a: goto 0e6d
      // 0e6d: aload 8
      // 0e6f: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 0e72: ifne 0e78
      // 0e75: goto 0e9a
      // 0e78: aload 8
      // 0e7a: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 0e7d: astore 14
      // 0e7f: aload 14
      // 0e81: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0e84: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Orange_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0e87: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 0e8a: checkcast java/lang/Boolean
      // 0e8d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0e90: ifne 0e96
      // 0e93: goto 0e9a
      // 0e96: bipush 1
      // 0e97: goto 0e9b
      // 0e9a: bipush 0
      // 0e9b: bipush 1
      // 0e9c: if_icmpeq 0ea2
      // 0e9f: goto 0f05
      // 0ea2: aload 1
      // 0ea3: instanceof net/minecraft/server/level/ServerLevel
      // 0ea6: ifne 0eac
      // 0ea9: goto 0ede
      // 0eac: aload 1
      // 0ead: checkcast net/minecraft/server/level/ServerLevel
      // 0eb0: astore 15
      // 0eb2: new net/minecraft/world/entity/item/ItemEntity
      // 0eb5: dup
      // 0eb6: aload 15
      // 0eb8: dload 2
      // 0eb9: dload 4
      // 0ebb: dload 6
      // 0ebd: new net/minecraft/world/item/ItemStack
      // 0ec0: dup
      // 0ec1: getstatic net/minecraft/world/level/block/Blocks.ORANGE_WOOL Lnet/minecraft/world/level/block/Block;
      // 0ec4: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 0ec7: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 0eca: astore 16
      // 0ecc: aload 16
      // 0ece: bipush 10
      // 0ed0: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 0ed3: aload 15
      // 0ed5: aload 16
      // 0ed7: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 0eda: pop
      // 0edb: goto 0ede
      // 0ede: aload 8
      // 0ee0: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 0ee3: ifne 0ee9
      // 0ee6: goto 0f02
      // 0ee9: aload 8
      // 0eeb: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 0eee: astore 15
      // 0ef0: aload 15
      // 0ef2: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0ef5: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Orange_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0ef8: bipush 0
      // 0ef9: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0efc: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 0eff: goto 0f02
      // 0f02: goto 0f05
      // 0f05: aload 8
      // 0f07: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 0f0a: ifne 0f10
      // 0f0d: goto 0f32
      // 0f10: aload 8
      // 0f12: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 0f15: astore 14
      // 0f17: aload 14
      // 0f19: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0f1c: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Cyan_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0f1f: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 0f22: checkcast java/lang/Boolean
      // 0f25: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0f28: ifne 0f2e
      // 0f2b: goto 0f32
      // 0f2e: bipush 1
      // 0f2f: goto 0f33
      // 0f32: bipush 0
      // 0f33: bipush 1
      // 0f34: if_icmpeq 0f3a
      // 0f37: goto 0f9d
      // 0f3a: aload 1
      // 0f3b: instanceof net/minecraft/server/level/ServerLevel
      // 0f3e: ifne 0f44
      // 0f41: goto 0f76
      // 0f44: aload 1
      // 0f45: checkcast net/minecraft/server/level/ServerLevel
      // 0f48: astore 15
      // 0f4a: new net/minecraft/world/entity/item/ItemEntity
      // 0f4d: dup
      // 0f4e: aload 15
      // 0f50: dload 2
      // 0f51: dload 4
      // 0f53: dload 6
      // 0f55: new net/minecraft/world/item/ItemStack
      // 0f58: dup
      // 0f59: getstatic net/minecraft/world/level/block/Blocks.CYAN_WOOL Lnet/minecraft/world/level/block/Block;
      // 0f5c: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 0f5f: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 0f62: astore 16
      // 0f64: aload 16
      // 0f66: bipush 10
      // 0f68: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 0f6b: aload 15
      // 0f6d: aload 16
      // 0f6f: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 0f72: pop
      // 0f73: goto 0f76
      // 0f76: aload 8
      // 0f78: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 0f7b: ifne 0f81
      // 0f7e: goto 0f9a
      // 0f81: aload 8
      // 0f83: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 0f86: astore 15
      // 0f88: aload 15
      // 0f8a: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0f8d: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Cyan_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0f90: bipush 0
      // 0f91: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0f94: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 0f97: goto 0f9a
      // 0f9a: goto 0f9d
      // 0f9d: aload 8
      // 0f9f: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 0fa2: ifne 0fa8
      // 0fa5: goto 0fca
      // 0fa8: aload 8
      // 0faa: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 0fad: astore 14
      // 0faf: aload 14
      // 0fb1: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0fb4: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Red_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0fb7: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 0fba: checkcast java/lang/Boolean
      // 0fbd: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0fc0: ifne 0fc6
      // 0fc3: goto 0fca
      // 0fc6: bipush 1
      // 0fc7: goto 0fcb
      // 0fca: bipush 0
      // 0fcb: bipush 1
      // 0fcc: if_icmpeq 0fd2
      // 0fcf: goto 1035
      // 0fd2: aload 1
      // 0fd3: instanceof net/minecraft/server/level/ServerLevel
      // 0fd6: ifne 0fdc
      // 0fd9: goto 100e
      // 0fdc: aload 1
      // 0fdd: checkcast net/minecraft/server/level/ServerLevel
      // 0fe0: astore 15
      // 0fe2: new net/minecraft/world/entity/item/ItemEntity
      // 0fe5: dup
      // 0fe6: aload 15
      // 0fe8: dload 2
      // 0fe9: dload 4
      // 0feb: dload 6
      // 0fed: new net/minecraft/world/item/ItemStack
      // 0ff0: dup
      // 0ff1: getstatic net/minecraft/world/level/block/Blocks.RED_WOOL Lnet/minecraft/world/level/block/Block;
      // 0ff4: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 0ff7: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 0ffa: astore 16
      // 0ffc: aload 16
      // 0ffe: bipush 10
      // 1000: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1003: aload 15
      // 1005: aload 16
      // 1007: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 100a: pop
      // 100b: goto 100e
      // 100e: aload 8
      // 1010: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 1013: ifne 1019
      // 1016: goto 1032
      // 1019: aload 8
      // 101b: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 101e: astore 15
      // 1020: aload 15
      // 1022: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1025: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Red_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1028: bipush 0
      // 1029: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 102c: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 102f: goto 1032
      // 1032: goto 1035
      // 1035: aload 8
      // 1037: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 103a: ifne 1040
      // 103d: goto 1062
      // 1040: aload 8
      // 1042: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 1045: astore 14
      // 1047: aload 14
      // 1049: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 104c: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Yellow_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 104f: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 1052: checkcast java/lang/Boolean
      // 1055: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1058: ifne 105e
      // 105b: goto 1062
      // 105e: bipush 1
      // 105f: goto 1063
      // 1062: bipush 0
      // 1063: bipush 1
      // 1064: if_icmpeq 106a
      // 1067: goto 10cd
      // 106a: aload 1
      // 106b: instanceof net/minecraft/server/level/ServerLevel
      // 106e: ifne 1074
      // 1071: goto 10a6
      // 1074: aload 1
      // 1075: checkcast net/minecraft/server/level/ServerLevel
      // 1078: astore 15
      // 107a: new net/minecraft/world/entity/item/ItemEntity
      // 107d: dup
      // 107e: aload 15
      // 1080: dload 2
      // 1081: dload 4
      // 1083: dload 6
      // 1085: new net/minecraft/world/item/ItemStack
      // 1088: dup
      // 1089: getstatic net/minecraft/world/level/block/Blocks.YELLOW_WOOL Lnet/minecraft/world/level/block/Block;
      // 108c: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 108f: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1092: astore 16
      // 1094: aload 16
      // 1096: bipush 10
      // 1098: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 109b: aload 15
      // 109d: aload 16
      // 109f: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 10a2: pop
      // 10a3: goto 10a6
      // 10a6: aload 8
      // 10a8: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 10ab: ifne 10b1
      // 10ae: goto 10ca
      // 10b1: aload 8
      // 10b3: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 10b6: astore 15
      // 10b8: aload 15
      // 10ba: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 10bd: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Yellow_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 10c0: bipush 0
      // 10c1: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 10c4: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 10c7: goto 10ca
      // 10ca: goto 10cd
      // 10cd: aload 8
      // 10cf: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 10d2: ifne 10d8
      // 10d5: goto 10fa
      // 10d8: aload 8
      // 10da: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 10dd: astore 14
      // 10df: aload 14
      // 10e1: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 10e4: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_White_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 10e7: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 10ea: checkcast java/lang/Boolean
      // 10ed: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 10f0: ifne 10f6
      // 10f3: goto 10fa
      // 10f6: bipush 1
      // 10f7: goto 10fb
      // 10fa: bipush 0
      // 10fb: bipush 1
      // 10fc: if_icmpeq 1102
      // 10ff: goto 1165
      // 1102: aload 1
      // 1103: instanceof net/minecraft/server/level/ServerLevel
      // 1106: ifne 110c
      // 1109: goto 113e
      // 110c: aload 1
      // 110d: checkcast net/minecraft/server/level/ServerLevel
      // 1110: astore 15
      // 1112: new net/minecraft/world/entity/item/ItemEntity
      // 1115: dup
      // 1116: aload 15
      // 1118: dload 2
      // 1119: dload 4
      // 111b: dload 6
      // 111d: new net/minecraft/world/item/ItemStack
      // 1120: dup
      // 1121: getstatic net/minecraft/world/level/block/Blocks.WHITE_WOOL Lnet/minecraft/world/level/block/Block;
      // 1124: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 1127: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 112a: astore 16
      // 112c: aload 16
      // 112e: bipush 10
      // 1130: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1133: aload 15
      // 1135: aload 16
      // 1137: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 113a: pop
      // 113b: goto 113e
      // 113e: aload 8
      // 1140: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 1143: ifne 1149
      // 1146: goto 1162
      // 1149: aload 8
      // 114b: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 114e: astore 15
      // 1150: aload 15
      // 1152: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1155: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_White_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1158: bipush 0
      // 1159: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 115c: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 115f: goto 1162
      // 1162: goto 1165
      // 1165: aload 8
      // 1167: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 116a: ifne 1170
      // 116d: goto 1192
      // 1170: aload 8
      // 1172: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 1175: astore 14
      // 1177: aload 14
      // 1179: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 117c: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Grey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 117f: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 1182: checkcast java/lang/Boolean
      // 1185: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1188: ifne 118e
      // 118b: goto 1192
      // 118e: bipush 1
      // 118f: goto 1193
      // 1192: bipush 0
      // 1193: bipush 1
      // 1194: if_icmpeq 119a
      // 1197: goto 11fd
      // 119a: aload 1
      // 119b: instanceof net/minecraft/server/level/ServerLevel
      // 119e: ifne 11a4
      // 11a1: goto 11d6
      // 11a4: aload 1
      // 11a5: checkcast net/minecraft/server/level/ServerLevel
      // 11a8: astore 15
      // 11aa: new net/minecraft/world/entity/item/ItemEntity
      // 11ad: dup
      // 11ae: aload 15
      // 11b0: dload 2
      // 11b1: dload 4
      // 11b3: dload 6
      // 11b5: new net/minecraft/world/item/ItemStack
      // 11b8: dup
      // 11b9: getstatic net/minecraft/world/level/block/Blocks.GRAY_WOOL Lnet/minecraft/world/level/block/Block;
      // 11bc: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 11bf: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 11c2: astore 16
      // 11c4: aload 16
      // 11c6: bipush 10
      // 11c8: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 11cb: aload 15
      // 11cd: aload 16
      // 11cf: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 11d2: pop
      // 11d3: goto 11d6
      // 11d6: aload 8
      // 11d8: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 11db: ifne 11e1
      // 11de: goto 11fa
      // 11e1: aload 8
      // 11e3: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 11e6: astore 15
      // 11e8: aload 15
      // 11ea: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 11ed: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Grey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 11f0: bipush 0
      // 11f1: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 11f4: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 11f7: goto 11fa
      // 11fa: goto 11fd
      // 11fd: aload 8
      // 11ff: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 1202: ifne 1208
      // 1205: goto 122a
      // 1208: aload 8
      // 120a: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 120d: astore 14
      // 120f: aload 14
      // 1211: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1214: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGrey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1217: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 121a: checkcast java/lang/Boolean
      // 121d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1220: ifne 1226
      // 1223: goto 122a
      // 1226: bipush 1
      // 1227: goto 122b
      // 122a: bipush 0
      // 122b: bipush 1
      // 122c: if_icmpeq 1232
      // 122f: goto 1295
      // 1232: aload 1
      // 1233: instanceof net/minecraft/server/level/ServerLevel
      // 1236: ifne 123c
      // 1239: goto 126e
      // 123c: aload 1
      // 123d: checkcast net/minecraft/server/level/ServerLevel
      // 1240: astore 15
      // 1242: new net/minecraft/world/entity/item/ItemEntity
      // 1245: dup
      // 1246: aload 15
      // 1248: dload 2
      // 1249: dload 4
      // 124b: dload 6
      // 124d: new net/minecraft/world/item/ItemStack
      // 1250: dup
      // 1251: getstatic net/minecraft/world/level/block/Blocks.LIGHT_GRAY_WOOL Lnet/minecraft/world/level/block/Block;
      // 1254: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 1257: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 125a: astore 16
      // 125c: aload 16
      // 125e: bipush 10
      // 1260: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1263: aload 15
      // 1265: aload 16
      // 1267: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 126a: pop
      // 126b: goto 126e
      // 126e: aload 8
      // 1270: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 1273: ifne 1279
      // 1276: goto 1292
      // 1279: aload 8
      // 127b: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 127e: astore 15
      // 1280: aload 15
      // 1282: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1285: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGrey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1288: bipush 0
      // 1289: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 128c: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 128f: goto 1292
      // 1292: goto 1295
      // 1295: aload 8
      // 1297: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 129a: ifne 12a0
      // 129d: goto 12c2
      // 12a0: aload 8
      // 12a2: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 12a5: astore 14
      // 12a7: aload 14
      // 12a9: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 12ac: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Black_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 12af: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 12b2: checkcast java/lang/Boolean
      // 12b5: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 12b8: ifne 12be
      // 12bb: goto 12c2
      // 12be: bipush 1
      // 12bf: goto 12c3
      // 12c2: bipush 0
      // 12c3: bipush 1
      // 12c4: if_icmpeq 12ca
      // 12c7: goto 132d
      // 12ca: aload 1
      // 12cb: instanceof net/minecraft/server/level/ServerLevel
      // 12ce: ifne 12d4
      // 12d1: goto 1306
      // 12d4: aload 1
      // 12d5: checkcast net/minecraft/server/level/ServerLevel
      // 12d8: astore 15
      // 12da: new net/minecraft/world/entity/item/ItemEntity
      // 12dd: dup
      // 12de: aload 15
      // 12e0: dload 2
      // 12e1: dload 4
      // 12e3: dload 6
      // 12e5: new net/minecraft/world/item/ItemStack
      // 12e8: dup
      // 12e9: getstatic net/minecraft/world/level/block/Blocks.BLACK_WOOL Lnet/minecraft/world/level/block/Block;
      // 12ec: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 12ef: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 12f2: astore 16
      // 12f4: aload 16
      // 12f6: bipush 10
      // 12f8: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 12fb: aload 15
      // 12fd: aload 16
      // 12ff: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1302: pop
      // 1303: goto 1306
      // 1306: aload 8
      // 1308: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 130b: ifne 1311
      // 130e: goto 132a
      // 1311: aload 8
      // 1313: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 1316: astore 15
      // 1318: aload 15
      // 131a: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 131d: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Black_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1320: bipush 0
      // 1321: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1324: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 1327: goto 132a
      // 132a: goto 132d
      // 132d: aload 8
      // 132f: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 1332: ifne 1338
      // 1335: goto 135a
      // 1338: aload 8
      // 133a: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 133d: astore 14
      // 133f: aload 14
      // 1341: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1344: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Brown_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1347: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 134a: checkcast java/lang/Boolean
      // 134d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1350: ifne 1356
      // 1353: goto 135a
      // 1356: bipush 1
      // 1357: goto 135b
      // 135a: bipush 0
      // 135b: bipush 1
      // 135c: if_icmpeq 1362
      // 135f: goto 13c5
      // 1362: aload 1
      // 1363: instanceof net/minecraft/server/level/ServerLevel
      // 1366: ifne 136c
      // 1369: goto 139e
      // 136c: aload 1
      // 136d: checkcast net/minecraft/server/level/ServerLevel
      // 1370: astore 15
      // 1372: new net/minecraft/world/entity/item/ItemEntity
      // 1375: dup
      // 1376: aload 15
      // 1378: dload 2
      // 1379: dload 4
      // 137b: dload 6
      // 137d: new net/minecraft/world/item/ItemStack
      // 1380: dup
      // 1381: getstatic net/minecraft/world/level/block/Blocks.BROWN_WOOL Lnet/minecraft/world/level/block/Block;
      // 1384: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 1387: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 138a: astore 16
      // 138c: aload 16
      // 138e: bipush 10
      // 1390: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1393: aload 15
      // 1395: aload 16
      // 1397: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 139a: pop
      // 139b: goto 139e
      // 139e: aload 8
      // 13a0: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 13a3: ifne 13a9
      // 13a6: goto 13c2
      // 13a9: aload 8
      // 13ab: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 13ae: astore 15
      // 13b0: aload 15
      // 13b2: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 13b5: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Brown_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 13b8: bipush 0
      // 13b9: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 13bc: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 13bf: goto 13c2
      // 13c2: goto 13c5
      // 13c5: aload 8
      // 13c7: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 13ca: ifne 13d0
      // 13cd: goto 13f2
      // 13d0: aload 8
      // 13d2: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 13d5: astore 12
      // 13d7: aload 12
      // 13d9: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 13dc: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Blue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 13df: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 13e2: checkcast java/lang/Boolean
      // 13e5: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 13e8: ifne 13ee
      // 13eb: goto 13f2
      // 13ee: bipush 1
      // 13ef: goto 13f3
      // 13f2: bipush 0
      // 13f3: ifeq 13f9
      // 13f6: goto 1d6b
      // 13f9: aload 9
      // 13fb: instanceof net/minecraft/world/entity/LivingEntity
      // 13fe: ifne 1404
      // 1401: goto 1413
      // 1404: aload 9
      // 1406: checkcast net/minecraft/world/entity/LivingEntity
      // 1409: astore 13
      // 140b: aload 13
      // 140d: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 1410: goto 1416
      // 1413: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 1416: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 1419: getstatic net/minecraft/world/level/block/Blocks.BLUE_WOOL Lnet/minecraft/world/level/block/Block;
      // 141c: invokevirtual net/minecraft/world/level/block/Block.asItem ()Lnet/minecraft/world/item/Item;
      // 141f: if_acmpeq 1425
      // 1422: goto 1d6b
      // 1425: aload 9
      // 1427: instanceof net/minecraft/world/entity/player/Player
      // 142a: ifne 1430
      // 142d: goto 145f
      // 1430: aload 9
      // 1432: checkcast net/minecraft/world/entity/player/Player
      // 1435: astore 14
      // 1437: new net/minecraft/world/item/ItemStack
      // 143a: dup
      // 143b: getstatic net/minecraft/world/level/block/Blocks.BLUE_WOOL Lnet/minecraft/world/level/block/Block;
      // 143e: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 1441: astore 15
      // 1443: aload 14
      // 1445: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 1448: aload 15
      // 144a: invokedynamic test (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, net/mocreatures/procedures/UndeadOstrichEquipmentSwapProcedure.lambda$execute$2 (Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z, (Lnet/minecraft/world/item/ItemStack;)Z ]
      // 144f: bipush 1
      // 1450: aload 14
      // 1452: getfield net/minecraft/world/entity/player/Player.inventoryMenu Lnet/minecraft/world/inventory/InventoryMenu;
      // 1455: invokevirtual net/minecraft/world/inventory/InventoryMenu.getCraftSlots ()Lnet/minecraft/world/inventory/CraftingContainer;
      // 1458: invokevirtual net/minecraft/world/entity/player/Inventory.clearOrCountMatchingItems (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
      // 145b: pop
      // 145c: goto 145f
      // 145f: aload 8
      // 1461: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 1464: ifne 146a
      // 1467: goto 1483
      // 146a: aload 8
      // 146c: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 146f: astore 14
      // 1471: aload 14
      // 1473: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1476: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGreen_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1479: bipush 1
      // 147a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 147d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 1480: goto 1483
      // 1483: aload 8
      // 1485: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 1488: ifne 148e
      // 148b: goto 14b0
      // 148e: aload 8
      // 1490: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 1493: astore 14
      // 1495: aload 14
      // 1497: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 149a: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Green_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 149d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 14a0: checkcast java/lang/Boolean
      // 14a3: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 14a6: ifne 14ac
      // 14a9: goto 14b0
      // 14ac: bipush 1
      // 14ad: goto 14b1
      // 14b0: bipush 0
      // 14b1: bipush 1
      // 14b2: if_icmpeq 14b8
      // 14b5: goto 151b
      // 14b8: aload 1
      // 14b9: instanceof net/minecraft/server/level/ServerLevel
      // 14bc: ifne 14c2
      // 14bf: goto 14f4
      // 14c2: aload 1
      // 14c3: checkcast net/minecraft/server/level/ServerLevel
      // 14c6: astore 15
      // 14c8: new net/minecraft/world/entity/item/ItemEntity
      // 14cb: dup
      // 14cc: aload 15
      // 14ce: dload 2
      // 14cf: dload 4
      // 14d1: dload 6
      // 14d3: new net/minecraft/world/item/ItemStack
      // 14d6: dup
      // 14d7: getstatic net/minecraft/world/level/block/Blocks.GREEN_WOOL Lnet/minecraft/world/level/block/Block;
      // 14da: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 14dd: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 14e0: astore 16
      // 14e2: aload 16
      // 14e4: bipush 10
      // 14e6: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 14e9: aload 15
      // 14eb: aload 16
      // 14ed: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 14f0: pop
      // 14f1: goto 14f4
      // 14f4: aload 8
      // 14f6: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 14f9: ifne 14ff
      // 14fc: goto 1518
      // 14ff: aload 8
      // 1501: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 1504: astore 15
      // 1506: aload 15
      // 1508: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 150b: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Green_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 150e: bipush 0
      // 150f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1512: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 1515: goto 1518
      // 1518: goto 151b
      // 151b: aload 8
      // 151d: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 1520: ifne 1526
      // 1523: goto 1548
      // 1526: aload 8
      // 1528: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 152b: astore 14
      // 152d: aload 14
      // 152f: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1532: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGreen_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1535: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 1538: checkcast java/lang/Boolean
      // 153b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 153e: ifne 1544
      // 1541: goto 1548
      // 1544: bipush 1
      // 1545: goto 1549
      // 1548: bipush 0
      // 1549: bipush 1
      // 154a: if_icmpeq 1550
      // 154d: goto 15b3
      // 1550: aload 1
      // 1551: instanceof net/minecraft/server/level/ServerLevel
      // 1554: ifne 155a
      // 1557: goto 158c
      // 155a: aload 1
      // 155b: checkcast net/minecraft/server/level/ServerLevel
      // 155e: astore 15
      // 1560: new net/minecraft/world/entity/item/ItemEntity
      // 1563: dup
      // 1564: aload 15
      // 1566: dload 2
      // 1567: dload 4
      // 1569: dload 6
      // 156b: new net/minecraft/world/item/ItemStack
      // 156e: dup
      // 156f: getstatic net/minecraft/world/level/block/Blocks.LIME_WOOL Lnet/minecraft/world/level/block/Block;
      // 1572: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 1575: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1578: astore 16
      // 157a: aload 16
      // 157c: bipush 10
      // 157e: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1581: aload 15
      // 1583: aload 16
      // 1585: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1588: pop
      // 1589: goto 158c
      // 158c: aload 8
      // 158e: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 1591: ifne 1597
      // 1594: goto 15b0
      // 1597: aload 8
      // 1599: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 159c: astore 15
      // 159e: aload 15
      // 15a0: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 15a3: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGreen_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 15a6: bipush 0
      // 15a7: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 15aa: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 15ad: goto 15b0
      // 15b0: goto 15b3
      // 15b3: aload 8
      // 15b5: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 15b8: ifne 15be
      // 15bb: goto 15e0
      // 15be: aload 8
      // 15c0: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 15c3: astore 14
      // 15c5: aload 14
      // 15c7: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 15ca: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightBlue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 15cd: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 15d0: checkcast java/lang/Boolean
      // 15d3: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 15d6: ifne 15dc
      // 15d9: goto 15e0
      // 15dc: bipush 1
      // 15dd: goto 15e1
      // 15e0: bipush 0
      // 15e1: bipush 1
      // 15e2: if_icmpeq 15e8
      // 15e5: goto 164b
      // 15e8: aload 1
      // 15e9: instanceof net/minecraft/server/level/ServerLevel
      // 15ec: ifne 15f2
      // 15ef: goto 1624
      // 15f2: aload 1
      // 15f3: checkcast net/minecraft/server/level/ServerLevel
      // 15f6: astore 15
      // 15f8: new net/minecraft/world/entity/item/ItemEntity
      // 15fb: dup
      // 15fc: aload 15
      // 15fe: dload 2
      // 15ff: dload 4
      // 1601: dload 6
      // 1603: new net/minecraft/world/item/ItemStack
      // 1606: dup
      // 1607: getstatic net/minecraft/world/level/block/Blocks.LIGHT_BLUE_WOOL Lnet/minecraft/world/level/block/Block;
      // 160a: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 160d: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1610: astore 16
      // 1612: aload 16
      // 1614: bipush 10
      // 1616: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1619: aload 15
      // 161b: aload 16
      // 161d: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1620: pop
      // 1621: goto 1624
      // 1624: aload 8
      // 1626: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 1629: ifne 162f
      // 162c: goto 1648
      // 162f: aload 8
      // 1631: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 1634: astore 15
      // 1636: aload 15
      // 1638: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 163b: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightBlue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 163e: bipush 0
      // 163f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1642: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 1645: goto 1648
      // 1648: goto 164b
      // 164b: aload 8
      // 164d: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 1650: ifne 1656
      // 1653: goto 1678
      // 1656: aload 8
      // 1658: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 165b: astore 14
      // 165d: aload 14
      // 165f: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1662: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Pink_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1665: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 1668: checkcast java/lang/Boolean
      // 166b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 166e: ifne 1674
      // 1671: goto 1678
      // 1674: bipush 1
      // 1675: goto 1679
      // 1678: bipush 0
      // 1679: bipush 1
      // 167a: if_icmpeq 1680
      // 167d: goto 16e3
      // 1680: aload 1
      // 1681: instanceof net/minecraft/server/level/ServerLevel
      // 1684: ifne 168a
      // 1687: goto 16bc
      // 168a: aload 1
      // 168b: checkcast net/minecraft/server/level/ServerLevel
      // 168e: astore 15
      // 1690: new net/minecraft/world/entity/item/ItemEntity
      // 1693: dup
      // 1694: aload 15
      // 1696: dload 2
      // 1697: dload 4
      // 1699: dload 6
      // 169b: new net/minecraft/world/item/ItemStack
      // 169e: dup
      // 169f: getstatic net/minecraft/world/level/block/Blocks.PINK_WOOL Lnet/minecraft/world/level/block/Block;
      // 16a2: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 16a5: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 16a8: astore 16
      // 16aa: aload 16
      // 16ac: bipush 10
      // 16ae: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 16b1: aload 15
      // 16b3: aload 16
      // 16b5: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 16b8: pop
      // 16b9: goto 16bc
      // 16bc: aload 8
      // 16be: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 16c1: ifne 16c7
      // 16c4: goto 16e0
      // 16c7: aload 8
      // 16c9: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 16cc: astore 15
      // 16ce: aload 15
      // 16d0: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 16d3: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Pink_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 16d6: bipush 0
      // 16d7: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 16da: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 16dd: goto 16e0
      // 16e0: goto 16e3
      // 16e3: aload 8
      // 16e5: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 16e8: ifne 16ee
      // 16eb: goto 1710
      // 16ee: aload 8
      // 16f0: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 16f3: astore 14
      // 16f5: aload 14
      // 16f7: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 16fa: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Magenta_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 16fd: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 1700: checkcast java/lang/Boolean
      // 1703: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1706: ifne 170c
      // 1709: goto 1710
      // 170c: bipush 1
      // 170d: goto 1711
      // 1710: bipush 0
      // 1711: bipush 1
      // 1712: if_icmpeq 1718
      // 1715: goto 177b
      // 1718: aload 1
      // 1719: instanceof net/minecraft/server/level/ServerLevel
      // 171c: ifne 1722
      // 171f: goto 1754
      // 1722: aload 1
      // 1723: checkcast net/minecraft/server/level/ServerLevel
      // 1726: astore 15
      // 1728: new net/minecraft/world/entity/item/ItemEntity
      // 172b: dup
      // 172c: aload 15
      // 172e: dload 2
      // 172f: dload 4
      // 1731: dload 6
      // 1733: new net/minecraft/world/item/ItemStack
      // 1736: dup
      // 1737: getstatic net/minecraft/world/level/block/Blocks.MAGENTA_WOOL Lnet/minecraft/world/level/block/Block;
      // 173a: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 173d: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1740: astore 16
      // 1742: aload 16
      // 1744: bipush 10
      // 1746: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1749: aload 15
      // 174b: aload 16
      // 174d: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1750: pop
      // 1751: goto 1754
      // 1754: aload 8
      // 1756: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 1759: ifne 175f
      // 175c: goto 1778
      // 175f: aload 8
      // 1761: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 1764: astore 15
      // 1766: aload 15
      // 1768: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 176b: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Magenta_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 176e: bipush 0
      // 176f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1772: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 1775: goto 1778
      // 1778: goto 177b
      // 177b: aload 8
      // 177d: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 1780: ifne 1786
      // 1783: goto 17a8
      // 1786: aload 8
      // 1788: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 178b: astore 14
      // 178d: aload 14
      // 178f: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1792: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Purple_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1795: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 1798: checkcast java/lang/Boolean
      // 179b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 179e: ifne 17a4
      // 17a1: goto 17a8
      // 17a4: bipush 1
      // 17a5: goto 17a9
      // 17a8: bipush 0
      // 17a9: bipush 1
      // 17aa: if_icmpeq 17b0
      // 17ad: goto 1813
      // 17b0: aload 1
      // 17b1: instanceof net/minecraft/server/level/ServerLevel
      // 17b4: ifne 17ba
      // 17b7: goto 17ec
      // 17ba: aload 1
      // 17bb: checkcast net/minecraft/server/level/ServerLevel
      // 17be: astore 15
      // 17c0: new net/minecraft/world/entity/item/ItemEntity
      // 17c3: dup
      // 17c4: aload 15
      // 17c6: dload 2
      // 17c7: dload 4
      // 17c9: dload 6
      // 17cb: new net/minecraft/world/item/ItemStack
      // 17ce: dup
      // 17cf: getstatic net/minecraft/world/level/block/Blocks.PURPLE_WOOL Lnet/minecraft/world/level/block/Block;
      // 17d2: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 17d5: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 17d8: astore 16
      // 17da: aload 16
      // 17dc: bipush 10
      // 17de: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 17e1: aload 15
      // 17e3: aload 16
      // 17e5: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 17e8: pop
      // 17e9: goto 17ec
      // 17ec: aload 8
      // 17ee: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 17f1: ifne 17f7
      // 17f4: goto 1810
      // 17f7: aload 8
      // 17f9: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 17fc: astore 15
      // 17fe: aload 15
      // 1800: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1803: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Purple_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1806: bipush 0
      // 1807: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 180a: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 180d: goto 1810
      // 1810: goto 1813
      // 1813: aload 8
      // 1815: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 1818: ifne 181e
      // 181b: goto 1840
      // 181e: aload 8
      // 1820: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 1823: astore 14
      // 1825: aload 14
      // 1827: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 182a: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Orange_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 182d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 1830: checkcast java/lang/Boolean
      // 1833: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1836: ifne 183c
      // 1839: goto 1840
      // 183c: bipush 1
      // 183d: goto 1841
      // 1840: bipush 0
      // 1841: bipush 1
      // 1842: if_icmpeq 1848
      // 1845: goto 18ab
      // 1848: aload 1
      // 1849: instanceof net/minecraft/server/level/ServerLevel
      // 184c: ifne 1852
      // 184f: goto 1884
      // 1852: aload 1
      // 1853: checkcast net/minecraft/server/level/ServerLevel
      // 1856: astore 15
      // 1858: new net/minecraft/world/entity/item/ItemEntity
      // 185b: dup
      // 185c: aload 15
      // 185e: dload 2
      // 185f: dload 4
      // 1861: dload 6
      // 1863: new net/minecraft/world/item/ItemStack
      // 1866: dup
      // 1867: getstatic net/minecraft/world/level/block/Blocks.ORANGE_WOOL Lnet/minecraft/world/level/block/Block;
      // 186a: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 186d: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1870: astore 16
      // 1872: aload 16
      // 1874: bipush 10
      // 1876: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1879: aload 15
      // 187b: aload 16
      // 187d: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1880: pop
      // 1881: goto 1884
      // 1884: aload 8
      // 1886: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 1889: ifne 188f
      // 188c: goto 18a8
      // 188f: aload 8
      // 1891: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 1894: astore 15
      // 1896: aload 15
      // 1898: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 189b: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Orange_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 189e: bipush 0
      // 189f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 18a2: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 18a5: goto 18a8
      // 18a8: goto 18ab
      // 18ab: aload 8
      // 18ad: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 18b0: ifne 18b6
      // 18b3: goto 18d8
      // 18b6: aload 8
      // 18b8: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 18bb: astore 14
      // 18bd: aload 14
      // 18bf: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 18c2: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Cyan_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 18c5: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 18c8: checkcast java/lang/Boolean
      // 18cb: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 18ce: ifne 18d4
      // 18d1: goto 18d8
      // 18d4: bipush 1
      // 18d5: goto 18d9
      // 18d8: bipush 0
      // 18d9: bipush 1
      // 18da: if_icmpeq 18e0
      // 18dd: goto 1943
      // 18e0: aload 1
      // 18e1: instanceof net/minecraft/server/level/ServerLevel
      // 18e4: ifne 18ea
      // 18e7: goto 191c
      // 18ea: aload 1
      // 18eb: checkcast net/minecraft/server/level/ServerLevel
      // 18ee: astore 15
      // 18f0: new net/minecraft/world/entity/item/ItemEntity
      // 18f3: dup
      // 18f4: aload 15
      // 18f6: dload 2
      // 18f7: dload 4
      // 18f9: dload 6
      // 18fb: new net/minecraft/world/item/ItemStack
      // 18fe: dup
      // 18ff: getstatic net/minecraft/world/level/block/Blocks.CYAN_WOOL Lnet/minecraft/world/level/block/Block;
      // 1902: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 1905: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1908: astore 16
      // 190a: aload 16
      // 190c: bipush 10
      // 190e: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1911: aload 15
      // 1913: aload 16
      // 1915: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1918: pop
      // 1919: goto 191c
      // 191c: aload 8
      // 191e: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 1921: ifne 1927
      // 1924: goto 1940
      // 1927: aload 8
      // 1929: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 192c: astore 15
      // 192e: aload 15
      // 1930: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1933: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Cyan_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1936: bipush 0
      // 1937: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 193a: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 193d: goto 1940
      // 1940: goto 1943
      // 1943: aload 8
      // 1945: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 1948: ifne 194e
      // 194b: goto 1970
      // 194e: aload 8
      // 1950: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 1953: astore 14
      // 1955: aload 14
      // 1957: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 195a: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Red_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 195d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 1960: checkcast java/lang/Boolean
      // 1963: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1966: ifne 196c
      // 1969: goto 1970
      // 196c: bipush 1
      // 196d: goto 1971
      // 1970: bipush 0
      // 1971: bipush 1
      // 1972: if_icmpeq 1978
      // 1975: goto 19db
      // 1978: aload 1
      // 1979: instanceof net/minecraft/server/level/ServerLevel
      // 197c: ifne 1982
      // 197f: goto 19b4
      // 1982: aload 1
      // 1983: checkcast net/minecraft/server/level/ServerLevel
      // 1986: astore 15
      // 1988: new net/minecraft/world/entity/item/ItemEntity
      // 198b: dup
      // 198c: aload 15
      // 198e: dload 2
      // 198f: dload 4
      // 1991: dload 6
      // 1993: new net/minecraft/world/item/ItemStack
      // 1996: dup
      // 1997: getstatic net/minecraft/world/level/block/Blocks.RED_WOOL Lnet/minecraft/world/level/block/Block;
      // 199a: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 199d: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 19a0: astore 16
      // 19a2: aload 16
      // 19a4: bipush 10
      // 19a6: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 19a9: aload 15
      // 19ab: aload 16
      // 19ad: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 19b0: pop
      // 19b1: goto 19b4
      // 19b4: aload 8
      // 19b6: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 19b9: ifne 19bf
      // 19bc: goto 19d8
      // 19bf: aload 8
      // 19c1: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 19c4: astore 15
      // 19c6: aload 15
      // 19c8: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 19cb: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Red_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 19ce: bipush 0
      // 19cf: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 19d2: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 19d5: goto 19d8
      // 19d8: goto 19db
      // 19db: aload 8
      // 19dd: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 19e0: ifne 19e6
      // 19e3: goto 1a08
      // 19e6: aload 8
      // 19e8: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 19eb: astore 14
      // 19ed: aload 14
      // 19ef: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 19f2: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Yellow_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 19f5: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 19f8: checkcast java/lang/Boolean
      // 19fb: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 19fe: ifne 1a04
      // 1a01: goto 1a08
      // 1a04: bipush 1
      // 1a05: goto 1a09
      // 1a08: bipush 0
      // 1a09: bipush 1
      // 1a0a: if_icmpeq 1a10
      // 1a0d: goto 1a73
      // 1a10: aload 1
      // 1a11: instanceof net/minecraft/server/level/ServerLevel
      // 1a14: ifne 1a1a
      // 1a17: goto 1a4c
      // 1a1a: aload 1
      // 1a1b: checkcast net/minecraft/server/level/ServerLevel
      // 1a1e: astore 15
      // 1a20: new net/minecraft/world/entity/item/ItemEntity
      // 1a23: dup
      // 1a24: aload 15
      // 1a26: dload 2
      // 1a27: dload 4
      // 1a29: dload 6
      // 1a2b: new net/minecraft/world/item/ItemStack
      // 1a2e: dup
      // 1a2f: getstatic net/minecraft/world/level/block/Blocks.YELLOW_WOOL Lnet/minecraft/world/level/block/Block;
      // 1a32: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 1a35: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1a38: astore 16
      // 1a3a: aload 16
      // 1a3c: bipush 10
      // 1a3e: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1a41: aload 15
      // 1a43: aload 16
      // 1a45: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1a48: pop
      // 1a49: goto 1a4c
      // 1a4c: aload 8
      // 1a4e: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 1a51: ifne 1a57
      // 1a54: goto 1a70
      // 1a57: aload 8
      // 1a59: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 1a5c: astore 15
      // 1a5e: aload 15
      // 1a60: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1a63: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Yellow_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1a66: bipush 0
      // 1a67: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1a6a: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 1a6d: goto 1a70
      // 1a70: goto 1a73
      // 1a73: aload 8
      // 1a75: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 1a78: ifne 1a7e
      // 1a7b: goto 1aa0
      // 1a7e: aload 8
      // 1a80: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 1a83: astore 14
      // 1a85: aload 14
      // 1a87: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1a8a: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_White_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1a8d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 1a90: checkcast java/lang/Boolean
      // 1a93: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1a96: ifne 1a9c
      // 1a99: goto 1aa0
      // 1a9c: bipush 1
      // 1a9d: goto 1aa1
      // 1aa0: bipush 0
      // 1aa1: bipush 1
      // 1aa2: if_icmpeq 1aa8
      // 1aa5: goto 1b0b
      // 1aa8: aload 1
      // 1aa9: instanceof net/minecraft/server/level/ServerLevel
      // 1aac: ifne 1ab2
      // 1aaf: goto 1ae4
      // 1ab2: aload 1
      // 1ab3: checkcast net/minecraft/server/level/ServerLevel
      // 1ab6: astore 15
      // 1ab8: new net/minecraft/world/entity/item/ItemEntity
      // 1abb: dup
      // 1abc: aload 15
      // 1abe: dload 2
      // 1abf: dload 4
      // 1ac1: dload 6
      // 1ac3: new net/minecraft/world/item/ItemStack
      // 1ac6: dup
      // 1ac7: getstatic net/minecraft/world/level/block/Blocks.WHITE_WOOL Lnet/minecraft/world/level/block/Block;
      // 1aca: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 1acd: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1ad0: astore 16
      // 1ad2: aload 16
      // 1ad4: bipush 10
      // 1ad6: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1ad9: aload 15
      // 1adb: aload 16
      // 1add: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1ae0: pop
      // 1ae1: goto 1ae4
      // 1ae4: aload 8
      // 1ae6: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 1ae9: ifne 1aef
      // 1aec: goto 1b08
      // 1aef: aload 8
      // 1af1: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 1af4: astore 15
      // 1af6: aload 15
      // 1af8: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1afb: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_White_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1afe: bipush 0
      // 1aff: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1b02: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 1b05: goto 1b08
      // 1b08: goto 1b0b
      // 1b0b: aload 8
      // 1b0d: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 1b10: ifne 1b16
      // 1b13: goto 1b38
      // 1b16: aload 8
      // 1b18: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 1b1b: astore 14
      // 1b1d: aload 14
      // 1b1f: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1b22: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Grey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1b25: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 1b28: checkcast java/lang/Boolean
      // 1b2b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1b2e: ifne 1b34
      // 1b31: goto 1b38
      // 1b34: bipush 1
      // 1b35: goto 1b39
      // 1b38: bipush 0
      // 1b39: bipush 1
      // 1b3a: if_icmpeq 1b40
      // 1b3d: goto 1ba3
      // 1b40: aload 1
      // 1b41: instanceof net/minecraft/server/level/ServerLevel
      // 1b44: ifne 1b4a
      // 1b47: goto 1b7c
      // 1b4a: aload 1
      // 1b4b: checkcast net/minecraft/server/level/ServerLevel
      // 1b4e: astore 15
      // 1b50: new net/minecraft/world/entity/item/ItemEntity
      // 1b53: dup
      // 1b54: aload 15
      // 1b56: dload 2
      // 1b57: dload 4
      // 1b59: dload 6
      // 1b5b: new net/minecraft/world/item/ItemStack
      // 1b5e: dup
      // 1b5f: getstatic net/minecraft/world/level/block/Blocks.GRAY_WOOL Lnet/minecraft/world/level/block/Block;
      // 1b62: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 1b65: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1b68: astore 16
      // 1b6a: aload 16
      // 1b6c: bipush 10
      // 1b6e: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1b71: aload 15
      // 1b73: aload 16
      // 1b75: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1b78: pop
      // 1b79: goto 1b7c
      // 1b7c: aload 8
      // 1b7e: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 1b81: ifne 1b87
      // 1b84: goto 1ba0
      // 1b87: aload 8
      // 1b89: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 1b8c: astore 15
      // 1b8e: aload 15
      // 1b90: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1b93: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Grey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1b96: bipush 0
      // 1b97: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1b9a: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 1b9d: goto 1ba0
      // 1ba0: goto 1ba3
      // 1ba3: aload 8
      // 1ba5: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 1ba8: ifne 1bae
      // 1bab: goto 1bd0
      // 1bae: aload 8
      // 1bb0: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 1bb3: astore 14
      // 1bb5: aload 14
      // 1bb7: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1bba: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGrey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1bbd: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 1bc0: checkcast java/lang/Boolean
      // 1bc3: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1bc6: ifne 1bcc
      // 1bc9: goto 1bd0
      // 1bcc: bipush 1
      // 1bcd: goto 1bd1
      // 1bd0: bipush 0
      // 1bd1: bipush 1
      // 1bd2: if_icmpeq 1bd8
      // 1bd5: goto 1c3b
      // 1bd8: aload 1
      // 1bd9: instanceof net/minecraft/server/level/ServerLevel
      // 1bdc: ifne 1be2
      // 1bdf: goto 1c14
      // 1be2: aload 1
      // 1be3: checkcast net/minecraft/server/level/ServerLevel
      // 1be6: astore 15
      // 1be8: new net/minecraft/world/entity/item/ItemEntity
      // 1beb: dup
      // 1bec: aload 15
      // 1bee: dload 2
      // 1bef: dload 4
      // 1bf1: dload 6
      // 1bf3: new net/minecraft/world/item/ItemStack
      // 1bf6: dup
      // 1bf7: getstatic net/minecraft/world/level/block/Blocks.LIGHT_GRAY_WOOL Lnet/minecraft/world/level/block/Block;
      // 1bfa: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 1bfd: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1c00: astore 16
      // 1c02: aload 16
      // 1c04: bipush 10
      // 1c06: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1c09: aload 15
      // 1c0b: aload 16
      // 1c0d: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1c10: pop
      // 1c11: goto 1c14
      // 1c14: aload 8
      // 1c16: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 1c19: ifne 1c1f
      // 1c1c: goto 1c38
      // 1c1f: aload 8
      // 1c21: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 1c24: astore 15
      // 1c26: aload 15
      // 1c28: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1c2b: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGrey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1c2e: bipush 0
      // 1c2f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1c32: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 1c35: goto 1c38
      // 1c38: goto 1c3b
      // 1c3b: aload 8
      // 1c3d: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 1c40: ifne 1c46
      // 1c43: goto 1c68
      // 1c46: aload 8
      // 1c48: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 1c4b: astore 14
      // 1c4d: aload 14
      // 1c4f: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1c52: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Black_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1c55: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 1c58: checkcast java/lang/Boolean
      // 1c5b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1c5e: ifne 1c64
      // 1c61: goto 1c68
      // 1c64: bipush 1
      // 1c65: goto 1c69
      // 1c68: bipush 0
      // 1c69: bipush 1
      // 1c6a: if_icmpeq 1c70
      // 1c6d: goto 1cd3
      // 1c70: aload 1
      // 1c71: instanceof net/minecraft/server/level/ServerLevel
      // 1c74: ifne 1c7a
      // 1c77: goto 1cac
      // 1c7a: aload 1
      // 1c7b: checkcast net/minecraft/server/level/ServerLevel
      // 1c7e: astore 15
      // 1c80: new net/minecraft/world/entity/item/ItemEntity
      // 1c83: dup
      // 1c84: aload 15
      // 1c86: dload 2
      // 1c87: dload 4
      // 1c89: dload 6
      // 1c8b: new net/minecraft/world/item/ItemStack
      // 1c8e: dup
      // 1c8f: getstatic net/minecraft/world/level/block/Blocks.BLACK_WOOL Lnet/minecraft/world/level/block/Block;
      // 1c92: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 1c95: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1c98: astore 16
      // 1c9a: aload 16
      // 1c9c: bipush 10
      // 1c9e: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1ca1: aload 15
      // 1ca3: aload 16
      // 1ca5: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1ca8: pop
      // 1ca9: goto 1cac
      // 1cac: aload 8
      // 1cae: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 1cb1: ifne 1cb7
      // 1cb4: goto 1cd0
      // 1cb7: aload 8
      // 1cb9: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 1cbc: astore 15
      // 1cbe: aload 15
      // 1cc0: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1cc3: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Black_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1cc6: bipush 0
      // 1cc7: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1cca: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 1ccd: goto 1cd0
      // 1cd0: goto 1cd3
      // 1cd3: aload 8
      // 1cd5: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 1cd8: ifne 1cde
      // 1cdb: goto 1d00
      // 1cde: aload 8
      // 1ce0: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 1ce3: astore 14
      // 1ce5: aload 14
      // 1ce7: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1cea: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Brown_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1ced: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 1cf0: checkcast java/lang/Boolean
      // 1cf3: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1cf6: ifne 1cfc
      // 1cf9: goto 1d00
      // 1cfc: bipush 1
      // 1cfd: goto 1d01
      // 1d00: bipush 0
      // 1d01: bipush 1
      // 1d02: if_icmpeq 1d08
      // 1d05: goto 1d6b
      // 1d08: aload 1
      // 1d09: instanceof net/minecraft/server/level/ServerLevel
      // 1d0c: ifne 1d12
      // 1d0f: goto 1d44
      // 1d12: aload 1
      // 1d13: checkcast net/minecraft/server/level/ServerLevel
      // 1d16: astore 15
      // 1d18: new net/minecraft/world/entity/item/ItemEntity
      // 1d1b: dup
      // 1d1c: aload 15
      // 1d1e: dload 2
      // 1d1f: dload 4
      // 1d21: dload 6
      // 1d23: new net/minecraft/world/item/ItemStack
      // 1d26: dup
      // 1d27: getstatic net/minecraft/world/level/block/Blocks.BROWN_WOOL Lnet/minecraft/world/level/block/Block;
      // 1d2a: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 1d2d: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1d30: astore 16
      // 1d32: aload 16
      // 1d34: bipush 10
      // 1d36: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1d39: aload 15
      // 1d3b: aload 16
      // 1d3d: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1d40: pop
      // 1d41: goto 1d44
      // 1d44: aload 8
      // 1d46: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 1d49: ifne 1d4f
      // 1d4c: goto 1d68
      // 1d4f: aload 8
      // 1d51: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 1d54: astore 15
      // 1d56: aload 15
      // 1d58: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1d5b: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Brown_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1d5e: bipush 0
      // 1d5f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1d62: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 1d65: goto 1d68
      // 1d68: goto 1d6b
      // 1d6b: aload 8
      // 1d6d: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 1d70: ifne 1d76
      // 1d73: goto 1d98
      // 1d76: aload 8
      // 1d78: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 1d7b: astore 12
      // 1d7d: aload 12
      // 1d7f: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1d82: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightBlue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1d85: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 1d88: checkcast java/lang/Boolean
      // 1d8b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1d8e: ifne 1d94
      // 1d91: goto 1d98
      // 1d94: bipush 1
      // 1d95: goto 1d99
      // 1d98: bipush 0
      // 1d99: ifeq 1d9f
      // 1d9c: goto 2711
      // 1d9f: aload 9
      // 1da1: instanceof net/minecraft/world/entity/LivingEntity
      // 1da4: ifne 1daa
      // 1da7: goto 1db9
      // 1daa: aload 9
      // 1dac: checkcast net/minecraft/world/entity/LivingEntity
      // 1daf: astore 13
      // 1db1: aload 13
      // 1db3: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 1db6: goto 1dbc
      // 1db9: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 1dbc: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 1dbf: getstatic net/minecraft/world/level/block/Blocks.LIGHT_BLUE_WOOL Lnet/minecraft/world/level/block/Block;
      // 1dc2: invokevirtual net/minecraft/world/level/block/Block.asItem ()Lnet/minecraft/world/item/Item;
      // 1dc5: if_acmpeq 1dcb
      // 1dc8: goto 2711
      // 1dcb: aload 9
      // 1dcd: instanceof net/minecraft/world/entity/player/Player
      // 1dd0: ifne 1dd6
      // 1dd3: goto 1e05
      // 1dd6: aload 9
      // 1dd8: checkcast net/minecraft/world/entity/player/Player
      // 1ddb: astore 14
      // 1ddd: new net/minecraft/world/item/ItemStack
      // 1de0: dup
      // 1de1: getstatic net/minecraft/world/level/block/Blocks.LIGHT_BLUE_WOOL Lnet/minecraft/world/level/block/Block;
      // 1de4: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 1de7: astore 15
      // 1de9: aload 14
      // 1deb: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 1dee: aload 15
      // 1df0: invokedynamic test (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, net/mocreatures/procedures/UndeadOstrichEquipmentSwapProcedure.lambda$execute$3 (Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z, (Lnet/minecraft/world/item/ItemStack;)Z ]
      // 1df5: bipush 1
      // 1df6: aload 14
      // 1df8: getfield net/minecraft/world/entity/player/Player.inventoryMenu Lnet/minecraft/world/inventory/InventoryMenu;
      // 1dfb: invokevirtual net/minecraft/world/inventory/InventoryMenu.getCraftSlots ()Lnet/minecraft/world/inventory/CraftingContainer;
      // 1dfe: invokevirtual net/minecraft/world/entity/player/Inventory.clearOrCountMatchingItems (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
      // 1e01: pop
      // 1e02: goto 1e05
      // 1e05: aload 8
      // 1e07: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 1e0a: ifne 1e10
      // 1e0d: goto 1e29
      // 1e10: aload 8
      // 1e12: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 1e15: astore 14
      // 1e17: aload 14
      // 1e19: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1e1c: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightBlue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1e1f: bipush 1
      // 1e20: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1e23: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 1e26: goto 1e29
      // 1e29: aload 8
      // 1e2b: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 1e2e: ifne 1e34
      // 1e31: goto 1e56
      // 1e34: aload 8
      // 1e36: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 1e39: astore 14
      // 1e3b: aload 14
      // 1e3d: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1e40: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Green_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1e43: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 1e46: checkcast java/lang/Boolean
      // 1e49: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1e4c: ifne 1e52
      // 1e4f: goto 1e56
      // 1e52: bipush 1
      // 1e53: goto 1e57
      // 1e56: bipush 0
      // 1e57: bipush 1
      // 1e58: if_icmpeq 1e5e
      // 1e5b: goto 1ec1
      // 1e5e: aload 1
      // 1e5f: instanceof net/minecraft/server/level/ServerLevel
      // 1e62: ifne 1e68
      // 1e65: goto 1e9a
      // 1e68: aload 1
      // 1e69: checkcast net/minecraft/server/level/ServerLevel
      // 1e6c: astore 15
      // 1e6e: new net/minecraft/world/entity/item/ItemEntity
      // 1e71: dup
      // 1e72: aload 15
      // 1e74: dload 2
      // 1e75: dload 4
      // 1e77: dload 6
      // 1e79: new net/minecraft/world/item/ItemStack
      // 1e7c: dup
      // 1e7d: getstatic net/minecraft/world/level/block/Blocks.GREEN_WOOL Lnet/minecraft/world/level/block/Block;
      // 1e80: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 1e83: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1e86: astore 16
      // 1e88: aload 16
      // 1e8a: bipush 10
      // 1e8c: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1e8f: aload 15
      // 1e91: aload 16
      // 1e93: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1e96: pop
      // 1e97: goto 1e9a
      // 1e9a: aload 8
      // 1e9c: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 1e9f: ifne 1ea5
      // 1ea2: goto 1ebe
      // 1ea5: aload 8
      // 1ea7: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 1eaa: astore 15
      // 1eac: aload 15
      // 1eae: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1eb1: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Green_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1eb4: bipush 0
      // 1eb5: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1eb8: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 1ebb: goto 1ebe
      // 1ebe: goto 1ec1
      // 1ec1: aload 8
      // 1ec3: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 1ec6: ifne 1ecc
      // 1ec9: goto 1eee
      // 1ecc: aload 8
      // 1ece: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 1ed1: astore 14
      // 1ed3: aload 14
      // 1ed5: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1ed8: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGreen_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1edb: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 1ede: checkcast java/lang/Boolean
      // 1ee1: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1ee4: ifne 1eea
      // 1ee7: goto 1eee
      // 1eea: bipush 1
      // 1eeb: goto 1eef
      // 1eee: bipush 0
      // 1eef: bipush 1
      // 1ef0: if_icmpeq 1ef6
      // 1ef3: goto 1f59
      // 1ef6: aload 1
      // 1ef7: instanceof net/minecraft/server/level/ServerLevel
      // 1efa: ifne 1f00
      // 1efd: goto 1f32
      // 1f00: aload 1
      // 1f01: checkcast net/minecraft/server/level/ServerLevel
      // 1f04: astore 15
      // 1f06: new net/minecraft/world/entity/item/ItemEntity
      // 1f09: dup
      // 1f0a: aload 15
      // 1f0c: dload 2
      // 1f0d: dload 4
      // 1f0f: dload 6
      // 1f11: new net/minecraft/world/item/ItemStack
      // 1f14: dup
      // 1f15: getstatic net/minecraft/world/level/block/Blocks.LIME_WOOL Lnet/minecraft/world/level/block/Block;
      // 1f18: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 1f1b: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1f1e: astore 16
      // 1f20: aload 16
      // 1f22: bipush 10
      // 1f24: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1f27: aload 15
      // 1f29: aload 16
      // 1f2b: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1f2e: pop
      // 1f2f: goto 1f32
      // 1f32: aload 8
      // 1f34: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 1f37: ifne 1f3d
      // 1f3a: goto 1f56
      // 1f3d: aload 8
      // 1f3f: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 1f42: astore 15
      // 1f44: aload 15
      // 1f46: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1f49: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGreen_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1f4c: bipush 0
      // 1f4d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1f50: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 1f53: goto 1f56
      // 1f56: goto 1f59
      // 1f59: aload 8
      // 1f5b: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 1f5e: ifne 1f64
      // 1f61: goto 1f86
      // 1f64: aload 8
      // 1f66: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 1f69: astore 14
      // 1f6b: aload 14
      // 1f6d: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1f70: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Blue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1f73: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 1f76: checkcast java/lang/Boolean
      // 1f79: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1f7c: ifne 1f82
      // 1f7f: goto 1f86
      // 1f82: bipush 1
      // 1f83: goto 1f87
      // 1f86: bipush 0
      // 1f87: bipush 1
      // 1f88: if_icmpeq 1f8e
      // 1f8b: goto 1ff1
      // 1f8e: aload 1
      // 1f8f: instanceof net/minecraft/server/level/ServerLevel
      // 1f92: ifne 1f98
      // 1f95: goto 1fca
      // 1f98: aload 1
      // 1f99: checkcast net/minecraft/server/level/ServerLevel
      // 1f9c: astore 15
      // 1f9e: new net/minecraft/world/entity/item/ItemEntity
      // 1fa1: dup
      // 1fa2: aload 15
      // 1fa4: dload 2
      // 1fa5: dload 4
      // 1fa7: dload 6
      // 1fa9: new net/minecraft/world/item/ItemStack
      // 1fac: dup
      // 1fad: getstatic net/minecraft/world/level/block/Blocks.BLUE_WOOL Lnet/minecraft/world/level/block/Block;
      // 1fb0: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 1fb3: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1fb6: astore 16
      // 1fb8: aload 16
      // 1fba: bipush 10
      // 1fbc: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1fbf: aload 15
      // 1fc1: aload 16
      // 1fc3: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1fc6: pop
      // 1fc7: goto 1fca
      // 1fca: aload 8
      // 1fcc: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 1fcf: ifne 1fd5
      // 1fd2: goto 1fee
      // 1fd5: aload 8
      // 1fd7: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 1fda: astore 15
      // 1fdc: aload 15
      // 1fde: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1fe1: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Blue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1fe4: bipush 0
      // 1fe5: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1fe8: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 1feb: goto 1fee
      // 1fee: goto 1ff1
      // 1ff1: aload 8
      // 1ff3: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 1ff6: ifne 1ffc
      // 1ff9: goto 201e
      // 1ffc: aload 8
      // 1ffe: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 2001: astore 14
      // 2003: aload 14
      // 2005: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2008: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Pink_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 200b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 200e: checkcast java/lang/Boolean
      // 2011: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2014: ifne 201a
      // 2017: goto 201e
      // 201a: bipush 1
      // 201b: goto 201f
      // 201e: bipush 0
      // 201f: bipush 1
      // 2020: if_icmpeq 2026
      // 2023: goto 2089
      // 2026: aload 1
      // 2027: instanceof net/minecraft/server/level/ServerLevel
      // 202a: ifne 2030
      // 202d: goto 2062
      // 2030: aload 1
      // 2031: checkcast net/minecraft/server/level/ServerLevel
      // 2034: astore 15
      // 2036: new net/minecraft/world/entity/item/ItemEntity
      // 2039: dup
      // 203a: aload 15
      // 203c: dload 2
      // 203d: dload 4
      // 203f: dload 6
      // 2041: new net/minecraft/world/item/ItemStack
      // 2044: dup
      // 2045: getstatic net/minecraft/world/level/block/Blocks.PINK_WOOL Lnet/minecraft/world/level/block/Block;
      // 2048: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 204b: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 204e: astore 16
      // 2050: aload 16
      // 2052: bipush 10
      // 2054: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 2057: aload 15
      // 2059: aload 16
      // 205b: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 205e: pop
      // 205f: goto 2062
      // 2062: aload 8
      // 2064: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 2067: ifne 206d
      // 206a: goto 2086
      // 206d: aload 8
      // 206f: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 2072: astore 15
      // 2074: aload 15
      // 2076: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2079: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Pink_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 207c: bipush 0
      // 207d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2080: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 2083: goto 2086
      // 2086: goto 2089
      // 2089: aload 8
      // 208b: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 208e: ifne 2094
      // 2091: goto 20b6
      // 2094: aload 8
      // 2096: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 2099: astore 14
      // 209b: aload 14
      // 209d: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 20a0: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Magenta_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 20a3: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 20a6: checkcast java/lang/Boolean
      // 20a9: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 20ac: ifne 20b2
      // 20af: goto 20b6
      // 20b2: bipush 1
      // 20b3: goto 20b7
      // 20b6: bipush 0
      // 20b7: bipush 1
      // 20b8: if_icmpeq 20be
      // 20bb: goto 2121
      // 20be: aload 1
      // 20bf: instanceof net/minecraft/server/level/ServerLevel
      // 20c2: ifne 20c8
      // 20c5: goto 20fa
      // 20c8: aload 1
      // 20c9: checkcast net/minecraft/server/level/ServerLevel
      // 20cc: astore 15
      // 20ce: new net/minecraft/world/entity/item/ItemEntity
      // 20d1: dup
      // 20d2: aload 15
      // 20d4: dload 2
      // 20d5: dload 4
      // 20d7: dload 6
      // 20d9: new net/minecraft/world/item/ItemStack
      // 20dc: dup
      // 20dd: getstatic net/minecraft/world/level/block/Blocks.MAGENTA_WOOL Lnet/minecraft/world/level/block/Block;
      // 20e0: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 20e3: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 20e6: astore 16
      // 20e8: aload 16
      // 20ea: bipush 10
      // 20ec: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 20ef: aload 15
      // 20f1: aload 16
      // 20f3: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 20f6: pop
      // 20f7: goto 20fa
      // 20fa: aload 8
      // 20fc: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 20ff: ifne 2105
      // 2102: goto 211e
      // 2105: aload 8
      // 2107: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 210a: astore 15
      // 210c: aload 15
      // 210e: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2111: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Magenta_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2114: bipush 0
      // 2115: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2118: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 211b: goto 211e
      // 211e: goto 2121
      // 2121: aload 8
      // 2123: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 2126: ifne 212c
      // 2129: goto 214e
      // 212c: aload 8
      // 212e: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 2131: astore 14
      // 2133: aload 14
      // 2135: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2138: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Purple_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 213b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 213e: checkcast java/lang/Boolean
      // 2141: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2144: ifne 214a
      // 2147: goto 214e
      // 214a: bipush 1
      // 214b: goto 214f
      // 214e: bipush 0
      // 214f: bipush 1
      // 2150: if_icmpeq 2156
      // 2153: goto 21b9
      // 2156: aload 1
      // 2157: instanceof net/minecraft/server/level/ServerLevel
      // 215a: ifne 2160
      // 215d: goto 2192
      // 2160: aload 1
      // 2161: checkcast net/minecraft/server/level/ServerLevel
      // 2164: astore 15
      // 2166: new net/minecraft/world/entity/item/ItemEntity
      // 2169: dup
      // 216a: aload 15
      // 216c: dload 2
      // 216d: dload 4
      // 216f: dload 6
      // 2171: new net/minecraft/world/item/ItemStack
      // 2174: dup
      // 2175: getstatic net/minecraft/world/level/block/Blocks.PURPLE_WOOL Lnet/minecraft/world/level/block/Block;
      // 2178: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 217b: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 217e: astore 16
      // 2180: aload 16
      // 2182: bipush 10
      // 2184: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 2187: aload 15
      // 2189: aload 16
      // 218b: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 218e: pop
      // 218f: goto 2192
      // 2192: aload 8
      // 2194: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 2197: ifne 219d
      // 219a: goto 21b6
      // 219d: aload 8
      // 219f: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 21a2: astore 15
      // 21a4: aload 15
      // 21a6: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 21a9: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Purple_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 21ac: bipush 0
      // 21ad: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 21b0: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 21b3: goto 21b6
      // 21b6: goto 21b9
      // 21b9: aload 8
      // 21bb: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 21be: ifne 21c4
      // 21c1: goto 21e6
      // 21c4: aload 8
      // 21c6: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 21c9: astore 14
      // 21cb: aload 14
      // 21cd: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 21d0: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Orange_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 21d3: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 21d6: checkcast java/lang/Boolean
      // 21d9: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 21dc: ifne 21e2
      // 21df: goto 21e6
      // 21e2: bipush 1
      // 21e3: goto 21e7
      // 21e6: bipush 0
      // 21e7: bipush 1
      // 21e8: if_icmpeq 21ee
      // 21eb: goto 2251
      // 21ee: aload 1
      // 21ef: instanceof net/minecraft/server/level/ServerLevel
      // 21f2: ifne 21f8
      // 21f5: goto 222a
      // 21f8: aload 1
      // 21f9: checkcast net/minecraft/server/level/ServerLevel
      // 21fc: astore 15
      // 21fe: new net/minecraft/world/entity/item/ItemEntity
      // 2201: dup
      // 2202: aload 15
      // 2204: dload 2
      // 2205: dload 4
      // 2207: dload 6
      // 2209: new net/minecraft/world/item/ItemStack
      // 220c: dup
      // 220d: getstatic net/minecraft/world/level/block/Blocks.ORANGE_WOOL Lnet/minecraft/world/level/block/Block;
      // 2210: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 2213: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 2216: astore 16
      // 2218: aload 16
      // 221a: bipush 10
      // 221c: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 221f: aload 15
      // 2221: aload 16
      // 2223: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 2226: pop
      // 2227: goto 222a
      // 222a: aload 8
      // 222c: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 222f: ifne 2235
      // 2232: goto 224e
      // 2235: aload 8
      // 2237: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 223a: astore 15
      // 223c: aload 15
      // 223e: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2241: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Orange_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2244: bipush 0
      // 2245: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2248: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 224b: goto 224e
      // 224e: goto 2251
      // 2251: aload 8
      // 2253: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 2256: ifne 225c
      // 2259: goto 227e
      // 225c: aload 8
      // 225e: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 2261: astore 14
      // 2263: aload 14
      // 2265: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2268: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Cyan_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 226b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 226e: checkcast java/lang/Boolean
      // 2271: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2274: ifne 227a
      // 2277: goto 227e
      // 227a: bipush 1
      // 227b: goto 227f
      // 227e: bipush 0
      // 227f: bipush 1
      // 2280: if_icmpeq 2286
      // 2283: goto 22e9
      // 2286: aload 1
      // 2287: instanceof net/minecraft/server/level/ServerLevel
      // 228a: ifne 2290
      // 228d: goto 22c2
      // 2290: aload 1
      // 2291: checkcast net/minecraft/server/level/ServerLevel
      // 2294: astore 15
      // 2296: new net/minecraft/world/entity/item/ItemEntity
      // 2299: dup
      // 229a: aload 15
      // 229c: dload 2
      // 229d: dload 4
      // 229f: dload 6
      // 22a1: new net/minecraft/world/item/ItemStack
      // 22a4: dup
      // 22a5: getstatic net/minecraft/world/level/block/Blocks.CYAN_WOOL Lnet/minecraft/world/level/block/Block;
      // 22a8: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 22ab: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 22ae: astore 16
      // 22b0: aload 16
      // 22b2: bipush 10
      // 22b4: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 22b7: aload 15
      // 22b9: aload 16
      // 22bb: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 22be: pop
      // 22bf: goto 22c2
      // 22c2: aload 8
      // 22c4: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 22c7: ifne 22cd
      // 22ca: goto 22e6
      // 22cd: aload 8
      // 22cf: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 22d2: astore 15
      // 22d4: aload 15
      // 22d6: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 22d9: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Cyan_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 22dc: bipush 0
      // 22dd: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 22e0: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 22e3: goto 22e6
      // 22e6: goto 22e9
      // 22e9: aload 8
      // 22eb: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 22ee: ifne 22f4
      // 22f1: goto 2316
      // 22f4: aload 8
      // 22f6: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 22f9: astore 14
      // 22fb: aload 14
      // 22fd: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2300: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Red_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2303: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2306: checkcast java/lang/Boolean
      // 2309: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 230c: ifne 2312
      // 230f: goto 2316
      // 2312: bipush 1
      // 2313: goto 2317
      // 2316: bipush 0
      // 2317: bipush 1
      // 2318: if_icmpeq 231e
      // 231b: goto 2381
      // 231e: aload 1
      // 231f: instanceof net/minecraft/server/level/ServerLevel
      // 2322: ifne 2328
      // 2325: goto 235a
      // 2328: aload 1
      // 2329: checkcast net/minecraft/server/level/ServerLevel
      // 232c: astore 15
      // 232e: new net/minecraft/world/entity/item/ItemEntity
      // 2331: dup
      // 2332: aload 15
      // 2334: dload 2
      // 2335: dload 4
      // 2337: dload 6
      // 2339: new net/minecraft/world/item/ItemStack
      // 233c: dup
      // 233d: getstatic net/minecraft/world/level/block/Blocks.RED_WOOL Lnet/minecraft/world/level/block/Block;
      // 2340: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 2343: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 2346: astore 16
      // 2348: aload 16
      // 234a: bipush 10
      // 234c: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 234f: aload 15
      // 2351: aload 16
      // 2353: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 2356: pop
      // 2357: goto 235a
      // 235a: aload 8
      // 235c: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 235f: ifne 2365
      // 2362: goto 237e
      // 2365: aload 8
      // 2367: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 236a: astore 15
      // 236c: aload 15
      // 236e: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2371: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Red_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2374: bipush 0
      // 2375: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2378: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 237b: goto 237e
      // 237e: goto 2381
      // 2381: aload 8
      // 2383: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 2386: ifne 238c
      // 2389: goto 23ae
      // 238c: aload 8
      // 238e: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 2391: astore 14
      // 2393: aload 14
      // 2395: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2398: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Yellow_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 239b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 239e: checkcast java/lang/Boolean
      // 23a1: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 23a4: ifne 23aa
      // 23a7: goto 23ae
      // 23aa: bipush 1
      // 23ab: goto 23af
      // 23ae: bipush 0
      // 23af: bipush 1
      // 23b0: if_icmpeq 23b6
      // 23b3: goto 2419
      // 23b6: aload 1
      // 23b7: instanceof net/minecraft/server/level/ServerLevel
      // 23ba: ifne 23c0
      // 23bd: goto 23f2
      // 23c0: aload 1
      // 23c1: checkcast net/minecraft/server/level/ServerLevel
      // 23c4: astore 15
      // 23c6: new net/minecraft/world/entity/item/ItemEntity
      // 23c9: dup
      // 23ca: aload 15
      // 23cc: dload 2
      // 23cd: dload 4
      // 23cf: dload 6
      // 23d1: new net/minecraft/world/item/ItemStack
      // 23d4: dup
      // 23d5: getstatic net/minecraft/world/level/block/Blocks.YELLOW_WOOL Lnet/minecraft/world/level/block/Block;
      // 23d8: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 23db: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 23de: astore 16
      // 23e0: aload 16
      // 23e2: bipush 10
      // 23e4: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 23e7: aload 15
      // 23e9: aload 16
      // 23eb: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 23ee: pop
      // 23ef: goto 23f2
      // 23f2: aload 8
      // 23f4: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 23f7: ifne 23fd
      // 23fa: goto 2416
      // 23fd: aload 8
      // 23ff: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 2402: astore 15
      // 2404: aload 15
      // 2406: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2409: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Yellow_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 240c: bipush 0
      // 240d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2410: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 2413: goto 2416
      // 2416: goto 2419
      // 2419: aload 8
      // 241b: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 241e: ifne 2424
      // 2421: goto 2446
      // 2424: aload 8
      // 2426: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 2429: astore 14
      // 242b: aload 14
      // 242d: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2430: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_White_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2433: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2436: checkcast java/lang/Boolean
      // 2439: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 243c: ifne 2442
      // 243f: goto 2446
      // 2442: bipush 1
      // 2443: goto 2447
      // 2446: bipush 0
      // 2447: bipush 1
      // 2448: if_icmpeq 244e
      // 244b: goto 24b1
      // 244e: aload 1
      // 244f: instanceof net/minecraft/server/level/ServerLevel
      // 2452: ifne 2458
      // 2455: goto 248a
      // 2458: aload 1
      // 2459: checkcast net/minecraft/server/level/ServerLevel
      // 245c: astore 15
      // 245e: new net/minecraft/world/entity/item/ItemEntity
      // 2461: dup
      // 2462: aload 15
      // 2464: dload 2
      // 2465: dload 4
      // 2467: dload 6
      // 2469: new net/minecraft/world/item/ItemStack
      // 246c: dup
      // 246d: getstatic net/minecraft/world/level/block/Blocks.WHITE_WOOL Lnet/minecraft/world/level/block/Block;
      // 2470: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 2473: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 2476: astore 16
      // 2478: aload 16
      // 247a: bipush 10
      // 247c: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 247f: aload 15
      // 2481: aload 16
      // 2483: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 2486: pop
      // 2487: goto 248a
      // 248a: aload 8
      // 248c: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 248f: ifne 2495
      // 2492: goto 24ae
      // 2495: aload 8
      // 2497: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 249a: astore 15
      // 249c: aload 15
      // 249e: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 24a1: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_White_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 24a4: bipush 0
      // 24a5: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 24a8: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 24ab: goto 24ae
      // 24ae: goto 24b1
      // 24b1: aload 8
      // 24b3: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 24b6: ifne 24bc
      // 24b9: goto 24de
      // 24bc: aload 8
      // 24be: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 24c1: astore 14
      // 24c3: aload 14
      // 24c5: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 24c8: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Grey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 24cb: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 24ce: checkcast java/lang/Boolean
      // 24d1: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 24d4: ifne 24da
      // 24d7: goto 24de
      // 24da: bipush 1
      // 24db: goto 24df
      // 24de: bipush 0
      // 24df: bipush 1
      // 24e0: if_icmpeq 24e6
      // 24e3: goto 2549
      // 24e6: aload 1
      // 24e7: instanceof net/minecraft/server/level/ServerLevel
      // 24ea: ifne 24f0
      // 24ed: goto 2522
      // 24f0: aload 1
      // 24f1: checkcast net/minecraft/server/level/ServerLevel
      // 24f4: astore 15
      // 24f6: new net/minecraft/world/entity/item/ItemEntity
      // 24f9: dup
      // 24fa: aload 15
      // 24fc: dload 2
      // 24fd: dload 4
      // 24ff: dload 6
      // 2501: new net/minecraft/world/item/ItemStack
      // 2504: dup
      // 2505: getstatic net/minecraft/world/level/block/Blocks.GRAY_WOOL Lnet/minecraft/world/level/block/Block;
      // 2508: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 250b: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 250e: astore 16
      // 2510: aload 16
      // 2512: bipush 10
      // 2514: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 2517: aload 15
      // 2519: aload 16
      // 251b: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 251e: pop
      // 251f: goto 2522
      // 2522: aload 8
      // 2524: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 2527: ifne 252d
      // 252a: goto 2546
      // 252d: aload 8
      // 252f: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 2532: astore 15
      // 2534: aload 15
      // 2536: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2539: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Grey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 253c: bipush 0
      // 253d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2540: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 2543: goto 2546
      // 2546: goto 2549
      // 2549: aload 8
      // 254b: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 254e: ifne 2554
      // 2551: goto 2576
      // 2554: aload 8
      // 2556: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 2559: astore 14
      // 255b: aload 14
      // 255d: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2560: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGrey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2563: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2566: checkcast java/lang/Boolean
      // 2569: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 256c: ifne 2572
      // 256f: goto 2576
      // 2572: bipush 1
      // 2573: goto 2577
      // 2576: bipush 0
      // 2577: bipush 1
      // 2578: if_icmpeq 257e
      // 257b: goto 25e1
      // 257e: aload 1
      // 257f: instanceof net/minecraft/server/level/ServerLevel
      // 2582: ifne 2588
      // 2585: goto 25ba
      // 2588: aload 1
      // 2589: checkcast net/minecraft/server/level/ServerLevel
      // 258c: astore 15
      // 258e: new net/minecraft/world/entity/item/ItemEntity
      // 2591: dup
      // 2592: aload 15
      // 2594: dload 2
      // 2595: dload 4
      // 2597: dload 6
      // 2599: new net/minecraft/world/item/ItemStack
      // 259c: dup
      // 259d: getstatic net/minecraft/world/level/block/Blocks.LIGHT_GRAY_WOOL Lnet/minecraft/world/level/block/Block;
      // 25a0: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 25a3: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 25a6: astore 16
      // 25a8: aload 16
      // 25aa: bipush 10
      // 25ac: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 25af: aload 15
      // 25b1: aload 16
      // 25b3: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 25b6: pop
      // 25b7: goto 25ba
      // 25ba: aload 8
      // 25bc: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 25bf: ifne 25c5
      // 25c2: goto 25de
      // 25c5: aload 8
      // 25c7: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 25ca: astore 15
      // 25cc: aload 15
      // 25ce: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 25d1: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGrey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 25d4: bipush 0
      // 25d5: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 25d8: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 25db: goto 25de
      // 25de: goto 25e1
      // 25e1: aload 8
      // 25e3: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 25e6: ifne 25ec
      // 25e9: goto 260e
      // 25ec: aload 8
      // 25ee: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 25f1: astore 14
      // 25f3: aload 14
      // 25f5: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 25f8: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Black_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 25fb: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 25fe: checkcast java/lang/Boolean
      // 2601: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2604: ifne 260a
      // 2607: goto 260e
      // 260a: bipush 1
      // 260b: goto 260f
      // 260e: bipush 0
      // 260f: bipush 1
      // 2610: if_icmpeq 2616
      // 2613: goto 2679
      // 2616: aload 1
      // 2617: instanceof net/minecraft/server/level/ServerLevel
      // 261a: ifne 2620
      // 261d: goto 2652
      // 2620: aload 1
      // 2621: checkcast net/minecraft/server/level/ServerLevel
      // 2624: astore 15
      // 2626: new net/minecraft/world/entity/item/ItemEntity
      // 2629: dup
      // 262a: aload 15
      // 262c: dload 2
      // 262d: dload 4
      // 262f: dload 6
      // 2631: new net/minecraft/world/item/ItemStack
      // 2634: dup
      // 2635: getstatic net/minecraft/world/level/block/Blocks.BLACK_WOOL Lnet/minecraft/world/level/block/Block;
      // 2638: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 263b: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 263e: astore 16
      // 2640: aload 16
      // 2642: bipush 10
      // 2644: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 2647: aload 15
      // 2649: aload 16
      // 264b: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 264e: pop
      // 264f: goto 2652
      // 2652: aload 8
      // 2654: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 2657: ifne 265d
      // 265a: goto 2676
      // 265d: aload 8
      // 265f: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 2662: astore 15
      // 2664: aload 15
      // 2666: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2669: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Black_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 266c: bipush 0
      // 266d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2670: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 2673: goto 2676
      // 2676: goto 2679
      // 2679: aload 8
      // 267b: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 267e: ifne 2684
      // 2681: goto 26a6
      // 2684: aload 8
      // 2686: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 2689: astore 14
      // 268b: aload 14
      // 268d: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2690: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Brown_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2693: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2696: checkcast java/lang/Boolean
      // 2699: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 269c: ifne 26a2
      // 269f: goto 26a6
      // 26a2: bipush 1
      // 26a3: goto 26a7
      // 26a6: bipush 0
      // 26a7: bipush 1
      // 26a8: if_icmpeq 26ae
      // 26ab: goto 2711
      // 26ae: aload 1
      // 26af: instanceof net/minecraft/server/level/ServerLevel
      // 26b2: ifne 26b8
      // 26b5: goto 26ea
      // 26b8: aload 1
      // 26b9: checkcast net/minecraft/server/level/ServerLevel
      // 26bc: astore 15
      // 26be: new net/minecraft/world/entity/item/ItemEntity
      // 26c1: dup
      // 26c2: aload 15
      // 26c4: dload 2
      // 26c5: dload 4
      // 26c7: dload 6
      // 26c9: new net/minecraft/world/item/ItemStack
      // 26cc: dup
      // 26cd: getstatic net/minecraft/world/level/block/Blocks.BROWN_WOOL Lnet/minecraft/world/level/block/Block;
      // 26d0: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 26d3: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 26d6: astore 16
      // 26d8: aload 16
      // 26da: bipush 10
      // 26dc: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 26df: aload 15
      // 26e1: aload 16
      // 26e3: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 26e6: pop
      // 26e7: goto 26ea
      // 26ea: aload 8
      // 26ec: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 26ef: ifne 26f5
      // 26f2: goto 270e
      // 26f5: aload 8
      // 26f7: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 26fa: astore 15
      // 26fc: aload 15
      // 26fe: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2701: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Brown_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2704: bipush 0
      // 2705: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2708: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 270b: goto 270e
      // 270e: goto 2711
      // 2711: aload 8
      // 2713: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 2716: ifne 271c
      // 2719: goto 273e
      // 271c: aload 8
      // 271e: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 2721: astore 12
      // 2723: aload 12
      // 2725: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2728: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Pink_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 272b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 272e: checkcast java/lang/Boolean
      // 2731: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2734: ifne 273a
      // 2737: goto 273e
      // 273a: bipush 1
      // 273b: goto 273f
      // 273e: bipush 0
      // 273f: ifeq 2745
      // 2742: goto 30b7
      // 2745: aload 9
      // 2747: instanceof net/minecraft/world/entity/LivingEntity
      // 274a: ifne 2750
      // 274d: goto 275f
      // 2750: aload 9
      // 2752: checkcast net/minecraft/world/entity/LivingEntity
      // 2755: astore 13
      // 2757: aload 13
      // 2759: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 275c: goto 2762
      // 275f: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 2762: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 2765: getstatic net/minecraft/world/level/block/Blocks.PINK_WOOL Lnet/minecraft/world/level/block/Block;
      // 2768: invokevirtual net/minecraft/world/level/block/Block.asItem ()Lnet/minecraft/world/item/Item;
      // 276b: if_acmpeq 2771
      // 276e: goto 30b7
      // 2771: aload 9
      // 2773: instanceof net/minecraft/world/entity/player/Player
      // 2776: ifne 277c
      // 2779: goto 27ab
      // 277c: aload 9
      // 277e: checkcast net/minecraft/world/entity/player/Player
      // 2781: astore 14
      // 2783: new net/minecraft/world/item/ItemStack
      // 2786: dup
      // 2787: getstatic net/minecraft/world/level/block/Blocks.PINK_WOOL Lnet/minecraft/world/level/block/Block;
      // 278a: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 278d: astore 15
      // 278f: aload 14
      // 2791: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 2794: aload 15
      // 2796: invokedynamic test (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, net/mocreatures/procedures/UndeadOstrichEquipmentSwapProcedure.lambda$execute$4 (Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z, (Lnet/minecraft/world/item/ItemStack;)Z ]
      // 279b: bipush 1
      // 279c: aload 14
      // 279e: getfield net/minecraft/world/entity/player/Player.inventoryMenu Lnet/minecraft/world/inventory/InventoryMenu;
      // 27a1: invokevirtual net/minecraft/world/inventory/InventoryMenu.getCraftSlots ()Lnet/minecraft/world/inventory/CraftingContainer;
      // 27a4: invokevirtual net/minecraft/world/entity/player/Inventory.clearOrCountMatchingItems (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
      // 27a7: pop
      // 27a8: goto 27ab
      // 27ab: aload 8
      // 27ad: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 27b0: ifne 27b6
      // 27b3: goto 27cf
      // 27b6: aload 8
      // 27b8: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 27bb: astore 14
      // 27bd: aload 14
      // 27bf: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 27c2: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Pink_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 27c5: bipush 1
      // 27c6: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 27c9: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 27cc: goto 27cf
      // 27cf: aload 8
      // 27d1: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 27d4: ifne 27da
      // 27d7: goto 27fc
      // 27da: aload 8
      // 27dc: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 27df: astore 14
      // 27e1: aload 14
      // 27e3: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 27e6: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Green_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 27e9: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 27ec: checkcast java/lang/Boolean
      // 27ef: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 27f2: ifne 27f8
      // 27f5: goto 27fc
      // 27f8: bipush 1
      // 27f9: goto 27fd
      // 27fc: bipush 0
      // 27fd: bipush 1
      // 27fe: if_icmpeq 2804
      // 2801: goto 2867
      // 2804: aload 1
      // 2805: instanceof net/minecraft/server/level/ServerLevel
      // 2808: ifne 280e
      // 280b: goto 2840
      // 280e: aload 1
      // 280f: checkcast net/minecraft/server/level/ServerLevel
      // 2812: astore 15
      // 2814: new net/minecraft/world/entity/item/ItemEntity
      // 2817: dup
      // 2818: aload 15
      // 281a: dload 2
      // 281b: dload 4
      // 281d: dload 6
      // 281f: new net/minecraft/world/item/ItemStack
      // 2822: dup
      // 2823: getstatic net/minecraft/world/level/block/Blocks.GREEN_WOOL Lnet/minecraft/world/level/block/Block;
      // 2826: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 2829: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 282c: astore 16
      // 282e: aload 16
      // 2830: bipush 10
      // 2832: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 2835: aload 15
      // 2837: aload 16
      // 2839: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 283c: pop
      // 283d: goto 2840
      // 2840: aload 8
      // 2842: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 2845: ifne 284b
      // 2848: goto 2864
      // 284b: aload 8
      // 284d: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 2850: astore 15
      // 2852: aload 15
      // 2854: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2857: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Green_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 285a: bipush 0
      // 285b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 285e: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 2861: goto 2864
      // 2864: goto 2867
      // 2867: aload 8
      // 2869: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 286c: ifne 2872
      // 286f: goto 2894
      // 2872: aload 8
      // 2874: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 2877: astore 14
      // 2879: aload 14
      // 287b: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 287e: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGreen_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2881: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2884: checkcast java/lang/Boolean
      // 2887: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 288a: ifne 2890
      // 288d: goto 2894
      // 2890: bipush 1
      // 2891: goto 2895
      // 2894: bipush 0
      // 2895: bipush 1
      // 2896: if_icmpeq 289c
      // 2899: goto 28ff
      // 289c: aload 1
      // 289d: instanceof net/minecraft/server/level/ServerLevel
      // 28a0: ifne 28a6
      // 28a3: goto 28d8
      // 28a6: aload 1
      // 28a7: checkcast net/minecraft/server/level/ServerLevel
      // 28aa: astore 15
      // 28ac: new net/minecraft/world/entity/item/ItemEntity
      // 28af: dup
      // 28b0: aload 15
      // 28b2: dload 2
      // 28b3: dload 4
      // 28b5: dload 6
      // 28b7: new net/minecraft/world/item/ItemStack
      // 28ba: dup
      // 28bb: getstatic net/minecraft/world/level/block/Blocks.LIME_WOOL Lnet/minecraft/world/level/block/Block;
      // 28be: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 28c1: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 28c4: astore 16
      // 28c6: aload 16
      // 28c8: bipush 10
      // 28ca: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 28cd: aload 15
      // 28cf: aload 16
      // 28d1: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 28d4: pop
      // 28d5: goto 28d8
      // 28d8: aload 8
      // 28da: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 28dd: ifne 28e3
      // 28e0: goto 28fc
      // 28e3: aload 8
      // 28e5: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 28e8: astore 15
      // 28ea: aload 15
      // 28ec: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 28ef: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGreen_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 28f2: bipush 0
      // 28f3: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 28f6: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 28f9: goto 28fc
      // 28fc: goto 28ff
      // 28ff: aload 8
      // 2901: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 2904: ifne 290a
      // 2907: goto 292c
      // 290a: aload 8
      // 290c: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 290f: astore 14
      // 2911: aload 14
      // 2913: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2916: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Blue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2919: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 291c: checkcast java/lang/Boolean
      // 291f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2922: ifne 2928
      // 2925: goto 292c
      // 2928: bipush 1
      // 2929: goto 292d
      // 292c: bipush 0
      // 292d: bipush 1
      // 292e: if_icmpeq 2934
      // 2931: goto 2997
      // 2934: aload 1
      // 2935: instanceof net/minecraft/server/level/ServerLevel
      // 2938: ifne 293e
      // 293b: goto 2970
      // 293e: aload 1
      // 293f: checkcast net/minecraft/server/level/ServerLevel
      // 2942: astore 15
      // 2944: new net/minecraft/world/entity/item/ItemEntity
      // 2947: dup
      // 2948: aload 15
      // 294a: dload 2
      // 294b: dload 4
      // 294d: dload 6
      // 294f: new net/minecraft/world/item/ItemStack
      // 2952: dup
      // 2953: getstatic net/minecraft/world/level/block/Blocks.BLUE_WOOL Lnet/minecraft/world/level/block/Block;
      // 2956: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 2959: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 295c: astore 16
      // 295e: aload 16
      // 2960: bipush 10
      // 2962: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 2965: aload 15
      // 2967: aload 16
      // 2969: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 296c: pop
      // 296d: goto 2970
      // 2970: aload 8
      // 2972: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 2975: ifne 297b
      // 2978: goto 2994
      // 297b: aload 8
      // 297d: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 2980: astore 15
      // 2982: aload 15
      // 2984: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2987: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Blue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 298a: bipush 0
      // 298b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 298e: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 2991: goto 2994
      // 2994: goto 2997
      // 2997: aload 8
      // 2999: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 299c: ifne 29a2
      // 299f: goto 29c4
      // 29a2: aload 8
      // 29a4: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 29a7: astore 14
      // 29a9: aload 14
      // 29ab: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 29ae: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightBlue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 29b1: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 29b4: checkcast java/lang/Boolean
      // 29b7: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 29ba: ifne 29c0
      // 29bd: goto 29c4
      // 29c0: bipush 1
      // 29c1: goto 29c5
      // 29c4: bipush 0
      // 29c5: bipush 1
      // 29c6: if_icmpeq 29cc
      // 29c9: goto 2a2f
      // 29cc: aload 1
      // 29cd: instanceof net/minecraft/server/level/ServerLevel
      // 29d0: ifne 29d6
      // 29d3: goto 2a08
      // 29d6: aload 1
      // 29d7: checkcast net/minecraft/server/level/ServerLevel
      // 29da: astore 15
      // 29dc: new net/minecraft/world/entity/item/ItemEntity
      // 29df: dup
      // 29e0: aload 15
      // 29e2: dload 2
      // 29e3: dload 4
      // 29e5: dload 6
      // 29e7: new net/minecraft/world/item/ItemStack
      // 29ea: dup
      // 29eb: getstatic net/minecraft/world/level/block/Blocks.LIGHT_BLUE_WOOL Lnet/minecraft/world/level/block/Block;
      // 29ee: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 29f1: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 29f4: astore 16
      // 29f6: aload 16
      // 29f8: bipush 10
      // 29fa: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 29fd: aload 15
      // 29ff: aload 16
      // 2a01: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 2a04: pop
      // 2a05: goto 2a08
      // 2a08: aload 8
      // 2a0a: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 2a0d: ifne 2a13
      // 2a10: goto 2a2c
      // 2a13: aload 8
      // 2a15: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 2a18: astore 15
      // 2a1a: aload 15
      // 2a1c: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2a1f: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightBlue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2a22: bipush 0
      // 2a23: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2a26: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 2a29: goto 2a2c
      // 2a2c: goto 2a2f
      // 2a2f: aload 8
      // 2a31: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 2a34: ifne 2a3a
      // 2a37: goto 2a5c
      // 2a3a: aload 8
      // 2a3c: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 2a3f: astore 14
      // 2a41: aload 14
      // 2a43: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2a46: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Magenta_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2a49: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2a4c: checkcast java/lang/Boolean
      // 2a4f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2a52: ifne 2a58
      // 2a55: goto 2a5c
      // 2a58: bipush 1
      // 2a59: goto 2a5d
      // 2a5c: bipush 0
      // 2a5d: bipush 1
      // 2a5e: if_icmpeq 2a64
      // 2a61: goto 2ac7
      // 2a64: aload 1
      // 2a65: instanceof net/minecraft/server/level/ServerLevel
      // 2a68: ifne 2a6e
      // 2a6b: goto 2aa0
      // 2a6e: aload 1
      // 2a6f: checkcast net/minecraft/server/level/ServerLevel
      // 2a72: astore 15
      // 2a74: new net/minecraft/world/entity/item/ItemEntity
      // 2a77: dup
      // 2a78: aload 15
      // 2a7a: dload 2
      // 2a7b: dload 4
      // 2a7d: dload 6
      // 2a7f: new net/minecraft/world/item/ItemStack
      // 2a82: dup
      // 2a83: getstatic net/minecraft/world/level/block/Blocks.MAGENTA_WOOL Lnet/minecraft/world/level/block/Block;
      // 2a86: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 2a89: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 2a8c: astore 16
      // 2a8e: aload 16
      // 2a90: bipush 10
      // 2a92: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 2a95: aload 15
      // 2a97: aload 16
      // 2a99: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 2a9c: pop
      // 2a9d: goto 2aa0
      // 2aa0: aload 8
      // 2aa2: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 2aa5: ifne 2aab
      // 2aa8: goto 2ac4
      // 2aab: aload 8
      // 2aad: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 2ab0: astore 15
      // 2ab2: aload 15
      // 2ab4: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2ab7: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Magenta_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2aba: bipush 0
      // 2abb: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2abe: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 2ac1: goto 2ac4
      // 2ac4: goto 2ac7
      // 2ac7: aload 8
      // 2ac9: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 2acc: ifne 2ad2
      // 2acf: goto 2af4
      // 2ad2: aload 8
      // 2ad4: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 2ad7: astore 14
      // 2ad9: aload 14
      // 2adb: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2ade: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Purple_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2ae1: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2ae4: checkcast java/lang/Boolean
      // 2ae7: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2aea: ifne 2af0
      // 2aed: goto 2af4
      // 2af0: bipush 1
      // 2af1: goto 2af5
      // 2af4: bipush 0
      // 2af5: bipush 1
      // 2af6: if_icmpeq 2afc
      // 2af9: goto 2b5f
      // 2afc: aload 1
      // 2afd: instanceof net/minecraft/server/level/ServerLevel
      // 2b00: ifne 2b06
      // 2b03: goto 2b38
      // 2b06: aload 1
      // 2b07: checkcast net/minecraft/server/level/ServerLevel
      // 2b0a: astore 15
      // 2b0c: new net/minecraft/world/entity/item/ItemEntity
      // 2b0f: dup
      // 2b10: aload 15
      // 2b12: dload 2
      // 2b13: dload 4
      // 2b15: dload 6
      // 2b17: new net/minecraft/world/item/ItemStack
      // 2b1a: dup
      // 2b1b: getstatic net/minecraft/world/level/block/Blocks.PURPLE_WOOL Lnet/minecraft/world/level/block/Block;
      // 2b1e: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 2b21: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 2b24: astore 16
      // 2b26: aload 16
      // 2b28: bipush 10
      // 2b2a: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 2b2d: aload 15
      // 2b2f: aload 16
      // 2b31: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 2b34: pop
      // 2b35: goto 2b38
      // 2b38: aload 8
      // 2b3a: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 2b3d: ifne 2b43
      // 2b40: goto 2b5c
      // 2b43: aload 8
      // 2b45: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 2b48: astore 15
      // 2b4a: aload 15
      // 2b4c: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2b4f: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Purple_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2b52: bipush 0
      // 2b53: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2b56: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 2b59: goto 2b5c
      // 2b5c: goto 2b5f
      // 2b5f: aload 8
      // 2b61: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 2b64: ifne 2b6a
      // 2b67: goto 2b8c
      // 2b6a: aload 8
      // 2b6c: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 2b6f: astore 14
      // 2b71: aload 14
      // 2b73: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2b76: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Orange_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2b79: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2b7c: checkcast java/lang/Boolean
      // 2b7f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2b82: ifne 2b88
      // 2b85: goto 2b8c
      // 2b88: bipush 1
      // 2b89: goto 2b8d
      // 2b8c: bipush 0
      // 2b8d: bipush 1
      // 2b8e: if_icmpeq 2b94
      // 2b91: goto 2bf7
      // 2b94: aload 1
      // 2b95: instanceof net/minecraft/server/level/ServerLevel
      // 2b98: ifne 2b9e
      // 2b9b: goto 2bd0
      // 2b9e: aload 1
      // 2b9f: checkcast net/minecraft/server/level/ServerLevel
      // 2ba2: astore 15
      // 2ba4: new net/minecraft/world/entity/item/ItemEntity
      // 2ba7: dup
      // 2ba8: aload 15
      // 2baa: dload 2
      // 2bab: dload 4
      // 2bad: dload 6
      // 2baf: new net/minecraft/world/item/ItemStack
      // 2bb2: dup
      // 2bb3: getstatic net/minecraft/world/level/block/Blocks.ORANGE_WOOL Lnet/minecraft/world/level/block/Block;
      // 2bb6: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 2bb9: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 2bbc: astore 16
      // 2bbe: aload 16
      // 2bc0: bipush 10
      // 2bc2: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 2bc5: aload 15
      // 2bc7: aload 16
      // 2bc9: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 2bcc: pop
      // 2bcd: goto 2bd0
      // 2bd0: aload 8
      // 2bd2: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 2bd5: ifne 2bdb
      // 2bd8: goto 2bf4
      // 2bdb: aload 8
      // 2bdd: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 2be0: astore 15
      // 2be2: aload 15
      // 2be4: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2be7: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Orange_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2bea: bipush 0
      // 2beb: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2bee: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 2bf1: goto 2bf4
      // 2bf4: goto 2bf7
      // 2bf7: aload 8
      // 2bf9: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 2bfc: ifne 2c02
      // 2bff: goto 2c24
      // 2c02: aload 8
      // 2c04: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 2c07: astore 14
      // 2c09: aload 14
      // 2c0b: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2c0e: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Cyan_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2c11: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2c14: checkcast java/lang/Boolean
      // 2c17: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2c1a: ifne 2c20
      // 2c1d: goto 2c24
      // 2c20: bipush 1
      // 2c21: goto 2c25
      // 2c24: bipush 0
      // 2c25: bipush 1
      // 2c26: if_icmpeq 2c2c
      // 2c29: goto 2c8f
      // 2c2c: aload 1
      // 2c2d: instanceof net/minecraft/server/level/ServerLevel
      // 2c30: ifne 2c36
      // 2c33: goto 2c68
      // 2c36: aload 1
      // 2c37: checkcast net/minecraft/server/level/ServerLevel
      // 2c3a: astore 15
      // 2c3c: new net/minecraft/world/entity/item/ItemEntity
      // 2c3f: dup
      // 2c40: aload 15
      // 2c42: dload 2
      // 2c43: dload 4
      // 2c45: dload 6
      // 2c47: new net/minecraft/world/item/ItemStack
      // 2c4a: dup
      // 2c4b: getstatic net/minecraft/world/level/block/Blocks.CYAN_WOOL Lnet/minecraft/world/level/block/Block;
      // 2c4e: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 2c51: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 2c54: astore 16
      // 2c56: aload 16
      // 2c58: bipush 10
      // 2c5a: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 2c5d: aload 15
      // 2c5f: aload 16
      // 2c61: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 2c64: pop
      // 2c65: goto 2c68
      // 2c68: aload 8
      // 2c6a: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 2c6d: ifne 2c73
      // 2c70: goto 2c8c
      // 2c73: aload 8
      // 2c75: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 2c78: astore 15
      // 2c7a: aload 15
      // 2c7c: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2c7f: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Cyan_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2c82: bipush 0
      // 2c83: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2c86: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 2c89: goto 2c8c
      // 2c8c: goto 2c8f
      // 2c8f: aload 8
      // 2c91: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 2c94: ifne 2c9a
      // 2c97: goto 2cbc
      // 2c9a: aload 8
      // 2c9c: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 2c9f: astore 14
      // 2ca1: aload 14
      // 2ca3: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2ca6: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Red_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2ca9: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2cac: checkcast java/lang/Boolean
      // 2caf: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2cb2: ifne 2cb8
      // 2cb5: goto 2cbc
      // 2cb8: bipush 1
      // 2cb9: goto 2cbd
      // 2cbc: bipush 0
      // 2cbd: bipush 1
      // 2cbe: if_icmpeq 2cc4
      // 2cc1: goto 2d27
      // 2cc4: aload 1
      // 2cc5: instanceof net/minecraft/server/level/ServerLevel
      // 2cc8: ifne 2cce
      // 2ccb: goto 2d00
      // 2cce: aload 1
      // 2ccf: checkcast net/minecraft/server/level/ServerLevel
      // 2cd2: astore 15
      // 2cd4: new net/minecraft/world/entity/item/ItemEntity
      // 2cd7: dup
      // 2cd8: aload 15
      // 2cda: dload 2
      // 2cdb: dload 4
      // 2cdd: dload 6
      // 2cdf: new net/minecraft/world/item/ItemStack
      // 2ce2: dup
      // 2ce3: getstatic net/minecraft/world/level/block/Blocks.RED_WOOL Lnet/minecraft/world/level/block/Block;
      // 2ce6: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 2ce9: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 2cec: astore 16
      // 2cee: aload 16
      // 2cf0: bipush 10
      // 2cf2: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 2cf5: aload 15
      // 2cf7: aload 16
      // 2cf9: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 2cfc: pop
      // 2cfd: goto 2d00
      // 2d00: aload 8
      // 2d02: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 2d05: ifne 2d0b
      // 2d08: goto 2d24
      // 2d0b: aload 8
      // 2d0d: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 2d10: astore 15
      // 2d12: aload 15
      // 2d14: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2d17: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Red_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2d1a: bipush 0
      // 2d1b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2d1e: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 2d21: goto 2d24
      // 2d24: goto 2d27
      // 2d27: aload 8
      // 2d29: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 2d2c: ifne 2d32
      // 2d2f: goto 2d54
      // 2d32: aload 8
      // 2d34: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 2d37: astore 14
      // 2d39: aload 14
      // 2d3b: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2d3e: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Yellow_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2d41: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2d44: checkcast java/lang/Boolean
      // 2d47: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2d4a: ifne 2d50
      // 2d4d: goto 2d54
      // 2d50: bipush 1
      // 2d51: goto 2d55
      // 2d54: bipush 0
      // 2d55: bipush 1
      // 2d56: if_icmpeq 2d5c
      // 2d59: goto 2dbf
      // 2d5c: aload 1
      // 2d5d: instanceof net/minecraft/server/level/ServerLevel
      // 2d60: ifne 2d66
      // 2d63: goto 2d98
      // 2d66: aload 1
      // 2d67: checkcast net/minecraft/server/level/ServerLevel
      // 2d6a: astore 15
      // 2d6c: new net/minecraft/world/entity/item/ItemEntity
      // 2d6f: dup
      // 2d70: aload 15
      // 2d72: dload 2
      // 2d73: dload 4
      // 2d75: dload 6
      // 2d77: new net/minecraft/world/item/ItemStack
      // 2d7a: dup
      // 2d7b: getstatic net/minecraft/world/level/block/Blocks.YELLOW_WOOL Lnet/minecraft/world/level/block/Block;
      // 2d7e: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 2d81: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 2d84: astore 16
      // 2d86: aload 16
      // 2d88: bipush 10
      // 2d8a: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 2d8d: aload 15
      // 2d8f: aload 16
      // 2d91: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 2d94: pop
      // 2d95: goto 2d98
      // 2d98: aload 8
      // 2d9a: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 2d9d: ifne 2da3
      // 2da0: goto 2dbc
      // 2da3: aload 8
      // 2da5: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 2da8: astore 15
      // 2daa: aload 15
      // 2dac: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2daf: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Yellow_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2db2: bipush 0
      // 2db3: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2db6: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 2db9: goto 2dbc
      // 2dbc: goto 2dbf
      // 2dbf: aload 8
      // 2dc1: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 2dc4: ifne 2dca
      // 2dc7: goto 2dec
      // 2dca: aload 8
      // 2dcc: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 2dcf: astore 14
      // 2dd1: aload 14
      // 2dd3: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2dd6: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_White_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2dd9: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2ddc: checkcast java/lang/Boolean
      // 2ddf: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2de2: ifne 2de8
      // 2de5: goto 2dec
      // 2de8: bipush 1
      // 2de9: goto 2ded
      // 2dec: bipush 0
      // 2ded: bipush 1
      // 2dee: if_icmpeq 2df4
      // 2df1: goto 2e57
      // 2df4: aload 1
      // 2df5: instanceof net/minecraft/server/level/ServerLevel
      // 2df8: ifne 2dfe
      // 2dfb: goto 2e30
      // 2dfe: aload 1
      // 2dff: checkcast net/minecraft/server/level/ServerLevel
      // 2e02: astore 15
      // 2e04: new net/minecraft/world/entity/item/ItemEntity
      // 2e07: dup
      // 2e08: aload 15
      // 2e0a: dload 2
      // 2e0b: dload 4
      // 2e0d: dload 6
      // 2e0f: new net/minecraft/world/item/ItemStack
      // 2e12: dup
      // 2e13: getstatic net/minecraft/world/level/block/Blocks.WHITE_WOOL Lnet/minecraft/world/level/block/Block;
      // 2e16: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 2e19: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 2e1c: astore 16
      // 2e1e: aload 16
      // 2e20: bipush 10
      // 2e22: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 2e25: aload 15
      // 2e27: aload 16
      // 2e29: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 2e2c: pop
      // 2e2d: goto 2e30
      // 2e30: aload 8
      // 2e32: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 2e35: ifne 2e3b
      // 2e38: goto 2e54
      // 2e3b: aload 8
      // 2e3d: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 2e40: astore 15
      // 2e42: aload 15
      // 2e44: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2e47: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_White_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2e4a: bipush 0
      // 2e4b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2e4e: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 2e51: goto 2e54
      // 2e54: goto 2e57
      // 2e57: aload 8
      // 2e59: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 2e5c: ifne 2e62
      // 2e5f: goto 2e84
      // 2e62: aload 8
      // 2e64: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 2e67: astore 14
      // 2e69: aload 14
      // 2e6b: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2e6e: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Grey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2e71: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2e74: checkcast java/lang/Boolean
      // 2e77: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2e7a: ifne 2e80
      // 2e7d: goto 2e84
      // 2e80: bipush 1
      // 2e81: goto 2e85
      // 2e84: bipush 0
      // 2e85: bipush 1
      // 2e86: if_icmpeq 2e8c
      // 2e89: goto 2eef
      // 2e8c: aload 1
      // 2e8d: instanceof net/minecraft/server/level/ServerLevel
      // 2e90: ifne 2e96
      // 2e93: goto 2ec8
      // 2e96: aload 1
      // 2e97: checkcast net/minecraft/server/level/ServerLevel
      // 2e9a: astore 15
      // 2e9c: new net/minecraft/world/entity/item/ItemEntity
      // 2e9f: dup
      // 2ea0: aload 15
      // 2ea2: dload 2
      // 2ea3: dload 4
      // 2ea5: dload 6
      // 2ea7: new net/minecraft/world/item/ItemStack
      // 2eaa: dup
      // 2eab: getstatic net/minecraft/world/level/block/Blocks.GRAY_WOOL Lnet/minecraft/world/level/block/Block;
      // 2eae: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 2eb1: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 2eb4: astore 16
      // 2eb6: aload 16
      // 2eb8: bipush 10
      // 2eba: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 2ebd: aload 15
      // 2ebf: aload 16
      // 2ec1: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 2ec4: pop
      // 2ec5: goto 2ec8
      // 2ec8: aload 8
      // 2eca: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 2ecd: ifne 2ed3
      // 2ed0: goto 2eec
      // 2ed3: aload 8
      // 2ed5: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 2ed8: astore 15
      // 2eda: aload 15
      // 2edc: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2edf: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Grey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2ee2: bipush 0
      // 2ee3: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2ee6: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 2ee9: goto 2eec
      // 2eec: goto 2eef
      // 2eef: aload 8
      // 2ef1: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 2ef4: ifne 2efa
      // 2ef7: goto 2f1c
      // 2efa: aload 8
      // 2efc: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 2eff: astore 14
      // 2f01: aload 14
      // 2f03: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2f06: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGrey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2f09: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2f0c: checkcast java/lang/Boolean
      // 2f0f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2f12: ifne 2f18
      // 2f15: goto 2f1c
      // 2f18: bipush 1
      // 2f19: goto 2f1d
      // 2f1c: bipush 0
      // 2f1d: bipush 1
      // 2f1e: if_icmpeq 2f24
      // 2f21: goto 2f87
      // 2f24: aload 1
      // 2f25: instanceof net/minecraft/server/level/ServerLevel
      // 2f28: ifne 2f2e
      // 2f2b: goto 2f60
      // 2f2e: aload 1
      // 2f2f: checkcast net/minecraft/server/level/ServerLevel
      // 2f32: astore 15
      // 2f34: new net/minecraft/world/entity/item/ItemEntity
      // 2f37: dup
      // 2f38: aload 15
      // 2f3a: dload 2
      // 2f3b: dload 4
      // 2f3d: dload 6
      // 2f3f: new net/minecraft/world/item/ItemStack
      // 2f42: dup
      // 2f43: getstatic net/minecraft/world/level/block/Blocks.LIGHT_GRAY_WOOL Lnet/minecraft/world/level/block/Block;
      // 2f46: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 2f49: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 2f4c: astore 16
      // 2f4e: aload 16
      // 2f50: bipush 10
      // 2f52: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 2f55: aload 15
      // 2f57: aload 16
      // 2f59: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 2f5c: pop
      // 2f5d: goto 2f60
      // 2f60: aload 8
      // 2f62: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 2f65: ifne 2f6b
      // 2f68: goto 2f84
      // 2f6b: aload 8
      // 2f6d: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 2f70: astore 15
      // 2f72: aload 15
      // 2f74: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2f77: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGrey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2f7a: bipush 0
      // 2f7b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2f7e: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 2f81: goto 2f84
      // 2f84: goto 2f87
      // 2f87: aload 8
      // 2f89: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 2f8c: ifne 2f92
      // 2f8f: goto 2fb4
      // 2f92: aload 8
      // 2f94: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 2f97: astore 14
      // 2f99: aload 14
      // 2f9b: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2f9e: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Black_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2fa1: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2fa4: checkcast java/lang/Boolean
      // 2fa7: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2faa: ifne 2fb0
      // 2fad: goto 2fb4
      // 2fb0: bipush 1
      // 2fb1: goto 2fb5
      // 2fb4: bipush 0
      // 2fb5: bipush 1
      // 2fb6: if_icmpeq 2fbc
      // 2fb9: goto 301f
      // 2fbc: aload 1
      // 2fbd: instanceof net/minecraft/server/level/ServerLevel
      // 2fc0: ifne 2fc6
      // 2fc3: goto 2ff8
      // 2fc6: aload 1
      // 2fc7: checkcast net/minecraft/server/level/ServerLevel
      // 2fca: astore 15
      // 2fcc: new net/minecraft/world/entity/item/ItemEntity
      // 2fcf: dup
      // 2fd0: aload 15
      // 2fd2: dload 2
      // 2fd3: dload 4
      // 2fd5: dload 6
      // 2fd7: new net/minecraft/world/item/ItemStack
      // 2fda: dup
      // 2fdb: getstatic net/minecraft/world/level/block/Blocks.BLACK_WOOL Lnet/minecraft/world/level/block/Block;
      // 2fde: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 2fe1: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 2fe4: astore 16
      // 2fe6: aload 16
      // 2fe8: bipush 10
      // 2fea: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 2fed: aload 15
      // 2fef: aload 16
      // 2ff1: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 2ff4: pop
      // 2ff5: goto 2ff8
      // 2ff8: aload 8
      // 2ffa: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 2ffd: ifne 3003
      // 3000: goto 301c
      // 3003: aload 8
      // 3005: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 3008: astore 15
      // 300a: aload 15
      // 300c: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 300f: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Black_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3012: bipush 0
      // 3013: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3016: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 3019: goto 301c
      // 301c: goto 301f
      // 301f: aload 8
      // 3021: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 3024: ifne 302a
      // 3027: goto 304c
      // 302a: aload 8
      // 302c: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 302f: astore 14
      // 3031: aload 14
      // 3033: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3036: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Brown_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3039: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 303c: checkcast java/lang/Boolean
      // 303f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3042: ifne 3048
      // 3045: goto 304c
      // 3048: bipush 1
      // 3049: goto 304d
      // 304c: bipush 0
      // 304d: bipush 1
      // 304e: if_icmpeq 3054
      // 3051: goto 30b7
      // 3054: aload 1
      // 3055: instanceof net/minecraft/server/level/ServerLevel
      // 3058: ifne 305e
      // 305b: goto 3090
      // 305e: aload 1
      // 305f: checkcast net/minecraft/server/level/ServerLevel
      // 3062: astore 15
      // 3064: new net/minecraft/world/entity/item/ItemEntity
      // 3067: dup
      // 3068: aload 15
      // 306a: dload 2
      // 306b: dload 4
      // 306d: dload 6
      // 306f: new net/minecraft/world/item/ItemStack
      // 3072: dup
      // 3073: getstatic net/minecraft/world/level/block/Blocks.BROWN_WOOL Lnet/minecraft/world/level/block/Block;
      // 3076: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 3079: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 307c: astore 16
      // 307e: aload 16
      // 3080: bipush 10
      // 3082: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3085: aload 15
      // 3087: aload 16
      // 3089: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 308c: pop
      // 308d: goto 3090
      // 3090: aload 8
      // 3092: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 3095: ifne 309b
      // 3098: goto 30b4
      // 309b: aload 8
      // 309d: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 30a0: astore 15
      // 30a2: aload 15
      // 30a4: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 30a7: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Brown_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 30aa: bipush 0
      // 30ab: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 30ae: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 30b1: goto 30b4
      // 30b4: goto 30b7
      // 30b7: aload 8
      // 30b9: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 30bc: ifne 30c2
      // 30bf: goto 30e4
      // 30c2: aload 8
      // 30c4: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 30c7: astore 12
      // 30c9: aload 12
      // 30cb: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 30ce: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Magenta_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 30d1: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 30d4: checkcast java/lang/Boolean
      // 30d7: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 30da: ifne 30e0
      // 30dd: goto 30e4
      // 30e0: bipush 1
      // 30e1: goto 30e5
      // 30e4: bipush 0
      // 30e5: ifeq 30eb
      // 30e8: goto 3a5d
      // 30eb: aload 9
      // 30ed: instanceof net/minecraft/world/entity/LivingEntity
      // 30f0: ifne 30f6
      // 30f3: goto 3105
      // 30f6: aload 9
      // 30f8: checkcast net/minecraft/world/entity/LivingEntity
      // 30fb: astore 13
      // 30fd: aload 13
      // 30ff: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 3102: goto 3108
      // 3105: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 3108: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 310b: getstatic net/minecraft/world/level/block/Blocks.MAGENTA_WOOL Lnet/minecraft/world/level/block/Block;
      // 310e: invokevirtual net/minecraft/world/level/block/Block.asItem ()Lnet/minecraft/world/item/Item;
      // 3111: if_acmpeq 3117
      // 3114: goto 3a5d
      // 3117: aload 9
      // 3119: instanceof net/minecraft/world/entity/player/Player
      // 311c: ifne 3122
      // 311f: goto 3151
      // 3122: aload 9
      // 3124: checkcast net/minecraft/world/entity/player/Player
      // 3127: astore 14
      // 3129: new net/minecraft/world/item/ItemStack
      // 312c: dup
      // 312d: getstatic net/minecraft/world/level/block/Blocks.MAGENTA_WOOL Lnet/minecraft/world/level/block/Block;
      // 3130: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 3133: astore 15
      // 3135: aload 14
      // 3137: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 313a: aload 15
      // 313c: invokedynamic test (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, net/mocreatures/procedures/UndeadOstrichEquipmentSwapProcedure.lambda$execute$5 (Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z, (Lnet/minecraft/world/item/ItemStack;)Z ]
      // 3141: bipush 1
      // 3142: aload 14
      // 3144: getfield net/minecraft/world/entity/player/Player.inventoryMenu Lnet/minecraft/world/inventory/InventoryMenu;
      // 3147: invokevirtual net/minecraft/world/inventory/InventoryMenu.getCraftSlots ()Lnet/minecraft/world/inventory/CraftingContainer;
      // 314a: invokevirtual net/minecraft/world/entity/player/Inventory.clearOrCountMatchingItems (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
      // 314d: pop
      // 314e: goto 3151
      // 3151: aload 8
      // 3153: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 3156: ifne 315c
      // 3159: goto 3175
      // 315c: aload 8
      // 315e: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 3161: astore 14
      // 3163: aload 14
      // 3165: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3168: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Magenta_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 316b: bipush 1
      // 316c: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 316f: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 3172: goto 3175
      // 3175: aload 8
      // 3177: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 317a: ifne 3180
      // 317d: goto 31a2
      // 3180: aload 8
      // 3182: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 3185: astore 14
      // 3187: aload 14
      // 3189: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 318c: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Green_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 318f: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 3192: checkcast java/lang/Boolean
      // 3195: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3198: ifne 319e
      // 319b: goto 31a2
      // 319e: bipush 1
      // 319f: goto 31a3
      // 31a2: bipush 0
      // 31a3: bipush 1
      // 31a4: if_icmpeq 31aa
      // 31a7: goto 320d
      // 31aa: aload 1
      // 31ab: instanceof net/minecraft/server/level/ServerLevel
      // 31ae: ifne 31b4
      // 31b1: goto 31e6
      // 31b4: aload 1
      // 31b5: checkcast net/minecraft/server/level/ServerLevel
      // 31b8: astore 15
      // 31ba: new net/minecraft/world/entity/item/ItemEntity
      // 31bd: dup
      // 31be: aload 15
      // 31c0: dload 2
      // 31c1: dload 4
      // 31c3: dload 6
      // 31c5: new net/minecraft/world/item/ItemStack
      // 31c8: dup
      // 31c9: getstatic net/minecraft/world/level/block/Blocks.GREEN_WOOL Lnet/minecraft/world/level/block/Block;
      // 31cc: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 31cf: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 31d2: astore 16
      // 31d4: aload 16
      // 31d6: bipush 10
      // 31d8: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 31db: aload 15
      // 31dd: aload 16
      // 31df: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 31e2: pop
      // 31e3: goto 31e6
      // 31e6: aload 8
      // 31e8: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 31eb: ifne 31f1
      // 31ee: goto 320a
      // 31f1: aload 8
      // 31f3: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 31f6: astore 15
      // 31f8: aload 15
      // 31fa: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 31fd: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Green_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3200: bipush 0
      // 3201: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3204: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 3207: goto 320a
      // 320a: goto 320d
      // 320d: aload 8
      // 320f: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 3212: ifne 3218
      // 3215: goto 323a
      // 3218: aload 8
      // 321a: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 321d: astore 14
      // 321f: aload 14
      // 3221: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3224: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGreen_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3227: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 322a: checkcast java/lang/Boolean
      // 322d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3230: ifne 3236
      // 3233: goto 323a
      // 3236: bipush 1
      // 3237: goto 323b
      // 323a: bipush 0
      // 323b: bipush 1
      // 323c: if_icmpeq 3242
      // 323f: goto 32a5
      // 3242: aload 1
      // 3243: instanceof net/minecraft/server/level/ServerLevel
      // 3246: ifne 324c
      // 3249: goto 327e
      // 324c: aload 1
      // 324d: checkcast net/minecraft/server/level/ServerLevel
      // 3250: astore 15
      // 3252: new net/minecraft/world/entity/item/ItemEntity
      // 3255: dup
      // 3256: aload 15
      // 3258: dload 2
      // 3259: dload 4
      // 325b: dload 6
      // 325d: new net/minecraft/world/item/ItemStack
      // 3260: dup
      // 3261: getstatic net/minecraft/world/level/block/Blocks.LIME_WOOL Lnet/minecraft/world/level/block/Block;
      // 3264: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 3267: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 326a: astore 16
      // 326c: aload 16
      // 326e: bipush 10
      // 3270: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3273: aload 15
      // 3275: aload 16
      // 3277: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 327a: pop
      // 327b: goto 327e
      // 327e: aload 8
      // 3280: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 3283: ifne 3289
      // 3286: goto 32a2
      // 3289: aload 8
      // 328b: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 328e: astore 15
      // 3290: aload 15
      // 3292: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3295: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGreen_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3298: bipush 0
      // 3299: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 329c: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 329f: goto 32a2
      // 32a2: goto 32a5
      // 32a5: aload 8
      // 32a7: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 32aa: ifne 32b0
      // 32ad: goto 32d2
      // 32b0: aload 8
      // 32b2: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 32b5: astore 14
      // 32b7: aload 14
      // 32b9: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 32bc: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Blue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 32bf: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 32c2: checkcast java/lang/Boolean
      // 32c5: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 32c8: ifne 32ce
      // 32cb: goto 32d2
      // 32ce: bipush 1
      // 32cf: goto 32d3
      // 32d2: bipush 0
      // 32d3: bipush 1
      // 32d4: if_icmpeq 32da
      // 32d7: goto 333d
      // 32da: aload 1
      // 32db: instanceof net/minecraft/server/level/ServerLevel
      // 32de: ifne 32e4
      // 32e1: goto 3316
      // 32e4: aload 1
      // 32e5: checkcast net/minecraft/server/level/ServerLevel
      // 32e8: astore 15
      // 32ea: new net/minecraft/world/entity/item/ItemEntity
      // 32ed: dup
      // 32ee: aload 15
      // 32f0: dload 2
      // 32f1: dload 4
      // 32f3: dload 6
      // 32f5: new net/minecraft/world/item/ItemStack
      // 32f8: dup
      // 32f9: getstatic net/minecraft/world/level/block/Blocks.BLUE_WOOL Lnet/minecraft/world/level/block/Block;
      // 32fc: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 32ff: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3302: astore 16
      // 3304: aload 16
      // 3306: bipush 10
      // 3308: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 330b: aload 15
      // 330d: aload 16
      // 330f: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3312: pop
      // 3313: goto 3316
      // 3316: aload 8
      // 3318: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 331b: ifne 3321
      // 331e: goto 333a
      // 3321: aload 8
      // 3323: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 3326: astore 15
      // 3328: aload 15
      // 332a: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 332d: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Blue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3330: bipush 0
      // 3331: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3334: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 3337: goto 333a
      // 333a: goto 333d
      // 333d: aload 8
      // 333f: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 3342: ifne 3348
      // 3345: goto 336a
      // 3348: aload 8
      // 334a: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 334d: astore 14
      // 334f: aload 14
      // 3351: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3354: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightBlue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3357: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 335a: checkcast java/lang/Boolean
      // 335d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3360: ifne 3366
      // 3363: goto 336a
      // 3366: bipush 1
      // 3367: goto 336b
      // 336a: bipush 0
      // 336b: bipush 1
      // 336c: if_icmpeq 3372
      // 336f: goto 33d5
      // 3372: aload 1
      // 3373: instanceof net/minecraft/server/level/ServerLevel
      // 3376: ifne 337c
      // 3379: goto 33ae
      // 337c: aload 1
      // 337d: checkcast net/minecraft/server/level/ServerLevel
      // 3380: astore 15
      // 3382: new net/minecraft/world/entity/item/ItemEntity
      // 3385: dup
      // 3386: aload 15
      // 3388: dload 2
      // 3389: dload 4
      // 338b: dload 6
      // 338d: new net/minecraft/world/item/ItemStack
      // 3390: dup
      // 3391: getstatic net/minecraft/world/level/block/Blocks.LIGHT_BLUE_WOOL Lnet/minecraft/world/level/block/Block;
      // 3394: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 3397: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 339a: astore 16
      // 339c: aload 16
      // 339e: bipush 10
      // 33a0: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 33a3: aload 15
      // 33a5: aload 16
      // 33a7: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 33aa: pop
      // 33ab: goto 33ae
      // 33ae: aload 8
      // 33b0: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 33b3: ifne 33b9
      // 33b6: goto 33d2
      // 33b9: aload 8
      // 33bb: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 33be: astore 15
      // 33c0: aload 15
      // 33c2: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 33c5: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightBlue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 33c8: bipush 0
      // 33c9: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 33cc: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 33cf: goto 33d2
      // 33d2: goto 33d5
      // 33d5: aload 8
      // 33d7: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 33da: ifne 33e0
      // 33dd: goto 3402
      // 33e0: aload 8
      // 33e2: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 33e5: astore 14
      // 33e7: aload 14
      // 33e9: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 33ec: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Pink_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 33ef: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 33f2: checkcast java/lang/Boolean
      // 33f5: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 33f8: ifne 33fe
      // 33fb: goto 3402
      // 33fe: bipush 1
      // 33ff: goto 3403
      // 3402: bipush 0
      // 3403: bipush 1
      // 3404: if_icmpeq 340a
      // 3407: goto 346d
      // 340a: aload 1
      // 340b: instanceof net/minecraft/server/level/ServerLevel
      // 340e: ifne 3414
      // 3411: goto 3446
      // 3414: aload 1
      // 3415: checkcast net/minecraft/server/level/ServerLevel
      // 3418: astore 15
      // 341a: new net/minecraft/world/entity/item/ItemEntity
      // 341d: dup
      // 341e: aload 15
      // 3420: dload 2
      // 3421: dload 4
      // 3423: dload 6
      // 3425: new net/minecraft/world/item/ItemStack
      // 3428: dup
      // 3429: getstatic net/minecraft/world/level/block/Blocks.PINK_WOOL Lnet/minecraft/world/level/block/Block;
      // 342c: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 342f: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3432: astore 16
      // 3434: aload 16
      // 3436: bipush 10
      // 3438: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 343b: aload 15
      // 343d: aload 16
      // 343f: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3442: pop
      // 3443: goto 3446
      // 3446: aload 8
      // 3448: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 344b: ifne 3451
      // 344e: goto 346a
      // 3451: aload 8
      // 3453: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 3456: astore 15
      // 3458: aload 15
      // 345a: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 345d: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Pink_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3460: bipush 0
      // 3461: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3464: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 3467: goto 346a
      // 346a: goto 346d
      // 346d: aload 8
      // 346f: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 3472: ifne 3478
      // 3475: goto 349a
      // 3478: aload 8
      // 347a: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 347d: astore 14
      // 347f: aload 14
      // 3481: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3484: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Purple_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3487: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 348a: checkcast java/lang/Boolean
      // 348d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3490: ifne 3496
      // 3493: goto 349a
      // 3496: bipush 1
      // 3497: goto 349b
      // 349a: bipush 0
      // 349b: bipush 1
      // 349c: if_icmpeq 34a2
      // 349f: goto 3505
      // 34a2: aload 1
      // 34a3: instanceof net/minecraft/server/level/ServerLevel
      // 34a6: ifne 34ac
      // 34a9: goto 34de
      // 34ac: aload 1
      // 34ad: checkcast net/minecraft/server/level/ServerLevel
      // 34b0: astore 15
      // 34b2: new net/minecraft/world/entity/item/ItemEntity
      // 34b5: dup
      // 34b6: aload 15
      // 34b8: dload 2
      // 34b9: dload 4
      // 34bb: dload 6
      // 34bd: new net/minecraft/world/item/ItemStack
      // 34c0: dup
      // 34c1: getstatic net/minecraft/world/level/block/Blocks.PURPLE_WOOL Lnet/minecraft/world/level/block/Block;
      // 34c4: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 34c7: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 34ca: astore 16
      // 34cc: aload 16
      // 34ce: bipush 10
      // 34d0: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 34d3: aload 15
      // 34d5: aload 16
      // 34d7: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 34da: pop
      // 34db: goto 34de
      // 34de: aload 8
      // 34e0: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 34e3: ifne 34e9
      // 34e6: goto 3502
      // 34e9: aload 8
      // 34eb: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 34ee: astore 15
      // 34f0: aload 15
      // 34f2: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 34f5: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Purple_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 34f8: bipush 0
      // 34f9: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 34fc: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 34ff: goto 3502
      // 3502: goto 3505
      // 3505: aload 8
      // 3507: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 350a: ifne 3510
      // 350d: goto 3532
      // 3510: aload 8
      // 3512: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 3515: astore 14
      // 3517: aload 14
      // 3519: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 351c: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Orange_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 351f: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 3522: checkcast java/lang/Boolean
      // 3525: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3528: ifne 352e
      // 352b: goto 3532
      // 352e: bipush 1
      // 352f: goto 3533
      // 3532: bipush 0
      // 3533: bipush 1
      // 3534: if_icmpeq 353a
      // 3537: goto 359d
      // 353a: aload 1
      // 353b: instanceof net/minecraft/server/level/ServerLevel
      // 353e: ifne 3544
      // 3541: goto 3576
      // 3544: aload 1
      // 3545: checkcast net/minecraft/server/level/ServerLevel
      // 3548: astore 15
      // 354a: new net/minecraft/world/entity/item/ItemEntity
      // 354d: dup
      // 354e: aload 15
      // 3550: dload 2
      // 3551: dload 4
      // 3553: dload 6
      // 3555: new net/minecraft/world/item/ItemStack
      // 3558: dup
      // 3559: getstatic net/minecraft/world/level/block/Blocks.ORANGE_WOOL Lnet/minecraft/world/level/block/Block;
      // 355c: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 355f: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3562: astore 16
      // 3564: aload 16
      // 3566: bipush 10
      // 3568: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 356b: aload 15
      // 356d: aload 16
      // 356f: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3572: pop
      // 3573: goto 3576
      // 3576: aload 8
      // 3578: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 357b: ifne 3581
      // 357e: goto 359a
      // 3581: aload 8
      // 3583: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 3586: astore 15
      // 3588: aload 15
      // 358a: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 358d: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Orange_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3590: bipush 0
      // 3591: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3594: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 3597: goto 359a
      // 359a: goto 359d
      // 359d: aload 8
      // 359f: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 35a2: ifne 35a8
      // 35a5: goto 35ca
      // 35a8: aload 8
      // 35aa: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 35ad: astore 14
      // 35af: aload 14
      // 35b1: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 35b4: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Cyan_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 35b7: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 35ba: checkcast java/lang/Boolean
      // 35bd: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 35c0: ifne 35c6
      // 35c3: goto 35ca
      // 35c6: bipush 1
      // 35c7: goto 35cb
      // 35ca: bipush 0
      // 35cb: bipush 1
      // 35cc: if_icmpeq 35d2
      // 35cf: goto 3635
      // 35d2: aload 1
      // 35d3: instanceof net/minecraft/server/level/ServerLevel
      // 35d6: ifne 35dc
      // 35d9: goto 360e
      // 35dc: aload 1
      // 35dd: checkcast net/minecraft/server/level/ServerLevel
      // 35e0: astore 15
      // 35e2: new net/minecraft/world/entity/item/ItemEntity
      // 35e5: dup
      // 35e6: aload 15
      // 35e8: dload 2
      // 35e9: dload 4
      // 35eb: dload 6
      // 35ed: new net/minecraft/world/item/ItemStack
      // 35f0: dup
      // 35f1: getstatic net/minecraft/world/level/block/Blocks.CYAN_WOOL Lnet/minecraft/world/level/block/Block;
      // 35f4: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 35f7: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 35fa: astore 16
      // 35fc: aload 16
      // 35fe: bipush 10
      // 3600: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3603: aload 15
      // 3605: aload 16
      // 3607: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 360a: pop
      // 360b: goto 360e
      // 360e: aload 8
      // 3610: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 3613: ifne 3619
      // 3616: goto 3632
      // 3619: aload 8
      // 361b: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 361e: astore 15
      // 3620: aload 15
      // 3622: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3625: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Cyan_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3628: bipush 0
      // 3629: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 362c: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 362f: goto 3632
      // 3632: goto 3635
      // 3635: aload 8
      // 3637: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 363a: ifne 3640
      // 363d: goto 3662
      // 3640: aload 8
      // 3642: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 3645: astore 14
      // 3647: aload 14
      // 3649: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 364c: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Red_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 364f: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 3652: checkcast java/lang/Boolean
      // 3655: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3658: ifne 365e
      // 365b: goto 3662
      // 365e: bipush 1
      // 365f: goto 3663
      // 3662: bipush 0
      // 3663: bipush 1
      // 3664: if_icmpeq 366a
      // 3667: goto 36cd
      // 366a: aload 1
      // 366b: instanceof net/minecraft/server/level/ServerLevel
      // 366e: ifne 3674
      // 3671: goto 36a6
      // 3674: aload 1
      // 3675: checkcast net/minecraft/server/level/ServerLevel
      // 3678: astore 15
      // 367a: new net/minecraft/world/entity/item/ItemEntity
      // 367d: dup
      // 367e: aload 15
      // 3680: dload 2
      // 3681: dload 4
      // 3683: dload 6
      // 3685: new net/minecraft/world/item/ItemStack
      // 3688: dup
      // 3689: getstatic net/minecraft/world/level/block/Blocks.RED_WOOL Lnet/minecraft/world/level/block/Block;
      // 368c: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 368f: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3692: astore 16
      // 3694: aload 16
      // 3696: bipush 10
      // 3698: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 369b: aload 15
      // 369d: aload 16
      // 369f: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 36a2: pop
      // 36a3: goto 36a6
      // 36a6: aload 8
      // 36a8: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 36ab: ifne 36b1
      // 36ae: goto 36ca
      // 36b1: aload 8
      // 36b3: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 36b6: astore 15
      // 36b8: aload 15
      // 36ba: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 36bd: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Red_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 36c0: bipush 0
      // 36c1: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 36c4: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 36c7: goto 36ca
      // 36ca: goto 36cd
      // 36cd: aload 8
      // 36cf: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 36d2: ifne 36d8
      // 36d5: goto 36fa
      // 36d8: aload 8
      // 36da: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 36dd: astore 14
      // 36df: aload 14
      // 36e1: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 36e4: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Yellow_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 36e7: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 36ea: checkcast java/lang/Boolean
      // 36ed: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 36f0: ifne 36f6
      // 36f3: goto 36fa
      // 36f6: bipush 1
      // 36f7: goto 36fb
      // 36fa: bipush 0
      // 36fb: bipush 1
      // 36fc: if_icmpeq 3702
      // 36ff: goto 3765
      // 3702: aload 1
      // 3703: instanceof net/minecraft/server/level/ServerLevel
      // 3706: ifne 370c
      // 3709: goto 373e
      // 370c: aload 1
      // 370d: checkcast net/minecraft/server/level/ServerLevel
      // 3710: astore 15
      // 3712: new net/minecraft/world/entity/item/ItemEntity
      // 3715: dup
      // 3716: aload 15
      // 3718: dload 2
      // 3719: dload 4
      // 371b: dload 6
      // 371d: new net/minecraft/world/item/ItemStack
      // 3720: dup
      // 3721: getstatic net/minecraft/world/level/block/Blocks.YELLOW_WOOL Lnet/minecraft/world/level/block/Block;
      // 3724: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 3727: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 372a: astore 16
      // 372c: aload 16
      // 372e: bipush 10
      // 3730: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3733: aload 15
      // 3735: aload 16
      // 3737: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 373a: pop
      // 373b: goto 373e
      // 373e: aload 8
      // 3740: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 3743: ifne 3749
      // 3746: goto 3762
      // 3749: aload 8
      // 374b: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 374e: astore 15
      // 3750: aload 15
      // 3752: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3755: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Yellow_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3758: bipush 0
      // 3759: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 375c: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 375f: goto 3762
      // 3762: goto 3765
      // 3765: aload 8
      // 3767: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 376a: ifne 3770
      // 376d: goto 3792
      // 3770: aload 8
      // 3772: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 3775: astore 14
      // 3777: aload 14
      // 3779: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 377c: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_White_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 377f: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 3782: checkcast java/lang/Boolean
      // 3785: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3788: ifne 378e
      // 378b: goto 3792
      // 378e: bipush 1
      // 378f: goto 3793
      // 3792: bipush 0
      // 3793: bipush 1
      // 3794: if_icmpeq 379a
      // 3797: goto 37fd
      // 379a: aload 1
      // 379b: instanceof net/minecraft/server/level/ServerLevel
      // 379e: ifne 37a4
      // 37a1: goto 37d6
      // 37a4: aload 1
      // 37a5: checkcast net/minecraft/server/level/ServerLevel
      // 37a8: astore 15
      // 37aa: new net/minecraft/world/entity/item/ItemEntity
      // 37ad: dup
      // 37ae: aload 15
      // 37b0: dload 2
      // 37b1: dload 4
      // 37b3: dload 6
      // 37b5: new net/minecraft/world/item/ItemStack
      // 37b8: dup
      // 37b9: getstatic net/minecraft/world/level/block/Blocks.WHITE_WOOL Lnet/minecraft/world/level/block/Block;
      // 37bc: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 37bf: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 37c2: astore 16
      // 37c4: aload 16
      // 37c6: bipush 10
      // 37c8: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 37cb: aload 15
      // 37cd: aload 16
      // 37cf: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 37d2: pop
      // 37d3: goto 37d6
      // 37d6: aload 8
      // 37d8: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 37db: ifne 37e1
      // 37de: goto 37fa
      // 37e1: aload 8
      // 37e3: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 37e6: astore 15
      // 37e8: aload 15
      // 37ea: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 37ed: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_White_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 37f0: bipush 0
      // 37f1: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 37f4: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 37f7: goto 37fa
      // 37fa: goto 37fd
      // 37fd: aload 8
      // 37ff: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 3802: ifne 3808
      // 3805: goto 382a
      // 3808: aload 8
      // 380a: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 380d: astore 14
      // 380f: aload 14
      // 3811: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3814: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Grey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3817: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 381a: checkcast java/lang/Boolean
      // 381d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3820: ifne 3826
      // 3823: goto 382a
      // 3826: bipush 1
      // 3827: goto 382b
      // 382a: bipush 0
      // 382b: bipush 1
      // 382c: if_icmpeq 3832
      // 382f: goto 3895
      // 3832: aload 1
      // 3833: instanceof net/minecraft/server/level/ServerLevel
      // 3836: ifne 383c
      // 3839: goto 386e
      // 383c: aload 1
      // 383d: checkcast net/minecraft/server/level/ServerLevel
      // 3840: astore 15
      // 3842: new net/minecraft/world/entity/item/ItemEntity
      // 3845: dup
      // 3846: aload 15
      // 3848: dload 2
      // 3849: dload 4
      // 384b: dload 6
      // 384d: new net/minecraft/world/item/ItemStack
      // 3850: dup
      // 3851: getstatic net/minecraft/world/level/block/Blocks.GRAY_WOOL Lnet/minecraft/world/level/block/Block;
      // 3854: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 3857: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 385a: astore 16
      // 385c: aload 16
      // 385e: bipush 10
      // 3860: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3863: aload 15
      // 3865: aload 16
      // 3867: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 386a: pop
      // 386b: goto 386e
      // 386e: aload 8
      // 3870: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 3873: ifne 3879
      // 3876: goto 3892
      // 3879: aload 8
      // 387b: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 387e: astore 15
      // 3880: aload 15
      // 3882: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3885: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Grey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3888: bipush 0
      // 3889: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 388c: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 388f: goto 3892
      // 3892: goto 3895
      // 3895: aload 8
      // 3897: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 389a: ifne 38a0
      // 389d: goto 38c2
      // 38a0: aload 8
      // 38a2: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 38a5: astore 14
      // 38a7: aload 14
      // 38a9: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 38ac: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGrey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 38af: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 38b2: checkcast java/lang/Boolean
      // 38b5: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 38b8: ifne 38be
      // 38bb: goto 38c2
      // 38be: bipush 1
      // 38bf: goto 38c3
      // 38c2: bipush 0
      // 38c3: bipush 1
      // 38c4: if_icmpeq 38ca
      // 38c7: goto 392d
      // 38ca: aload 1
      // 38cb: instanceof net/minecraft/server/level/ServerLevel
      // 38ce: ifne 38d4
      // 38d1: goto 3906
      // 38d4: aload 1
      // 38d5: checkcast net/minecraft/server/level/ServerLevel
      // 38d8: astore 15
      // 38da: new net/minecraft/world/entity/item/ItemEntity
      // 38dd: dup
      // 38de: aload 15
      // 38e0: dload 2
      // 38e1: dload 4
      // 38e3: dload 6
      // 38e5: new net/minecraft/world/item/ItemStack
      // 38e8: dup
      // 38e9: getstatic net/minecraft/world/level/block/Blocks.LIGHT_GRAY_WOOL Lnet/minecraft/world/level/block/Block;
      // 38ec: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 38ef: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 38f2: astore 16
      // 38f4: aload 16
      // 38f6: bipush 10
      // 38f8: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 38fb: aload 15
      // 38fd: aload 16
      // 38ff: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3902: pop
      // 3903: goto 3906
      // 3906: aload 8
      // 3908: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 390b: ifne 3911
      // 390e: goto 392a
      // 3911: aload 8
      // 3913: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 3916: astore 15
      // 3918: aload 15
      // 391a: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 391d: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGrey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3920: bipush 0
      // 3921: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3924: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 3927: goto 392a
      // 392a: goto 392d
      // 392d: aload 8
      // 392f: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 3932: ifne 3938
      // 3935: goto 395a
      // 3938: aload 8
      // 393a: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 393d: astore 14
      // 393f: aload 14
      // 3941: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3944: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Black_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3947: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 394a: checkcast java/lang/Boolean
      // 394d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3950: ifne 3956
      // 3953: goto 395a
      // 3956: bipush 1
      // 3957: goto 395b
      // 395a: bipush 0
      // 395b: bipush 1
      // 395c: if_icmpeq 3962
      // 395f: goto 39c5
      // 3962: aload 1
      // 3963: instanceof net/minecraft/server/level/ServerLevel
      // 3966: ifne 396c
      // 3969: goto 399e
      // 396c: aload 1
      // 396d: checkcast net/minecraft/server/level/ServerLevel
      // 3970: astore 15
      // 3972: new net/minecraft/world/entity/item/ItemEntity
      // 3975: dup
      // 3976: aload 15
      // 3978: dload 2
      // 3979: dload 4
      // 397b: dload 6
      // 397d: new net/minecraft/world/item/ItemStack
      // 3980: dup
      // 3981: getstatic net/minecraft/world/level/block/Blocks.BLACK_WOOL Lnet/minecraft/world/level/block/Block;
      // 3984: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 3987: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 398a: astore 16
      // 398c: aload 16
      // 398e: bipush 10
      // 3990: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3993: aload 15
      // 3995: aload 16
      // 3997: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 399a: pop
      // 399b: goto 399e
      // 399e: aload 8
      // 39a0: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 39a3: ifne 39a9
      // 39a6: goto 39c2
      // 39a9: aload 8
      // 39ab: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 39ae: astore 15
      // 39b0: aload 15
      // 39b2: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 39b5: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Black_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 39b8: bipush 0
      // 39b9: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 39bc: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 39bf: goto 39c2
      // 39c2: goto 39c5
      // 39c5: aload 8
      // 39c7: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 39ca: ifne 39d0
      // 39cd: goto 39f2
      // 39d0: aload 8
      // 39d2: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 39d5: astore 14
      // 39d7: aload 14
      // 39d9: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 39dc: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Brown_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 39df: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 39e2: checkcast java/lang/Boolean
      // 39e5: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 39e8: ifne 39ee
      // 39eb: goto 39f2
      // 39ee: bipush 1
      // 39ef: goto 39f3
      // 39f2: bipush 0
      // 39f3: bipush 1
      // 39f4: if_icmpeq 39fa
      // 39f7: goto 3a5d
      // 39fa: aload 1
      // 39fb: instanceof net/minecraft/server/level/ServerLevel
      // 39fe: ifne 3a04
      // 3a01: goto 3a36
      // 3a04: aload 1
      // 3a05: checkcast net/minecraft/server/level/ServerLevel
      // 3a08: astore 15
      // 3a0a: new net/minecraft/world/entity/item/ItemEntity
      // 3a0d: dup
      // 3a0e: aload 15
      // 3a10: dload 2
      // 3a11: dload 4
      // 3a13: dload 6
      // 3a15: new net/minecraft/world/item/ItemStack
      // 3a18: dup
      // 3a19: getstatic net/minecraft/world/level/block/Blocks.BROWN_WOOL Lnet/minecraft/world/level/block/Block;
      // 3a1c: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 3a1f: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3a22: astore 16
      // 3a24: aload 16
      // 3a26: bipush 10
      // 3a28: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3a2b: aload 15
      // 3a2d: aload 16
      // 3a2f: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3a32: pop
      // 3a33: goto 3a36
      // 3a36: aload 8
      // 3a38: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 3a3b: ifne 3a41
      // 3a3e: goto 3a5a
      // 3a41: aload 8
      // 3a43: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 3a46: astore 15
      // 3a48: aload 15
      // 3a4a: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3a4d: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Brown_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3a50: bipush 0
      // 3a51: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3a54: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 3a57: goto 3a5a
      // 3a5a: goto 3a5d
      // 3a5d: aload 8
      // 3a5f: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 3a62: ifne 3a68
      // 3a65: goto 3a8a
      // 3a68: aload 8
      // 3a6a: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 3a6d: astore 12
      // 3a6f: aload 12
      // 3a71: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3a74: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Purple_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3a77: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 3a7a: checkcast java/lang/Boolean
      // 3a7d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3a80: ifne 3a86
      // 3a83: goto 3a8a
      // 3a86: bipush 1
      // 3a87: goto 3a8b
      // 3a8a: bipush 0
      // 3a8b: ifeq 3a91
      // 3a8e: goto 4403
      // 3a91: aload 9
      // 3a93: instanceof net/minecraft/world/entity/LivingEntity
      // 3a96: ifne 3a9c
      // 3a99: goto 3aab
      // 3a9c: aload 9
      // 3a9e: checkcast net/minecraft/world/entity/LivingEntity
      // 3aa1: astore 13
      // 3aa3: aload 13
      // 3aa5: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 3aa8: goto 3aae
      // 3aab: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 3aae: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 3ab1: getstatic net/minecraft/world/level/block/Blocks.PURPLE_WOOL Lnet/minecraft/world/level/block/Block;
      // 3ab4: invokevirtual net/minecraft/world/level/block/Block.asItem ()Lnet/minecraft/world/item/Item;
      // 3ab7: if_acmpeq 3abd
      // 3aba: goto 4403
      // 3abd: aload 9
      // 3abf: instanceof net/minecraft/world/entity/player/Player
      // 3ac2: ifne 3ac8
      // 3ac5: goto 3af7
      // 3ac8: aload 9
      // 3aca: checkcast net/minecraft/world/entity/player/Player
      // 3acd: astore 14
      // 3acf: new net/minecraft/world/item/ItemStack
      // 3ad2: dup
      // 3ad3: getstatic net/minecraft/world/level/block/Blocks.PURPLE_WOOL Lnet/minecraft/world/level/block/Block;
      // 3ad6: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 3ad9: astore 15
      // 3adb: aload 14
      // 3add: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 3ae0: aload 15
      // 3ae2: invokedynamic test (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, net/mocreatures/procedures/UndeadOstrichEquipmentSwapProcedure.lambda$execute$6 (Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z, (Lnet/minecraft/world/item/ItemStack;)Z ]
      // 3ae7: bipush 1
      // 3ae8: aload 14
      // 3aea: getfield net/minecraft/world/entity/player/Player.inventoryMenu Lnet/minecraft/world/inventory/InventoryMenu;
      // 3aed: invokevirtual net/minecraft/world/inventory/InventoryMenu.getCraftSlots ()Lnet/minecraft/world/inventory/CraftingContainer;
      // 3af0: invokevirtual net/minecraft/world/entity/player/Inventory.clearOrCountMatchingItems (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
      // 3af3: pop
      // 3af4: goto 3af7
      // 3af7: aload 8
      // 3af9: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 3afc: ifne 3b02
      // 3aff: goto 3b1b
      // 3b02: aload 8
      // 3b04: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 3b07: astore 14
      // 3b09: aload 14
      // 3b0b: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3b0e: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Purple_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3b11: bipush 1
      // 3b12: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3b15: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 3b18: goto 3b1b
      // 3b1b: aload 8
      // 3b1d: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 3b20: ifne 3b26
      // 3b23: goto 3b48
      // 3b26: aload 8
      // 3b28: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 3b2b: astore 14
      // 3b2d: aload 14
      // 3b2f: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3b32: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Green_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3b35: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 3b38: checkcast java/lang/Boolean
      // 3b3b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3b3e: ifne 3b44
      // 3b41: goto 3b48
      // 3b44: bipush 1
      // 3b45: goto 3b49
      // 3b48: bipush 0
      // 3b49: bipush 1
      // 3b4a: if_icmpeq 3b50
      // 3b4d: goto 3bb3
      // 3b50: aload 1
      // 3b51: instanceof net/minecraft/server/level/ServerLevel
      // 3b54: ifne 3b5a
      // 3b57: goto 3b8c
      // 3b5a: aload 1
      // 3b5b: checkcast net/minecraft/server/level/ServerLevel
      // 3b5e: astore 15
      // 3b60: new net/minecraft/world/entity/item/ItemEntity
      // 3b63: dup
      // 3b64: aload 15
      // 3b66: dload 2
      // 3b67: dload 4
      // 3b69: dload 6
      // 3b6b: new net/minecraft/world/item/ItemStack
      // 3b6e: dup
      // 3b6f: getstatic net/minecraft/world/level/block/Blocks.GREEN_WOOL Lnet/minecraft/world/level/block/Block;
      // 3b72: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 3b75: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3b78: astore 16
      // 3b7a: aload 16
      // 3b7c: bipush 10
      // 3b7e: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3b81: aload 15
      // 3b83: aload 16
      // 3b85: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3b88: pop
      // 3b89: goto 3b8c
      // 3b8c: aload 8
      // 3b8e: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 3b91: ifne 3b97
      // 3b94: goto 3bb0
      // 3b97: aload 8
      // 3b99: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 3b9c: astore 15
      // 3b9e: aload 15
      // 3ba0: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3ba3: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Green_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3ba6: bipush 0
      // 3ba7: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3baa: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 3bad: goto 3bb0
      // 3bb0: goto 3bb3
      // 3bb3: aload 8
      // 3bb5: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 3bb8: ifne 3bbe
      // 3bbb: goto 3be0
      // 3bbe: aload 8
      // 3bc0: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 3bc3: astore 14
      // 3bc5: aload 14
      // 3bc7: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3bca: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGreen_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3bcd: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 3bd0: checkcast java/lang/Boolean
      // 3bd3: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3bd6: ifne 3bdc
      // 3bd9: goto 3be0
      // 3bdc: bipush 1
      // 3bdd: goto 3be1
      // 3be0: bipush 0
      // 3be1: bipush 1
      // 3be2: if_icmpeq 3be8
      // 3be5: goto 3c4b
      // 3be8: aload 1
      // 3be9: instanceof net/minecraft/server/level/ServerLevel
      // 3bec: ifne 3bf2
      // 3bef: goto 3c24
      // 3bf2: aload 1
      // 3bf3: checkcast net/minecraft/server/level/ServerLevel
      // 3bf6: astore 15
      // 3bf8: new net/minecraft/world/entity/item/ItemEntity
      // 3bfb: dup
      // 3bfc: aload 15
      // 3bfe: dload 2
      // 3bff: dload 4
      // 3c01: dload 6
      // 3c03: new net/minecraft/world/item/ItemStack
      // 3c06: dup
      // 3c07: getstatic net/minecraft/world/level/block/Blocks.LIME_WOOL Lnet/minecraft/world/level/block/Block;
      // 3c0a: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 3c0d: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3c10: astore 16
      // 3c12: aload 16
      // 3c14: bipush 10
      // 3c16: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3c19: aload 15
      // 3c1b: aload 16
      // 3c1d: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3c20: pop
      // 3c21: goto 3c24
      // 3c24: aload 8
      // 3c26: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 3c29: ifne 3c2f
      // 3c2c: goto 3c48
      // 3c2f: aload 8
      // 3c31: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 3c34: astore 15
      // 3c36: aload 15
      // 3c38: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3c3b: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGreen_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3c3e: bipush 0
      // 3c3f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3c42: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 3c45: goto 3c48
      // 3c48: goto 3c4b
      // 3c4b: aload 8
      // 3c4d: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 3c50: ifne 3c56
      // 3c53: goto 3c78
      // 3c56: aload 8
      // 3c58: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 3c5b: astore 14
      // 3c5d: aload 14
      // 3c5f: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3c62: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Blue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3c65: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 3c68: checkcast java/lang/Boolean
      // 3c6b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3c6e: ifne 3c74
      // 3c71: goto 3c78
      // 3c74: bipush 1
      // 3c75: goto 3c79
      // 3c78: bipush 0
      // 3c79: bipush 1
      // 3c7a: if_icmpeq 3c80
      // 3c7d: goto 3ce3
      // 3c80: aload 1
      // 3c81: instanceof net/minecraft/server/level/ServerLevel
      // 3c84: ifne 3c8a
      // 3c87: goto 3cbc
      // 3c8a: aload 1
      // 3c8b: checkcast net/minecraft/server/level/ServerLevel
      // 3c8e: astore 15
      // 3c90: new net/minecraft/world/entity/item/ItemEntity
      // 3c93: dup
      // 3c94: aload 15
      // 3c96: dload 2
      // 3c97: dload 4
      // 3c99: dload 6
      // 3c9b: new net/minecraft/world/item/ItemStack
      // 3c9e: dup
      // 3c9f: getstatic net/minecraft/world/level/block/Blocks.BLUE_WOOL Lnet/minecraft/world/level/block/Block;
      // 3ca2: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 3ca5: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3ca8: astore 16
      // 3caa: aload 16
      // 3cac: bipush 10
      // 3cae: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3cb1: aload 15
      // 3cb3: aload 16
      // 3cb5: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3cb8: pop
      // 3cb9: goto 3cbc
      // 3cbc: aload 8
      // 3cbe: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 3cc1: ifne 3cc7
      // 3cc4: goto 3ce0
      // 3cc7: aload 8
      // 3cc9: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 3ccc: astore 15
      // 3cce: aload 15
      // 3cd0: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3cd3: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Blue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3cd6: bipush 0
      // 3cd7: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3cda: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 3cdd: goto 3ce0
      // 3ce0: goto 3ce3
      // 3ce3: aload 8
      // 3ce5: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 3ce8: ifne 3cee
      // 3ceb: goto 3d10
      // 3cee: aload 8
      // 3cf0: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 3cf3: astore 14
      // 3cf5: aload 14
      // 3cf7: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3cfa: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightBlue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3cfd: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 3d00: checkcast java/lang/Boolean
      // 3d03: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3d06: ifne 3d0c
      // 3d09: goto 3d10
      // 3d0c: bipush 1
      // 3d0d: goto 3d11
      // 3d10: bipush 0
      // 3d11: bipush 1
      // 3d12: if_icmpeq 3d18
      // 3d15: goto 3d7b
      // 3d18: aload 1
      // 3d19: instanceof net/minecraft/server/level/ServerLevel
      // 3d1c: ifne 3d22
      // 3d1f: goto 3d54
      // 3d22: aload 1
      // 3d23: checkcast net/minecraft/server/level/ServerLevel
      // 3d26: astore 15
      // 3d28: new net/minecraft/world/entity/item/ItemEntity
      // 3d2b: dup
      // 3d2c: aload 15
      // 3d2e: dload 2
      // 3d2f: dload 4
      // 3d31: dload 6
      // 3d33: new net/minecraft/world/item/ItemStack
      // 3d36: dup
      // 3d37: getstatic net/minecraft/world/level/block/Blocks.LIGHT_BLUE_WOOL Lnet/minecraft/world/level/block/Block;
      // 3d3a: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 3d3d: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3d40: astore 16
      // 3d42: aload 16
      // 3d44: bipush 10
      // 3d46: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3d49: aload 15
      // 3d4b: aload 16
      // 3d4d: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3d50: pop
      // 3d51: goto 3d54
      // 3d54: aload 8
      // 3d56: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 3d59: ifne 3d5f
      // 3d5c: goto 3d78
      // 3d5f: aload 8
      // 3d61: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 3d64: astore 15
      // 3d66: aload 15
      // 3d68: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3d6b: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightBlue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3d6e: bipush 0
      // 3d6f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3d72: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 3d75: goto 3d78
      // 3d78: goto 3d7b
      // 3d7b: aload 8
      // 3d7d: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 3d80: ifne 3d86
      // 3d83: goto 3da8
      // 3d86: aload 8
      // 3d88: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 3d8b: astore 14
      // 3d8d: aload 14
      // 3d8f: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3d92: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Pink_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3d95: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 3d98: checkcast java/lang/Boolean
      // 3d9b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3d9e: ifne 3da4
      // 3da1: goto 3da8
      // 3da4: bipush 1
      // 3da5: goto 3da9
      // 3da8: bipush 0
      // 3da9: bipush 1
      // 3daa: if_icmpeq 3db0
      // 3dad: goto 3e13
      // 3db0: aload 1
      // 3db1: instanceof net/minecraft/server/level/ServerLevel
      // 3db4: ifne 3dba
      // 3db7: goto 3dec
      // 3dba: aload 1
      // 3dbb: checkcast net/minecraft/server/level/ServerLevel
      // 3dbe: astore 15
      // 3dc0: new net/minecraft/world/entity/item/ItemEntity
      // 3dc3: dup
      // 3dc4: aload 15
      // 3dc6: dload 2
      // 3dc7: dload 4
      // 3dc9: dload 6
      // 3dcb: new net/minecraft/world/item/ItemStack
      // 3dce: dup
      // 3dcf: getstatic net/minecraft/world/level/block/Blocks.PINK_WOOL Lnet/minecraft/world/level/block/Block;
      // 3dd2: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 3dd5: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3dd8: astore 16
      // 3dda: aload 16
      // 3ddc: bipush 10
      // 3dde: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3de1: aload 15
      // 3de3: aload 16
      // 3de5: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3de8: pop
      // 3de9: goto 3dec
      // 3dec: aload 8
      // 3dee: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 3df1: ifne 3df7
      // 3df4: goto 3e10
      // 3df7: aload 8
      // 3df9: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 3dfc: astore 15
      // 3dfe: aload 15
      // 3e00: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3e03: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Pink_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3e06: bipush 0
      // 3e07: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3e0a: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 3e0d: goto 3e10
      // 3e10: goto 3e13
      // 3e13: aload 8
      // 3e15: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 3e18: ifne 3e1e
      // 3e1b: goto 3e40
      // 3e1e: aload 8
      // 3e20: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 3e23: astore 14
      // 3e25: aload 14
      // 3e27: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3e2a: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Magenta_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3e2d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 3e30: checkcast java/lang/Boolean
      // 3e33: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3e36: ifne 3e3c
      // 3e39: goto 3e40
      // 3e3c: bipush 1
      // 3e3d: goto 3e41
      // 3e40: bipush 0
      // 3e41: bipush 1
      // 3e42: if_icmpeq 3e48
      // 3e45: goto 3eab
      // 3e48: aload 1
      // 3e49: instanceof net/minecraft/server/level/ServerLevel
      // 3e4c: ifne 3e52
      // 3e4f: goto 3e84
      // 3e52: aload 1
      // 3e53: checkcast net/minecraft/server/level/ServerLevel
      // 3e56: astore 15
      // 3e58: new net/minecraft/world/entity/item/ItemEntity
      // 3e5b: dup
      // 3e5c: aload 15
      // 3e5e: dload 2
      // 3e5f: dload 4
      // 3e61: dload 6
      // 3e63: new net/minecraft/world/item/ItemStack
      // 3e66: dup
      // 3e67: getstatic net/minecraft/world/level/block/Blocks.MAGENTA_WOOL Lnet/minecraft/world/level/block/Block;
      // 3e6a: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 3e6d: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3e70: astore 16
      // 3e72: aload 16
      // 3e74: bipush 10
      // 3e76: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3e79: aload 15
      // 3e7b: aload 16
      // 3e7d: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3e80: pop
      // 3e81: goto 3e84
      // 3e84: aload 8
      // 3e86: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 3e89: ifne 3e8f
      // 3e8c: goto 3ea8
      // 3e8f: aload 8
      // 3e91: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 3e94: astore 15
      // 3e96: aload 15
      // 3e98: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3e9b: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Magenta_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3e9e: bipush 0
      // 3e9f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3ea2: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 3ea5: goto 3ea8
      // 3ea8: goto 3eab
      // 3eab: aload 8
      // 3ead: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 3eb0: ifne 3eb6
      // 3eb3: goto 3ed8
      // 3eb6: aload 8
      // 3eb8: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 3ebb: astore 14
      // 3ebd: aload 14
      // 3ebf: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3ec2: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Orange_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3ec5: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 3ec8: checkcast java/lang/Boolean
      // 3ecb: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3ece: ifne 3ed4
      // 3ed1: goto 3ed8
      // 3ed4: bipush 1
      // 3ed5: goto 3ed9
      // 3ed8: bipush 0
      // 3ed9: bipush 1
      // 3eda: if_icmpeq 3ee0
      // 3edd: goto 3f43
      // 3ee0: aload 1
      // 3ee1: instanceof net/minecraft/server/level/ServerLevel
      // 3ee4: ifne 3eea
      // 3ee7: goto 3f1c
      // 3eea: aload 1
      // 3eeb: checkcast net/minecraft/server/level/ServerLevel
      // 3eee: astore 15
      // 3ef0: new net/minecraft/world/entity/item/ItemEntity
      // 3ef3: dup
      // 3ef4: aload 15
      // 3ef6: dload 2
      // 3ef7: dload 4
      // 3ef9: dload 6
      // 3efb: new net/minecraft/world/item/ItemStack
      // 3efe: dup
      // 3eff: getstatic net/minecraft/world/level/block/Blocks.ORANGE_WOOL Lnet/minecraft/world/level/block/Block;
      // 3f02: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 3f05: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3f08: astore 16
      // 3f0a: aload 16
      // 3f0c: bipush 10
      // 3f0e: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3f11: aload 15
      // 3f13: aload 16
      // 3f15: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3f18: pop
      // 3f19: goto 3f1c
      // 3f1c: aload 8
      // 3f1e: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 3f21: ifne 3f27
      // 3f24: goto 3f40
      // 3f27: aload 8
      // 3f29: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 3f2c: astore 15
      // 3f2e: aload 15
      // 3f30: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3f33: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Orange_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3f36: bipush 0
      // 3f37: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3f3a: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 3f3d: goto 3f40
      // 3f40: goto 3f43
      // 3f43: aload 8
      // 3f45: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 3f48: ifne 3f4e
      // 3f4b: goto 3f70
      // 3f4e: aload 8
      // 3f50: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 3f53: astore 14
      // 3f55: aload 14
      // 3f57: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3f5a: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Cyan_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3f5d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 3f60: checkcast java/lang/Boolean
      // 3f63: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3f66: ifne 3f6c
      // 3f69: goto 3f70
      // 3f6c: bipush 1
      // 3f6d: goto 3f71
      // 3f70: bipush 0
      // 3f71: bipush 1
      // 3f72: if_icmpeq 3f78
      // 3f75: goto 3fdb
      // 3f78: aload 1
      // 3f79: instanceof net/minecraft/server/level/ServerLevel
      // 3f7c: ifne 3f82
      // 3f7f: goto 3fb4
      // 3f82: aload 1
      // 3f83: checkcast net/minecraft/server/level/ServerLevel
      // 3f86: astore 15
      // 3f88: new net/minecraft/world/entity/item/ItemEntity
      // 3f8b: dup
      // 3f8c: aload 15
      // 3f8e: dload 2
      // 3f8f: dload 4
      // 3f91: dload 6
      // 3f93: new net/minecraft/world/item/ItemStack
      // 3f96: dup
      // 3f97: getstatic net/minecraft/world/level/block/Blocks.CYAN_WOOL Lnet/minecraft/world/level/block/Block;
      // 3f9a: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 3f9d: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3fa0: astore 16
      // 3fa2: aload 16
      // 3fa4: bipush 10
      // 3fa6: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3fa9: aload 15
      // 3fab: aload 16
      // 3fad: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3fb0: pop
      // 3fb1: goto 3fb4
      // 3fb4: aload 8
      // 3fb6: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 3fb9: ifne 3fbf
      // 3fbc: goto 3fd8
      // 3fbf: aload 8
      // 3fc1: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 3fc4: astore 15
      // 3fc6: aload 15
      // 3fc8: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3fcb: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Cyan_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3fce: bipush 0
      // 3fcf: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3fd2: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 3fd5: goto 3fd8
      // 3fd8: goto 3fdb
      // 3fdb: aload 8
      // 3fdd: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 3fe0: ifne 3fe6
      // 3fe3: goto 4008
      // 3fe6: aload 8
      // 3fe8: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 3feb: astore 14
      // 3fed: aload 14
      // 3fef: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3ff2: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Red_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3ff5: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 3ff8: checkcast java/lang/Boolean
      // 3ffb: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3ffe: ifne 4004
      // 4001: goto 4008
      // 4004: bipush 1
      // 4005: goto 4009
      // 4008: bipush 0
      // 4009: bipush 1
      // 400a: if_icmpeq 4010
      // 400d: goto 4073
      // 4010: aload 1
      // 4011: instanceof net/minecraft/server/level/ServerLevel
      // 4014: ifne 401a
      // 4017: goto 404c
      // 401a: aload 1
      // 401b: checkcast net/minecraft/server/level/ServerLevel
      // 401e: astore 15
      // 4020: new net/minecraft/world/entity/item/ItemEntity
      // 4023: dup
      // 4024: aload 15
      // 4026: dload 2
      // 4027: dload 4
      // 4029: dload 6
      // 402b: new net/minecraft/world/item/ItemStack
      // 402e: dup
      // 402f: getstatic net/minecraft/world/level/block/Blocks.RED_WOOL Lnet/minecraft/world/level/block/Block;
      // 4032: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 4035: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4038: astore 16
      // 403a: aload 16
      // 403c: bipush 10
      // 403e: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4041: aload 15
      // 4043: aload 16
      // 4045: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4048: pop
      // 4049: goto 404c
      // 404c: aload 8
      // 404e: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 4051: ifne 4057
      // 4054: goto 4070
      // 4057: aload 8
      // 4059: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 405c: astore 15
      // 405e: aload 15
      // 4060: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4063: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Red_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4066: bipush 0
      // 4067: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 406a: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 406d: goto 4070
      // 4070: goto 4073
      // 4073: aload 8
      // 4075: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 4078: ifne 407e
      // 407b: goto 40a0
      // 407e: aload 8
      // 4080: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 4083: astore 14
      // 4085: aload 14
      // 4087: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 408a: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Yellow_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 408d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 4090: checkcast java/lang/Boolean
      // 4093: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4096: ifne 409c
      // 4099: goto 40a0
      // 409c: bipush 1
      // 409d: goto 40a1
      // 40a0: bipush 0
      // 40a1: bipush 1
      // 40a2: if_icmpeq 40a8
      // 40a5: goto 410b
      // 40a8: aload 1
      // 40a9: instanceof net/minecraft/server/level/ServerLevel
      // 40ac: ifne 40b2
      // 40af: goto 40e4
      // 40b2: aload 1
      // 40b3: checkcast net/minecraft/server/level/ServerLevel
      // 40b6: astore 15
      // 40b8: new net/minecraft/world/entity/item/ItemEntity
      // 40bb: dup
      // 40bc: aload 15
      // 40be: dload 2
      // 40bf: dload 4
      // 40c1: dload 6
      // 40c3: new net/minecraft/world/item/ItemStack
      // 40c6: dup
      // 40c7: getstatic net/minecraft/world/level/block/Blocks.YELLOW_WOOL Lnet/minecraft/world/level/block/Block;
      // 40ca: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 40cd: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 40d0: astore 16
      // 40d2: aload 16
      // 40d4: bipush 10
      // 40d6: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 40d9: aload 15
      // 40db: aload 16
      // 40dd: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 40e0: pop
      // 40e1: goto 40e4
      // 40e4: aload 8
      // 40e6: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 40e9: ifne 40ef
      // 40ec: goto 4108
      // 40ef: aload 8
      // 40f1: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 40f4: astore 15
      // 40f6: aload 15
      // 40f8: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 40fb: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Yellow_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 40fe: bipush 0
      // 40ff: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4102: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 4105: goto 4108
      // 4108: goto 410b
      // 410b: aload 8
      // 410d: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 4110: ifne 4116
      // 4113: goto 4138
      // 4116: aload 8
      // 4118: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 411b: astore 14
      // 411d: aload 14
      // 411f: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4122: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_White_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4125: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 4128: checkcast java/lang/Boolean
      // 412b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 412e: ifne 4134
      // 4131: goto 4138
      // 4134: bipush 1
      // 4135: goto 4139
      // 4138: bipush 0
      // 4139: bipush 1
      // 413a: if_icmpeq 4140
      // 413d: goto 41a3
      // 4140: aload 1
      // 4141: instanceof net/minecraft/server/level/ServerLevel
      // 4144: ifne 414a
      // 4147: goto 417c
      // 414a: aload 1
      // 414b: checkcast net/minecraft/server/level/ServerLevel
      // 414e: astore 15
      // 4150: new net/minecraft/world/entity/item/ItemEntity
      // 4153: dup
      // 4154: aload 15
      // 4156: dload 2
      // 4157: dload 4
      // 4159: dload 6
      // 415b: new net/minecraft/world/item/ItemStack
      // 415e: dup
      // 415f: getstatic net/minecraft/world/level/block/Blocks.WHITE_WOOL Lnet/minecraft/world/level/block/Block;
      // 4162: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 4165: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4168: astore 16
      // 416a: aload 16
      // 416c: bipush 10
      // 416e: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4171: aload 15
      // 4173: aload 16
      // 4175: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4178: pop
      // 4179: goto 417c
      // 417c: aload 8
      // 417e: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 4181: ifne 4187
      // 4184: goto 41a0
      // 4187: aload 8
      // 4189: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 418c: astore 15
      // 418e: aload 15
      // 4190: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4193: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_White_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4196: bipush 0
      // 4197: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 419a: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 419d: goto 41a0
      // 41a0: goto 41a3
      // 41a3: aload 8
      // 41a5: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 41a8: ifne 41ae
      // 41ab: goto 41d0
      // 41ae: aload 8
      // 41b0: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 41b3: astore 14
      // 41b5: aload 14
      // 41b7: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 41ba: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Grey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 41bd: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 41c0: checkcast java/lang/Boolean
      // 41c3: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 41c6: ifne 41cc
      // 41c9: goto 41d0
      // 41cc: bipush 1
      // 41cd: goto 41d1
      // 41d0: bipush 0
      // 41d1: bipush 1
      // 41d2: if_icmpeq 41d8
      // 41d5: goto 423b
      // 41d8: aload 1
      // 41d9: instanceof net/minecraft/server/level/ServerLevel
      // 41dc: ifne 41e2
      // 41df: goto 4214
      // 41e2: aload 1
      // 41e3: checkcast net/minecraft/server/level/ServerLevel
      // 41e6: astore 15
      // 41e8: new net/minecraft/world/entity/item/ItemEntity
      // 41eb: dup
      // 41ec: aload 15
      // 41ee: dload 2
      // 41ef: dload 4
      // 41f1: dload 6
      // 41f3: new net/minecraft/world/item/ItemStack
      // 41f6: dup
      // 41f7: getstatic net/minecraft/world/level/block/Blocks.GRAY_WOOL Lnet/minecraft/world/level/block/Block;
      // 41fa: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 41fd: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4200: astore 16
      // 4202: aload 16
      // 4204: bipush 10
      // 4206: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4209: aload 15
      // 420b: aload 16
      // 420d: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4210: pop
      // 4211: goto 4214
      // 4214: aload 8
      // 4216: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 4219: ifne 421f
      // 421c: goto 4238
      // 421f: aload 8
      // 4221: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 4224: astore 15
      // 4226: aload 15
      // 4228: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 422b: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Grey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 422e: bipush 0
      // 422f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4232: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 4235: goto 4238
      // 4238: goto 423b
      // 423b: aload 8
      // 423d: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 4240: ifne 4246
      // 4243: goto 4268
      // 4246: aload 8
      // 4248: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 424b: astore 14
      // 424d: aload 14
      // 424f: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4252: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGrey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4255: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 4258: checkcast java/lang/Boolean
      // 425b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 425e: ifne 4264
      // 4261: goto 4268
      // 4264: bipush 1
      // 4265: goto 4269
      // 4268: bipush 0
      // 4269: bipush 1
      // 426a: if_icmpeq 4270
      // 426d: goto 42d3
      // 4270: aload 1
      // 4271: instanceof net/minecraft/server/level/ServerLevel
      // 4274: ifne 427a
      // 4277: goto 42ac
      // 427a: aload 1
      // 427b: checkcast net/minecraft/server/level/ServerLevel
      // 427e: astore 15
      // 4280: new net/minecraft/world/entity/item/ItemEntity
      // 4283: dup
      // 4284: aload 15
      // 4286: dload 2
      // 4287: dload 4
      // 4289: dload 6
      // 428b: new net/minecraft/world/item/ItemStack
      // 428e: dup
      // 428f: getstatic net/minecraft/world/level/block/Blocks.LIGHT_GRAY_WOOL Lnet/minecraft/world/level/block/Block;
      // 4292: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 4295: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4298: astore 16
      // 429a: aload 16
      // 429c: bipush 10
      // 429e: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 42a1: aload 15
      // 42a3: aload 16
      // 42a5: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 42a8: pop
      // 42a9: goto 42ac
      // 42ac: aload 8
      // 42ae: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 42b1: ifne 42b7
      // 42b4: goto 42d0
      // 42b7: aload 8
      // 42b9: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 42bc: astore 15
      // 42be: aload 15
      // 42c0: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 42c3: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGrey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 42c6: bipush 0
      // 42c7: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 42ca: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 42cd: goto 42d0
      // 42d0: goto 42d3
      // 42d3: aload 8
      // 42d5: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 42d8: ifne 42de
      // 42db: goto 4300
      // 42de: aload 8
      // 42e0: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 42e3: astore 14
      // 42e5: aload 14
      // 42e7: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 42ea: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Black_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 42ed: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 42f0: checkcast java/lang/Boolean
      // 42f3: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 42f6: ifne 42fc
      // 42f9: goto 4300
      // 42fc: bipush 1
      // 42fd: goto 4301
      // 4300: bipush 0
      // 4301: bipush 1
      // 4302: if_icmpeq 4308
      // 4305: goto 436b
      // 4308: aload 1
      // 4309: instanceof net/minecraft/server/level/ServerLevel
      // 430c: ifne 4312
      // 430f: goto 4344
      // 4312: aload 1
      // 4313: checkcast net/minecraft/server/level/ServerLevel
      // 4316: astore 15
      // 4318: new net/minecraft/world/entity/item/ItemEntity
      // 431b: dup
      // 431c: aload 15
      // 431e: dload 2
      // 431f: dload 4
      // 4321: dload 6
      // 4323: new net/minecraft/world/item/ItemStack
      // 4326: dup
      // 4327: getstatic net/minecraft/world/level/block/Blocks.BLACK_WOOL Lnet/minecraft/world/level/block/Block;
      // 432a: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 432d: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4330: astore 16
      // 4332: aload 16
      // 4334: bipush 10
      // 4336: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4339: aload 15
      // 433b: aload 16
      // 433d: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4340: pop
      // 4341: goto 4344
      // 4344: aload 8
      // 4346: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 4349: ifne 434f
      // 434c: goto 4368
      // 434f: aload 8
      // 4351: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 4354: astore 15
      // 4356: aload 15
      // 4358: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 435b: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Black_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 435e: bipush 0
      // 435f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4362: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 4365: goto 4368
      // 4368: goto 436b
      // 436b: aload 8
      // 436d: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 4370: ifne 4376
      // 4373: goto 4398
      // 4376: aload 8
      // 4378: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 437b: astore 14
      // 437d: aload 14
      // 437f: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4382: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Brown_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4385: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 4388: checkcast java/lang/Boolean
      // 438b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 438e: ifne 4394
      // 4391: goto 4398
      // 4394: bipush 1
      // 4395: goto 4399
      // 4398: bipush 0
      // 4399: bipush 1
      // 439a: if_icmpeq 43a0
      // 439d: goto 4403
      // 43a0: aload 1
      // 43a1: instanceof net/minecraft/server/level/ServerLevel
      // 43a4: ifne 43aa
      // 43a7: goto 43dc
      // 43aa: aload 1
      // 43ab: checkcast net/minecraft/server/level/ServerLevel
      // 43ae: astore 15
      // 43b0: new net/minecraft/world/entity/item/ItemEntity
      // 43b3: dup
      // 43b4: aload 15
      // 43b6: dload 2
      // 43b7: dload 4
      // 43b9: dload 6
      // 43bb: new net/minecraft/world/item/ItemStack
      // 43be: dup
      // 43bf: getstatic net/minecraft/world/level/block/Blocks.BROWN_WOOL Lnet/minecraft/world/level/block/Block;
      // 43c2: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 43c5: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 43c8: astore 16
      // 43ca: aload 16
      // 43cc: bipush 10
      // 43ce: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 43d1: aload 15
      // 43d3: aload 16
      // 43d5: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 43d8: pop
      // 43d9: goto 43dc
      // 43dc: aload 8
      // 43de: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 43e1: ifne 43e7
      // 43e4: goto 4400
      // 43e7: aload 8
      // 43e9: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 43ec: astore 15
      // 43ee: aload 15
      // 43f0: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 43f3: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Brown_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 43f6: bipush 0
      // 43f7: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 43fa: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 43fd: goto 4400
      // 4400: goto 4403
      // 4403: aload 8
      // 4405: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 4408: ifne 440e
      // 440b: goto 4430
      // 440e: aload 8
      // 4410: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 4413: astore 12
      // 4415: aload 12
      // 4417: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 441a: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Orange_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 441d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 4420: checkcast java/lang/Boolean
      // 4423: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4426: ifne 442c
      // 4429: goto 4430
      // 442c: bipush 1
      // 442d: goto 4431
      // 4430: bipush 0
      // 4431: ifeq 4437
      // 4434: goto 4da9
      // 4437: aload 9
      // 4439: instanceof net/minecraft/world/entity/LivingEntity
      // 443c: ifne 4442
      // 443f: goto 4451
      // 4442: aload 9
      // 4444: checkcast net/minecraft/world/entity/LivingEntity
      // 4447: astore 13
      // 4449: aload 13
      // 444b: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 444e: goto 4454
      // 4451: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 4454: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 4457: getstatic net/minecraft/world/level/block/Blocks.ORANGE_WOOL Lnet/minecraft/world/level/block/Block;
      // 445a: invokevirtual net/minecraft/world/level/block/Block.asItem ()Lnet/minecraft/world/item/Item;
      // 445d: if_acmpeq 4463
      // 4460: goto 4da9
      // 4463: aload 9
      // 4465: instanceof net/minecraft/world/entity/player/Player
      // 4468: ifne 446e
      // 446b: goto 449d
      // 446e: aload 9
      // 4470: checkcast net/minecraft/world/entity/player/Player
      // 4473: astore 14
      // 4475: new net/minecraft/world/item/ItemStack
      // 4478: dup
      // 4479: getstatic net/minecraft/world/level/block/Blocks.ORANGE_WOOL Lnet/minecraft/world/level/block/Block;
      // 447c: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 447f: astore 15
      // 4481: aload 14
      // 4483: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 4486: aload 15
      // 4488: invokedynamic test (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, net/mocreatures/procedures/UndeadOstrichEquipmentSwapProcedure.lambda$execute$7 (Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z, (Lnet/minecraft/world/item/ItemStack;)Z ]
      // 448d: bipush 1
      // 448e: aload 14
      // 4490: getfield net/minecraft/world/entity/player/Player.inventoryMenu Lnet/minecraft/world/inventory/InventoryMenu;
      // 4493: invokevirtual net/minecraft/world/inventory/InventoryMenu.getCraftSlots ()Lnet/minecraft/world/inventory/CraftingContainer;
      // 4496: invokevirtual net/minecraft/world/entity/player/Inventory.clearOrCountMatchingItems (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
      // 4499: pop
      // 449a: goto 449d
      // 449d: aload 8
      // 449f: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 44a2: ifne 44a8
      // 44a5: goto 44c1
      // 44a8: aload 8
      // 44aa: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 44ad: astore 14
      // 44af: aload 14
      // 44b1: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 44b4: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Orange_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 44b7: bipush 1
      // 44b8: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 44bb: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 44be: goto 44c1
      // 44c1: aload 8
      // 44c3: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 44c6: ifne 44cc
      // 44c9: goto 44ee
      // 44cc: aload 8
      // 44ce: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 44d1: astore 14
      // 44d3: aload 14
      // 44d5: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 44d8: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Green_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 44db: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 44de: checkcast java/lang/Boolean
      // 44e1: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 44e4: ifne 44ea
      // 44e7: goto 44ee
      // 44ea: bipush 1
      // 44eb: goto 44ef
      // 44ee: bipush 0
      // 44ef: bipush 1
      // 44f0: if_icmpeq 44f6
      // 44f3: goto 4559
      // 44f6: aload 1
      // 44f7: instanceof net/minecraft/server/level/ServerLevel
      // 44fa: ifne 4500
      // 44fd: goto 4532
      // 4500: aload 1
      // 4501: checkcast net/minecraft/server/level/ServerLevel
      // 4504: astore 15
      // 4506: new net/minecraft/world/entity/item/ItemEntity
      // 4509: dup
      // 450a: aload 15
      // 450c: dload 2
      // 450d: dload 4
      // 450f: dload 6
      // 4511: new net/minecraft/world/item/ItemStack
      // 4514: dup
      // 4515: getstatic net/minecraft/world/level/block/Blocks.GREEN_WOOL Lnet/minecraft/world/level/block/Block;
      // 4518: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 451b: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 451e: astore 16
      // 4520: aload 16
      // 4522: bipush 10
      // 4524: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4527: aload 15
      // 4529: aload 16
      // 452b: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 452e: pop
      // 452f: goto 4532
      // 4532: aload 8
      // 4534: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 4537: ifne 453d
      // 453a: goto 4556
      // 453d: aload 8
      // 453f: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 4542: astore 15
      // 4544: aload 15
      // 4546: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4549: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Green_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 454c: bipush 0
      // 454d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4550: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 4553: goto 4556
      // 4556: goto 4559
      // 4559: aload 8
      // 455b: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 455e: ifne 4564
      // 4561: goto 4586
      // 4564: aload 8
      // 4566: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 4569: astore 14
      // 456b: aload 14
      // 456d: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4570: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGreen_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4573: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 4576: checkcast java/lang/Boolean
      // 4579: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 457c: ifne 4582
      // 457f: goto 4586
      // 4582: bipush 1
      // 4583: goto 4587
      // 4586: bipush 0
      // 4587: bipush 1
      // 4588: if_icmpeq 458e
      // 458b: goto 45f1
      // 458e: aload 1
      // 458f: instanceof net/minecraft/server/level/ServerLevel
      // 4592: ifne 4598
      // 4595: goto 45ca
      // 4598: aload 1
      // 4599: checkcast net/minecraft/server/level/ServerLevel
      // 459c: astore 15
      // 459e: new net/minecraft/world/entity/item/ItemEntity
      // 45a1: dup
      // 45a2: aload 15
      // 45a4: dload 2
      // 45a5: dload 4
      // 45a7: dload 6
      // 45a9: new net/minecraft/world/item/ItemStack
      // 45ac: dup
      // 45ad: getstatic net/minecraft/world/level/block/Blocks.LIME_WOOL Lnet/minecraft/world/level/block/Block;
      // 45b0: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 45b3: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 45b6: astore 16
      // 45b8: aload 16
      // 45ba: bipush 10
      // 45bc: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 45bf: aload 15
      // 45c1: aload 16
      // 45c3: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 45c6: pop
      // 45c7: goto 45ca
      // 45ca: aload 8
      // 45cc: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 45cf: ifne 45d5
      // 45d2: goto 45ee
      // 45d5: aload 8
      // 45d7: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 45da: astore 15
      // 45dc: aload 15
      // 45de: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 45e1: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGreen_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 45e4: bipush 0
      // 45e5: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 45e8: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 45eb: goto 45ee
      // 45ee: goto 45f1
      // 45f1: aload 8
      // 45f3: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 45f6: ifne 45fc
      // 45f9: goto 461e
      // 45fc: aload 8
      // 45fe: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 4601: astore 14
      // 4603: aload 14
      // 4605: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4608: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Blue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 460b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 460e: checkcast java/lang/Boolean
      // 4611: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4614: ifne 461a
      // 4617: goto 461e
      // 461a: bipush 1
      // 461b: goto 461f
      // 461e: bipush 0
      // 461f: bipush 1
      // 4620: if_icmpeq 4626
      // 4623: goto 4689
      // 4626: aload 1
      // 4627: instanceof net/minecraft/server/level/ServerLevel
      // 462a: ifne 4630
      // 462d: goto 4662
      // 4630: aload 1
      // 4631: checkcast net/minecraft/server/level/ServerLevel
      // 4634: astore 15
      // 4636: new net/minecraft/world/entity/item/ItemEntity
      // 4639: dup
      // 463a: aload 15
      // 463c: dload 2
      // 463d: dload 4
      // 463f: dload 6
      // 4641: new net/minecraft/world/item/ItemStack
      // 4644: dup
      // 4645: getstatic net/minecraft/world/level/block/Blocks.BLUE_WOOL Lnet/minecraft/world/level/block/Block;
      // 4648: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 464b: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 464e: astore 16
      // 4650: aload 16
      // 4652: bipush 10
      // 4654: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4657: aload 15
      // 4659: aload 16
      // 465b: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 465e: pop
      // 465f: goto 4662
      // 4662: aload 8
      // 4664: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 4667: ifne 466d
      // 466a: goto 4686
      // 466d: aload 8
      // 466f: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 4672: astore 15
      // 4674: aload 15
      // 4676: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4679: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Blue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 467c: bipush 0
      // 467d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4680: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 4683: goto 4686
      // 4686: goto 4689
      // 4689: aload 8
      // 468b: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 468e: ifne 4694
      // 4691: goto 46b6
      // 4694: aload 8
      // 4696: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 4699: astore 14
      // 469b: aload 14
      // 469d: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 46a0: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightBlue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 46a3: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 46a6: checkcast java/lang/Boolean
      // 46a9: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 46ac: ifne 46b2
      // 46af: goto 46b6
      // 46b2: bipush 1
      // 46b3: goto 46b7
      // 46b6: bipush 0
      // 46b7: bipush 1
      // 46b8: if_icmpeq 46be
      // 46bb: goto 4721
      // 46be: aload 1
      // 46bf: instanceof net/minecraft/server/level/ServerLevel
      // 46c2: ifne 46c8
      // 46c5: goto 46fa
      // 46c8: aload 1
      // 46c9: checkcast net/minecraft/server/level/ServerLevel
      // 46cc: astore 15
      // 46ce: new net/minecraft/world/entity/item/ItemEntity
      // 46d1: dup
      // 46d2: aload 15
      // 46d4: dload 2
      // 46d5: dload 4
      // 46d7: dload 6
      // 46d9: new net/minecraft/world/item/ItemStack
      // 46dc: dup
      // 46dd: getstatic net/minecraft/world/level/block/Blocks.LIGHT_BLUE_WOOL Lnet/minecraft/world/level/block/Block;
      // 46e0: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 46e3: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 46e6: astore 16
      // 46e8: aload 16
      // 46ea: bipush 10
      // 46ec: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 46ef: aload 15
      // 46f1: aload 16
      // 46f3: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 46f6: pop
      // 46f7: goto 46fa
      // 46fa: aload 8
      // 46fc: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 46ff: ifne 4705
      // 4702: goto 471e
      // 4705: aload 8
      // 4707: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 470a: astore 15
      // 470c: aload 15
      // 470e: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4711: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightBlue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4714: bipush 0
      // 4715: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4718: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 471b: goto 471e
      // 471e: goto 4721
      // 4721: aload 8
      // 4723: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 4726: ifne 472c
      // 4729: goto 474e
      // 472c: aload 8
      // 472e: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 4731: astore 14
      // 4733: aload 14
      // 4735: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4738: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Pink_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 473b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 473e: checkcast java/lang/Boolean
      // 4741: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4744: ifne 474a
      // 4747: goto 474e
      // 474a: bipush 1
      // 474b: goto 474f
      // 474e: bipush 0
      // 474f: bipush 1
      // 4750: if_icmpeq 4756
      // 4753: goto 47b9
      // 4756: aload 1
      // 4757: instanceof net/minecraft/server/level/ServerLevel
      // 475a: ifne 4760
      // 475d: goto 4792
      // 4760: aload 1
      // 4761: checkcast net/minecraft/server/level/ServerLevel
      // 4764: astore 15
      // 4766: new net/minecraft/world/entity/item/ItemEntity
      // 4769: dup
      // 476a: aload 15
      // 476c: dload 2
      // 476d: dload 4
      // 476f: dload 6
      // 4771: new net/minecraft/world/item/ItemStack
      // 4774: dup
      // 4775: getstatic net/minecraft/world/level/block/Blocks.PINK_WOOL Lnet/minecraft/world/level/block/Block;
      // 4778: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 477b: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 477e: astore 16
      // 4780: aload 16
      // 4782: bipush 10
      // 4784: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4787: aload 15
      // 4789: aload 16
      // 478b: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 478e: pop
      // 478f: goto 4792
      // 4792: aload 8
      // 4794: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 4797: ifne 479d
      // 479a: goto 47b6
      // 479d: aload 8
      // 479f: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 47a2: astore 15
      // 47a4: aload 15
      // 47a6: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 47a9: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Pink_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 47ac: bipush 0
      // 47ad: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 47b0: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 47b3: goto 47b6
      // 47b6: goto 47b9
      // 47b9: aload 8
      // 47bb: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 47be: ifne 47c4
      // 47c1: goto 47e6
      // 47c4: aload 8
      // 47c6: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 47c9: astore 14
      // 47cb: aload 14
      // 47cd: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 47d0: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Magenta_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 47d3: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 47d6: checkcast java/lang/Boolean
      // 47d9: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 47dc: ifne 47e2
      // 47df: goto 47e6
      // 47e2: bipush 1
      // 47e3: goto 47e7
      // 47e6: bipush 0
      // 47e7: bipush 1
      // 47e8: if_icmpeq 47ee
      // 47eb: goto 4851
      // 47ee: aload 1
      // 47ef: instanceof net/minecraft/server/level/ServerLevel
      // 47f2: ifne 47f8
      // 47f5: goto 482a
      // 47f8: aload 1
      // 47f9: checkcast net/minecraft/server/level/ServerLevel
      // 47fc: astore 15
      // 47fe: new net/minecraft/world/entity/item/ItemEntity
      // 4801: dup
      // 4802: aload 15
      // 4804: dload 2
      // 4805: dload 4
      // 4807: dload 6
      // 4809: new net/minecraft/world/item/ItemStack
      // 480c: dup
      // 480d: getstatic net/minecraft/world/level/block/Blocks.MAGENTA_WOOL Lnet/minecraft/world/level/block/Block;
      // 4810: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 4813: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4816: astore 16
      // 4818: aload 16
      // 481a: bipush 10
      // 481c: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 481f: aload 15
      // 4821: aload 16
      // 4823: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4826: pop
      // 4827: goto 482a
      // 482a: aload 8
      // 482c: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 482f: ifne 4835
      // 4832: goto 484e
      // 4835: aload 8
      // 4837: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 483a: astore 15
      // 483c: aload 15
      // 483e: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4841: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Magenta_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4844: bipush 0
      // 4845: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4848: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 484b: goto 484e
      // 484e: goto 4851
      // 4851: aload 8
      // 4853: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 4856: ifne 485c
      // 4859: goto 487e
      // 485c: aload 8
      // 485e: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 4861: astore 14
      // 4863: aload 14
      // 4865: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4868: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Purple_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 486b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 486e: checkcast java/lang/Boolean
      // 4871: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4874: ifne 487a
      // 4877: goto 487e
      // 487a: bipush 1
      // 487b: goto 487f
      // 487e: bipush 0
      // 487f: bipush 1
      // 4880: if_icmpeq 4886
      // 4883: goto 48e9
      // 4886: aload 1
      // 4887: instanceof net/minecraft/server/level/ServerLevel
      // 488a: ifne 4890
      // 488d: goto 48c2
      // 4890: aload 1
      // 4891: checkcast net/minecraft/server/level/ServerLevel
      // 4894: astore 15
      // 4896: new net/minecraft/world/entity/item/ItemEntity
      // 4899: dup
      // 489a: aload 15
      // 489c: dload 2
      // 489d: dload 4
      // 489f: dload 6
      // 48a1: new net/minecraft/world/item/ItemStack
      // 48a4: dup
      // 48a5: getstatic net/minecraft/world/level/block/Blocks.PURPLE_WOOL Lnet/minecraft/world/level/block/Block;
      // 48a8: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 48ab: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 48ae: astore 16
      // 48b0: aload 16
      // 48b2: bipush 10
      // 48b4: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 48b7: aload 15
      // 48b9: aload 16
      // 48bb: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 48be: pop
      // 48bf: goto 48c2
      // 48c2: aload 8
      // 48c4: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 48c7: ifne 48cd
      // 48ca: goto 48e6
      // 48cd: aload 8
      // 48cf: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 48d2: astore 15
      // 48d4: aload 15
      // 48d6: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 48d9: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Purple_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 48dc: bipush 0
      // 48dd: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 48e0: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 48e3: goto 48e6
      // 48e6: goto 48e9
      // 48e9: aload 8
      // 48eb: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 48ee: ifne 48f4
      // 48f1: goto 4916
      // 48f4: aload 8
      // 48f6: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 48f9: astore 14
      // 48fb: aload 14
      // 48fd: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4900: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Cyan_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4903: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 4906: checkcast java/lang/Boolean
      // 4909: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 490c: ifne 4912
      // 490f: goto 4916
      // 4912: bipush 1
      // 4913: goto 4917
      // 4916: bipush 0
      // 4917: bipush 1
      // 4918: if_icmpeq 491e
      // 491b: goto 4981
      // 491e: aload 1
      // 491f: instanceof net/minecraft/server/level/ServerLevel
      // 4922: ifne 4928
      // 4925: goto 495a
      // 4928: aload 1
      // 4929: checkcast net/minecraft/server/level/ServerLevel
      // 492c: astore 15
      // 492e: new net/minecraft/world/entity/item/ItemEntity
      // 4931: dup
      // 4932: aload 15
      // 4934: dload 2
      // 4935: dload 4
      // 4937: dload 6
      // 4939: new net/minecraft/world/item/ItemStack
      // 493c: dup
      // 493d: getstatic net/minecraft/world/level/block/Blocks.CYAN_WOOL Lnet/minecraft/world/level/block/Block;
      // 4940: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 4943: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4946: astore 16
      // 4948: aload 16
      // 494a: bipush 10
      // 494c: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 494f: aload 15
      // 4951: aload 16
      // 4953: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4956: pop
      // 4957: goto 495a
      // 495a: aload 8
      // 495c: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 495f: ifne 4965
      // 4962: goto 497e
      // 4965: aload 8
      // 4967: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 496a: astore 15
      // 496c: aload 15
      // 496e: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4971: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Cyan_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4974: bipush 0
      // 4975: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4978: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 497b: goto 497e
      // 497e: goto 4981
      // 4981: aload 8
      // 4983: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 4986: ifne 498c
      // 4989: goto 49ae
      // 498c: aload 8
      // 498e: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 4991: astore 14
      // 4993: aload 14
      // 4995: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4998: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Red_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 499b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 499e: checkcast java/lang/Boolean
      // 49a1: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 49a4: ifne 49aa
      // 49a7: goto 49ae
      // 49aa: bipush 1
      // 49ab: goto 49af
      // 49ae: bipush 0
      // 49af: bipush 1
      // 49b0: if_icmpeq 49b6
      // 49b3: goto 4a19
      // 49b6: aload 1
      // 49b7: instanceof net/minecraft/server/level/ServerLevel
      // 49ba: ifne 49c0
      // 49bd: goto 49f2
      // 49c0: aload 1
      // 49c1: checkcast net/minecraft/server/level/ServerLevel
      // 49c4: astore 15
      // 49c6: new net/minecraft/world/entity/item/ItemEntity
      // 49c9: dup
      // 49ca: aload 15
      // 49cc: dload 2
      // 49cd: dload 4
      // 49cf: dload 6
      // 49d1: new net/minecraft/world/item/ItemStack
      // 49d4: dup
      // 49d5: getstatic net/minecraft/world/level/block/Blocks.RED_WOOL Lnet/minecraft/world/level/block/Block;
      // 49d8: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 49db: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 49de: astore 16
      // 49e0: aload 16
      // 49e2: bipush 10
      // 49e4: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 49e7: aload 15
      // 49e9: aload 16
      // 49eb: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 49ee: pop
      // 49ef: goto 49f2
      // 49f2: aload 8
      // 49f4: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 49f7: ifne 49fd
      // 49fa: goto 4a16
      // 49fd: aload 8
      // 49ff: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 4a02: astore 15
      // 4a04: aload 15
      // 4a06: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4a09: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Red_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4a0c: bipush 0
      // 4a0d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4a10: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 4a13: goto 4a16
      // 4a16: goto 4a19
      // 4a19: aload 8
      // 4a1b: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 4a1e: ifne 4a24
      // 4a21: goto 4a46
      // 4a24: aload 8
      // 4a26: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 4a29: astore 14
      // 4a2b: aload 14
      // 4a2d: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4a30: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Yellow_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4a33: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 4a36: checkcast java/lang/Boolean
      // 4a39: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4a3c: ifne 4a42
      // 4a3f: goto 4a46
      // 4a42: bipush 1
      // 4a43: goto 4a47
      // 4a46: bipush 0
      // 4a47: bipush 1
      // 4a48: if_icmpeq 4a4e
      // 4a4b: goto 4ab1
      // 4a4e: aload 1
      // 4a4f: instanceof net/minecraft/server/level/ServerLevel
      // 4a52: ifne 4a58
      // 4a55: goto 4a8a
      // 4a58: aload 1
      // 4a59: checkcast net/minecraft/server/level/ServerLevel
      // 4a5c: astore 15
      // 4a5e: new net/minecraft/world/entity/item/ItemEntity
      // 4a61: dup
      // 4a62: aload 15
      // 4a64: dload 2
      // 4a65: dload 4
      // 4a67: dload 6
      // 4a69: new net/minecraft/world/item/ItemStack
      // 4a6c: dup
      // 4a6d: getstatic net/minecraft/world/level/block/Blocks.YELLOW_WOOL Lnet/minecraft/world/level/block/Block;
      // 4a70: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 4a73: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4a76: astore 16
      // 4a78: aload 16
      // 4a7a: bipush 10
      // 4a7c: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4a7f: aload 15
      // 4a81: aload 16
      // 4a83: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4a86: pop
      // 4a87: goto 4a8a
      // 4a8a: aload 8
      // 4a8c: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 4a8f: ifne 4a95
      // 4a92: goto 4aae
      // 4a95: aload 8
      // 4a97: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 4a9a: astore 15
      // 4a9c: aload 15
      // 4a9e: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4aa1: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Yellow_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4aa4: bipush 0
      // 4aa5: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4aa8: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 4aab: goto 4aae
      // 4aae: goto 4ab1
      // 4ab1: aload 8
      // 4ab3: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 4ab6: ifne 4abc
      // 4ab9: goto 4ade
      // 4abc: aload 8
      // 4abe: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 4ac1: astore 14
      // 4ac3: aload 14
      // 4ac5: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4ac8: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_White_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4acb: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 4ace: checkcast java/lang/Boolean
      // 4ad1: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4ad4: ifne 4ada
      // 4ad7: goto 4ade
      // 4ada: bipush 1
      // 4adb: goto 4adf
      // 4ade: bipush 0
      // 4adf: bipush 1
      // 4ae0: if_icmpeq 4ae6
      // 4ae3: goto 4b49
      // 4ae6: aload 1
      // 4ae7: instanceof net/minecraft/server/level/ServerLevel
      // 4aea: ifne 4af0
      // 4aed: goto 4b22
      // 4af0: aload 1
      // 4af1: checkcast net/minecraft/server/level/ServerLevel
      // 4af4: astore 15
      // 4af6: new net/minecraft/world/entity/item/ItemEntity
      // 4af9: dup
      // 4afa: aload 15
      // 4afc: dload 2
      // 4afd: dload 4
      // 4aff: dload 6
      // 4b01: new net/minecraft/world/item/ItemStack
      // 4b04: dup
      // 4b05: getstatic net/minecraft/world/level/block/Blocks.WHITE_WOOL Lnet/minecraft/world/level/block/Block;
      // 4b08: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 4b0b: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4b0e: astore 16
      // 4b10: aload 16
      // 4b12: bipush 10
      // 4b14: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4b17: aload 15
      // 4b19: aload 16
      // 4b1b: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4b1e: pop
      // 4b1f: goto 4b22
      // 4b22: aload 8
      // 4b24: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 4b27: ifne 4b2d
      // 4b2a: goto 4b46
      // 4b2d: aload 8
      // 4b2f: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 4b32: astore 15
      // 4b34: aload 15
      // 4b36: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4b39: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_White_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4b3c: bipush 0
      // 4b3d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4b40: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 4b43: goto 4b46
      // 4b46: goto 4b49
      // 4b49: aload 8
      // 4b4b: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 4b4e: ifne 4b54
      // 4b51: goto 4b76
      // 4b54: aload 8
      // 4b56: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 4b59: astore 14
      // 4b5b: aload 14
      // 4b5d: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4b60: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Grey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4b63: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 4b66: checkcast java/lang/Boolean
      // 4b69: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4b6c: ifne 4b72
      // 4b6f: goto 4b76
      // 4b72: bipush 1
      // 4b73: goto 4b77
      // 4b76: bipush 0
      // 4b77: bipush 1
      // 4b78: if_icmpeq 4b7e
      // 4b7b: goto 4be1
      // 4b7e: aload 1
      // 4b7f: instanceof net/minecraft/server/level/ServerLevel
      // 4b82: ifne 4b88
      // 4b85: goto 4bba
      // 4b88: aload 1
      // 4b89: checkcast net/minecraft/server/level/ServerLevel
      // 4b8c: astore 15
      // 4b8e: new net/minecraft/world/entity/item/ItemEntity
      // 4b91: dup
      // 4b92: aload 15
      // 4b94: dload 2
      // 4b95: dload 4
      // 4b97: dload 6
      // 4b99: new net/minecraft/world/item/ItemStack
      // 4b9c: dup
      // 4b9d: getstatic net/minecraft/world/level/block/Blocks.GRAY_WOOL Lnet/minecraft/world/level/block/Block;
      // 4ba0: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 4ba3: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4ba6: astore 16
      // 4ba8: aload 16
      // 4baa: bipush 10
      // 4bac: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4baf: aload 15
      // 4bb1: aload 16
      // 4bb3: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4bb6: pop
      // 4bb7: goto 4bba
      // 4bba: aload 8
      // 4bbc: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 4bbf: ifne 4bc5
      // 4bc2: goto 4bde
      // 4bc5: aload 8
      // 4bc7: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 4bca: astore 15
      // 4bcc: aload 15
      // 4bce: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4bd1: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Grey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4bd4: bipush 0
      // 4bd5: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4bd8: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 4bdb: goto 4bde
      // 4bde: goto 4be1
      // 4be1: aload 8
      // 4be3: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 4be6: ifne 4bec
      // 4be9: goto 4c0e
      // 4bec: aload 8
      // 4bee: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 4bf1: astore 14
      // 4bf3: aload 14
      // 4bf5: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4bf8: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGrey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4bfb: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 4bfe: checkcast java/lang/Boolean
      // 4c01: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4c04: ifne 4c0a
      // 4c07: goto 4c0e
      // 4c0a: bipush 1
      // 4c0b: goto 4c0f
      // 4c0e: bipush 0
      // 4c0f: bipush 1
      // 4c10: if_icmpeq 4c16
      // 4c13: goto 4c79
      // 4c16: aload 1
      // 4c17: instanceof net/minecraft/server/level/ServerLevel
      // 4c1a: ifne 4c20
      // 4c1d: goto 4c52
      // 4c20: aload 1
      // 4c21: checkcast net/minecraft/server/level/ServerLevel
      // 4c24: astore 15
      // 4c26: new net/minecraft/world/entity/item/ItemEntity
      // 4c29: dup
      // 4c2a: aload 15
      // 4c2c: dload 2
      // 4c2d: dload 4
      // 4c2f: dload 6
      // 4c31: new net/minecraft/world/item/ItemStack
      // 4c34: dup
      // 4c35: getstatic net/minecraft/world/level/block/Blocks.LIGHT_GRAY_WOOL Lnet/minecraft/world/level/block/Block;
      // 4c38: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 4c3b: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4c3e: astore 16
      // 4c40: aload 16
      // 4c42: bipush 10
      // 4c44: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4c47: aload 15
      // 4c49: aload 16
      // 4c4b: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4c4e: pop
      // 4c4f: goto 4c52
      // 4c52: aload 8
      // 4c54: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 4c57: ifne 4c5d
      // 4c5a: goto 4c76
      // 4c5d: aload 8
      // 4c5f: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 4c62: astore 15
      // 4c64: aload 15
      // 4c66: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4c69: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGrey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4c6c: bipush 0
      // 4c6d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4c70: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 4c73: goto 4c76
      // 4c76: goto 4c79
      // 4c79: aload 8
      // 4c7b: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 4c7e: ifne 4c84
      // 4c81: goto 4ca6
      // 4c84: aload 8
      // 4c86: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 4c89: astore 14
      // 4c8b: aload 14
      // 4c8d: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4c90: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Black_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4c93: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 4c96: checkcast java/lang/Boolean
      // 4c99: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4c9c: ifne 4ca2
      // 4c9f: goto 4ca6
      // 4ca2: bipush 1
      // 4ca3: goto 4ca7
      // 4ca6: bipush 0
      // 4ca7: bipush 1
      // 4ca8: if_icmpeq 4cae
      // 4cab: goto 4d11
      // 4cae: aload 1
      // 4caf: instanceof net/minecraft/server/level/ServerLevel
      // 4cb2: ifne 4cb8
      // 4cb5: goto 4cea
      // 4cb8: aload 1
      // 4cb9: checkcast net/minecraft/server/level/ServerLevel
      // 4cbc: astore 15
      // 4cbe: new net/minecraft/world/entity/item/ItemEntity
      // 4cc1: dup
      // 4cc2: aload 15
      // 4cc4: dload 2
      // 4cc5: dload 4
      // 4cc7: dload 6
      // 4cc9: new net/minecraft/world/item/ItemStack
      // 4ccc: dup
      // 4ccd: getstatic net/minecraft/world/level/block/Blocks.BLACK_WOOL Lnet/minecraft/world/level/block/Block;
      // 4cd0: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 4cd3: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4cd6: astore 16
      // 4cd8: aload 16
      // 4cda: bipush 10
      // 4cdc: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4cdf: aload 15
      // 4ce1: aload 16
      // 4ce3: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4ce6: pop
      // 4ce7: goto 4cea
      // 4cea: aload 8
      // 4cec: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 4cef: ifne 4cf5
      // 4cf2: goto 4d0e
      // 4cf5: aload 8
      // 4cf7: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 4cfa: astore 15
      // 4cfc: aload 15
      // 4cfe: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4d01: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Black_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4d04: bipush 0
      // 4d05: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4d08: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 4d0b: goto 4d0e
      // 4d0e: goto 4d11
      // 4d11: aload 8
      // 4d13: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 4d16: ifne 4d1c
      // 4d19: goto 4d3e
      // 4d1c: aload 8
      // 4d1e: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 4d21: astore 14
      // 4d23: aload 14
      // 4d25: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4d28: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Brown_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4d2b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 4d2e: checkcast java/lang/Boolean
      // 4d31: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4d34: ifne 4d3a
      // 4d37: goto 4d3e
      // 4d3a: bipush 1
      // 4d3b: goto 4d3f
      // 4d3e: bipush 0
      // 4d3f: bipush 1
      // 4d40: if_icmpeq 4d46
      // 4d43: goto 4da9
      // 4d46: aload 1
      // 4d47: instanceof net/minecraft/server/level/ServerLevel
      // 4d4a: ifne 4d50
      // 4d4d: goto 4d82
      // 4d50: aload 1
      // 4d51: checkcast net/minecraft/server/level/ServerLevel
      // 4d54: astore 15
      // 4d56: new net/minecraft/world/entity/item/ItemEntity
      // 4d59: dup
      // 4d5a: aload 15
      // 4d5c: dload 2
      // 4d5d: dload 4
      // 4d5f: dload 6
      // 4d61: new net/minecraft/world/item/ItemStack
      // 4d64: dup
      // 4d65: getstatic net/minecraft/world/level/block/Blocks.BROWN_WOOL Lnet/minecraft/world/level/block/Block;
      // 4d68: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 4d6b: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4d6e: astore 16
      // 4d70: aload 16
      // 4d72: bipush 10
      // 4d74: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4d77: aload 15
      // 4d79: aload 16
      // 4d7b: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4d7e: pop
      // 4d7f: goto 4d82
      // 4d82: aload 8
      // 4d84: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 4d87: ifne 4d8d
      // 4d8a: goto 4da6
      // 4d8d: aload 8
      // 4d8f: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 4d92: astore 15
      // 4d94: aload 15
      // 4d96: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4d99: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Brown_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4d9c: bipush 0
      // 4d9d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4da0: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 4da3: goto 4da6
      // 4da6: goto 4da9
      // 4da9: aload 8
      // 4dab: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 4dae: ifne 4db4
      // 4db1: goto 4dd6
      // 4db4: aload 8
      // 4db6: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 4db9: astore 12
      // 4dbb: aload 12
      // 4dbd: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4dc0: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Cyan_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4dc3: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 4dc6: checkcast java/lang/Boolean
      // 4dc9: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4dcc: ifne 4dd2
      // 4dcf: goto 4dd6
      // 4dd2: bipush 1
      // 4dd3: goto 4dd7
      // 4dd6: bipush 0
      // 4dd7: ifeq 4ddd
      // 4dda: goto 574f
      // 4ddd: aload 9
      // 4ddf: instanceof net/minecraft/world/entity/LivingEntity
      // 4de2: ifne 4de8
      // 4de5: goto 4df7
      // 4de8: aload 9
      // 4dea: checkcast net/minecraft/world/entity/LivingEntity
      // 4ded: astore 13
      // 4def: aload 13
      // 4df1: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 4df4: goto 4dfa
      // 4df7: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 4dfa: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 4dfd: getstatic net/minecraft/world/level/block/Blocks.CYAN_WOOL Lnet/minecraft/world/level/block/Block;
      // 4e00: invokevirtual net/minecraft/world/level/block/Block.asItem ()Lnet/minecraft/world/item/Item;
      // 4e03: if_acmpeq 4e09
      // 4e06: goto 574f
      // 4e09: aload 9
      // 4e0b: instanceof net/minecraft/world/entity/player/Player
      // 4e0e: ifne 4e14
      // 4e11: goto 4e43
      // 4e14: aload 9
      // 4e16: checkcast net/minecraft/world/entity/player/Player
      // 4e19: astore 14
      // 4e1b: new net/minecraft/world/item/ItemStack
      // 4e1e: dup
      // 4e1f: getstatic net/minecraft/world/level/block/Blocks.CYAN_WOOL Lnet/minecraft/world/level/block/Block;
      // 4e22: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 4e25: astore 15
      // 4e27: aload 14
      // 4e29: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 4e2c: aload 15
      // 4e2e: invokedynamic test (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, net/mocreatures/procedures/UndeadOstrichEquipmentSwapProcedure.lambda$execute$8 (Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z, (Lnet/minecraft/world/item/ItemStack;)Z ]
      // 4e33: bipush 1
      // 4e34: aload 14
      // 4e36: getfield net/minecraft/world/entity/player/Player.inventoryMenu Lnet/minecraft/world/inventory/InventoryMenu;
      // 4e39: invokevirtual net/minecraft/world/inventory/InventoryMenu.getCraftSlots ()Lnet/minecraft/world/inventory/CraftingContainer;
      // 4e3c: invokevirtual net/minecraft/world/entity/player/Inventory.clearOrCountMatchingItems (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
      // 4e3f: pop
      // 4e40: goto 4e43
      // 4e43: aload 8
      // 4e45: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 4e48: ifne 4e4e
      // 4e4b: goto 4e67
      // 4e4e: aload 8
      // 4e50: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 4e53: astore 14
      // 4e55: aload 14
      // 4e57: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4e5a: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Cyan_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4e5d: bipush 1
      // 4e5e: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4e61: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 4e64: goto 4e67
      // 4e67: aload 8
      // 4e69: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 4e6c: ifne 4e72
      // 4e6f: goto 4e94
      // 4e72: aload 8
      // 4e74: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 4e77: astore 14
      // 4e79: aload 14
      // 4e7b: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4e7e: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Green_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4e81: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 4e84: checkcast java/lang/Boolean
      // 4e87: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4e8a: ifne 4e90
      // 4e8d: goto 4e94
      // 4e90: bipush 1
      // 4e91: goto 4e95
      // 4e94: bipush 0
      // 4e95: bipush 1
      // 4e96: if_icmpeq 4e9c
      // 4e99: goto 4eff
      // 4e9c: aload 1
      // 4e9d: instanceof net/minecraft/server/level/ServerLevel
      // 4ea0: ifne 4ea6
      // 4ea3: goto 4ed8
      // 4ea6: aload 1
      // 4ea7: checkcast net/minecraft/server/level/ServerLevel
      // 4eaa: astore 15
      // 4eac: new net/minecraft/world/entity/item/ItemEntity
      // 4eaf: dup
      // 4eb0: aload 15
      // 4eb2: dload 2
      // 4eb3: dload 4
      // 4eb5: dload 6
      // 4eb7: new net/minecraft/world/item/ItemStack
      // 4eba: dup
      // 4ebb: getstatic net/minecraft/world/level/block/Blocks.GREEN_WOOL Lnet/minecraft/world/level/block/Block;
      // 4ebe: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 4ec1: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4ec4: astore 16
      // 4ec6: aload 16
      // 4ec8: bipush 10
      // 4eca: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4ecd: aload 15
      // 4ecf: aload 16
      // 4ed1: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4ed4: pop
      // 4ed5: goto 4ed8
      // 4ed8: aload 8
      // 4eda: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 4edd: ifne 4ee3
      // 4ee0: goto 4efc
      // 4ee3: aload 8
      // 4ee5: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 4ee8: astore 15
      // 4eea: aload 15
      // 4eec: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4eef: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Green_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4ef2: bipush 0
      // 4ef3: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4ef6: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 4ef9: goto 4efc
      // 4efc: goto 4eff
      // 4eff: aload 8
      // 4f01: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 4f04: ifne 4f0a
      // 4f07: goto 4f2c
      // 4f0a: aload 8
      // 4f0c: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 4f0f: astore 14
      // 4f11: aload 14
      // 4f13: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4f16: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGreen_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4f19: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 4f1c: checkcast java/lang/Boolean
      // 4f1f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4f22: ifne 4f28
      // 4f25: goto 4f2c
      // 4f28: bipush 1
      // 4f29: goto 4f2d
      // 4f2c: bipush 0
      // 4f2d: bipush 1
      // 4f2e: if_icmpeq 4f34
      // 4f31: goto 4f97
      // 4f34: aload 1
      // 4f35: instanceof net/minecraft/server/level/ServerLevel
      // 4f38: ifne 4f3e
      // 4f3b: goto 4f70
      // 4f3e: aload 1
      // 4f3f: checkcast net/minecraft/server/level/ServerLevel
      // 4f42: astore 15
      // 4f44: new net/minecraft/world/entity/item/ItemEntity
      // 4f47: dup
      // 4f48: aload 15
      // 4f4a: dload 2
      // 4f4b: dload 4
      // 4f4d: dload 6
      // 4f4f: new net/minecraft/world/item/ItemStack
      // 4f52: dup
      // 4f53: getstatic net/minecraft/world/level/block/Blocks.LIME_WOOL Lnet/minecraft/world/level/block/Block;
      // 4f56: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 4f59: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4f5c: astore 16
      // 4f5e: aload 16
      // 4f60: bipush 10
      // 4f62: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4f65: aload 15
      // 4f67: aload 16
      // 4f69: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4f6c: pop
      // 4f6d: goto 4f70
      // 4f70: aload 8
      // 4f72: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 4f75: ifne 4f7b
      // 4f78: goto 4f94
      // 4f7b: aload 8
      // 4f7d: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 4f80: astore 15
      // 4f82: aload 15
      // 4f84: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4f87: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGreen_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4f8a: bipush 0
      // 4f8b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4f8e: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 4f91: goto 4f94
      // 4f94: goto 4f97
      // 4f97: aload 8
      // 4f99: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 4f9c: ifne 4fa2
      // 4f9f: goto 4fc4
      // 4fa2: aload 8
      // 4fa4: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 4fa7: astore 14
      // 4fa9: aload 14
      // 4fab: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4fae: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Blue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4fb1: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 4fb4: checkcast java/lang/Boolean
      // 4fb7: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4fba: ifne 4fc0
      // 4fbd: goto 4fc4
      // 4fc0: bipush 1
      // 4fc1: goto 4fc5
      // 4fc4: bipush 0
      // 4fc5: bipush 1
      // 4fc6: if_icmpeq 4fcc
      // 4fc9: goto 502f
      // 4fcc: aload 1
      // 4fcd: instanceof net/minecraft/server/level/ServerLevel
      // 4fd0: ifne 4fd6
      // 4fd3: goto 5008
      // 4fd6: aload 1
      // 4fd7: checkcast net/minecraft/server/level/ServerLevel
      // 4fda: astore 15
      // 4fdc: new net/minecraft/world/entity/item/ItemEntity
      // 4fdf: dup
      // 4fe0: aload 15
      // 4fe2: dload 2
      // 4fe3: dload 4
      // 4fe5: dload 6
      // 4fe7: new net/minecraft/world/item/ItemStack
      // 4fea: dup
      // 4feb: getstatic net/minecraft/world/level/block/Blocks.BLUE_WOOL Lnet/minecraft/world/level/block/Block;
      // 4fee: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 4ff1: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4ff4: astore 16
      // 4ff6: aload 16
      // 4ff8: bipush 10
      // 4ffa: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4ffd: aload 15
      // 4fff: aload 16
      // 5001: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5004: pop
      // 5005: goto 5008
      // 5008: aload 8
      // 500a: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 500d: ifne 5013
      // 5010: goto 502c
      // 5013: aload 8
      // 5015: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 5018: astore 15
      // 501a: aload 15
      // 501c: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 501f: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Blue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5022: bipush 0
      // 5023: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5026: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 5029: goto 502c
      // 502c: goto 502f
      // 502f: aload 8
      // 5031: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 5034: ifne 503a
      // 5037: goto 505c
      // 503a: aload 8
      // 503c: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 503f: astore 14
      // 5041: aload 14
      // 5043: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5046: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightBlue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5049: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 504c: checkcast java/lang/Boolean
      // 504f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 5052: ifne 5058
      // 5055: goto 505c
      // 5058: bipush 1
      // 5059: goto 505d
      // 505c: bipush 0
      // 505d: bipush 1
      // 505e: if_icmpeq 5064
      // 5061: goto 50c7
      // 5064: aload 1
      // 5065: instanceof net/minecraft/server/level/ServerLevel
      // 5068: ifne 506e
      // 506b: goto 50a0
      // 506e: aload 1
      // 506f: checkcast net/minecraft/server/level/ServerLevel
      // 5072: astore 15
      // 5074: new net/minecraft/world/entity/item/ItemEntity
      // 5077: dup
      // 5078: aload 15
      // 507a: dload 2
      // 507b: dload 4
      // 507d: dload 6
      // 507f: new net/minecraft/world/item/ItemStack
      // 5082: dup
      // 5083: getstatic net/minecraft/world/level/block/Blocks.LIGHT_BLUE_WOOL Lnet/minecraft/world/level/block/Block;
      // 5086: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 5089: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 508c: astore 16
      // 508e: aload 16
      // 5090: bipush 10
      // 5092: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5095: aload 15
      // 5097: aload 16
      // 5099: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 509c: pop
      // 509d: goto 50a0
      // 50a0: aload 8
      // 50a2: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 50a5: ifne 50ab
      // 50a8: goto 50c4
      // 50ab: aload 8
      // 50ad: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 50b0: astore 15
      // 50b2: aload 15
      // 50b4: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 50b7: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightBlue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 50ba: bipush 0
      // 50bb: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 50be: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 50c1: goto 50c4
      // 50c4: goto 50c7
      // 50c7: aload 8
      // 50c9: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 50cc: ifne 50d2
      // 50cf: goto 50f4
      // 50d2: aload 8
      // 50d4: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 50d7: astore 14
      // 50d9: aload 14
      // 50db: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 50de: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Pink_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 50e1: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 50e4: checkcast java/lang/Boolean
      // 50e7: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 50ea: ifne 50f0
      // 50ed: goto 50f4
      // 50f0: bipush 1
      // 50f1: goto 50f5
      // 50f4: bipush 0
      // 50f5: bipush 1
      // 50f6: if_icmpeq 50fc
      // 50f9: goto 515f
      // 50fc: aload 1
      // 50fd: instanceof net/minecraft/server/level/ServerLevel
      // 5100: ifne 5106
      // 5103: goto 5138
      // 5106: aload 1
      // 5107: checkcast net/minecraft/server/level/ServerLevel
      // 510a: astore 15
      // 510c: new net/minecraft/world/entity/item/ItemEntity
      // 510f: dup
      // 5110: aload 15
      // 5112: dload 2
      // 5113: dload 4
      // 5115: dload 6
      // 5117: new net/minecraft/world/item/ItemStack
      // 511a: dup
      // 511b: getstatic net/minecraft/world/level/block/Blocks.PINK_WOOL Lnet/minecraft/world/level/block/Block;
      // 511e: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 5121: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5124: astore 16
      // 5126: aload 16
      // 5128: bipush 10
      // 512a: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 512d: aload 15
      // 512f: aload 16
      // 5131: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5134: pop
      // 5135: goto 5138
      // 5138: aload 8
      // 513a: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 513d: ifne 5143
      // 5140: goto 515c
      // 5143: aload 8
      // 5145: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 5148: astore 15
      // 514a: aload 15
      // 514c: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 514f: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Pink_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5152: bipush 0
      // 5153: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5156: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 5159: goto 515c
      // 515c: goto 515f
      // 515f: aload 8
      // 5161: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 5164: ifne 516a
      // 5167: goto 518c
      // 516a: aload 8
      // 516c: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 516f: astore 14
      // 5171: aload 14
      // 5173: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5176: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Magenta_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5179: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 517c: checkcast java/lang/Boolean
      // 517f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 5182: ifne 5188
      // 5185: goto 518c
      // 5188: bipush 1
      // 5189: goto 518d
      // 518c: bipush 0
      // 518d: bipush 1
      // 518e: if_icmpeq 5194
      // 5191: goto 51f7
      // 5194: aload 1
      // 5195: instanceof net/minecraft/server/level/ServerLevel
      // 5198: ifne 519e
      // 519b: goto 51d0
      // 519e: aload 1
      // 519f: checkcast net/minecraft/server/level/ServerLevel
      // 51a2: astore 15
      // 51a4: new net/minecraft/world/entity/item/ItemEntity
      // 51a7: dup
      // 51a8: aload 15
      // 51aa: dload 2
      // 51ab: dload 4
      // 51ad: dload 6
      // 51af: new net/minecraft/world/item/ItemStack
      // 51b2: dup
      // 51b3: getstatic net/minecraft/world/level/block/Blocks.MAGENTA_WOOL Lnet/minecraft/world/level/block/Block;
      // 51b6: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 51b9: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 51bc: astore 16
      // 51be: aload 16
      // 51c0: bipush 10
      // 51c2: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 51c5: aload 15
      // 51c7: aload 16
      // 51c9: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 51cc: pop
      // 51cd: goto 51d0
      // 51d0: aload 8
      // 51d2: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 51d5: ifne 51db
      // 51d8: goto 51f4
      // 51db: aload 8
      // 51dd: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 51e0: astore 15
      // 51e2: aload 15
      // 51e4: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 51e7: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Magenta_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 51ea: bipush 0
      // 51eb: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 51ee: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 51f1: goto 51f4
      // 51f4: goto 51f7
      // 51f7: aload 8
      // 51f9: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 51fc: ifne 5202
      // 51ff: goto 5224
      // 5202: aload 8
      // 5204: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 5207: astore 14
      // 5209: aload 14
      // 520b: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 520e: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Purple_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5211: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 5214: checkcast java/lang/Boolean
      // 5217: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 521a: ifne 5220
      // 521d: goto 5224
      // 5220: bipush 1
      // 5221: goto 5225
      // 5224: bipush 0
      // 5225: bipush 1
      // 5226: if_icmpeq 522c
      // 5229: goto 528f
      // 522c: aload 1
      // 522d: instanceof net/minecraft/server/level/ServerLevel
      // 5230: ifne 5236
      // 5233: goto 5268
      // 5236: aload 1
      // 5237: checkcast net/minecraft/server/level/ServerLevel
      // 523a: astore 15
      // 523c: new net/minecraft/world/entity/item/ItemEntity
      // 523f: dup
      // 5240: aload 15
      // 5242: dload 2
      // 5243: dload 4
      // 5245: dload 6
      // 5247: new net/minecraft/world/item/ItemStack
      // 524a: dup
      // 524b: getstatic net/minecraft/world/level/block/Blocks.PURPLE_WOOL Lnet/minecraft/world/level/block/Block;
      // 524e: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 5251: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5254: astore 16
      // 5256: aload 16
      // 5258: bipush 10
      // 525a: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 525d: aload 15
      // 525f: aload 16
      // 5261: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5264: pop
      // 5265: goto 5268
      // 5268: aload 8
      // 526a: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 526d: ifne 5273
      // 5270: goto 528c
      // 5273: aload 8
      // 5275: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 5278: astore 15
      // 527a: aload 15
      // 527c: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 527f: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Purple_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5282: bipush 0
      // 5283: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5286: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 5289: goto 528c
      // 528c: goto 528f
      // 528f: aload 8
      // 5291: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 5294: ifne 529a
      // 5297: goto 52bc
      // 529a: aload 8
      // 529c: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 529f: astore 14
      // 52a1: aload 14
      // 52a3: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 52a6: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Orange_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 52a9: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 52ac: checkcast java/lang/Boolean
      // 52af: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 52b2: ifne 52b8
      // 52b5: goto 52bc
      // 52b8: bipush 1
      // 52b9: goto 52bd
      // 52bc: bipush 0
      // 52bd: bipush 1
      // 52be: if_icmpeq 52c4
      // 52c1: goto 5327
      // 52c4: aload 1
      // 52c5: instanceof net/minecraft/server/level/ServerLevel
      // 52c8: ifne 52ce
      // 52cb: goto 5300
      // 52ce: aload 1
      // 52cf: checkcast net/minecraft/server/level/ServerLevel
      // 52d2: astore 15
      // 52d4: new net/minecraft/world/entity/item/ItemEntity
      // 52d7: dup
      // 52d8: aload 15
      // 52da: dload 2
      // 52db: dload 4
      // 52dd: dload 6
      // 52df: new net/minecraft/world/item/ItemStack
      // 52e2: dup
      // 52e3: getstatic net/minecraft/world/level/block/Blocks.ORANGE_WOOL Lnet/minecraft/world/level/block/Block;
      // 52e6: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 52e9: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 52ec: astore 16
      // 52ee: aload 16
      // 52f0: bipush 10
      // 52f2: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 52f5: aload 15
      // 52f7: aload 16
      // 52f9: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 52fc: pop
      // 52fd: goto 5300
      // 5300: aload 8
      // 5302: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 5305: ifne 530b
      // 5308: goto 5324
      // 530b: aload 8
      // 530d: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 5310: astore 15
      // 5312: aload 15
      // 5314: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5317: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Orange_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 531a: bipush 0
      // 531b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 531e: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 5321: goto 5324
      // 5324: goto 5327
      // 5327: aload 8
      // 5329: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 532c: ifne 5332
      // 532f: goto 5354
      // 5332: aload 8
      // 5334: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 5337: astore 14
      // 5339: aload 14
      // 533b: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 533e: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Red_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5341: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 5344: checkcast java/lang/Boolean
      // 5347: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 534a: ifne 5350
      // 534d: goto 5354
      // 5350: bipush 1
      // 5351: goto 5355
      // 5354: bipush 0
      // 5355: bipush 1
      // 5356: if_icmpeq 535c
      // 5359: goto 53bf
      // 535c: aload 1
      // 535d: instanceof net/minecraft/server/level/ServerLevel
      // 5360: ifne 5366
      // 5363: goto 5398
      // 5366: aload 1
      // 5367: checkcast net/minecraft/server/level/ServerLevel
      // 536a: astore 15
      // 536c: new net/minecraft/world/entity/item/ItemEntity
      // 536f: dup
      // 5370: aload 15
      // 5372: dload 2
      // 5373: dload 4
      // 5375: dload 6
      // 5377: new net/minecraft/world/item/ItemStack
      // 537a: dup
      // 537b: getstatic net/minecraft/world/level/block/Blocks.RED_WOOL Lnet/minecraft/world/level/block/Block;
      // 537e: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 5381: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5384: astore 16
      // 5386: aload 16
      // 5388: bipush 10
      // 538a: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 538d: aload 15
      // 538f: aload 16
      // 5391: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5394: pop
      // 5395: goto 5398
      // 5398: aload 8
      // 539a: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 539d: ifne 53a3
      // 53a0: goto 53bc
      // 53a3: aload 8
      // 53a5: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 53a8: astore 15
      // 53aa: aload 15
      // 53ac: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 53af: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Red_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 53b2: bipush 0
      // 53b3: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 53b6: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 53b9: goto 53bc
      // 53bc: goto 53bf
      // 53bf: aload 8
      // 53c1: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 53c4: ifne 53ca
      // 53c7: goto 53ec
      // 53ca: aload 8
      // 53cc: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 53cf: astore 14
      // 53d1: aload 14
      // 53d3: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 53d6: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Yellow_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 53d9: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 53dc: checkcast java/lang/Boolean
      // 53df: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 53e2: ifne 53e8
      // 53e5: goto 53ec
      // 53e8: bipush 1
      // 53e9: goto 53ed
      // 53ec: bipush 0
      // 53ed: bipush 1
      // 53ee: if_icmpeq 53f4
      // 53f1: goto 5457
      // 53f4: aload 1
      // 53f5: instanceof net/minecraft/server/level/ServerLevel
      // 53f8: ifne 53fe
      // 53fb: goto 5430
      // 53fe: aload 1
      // 53ff: checkcast net/minecraft/server/level/ServerLevel
      // 5402: astore 15
      // 5404: new net/minecraft/world/entity/item/ItemEntity
      // 5407: dup
      // 5408: aload 15
      // 540a: dload 2
      // 540b: dload 4
      // 540d: dload 6
      // 540f: new net/minecraft/world/item/ItemStack
      // 5412: dup
      // 5413: getstatic net/minecraft/world/level/block/Blocks.YELLOW_WOOL Lnet/minecraft/world/level/block/Block;
      // 5416: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 5419: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 541c: astore 16
      // 541e: aload 16
      // 5420: bipush 10
      // 5422: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5425: aload 15
      // 5427: aload 16
      // 5429: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 542c: pop
      // 542d: goto 5430
      // 5430: aload 8
      // 5432: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 5435: ifne 543b
      // 5438: goto 5454
      // 543b: aload 8
      // 543d: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 5440: astore 15
      // 5442: aload 15
      // 5444: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5447: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Yellow_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 544a: bipush 0
      // 544b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 544e: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 5451: goto 5454
      // 5454: goto 5457
      // 5457: aload 8
      // 5459: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 545c: ifne 5462
      // 545f: goto 5484
      // 5462: aload 8
      // 5464: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 5467: astore 14
      // 5469: aload 14
      // 546b: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 546e: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_White_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5471: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 5474: checkcast java/lang/Boolean
      // 5477: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 547a: ifne 5480
      // 547d: goto 5484
      // 5480: bipush 1
      // 5481: goto 5485
      // 5484: bipush 0
      // 5485: bipush 1
      // 5486: if_icmpeq 548c
      // 5489: goto 54ef
      // 548c: aload 1
      // 548d: instanceof net/minecraft/server/level/ServerLevel
      // 5490: ifne 5496
      // 5493: goto 54c8
      // 5496: aload 1
      // 5497: checkcast net/minecraft/server/level/ServerLevel
      // 549a: astore 15
      // 549c: new net/minecraft/world/entity/item/ItemEntity
      // 549f: dup
      // 54a0: aload 15
      // 54a2: dload 2
      // 54a3: dload 4
      // 54a5: dload 6
      // 54a7: new net/minecraft/world/item/ItemStack
      // 54aa: dup
      // 54ab: getstatic net/minecraft/world/level/block/Blocks.WHITE_WOOL Lnet/minecraft/world/level/block/Block;
      // 54ae: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 54b1: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 54b4: astore 16
      // 54b6: aload 16
      // 54b8: bipush 10
      // 54ba: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 54bd: aload 15
      // 54bf: aload 16
      // 54c1: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 54c4: pop
      // 54c5: goto 54c8
      // 54c8: aload 8
      // 54ca: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 54cd: ifne 54d3
      // 54d0: goto 54ec
      // 54d3: aload 8
      // 54d5: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 54d8: astore 15
      // 54da: aload 15
      // 54dc: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 54df: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_White_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 54e2: bipush 0
      // 54e3: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 54e6: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 54e9: goto 54ec
      // 54ec: goto 54ef
      // 54ef: aload 8
      // 54f1: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 54f4: ifne 54fa
      // 54f7: goto 551c
      // 54fa: aload 8
      // 54fc: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 54ff: astore 14
      // 5501: aload 14
      // 5503: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5506: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Grey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5509: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 550c: checkcast java/lang/Boolean
      // 550f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 5512: ifne 5518
      // 5515: goto 551c
      // 5518: bipush 1
      // 5519: goto 551d
      // 551c: bipush 0
      // 551d: bipush 1
      // 551e: if_icmpeq 5524
      // 5521: goto 5587
      // 5524: aload 1
      // 5525: instanceof net/minecraft/server/level/ServerLevel
      // 5528: ifne 552e
      // 552b: goto 5560
      // 552e: aload 1
      // 552f: checkcast net/minecraft/server/level/ServerLevel
      // 5532: astore 15
      // 5534: new net/minecraft/world/entity/item/ItemEntity
      // 5537: dup
      // 5538: aload 15
      // 553a: dload 2
      // 553b: dload 4
      // 553d: dload 6
      // 553f: new net/minecraft/world/item/ItemStack
      // 5542: dup
      // 5543: getstatic net/minecraft/world/level/block/Blocks.GRAY_WOOL Lnet/minecraft/world/level/block/Block;
      // 5546: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 5549: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 554c: astore 16
      // 554e: aload 16
      // 5550: bipush 10
      // 5552: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5555: aload 15
      // 5557: aload 16
      // 5559: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 555c: pop
      // 555d: goto 5560
      // 5560: aload 8
      // 5562: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 5565: ifne 556b
      // 5568: goto 5584
      // 556b: aload 8
      // 556d: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 5570: astore 15
      // 5572: aload 15
      // 5574: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5577: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Grey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 557a: bipush 0
      // 557b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 557e: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 5581: goto 5584
      // 5584: goto 5587
      // 5587: aload 8
      // 5589: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 558c: ifne 5592
      // 558f: goto 55b4
      // 5592: aload 8
      // 5594: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 5597: astore 14
      // 5599: aload 14
      // 559b: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 559e: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGrey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 55a1: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 55a4: checkcast java/lang/Boolean
      // 55a7: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 55aa: ifne 55b0
      // 55ad: goto 55b4
      // 55b0: bipush 1
      // 55b1: goto 55b5
      // 55b4: bipush 0
      // 55b5: bipush 1
      // 55b6: if_icmpeq 55bc
      // 55b9: goto 561f
      // 55bc: aload 1
      // 55bd: instanceof net/minecraft/server/level/ServerLevel
      // 55c0: ifne 55c6
      // 55c3: goto 55f8
      // 55c6: aload 1
      // 55c7: checkcast net/minecraft/server/level/ServerLevel
      // 55ca: astore 15
      // 55cc: new net/minecraft/world/entity/item/ItemEntity
      // 55cf: dup
      // 55d0: aload 15
      // 55d2: dload 2
      // 55d3: dload 4
      // 55d5: dload 6
      // 55d7: new net/minecraft/world/item/ItemStack
      // 55da: dup
      // 55db: getstatic net/minecraft/world/level/block/Blocks.LIGHT_GRAY_WOOL Lnet/minecraft/world/level/block/Block;
      // 55de: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 55e1: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 55e4: astore 16
      // 55e6: aload 16
      // 55e8: bipush 10
      // 55ea: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 55ed: aload 15
      // 55ef: aload 16
      // 55f1: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 55f4: pop
      // 55f5: goto 55f8
      // 55f8: aload 8
      // 55fa: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 55fd: ifne 5603
      // 5600: goto 561c
      // 5603: aload 8
      // 5605: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 5608: astore 15
      // 560a: aload 15
      // 560c: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 560f: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGrey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5612: bipush 0
      // 5613: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5616: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 5619: goto 561c
      // 561c: goto 561f
      // 561f: aload 8
      // 5621: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 5624: ifne 562a
      // 5627: goto 564c
      // 562a: aload 8
      // 562c: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 562f: astore 14
      // 5631: aload 14
      // 5633: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5636: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Black_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5639: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 563c: checkcast java/lang/Boolean
      // 563f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 5642: ifne 5648
      // 5645: goto 564c
      // 5648: bipush 1
      // 5649: goto 564d
      // 564c: bipush 0
      // 564d: bipush 1
      // 564e: if_icmpeq 5654
      // 5651: goto 56b7
      // 5654: aload 1
      // 5655: instanceof net/minecraft/server/level/ServerLevel
      // 5658: ifne 565e
      // 565b: goto 5690
      // 565e: aload 1
      // 565f: checkcast net/minecraft/server/level/ServerLevel
      // 5662: astore 15
      // 5664: new net/minecraft/world/entity/item/ItemEntity
      // 5667: dup
      // 5668: aload 15
      // 566a: dload 2
      // 566b: dload 4
      // 566d: dload 6
      // 566f: new net/minecraft/world/item/ItemStack
      // 5672: dup
      // 5673: getstatic net/minecraft/world/level/block/Blocks.BLACK_WOOL Lnet/minecraft/world/level/block/Block;
      // 5676: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 5679: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 567c: astore 16
      // 567e: aload 16
      // 5680: bipush 10
      // 5682: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5685: aload 15
      // 5687: aload 16
      // 5689: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 568c: pop
      // 568d: goto 5690
      // 5690: aload 8
      // 5692: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 5695: ifne 569b
      // 5698: goto 56b4
      // 569b: aload 8
      // 569d: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 56a0: astore 15
      // 56a2: aload 15
      // 56a4: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 56a7: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Black_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 56aa: bipush 0
      // 56ab: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 56ae: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 56b1: goto 56b4
      // 56b4: goto 56b7
      // 56b7: aload 8
      // 56b9: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 56bc: ifne 56c2
      // 56bf: goto 56e4
      // 56c2: aload 8
      // 56c4: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 56c7: astore 14
      // 56c9: aload 14
      // 56cb: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 56ce: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Brown_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 56d1: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 56d4: checkcast java/lang/Boolean
      // 56d7: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 56da: ifne 56e0
      // 56dd: goto 56e4
      // 56e0: bipush 1
      // 56e1: goto 56e5
      // 56e4: bipush 0
      // 56e5: bipush 1
      // 56e6: if_icmpeq 56ec
      // 56e9: goto 574f
      // 56ec: aload 1
      // 56ed: instanceof net/minecraft/server/level/ServerLevel
      // 56f0: ifne 56f6
      // 56f3: goto 5728
      // 56f6: aload 1
      // 56f7: checkcast net/minecraft/server/level/ServerLevel
      // 56fa: astore 15
      // 56fc: new net/minecraft/world/entity/item/ItemEntity
      // 56ff: dup
      // 5700: aload 15
      // 5702: dload 2
      // 5703: dload 4
      // 5705: dload 6
      // 5707: new net/minecraft/world/item/ItemStack
      // 570a: dup
      // 570b: getstatic net/minecraft/world/level/block/Blocks.BROWN_WOOL Lnet/minecraft/world/level/block/Block;
      // 570e: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 5711: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5714: astore 16
      // 5716: aload 16
      // 5718: bipush 10
      // 571a: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 571d: aload 15
      // 571f: aload 16
      // 5721: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5724: pop
      // 5725: goto 5728
      // 5728: aload 8
      // 572a: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 572d: ifne 5733
      // 5730: goto 574c
      // 5733: aload 8
      // 5735: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 5738: astore 15
      // 573a: aload 15
      // 573c: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 573f: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Brown_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5742: bipush 0
      // 5743: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5746: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 5749: goto 574c
      // 574c: goto 574f
      // 574f: aload 8
      // 5751: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 5754: ifne 575a
      // 5757: goto 577c
      // 575a: aload 8
      // 575c: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 575f: astore 12
      // 5761: aload 12
      // 5763: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5766: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Red_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5769: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 576c: checkcast java/lang/Boolean
      // 576f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 5772: ifne 5778
      // 5775: goto 577c
      // 5778: bipush 1
      // 5779: goto 577d
      // 577c: bipush 0
      // 577d: ifeq 5783
      // 5780: goto 60f5
      // 5783: aload 9
      // 5785: instanceof net/minecraft/world/entity/LivingEntity
      // 5788: ifne 578e
      // 578b: goto 579d
      // 578e: aload 9
      // 5790: checkcast net/minecraft/world/entity/LivingEntity
      // 5793: astore 13
      // 5795: aload 13
      // 5797: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 579a: goto 57a0
      // 579d: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 57a0: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 57a3: getstatic net/minecraft/world/level/block/Blocks.RED_WOOL Lnet/minecraft/world/level/block/Block;
      // 57a6: invokevirtual net/minecraft/world/level/block/Block.asItem ()Lnet/minecraft/world/item/Item;
      // 57a9: if_acmpeq 57af
      // 57ac: goto 60f5
      // 57af: aload 9
      // 57b1: instanceof net/minecraft/world/entity/player/Player
      // 57b4: ifne 57ba
      // 57b7: goto 57e9
      // 57ba: aload 9
      // 57bc: checkcast net/minecraft/world/entity/player/Player
      // 57bf: astore 14
      // 57c1: new net/minecraft/world/item/ItemStack
      // 57c4: dup
      // 57c5: getstatic net/minecraft/world/level/block/Blocks.RED_WOOL Lnet/minecraft/world/level/block/Block;
      // 57c8: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 57cb: astore 15
      // 57cd: aload 14
      // 57cf: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 57d2: aload 15
      // 57d4: invokedynamic test (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, net/mocreatures/procedures/UndeadOstrichEquipmentSwapProcedure.lambda$execute$9 (Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z, (Lnet/minecraft/world/item/ItemStack;)Z ]
      // 57d9: bipush 1
      // 57da: aload 14
      // 57dc: getfield net/minecraft/world/entity/player/Player.inventoryMenu Lnet/minecraft/world/inventory/InventoryMenu;
      // 57df: invokevirtual net/minecraft/world/inventory/InventoryMenu.getCraftSlots ()Lnet/minecraft/world/inventory/CraftingContainer;
      // 57e2: invokevirtual net/minecraft/world/entity/player/Inventory.clearOrCountMatchingItems (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
      // 57e5: pop
      // 57e6: goto 57e9
      // 57e9: aload 8
      // 57eb: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 57ee: ifne 57f4
      // 57f1: goto 580d
      // 57f4: aload 8
      // 57f6: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 57f9: astore 14
      // 57fb: aload 14
      // 57fd: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5800: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Red_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5803: bipush 1
      // 5804: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5807: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 580a: goto 580d
      // 580d: aload 8
      // 580f: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 5812: ifne 5818
      // 5815: goto 583a
      // 5818: aload 8
      // 581a: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 581d: astore 14
      // 581f: aload 14
      // 5821: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5824: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Green_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5827: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 582a: checkcast java/lang/Boolean
      // 582d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 5830: ifne 5836
      // 5833: goto 583a
      // 5836: bipush 1
      // 5837: goto 583b
      // 583a: bipush 0
      // 583b: bipush 1
      // 583c: if_icmpeq 5842
      // 583f: goto 58a5
      // 5842: aload 1
      // 5843: instanceof net/minecraft/server/level/ServerLevel
      // 5846: ifne 584c
      // 5849: goto 587e
      // 584c: aload 1
      // 584d: checkcast net/minecraft/server/level/ServerLevel
      // 5850: astore 15
      // 5852: new net/minecraft/world/entity/item/ItemEntity
      // 5855: dup
      // 5856: aload 15
      // 5858: dload 2
      // 5859: dload 4
      // 585b: dload 6
      // 585d: new net/minecraft/world/item/ItemStack
      // 5860: dup
      // 5861: getstatic net/minecraft/world/level/block/Blocks.GREEN_WOOL Lnet/minecraft/world/level/block/Block;
      // 5864: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 5867: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 586a: astore 16
      // 586c: aload 16
      // 586e: bipush 10
      // 5870: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5873: aload 15
      // 5875: aload 16
      // 5877: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 587a: pop
      // 587b: goto 587e
      // 587e: aload 8
      // 5880: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 5883: ifne 5889
      // 5886: goto 58a2
      // 5889: aload 8
      // 588b: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 588e: astore 15
      // 5890: aload 15
      // 5892: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5895: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Green_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5898: bipush 0
      // 5899: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 589c: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 589f: goto 58a2
      // 58a2: goto 58a5
      // 58a5: aload 8
      // 58a7: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 58aa: ifne 58b0
      // 58ad: goto 58d2
      // 58b0: aload 8
      // 58b2: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 58b5: astore 14
      // 58b7: aload 14
      // 58b9: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 58bc: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGreen_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 58bf: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 58c2: checkcast java/lang/Boolean
      // 58c5: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 58c8: ifne 58ce
      // 58cb: goto 58d2
      // 58ce: bipush 1
      // 58cf: goto 58d3
      // 58d2: bipush 0
      // 58d3: bipush 1
      // 58d4: if_icmpeq 58da
      // 58d7: goto 593d
      // 58da: aload 1
      // 58db: instanceof net/minecraft/server/level/ServerLevel
      // 58de: ifne 58e4
      // 58e1: goto 5916
      // 58e4: aload 1
      // 58e5: checkcast net/minecraft/server/level/ServerLevel
      // 58e8: astore 15
      // 58ea: new net/minecraft/world/entity/item/ItemEntity
      // 58ed: dup
      // 58ee: aload 15
      // 58f0: dload 2
      // 58f1: dload 4
      // 58f3: dload 6
      // 58f5: new net/minecraft/world/item/ItemStack
      // 58f8: dup
      // 58f9: getstatic net/minecraft/world/level/block/Blocks.LIME_WOOL Lnet/minecraft/world/level/block/Block;
      // 58fc: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 58ff: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5902: astore 16
      // 5904: aload 16
      // 5906: bipush 10
      // 5908: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 590b: aload 15
      // 590d: aload 16
      // 590f: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5912: pop
      // 5913: goto 5916
      // 5916: aload 8
      // 5918: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 591b: ifne 5921
      // 591e: goto 593a
      // 5921: aload 8
      // 5923: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 5926: astore 15
      // 5928: aload 15
      // 592a: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 592d: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGreen_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5930: bipush 0
      // 5931: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5934: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 5937: goto 593a
      // 593a: goto 593d
      // 593d: aload 8
      // 593f: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 5942: ifne 5948
      // 5945: goto 596a
      // 5948: aload 8
      // 594a: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 594d: astore 14
      // 594f: aload 14
      // 5951: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5954: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Blue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5957: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 595a: checkcast java/lang/Boolean
      // 595d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 5960: ifne 5966
      // 5963: goto 596a
      // 5966: bipush 1
      // 5967: goto 596b
      // 596a: bipush 0
      // 596b: bipush 1
      // 596c: if_icmpeq 5972
      // 596f: goto 59d5
      // 5972: aload 1
      // 5973: instanceof net/minecraft/server/level/ServerLevel
      // 5976: ifne 597c
      // 5979: goto 59ae
      // 597c: aload 1
      // 597d: checkcast net/minecraft/server/level/ServerLevel
      // 5980: astore 15
      // 5982: new net/minecraft/world/entity/item/ItemEntity
      // 5985: dup
      // 5986: aload 15
      // 5988: dload 2
      // 5989: dload 4
      // 598b: dload 6
      // 598d: new net/minecraft/world/item/ItemStack
      // 5990: dup
      // 5991: getstatic net/minecraft/world/level/block/Blocks.BLUE_WOOL Lnet/minecraft/world/level/block/Block;
      // 5994: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 5997: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 599a: astore 16
      // 599c: aload 16
      // 599e: bipush 10
      // 59a0: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 59a3: aload 15
      // 59a5: aload 16
      // 59a7: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 59aa: pop
      // 59ab: goto 59ae
      // 59ae: aload 8
      // 59b0: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 59b3: ifne 59b9
      // 59b6: goto 59d2
      // 59b9: aload 8
      // 59bb: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 59be: astore 15
      // 59c0: aload 15
      // 59c2: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 59c5: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Blue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 59c8: bipush 0
      // 59c9: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 59cc: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 59cf: goto 59d2
      // 59d2: goto 59d5
      // 59d5: aload 8
      // 59d7: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 59da: ifne 59e0
      // 59dd: goto 5a02
      // 59e0: aload 8
      // 59e2: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 59e5: astore 14
      // 59e7: aload 14
      // 59e9: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 59ec: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightBlue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 59ef: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 59f2: checkcast java/lang/Boolean
      // 59f5: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 59f8: ifne 59fe
      // 59fb: goto 5a02
      // 59fe: bipush 1
      // 59ff: goto 5a03
      // 5a02: bipush 0
      // 5a03: bipush 1
      // 5a04: if_icmpeq 5a0a
      // 5a07: goto 5a6d
      // 5a0a: aload 1
      // 5a0b: instanceof net/minecraft/server/level/ServerLevel
      // 5a0e: ifne 5a14
      // 5a11: goto 5a46
      // 5a14: aload 1
      // 5a15: checkcast net/minecraft/server/level/ServerLevel
      // 5a18: astore 15
      // 5a1a: new net/minecraft/world/entity/item/ItemEntity
      // 5a1d: dup
      // 5a1e: aload 15
      // 5a20: dload 2
      // 5a21: dload 4
      // 5a23: dload 6
      // 5a25: new net/minecraft/world/item/ItemStack
      // 5a28: dup
      // 5a29: getstatic net/minecraft/world/level/block/Blocks.LIGHT_BLUE_WOOL Lnet/minecraft/world/level/block/Block;
      // 5a2c: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 5a2f: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5a32: astore 16
      // 5a34: aload 16
      // 5a36: bipush 10
      // 5a38: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5a3b: aload 15
      // 5a3d: aload 16
      // 5a3f: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5a42: pop
      // 5a43: goto 5a46
      // 5a46: aload 8
      // 5a48: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 5a4b: ifne 5a51
      // 5a4e: goto 5a6a
      // 5a51: aload 8
      // 5a53: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 5a56: astore 15
      // 5a58: aload 15
      // 5a5a: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5a5d: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightBlue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5a60: bipush 0
      // 5a61: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5a64: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 5a67: goto 5a6a
      // 5a6a: goto 5a6d
      // 5a6d: aload 8
      // 5a6f: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 5a72: ifne 5a78
      // 5a75: goto 5a9a
      // 5a78: aload 8
      // 5a7a: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 5a7d: astore 14
      // 5a7f: aload 14
      // 5a81: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5a84: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Pink_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5a87: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 5a8a: checkcast java/lang/Boolean
      // 5a8d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 5a90: ifne 5a96
      // 5a93: goto 5a9a
      // 5a96: bipush 1
      // 5a97: goto 5a9b
      // 5a9a: bipush 0
      // 5a9b: bipush 1
      // 5a9c: if_icmpeq 5aa2
      // 5a9f: goto 5b05
      // 5aa2: aload 1
      // 5aa3: instanceof net/minecraft/server/level/ServerLevel
      // 5aa6: ifne 5aac
      // 5aa9: goto 5ade
      // 5aac: aload 1
      // 5aad: checkcast net/minecraft/server/level/ServerLevel
      // 5ab0: astore 15
      // 5ab2: new net/minecraft/world/entity/item/ItemEntity
      // 5ab5: dup
      // 5ab6: aload 15
      // 5ab8: dload 2
      // 5ab9: dload 4
      // 5abb: dload 6
      // 5abd: new net/minecraft/world/item/ItemStack
      // 5ac0: dup
      // 5ac1: getstatic net/minecraft/world/level/block/Blocks.PINK_WOOL Lnet/minecraft/world/level/block/Block;
      // 5ac4: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 5ac7: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5aca: astore 16
      // 5acc: aload 16
      // 5ace: bipush 10
      // 5ad0: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5ad3: aload 15
      // 5ad5: aload 16
      // 5ad7: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5ada: pop
      // 5adb: goto 5ade
      // 5ade: aload 8
      // 5ae0: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 5ae3: ifne 5ae9
      // 5ae6: goto 5b02
      // 5ae9: aload 8
      // 5aeb: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 5aee: astore 15
      // 5af0: aload 15
      // 5af2: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5af5: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Pink_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5af8: bipush 0
      // 5af9: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5afc: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 5aff: goto 5b02
      // 5b02: goto 5b05
      // 5b05: aload 8
      // 5b07: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 5b0a: ifne 5b10
      // 5b0d: goto 5b32
      // 5b10: aload 8
      // 5b12: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 5b15: astore 14
      // 5b17: aload 14
      // 5b19: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5b1c: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Magenta_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5b1f: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 5b22: checkcast java/lang/Boolean
      // 5b25: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 5b28: ifne 5b2e
      // 5b2b: goto 5b32
      // 5b2e: bipush 1
      // 5b2f: goto 5b33
      // 5b32: bipush 0
      // 5b33: bipush 1
      // 5b34: if_icmpeq 5b3a
      // 5b37: goto 5b9d
      // 5b3a: aload 1
      // 5b3b: instanceof net/minecraft/server/level/ServerLevel
      // 5b3e: ifne 5b44
      // 5b41: goto 5b76
      // 5b44: aload 1
      // 5b45: checkcast net/minecraft/server/level/ServerLevel
      // 5b48: astore 15
      // 5b4a: new net/minecraft/world/entity/item/ItemEntity
      // 5b4d: dup
      // 5b4e: aload 15
      // 5b50: dload 2
      // 5b51: dload 4
      // 5b53: dload 6
      // 5b55: new net/minecraft/world/item/ItemStack
      // 5b58: dup
      // 5b59: getstatic net/minecraft/world/level/block/Blocks.MAGENTA_WOOL Lnet/minecraft/world/level/block/Block;
      // 5b5c: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 5b5f: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5b62: astore 16
      // 5b64: aload 16
      // 5b66: bipush 10
      // 5b68: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5b6b: aload 15
      // 5b6d: aload 16
      // 5b6f: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5b72: pop
      // 5b73: goto 5b76
      // 5b76: aload 8
      // 5b78: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 5b7b: ifne 5b81
      // 5b7e: goto 5b9a
      // 5b81: aload 8
      // 5b83: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 5b86: astore 15
      // 5b88: aload 15
      // 5b8a: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5b8d: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Magenta_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5b90: bipush 0
      // 5b91: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5b94: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 5b97: goto 5b9a
      // 5b9a: goto 5b9d
      // 5b9d: aload 8
      // 5b9f: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 5ba2: ifne 5ba8
      // 5ba5: goto 5bca
      // 5ba8: aload 8
      // 5baa: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 5bad: astore 14
      // 5baf: aload 14
      // 5bb1: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5bb4: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Purple_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5bb7: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 5bba: checkcast java/lang/Boolean
      // 5bbd: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 5bc0: ifne 5bc6
      // 5bc3: goto 5bca
      // 5bc6: bipush 1
      // 5bc7: goto 5bcb
      // 5bca: bipush 0
      // 5bcb: bipush 1
      // 5bcc: if_icmpeq 5bd2
      // 5bcf: goto 5c35
      // 5bd2: aload 1
      // 5bd3: instanceof net/minecraft/server/level/ServerLevel
      // 5bd6: ifne 5bdc
      // 5bd9: goto 5c0e
      // 5bdc: aload 1
      // 5bdd: checkcast net/minecraft/server/level/ServerLevel
      // 5be0: astore 15
      // 5be2: new net/minecraft/world/entity/item/ItemEntity
      // 5be5: dup
      // 5be6: aload 15
      // 5be8: dload 2
      // 5be9: dload 4
      // 5beb: dload 6
      // 5bed: new net/minecraft/world/item/ItemStack
      // 5bf0: dup
      // 5bf1: getstatic net/minecraft/world/level/block/Blocks.PURPLE_WOOL Lnet/minecraft/world/level/block/Block;
      // 5bf4: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 5bf7: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5bfa: astore 16
      // 5bfc: aload 16
      // 5bfe: bipush 10
      // 5c00: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5c03: aload 15
      // 5c05: aload 16
      // 5c07: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5c0a: pop
      // 5c0b: goto 5c0e
      // 5c0e: aload 8
      // 5c10: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 5c13: ifne 5c19
      // 5c16: goto 5c32
      // 5c19: aload 8
      // 5c1b: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 5c1e: astore 15
      // 5c20: aload 15
      // 5c22: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5c25: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Purple_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5c28: bipush 0
      // 5c29: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5c2c: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 5c2f: goto 5c32
      // 5c32: goto 5c35
      // 5c35: aload 8
      // 5c37: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 5c3a: ifne 5c40
      // 5c3d: goto 5c62
      // 5c40: aload 8
      // 5c42: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 5c45: astore 14
      // 5c47: aload 14
      // 5c49: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5c4c: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Orange_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5c4f: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 5c52: checkcast java/lang/Boolean
      // 5c55: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 5c58: ifne 5c5e
      // 5c5b: goto 5c62
      // 5c5e: bipush 1
      // 5c5f: goto 5c63
      // 5c62: bipush 0
      // 5c63: bipush 1
      // 5c64: if_icmpeq 5c6a
      // 5c67: goto 5ccd
      // 5c6a: aload 1
      // 5c6b: instanceof net/minecraft/server/level/ServerLevel
      // 5c6e: ifne 5c74
      // 5c71: goto 5ca6
      // 5c74: aload 1
      // 5c75: checkcast net/minecraft/server/level/ServerLevel
      // 5c78: astore 15
      // 5c7a: new net/minecraft/world/entity/item/ItemEntity
      // 5c7d: dup
      // 5c7e: aload 15
      // 5c80: dload 2
      // 5c81: dload 4
      // 5c83: dload 6
      // 5c85: new net/minecraft/world/item/ItemStack
      // 5c88: dup
      // 5c89: getstatic net/minecraft/world/level/block/Blocks.ORANGE_WOOL Lnet/minecraft/world/level/block/Block;
      // 5c8c: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 5c8f: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5c92: astore 16
      // 5c94: aload 16
      // 5c96: bipush 10
      // 5c98: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5c9b: aload 15
      // 5c9d: aload 16
      // 5c9f: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5ca2: pop
      // 5ca3: goto 5ca6
      // 5ca6: aload 8
      // 5ca8: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 5cab: ifne 5cb1
      // 5cae: goto 5cca
      // 5cb1: aload 8
      // 5cb3: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 5cb6: astore 15
      // 5cb8: aload 15
      // 5cba: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5cbd: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Orange_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5cc0: bipush 0
      // 5cc1: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5cc4: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 5cc7: goto 5cca
      // 5cca: goto 5ccd
      // 5ccd: aload 8
      // 5ccf: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 5cd2: ifne 5cd8
      // 5cd5: goto 5cfa
      // 5cd8: aload 8
      // 5cda: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 5cdd: astore 14
      // 5cdf: aload 14
      // 5ce1: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5ce4: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Cyan_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5ce7: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 5cea: checkcast java/lang/Boolean
      // 5ced: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 5cf0: ifne 5cf6
      // 5cf3: goto 5cfa
      // 5cf6: bipush 1
      // 5cf7: goto 5cfb
      // 5cfa: bipush 0
      // 5cfb: bipush 1
      // 5cfc: if_icmpeq 5d02
      // 5cff: goto 5d65
      // 5d02: aload 1
      // 5d03: instanceof net/minecraft/server/level/ServerLevel
      // 5d06: ifne 5d0c
      // 5d09: goto 5d3e
      // 5d0c: aload 1
      // 5d0d: checkcast net/minecraft/server/level/ServerLevel
      // 5d10: astore 15
      // 5d12: new net/minecraft/world/entity/item/ItemEntity
      // 5d15: dup
      // 5d16: aload 15
      // 5d18: dload 2
      // 5d19: dload 4
      // 5d1b: dload 6
      // 5d1d: new net/minecraft/world/item/ItemStack
      // 5d20: dup
      // 5d21: getstatic net/minecraft/world/level/block/Blocks.CYAN_WOOL Lnet/minecraft/world/level/block/Block;
      // 5d24: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 5d27: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5d2a: astore 16
      // 5d2c: aload 16
      // 5d2e: bipush 10
      // 5d30: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5d33: aload 15
      // 5d35: aload 16
      // 5d37: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5d3a: pop
      // 5d3b: goto 5d3e
      // 5d3e: aload 8
      // 5d40: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 5d43: ifne 5d49
      // 5d46: goto 5d62
      // 5d49: aload 8
      // 5d4b: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 5d4e: astore 15
      // 5d50: aload 15
      // 5d52: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5d55: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Cyan_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5d58: bipush 0
      // 5d59: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5d5c: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 5d5f: goto 5d62
      // 5d62: goto 5d65
      // 5d65: aload 8
      // 5d67: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 5d6a: ifne 5d70
      // 5d6d: goto 5d92
      // 5d70: aload 8
      // 5d72: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 5d75: astore 14
      // 5d77: aload 14
      // 5d79: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5d7c: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Yellow_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5d7f: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 5d82: checkcast java/lang/Boolean
      // 5d85: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 5d88: ifne 5d8e
      // 5d8b: goto 5d92
      // 5d8e: bipush 1
      // 5d8f: goto 5d93
      // 5d92: bipush 0
      // 5d93: bipush 1
      // 5d94: if_icmpeq 5d9a
      // 5d97: goto 5dfd
      // 5d9a: aload 1
      // 5d9b: instanceof net/minecraft/server/level/ServerLevel
      // 5d9e: ifne 5da4
      // 5da1: goto 5dd6
      // 5da4: aload 1
      // 5da5: checkcast net/minecraft/server/level/ServerLevel
      // 5da8: astore 15
      // 5daa: new net/minecraft/world/entity/item/ItemEntity
      // 5dad: dup
      // 5dae: aload 15
      // 5db0: dload 2
      // 5db1: dload 4
      // 5db3: dload 6
      // 5db5: new net/minecraft/world/item/ItemStack
      // 5db8: dup
      // 5db9: getstatic net/minecraft/world/level/block/Blocks.YELLOW_WOOL Lnet/minecraft/world/level/block/Block;
      // 5dbc: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 5dbf: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5dc2: astore 16
      // 5dc4: aload 16
      // 5dc6: bipush 10
      // 5dc8: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5dcb: aload 15
      // 5dcd: aload 16
      // 5dcf: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5dd2: pop
      // 5dd3: goto 5dd6
      // 5dd6: aload 8
      // 5dd8: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 5ddb: ifne 5de1
      // 5dde: goto 5dfa
      // 5de1: aload 8
      // 5de3: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 5de6: astore 15
      // 5de8: aload 15
      // 5dea: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5ded: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Yellow_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5df0: bipush 0
      // 5df1: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5df4: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 5df7: goto 5dfa
      // 5dfa: goto 5dfd
      // 5dfd: aload 8
      // 5dff: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 5e02: ifne 5e08
      // 5e05: goto 5e2a
      // 5e08: aload 8
      // 5e0a: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 5e0d: astore 14
      // 5e0f: aload 14
      // 5e11: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5e14: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_White_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5e17: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 5e1a: checkcast java/lang/Boolean
      // 5e1d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 5e20: ifne 5e26
      // 5e23: goto 5e2a
      // 5e26: bipush 1
      // 5e27: goto 5e2b
      // 5e2a: bipush 0
      // 5e2b: bipush 1
      // 5e2c: if_icmpeq 5e32
      // 5e2f: goto 5e95
      // 5e32: aload 1
      // 5e33: instanceof net/minecraft/server/level/ServerLevel
      // 5e36: ifne 5e3c
      // 5e39: goto 5e6e
      // 5e3c: aload 1
      // 5e3d: checkcast net/minecraft/server/level/ServerLevel
      // 5e40: astore 15
      // 5e42: new net/minecraft/world/entity/item/ItemEntity
      // 5e45: dup
      // 5e46: aload 15
      // 5e48: dload 2
      // 5e49: dload 4
      // 5e4b: dload 6
      // 5e4d: new net/minecraft/world/item/ItemStack
      // 5e50: dup
      // 5e51: getstatic net/minecraft/world/level/block/Blocks.WHITE_WOOL Lnet/minecraft/world/level/block/Block;
      // 5e54: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 5e57: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5e5a: astore 16
      // 5e5c: aload 16
      // 5e5e: bipush 10
      // 5e60: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5e63: aload 15
      // 5e65: aload 16
      // 5e67: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5e6a: pop
      // 5e6b: goto 5e6e
      // 5e6e: aload 8
      // 5e70: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 5e73: ifne 5e79
      // 5e76: goto 5e92
      // 5e79: aload 8
      // 5e7b: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 5e7e: astore 15
      // 5e80: aload 15
      // 5e82: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5e85: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_White_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5e88: bipush 0
      // 5e89: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5e8c: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 5e8f: goto 5e92
      // 5e92: goto 5e95
      // 5e95: aload 8
      // 5e97: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 5e9a: ifne 5ea0
      // 5e9d: goto 5ec2
      // 5ea0: aload 8
      // 5ea2: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 5ea5: astore 14
      // 5ea7: aload 14
      // 5ea9: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5eac: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Grey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5eaf: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 5eb2: checkcast java/lang/Boolean
      // 5eb5: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 5eb8: ifne 5ebe
      // 5ebb: goto 5ec2
      // 5ebe: bipush 1
      // 5ebf: goto 5ec3
      // 5ec2: bipush 0
      // 5ec3: bipush 1
      // 5ec4: if_icmpeq 5eca
      // 5ec7: goto 5f2d
      // 5eca: aload 1
      // 5ecb: instanceof net/minecraft/server/level/ServerLevel
      // 5ece: ifne 5ed4
      // 5ed1: goto 5f06
      // 5ed4: aload 1
      // 5ed5: checkcast net/minecraft/server/level/ServerLevel
      // 5ed8: astore 15
      // 5eda: new net/minecraft/world/entity/item/ItemEntity
      // 5edd: dup
      // 5ede: aload 15
      // 5ee0: dload 2
      // 5ee1: dload 4
      // 5ee3: dload 6
      // 5ee5: new net/minecraft/world/item/ItemStack
      // 5ee8: dup
      // 5ee9: getstatic net/minecraft/world/level/block/Blocks.GRAY_WOOL Lnet/minecraft/world/level/block/Block;
      // 5eec: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 5eef: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5ef2: astore 16
      // 5ef4: aload 16
      // 5ef6: bipush 10
      // 5ef8: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5efb: aload 15
      // 5efd: aload 16
      // 5eff: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5f02: pop
      // 5f03: goto 5f06
      // 5f06: aload 8
      // 5f08: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 5f0b: ifne 5f11
      // 5f0e: goto 5f2a
      // 5f11: aload 8
      // 5f13: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 5f16: astore 15
      // 5f18: aload 15
      // 5f1a: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5f1d: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Grey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5f20: bipush 0
      // 5f21: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5f24: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 5f27: goto 5f2a
      // 5f2a: goto 5f2d
      // 5f2d: aload 8
      // 5f2f: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 5f32: ifne 5f38
      // 5f35: goto 5f5a
      // 5f38: aload 8
      // 5f3a: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 5f3d: astore 14
      // 5f3f: aload 14
      // 5f41: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5f44: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGrey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5f47: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 5f4a: checkcast java/lang/Boolean
      // 5f4d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 5f50: ifne 5f56
      // 5f53: goto 5f5a
      // 5f56: bipush 1
      // 5f57: goto 5f5b
      // 5f5a: bipush 0
      // 5f5b: bipush 1
      // 5f5c: if_icmpeq 5f62
      // 5f5f: goto 5fc5
      // 5f62: aload 1
      // 5f63: instanceof net/minecraft/server/level/ServerLevel
      // 5f66: ifne 5f6c
      // 5f69: goto 5f9e
      // 5f6c: aload 1
      // 5f6d: checkcast net/minecraft/server/level/ServerLevel
      // 5f70: astore 15
      // 5f72: new net/minecraft/world/entity/item/ItemEntity
      // 5f75: dup
      // 5f76: aload 15
      // 5f78: dload 2
      // 5f79: dload 4
      // 5f7b: dload 6
      // 5f7d: new net/minecraft/world/item/ItemStack
      // 5f80: dup
      // 5f81: getstatic net/minecraft/world/level/block/Blocks.LIGHT_GRAY_WOOL Lnet/minecraft/world/level/block/Block;
      // 5f84: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 5f87: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5f8a: astore 16
      // 5f8c: aload 16
      // 5f8e: bipush 10
      // 5f90: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5f93: aload 15
      // 5f95: aload 16
      // 5f97: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5f9a: pop
      // 5f9b: goto 5f9e
      // 5f9e: aload 8
      // 5fa0: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 5fa3: ifne 5fa9
      // 5fa6: goto 5fc2
      // 5fa9: aload 8
      // 5fab: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 5fae: astore 15
      // 5fb0: aload 15
      // 5fb2: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5fb5: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGrey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5fb8: bipush 0
      // 5fb9: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5fbc: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 5fbf: goto 5fc2
      // 5fc2: goto 5fc5
      // 5fc5: aload 8
      // 5fc7: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 5fca: ifne 5fd0
      // 5fcd: goto 5ff2
      // 5fd0: aload 8
      // 5fd2: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 5fd5: astore 14
      // 5fd7: aload 14
      // 5fd9: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5fdc: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Black_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5fdf: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 5fe2: checkcast java/lang/Boolean
      // 5fe5: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 5fe8: ifne 5fee
      // 5feb: goto 5ff2
      // 5fee: bipush 1
      // 5fef: goto 5ff3
      // 5ff2: bipush 0
      // 5ff3: bipush 1
      // 5ff4: if_icmpeq 5ffa
      // 5ff7: goto 605d
      // 5ffa: aload 1
      // 5ffb: instanceof net/minecraft/server/level/ServerLevel
      // 5ffe: ifne 6004
      // 6001: goto 6036
      // 6004: aload 1
      // 6005: checkcast net/minecraft/server/level/ServerLevel
      // 6008: astore 15
      // 600a: new net/minecraft/world/entity/item/ItemEntity
      // 600d: dup
      // 600e: aload 15
      // 6010: dload 2
      // 6011: dload 4
      // 6013: dload 6
      // 6015: new net/minecraft/world/item/ItemStack
      // 6018: dup
      // 6019: getstatic net/minecraft/world/level/block/Blocks.BLACK_WOOL Lnet/minecraft/world/level/block/Block;
      // 601c: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 601f: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6022: astore 16
      // 6024: aload 16
      // 6026: bipush 10
      // 6028: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 602b: aload 15
      // 602d: aload 16
      // 602f: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 6032: pop
      // 6033: goto 6036
      // 6036: aload 8
      // 6038: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 603b: ifne 6041
      // 603e: goto 605a
      // 6041: aload 8
      // 6043: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 6046: astore 15
      // 6048: aload 15
      // 604a: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 604d: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Black_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 6050: bipush 0
      // 6051: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 6054: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 6057: goto 605a
      // 605a: goto 605d
      // 605d: aload 8
      // 605f: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 6062: ifne 6068
      // 6065: goto 608a
      // 6068: aload 8
      // 606a: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 606d: astore 14
      // 606f: aload 14
      // 6071: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 6074: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Brown_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 6077: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 607a: checkcast java/lang/Boolean
      // 607d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 6080: ifne 6086
      // 6083: goto 608a
      // 6086: bipush 1
      // 6087: goto 608b
      // 608a: bipush 0
      // 608b: bipush 1
      // 608c: if_icmpeq 6092
      // 608f: goto 60f5
      // 6092: aload 1
      // 6093: instanceof net/minecraft/server/level/ServerLevel
      // 6096: ifne 609c
      // 6099: goto 60ce
      // 609c: aload 1
      // 609d: checkcast net/minecraft/server/level/ServerLevel
      // 60a0: astore 15
      // 60a2: new net/minecraft/world/entity/item/ItemEntity
      // 60a5: dup
      // 60a6: aload 15
      // 60a8: dload 2
      // 60a9: dload 4
      // 60ab: dload 6
      // 60ad: new net/minecraft/world/item/ItemStack
      // 60b0: dup
      // 60b1: getstatic net/minecraft/world/level/block/Blocks.BROWN_WOOL Lnet/minecraft/world/level/block/Block;
      // 60b4: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 60b7: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 60ba: astore 16
      // 60bc: aload 16
      // 60be: bipush 10
      // 60c0: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 60c3: aload 15
      // 60c5: aload 16
      // 60c7: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 60ca: pop
      // 60cb: goto 60ce
      // 60ce: aload 8
      // 60d0: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 60d3: ifne 60d9
      // 60d6: goto 60f2
      // 60d9: aload 8
      // 60db: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 60de: astore 15
      // 60e0: aload 15
      // 60e2: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 60e5: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Brown_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 60e8: bipush 0
      // 60e9: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 60ec: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 60ef: goto 60f2
      // 60f2: goto 60f5
      // 60f5: aload 8
      // 60f7: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 60fa: ifne 6100
      // 60fd: goto 6122
      // 6100: aload 8
      // 6102: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 6105: astore 12
      // 6107: aload 12
      // 6109: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 610c: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Yellow_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 610f: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 6112: checkcast java/lang/Boolean
      // 6115: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 6118: ifne 611e
      // 611b: goto 6122
      // 611e: bipush 1
      // 611f: goto 6123
      // 6122: bipush 0
      // 6123: ifeq 6129
      // 6126: goto 6a9b
      // 6129: aload 9
      // 612b: instanceof net/minecraft/world/entity/LivingEntity
      // 612e: ifne 6134
      // 6131: goto 6143
      // 6134: aload 9
      // 6136: checkcast net/minecraft/world/entity/LivingEntity
      // 6139: astore 13
      // 613b: aload 13
      // 613d: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 6140: goto 6146
      // 6143: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 6146: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 6149: getstatic net/minecraft/world/level/block/Blocks.YELLOW_WOOL Lnet/minecraft/world/level/block/Block;
      // 614c: invokevirtual net/minecraft/world/level/block/Block.asItem ()Lnet/minecraft/world/item/Item;
      // 614f: if_acmpeq 6155
      // 6152: goto 6a9b
      // 6155: aload 9
      // 6157: instanceof net/minecraft/world/entity/player/Player
      // 615a: ifne 6160
      // 615d: goto 618f
      // 6160: aload 9
      // 6162: checkcast net/minecraft/world/entity/player/Player
      // 6165: astore 14
      // 6167: new net/minecraft/world/item/ItemStack
      // 616a: dup
      // 616b: getstatic net/minecraft/world/level/block/Blocks.YELLOW_WOOL Lnet/minecraft/world/level/block/Block;
      // 616e: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 6171: astore 15
      // 6173: aload 14
      // 6175: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 6178: aload 15
      // 617a: invokedynamic test (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, net/mocreatures/procedures/UndeadOstrichEquipmentSwapProcedure.lambda$execute$10 (Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z, (Lnet/minecraft/world/item/ItemStack;)Z ]
      // 617f: bipush 1
      // 6180: aload 14
      // 6182: getfield net/minecraft/world/entity/player/Player.inventoryMenu Lnet/minecraft/world/inventory/InventoryMenu;
      // 6185: invokevirtual net/minecraft/world/inventory/InventoryMenu.getCraftSlots ()Lnet/minecraft/world/inventory/CraftingContainer;
      // 6188: invokevirtual net/minecraft/world/entity/player/Inventory.clearOrCountMatchingItems (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
      // 618b: pop
      // 618c: goto 618f
      // 618f: aload 8
      // 6191: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 6194: ifne 619a
      // 6197: goto 61b3
      // 619a: aload 8
      // 619c: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 619f: astore 14
      // 61a1: aload 14
      // 61a3: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 61a6: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Yellow_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 61a9: bipush 1
      // 61aa: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 61ad: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 61b0: goto 61b3
      // 61b3: aload 8
      // 61b5: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 61b8: ifne 61be
      // 61bb: goto 61e0
      // 61be: aload 8
      // 61c0: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 61c3: astore 14
      // 61c5: aload 14
      // 61c7: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 61ca: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Green_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 61cd: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 61d0: checkcast java/lang/Boolean
      // 61d3: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 61d6: ifne 61dc
      // 61d9: goto 61e0
      // 61dc: bipush 1
      // 61dd: goto 61e1
      // 61e0: bipush 0
      // 61e1: bipush 1
      // 61e2: if_icmpeq 61e8
      // 61e5: goto 624b
      // 61e8: aload 1
      // 61e9: instanceof net/minecraft/server/level/ServerLevel
      // 61ec: ifne 61f2
      // 61ef: goto 6224
      // 61f2: aload 1
      // 61f3: checkcast net/minecraft/server/level/ServerLevel
      // 61f6: astore 15
      // 61f8: new net/minecraft/world/entity/item/ItemEntity
      // 61fb: dup
      // 61fc: aload 15
      // 61fe: dload 2
      // 61ff: dload 4
      // 6201: dload 6
      // 6203: new net/minecraft/world/item/ItemStack
      // 6206: dup
      // 6207: getstatic net/minecraft/world/level/block/Blocks.GREEN_WOOL Lnet/minecraft/world/level/block/Block;
      // 620a: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 620d: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6210: astore 16
      // 6212: aload 16
      // 6214: bipush 10
      // 6216: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 6219: aload 15
      // 621b: aload 16
      // 621d: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 6220: pop
      // 6221: goto 6224
      // 6224: aload 8
      // 6226: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 6229: ifne 622f
      // 622c: goto 6248
      // 622f: aload 8
      // 6231: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 6234: astore 15
      // 6236: aload 15
      // 6238: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 623b: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Green_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 623e: bipush 0
      // 623f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 6242: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 6245: goto 6248
      // 6248: goto 624b
      // 624b: aload 8
      // 624d: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 6250: ifne 6256
      // 6253: goto 6278
      // 6256: aload 8
      // 6258: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 625b: astore 14
      // 625d: aload 14
      // 625f: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 6262: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGreen_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 6265: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 6268: checkcast java/lang/Boolean
      // 626b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 626e: ifne 6274
      // 6271: goto 6278
      // 6274: bipush 1
      // 6275: goto 6279
      // 6278: bipush 0
      // 6279: bipush 1
      // 627a: if_icmpeq 6280
      // 627d: goto 62e3
      // 6280: aload 1
      // 6281: instanceof net/minecraft/server/level/ServerLevel
      // 6284: ifne 628a
      // 6287: goto 62bc
      // 628a: aload 1
      // 628b: checkcast net/minecraft/server/level/ServerLevel
      // 628e: astore 15
      // 6290: new net/minecraft/world/entity/item/ItemEntity
      // 6293: dup
      // 6294: aload 15
      // 6296: dload 2
      // 6297: dload 4
      // 6299: dload 6
      // 629b: new net/minecraft/world/item/ItemStack
      // 629e: dup
      // 629f: getstatic net/minecraft/world/level/block/Blocks.LIME_WOOL Lnet/minecraft/world/level/block/Block;
      // 62a2: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 62a5: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 62a8: astore 16
      // 62aa: aload 16
      // 62ac: bipush 10
      // 62ae: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 62b1: aload 15
      // 62b3: aload 16
      // 62b5: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 62b8: pop
      // 62b9: goto 62bc
      // 62bc: aload 8
      // 62be: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 62c1: ifne 62c7
      // 62c4: goto 62e0
      // 62c7: aload 8
      // 62c9: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 62cc: astore 15
      // 62ce: aload 15
      // 62d0: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 62d3: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGreen_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 62d6: bipush 0
      // 62d7: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 62da: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 62dd: goto 62e0
      // 62e0: goto 62e3
      // 62e3: aload 8
      // 62e5: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 62e8: ifne 62ee
      // 62eb: goto 6310
      // 62ee: aload 8
      // 62f0: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 62f3: astore 14
      // 62f5: aload 14
      // 62f7: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 62fa: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Blue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 62fd: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 6300: checkcast java/lang/Boolean
      // 6303: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 6306: ifne 630c
      // 6309: goto 6310
      // 630c: bipush 1
      // 630d: goto 6311
      // 6310: bipush 0
      // 6311: bipush 1
      // 6312: if_icmpeq 6318
      // 6315: goto 637b
      // 6318: aload 1
      // 6319: instanceof net/minecraft/server/level/ServerLevel
      // 631c: ifne 6322
      // 631f: goto 6354
      // 6322: aload 1
      // 6323: checkcast net/minecraft/server/level/ServerLevel
      // 6326: astore 15
      // 6328: new net/minecraft/world/entity/item/ItemEntity
      // 632b: dup
      // 632c: aload 15
      // 632e: dload 2
      // 632f: dload 4
      // 6331: dload 6
      // 6333: new net/minecraft/world/item/ItemStack
      // 6336: dup
      // 6337: getstatic net/minecraft/world/level/block/Blocks.BLUE_WOOL Lnet/minecraft/world/level/block/Block;
      // 633a: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 633d: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6340: astore 16
      // 6342: aload 16
      // 6344: bipush 10
      // 6346: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 6349: aload 15
      // 634b: aload 16
      // 634d: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 6350: pop
      // 6351: goto 6354
      // 6354: aload 8
      // 6356: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 6359: ifne 635f
      // 635c: goto 6378
      // 635f: aload 8
      // 6361: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 6364: astore 15
      // 6366: aload 15
      // 6368: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 636b: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Blue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 636e: bipush 0
      // 636f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 6372: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 6375: goto 6378
      // 6378: goto 637b
      // 637b: aload 8
      // 637d: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 6380: ifne 6386
      // 6383: goto 63a8
      // 6386: aload 8
      // 6388: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 638b: astore 14
      // 638d: aload 14
      // 638f: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 6392: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightBlue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 6395: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 6398: checkcast java/lang/Boolean
      // 639b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 639e: ifne 63a4
      // 63a1: goto 63a8
      // 63a4: bipush 1
      // 63a5: goto 63a9
      // 63a8: bipush 0
      // 63a9: bipush 1
      // 63aa: if_icmpeq 63b0
      // 63ad: goto 6413
      // 63b0: aload 1
      // 63b1: instanceof net/minecraft/server/level/ServerLevel
      // 63b4: ifne 63ba
      // 63b7: goto 63ec
      // 63ba: aload 1
      // 63bb: checkcast net/minecraft/server/level/ServerLevel
      // 63be: astore 15
      // 63c0: new net/minecraft/world/entity/item/ItemEntity
      // 63c3: dup
      // 63c4: aload 15
      // 63c6: dload 2
      // 63c7: dload 4
      // 63c9: dload 6
      // 63cb: new net/minecraft/world/item/ItemStack
      // 63ce: dup
      // 63cf: getstatic net/minecraft/world/level/block/Blocks.LIGHT_BLUE_WOOL Lnet/minecraft/world/level/block/Block;
      // 63d2: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 63d5: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 63d8: astore 16
      // 63da: aload 16
      // 63dc: bipush 10
      // 63de: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 63e1: aload 15
      // 63e3: aload 16
      // 63e5: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 63e8: pop
      // 63e9: goto 63ec
      // 63ec: aload 8
      // 63ee: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 63f1: ifne 63f7
      // 63f4: goto 6410
      // 63f7: aload 8
      // 63f9: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 63fc: astore 15
      // 63fe: aload 15
      // 6400: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 6403: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightBlue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 6406: bipush 0
      // 6407: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 640a: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 640d: goto 6410
      // 6410: goto 6413
      // 6413: aload 8
      // 6415: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 6418: ifne 641e
      // 641b: goto 6440
      // 641e: aload 8
      // 6420: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 6423: astore 14
      // 6425: aload 14
      // 6427: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 642a: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Pink_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 642d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 6430: checkcast java/lang/Boolean
      // 6433: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 6436: ifne 643c
      // 6439: goto 6440
      // 643c: bipush 1
      // 643d: goto 6441
      // 6440: bipush 0
      // 6441: bipush 1
      // 6442: if_icmpeq 6448
      // 6445: goto 64ab
      // 6448: aload 1
      // 6449: instanceof net/minecraft/server/level/ServerLevel
      // 644c: ifne 6452
      // 644f: goto 6484
      // 6452: aload 1
      // 6453: checkcast net/minecraft/server/level/ServerLevel
      // 6456: astore 15
      // 6458: new net/minecraft/world/entity/item/ItemEntity
      // 645b: dup
      // 645c: aload 15
      // 645e: dload 2
      // 645f: dload 4
      // 6461: dload 6
      // 6463: new net/minecraft/world/item/ItemStack
      // 6466: dup
      // 6467: getstatic net/minecraft/world/level/block/Blocks.PINK_WOOL Lnet/minecraft/world/level/block/Block;
      // 646a: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 646d: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6470: astore 16
      // 6472: aload 16
      // 6474: bipush 10
      // 6476: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 6479: aload 15
      // 647b: aload 16
      // 647d: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 6480: pop
      // 6481: goto 6484
      // 6484: aload 8
      // 6486: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 6489: ifne 648f
      // 648c: goto 64a8
      // 648f: aload 8
      // 6491: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 6494: astore 15
      // 6496: aload 15
      // 6498: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 649b: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Pink_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 649e: bipush 0
      // 649f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 64a2: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 64a5: goto 64a8
      // 64a8: goto 64ab
      // 64ab: aload 8
      // 64ad: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 64b0: ifne 64b6
      // 64b3: goto 64d8
      // 64b6: aload 8
      // 64b8: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 64bb: astore 14
      // 64bd: aload 14
      // 64bf: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 64c2: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Magenta_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 64c5: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 64c8: checkcast java/lang/Boolean
      // 64cb: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 64ce: ifne 64d4
      // 64d1: goto 64d8
      // 64d4: bipush 1
      // 64d5: goto 64d9
      // 64d8: bipush 0
      // 64d9: bipush 1
      // 64da: if_icmpeq 64e0
      // 64dd: goto 6543
      // 64e0: aload 1
      // 64e1: instanceof net/minecraft/server/level/ServerLevel
      // 64e4: ifne 64ea
      // 64e7: goto 651c
      // 64ea: aload 1
      // 64eb: checkcast net/minecraft/server/level/ServerLevel
      // 64ee: astore 15
      // 64f0: new net/minecraft/world/entity/item/ItemEntity
      // 64f3: dup
      // 64f4: aload 15
      // 64f6: dload 2
      // 64f7: dload 4
      // 64f9: dload 6
      // 64fb: new net/minecraft/world/item/ItemStack
      // 64fe: dup
      // 64ff: getstatic net/minecraft/world/level/block/Blocks.MAGENTA_WOOL Lnet/minecraft/world/level/block/Block;
      // 6502: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 6505: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6508: astore 16
      // 650a: aload 16
      // 650c: bipush 10
      // 650e: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 6511: aload 15
      // 6513: aload 16
      // 6515: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 6518: pop
      // 6519: goto 651c
      // 651c: aload 8
      // 651e: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 6521: ifne 6527
      // 6524: goto 6540
      // 6527: aload 8
      // 6529: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 652c: astore 15
      // 652e: aload 15
      // 6530: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 6533: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Magenta_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 6536: bipush 0
      // 6537: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 653a: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 653d: goto 6540
      // 6540: goto 6543
      // 6543: aload 8
      // 6545: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 6548: ifne 654e
      // 654b: goto 6570
      // 654e: aload 8
      // 6550: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 6553: astore 14
      // 6555: aload 14
      // 6557: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 655a: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Purple_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 655d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 6560: checkcast java/lang/Boolean
      // 6563: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 6566: ifne 656c
      // 6569: goto 6570
      // 656c: bipush 1
      // 656d: goto 6571
      // 6570: bipush 0
      // 6571: bipush 1
      // 6572: if_icmpeq 6578
      // 6575: goto 65db
      // 6578: aload 1
      // 6579: instanceof net/minecraft/server/level/ServerLevel
      // 657c: ifne 6582
      // 657f: goto 65b4
      // 6582: aload 1
      // 6583: checkcast net/minecraft/server/level/ServerLevel
      // 6586: astore 15
      // 6588: new net/minecraft/world/entity/item/ItemEntity
      // 658b: dup
      // 658c: aload 15
      // 658e: dload 2
      // 658f: dload 4
      // 6591: dload 6
      // 6593: new net/minecraft/world/item/ItemStack
      // 6596: dup
      // 6597: getstatic net/minecraft/world/level/block/Blocks.PURPLE_WOOL Lnet/minecraft/world/level/block/Block;
      // 659a: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 659d: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 65a0: astore 16
      // 65a2: aload 16
      // 65a4: bipush 10
      // 65a6: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 65a9: aload 15
      // 65ab: aload 16
      // 65ad: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 65b0: pop
      // 65b1: goto 65b4
      // 65b4: aload 8
      // 65b6: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 65b9: ifne 65bf
      // 65bc: goto 65d8
      // 65bf: aload 8
      // 65c1: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 65c4: astore 15
      // 65c6: aload 15
      // 65c8: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 65cb: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Purple_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 65ce: bipush 0
      // 65cf: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 65d2: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 65d5: goto 65d8
      // 65d8: goto 65db
      // 65db: aload 8
      // 65dd: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 65e0: ifne 65e6
      // 65e3: goto 6608
      // 65e6: aload 8
      // 65e8: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 65eb: astore 14
      // 65ed: aload 14
      // 65ef: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 65f2: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Orange_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 65f5: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 65f8: checkcast java/lang/Boolean
      // 65fb: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 65fe: ifne 6604
      // 6601: goto 6608
      // 6604: bipush 1
      // 6605: goto 6609
      // 6608: bipush 0
      // 6609: bipush 1
      // 660a: if_icmpeq 6610
      // 660d: goto 6673
      // 6610: aload 1
      // 6611: instanceof net/minecraft/server/level/ServerLevel
      // 6614: ifne 661a
      // 6617: goto 664c
      // 661a: aload 1
      // 661b: checkcast net/minecraft/server/level/ServerLevel
      // 661e: astore 15
      // 6620: new net/minecraft/world/entity/item/ItemEntity
      // 6623: dup
      // 6624: aload 15
      // 6626: dload 2
      // 6627: dload 4
      // 6629: dload 6
      // 662b: new net/minecraft/world/item/ItemStack
      // 662e: dup
      // 662f: getstatic net/minecraft/world/level/block/Blocks.ORANGE_WOOL Lnet/minecraft/world/level/block/Block;
      // 6632: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 6635: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6638: astore 16
      // 663a: aload 16
      // 663c: bipush 10
      // 663e: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 6641: aload 15
      // 6643: aload 16
      // 6645: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 6648: pop
      // 6649: goto 664c
      // 664c: aload 8
      // 664e: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 6651: ifne 6657
      // 6654: goto 6670
      // 6657: aload 8
      // 6659: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 665c: astore 15
      // 665e: aload 15
      // 6660: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 6663: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Orange_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 6666: bipush 0
      // 6667: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 666a: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 666d: goto 6670
      // 6670: goto 6673
      // 6673: aload 8
      // 6675: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 6678: ifne 667e
      // 667b: goto 66a0
      // 667e: aload 8
      // 6680: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 6683: astore 14
      // 6685: aload 14
      // 6687: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 668a: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Cyan_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 668d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 6690: checkcast java/lang/Boolean
      // 6693: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 6696: ifne 669c
      // 6699: goto 66a0
      // 669c: bipush 1
      // 669d: goto 66a1
      // 66a0: bipush 0
      // 66a1: bipush 1
      // 66a2: if_icmpeq 66a8
      // 66a5: goto 670b
      // 66a8: aload 1
      // 66a9: instanceof net/minecraft/server/level/ServerLevel
      // 66ac: ifne 66b2
      // 66af: goto 66e4
      // 66b2: aload 1
      // 66b3: checkcast net/minecraft/server/level/ServerLevel
      // 66b6: astore 15
      // 66b8: new net/minecraft/world/entity/item/ItemEntity
      // 66bb: dup
      // 66bc: aload 15
      // 66be: dload 2
      // 66bf: dload 4
      // 66c1: dload 6
      // 66c3: new net/minecraft/world/item/ItemStack
      // 66c6: dup
      // 66c7: getstatic net/minecraft/world/level/block/Blocks.CYAN_WOOL Lnet/minecraft/world/level/block/Block;
      // 66ca: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 66cd: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 66d0: astore 16
      // 66d2: aload 16
      // 66d4: bipush 10
      // 66d6: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 66d9: aload 15
      // 66db: aload 16
      // 66dd: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 66e0: pop
      // 66e1: goto 66e4
      // 66e4: aload 8
      // 66e6: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 66e9: ifne 66ef
      // 66ec: goto 6708
      // 66ef: aload 8
      // 66f1: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 66f4: astore 15
      // 66f6: aload 15
      // 66f8: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 66fb: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Cyan_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 66fe: bipush 0
      // 66ff: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 6702: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 6705: goto 6708
      // 6708: goto 670b
      // 670b: aload 8
      // 670d: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 6710: ifne 6716
      // 6713: goto 6738
      // 6716: aload 8
      // 6718: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 671b: astore 14
      // 671d: aload 14
      // 671f: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 6722: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Red_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 6725: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 6728: checkcast java/lang/Boolean
      // 672b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 672e: ifne 6734
      // 6731: goto 6738
      // 6734: bipush 1
      // 6735: goto 6739
      // 6738: bipush 0
      // 6739: bipush 1
      // 673a: if_icmpeq 6740
      // 673d: goto 67a3
      // 6740: aload 1
      // 6741: instanceof net/minecraft/server/level/ServerLevel
      // 6744: ifne 674a
      // 6747: goto 677c
      // 674a: aload 1
      // 674b: checkcast net/minecraft/server/level/ServerLevel
      // 674e: astore 15
      // 6750: new net/minecraft/world/entity/item/ItemEntity
      // 6753: dup
      // 6754: aload 15
      // 6756: dload 2
      // 6757: dload 4
      // 6759: dload 6
      // 675b: new net/minecraft/world/item/ItemStack
      // 675e: dup
      // 675f: getstatic net/minecraft/world/level/block/Blocks.RED_WOOL Lnet/minecraft/world/level/block/Block;
      // 6762: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 6765: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6768: astore 16
      // 676a: aload 16
      // 676c: bipush 10
      // 676e: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 6771: aload 15
      // 6773: aload 16
      // 6775: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 6778: pop
      // 6779: goto 677c
      // 677c: aload 8
      // 677e: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 6781: ifne 6787
      // 6784: goto 67a0
      // 6787: aload 8
      // 6789: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 678c: astore 15
      // 678e: aload 15
      // 6790: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 6793: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Red_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 6796: bipush 0
      // 6797: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 679a: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 679d: goto 67a0
      // 67a0: goto 67a3
      // 67a3: aload 8
      // 67a5: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 67a8: ifne 67ae
      // 67ab: goto 67d0
      // 67ae: aload 8
      // 67b0: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 67b3: astore 14
      // 67b5: aload 14
      // 67b7: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 67ba: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_White_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 67bd: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 67c0: checkcast java/lang/Boolean
      // 67c3: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 67c6: ifne 67cc
      // 67c9: goto 67d0
      // 67cc: bipush 1
      // 67cd: goto 67d1
      // 67d0: bipush 0
      // 67d1: bipush 1
      // 67d2: if_icmpeq 67d8
      // 67d5: goto 683b
      // 67d8: aload 1
      // 67d9: instanceof net/minecraft/server/level/ServerLevel
      // 67dc: ifne 67e2
      // 67df: goto 6814
      // 67e2: aload 1
      // 67e3: checkcast net/minecraft/server/level/ServerLevel
      // 67e6: astore 15
      // 67e8: new net/minecraft/world/entity/item/ItemEntity
      // 67eb: dup
      // 67ec: aload 15
      // 67ee: dload 2
      // 67ef: dload 4
      // 67f1: dload 6
      // 67f3: new net/minecraft/world/item/ItemStack
      // 67f6: dup
      // 67f7: getstatic net/minecraft/world/level/block/Blocks.WHITE_WOOL Lnet/minecraft/world/level/block/Block;
      // 67fa: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 67fd: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6800: astore 16
      // 6802: aload 16
      // 6804: bipush 10
      // 6806: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 6809: aload 15
      // 680b: aload 16
      // 680d: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 6810: pop
      // 6811: goto 6814
      // 6814: aload 8
      // 6816: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 6819: ifne 681f
      // 681c: goto 6838
      // 681f: aload 8
      // 6821: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 6824: astore 15
      // 6826: aload 15
      // 6828: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 682b: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_White_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 682e: bipush 0
      // 682f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 6832: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 6835: goto 6838
      // 6838: goto 683b
      // 683b: aload 8
      // 683d: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 6840: ifne 6846
      // 6843: goto 6868
      // 6846: aload 8
      // 6848: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 684b: astore 14
      // 684d: aload 14
      // 684f: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 6852: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Grey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 6855: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 6858: checkcast java/lang/Boolean
      // 685b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 685e: ifne 6864
      // 6861: goto 6868
      // 6864: bipush 1
      // 6865: goto 6869
      // 6868: bipush 0
      // 6869: bipush 1
      // 686a: if_icmpeq 6870
      // 686d: goto 68d3
      // 6870: aload 1
      // 6871: instanceof net/minecraft/server/level/ServerLevel
      // 6874: ifne 687a
      // 6877: goto 68ac
      // 687a: aload 1
      // 687b: checkcast net/minecraft/server/level/ServerLevel
      // 687e: astore 15
      // 6880: new net/minecraft/world/entity/item/ItemEntity
      // 6883: dup
      // 6884: aload 15
      // 6886: dload 2
      // 6887: dload 4
      // 6889: dload 6
      // 688b: new net/minecraft/world/item/ItemStack
      // 688e: dup
      // 688f: getstatic net/minecraft/world/level/block/Blocks.GRAY_WOOL Lnet/minecraft/world/level/block/Block;
      // 6892: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 6895: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6898: astore 16
      // 689a: aload 16
      // 689c: bipush 10
      // 689e: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 68a1: aload 15
      // 68a3: aload 16
      // 68a5: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 68a8: pop
      // 68a9: goto 68ac
      // 68ac: aload 8
      // 68ae: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 68b1: ifne 68b7
      // 68b4: goto 68d0
      // 68b7: aload 8
      // 68b9: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 68bc: astore 15
      // 68be: aload 15
      // 68c0: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 68c3: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Grey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 68c6: bipush 0
      // 68c7: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 68ca: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 68cd: goto 68d0
      // 68d0: goto 68d3
      // 68d3: aload 8
      // 68d5: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 68d8: ifne 68de
      // 68db: goto 6900
      // 68de: aload 8
      // 68e0: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 68e3: astore 14
      // 68e5: aload 14
      // 68e7: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 68ea: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGrey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 68ed: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 68f0: checkcast java/lang/Boolean
      // 68f3: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 68f6: ifne 68fc
      // 68f9: goto 6900
      // 68fc: bipush 1
      // 68fd: goto 6901
      // 6900: bipush 0
      // 6901: bipush 1
      // 6902: if_icmpeq 6908
      // 6905: goto 696b
      // 6908: aload 1
      // 6909: instanceof net/minecraft/server/level/ServerLevel
      // 690c: ifne 6912
      // 690f: goto 6944
      // 6912: aload 1
      // 6913: checkcast net/minecraft/server/level/ServerLevel
      // 6916: astore 15
      // 6918: new net/minecraft/world/entity/item/ItemEntity
      // 691b: dup
      // 691c: aload 15
      // 691e: dload 2
      // 691f: dload 4
      // 6921: dload 6
      // 6923: new net/minecraft/world/item/ItemStack
      // 6926: dup
      // 6927: getstatic net/minecraft/world/level/block/Blocks.LIGHT_GRAY_WOOL Lnet/minecraft/world/level/block/Block;
      // 692a: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 692d: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6930: astore 16
      // 6932: aload 16
      // 6934: bipush 10
      // 6936: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 6939: aload 15
      // 693b: aload 16
      // 693d: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 6940: pop
      // 6941: goto 6944
      // 6944: aload 8
      // 6946: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 6949: ifne 694f
      // 694c: goto 6968
      // 694f: aload 8
      // 6951: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 6954: astore 15
      // 6956: aload 15
      // 6958: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 695b: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGrey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 695e: bipush 0
      // 695f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 6962: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 6965: goto 6968
      // 6968: goto 696b
      // 696b: aload 8
      // 696d: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 6970: ifne 6976
      // 6973: goto 6998
      // 6976: aload 8
      // 6978: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 697b: astore 14
      // 697d: aload 14
      // 697f: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 6982: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Black_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 6985: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 6988: checkcast java/lang/Boolean
      // 698b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 698e: ifne 6994
      // 6991: goto 6998
      // 6994: bipush 1
      // 6995: goto 6999
      // 6998: bipush 0
      // 6999: bipush 1
      // 699a: if_icmpeq 69a0
      // 699d: goto 6a03
      // 69a0: aload 1
      // 69a1: instanceof net/minecraft/server/level/ServerLevel
      // 69a4: ifne 69aa
      // 69a7: goto 69dc
      // 69aa: aload 1
      // 69ab: checkcast net/minecraft/server/level/ServerLevel
      // 69ae: astore 15
      // 69b0: new net/minecraft/world/entity/item/ItemEntity
      // 69b3: dup
      // 69b4: aload 15
      // 69b6: dload 2
      // 69b7: dload 4
      // 69b9: dload 6
      // 69bb: new net/minecraft/world/item/ItemStack
      // 69be: dup
      // 69bf: getstatic net/minecraft/world/level/block/Blocks.BLACK_WOOL Lnet/minecraft/world/level/block/Block;
      // 69c2: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 69c5: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 69c8: astore 16
      // 69ca: aload 16
      // 69cc: bipush 10
      // 69ce: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 69d1: aload 15
      // 69d3: aload 16
      // 69d5: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 69d8: pop
      // 69d9: goto 69dc
      // 69dc: aload 8
      // 69de: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 69e1: ifne 69e7
      // 69e4: goto 6a00
      // 69e7: aload 8
      // 69e9: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 69ec: astore 15
      // 69ee: aload 15
      // 69f0: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 69f3: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Black_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 69f6: bipush 0
      // 69f7: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 69fa: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 69fd: goto 6a00
      // 6a00: goto 6a03
      // 6a03: aload 8
      // 6a05: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 6a08: ifne 6a0e
      // 6a0b: goto 6a30
      // 6a0e: aload 8
      // 6a10: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 6a13: astore 14
      // 6a15: aload 14
      // 6a17: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 6a1a: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Brown_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 6a1d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 6a20: checkcast java/lang/Boolean
      // 6a23: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 6a26: ifne 6a2c
      // 6a29: goto 6a30
      // 6a2c: bipush 1
      // 6a2d: goto 6a31
      // 6a30: bipush 0
      // 6a31: bipush 1
      // 6a32: if_icmpeq 6a38
      // 6a35: goto 6a9b
      // 6a38: aload 1
      // 6a39: instanceof net/minecraft/server/level/ServerLevel
      // 6a3c: ifne 6a42
      // 6a3f: goto 6a74
      // 6a42: aload 1
      // 6a43: checkcast net/minecraft/server/level/ServerLevel
      // 6a46: astore 15
      // 6a48: new net/minecraft/world/entity/item/ItemEntity
      // 6a4b: dup
      // 6a4c: aload 15
      // 6a4e: dload 2
      // 6a4f: dload 4
      // 6a51: dload 6
      // 6a53: new net/minecraft/world/item/ItemStack
      // 6a56: dup
      // 6a57: getstatic net/minecraft/world/level/block/Blocks.BROWN_WOOL Lnet/minecraft/world/level/block/Block;
      // 6a5a: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 6a5d: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6a60: astore 16
      // 6a62: aload 16
      // 6a64: bipush 10
      // 6a66: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 6a69: aload 15
      // 6a6b: aload 16
      // 6a6d: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 6a70: pop
      // 6a71: goto 6a74
      // 6a74: aload 8
      // 6a76: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 6a79: ifne 6a7f
      // 6a7c: goto 6a98
      // 6a7f: aload 8
      // 6a81: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 6a84: astore 15
      // 6a86: aload 15
      // 6a88: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 6a8b: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Brown_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 6a8e: bipush 0
      // 6a8f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 6a92: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 6a95: goto 6a98
      // 6a98: goto 6a9b
      // 6a9b: aload 8
      // 6a9d: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 6aa0: ifne 6aa6
      // 6aa3: goto 6ac8
      // 6aa6: aload 8
      // 6aa8: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 6aab: astore 12
      // 6aad: aload 12
      // 6aaf: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 6ab2: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_White_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 6ab5: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 6ab8: checkcast java/lang/Boolean
      // 6abb: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 6abe: ifne 6ac4
      // 6ac1: goto 6ac8
      // 6ac4: bipush 1
      // 6ac5: goto 6ac9
      // 6ac8: bipush 0
      // 6ac9: ifeq 6acf
      // 6acc: goto 7441
      // 6acf: aload 9
      // 6ad1: instanceof net/minecraft/world/entity/LivingEntity
      // 6ad4: ifne 6ada
      // 6ad7: goto 6ae9
      // 6ada: aload 9
      // 6adc: checkcast net/minecraft/world/entity/LivingEntity
      // 6adf: astore 13
      // 6ae1: aload 13
      // 6ae3: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 6ae6: goto 6aec
      // 6ae9: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 6aec: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 6aef: getstatic net/minecraft/world/level/block/Blocks.WHITE_WOOL Lnet/minecraft/world/level/block/Block;
      // 6af2: invokevirtual net/minecraft/world/level/block/Block.asItem ()Lnet/minecraft/world/item/Item;
      // 6af5: if_acmpeq 6afb
      // 6af8: goto 7441
      // 6afb: aload 9
      // 6afd: instanceof net/minecraft/world/entity/player/Player
      // 6b00: ifne 6b06
      // 6b03: goto 6b35
      // 6b06: aload 9
      // 6b08: checkcast net/minecraft/world/entity/player/Player
      // 6b0b: astore 14
      // 6b0d: new net/minecraft/world/item/ItemStack
      // 6b10: dup
      // 6b11: getstatic net/minecraft/world/level/block/Blocks.WHITE_WOOL Lnet/minecraft/world/level/block/Block;
      // 6b14: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 6b17: astore 15
      // 6b19: aload 14
      // 6b1b: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 6b1e: aload 15
      // 6b20: invokedynamic test (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, net/mocreatures/procedures/UndeadOstrichEquipmentSwapProcedure.lambda$execute$11 (Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z, (Lnet/minecraft/world/item/ItemStack;)Z ]
      // 6b25: bipush 1
      // 6b26: aload 14
      // 6b28: getfield net/minecraft/world/entity/player/Player.inventoryMenu Lnet/minecraft/world/inventory/InventoryMenu;
      // 6b2b: invokevirtual net/minecraft/world/inventory/InventoryMenu.getCraftSlots ()Lnet/minecraft/world/inventory/CraftingContainer;
      // 6b2e: invokevirtual net/minecraft/world/entity/player/Inventory.clearOrCountMatchingItems (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
      // 6b31: pop
      // 6b32: goto 6b35
      // 6b35: aload 8
      // 6b37: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 6b3a: ifne 6b40
      // 6b3d: goto 6b59
      // 6b40: aload 8
      // 6b42: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 6b45: astore 14
      // 6b47: aload 14
      // 6b49: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 6b4c: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_White_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 6b4f: bipush 1
      // 6b50: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 6b53: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 6b56: goto 6b59
      // 6b59: aload 8
      // 6b5b: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 6b5e: ifne 6b64
      // 6b61: goto 6b86
      // 6b64: aload 8
      // 6b66: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 6b69: astore 14
      // 6b6b: aload 14
      // 6b6d: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 6b70: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Green_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 6b73: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 6b76: checkcast java/lang/Boolean
      // 6b79: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 6b7c: ifne 6b82
      // 6b7f: goto 6b86
      // 6b82: bipush 1
      // 6b83: goto 6b87
      // 6b86: bipush 0
      // 6b87: bipush 1
      // 6b88: if_icmpeq 6b8e
      // 6b8b: goto 6bf1
      // 6b8e: aload 1
      // 6b8f: instanceof net/minecraft/server/level/ServerLevel
      // 6b92: ifne 6b98
      // 6b95: goto 6bca
      // 6b98: aload 1
      // 6b99: checkcast net/minecraft/server/level/ServerLevel
      // 6b9c: astore 15
      // 6b9e: new net/minecraft/world/entity/item/ItemEntity
      // 6ba1: dup
      // 6ba2: aload 15
      // 6ba4: dload 2
      // 6ba5: dload 4
      // 6ba7: dload 6
      // 6ba9: new net/minecraft/world/item/ItemStack
      // 6bac: dup
      // 6bad: getstatic net/minecraft/world/level/block/Blocks.GREEN_WOOL Lnet/minecraft/world/level/block/Block;
      // 6bb0: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 6bb3: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6bb6: astore 16
      // 6bb8: aload 16
      // 6bba: bipush 10
      // 6bbc: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 6bbf: aload 15
      // 6bc1: aload 16
      // 6bc3: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 6bc6: pop
      // 6bc7: goto 6bca
      // 6bca: aload 8
      // 6bcc: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 6bcf: ifne 6bd5
      // 6bd2: goto 6bee
      // 6bd5: aload 8
      // 6bd7: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 6bda: astore 15
      // 6bdc: aload 15
      // 6bde: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 6be1: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Green_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 6be4: bipush 0
      // 6be5: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 6be8: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 6beb: goto 6bee
      // 6bee: goto 6bf1
      // 6bf1: aload 8
      // 6bf3: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 6bf6: ifne 6bfc
      // 6bf9: goto 6c1e
      // 6bfc: aload 8
      // 6bfe: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 6c01: astore 14
      // 6c03: aload 14
      // 6c05: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 6c08: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGreen_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 6c0b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 6c0e: checkcast java/lang/Boolean
      // 6c11: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 6c14: ifne 6c1a
      // 6c17: goto 6c1e
      // 6c1a: bipush 1
      // 6c1b: goto 6c1f
      // 6c1e: bipush 0
      // 6c1f: bipush 1
      // 6c20: if_icmpeq 6c26
      // 6c23: goto 6c89
      // 6c26: aload 1
      // 6c27: instanceof net/minecraft/server/level/ServerLevel
      // 6c2a: ifne 6c30
      // 6c2d: goto 6c62
      // 6c30: aload 1
      // 6c31: checkcast net/minecraft/server/level/ServerLevel
      // 6c34: astore 15
      // 6c36: new net/minecraft/world/entity/item/ItemEntity
      // 6c39: dup
      // 6c3a: aload 15
      // 6c3c: dload 2
      // 6c3d: dload 4
      // 6c3f: dload 6
      // 6c41: new net/minecraft/world/item/ItemStack
      // 6c44: dup
      // 6c45: getstatic net/minecraft/world/level/block/Blocks.LIME_WOOL Lnet/minecraft/world/level/block/Block;
      // 6c48: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 6c4b: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6c4e: astore 16
      // 6c50: aload 16
      // 6c52: bipush 10
      // 6c54: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 6c57: aload 15
      // 6c59: aload 16
      // 6c5b: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 6c5e: pop
      // 6c5f: goto 6c62
      // 6c62: aload 8
      // 6c64: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 6c67: ifne 6c6d
      // 6c6a: goto 6c86
      // 6c6d: aload 8
      // 6c6f: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 6c72: astore 15
      // 6c74: aload 15
      // 6c76: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 6c79: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGreen_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 6c7c: bipush 0
      // 6c7d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 6c80: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 6c83: goto 6c86
      // 6c86: goto 6c89
      // 6c89: aload 8
      // 6c8b: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 6c8e: ifne 6c94
      // 6c91: goto 6cb6
      // 6c94: aload 8
      // 6c96: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 6c99: astore 14
      // 6c9b: aload 14
      // 6c9d: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 6ca0: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Blue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 6ca3: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 6ca6: checkcast java/lang/Boolean
      // 6ca9: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 6cac: ifne 6cb2
      // 6caf: goto 6cb6
      // 6cb2: bipush 1
      // 6cb3: goto 6cb7
      // 6cb6: bipush 0
      // 6cb7: bipush 1
      // 6cb8: if_icmpeq 6cbe
      // 6cbb: goto 6d21
      // 6cbe: aload 1
      // 6cbf: instanceof net/minecraft/server/level/ServerLevel
      // 6cc2: ifne 6cc8
      // 6cc5: goto 6cfa
      // 6cc8: aload 1
      // 6cc9: checkcast net/minecraft/server/level/ServerLevel
      // 6ccc: astore 15
      // 6cce: new net/minecraft/world/entity/item/ItemEntity
      // 6cd1: dup
      // 6cd2: aload 15
      // 6cd4: dload 2
      // 6cd5: dload 4
      // 6cd7: dload 6
      // 6cd9: new net/minecraft/world/item/ItemStack
      // 6cdc: dup
      // 6cdd: getstatic net/minecraft/world/level/block/Blocks.BLUE_WOOL Lnet/minecraft/world/level/block/Block;
      // 6ce0: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 6ce3: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6ce6: astore 16
      // 6ce8: aload 16
      // 6cea: bipush 10
      // 6cec: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 6cef: aload 15
      // 6cf1: aload 16
      // 6cf3: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 6cf6: pop
      // 6cf7: goto 6cfa
      // 6cfa: aload 8
      // 6cfc: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 6cff: ifne 6d05
      // 6d02: goto 6d1e
      // 6d05: aload 8
      // 6d07: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 6d0a: astore 15
      // 6d0c: aload 15
      // 6d0e: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 6d11: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Blue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 6d14: bipush 0
      // 6d15: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 6d18: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 6d1b: goto 6d1e
      // 6d1e: goto 6d21
      // 6d21: aload 8
      // 6d23: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 6d26: ifne 6d2c
      // 6d29: goto 6d4e
      // 6d2c: aload 8
      // 6d2e: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 6d31: astore 14
      // 6d33: aload 14
      // 6d35: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 6d38: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightBlue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 6d3b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 6d3e: checkcast java/lang/Boolean
      // 6d41: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 6d44: ifne 6d4a
      // 6d47: goto 6d4e
      // 6d4a: bipush 1
      // 6d4b: goto 6d4f
      // 6d4e: bipush 0
      // 6d4f: bipush 1
      // 6d50: if_icmpeq 6d56
      // 6d53: goto 6db9
      // 6d56: aload 1
      // 6d57: instanceof net/minecraft/server/level/ServerLevel
      // 6d5a: ifne 6d60
      // 6d5d: goto 6d92
      // 6d60: aload 1
      // 6d61: checkcast net/minecraft/server/level/ServerLevel
      // 6d64: astore 15
      // 6d66: new net/minecraft/world/entity/item/ItemEntity
      // 6d69: dup
      // 6d6a: aload 15
      // 6d6c: dload 2
      // 6d6d: dload 4
      // 6d6f: dload 6
      // 6d71: new net/minecraft/world/item/ItemStack
      // 6d74: dup
      // 6d75: getstatic net/minecraft/world/level/block/Blocks.LIGHT_BLUE_WOOL Lnet/minecraft/world/level/block/Block;
      // 6d78: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 6d7b: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6d7e: astore 16
      // 6d80: aload 16
      // 6d82: bipush 10
      // 6d84: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 6d87: aload 15
      // 6d89: aload 16
      // 6d8b: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 6d8e: pop
      // 6d8f: goto 6d92
      // 6d92: aload 8
      // 6d94: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 6d97: ifne 6d9d
      // 6d9a: goto 6db6
      // 6d9d: aload 8
      // 6d9f: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 6da2: astore 15
      // 6da4: aload 15
      // 6da6: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 6da9: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightBlue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 6dac: bipush 0
      // 6dad: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 6db0: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 6db3: goto 6db6
      // 6db6: goto 6db9
      // 6db9: aload 8
      // 6dbb: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 6dbe: ifne 6dc4
      // 6dc1: goto 6de6
      // 6dc4: aload 8
      // 6dc6: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 6dc9: astore 14
      // 6dcb: aload 14
      // 6dcd: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 6dd0: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Pink_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 6dd3: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 6dd6: checkcast java/lang/Boolean
      // 6dd9: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 6ddc: ifne 6de2
      // 6ddf: goto 6de6
      // 6de2: bipush 1
      // 6de3: goto 6de7
      // 6de6: bipush 0
      // 6de7: bipush 1
      // 6de8: if_icmpeq 6dee
      // 6deb: goto 6e51
      // 6dee: aload 1
      // 6def: instanceof net/minecraft/server/level/ServerLevel
      // 6df2: ifne 6df8
      // 6df5: goto 6e2a
      // 6df8: aload 1
      // 6df9: checkcast net/minecraft/server/level/ServerLevel
      // 6dfc: astore 15
      // 6dfe: new net/minecraft/world/entity/item/ItemEntity
      // 6e01: dup
      // 6e02: aload 15
      // 6e04: dload 2
      // 6e05: dload 4
      // 6e07: dload 6
      // 6e09: new net/minecraft/world/item/ItemStack
      // 6e0c: dup
      // 6e0d: getstatic net/minecraft/world/level/block/Blocks.PINK_WOOL Lnet/minecraft/world/level/block/Block;
      // 6e10: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 6e13: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6e16: astore 16
      // 6e18: aload 16
      // 6e1a: bipush 10
      // 6e1c: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 6e1f: aload 15
      // 6e21: aload 16
      // 6e23: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 6e26: pop
      // 6e27: goto 6e2a
      // 6e2a: aload 8
      // 6e2c: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 6e2f: ifne 6e35
      // 6e32: goto 6e4e
      // 6e35: aload 8
      // 6e37: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 6e3a: astore 15
      // 6e3c: aload 15
      // 6e3e: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 6e41: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Pink_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 6e44: bipush 0
      // 6e45: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 6e48: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 6e4b: goto 6e4e
      // 6e4e: goto 6e51
      // 6e51: aload 8
      // 6e53: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 6e56: ifne 6e5c
      // 6e59: goto 6e7e
      // 6e5c: aload 8
      // 6e5e: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 6e61: astore 14
      // 6e63: aload 14
      // 6e65: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 6e68: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Magenta_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 6e6b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 6e6e: checkcast java/lang/Boolean
      // 6e71: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 6e74: ifne 6e7a
      // 6e77: goto 6e7e
      // 6e7a: bipush 1
      // 6e7b: goto 6e7f
      // 6e7e: bipush 0
      // 6e7f: bipush 1
      // 6e80: if_icmpeq 6e86
      // 6e83: goto 6ee9
      // 6e86: aload 1
      // 6e87: instanceof net/minecraft/server/level/ServerLevel
      // 6e8a: ifne 6e90
      // 6e8d: goto 6ec2
      // 6e90: aload 1
      // 6e91: checkcast net/minecraft/server/level/ServerLevel
      // 6e94: astore 15
      // 6e96: new net/minecraft/world/entity/item/ItemEntity
      // 6e99: dup
      // 6e9a: aload 15
      // 6e9c: dload 2
      // 6e9d: dload 4
      // 6e9f: dload 6
      // 6ea1: new net/minecraft/world/item/ItemStack
      // 6ea4: dup
      // 6ea5: getstatic net/minecraft/world/level/block/Blocks.MAGENTA_WOOL Lnet/minecraft/world/level/block/Block;
      // 6ea8: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 6eab: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6eae: astore 16
      // 6eb0: aload 16
      // 6eb2: bipush 10
      // 6eb4: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 6eb7: aload 15
      // 6eb9: aload 16
      // 6ebb: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 6ebe: pop
      // 6ebf: goto 6ec2
      // 6ec2: aload 8
      // 6ec4: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 6ec7: ifne 6ecd
      // 6eca: goto 6ee6
      // 6ecd: aload 8
      // 6ecf: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 6ed2: astore 15
      // 6ed4: aload 15
      // 6ed6: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 6ed9: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Magenta_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 6edc: bipush 0
      // 6edd: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 6ee0: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 6ee3: goto 6ee6
      // 6ee6: goto 6ee9
      // 6ee9: aload 8
      // 6eeb: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 6eee: ifne 6ef4
      // 6ef1: goto 6f16
      // 6ef4: aload 8
      // 6ef6: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 6ef9: astore 14
      // 6efb: aload 14
      // 6efd: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 6f00: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Purple_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 6f03: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 6f06: checkcast java/lang/Boolean
      // 6f09: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 6f0c: ifne 6f12
      // 6f0f: goto 6f16
      // 6f12: bipush 1
      // 6f13: goto 6f17
      // 6f16: bipush 0
      // 6f17: bipush 1
      // 6f18: if_icmpeq 6f1e
      // 6f1b: goto 6f81
      // 6f1e: aload 1
      // 6f1f: instanceof net/minecraft/server/level/ServerLevel
      // 6f22: ifne 6f28
      // 6f25: goto 6f5a
      // 6f28: aload 1
      // 6f29: checkcast net/minecraft/server/level/ServerLevel
      // 6f2c: astore 15
      // 6f2e: new net/minecraft/world/entity/item/ItemEntity
      // 6f31: dup
      // 6f32: aload 15
      // 6f34: dload 2
      // 6f35: dload 4
      // 6f37: dload 6
      // 6f39: new net/minecraft/world/item/ItemStack
      // 6f3c: dup
      // 6f3d: getstatic net/minecraft/world/level/block/Blocks.PURPLE_WOOL Lnet/minecraft/world/level/block/Block;
      // 6f40: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 6f43: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6f46: astore 16
      // 6f48: aload 16
      // 6f4a: bipush 10
      // 6f4c: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 6f4f: aload 15
      // 6f51: aload 16
      // 6f53: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 6f56: pop
      // 6f57: goto 6f5a
      // 6f5a: aload 8
      // 6f5c: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 6f5f: ifne 6f65
      // 6f62: goto 6f7e
      // 6f65: aload 8
      // 6f67: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 6f6a: astore 15
      // 6f6c: aload 15
      // 6f6e: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 6f71: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Purple_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 6f74: bipush 0
      // 6f75: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 6f78: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 6f7b: goto 6f7e
      // 6f7e: goto 6f81
      // 6f81: aload 8
      // 6f83: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 6f86: ifne 6f8c
      // 6f89: goto 6fae
      // 6f8c: aload 8
      // 6f8e: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 6f91: astore 14
      // 6f93: aload 14
      // 6f95: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 6f98: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Orange_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 6f9b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 6f9e: checkcast java/lang/Boolean
      // 6fa1: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 6fa4: ifne 6faa
      // 6fa7: goto 6fae
      // 6faa: bipush 1
      // 6fab: goto 6faf
      // 6fae: bipush 0
      // 6faf: bipush 1
      // 6fb0: if_icmpeq 6fb6
      // 6fb3: goto 7019
      // 6fb6: aload 1
      // 6fb7: instanceof net/minecraft/server/level/ServerLevel
      // 6fba: ifne 6fc0
      // 6fbd: goto 6ff2
      // 6fc0: aload 1
      // 6fc1: checkcast net/minecraft/server/level/ServerLevel
      // 6fc4: astore 15
      // 6fc6: new net/minecraft/world/entity/item/ItemEntity
      // 6fc9: dup
      // 6fca: aload 15
      // 6fcc: dload 2
      // 6fcd: dload 4
      // 6fcf: dload 6
      // 6fd1: new net/minecraft/world/item/ItemStack
      // 6fd4: dup
      // 6fd5: getstatic net/minecraft/world/level/block/Blocks.ORANGE_WOOL Lnet/minecraft/world/level/block/Block;
      // 6fd8: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 6fdb: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6fde: astore 16
      // 6fe0: aload 16
      // 6fe2: bipush 10
      // 6fe4: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 6fe7: aload 15
      // 6fe9: aload 16
      // 6feb: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 6fee: pop
      // 6fef: goto 6ff2
      // 6ff2: aload 8
      // 6ff4: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 6ff7: ifne 6ffd
      // 6ffa: goto 7016
      // 6ffd: aload 8
      // 6fff: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 7002: astore 15
      // 7004: aload 15
      // 7006: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7009: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Orange_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 700c: bipush 0
      // 700d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 7010: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 7013: goto 7016
      // 7016: goto 7019
      // 7019: aload 8
      // 701b: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 701e: ifne 7024
      // 7021: goto 7046
      // 7024: aload 8
      // 7026: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 7029: astore 14
      // 702b: aload 14
      // 702d: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7030: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Cyan_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 7033: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 7036: checkcast java/lang/Boolean
      // 7039: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 703c: ifne 7042
      // 703f: goto 7046
      // 7042: bipush 1
      // 7043: goto 7047
      // 7046: bipush 0
      // 7047: bipush 1
      // 7048: if_icmpeq 704e
      // 704b: goto 70b1
      // 704e: aload 1
      // 704f: instanceof net/minecraft/server/level/ServerLevel
      // 7052: ifne 7058
      // 7055: goto 708a
      // 7058: aload 1
      // 7059: checkcast net/minecraft/server/level/ServerLevel
      // 705c: astore 15
      // 705e: new net/minecraft/world/entity/item/ItemEntity
      // 7061: dup
      // 7062: aload 15
      // 7064: dload 2
      // 7065: dload 4
      // 7067: dload 6
      // 7069: new net/minecraft/world/item/ItemStack
      // 706c: dup
      // 706d: getstatic net/minecraft/world/level/block/Blocks.CYAN_WOOL Lnet/minecraft/world/level/block/Block;
      // 7070: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 7073: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 7076: astore 16
      // 7078: aload 16
      // 707a: bipush 10
      // 707c: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 707f: aload 15
      // 7081: aload 16
      // 7083: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 7086: pop
      // 7087: goto 708a
      // 708a: aload 8
      // 708c: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 708f: ifne 7095
      // 7092: goto 70ae
      // 7095: aload 8
      // 7097: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 709a: astore 15
      // 709c: aload 15
      // 709e: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 70a1: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Cyan_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 70a4: bipush 0
      // 70a5: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 70a8: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 70ab: goto 70ae
      // 70ae: goto 70b1
      // 70b1: aload 8
      // 70b3: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 70b6: ifne 70bc
      // 70b9: goto 70de
      // 70bc: aload 8
      // 70be: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 70c1: astore 14
      // 70c3: aload 14
      // 70c5: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 70c8: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Red_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 70cb: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 70ce: checkcast java/lang/Boolean
      // 70d1: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 70d4: ifne 70da
      // 70d7: goto 70de
      // 70da: bipush 1
      // 70db: goto 70df
      // 70de: bipush 0
      // 70df: bipush 1
      // 70e0: if_icmpeq 70e6
      // 70e3: goto 7149
      // 70e6: aload 1
      // 70e7: instanceof net/minecraft/server/level/ServerLevel
      // 70ea: ifne 70f0
      // 70ed: goto 7122
      // 70f0: aload 1
      // 70f1: checkcast net/minecraft/server/level/ServerLevel
      // 70f4: astore 15
      // 70f6: new net/minecraft/world/entity/item/ItemEntity
      // 70f9: dup
      // 70fa: aload 15
      // 70fc: dload 2
      // 70fd: dload 4
      // 70ff: dload 6
      // 7101: new net/minecraft/world/item/ItemStack
      // 7104: dup
      // 7105: getstatic net/minecraft/world/level/block/Blocks.RED_WOOL Lnet/minecraft/world/level/block/Block;
      // 7108: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 710b: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 710e: astore 16
      // 7110: aload 16
      // 7112: bipush 10
      // 7114: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 7117: aload 15
      // 7119: aload 16
      // 711b: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 711e: pop
      // 711f: goto 7122
      // 7122: aload 8
      // 7124: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 7127: ifne 712d
      // 712a: goto 7146
      // 712d: aload 8
      // 712f: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 7132: astore 15
      // 7134: aload 15
      // 7136: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7139: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Red_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 713c: bipush 0
      // 713d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 7140: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 7143: goto 7146
      // 7146: goto 7149
      // 7149: aload 8
      // 714b: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 714e: ifne 7154
      // 7151: goto 7176
      // 7154: aload 8
      // 7156: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 7159: astore 14
      // 715b: aload 14
      // 715d: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7160: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Yellow_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 7163: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 7166: checkcast java/lang/Boolean
      // 7169: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 716c: ifne 7172
      // 716f: goto 7176
      // 7172: bipush 1
      // 7173: goto 7177
      // 7176: bipush 0
      // 7177: bipush 1
      // 7178: if_icmpeq 717e
      // 717b: goto 71e1
      // 717e: aload 1
      // 717f: instanceof net/minecraft/server/level/ServerLevel
      // 7182: ifne 7188
      // 7185: goto 71ba
      // 7188: aload 1
      // 7189: checkcast net/minecraft/server/level/ServerLevel
      // 718c: astore 15
      // 718e: new net/minecraft/world/entity/item/ItemEntity
      // 7191: dup
      // 7192: aload 15
      // 7194: dload 2
      // 7195: dload 4
      // 7197: dload 6
      // 7199: new net/minecraft/world/item/ItemStack
      // 719c: dup
      // 719d: getstatic net/minecraft/world/level/block/Blocks.YELLOW_WOOL Lnet/minecraft/world/level/block/Block;
      // 71a0: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 71a3: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 71a6: astore 16
      // 71a8: aload 16
      // 71aa: bipush 10
      // 71ac: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 71af: aload 15
      // 71b1: aload 16
      // 71b3: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 71b6: pop
      // 71b7: goto 71ba
      // 71ba: aload 8
      // 71bc: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 71bf: ifne 71c5
      // 71c2: goto 71de
      // 71c5: aload 8
      // 71c7: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 71ca: astore 15
      // 71cc: aload 15
      // 71ce: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 71d1: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Yellow_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 71d4: bipush 0
      // 71d5: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 71d8: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 71db: goto 71de
      // 71de: goto 71e1
      // 71e1: aload 8
      // 71e3: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 71e6: ifne 71ec
      // 71e9: goto 720e
      // 71ec: aload 8
      // 71ee: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 71f1: astore 14
      // 71f3: aload 14
      // 71f5: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 71f8: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Grey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 71fb: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 71fe: checkcast java/lang/Boolean
      // 7201: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 7204: ifne 720a
      // 7207: goto 720e
      // 720a: bipush 1
      // 720b: goto 720f
      // 720e: bipush 0
      // 720f: bipush 1
      // 7210: if_icmpeq 7216
      // 7213: goto 7279
      // 7216: aload 1
      // 7217: instanceof net/minecraft/server/level/ServerLevel
      // 721a: ifne 7220
      // 721d: goto 7252
      // 7220: aload 1
      // 7221: checkcast net/minecraft/server/level/ServerLevel
      // 7224: astore 15
      // 7226: new net/minecraft/world/entity/item/ItemEntity
      // 7229: dup
      // 722a: aload 15
      // 722c: dload 2
      // 722d: dload 4
      // 722f: dload 6
      // 7231: new net/minecraft/world/item/ItemStack
      // 7234: dup
      // 7235: getstatic net/minecraft/world/level/block/Blocks.GRAY_WOOL Lnet/minecraft/world/level/block/Block;
      // 7238: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 723b: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 723e: astore 16
      // 7240: aload 16
      // 7242: bipush 10
      // 7244: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 7247: aload 15
      // 7249: aload 16
      // 724b: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 724e: pop
      // 724f: goto 7252
      // 7252: aload 8
      // 7254: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 7257: ifne 725d
      // 725a: goto 7276
      // 725d: aload 8
      // 725f: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 7262: astore 15
      // 7264: aload 15
      // 7266: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7269: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Grey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 726c: bipush 0
      // 726d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 7270: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 7273: goto 7276
      // 7276: goto 7279
      // 7279: aload 8
      // 727b: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 727e: ifne 7284
      // 7281: goto 72a6
      // 7284: aload 8
      // 7286: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 7289: astore 14
      // 728b: aload 14
      // 728d: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7290: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGrey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 7293: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 7296: checkcast java/lang/Boolean
      // 7299: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 729c: ifne 72a2
      // 729f: goto 72a6
      // 72a2: bipush 1
      // 72a3: goto 72a7
      // 72a6: bipush 0
      // 72a7: bipush 1
      // 72a8: if_icmpeq 72ae
      // 72ab: goto 7311
      // 72ae: aload 1
      // 72af: instanceof net/minecraft/server/level/ServerLevel
      // 72b2: ifne 72b8
      // 72b5: goto 72ea
      // 72b8: aload 1
      // 72b9: checkcast net/minecraft/server/level/ServerLevel
      // 72bc: astore 15
      // 72be: new net/minecraft/world/entity/item/ItemEntity
      // 72c1: dup
      // 72c2: aload 15
      // 72c4: dload 2
      // 72c5: dload 4
      // 72c7: dload 6
      // 72c9: new net/minecraft/world/item/ItemStack
      // 72cc: dup
      // 72cd: getstatic net/minecraft/world/level/block/Blocks.LIGHT_GRAY_WOOL Lnet/minecraft/world/level/block/Block;
      // 72d0: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 72d3: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 72d6: astore 16
      // 72d8: aload 16
      // 72da: bipush 10
      // 72dc: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 72df: aload 15
      // 72e1: aload 16
      // 72e3: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 72e6: pop
      // 72e7: goto 72ea
      // 72ea: aload 8
      // 72ec: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 72ef: ifne 72f5
      // 72f2: goto 730e
      // 72f5: aload 8
      // 72f7: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 72fa: astore 15
      // 72fc: aload 15
      // 72fe: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7301: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGrey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 7304: bipush 0
      // 7305: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 7308: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 730b: goto 730e
      // 730e: goto 7311
      // 7311: aload 8
      // 7313: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 7316: ifne 731c
      // 7319: goto 733e
      // 731c: aload 8
      // 731e: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 7321: astore 14
      // 7323: aload 14
      // 7325: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7328: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Black_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 732b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 732e: checkcast java/lang/Boolean
      // 7331: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 7334: ifne 733a
      // 7337: goto 733e
      // 733a: bipush 1
      // 733b: goto 733f
      // 733e: bipush 0
      // 733f: bipush 1
      // 7340: if_icmpeq 7346
      // 7343: goto 73a9
      // 7346: aload 1
      // 7347: instanceof net/minecraft/server/level/ServerLevel
      // 734a: ifne 7350
      // 734d: goto 7382
      // 7350: aload 1
      // 7351: checkcast net/minecraft/server/level/ServerLevel
      // 7354: astore 15
      // 7356: new net/minecraft/world/entity/item/ItemEntity
      // 7359: dup
      // 735a: aload 15
      // 735c: dload 2
      // 735d: dload 4
      // 735f: dload 6
      // 7361: new net/minecraft/world/item/ItemStack
      // 7364: dup
      // 7365: getstatic net/minecraft/world/level/block/Blocks.BLACK_WOOL Lnet/minecraft/world/level/block/Block;
      // 7368: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 736b: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 736e: astore 16
      // 7370: aload 16
      // 7372: bipush 10
      // 7374: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 7377: aload 15
      // 7379: aload 16
      // 737b: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 737e: pop
      // 737f: goto 7382
      // 7382: aload 8
      // 7384: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 7387: ifne 738d
      // 738a: goto 73a6
      // 738d: aload 8
      // 738f: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 7392: astore 15
      // 7394: aload 15
      // 7396: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7399: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Black_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 739c: bipush 0
      // 739d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 73a0: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 73a3: goto 73a6
      // 73a6: goto 73a9
      // 73a9: aload 8
      // 73ab: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 73ae: ifne 73b4
      // 73b1: goto 73d6
      // 73b4: aload 8
      // 73b6: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 73b9: astore 14
      // 73bb: aload 14
      // 73bd: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 73c0: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Brown_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 73c3: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 73c6: checkcast java/lang/Boolean
      // 73c9: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 73cc: ifne 73d2
      // 73cf: goto 73d6
      // 73d2: bipush 1
      // 73d3: goto 73d7
      // 73d6: bipush 0
      // 73d7: bipush 1
      // 73d8: if_icmpeq 73de
      // 73db: goto 7441
      // 73de: aload 1
      // 73df: instanceof net/minecraft/server/level/ServerLevel
      // 73e2: ifne 73e8
      // 73e5: goto 741a
      // 73e8: aload 1
      // 73e9: checkcast net/minecraft/server/level/ServerLevel
      // 73ec: astore 15
      // 73ee: new net/minecraft/world/entity/item/ItemEntity
      // 73f1: dup
      // 73f2: aload 15
      // 73f4: dload 2
      // 73f5: dload 4
      // 73f7: dload 6
      // 73f9: new net/minecraft/world/item/ItemStack
      // 73fc: dup
      // 73fd: getstatic net/minecraft/world/level/block/Blocks.BROWN_WOOL Lnet/minecraft/world/level/block/Block;
      // 7400: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 7403: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 7406: astore 16
      // 7408: aload 16
      // 740a: bipush 10
      // 740c: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 740f: aload 15
      // 7411: aload 16
      // 7413: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 7416: pop
      // 7417: goto 741a
      // 741a: aload 8
      // 741c: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 741f: ifne 7425
      // 7422: goto 743e
      // 7425: aload 8
      // 7427: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 742a: astore 15
      // 742c: aload 15
      // 742e: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7431: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Brown_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 7434: bipush 0
      // 7435: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 7438: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 743b: goto 743e
      // 743e: goto 7441
      // 7441: aload 8
      // 7443: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 7446: ifne 744c
      // 7449: goto 746e
      // 744c: aload 8
      // 744e: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 7451: astore 12
      // 7453: aload 12
      // 7455: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7458: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Grey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 745b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 745e: checkcast java/lang/Boolean
      // 7461: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 7464: ifne 746a
      // 7467: goto 746e
      // 746a: bipush 1
      // 746b: goto 746f
      // 746e: bipush 0
      // 746f: ifeq 7475
      // 7472: goto 7de7
      // 7475: aload 9
      // 7477: instanceof net/minecraft/world/entity/LivingEntity
      // 747a: ifne 7480
      // 747d: goto 748f
      // 7480: aload 9
      // 7482: checkcast net/minecraft/world/entity/LivingEntity
      // 7485: astore 13
      // 7487: aload 13
      // 7489: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 748c: goto 7492
      // 748f: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 7492: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 7495: getstatic net/minecraft/world/level/block/Blocks.GRAY_WOOL Lnet/minecraft/world/level/block/Block;
      // 7498: invokevirtual net/minecraft/world/level/block/Block.asItem ()Lnet/minecraft/world/item/Item;
      // 749b: if_acmpeq 74a1
      // 749e: goto 7de7
      // 74a1: aload 9
      // 74a3: instanceof net/minecraft/world/entity/player/Player
      // 74a6: ifne 74ac
      // 74a9: goto 74db
      // 74ac: aload 9
      // 74ae: checkcast net/minecraft/world/entity/player/Player
      // 74b1: astore 14
      // 74b3: new net/minecraft/world/item/ItemStack
      // 74b6: dup
      // 74b7: getstatic net/minecraft/world/level/block/Blocks.GRAY_WOOL Lnet/minecraft/world/level/block/Block;
      // 74ba: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 74bd: astore 15
      // 74bf: aload 14
      // 74c1: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 74c4: aload 15
      // 74c6: invokedynamic test (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, net/mocreatures/procedures/UndeadOstrichEquipmentSwapProcedure.lambda$execute$12 (Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z, (Lnet/minecraft/world/item/ItemStack;)Z ]
      // 74cb: bipush 1
      // 74cc: aload 14
      // 74ce: getfield net/minecraft/world/entity/player/Player.inventoryMenu Lnet/minecraft/world/inventory/InventoryMenu;
      // 74d1: invokevirtual net/minecraft/world/inventory/InventoryMenu.getCraftSlots ()Lnet/minecraft/world/inventory/CraftingContainer;
      // 74d4: invokevirtual net/minecraft/world/entity/player/Inventory.clearOrCountMatchingItems (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
      // 74d7: pop
      // 74d8: goto 74db
      // 74db: aload 8
      // 74dd: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 74e0: ifne 74e6
      // 74e3: goto 74ff
      // 74e6: aload 8
      // 74e8: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 74eb: astore 14
      // 74ed: aload 14
      // 74ef: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 74f2: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Grey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 74f5: bipush 1
      // 74f6: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 74f9: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 74fc: goto 74ff
      // 74ff: aload 8
      // 7501: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 7504: ifne 750a
      // 7507: goto 752c
      // 750a: aload 8
      // 750c: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 750f: astore 14
      // 7511: aload 14
      // 7513: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7516: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Green_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 7519: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 751c: checkcast java/lang/Boolean
      // 751f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 7522: ifne 7528
      // 7525: goto 752c
      // 7528: bipush 1
      // 7529: goto 752d
      // 752c: bipush 0
      // 752d: bipush 1
      // 752e: if_icmpeq 7534
      // 7531: goto 7597
      // 7534: aload 1
      // 7535: instanceof net/minecraft/server/level/ServerLevel
      // 7538: ifne 753e
      // 753b: goto 7570
      // 753e: aload 1
      // 753f: checkcast net/minecraft/server/level/ServerLevel
      // 7542: astore 15
      // 7544: new net/minecraft/world/entity/item/ItemEntity
      // 7547: dup
      // 7548: aload 15
      // 754a: dload 2
      // 754b: dload 4
      // 754d: dload 6
      // 754f: new net/minecraft/world/item/ItemStack
      // 7552: dup
      // 7553: getstatic net/minecraft/world/level/block/Blocks.GREEN_WOOL Lnet/minecraft/world/level/block/Block;
      // 7556: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 7559: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 755c: astore 16
      // 755e: aload 16
      // 7560: bipush 10
      // 7562: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 7565: aload 15
      // 7567: aload 16
      // 7569: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 756c: pop
      // 756d: goto 7570
      // 7570: aload 8
      // 7572: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 7575: ifne 757b
      // 7578: goto 7594
      // 757b: aload 8
      // 757d: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 7580: astore 15
      // 7582: aload 15
      // 7584: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7587: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Green_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 758a: bipush 0
      // 758b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 758e: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 7591: goto 7594
      // 7594: goto 7597
      // 7597: aload 8
      // 7599: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 759c: ifne 75a2
      // 759f: goto 75c4
      // 75a2: aload 8
      // 75a4: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 75a7: astore 14
      // 75a9: aload 14
      // 75ab: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 75ae: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGreen_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 75b1: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 75b4: checkcast java/lang/Boolean
      // 75b7: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 75ba: ifne 75c0
      // 75bd: goto 75c4
      // 75c0: bipush 1
      // 75c1: goto 75c5
      // 75c4: bipush 0
      // 75c5: bipush 1
      // 75c6: if_icmpeq 75cc
      // 75c9: goto 762f
      // 75cc: aload 1
      // 75cd: instanceof net/minecraft/server/level/ServerLevel
      // 75d0: ifne 75d6
      // 75d3: goto 7608
      // 75d6: aload 1
      // 75d7: checkcast net/minecraft/server/level/ServerLevel
      // 75da: astore 15
      // 75dc: new net/minecraft/world/entity/item/ItemEntity
      // 75df: dup
      // 75e0: aload 15
      // 75e2: dload 2
      // 75e3: dload 4
      // 75e5: dload 6
      // 75e7: new net/minecraft/world/item/ItemStack
      // 75ea: dup
      // 75eb: getstatic net/minecraft/world/level/block/Blocks.LIME_WOOL Lnet/minecraft/world/level/block/Block;
      // 75ee: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 75f1: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 75f4: astore 16
      // 75f6: aload 16
      // 75f8: bipush 10
      // 75fa: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 75fd: aload 15
      // 75ff: aload 16
      // 7601: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 7604: pop
      // 7605: goto 7608
      // 7608: aload 8
      // 760a: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 760d: ifne 7613
      // 7610: goto 762c
      // 7613: aload 8
      // 7615: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 7618: astore 15
      // 761a: aload 15
      // 761c: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 761f: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGreen_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 7622: bipush 0
      // 7623: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 7626: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 7629: goto 762c
      // 762c: goto 762f
      // 762f: aload 8
      // 7631: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 7634: ifne 763a
      // 7637: goto 765c
      // 763a: aload 8
      // 763c: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 763f: astore 14
      // 7641: aload 14
      // 7643: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7646: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Blue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 7649: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 764c: checkcast java/lang/Boolean
      // 764f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 7652: ifne 7658
      // 7655: goto 765c
      // 7658: bipush 1
      // 7659: goto 765d
      // 765c: bipush 0
      // 765d: bipush 1
      // 765e: if_icmpeq 7664
      // 7661: goto 76c7
      // 7664: aload 1
      // 7665: instanceof net/minecraft/server/level/ServerLevel
      // 7668: ifne 766e
      // 766b: goto 76a0
      // 766e: aload 1
      // 766f: checkcast net/minecraft/server/level/ServerLevel
      // 7672: astore 15
      // 7674: new net/minecraft/world/entity/item/ItemEntity
      // 7677: dup
      // 7678: aload 15
      // 767a: dload 2
      // 767b: dload 4
      // 767d: dload 6
      // 767f: new net/minecraft/world/item/ItemStack
      // 7682: dup
      // 7683: getstatic net/minecraft/world/level/block/Blocks.BLUE_WOOL Lnet/minecraft/world/level/block/Block;
      // 7686: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 7689: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 768c: astore 16
      // 768e: aload 16
      // 7690: bipush 10
      // 7692: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 7695: aload 15
      // 7697: aload 16
      // 7699: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 769c: pop
      // 769d: goto 76a0
      // 76a0: aload 8
      // 76a2: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 76a5: ifne 76ab
      // 76a8: goto 76c4
      // 76ab: aload 8
      // 76ad: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 76b0: astore 15
      // 76b2: aload 15
      // 76b4: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 76b7: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Blue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 76ba: bipush 0
      // 76bb: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 76be: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 76c1: goto 76c4
      // 76c4: goto 76c7
      // 76c7: aload 8
      // 76c9: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 76cc: ifne 76d2
      // 76cf: goto 76f4
      // 76d2: aload 8
      // 76d4: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 76d7: astore 14
      // 76d9: aload 14
      // 76db: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 76de: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightBlue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 76e1: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 76e4: checkcast java/lang/Boolean
      // 76e7: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 76ea: ifne 76f0
      // 76ed: goto 76f4
      // 76f0: bipush 1
      // 76f1: goto 76f5
      // 76f4: bipush 0
      // 76f5: bipush 1
      // 76f6: if_icmpeq 76fc
      // 76f9: goto 775f
      // 76fc: aload 1
      // 76fd: instanceof net/minecraft/server/level/ServerLevel
      // 7700: ifne 7706
      // 7703: goto 7738
      // 7706: aload 1
      // 7707: checkcast net/minecraft/server/level/ServerLevel
      // 770a: astore 15
      // 770c: new net/minecraft/world/entity/item/ItemEntity
      // 770f: dup
      // 7710: aload 15
      // 7712: dload 2
      // 7713: dload 4
      // 7715: dload 6
      // 7717: new net/minecraft/world/item/ItemStack
      // 771a: dup
      // 771b: getstatic net/minecraft/world/level/block/Blocks.LIGHT_BLUE_WOOL Lnet/minecraft/world/level/block/Block;
      // 771e: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 7721: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 7724: astore 16
      // 7726: aload 16
      // 7728: bipush 10
      // 772a: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 772d: aload 15
      // 772f: aload 16
      // 7731: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 7734: pop
      // 7735: goto 7738
      // 7738: aload 8
      // 773a: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 773d: ifne 7743
      // 7740: goto 775c
      // 7743: aload 8
      // 7745: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 7748: astore 15
      // 774a: aload 15
      // 774c: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 774f: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightBlue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 7752: bipush 0
      // 7753: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 7756: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 7759: goto 775c
      // 775c: goto 775f
      // 775f: aload 8
      // 7761: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 7764: ifne 776a
      // 7767: goto 778c
      // 776a: aload 8
      // 776c: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 776f: astore 14
      // 7771: aload 14
      // 7773: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7776: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Pink_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 7779: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 777c: checkcast java/lang/Boolean
      // 777f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 7782: ifne 7788
      // 7785: goto 778c
      // 7788: bipush 1
      // 7789: goto 778d
      // 778c: bipush 0
      // 778d: bipush 1
      // 778e: if_icmpeq 7794
      // 7791: goto 77f7
      // 7794: aload 1
      // 7795: instanceof net/minecraft/server/level/ServerLevel
      // 7798: ifne 779e
      // 779b: goto 77d0
      // 779e: aload 1
      // 779f: checkcast net/minecraft/server/level/ServerLevel
      // 77a2: astore 15
      // 77a4: new net/minecraft/world/entity/item/ItemEntity
      // 77a7: dup
      // 77a8: aload 15
      // 77aa: dload 2
      // 77ab: dload 4
      // 77ad: dload 6
      // 77af: new net/minecraft/world/item/ItemStack
      // 77b2: dup
      // 77b3: getstatic net/minecraft/world/level/block/Blocks.PINK_WOOL Lnet/minecraft/world/level/block/Block;
      // 77b6: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 77b9: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 77bc: astore 16
      // 77be: aload 16
      // 77c0: bipush 10
      // 77c2: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 77c5: aload 15
      // 77c7: aload 16
      // 77c9: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 77cc: pop
      // 77cd: goto 77d0
      // 77d0: aload 8
      // 77d2: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 77d5: ifne 77db
      // 77d8: goto 77f4
      // 77db: aload 8
      // 77dd: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 77e0: astore 15
      // 77e2: aload 15
      // 77e4: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 77e7: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Pink_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 77ea: bipush 0
      // 77eb: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 77ee: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 77f1: goto 77f4
      // 77f4: goto 77f7
      // 77f7: aload 8
      // 77f9: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 77fc: ifne 7802
      // 77ff: goto 7824
      // 7802: aload 8
      // 7804: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 7807: astore 14
      // 7809: aload 14
      // 780b: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 780e: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Magenta_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 7811: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 7814: checkcast java/lang/Boolean
      // 7817: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 781a: ifne 7820
      // 781d: goto 7824
      // 7820: bipush 1
      // 7821: goto 7825
      // 7824: bipush 0
      // 7825: bipush 1
      // 7826: if_icmpeq 782c
      // 7829: goto 788f
      // 782c: aload 1
      // 782d: instanceof net/minecraft/server/level/ServerLevel
      // 7830: ifne 7836
      // 7833: goto 7868
      // 7836: aload 1
      // 7837: checkcast net/minecraft/server/level/ServerLevel
      // 783a: astore 15
      // 783c: new net/minecraft/world/entity/item/ItemEntity
      // 783f: dup
      // 7840: aload 15
      // 7842: dload 2
      // 7843: dload 4
      // 7845: dload 6
      // 7847: new net/minecraft/world/item/ItemStack
      // 784a: dup
      // 784b: getstatic net/minecraft/world/level/block/Blocks.MAGENTA_WOOL Lnet/minecraft/world/level/block/Block;
      // 784e: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 7851: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 7854: astore 16
      // 7856: aload 16
      // 7858: bipush 10
      // 785a: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 785d: aload 15
      // 785f: aload 16
      // 7861: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 7864: pop
      // 7865: goto 7868
      // 7868: aload 8
      // 786a: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 786d: ifne 7873
      // 7870: goto 788c
      // 7873: aload 8
      // 7875: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 7878: astore 15
      // 787a: aload 15
      // 787c: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 787f: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Magenta_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 7882: bipush 0
      // 7883: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 7886: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 7889: goto 788c
      // 788c: goto 788f
      // 788f: aload 8
      // 7891: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 7894: ifne 789a
      // 7897: goto 78bc
      // 789a: aload 8
      // 789c: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 789f: astore 14
      // 78a1: aload 14
      // 78a3: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 78a6: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Purple_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 78a9: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 78ac: checkcast java/lang/Boolean
      // 78af: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 78b2: ifne 78b8
      // 78b5: goto 78bc
      // 78b8: bipush 1
      // 78b9: goto 78bd
      // 78bc: bipush 0
      // 78bd: bipush 1
      // 78be: if_icmpeq 78c4
      // 78c1: goto 7927
      // 78c4: aload 1
      // 78c5: instanceof net/minecraft/server/level/ServerLevel
      // 78c8: ifne 78ce
      // 78cb: goto 7900
      // 78ce: aload 1
      // 78cf: checkcast net/minecraft/server/level/ServerLevel
      // 78d2: astore 15
      // 78d4: new net/minecraft/world/entity/item/ItemEntity
      // 78d7: dup
      // 78d8: aload 15
      // 78da: dload 2
      // 78db: dload 4
      // 78dd: dload 6
      // 78df: new net/minecraft/world/item/ItemStack
      // 78e2: dup
      // 78e3: getstatic net/minecraft/world/level/block/Blocks.PURPLE_WOOL Lnet/minecraft/world/level/block/Block;
      // 78e6: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 78e9: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 78ec: astore 16
      // 78ee: aload 16
      // 78f0: bipush 10
      // 78f2: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 78f5: aload 15
      // 78f7: aload 16
      // 78f9: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 78fc: pop
      // 78fd: goto 7900
      // 7900: aload 8
      // 7902: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 7905: ifne 790b
      // 7908: goto 7924
      // 790b: aload 8
      // 790d: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 7910: astore 15
      // 7912: aload 15
      // 7914: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7917: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Purple_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 791a: bipush 0
      // 791b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 791e: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 7921: goto 7924
      // 7924: goto 7927
      // 7927: aload 8
      // 7929: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 792c: ifne 7932
      // 792f: goto 7954
      // 7932: aload 8
      // 7934: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 7937: astore 14
      // 7939: aload 14
      // 793b: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 793e: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Orange_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 7941: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 7944: checkcast java/lang/Boolean
      // 7947: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 794a: ifne 7950
      // 794d: goto 7954
      // 7950: bipush 1
      // 7951: goto 7955
      // 7954: bipush 0
      // 7955: bipush 1
      // 7956: if_icmpeq 795c
      // 7959: goto 79bf
      // 795c: aload 1
      // 795d: instanceof net/minecraft/server/level/ServerLevel
      // 7960: ifne 7966
      // 7963: goto 7998
      // 7966: aload 1
      // 7967: checkcast net/minecraft/server/level/ServerLevel
      // 796a: astore 15
      // 796c: new net/minecraft/world/entity/item/ItemEntity
      // 796f: dup
      // 7970: aload 15
      // 7972: dload 2
      // 7973: dload 4
      // 7975: dload 6
      // 7977: new net/minecraft/world/item/ItemStack
      // 797a: dup
      // 797b: getstatic net/minecraft/world/level/block/Blocks.ORANGE_WOOL Lnet/minecraft/world/level/block/Block;
      // 797e: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 7981: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 7984: astore 16
      // 7986: aload 16
      // 7988: bipush 10
      // 798a: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 798d: aload 15
      // 798f: aload 16
      // 7991: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 7994: pop
      // 7995: goto 7998
      // 7998: aload 8
      // 799a: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 799d: ifne 79a3
      // 79a0: goto 79bc
      // 79a3: aload 8
      // 79a5: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 79a8: astore 15
      // 79aa: aload 15
      // 79ac: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 79af: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Orange_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 79b2: bipush 0
      // 79b3: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 79b6: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 79b9: goto 79bc
      // 79bc: goto 79bf
      // 79bf: aload 8
      // 79c1: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 79c4: ifne 79ca
      // 79c7: goto 79ec
      // 79ca: aload 8
      // 79cc: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 79cf: astore 14
      // 79d1: aload 14
      // 79d3: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 79d6: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Cyan_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 79d9: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 79dc: checkcast java/lang/Boolean
      // 79df: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 79e2: ifne 79e8
      // 79e5: goto 79ec
      // 79e8: bipush 1
      // 79e9: goto 79ed
      // 79ec: bipush 0
      // 79ed: bipush 1
      // 79ee: if_icmpeq 79f4
      // 79f1: goto 7a57
      // 79f4: aload 1
      // 79f5: instanceof net/minecraft/server/level/ServerLevel
      // 79f8: ifne 79fe
      // 79fb: goto 7a30
      // 79fe: aload 1
      // 79ff: checkcast net/minecraft/server/level/ServerLevel
      // 7a02: astore 15
      // 7a04: new net/minecraft/world/entity/item/ItemEntity
      // 7a07: dup
      // 7a08: aload 15
      // 7a0a: dload 2
      // 7a0b: dload 4
      // 7a0d: dload 6
      // 7a0f: new net/minecraft/world/item/ItemStack
      // 7a12: dup
      // 7a13: getstatic net/minecraft/world/level/block/Blocks.CYAN_WOOL Lnet/minecraft/world/level/block/Block;
      // 7a16: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 7a19: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 7a1c: astore 16
      // 7a1e: aload 16
      // 7a20: bipush 10
      // 7a22: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 7a25: aload 15
      // 7a27: aload 16
      // 7a29: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 7a2c: pop
      // 7a2d: goto 7a30
      // 7a30: aload 8
      // 7a32: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 7a35: ifne 7a3b
      // 7a38: goto 7a54
      // 7a3b: aload 8
      // 7a3d: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 7a40: astore 15
      // 7a42: aload 15
      // 7a44: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7a47: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Cyan_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 7a4a: bipush 0
      // 7a4b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 7a4e: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 7a51: goto 7a54
      // 7a54: goto 7a57
      // 7a57: aload 8
      // 7a59: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 7a5c: ifne 7a62
      // 7a5f: goto 7a84
      // 7a62: aload 8
      // 7a64: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 7a67: astore 14
      // 7a69: aload 14
      // 7a6b: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7a6e: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Red_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 7a71: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 7a74: checkcast java/lang/Boolean
      // 7a77: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 7a7a: ifne 7a80
      // 7a7d: goto 7a84
      // 7a80: bipush 1
      // 7a81: goto 7a85
      // 7a84: bipush 0
      // 7a85: bipush 1
      // 7a86: if_icmpeq 7a8c
      // 7a89: goto 7aef
      // 7a8c: aload 1
      // 7a8d: instanceof net/minecraft/server/level/ServerLevel
      // 7a90: ifne 7a96
      // 7a93: goto 7ac8
      // 7a96: aload 1
      // 7a97: checkcast net/minecraft/server/level/ServerLevel
      // 7a9a: astore 15
      // 7a9c: new net/minecraft/world/entity/item/ItemEntity
      // 7a9f: dup
      // 7aa0: aload 15
      // 7aa2: dload 2
      // 7aa3: dload 4
      // 7aa5: dload 6
      // 7aa7: new net/minecraft/world/item/ItemStack
      // 7aaa: dup
      // 7aab: getstatic net/minecraft/world/level/block/Blocks.RED_WOOL Lnet/minecraft/world/level/block/Block;
      // 7aae: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 7ab1: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 7ab4: astore 16
      // 7ab6: aload 16
      // 7ab8: bipush 10
      // 7aba: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 7abd: aload 15
      // 7abf: aload 16
      // 7ac1: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 7ac4: pop
      // 7ac5: goto 7ac8
      // 7ac8: aload 8
      // 7aca: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 7acd: ifne 7ad3
      // 7ad0: goto 7aec
      // 7ad3: aload 8
      // 7ad5: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 7ad8: astore 15
      // 7ada: aload 15
      // 7adc: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7adf: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Red_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 7ae2: bipush 0
      // 7ae3: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 7ae6: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 7ae9: goto 7aec
      // 7aec: goto 7aef
      // 7aef: aload 8
      // 7af1: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 7af4: ifne 7afa
      // 7af7: goto 7b1c
      // 7afa: aload 8
      // 7afc: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 7aff: astore 14
      // 7b01: aload 14
      // 7b03: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7b06: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Yellow_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 7b09: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 7b0c: checkcast java/lang/Boolean
      // 7b0f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 7b12: ifne 7b18
      // 7b15: goto 7b1c
      // 7b18: bipush 1
      // 7b19: goto 7b1d
      // 7b1c: bipush 0
      // 7b1d: bipush 1
      // 7b1e: if_icmpeq 7b24
      // 7b21: goto 7b87
      // 7b24: aload 1
      // 7b25: instanceof net/minecraft/server/level/ServerLevel
      // 7b28: ifne 7b2e
      // 7b2b: goto 7b60
      // 7b2e: aload 1
      // 7b2f: checkcast net/minecraft/server/level/ServerLevel
      // 7b32: astore 15
      // 7b34: new net/minecraft/world/entity/item/ItemEntity
      // 7b37: dup
      // 7b38: aload 15
      // 7b3a: dload 2
      // 7b3b: dload 4
      // 7b3d: dload 6
      // 7b3f: new net/minecraft/world/item/ItemStack
      // 7b42: dup
      // 7b43: getstatic net/minecraft/world/level/block/Blocks.YELLOW_WOOL Lnet/minecraft/world/level/block/Block;
      // 7b46: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 7b49: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 7b4c: astore 16
      // 7b4e: aload 16
      // 7b50: bipush 10
      // 7b52: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 7b55: aload 15
      // 7b57: aload 16
      // 7b59: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 7b5c: pop
      // 7b5d: goto 7b60
      // 7b60: aload 8
      // 7b62: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 7b65: ifne 7b6b
      // 7b68: goto 7b84
      // 7b6b: aload 8
      // 7b6d: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 7b70: astore 15
      // 7b72: aload 15
      // 7b74: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7b77: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Yellow_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 7b7a: bipush 0
      // 7b7b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 7b7e: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 7b81: goto 7b84
      // 7b84: goto 7b87
      // 7b87: aload 8
      // 7b89: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 7b8c: ifne 7b92
      // 7b8f: goto 7bb4
      // 7b92: aload 8
      // 7b94: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 7b97: astore 14
      // 7b99: aload 14
      // 7b9b: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7b9e: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_White_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 7ba1: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 7ba4: checkcast java/lang/Boolean
      // 7ba7: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 7baa: ifne 7bb0
      // 7bad: goto 7bb4
      // 7bb0: bipush 1
      // 7bb1: goto 7bb5
      // 7bb4: bipush 0
      // 7bb5: bipush 1
      // 7bb6: if_icmpeq 7bbc
      // 7bb9: goto 7c1f
      // 7bbc: aload 1
      // 7bbd: instanceof net/minecraft/server/level/ServerLevel
      // 7bc0: ifne 7bc6
      // 7bc3: goto 7bf8
      // 7bc6: aload 1
      // 7bc7: checkcast net/minecraft/server/level/ServerLevel
      // 7bca: astore 15
      // 7bcc: new net/minecraft/world/entity/item/ItemEntity
      // 7bcf: dup
      // 7bd0: aload 15
      // 7bd2: dload 2
      // 7bd3: dload 4
      // 7bd5: dload 6
      // 7bd7: new net/minecraft/world/item/ItemStack
      // 7bda: dup
      // 7bdb: getstatic net/minecraft/world/level/block/Blocks.WHITE_WOOL Lnet/minecraft/world/level/block/Block;
      // 7bde: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 7be1: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 7be4: astore 16
      // 7be6: aload 16
      // 7be8: bipush 10
      // 7bea: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 7bed: aload 15
      // 7bef: aload 16
      // 7bf1: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 7bf4: pop
      // 7bf5: goto 7bf8
      // 7bf8: aload 8
      // 7bfa: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 7bfd: ifne 7c03
      // 7c00: goto 7c1c
      // 7c03: aload 8
      // 7c05: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 7c08: astore 15
      // 7c0a: aload 15
      // 7c0c: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7c0f: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_White_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 7c12: bipush 0
      // 7c13: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 7c16: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 7c19: goto 7c1c
      // 7c1c: goto 7c1f
      // 7c1f: aload 8
      // 7c21: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 7c24: ifne 7c2a
      // 7c27: goto 7c4c
      // 7c2a: aload 8
      // 7c2c: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 7c2f: astore 14
      // 7c31: aload 14
      // 7c33: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7c36: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGrey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 7c39: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 7c3c: checkcast java/lang/Boolean
      // 7c3f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 7c42: ifne 7c48
      // 7c45: goto 7c4c
      // 7c48: bipush 1
      // 7c49: goto 7c4d
      // 7c4c: bipush 0
      // 7c4d: bipush 1
      // 7c4e: if_icmpeq 7c54
      // 7c51: goto 7cb7
      // 7c54: aload 1
      // 7c55: instanceof net/minecraft/server/level/ServerLevel
      // 7c58: ifne 7c5e
      // 7c5b: goto 7c90
      // 7c5e: aload 1
      // 7c5f: checkcast net/minecraft/server/level/ServerLevel
      // 7c62: astore 15
      // 7c64: new net/minecraft/world/entity/item/ItemEntity
      // 7c67: dup
      // 7c68: aload 15
      // 7c6a: dload 2
      // 7c6b: dload 4
      // 7c6d: dload 6
      // 7c6f: new net/minecraft/world/item/ItemStack
      // 7c72: dup
      // 7c73: getstatic net/minecraft/world/level/block/Blocks.LIGHT_GRAY_WOOL Lnet/minecraft/world/level/block/Block;
      // 7c76: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 7c79: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 7c7c: astore 16
      // 7c7e: aload 16
      // 7c80: bipush 10
      // 7c82: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 7c85: aload 15
      // 7c87: aload 16
      // 7c89: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 7c8c: pop
      // 7c8d: goto 7c90
      // 7c90: aload 8
      // 7c92: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 7c95: ifne 7c9b
      // 7c98: goto 7cb4
      // 7c9b: aload 8
      // 7c9d: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 7ca0: astore 15
      // 7ca2: aload 15
      // 7ca4: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7ca7: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGrey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 7caa: bipush 0
      // 7cab: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 7cae: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 7cb1: goto 7cb4
      // 7cb4: goto 7cb7
      // 7cb7: aload 8
      // 7cb9: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 7cbc: ifne 7cc2
      // 7cbf: goto 7ce4
      // 7cc2: aload 8
      // 7cc4: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 7cc7: astore 14
      // 7cc9: aload 14
      // 7ccb: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7cce: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Black_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 7cd1: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 7cd4: checkcast java/lang/Boolean
      // 7cd7: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 7cda: ifne 7ce0
      // 7cdd: goto 7ce4
      // 7ce0: bipush 1
      // 7ce1: goto 7ce5
      // 7ce4: bipush 0
      // 7ce5: bipush 1
      // 7ce6: if_icmpeq 7cec
      // 7ce9: goto 7d4f
      // 7cec: aload 1
      // 7ced: instanceof net/minecraft/server/level/ServerLevel
      // 7cf0: ifne 7cf6
      // 7cf3: goto 7d28
      // 7cf6: aload 1
      // 7cf7: checkcast net/minecraft/server/level/ServerLevel
      // 7cfa: astore 15
      // 7cfc: new net/minecraft/world/entity/item/ItemEntity
      // 7cff: dup
      // 7d00: aload 15
      // 7d02: dload 2
      // 7d03: dload 4
      // 7d05: dload 6
      // 7d07: new net/minecraft/world/item/ItemStack
      // 7d0a: dup
      // 7d0b: getstatic net/minecraft/world/level/block/Blocks.BLACK_WOOL Lnet/minecraft/world/level/block/Block;
      // 7d0e: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 7d11: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 7d14: astore 16
      // 7d16: aload 16
      // 7d18: bipush 10
      // 7d1a: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 7d1d: aload 15
      // 7d1f: aload 16
      // 7d21: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 7d24: pop
      // 7d25: goto 7d28
      // 7d28: aload 8
      // 7d2a: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 7d2d: ifne 7d33
      // 7d30: goto 7d4c
      // 7d33: aload 8
      // 7d35: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 7d38: astore 15
      // 7d3a: aload 15
      // 7d3c: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7d3f: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Black_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 7d42: bipush 0
      // 7d43: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 7d46: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 7d49: goto 7d4c
      // 7d4c: goto 7d4f
      // 7d4f: aload 8
      // 7d51: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 7d54: ifne 7d5a
      // 7d57: goto 7d7c
      // 7d5a: aload 8
      // 7d5c: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 7d5f: astore 14
      // 7d61: aload 14
      // 7d63: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7d66: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Brown_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 7d69: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 7d6c: checkcast java/lang/Boolean
      // 7d6f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 7d72: ifne 7d78
      // 7d75: goto 7d7c
      // 7d78: bipush 1
      // 7d79: goto 7d7d
      // 7d7c: bipush 0
      // 7d7d: bipush 1
      // 7d7e: if_icmpeq 7d84
      // 7d81: goto 7de7
      // 7d84: aload 1
      // 7d85: instanceof net/minecraft/server/level/ServerLevel
      // 7d88: ifne 7d8e
      // 7d8b: goto 7dc0
      // 7d8e: aload 1
      // 7d8f: checkcast net/minecraft/server/level/ServerLevel
      // 7d92: astore 15
      // 7d94: new net/minecraft/world/entity/item/ItemEntity
      // 7d97: dup
      // 7d98: aload 15
      // 7d9a: dload 2
      // 7d9b: dload 4
      // 7d9d: dload 6
      // 7d9f: new net/minecraft/world/item/ItemStack
      // 7da2: dup
      // 7da3: getstatic net/minecraft/world/level/block/Blocks.BROWN_WOOL Lnet/minecraft/world/level/block/Block;
      // 7da6: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 7da9: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 7dac: astore 16
      // 7dae: aload 16
      // 7db0: bipush 10
      // 7db2: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 7db5: aload 15
      // 7db7: aload 16
      // 7db9: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 7dbc: pop
      // 7dbd: goto 7dc0
      // 7dc0: aload 8
      // 7dc2: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 7dc5: ifne 7dcb
      // 7dc8: goto 7de4
      // 7dcb: aload 8
      // 7dcd: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 7dd0: astore 15
      // 7dd2: aload 15
      // 7dd4: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7dd7: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Brown_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 7dda: bipush 0
      // 7ddb: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 7dde: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 7de1: goto 7de4
      // 7de4: goto 7de7
      // 7de7: aload 8
      // 7de9: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 7dec: ifne 7df2
      // 7def: goto 7e14
      // 7df2: aload 8
      // 7df4: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 7df7: astore 12
      // 7df9: aload 12
      // 7dfb: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7dfe: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGrey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 7e01: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 7e04: checkcast java/lang/Boolean
      // 7e07: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 7e0a: ifne 7e10
      // 7e0d: goto 7e14
      // 7e10: bipush 1
      // 7e11: goto 7e15
      // 7e14: bipush 0
      // 7e15: ifeq 7e1b
      // 7e18: goto 878d
      // 7e1b: aload 9
      // 7e1d: instanceof net/minecraft/world/entity/LivingEntity
      // 7e20: ifne 7e26
      // 7e23: goto 7e35
      // 7e26: aload 9
      // 7e28: checkcast net/minecraft/world/entity/LivingEntity
      // 7e2b: astore 13
      // 7e2d: aload 13
      // 7e2f: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 7e32: goto 7e38
      // 7e35: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 7e38: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 7e3b: getstatic net/minecraft/world/level/block/Blocks.LIGHT_GRAY_WOOL Lnet/minecraft/world/level/block/Block;
      // 7e3e: invokevirtual net/minecraft/world/level/block/Block.asItem ()Lnet/minecraft/world/item/Item;
      // 7e41: if_acmpeq 7e47
      // 7e44: goto 878d
      // 7e47: aload 9
      // 7e49: instanceof net/minecraft/world/entity/player/Player
      // 7e4c: ifne 7e52
      // 7e4f: goto 7e81
      // 7e52: aload 9
      // 7e54: checkcast net/minecraft/world/entity/player/Player
      // 7e57: astore 14
      // 7e59: new net/minecraft/world/item/ItemStack
      // 7e5c: dup
      // 7e5d: getstatic net/minecraft/world/level/block/Blocks.LIGHT_GRAY_WOOL Lnet/minecraft/world/level/block/Block;
      // 7e60: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 7e63: astore 15
      // 7e65: aload 14
      // 7e67: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 7e6a: aload 15
      // 7e6c: invokedynamic test (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, net/mocreatures/procedures/UndeadOstrichEquipmentSwapProcedure.lambda$execute$13 (Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z, (Lnet/minecraft/world/item/ItemStack;)Z ]
      // 7e71: bipush 1
      // 7e72: aload 14
      // 7e74: getfield net/minecraft/world/entity/player/Player.inventoryMenu Lnet/minecraft/world/inventory/InventoryMenu;
      // 7e77: invokevirtual net/minecraft/world/inventory/InventoryMenu.getCraftSlots ()Lnet/minecraft/world/inventory/CraftingContainer;
      // 7e7a: invokevirtual net/minecraft/world/entity/player/Inventory.clearOrCountMatchingItems (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
      // 7e7d: pop
      // 7e7e: goto 7e81
      // 7e81: aload 8
      // 7e83: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 7e86: ifne 7e8c
      // 7e89: goto 7ea5
      // 7e8c: aload 8
      // 7e8e: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 7e91: astore 14
      // 7e93: aload 14
      // 7e95: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7e98: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGrey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 7e9b: bipush 1
      // 7e9c: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 7e9f: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 7ea2: goto 7ea5
      // 7ea5: aload 8
      // 7ea7: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 7eaa: ifne 7eb0
      // 7ead: goto 7ed2
      // 7eb0: aload 8
      // 7eb2: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 7eb5: astore 14
      // 7eb7: aload 14
      // 7eb9: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7ebc: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Green_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 7ebf: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 7ec2: checkcast java/lang/Boolean
      // 7ec5: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 7ec8: ifne 7ece
      // 7ecb: goto 7ed2
      // 7ece: bipush 1
      // 7ecf: goto 7ed3
      // 7ed2: bipush 0
      // 7ed3: bipush 1
      // 7ed4: if_icmpeq 7eda
      // 7ed7: goto 7f3d
      // 7eda: aload 1
      // 7edb: instanceof net/minecraft/server/level/ServerLevel
      // 7ede: ifne 7ee4
      // 7ee1: goto 7f16
      // 7ee4: aload 1
      // 7ee5: checkcast net/minecraft/server/level/ServerLevel
      // 7ee8: astore 15
      // 7eea: new net/minecraft/world/entity/item/ItemEntity
      // 7eed: dup
      // 7eee: aload 15
      // 7ef0: dload 2
      // 7ef1: dload 4
      // 7ef3: dload 6
      // 7ef5: new net/minecraft/world/item/ItemStack
      // 7ef8: dup
      // 7ef9: getstatic net/minecraft/world/level/block/Blocks.GREEN_WOOL Lnet/minecraft/world/level/block/Block;
      // 7efc: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 7eff: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 7f02: astore 16
      // 7f04: aload 16
      // 7f06: bipush 10
      // 7f08: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 7f0b: aload 15
      // 7f0d: aload 16
      // 7f0f: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 7f12: pop
      // 7f13: goto 7f16
      // 7f16: aload 8
      // 7f18: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 7f1b: ifne 7f21
      // 7f1e: goto 7f3a
      // 7f21: aload 8
      // 7f23: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 7f26: astore 15
      // 7f28: aload 15
      // 7f2a: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7f2d: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Green_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 7f30: bipush 0
      // 7f31: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 7f34: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 7f37: goto 7f3a
      // 7f3a: goto 7f3d
      // 7f3d: aload 8
      // 7f3f: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 7f42: ifne 7f48
      // 7f45: goto 7f6a
      // 7f48: aload 8
      // 7f4a: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 7f4d: astore 14
      // 7f4f: aload 14
      // 7f51: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7f54: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGreen_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 7f57: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 7f5a: checkcast java/lang/Boolean
      // 7f5d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 7f60: ifne 7f66
      // 7f63: goto 7f6a
      // 7f66: bipush 1
      // 7f67: goto 7f6b
      // 7f6a: bipush 0
      // 7f6b: bipush 1
      // 7f6c: if_icmpeq 7f72
      // 7f6f: goto 7fd5
      // 7f72: aload 1
      // 7f73: instanceof net/minecraft/server/level/ServerLevel
      // 7f76: ifne 7f7c
      // 7f79: goto 7fae
      // 7f7c: aload 1
      // 7f7d: checkcast net/minecraft/server/level/ServerLevel
      // 7f80: astore 15
      // 7f82: new net/minecraft/world/entity/item/ItemEntity
      // 7f85: dup
      // 7f86: aload 15
      // 7f88: dload 2
      // 7f89: dload 4
      // 7f8b: dload 6
      // 7f8d: new net/minecraft/world/item/ItemStack
      // 7f90: dup
      // 7f91: getstatic net/minecraft/world/level/block/Blocks.LIME_WOOL Lnet/minecraft/world/level/block/Block;
      // 7f94: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 7f97: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 7f9a: astore 16
      // 7f9c: aload 16
      // 7f9e: bipush 10
      // 7fa0: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 7fa3: aload 15
      // 7fa5: aload 16
      // 7fa7: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 7faa: pop
      // 7fab: goto 7fae
      // 7fae: aload 8
      // 7fb0: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 7fb3: ifne 7fb9
      // 7fb6: goto 7fd2
      // 7fb9: aload 8
      // 7fbb: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 7fbe: astore 15
      // 7fc0: aload 15
      // 7fc2: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7fc5: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGreen_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 7fc8: bipush 0
      // 7fc9: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 7fcc: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 7fcf: goto 7fd2
      // 7fd2: goto 7fd5
      // 7fd5: aload 8
      // 7fd7: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 7fda: ifne 7fe0
      // 7fdd: goto 8002
      // 7fe0: aload 8
      // 7fe2: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 7fe5: astore 14
      // 7fe7: aload 14
      // 7fe9: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7fec: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Blue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 7fef: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 7ff2: checkcast java/lang/Boolean
      // 7ff5: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 7ff8: ifne 7ffe
      // 7ffb: goto 8002
      // 7ffe: bipush 1
      // 7fff: goto 8003
      // 8002: bipush 0
      // 8003: bipush 1
      // 8004: if_icmpeq 800a
      // 8007: goto 806d
      // 800a: aload 1
      // 800b: instanceof net/minecraft/server/level/ServerLevel
      // 800e: ifne 8014
      // 8011: goto 8046
      // 8014: aload 1
      // 8015: checkcast net/minecraft/server/level/ServerLevel
      // 8018: astore 15
      // 801a: new net/minecraft/world/entity/item/ItemEntity
      // 801d: dup
      // 801e: aload 15
      // 8020: dload 2
      // 8021: dload 4
      // 8023: dload 6
      // 8025: new net/minecraft/world/item/ItemStack
      // 8028: dup
      // 8029: getstatic net/minecraft/world/level/block/Blocks.BLUE_WOOL Lnet/minecraft/world/level/block/Block;
      // 802c: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 802f: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 8032: astore 16
      // 8034: aload 16
      // 8036: bipush 10
      // 8038: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 803b: aload 15
      // 803d: aload 16
      // 803f: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 8042: pop
      // 8043: goto 8046
      // 8046: aload 8
      // 8048: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 804b: ifne 8051
      // 804e: goto 806a
      // 8051: aload 8
      // 8053: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 8056: astore 15
      // 8058: aload 15
      // 805a: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 805d: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Blue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 8060: bipush 0
      // 8061: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 8064: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 8067: goto 806a
      // 806a: goto 806d
      // 806d: aload 8
      // 806f: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 8072: ifne 8078
      // 8075: goto 809a
      // 8078: aload 8
      // 807a: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 807d: astore 14
      // 807f: aload 14
      // 8081: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 8084: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightBlue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 8087: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 808a: checkcast java/lang/Boolean
      // 808d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 8090: ifne 8096
      // 8093: goto 809a
      // 8096: bipush 1
      // 8097: goto 809b
      // 809a: bipush 0
      // 809b: bipush 1
      // 809c: if_icmpeq 80a2
      // 809f: goto 8105
      // 80a2: aload 1
      // 80a3: instanceof net/minecraft/server/level/ServerLevel
      // 80a6: ifne 80ac
      // 80a9: goto 80de
      // 80ac: aload 1
      // 80ad: checkcast net/minecraft/server/level/ServerLevel
      // 80b0: astore 15
      // 80b2: new net/minecraft/world/entity/item/ItemEntity
      // 80b5: dup
      // 80b6: aload 15
      // 80b8: dload 2
      // 80b9: dload 4
      // 80bb: dload 6
      // 80bd: new net/minecraft/world/item/ItemStack
      // 80c0: dup
      // 80c1: getstatic net/minecraft/world/level/block/Blocks.LIGHT_BLUE_WOOL Lnet/minecraft/world/level/block/Block;
      // 80c4: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 80c7: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 80ca: astore 16
      // 80cc: aload 16
      // 80ce: bipush 10
      // 80d0: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 80d3: aload 15
      // 80d5: aload 16
      // 80d7: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 80da: pop
      // 80db: goto 80de
      // 80de: aload 8
      // 80e0: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 80e3: ifne 80e9
      // 80e6: goto 8102
      // 80e9: aload 8
      // 80eb: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 80ee: astore 15
      // 80f0: aload 15
      // 80f2: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 80f5: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightBlue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 80f8: bipush 0
      // 80f9: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 80fc: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 80ff: goto 8102
      // 8102: goto 8105
      // 8105: aload 8
      // 8107: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 810a: ifne 8110
      // 810d: goto 8132
      // 8110: aload 8
      // 8112: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 8115: astore 14
      // 8117: aload 14
      // 8119: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 811c: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Pink_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 811f: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 8122: checkcast java/lang/Boolean
      // 8125: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 8128: ifne 812e
      // 812b: goto 8132
      // 812e: bipush 1
      // 812f: goto 8133
      // 8132: bipush 0
      // 8133: bipush 1
      // 8134: if_icmpeq 813a
      // 8137: goto 819d
      // 813a: aload 1
      // 813b: instanceof net/minecraft/server/level/ServerLevel
      // 813e: ifne 8144
      // 8141: goto 8176
      // 8144: aload 1
      // 8145: checkcast net/minecraft/server/level/ServerLevel
      // 8148: astore 15
      // 814a: new net/minecraft/world/entity/item/ItemEntity
      // 814d: dup
      // 814e: aload 15
      // 8150: dload 2
      // 8151: dload 4
      // 8153: dload 6
      // 8155: new net/minecraft/world/item/ItemStack
      // 8158: dup
      // 8159: getstatic net/minecraft/world/level/block/Blocks.PINK_WOOL Lnet/minecraft/world/level/block/Block;
      // 815c: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 815f: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 8162: astore 16
      // 8164: aload 16
      // 8166: bipush 10
      // 8168: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 816b: aload 15
      // 816d: aload 16
      // 816f: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 8172: pop
      // 8173: goto 8176
      // 8176: aload 8
      // 8178: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 817b: ifne 8181
      // 817e: goto 819a
      // 8181: aload 8
      // 8183: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 8186: astore 15
      // 8188: aload 15
      // 818a: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 818d: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Pink_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 8190: bipush 0
      // 8191: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 8194: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 8197: goto 819a
      // 819a: goto 819d
      // 819d: aload 8
      // 819f: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 81a2: ifne 81a8
      // 81a5: goto 81ca
      // 81a8: aload 8
      // 81aa: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 81ad: astore 14
      // 81af: aload 14
      // 81b1: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 81b4: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Magenta_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 81b7: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 81ba: checkcast java/lang/Boolean
      // 81bd: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 81c0: ifne 81c6
      // 81c3: goto 81ca
      // 81c6: bipush 1
      // 81c7: goto 81cb
      // 81ca: bipush 0
      // 81cb: bipush 1
      // 81cc: if_icmpeq 81d2
      // 81cf: goto 8235
      // 81d2: aload 1
      // 81d3: instanceof net/minecraft/server/level/ServerLevel
      // 81d6: ifne 81dc
      // 81d9: goto 820e
      // 81dc: aload 1
      // 81dd: checkcast net/minecraft/server/level/ServerLevel
      // 81e0: astore 15
      // 81e2: new net/minecraft/world/entity/item/ItemEntity
      // 81e5: dup
      // 81e6: aload 15
      // 81e8: dload 2
      // 81e9: dload 4
      // 81eb: dload 6
      // 81ed: new net/minecraft/world/item/ItemStack
      // 81f0: dup
      // 81f1: getstatic net/minecraft/world/level/block/Blocks.MAGENTA_WOOL Lnet/minecraft/world/level/block/Block;
      // 81f4: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 81f7: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 81fa: astore 16
      // 81fc: aload 16
      // 81fe: bipush 10
      // 8200: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 8203: aload 15
      // 8205: aload 16
      // 8207: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 820a: pop
      // 820b: goto 820e
      // 820e: aload 8
      // 8210: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 8213: ifne 8219
      // 8216: goto 8232
      // 8219: aload 8
      // 821b: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 821e: astore 15
      // 8220: aload 15
      // 8222: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 8225: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Magenta_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 8228: bipush 0
      // 8229: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 822c: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 822f: goto 8232
      // 8232: goto 8235
      // 8235: aload 8
      // 8237: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 823a: ifne 8240
      // 823d: goto 8262
      // 8240: aload 8
      // 8242: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 8245: astore 14
      // 8247: aload 14
      // 8249: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 824c: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Purple_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 824f: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 8252: checkcast java/lang/Boolean
      // 8255: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 8258: ifne 825e
      // 825b: goto 8262
      // 825e: bipush 1
      // 825f: goto 8263
      // 8262: bipush 0
      // 8263: bipush 1
      // 8264: if_icmpeq 826a
      // 8267: goto 82cd
      // 826a: aload 1
      // 826b: instanceof net/minecraft/server/level/ServerLevel
      // 826e: ifne 8274
      // 8271: goto 82a6
      // 8274: aload 1
      // 8275: checkcast net/minecraft/server/level/ServerLevel
      // 8278: astore 15
      // 827a: new net/minecraft/world/entity/item/ItemEntity
      // 827d: dup
      // 827e: aload 15
      // 8280: dload 2
      // 8281: dload 4
      // 8283: dload 6
      // 8285: new net/minecraft/world/item/ItemStack
      // 8288: dup
      // 8289: getstatic net/minecraft/world/level/block/Blocks.PURPLE_WOOL Lnet/minecraft/world/level/block/Block;
      // 828c: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 828f: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 8292: astore 16
      // 8294: aload 16
      // 8296: bipush 10
      // 8298: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 829b: aload 15
      // 829d: aload 16
      // 829f: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 82a2: pop
      // 82a3: goto 82a6
      // 82a6: aload 8
      // 82a8: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 82ab: ifne 82b1
      // 82ae: goto 82ca
      // 82b1: aload 8
      // 82b3: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 82b6: astore 15
      // 82b8: aload 15
      // 82ba: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 82bd: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Purple_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 82c0: bipush 0
      // 82c1: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 82c4: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 82c7: goto 82ca
      // 82ca: goto 82cd
      // 82cd: aload 8
      // 82cf: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 82d2: ifne 82d8
      // 82d5: goto 82fa
      // 82d8: aload 8
      // 82da: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 82dd: astore 14
      // 82df: aload 14
      // 82e1: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 82e4: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Orange_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 82e7: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 82ea: checkcast java/lang/Boolean
      // 82ed: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 82f0: ifne 82f6
      // 82f3: goto 82fa
      // 82f6: bipush 1
      // 82f7: goto 82fb
      // 82fa: bipush 0
      // 82fb: bipush 1
      // 82fc: if_icmpeq 8302
      // 82ff: goto 8365
      // 8302: aload 1
      // 8303: instanceof net/minecraft/server/level/ServerLevel
      // 8306: ifne 830c
      // 8309: goto 833e
      // 830c: aload 1
      // 830d: checkcast net/minecraft/server/level/ServerLevel
      // 8310: astore 15
      // 8312: new net/minecraft/world/entity/item/ItemEntity
      // 8315: dup
      // 8316: aload 15
      // 8318: dload 2
      // 8319: dload 4
      // 831b: dload 6
      // 831d: new net/minecraft/world/item/ItemStack
      // 8320: dup
      // 8321: getstatic net/minecraft/world/level/block/Blocks.ORANGE_WOOL Lnet/minecraft/world/level/block/Block;
      // 8324: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 8327: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 832a: astore 16
      // 832c: aload 16
      // 832e: bipush 10
      // 8330: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 8333: aload 15
      // 8335: aload 16
      // 8337: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 833a: pop
      // 833b: goto 833e
      // 833e: aload 8
      // 8340: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 8343: ifne 8349
      // 8346: goto 8362
      // 8349: aload 8
      // 834b: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 834e: astore 15
      // 8350: aload 15
      // 8352: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 8355: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Orange_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 8358: bipush 0
      // 8359: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 835c: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 835f: goto 8362
      // 8362: goto 8365
      // 8365: aload 8
      // 8367: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 836a: ifne 8370
      // 836d: goto 8392
      // 8370: aload 8
      // 8372: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 8375: astore 14
      // 8377: aload 14
      // 8379: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 837c: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Cyan_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 837f: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 8382: checkcast java/lang/Boolean
      // 8385: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 8388: ifne 838e
      // 838b: goto 8392
      // 838e: bipush 1
      // 838f: goto 8393
      // 8392: bipush 0
      // 8393: bipush 1
      // 8394: if_icmpeq 839a
      // 8397: goto 83fd
      // 839a: aload 1
      // 839b: instanceof net/minecraft/server/level/ServerLevel
      // 839e: ifne 83a4
      // 83a1: goto 83d6
      // 83a4: aload 1
      // 83a5: checkcast net/minecraft/server/level/ServerLevel
      // 83a8: astore 15
      // 83aa: new net/minecraft/world/entity/item/ItemEntity
      // 83ad: dup
      // 83ae: aload 15
      // 83b0: dload 2
      // 83b1: dload 4
      // 83b3: dload 6
      // 83b5: new net/minecraft/world/item/ItemStack
      // 83b8: dup
      // 83b9: getstatic net/minecraft/world/level/block/Blocks.CYAN_WOOL Lnet/minecraft/world/level/block/Block;
      // 83bc: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 83bf: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 83c2: astore 16
      // 83c4: aload 16
      // 83c6: bipush 10
      // 83c8: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 83cb: aload 15
      // 83cd: aload 16
      // 83cf: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 83d2: pop
      // 83d3: goto 83d6
      // 83d6: aload 8
      // 83d8: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 83db: ifne 83e1
      // 83de: goto 83fa
      // 83e1: aload 8
      // 83e3: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 83e6: astore 15
      // 83e8: aload 15
      // 83ea: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 83ed: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Cyan_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 83f0: bipush 0
      // 83f1: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 83f4: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 83f7: goto 83fa
      // 83fa: goto 83fd
      // 83fd: aload 8
      // 83ff: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 8402: ifne 8408
      // 8405: goto 842a
      // 8408: aload 8
      // 840a: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 840d: astore 14
      // 840f: aload 14
      // 8411: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 8414: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Red_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 8417: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 841a: checkcast java/lang/Boolean
      // 841d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 8420: ifne 8426
      // 8423: goto 842a
      // 8426: bipush 1
      // 8427: goto 842b
      // 842a: bipush 0
      // 842b: bipush 1
      // 842c: if_icmpeq 8432
      // 842f: goto 8495
      // 8432: aload 1
      // 8433: instanceof net/minecraft/server/level/ServerLevel
      // 8436: ifne 843c
      // 8439: goto 846e
      // 843c: aload 1
      // 843d: checkcast net/minecraft/server/level/ServerLevel
      // 8440: astore 15
      // 8442: new net/minecraft/world/entity/item/ItemEntity
      // 8445: dup
      // 8446: aload 15
      // 8448: dload 2
      // 8449: dload 4
      // 844b: dload 6
      // 844d: new net/minecraft/world/item/ItemStack
      // 8450: dup
      // 8451: getstatic net/minecraft/world/level/block/Blocks.RED_WOOL Lnet/minecraft/world/level/block/Block;
      // 8454: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 8457: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 845a: astore 16
      // 845c: aload 16
      // 845e: bipush 10
      // 8460: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 8463: aload 15
      // 8465: aload 16
      // 8467: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 846a: pop
      // 846b: goto 846e
      // 846e: aload 8
      // 8470: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 8473: ifne 8479
      // 8476: goto 8492
      // 8479: aload 8
      // 847b: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 847e: astore 15
      // 8480: aload 15
      // 8482: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 8485: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Red_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 8488: bipush 0
      // 8489: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 848c: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 848f: goto 8492
      // 8492: goto 8495
      // 8495: aload 8
      // 8497: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 849a: ifne 84a0
      // 849d: goto 84c2
      // 84a0: aload 8
      // 84a2: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 84a5: astore 14
      // 84a7: aload 14
      // 84a9: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 84ac: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Yellow_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 84af: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 84b2: checkcast java/lang/Boolean
      // 84b5: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 84b8: ifne 84be
      // 84bb: goto 84c2
      // 84be: bipush 1
      // 84bf: goto 84c3
      // 84c2: bipush 0
      // 84c3: bipush 1
      // 84c4: if_icmpeq 84ca
      // 84c7: goto 852d
      // 84ca: aload 1
      // 84cb: instanceof net/minecraft/server/level/ServerLevel
      // 84ce: ifne 84d4
      // 84d1: goto 8506
      // 84d4: aload 1
      // 84d5: checkcast net/minecraft/server/level/ServerLevel
      // 84d8: astore 15
      // 84da: new net/minecraft/world/entity/item/ItemEntity
      // 84dd: dup
      // 84de: aload 15
      // 84e0: dload 2
      // 84e1: dload 4
      // 84e3: dload 6
      // 84e5: new net/minecraft/world/item/ItemStack
      // 84e8: dup
      // 84e9: getstatic net/minecraft/world/level/block/Blocks.YELLOW_WOOL Lnet/minecraft/world/level/block/Block;
      // 84ec: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 84ef: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 84f2: astore 16
      // 84f4: aload 16
      // 84f6: bipush 10
      // 84f8: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 84fb: aload 15
      // 84fd: aload 16
      // 84ff: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 8502: pop
      // 8503: goto 8506
      // 8506: aload 8
      // 8508: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 850b: ifne 8511
      // 850e: goto 852a
      // 8511: aload 8
      // 8513: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 8516: astore 15
      // 8518: aload 15
      // 851a: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 851d: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Yellow_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 8520: bipush 0
      // 8521: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 8524: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 8527: goto 852a
      // 852a: goto 852d
      // 852d: aload 8
      // 852f: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 8532: ifne 8538
      // 8535: goto 855a
      // 8538: aload 8
      // 853a: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 853d: astore 14
      // 853f: aload 14
      // 8541: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 8544: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_White_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 8547: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 854a: checkcast java/lang/Boolean
      // 854d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 8550: ifne 8556
      // 8553: goto 855a
      // 8556: bipush 1
      // 8557: goto 855b
      // 855a: bipush 0
      // 855b: bipush 1
      // 855c: if_icmpeq 8562
      // 855f: goto 85c5
      // 8562: aload 1
      // 8563: instanceof net/minecraft/server/level/ServerLevel
      // 8566: ifne 856c
      // 8569: goto 859e
      // 856c: aload 1
      // 856d: checkcast net/minecraft/server/level/ServerLevel
      // 8570: astore 15
      // 8572: new net/minecraft/world/entity/item/ItemEntity
      // 8575: dup
      // 8576: aload 15
      // 8578: dload 2
      // 8579: dload 4
      // 857b: dload 6
      // 857d: new net/minecraft/world/item/ItemStack
      // 8580: dup
      // 8581: getstatic net/minecraft/world/level/block/Blocks.WHITE_WOOL Lnet/minecraft/world/level/block/Block;
      // 8584: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 8587: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 858a: astore 16
      // 858c: aload 16
      // 858e: bipush 10
      // 8590: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 8593: aload 15
      // 8595: aload 16
      // 8597: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 859a: pop
      // 859b: goto 859e
      // 859e: aload 8
      // 85a0: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 85a3: ifne 85a9
      // 85a6: goto 85c2
      // 85a9: aload 8
      // 85ab: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 85ae: astore 15
      // 85b0: aload 15
      // 85b2: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 85b5: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_White_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 85b8: bipush 0
      // 85b9: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 85bc: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 85bf: goto 85c2
      // 85c2: goto 85c5
      // 85c5: aload 8
      // 85c7: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 85ca: ifne 85d0
      // 85cd: goto 85f2
      // 85d0: aload 8
      // 85d2: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 85d5: astore 14
      // 85d7: aload 14
      // 85d9: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 85dc: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Grey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 85df: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 85e2: checkcast java/lang/Boolean
      // 85e5: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 85e8: ifne 85ee
      // 85eb: goto 85f2
      // 85ee: bipush 1
      // 85ef: goto 85f3
      // 85f2: bipush 0
      // 85f3: bipush 1
      // 85f4: if_icmpeq 85fa
      // 85f7: goto 865d
      // 85fa: aload 1
      // 85fb: instanceof net/minecraft/server/level/ServerLevel
      // 85fe: ifne 8604
      // 8601: goto 8636
      // 8604: aload 1
      // 8605: checkcast net/minecraft/server/level/ServerLevel
      // 8608: astore 15
      // 860a: new net/minecraft/world/entity/item/ItemEntity
      // 860d: dup
      // 860e: aload 15
      // 8610: dload 2
      // 8611: dload 4
      // 8613: dload 6
      // 8615: new net/minecraft/world/item/ItemStack
      // 8618: dup
      // 8619: getstatic net/minecraft/world/level/block/Blocks.GRAY_WOOL Lnet/minecraft/world/level/block/Block;
      // 861c: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 861f: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 8622: astore 16
      // 8624: aload 16
      // 8626: bipush 10
      // 8628: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 862b: aload 15
      // 862d: aload 16
      // 862f: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 8632: pop
      // 8633: goto 8636
      // 8636: aload 8
      // 8638: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 863b: ifne 8641
      // 863e: goto 865a
      // 8641: aload 8
      // 8643: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 8646: astore 15
      // 8648: aload 15
      // 864a: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 864d: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Grey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 8650: bipush 0
      // 8651: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 8654: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 8657: goto 865a
      // 865a: goto 865d
      // 865d: aload 8
      // 865f: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 8662: ifne 8668
      // 8665: goto 868a
      // 8668: aload 8
      // 866a: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 866d: astore 14
      // 866f: aload 14
      // 8671: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 8674: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Black_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 8677: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 867a: checkcast java/lang/Boolean
      // 867d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 8680: ifne 8686
      // 8683: goto 868a
      // 8686: bipush 1
      // 8687: goto 868b
      // 868a: bipush 0
      // 868b: bipush 1
      // 868c: if_icmpeq 8692
      // 868f: goto 86f5
      // 8692: aload 1
      // 8693: instanceof net/minecraft/server/level/ServerLevel
      // 8696: ifne 869c
      // 8699: goto 86ce
      // 869c: aload 1
      // 869d: checkcast net/minecraft/server/level/ServerLevel
      // 86a0: astore 15
      // 86a2: new net/minecraft/world/entity/item/ItemEntity
      // 86a5: dup
      // 86a6: aload 15
      // 86a8: dload 2
      // 86a9: dload 4
      // 86ab: dload 6
      // 86ad: new net/minecraft/world/item/ItemStack
      // 86b0: dup
      // 86b1: getstatic net/minecraft/world/level/block/Blocks.BLACK_WOOL Lnet/minecraft/world/level/block/Block;
      // 86b4: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 86b7: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 86ba: astore 16
      // 86bc: aload 16
      // 86be: bipush 10
      // 86c0: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 86c3: aload 15
      // 86c5: aload 16
      // 86c7: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 86ca: pop
      // 86cb: goto 86ce
      // 86ce: aload 8
      // 86d0: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 86d3: ifne 86d9
      // 86d6: goto 86f2
      // 86d9: aload 8
      // 86db: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 86de: astore 15
      // 86e0: aload 15
      // 86e2: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 86e5: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Black_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 86e8: bipush 0
      // 86e9: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 86ec: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 86ef: goto 86f2
      // 86f2: goto 86f5
      // 86f5: aload 8
      // 86f7: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 86fa: ifne 8700
      // 86fd: goto 8722
      // 8700: aload 8
      // 8702: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 8705: astore 14
      // 8707: aload 14
      // 8709: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 870c: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Brown_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 870f: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 8712: checkcast java/lang/Boolean
      // 8715: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 8718: ifne 871e
      // 871b: goto 8722
      // 871e: bipush 1
      // 871f: goto 8723
      // 8722: bipush 0
      // 8723: bipush 1
      // 8724: if_icmpeq 872a
      // 8727: goto 878d
      // 872a: aload 1
      // 872b: instanceof net/minecraft/server/level/ServerLevel
      // 872e: ifne 8734
      // 8731: goto 8766
      // 8734: aload 1
      // 8735: checkcast net/minecraft/server/level/ServerLevel
      // 8738: astore 15
      // 873a: new net/minecraft/world/entity/item/ItemEntity
      // 873d: dup
      // 873e: aload 15
      // 8740: dload 2
      // 8741: dload 4
      // 8743: dload 6
      // 8745: new net/minecraft/world/item/ItemStack
      // 8748: dup
      // 8749: getstatic net/minecraft/world/level/block/Blocks.BROWN_WOOL Lnet/minecraft/world/level/block/Block;
      // 874c: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 874f: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 8752: astore 16
      // 8754: aload 16
      // 8756: bipush 10
      // 8758: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 875b: aload 15
      // 875d: aload 16
      // 875f: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 8762: pop
      // 8763: goto 8766
      // 8766: aload 8
      // 8768: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 876b: ifne 8771
      // 876e: goto 878a
      // 8771: aload 8
      // 8773: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 8776: astore 15
      // 8778: aload 15
      // 877a: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 877d: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Brown_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 8780: bipush 0
      // 8781: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 8784: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 8787: goto 878a
      // 878a: goto 878d
      // 878d: aload 8
      // 878f: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 8792: ifne 8798
      // 8795: goto 87ba
      // 8798: aload 8
      // 879a: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 879d: astore 12
      // 879f: aload 12
      // 87a1: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 87a4: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Black_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 87a7: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 87aa: checkcast java/lang/Boolean
      // 87ad: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 87b0: ifne 87b6
      // 87b3: goto 87ba
      // 87b6: bipush 1
      // 87b7: goto 87bb
      // 87ba: bipush 0
      // 87bb: ifeq 87c1
      // 87be: goto 9133
      // 87c1: aload 9
      // 87c3: instanceof net/minecraft/world/entity/LivingEntity
      // 87c6: ifne 87cc
      // 87c9: goto 87db
      // 87cc: aload 9
      // 87ce: checkcast net/minecraft/world/entity/LivingEntity
      // 87d1: astore 13
      // 87d3: aload 13
      // 87d5: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 87d8: goto 87de
      // 87db: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 87de: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 87e1: getstatic net/minecraft/world/level/block/Blocks.BLACK_WOOL Lnet/minecraft/world/level/block/Block;
      // 87e4: invokevirtual net/minecraft/world/level/block/Block.asItem ()Lnet/minecraft/world/item/Item;
      // 87e7: if_acmpeq 87ed
      // 87ea: goto 9133
      // 87ed: aload 9
      // 87ef: instanceof net/minecraft/world/entity/player/Player
      // 87f2: ifne 87f8
      // 87f5: goto 8827
      // 87f8: aload 9
      // 87fa: checkcast net/minecraft/world/entity/player/Player
      // 87fd: astore 14
      // 87ff: new net/minecraft/world/item/ItemStack
      // 8802: dup
      // 8803: getstatic net/minecraft/world/level/block/Blocks.BLACK_WOOL Lnet/minecraft/world/level/block/Block;
      // 8806: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 8809: astore 15
      // 880b: aload 14
      // 880d: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 8810: aload 15
      // 8812: invokedynamic test (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, net/mocreatures/procedures/UndeadOstrichEquipmentSwapProcedure.lambda$execute$14 (Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z, (Lnet/minecraft/world/item/ItemStack;)Z ]
      // 8817: bipush 1
      // 8818: aload 14
      // 881a: getfield net/minecraft/world/entity/player/Player.inventoryMenu Lnet/minecraft/world/inventory/InventoryMenu;
      // 881d: invokevirtual net/minecraft/world/inventory/InventoryMenu.getCraftSlots ()Lnet/minecraft/world/inventory/CraftingContainer;
      // 8820: invokevirtual net/minecraft/world/entity/player/Inventory.clearOrCountMatchingItems (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
      // 8823: pop
      // 8824: goto 8827
      // 8827: aload 8
      // 8829: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 882c: ifne 8832
      // 882f: goto 884b
      // 8832: aload 8
      // 8834: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 8837: astore 14
      // 8839: aload 14
      // 883b: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 883e: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Black_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 8841: bipush 1
      // 8842: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 8845: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 8848: goto 884b
      // 884b: aload 8
      // 884d: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 8850: ifne 8856
      // 8853: goto 8878
      // 8856: aload 8
      // 8858: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 885b: astore 14
      // 885d: aload 14
      // 885f: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 8862: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Green_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 8865: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 8868: checkcast java/lang/Boolean
      // 886b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 886e: ifne 8874
      // 8871: goto 8878
      // 8874: bipush 1
      // 8875: goto 8879
      // 8878: bipush 0
      // 8879: bipush 1
      // 887a: if_icmpeq 8880
      // 887d: goto 88e3
      // 8880: aload 1
      // 8881: instanceof net/minecraft/server/level/ServerLevel
      // 8884: ifne 888a
      // 8887: goto 88bc
      // 888a: aload 1
      // 888b: checkcast net/minecraft/server/level/ServerLevel
      // 888e: astore 15
      // 8890: new net/minecraft/world/entity/item/ItemEntity
      // 8893: dup
      // 8894: aload 15
      // 8896: dload 2
      // 8897: dload 4
      // 8899: dload 6
      // 889b: new net/minecraft/world/item/ItemStack
      // 889e: dup
      // 889f: getstatic net/minecraft/world/level/block/Blocks.GREEN_WOOL Lnet/minecraft/world/level/block/Block;
      // 88a2: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 88a5: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 88a8: astore 16
      // 88aa: aload 16
      // 88ac: bipush 10
      // 88ae: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 88b1: aload 15
      // 88b3: aload 16
      // 88b5: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 88b8: pop
      // 88b9: goto 88bc
      // 88bc: aload 8
      // 88be: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 88c1: ifne 88c7
      // 88c4: goto 88e0
      // 88c7: aload 8
      // 88c9: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 88cc: astore 15
      // 88ce: aload 15
      // 88d0: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 88d3: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Green_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 88d6: bipush 0
      // 88d7: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 88da: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 88dd: goto 88e0
      // 88e0: goto 88e3
      // 88e3: aload 8
      // 88e5: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 88e8: ifne 88ee
      // 88eb: goto 8910
      // 88ee: aload 8
      // 88f0: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 88f3: astore 14
      // 88f5: aload 14
      // 88f7: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 88fa: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGreen_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 88fd: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 8900: checkcast java/lang/Boolean
      // 8903: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 8906: ifne 890c
      // 8909: goto 8910
      // 890c: bipush 1
      // 890d: goto 8911
      // 8910: bipush 0
      // 8911: bipush 1
      // 8912: if_icmpeq 8918
      // 8915: goto 897b
      // 8918: aload 1
      // 8919: instanceof net/minecraft/server/level/ServerLevel
      // 891c: ifne 8922
      // 891f: goto 8954
      // 8922: aload 1
      // 8923: checkcast net/minecraft/server/level/ServerLevel
      // 8926: astore 15
      // 8928: new net/minecraft/world/entity/item/ItemEntity
      // 892b: dup
      // 892c: aload 15
      // 892e: dload 2
      // 892f: dload 4
      // 8931: dload 6
      // 8933: new net/minecraft/world/item/ItemStack
      // 8936: dup
      // 8937: getstatic net/minecraft/world/level/block/Blocks.LIME_WOOL Lnet/minecraft/world/level/block/Block;
      // 893a: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 893d: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 8940: astore 16
      // 8942: aload 16
      // 8944: bipush 10
      // 8946: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 8949: aload 15
      // 894b: aload 16
      // 894d: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 8950: pop
      // 8951: goto 8954
      // 8954: aload 8
      // 8956: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 8959: ifne 895f
      // 895c: goto 8978
      // 895f: aload 8
      // 8961: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 8964: astore 15
      // 8966: aload 15
      // 8968: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 896b: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGreen_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 896e: bipush 0
      // 896f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 8972: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 8975: goto 8978
      // 8978: goto 897b
      // 897b: aload 8
      // 897d: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 8980: ifne 8986
      // 8983: goto 89a8
      // 8986: aload 8
      // 8988: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 898b: astore 14
      // 898d: aload 14
      // 898f: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 8992: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Blue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 8995: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 8998: checkcast java/lang/Boolean
      // 899b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 899e: ifne 89a4
      // 89a1: goto 89a8
      // 89a4: bipush 1
      // 89a5: goto 89a9
      // 89a8: bipush 0
      // 89a9: bipush 1
      // 89aa: if_icmpeq 89b0
      // 89ad: goto 8a13
      // 89b0: aload 1
      // 89b1: instanceof net/minecraft/server/level/ServerLevel
      // 89b4: ifne 89ba
      // 89b7: goto 89ec
      // 89ba: aload 1
      // 89bb: checkcast net/minecraft/server/level/ServerLevel
      // 89be: astore 15
      // 89c0: new net/minecraft/world/entity/item/ItemEntity
      // 89c3: dup
      // 89c4: aload 15
      // 89c6: dload 2
      // 89c7: dload 4
      // 89c9: dload 6
      // 89cb: new net/minecraft/world/item/ItemStack
      // 89ce: dup
      // 89cf: getstatic net/minecraft/world/level/block/Blocks.BLUE_WOOL Lnet/minecraft/world/level/block/Block;
      // 89d2: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 89d5: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 89d8: astore 16
      // 89da: aload 16
      // 89dc: bipush 10
      // 89de: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 89e1: aload 15
      // 89e3: aload 16
      // 89e5: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 89e8: pop
      // 89e9: goto 89ec
      // 89ec: aload 8
      // 89ee: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 89f1: ifne 89f7
      // 89f4: goto 8a10
      // 89f7: aload 8
      // 89f9: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 89fc: astore 15
      // 89fe: aload 15
      // 8a00: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 8a03: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Blue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 8a06: bipush 0
      // 8a07: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 8a0a: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 8a0d: goto 8a10
      // 8a10: goto 8a13
      // 8a13: aload 8
      // 8a15: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 8a18: ifne 8a1e
      // 8a1b: goto 8a40
      // 8a1e: aload 8
      // 8a20: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 8a23: astore 14
      // 8a25: aload 14
      // 8a27: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 8a2a: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightBlue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 8a2d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 8a30: checkcast java/lang/Boolean
      // 8a33: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 8a36: ifne 8a3c
      // 8a39: goto 8a40
      // 8a3c: bipush 1
      // 8a3d: goto 8a41
      // 8a40: bipush 0
      // 8a41: bipush 1
      // 8a42: if_icmpeq 8a48
      // 8a45: goto 8aab
      // 8a48: aload 1
      // 8a49: instanceof net/minecraft/server/level/ServerLevel
      // 8a4c: ifne 8a52
      // 8a4f: goto 8a84
      // 8a52: aload 1
      // 8a53: checkcast net/minecraft/server/level/ServerLevel
      // 8a56: astore 15
      // 8a58: new net/minecraft/world/entity/item/ItemEntity
      // 8a5b: dup
      // 8a5c: aload 15
      // 8a5e: dload 2
      // 8a5f: dload 4
      // 8a61: dload 6
      // 8a63: new net/minecraft/world/item/ItemStack
      // 8a66: dup
      // 8a67: getstatic net/minecraft/world/level/block/Blocks.LIGHT_BLUE_WOOL Lnet/minecraft/world/level/block/Block;
      // 8a6a: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 8a6d: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 8a70: astore 16
      // 8a72: aload 16
      // 8a74: bipush 10
      // 8a76: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 8a79: aload 15
      // 8a7b: aload 16
      // 8a7d: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 8a80: pop
      // 8a81: goto 8a84
      // 8a84: aload 8
      // 8a86: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 8a89: ifne 8a8f
      // 8a8c: goto 8aa8
      // 8a8f: aload 8
      // 8a91: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 8a94: astore 15
      // 8a96: aload 15
      // 8a98: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 8a9b: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightBlue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 8a9e: bipush 0
      // 8a9f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 8aa2: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 8aa5: goto 8aa8
      // 8aa8: goto 8aab
      // 8aab: aload 8
      // 8aad: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 8ab0: ifne 8ab6
      // 8ab3: goto 8ad8
      // 8ab6: aload 8
      // 8ab8: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 8abb: astore 14
      // 8abd: aload 14
      // 8abf: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 8ac2: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Pink_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 8ac5: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 8ac8: checkcast java/lang/Boolean
      // 8acb: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 8ace: ifne 8ad4
      // 8ad1: goto 8ad8
      // 8ad4: bipush 1
      // 8ad5: goto 8ad9
      // 8ad8: bipush 0
      // 8ad9: bipush 1
      // 8ada: if_icmpeq 8ae0
      // 8add: goto 8b43
      // 8ae0: aload 1
      // 8ae1: instanceof net/minecraft/server/level/ServerLevel
      // 8ae4: ifne 8aea
      // 8ae7: goto 8b1c
      // 8aea: aload 1
      // 8aeb: checkcast net/minecraft/server/level/ServerLevel
      // 8aee: astore 15
      // 8af0: new net/minecraft/world/entity/item/ItemEntity
      // 8af3: dup
      // 8af4: aload 15
      // 8af6: dload 2
      // 8af7: dload 4
      // 8af9: dload 6
      // 8afb: new net/minecraft/world/item/ItemStack
      // 8afe: dup
      // 8aff: getstatic net/minecraft/world/level/block/Blocks.PINK_WOOL Lnet/minecraft/world/level/block/Block;
      // 8b02: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 8b05: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 8b08: astore 16
      // 8b0a: aload 16
      // 8b0c: bipush 10
      // 8b0e: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 8b11: aload 15
      // 8b13: aload 16
      // 8b15: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 8b18: pop
      // 8b19: goto 8b1c
      // 8b1c: aload 8
      // 8b1e: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 8b21: ifne 8b27
      // 8b24: goto 8b40
      // 8b27: aload 8
      // 8b29: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 8b2c: astore 15
      // 8b2e: aload 15
      // 8b30: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 8b33: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Pink_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 8b36: bipush 0
      // 8b37: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 8b3a: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 8b3d: goto 8b40
      // 8b40: goto 8b43
      // 8b43: aload 8
      // 8b45: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 8b48: ifne 8b4e
      // 8b4b: goto 8b70
      // 8b4e: aload 8
      // 8b50: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 8b53: astore 14
      // 8b55: aload 14
      // 8b57: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 8b5a: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Magenta_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 8b5d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 8b60: checkcast java/lang/Boolean
      // 8b63: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 8b66: ifne 8b6c
      // 8b69: goto 8b70
      // 8b6c: bipush 1
      // 8b6d: goto 8b71
      // 8b70: bipush 0
      // 8b71: bipush 1
      // 8b72: if_icmpeq 8b78
      // 8b75: goto 8bdb
      // 8b78: aload 1
      // 8b79: instanceof net/minecraft/server/level/ServerLevel
      // 8b7c: ifne 8b82
      // 8b7f: goto 8bb4
      // 8b82: aload 1
      // 8b83: checkcast net/minecraft/server/level/ServerLevel
      // 8b86: astore 15
      // 8b88: new net/minecraft/world/entity/item/ItemEntity
      // 8b8b: dup
      // 8b8c: aload 15
      // 8b8e: dload 2
      // 8b8f: dload 4
      // 8b91: dload 6
      // 8b93: new net/minecraft/world/item/ItemStack
      // 8b96: dup
      // 8b97: getstatic net/minecraft/world/level/block/Blocks.MAGENTA_WOOL Lnet/minecraft/world/level/block/Block;
      // 8b9a: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 8b9d: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 8ba0: astore 16
      // 8ba2: aload 16
      // 8ba4: bipush 10
      // 8ba6: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 8ba9: aload 15
      // 8bab: aload 16
      // 8bad: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 8bb0: pop
      // 8bb1: goto 8bb4
      // 8bb4: aload 8
      // 8bb6: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 8bb9: ifne 8bbf
      // 8bbc: goto 8bd8
      // 8bbf: aload 8
      // 8bc1: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 8bc4: astore 15
      // 8bc6: aload 15
      // 8bc8: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 8bcb: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Magenta_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 8bce: bipush 0
      // 8bcf: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 8bd2: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 8bd5: goto 8bd8
      // 8bd8: goto 8bdb
      // 8bdb: aload 8
      // 8bdd: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 8be0: ifne 8be6
      // 8be3: goto 8c08
      // 8be6: aload 8
      // 8be8: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 8beb: astore 14
      // 8bed: aload 14
      // 8bef: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 8bf2: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Purple_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 8bf5: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 8bf8: checkcast java/lang/Boolean
      // 8bfb: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 8bfe: ifne 8c04
      // 8c01: goto 8c08
      // 8c04: bipush 1
      // 8c05: goto 8c09
      // 8c08: bipush 0
      // 8c09: bipush 1
      // 8c0a: if_icmpeq 8c10
      // 8c0d: goto 8c73
      // 8c10: aload 1
      // 8c11: instanceof net/minecraft/server/level/ServerLevel
      // 8c14: ifne 8c1a
      // 8c17: goto 8c4c
      // 8c1a: aload 1
      // 8c1b: checkcast net/minecraft/server/level/ServerLevel
      // 8c1e: astore 15
      // 8c20: new net/minecraft/world/entity/item/ItemEntity
      // 8c23: dup
      // 8c24: aload 15
      // 8c26: dload 2
      // 8c27: dload 4
      // 8c29: dload 6
      // 8c2b: new net/minecraft/world/item/ItemStack
      // 8c2e: dup
      // 8c2f: getstatic net/minecraft/world/level/block/Blocks.PURPLE_WOOL Lnet/minecraft/world/level/block/Block;
      // 8c32: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 8c35: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 8c38: astore 16
      // 8c3a: aload 16
      // 8c3c: bipush 10
      // 8c3e: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 8c41: aload 15
      // 8c43: aload 16
      // 8c45: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 8c48: pop
      // 8c49: goto 8c4c
      // 8c4c: aload 8
      // 8c4e: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 8c51: ifne 8c57
      // 8c54: goto 8c70
      // 8c57: aload 8
      // 8c59: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 8c5c: astore 15
      // 8c5e: aload 15
      // 8c60: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 8c63: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Purple_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 8c66: bipush 0
      // 8c67: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 8c6a: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 8c6d: goto 8c70
      // 8c70: goto 8c73
      // 8c73: aload 8
      // 8c75: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 8c78: ifne 8c7e
      // 8c7b: goto 8ca0
      // 8c7e: aload 8
      // 8c80: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 8c83: astore 14
      // 8c85: aload 14
      // 8c87: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 8c8a: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Orange_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 8c8d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 8c90: checkcast java/lang/Boolean
      // 8c93: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 8c96: ifne 8c9c
      // 8c99: goto 8ca0
      // 8c9c: bipush 1
      // 8c9d: goto 8ca1
      // 8ca0: bipush 0
      // 8ca1: bipush 1
      // 8ca2: if_icmpeq 8ca8
      // 8ca5: goto 8d0b
      // 8ca8: aload 1
      // 8ca9: instanceof net/minecraft/server/level/ServerLevel
      // 8cac: ifne 8cb2
      // 8caf: goto 8ce4
      // 8cb2: aload 1
      // 8cb3: checkcast net/minecraft/server/level/ServerLevel
      // 8cb6: astore 15
      // 8cb8: new net/minecraft/world/entity/item/ItemEntity
      // 8cbb: dup
      // 8cbc: aload 15
      // 8cbe: dload 2
      // 8cbf: dload 4
      // 8cc1: dload 6
      // 8cc3: new net/minecraft/world/item/ItemStack
      // 8cc6: dup
      // 8cc7: getstatic net/minecraft/world/level/block/Blocks.ORANGE_WOOL Lnet/minecraft/world/level/block/Block;
      // 8cca: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 8ccd: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 8cd0: astore 16
      // 8cd2: aload 16
      // 8cd4: bipush 10
      // 8cd6: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 8cd9: aload 15
      // 8cdb: aload 16
      // 8cdd: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 8ce0: pop
      // 8ce1: goto 8ce4
      // 8ce4: aload 8
      // 8ce6: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 8ce9: ifne 8cef
      // 8cec: goto 8d08
      // 8cef: aload 8
      // 8cf1: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 8cf4: astore 15
      // 8cf6: aload 15
      // 8cf8: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 8cfb: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Orange_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 8cfe: bipush 0
      // 8cff: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 8d02: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 8d05: goto 8d08
      // 8d08: goto 8d0b
      // 8d0b: aload 8
      // 8d0d: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 8d10: ifne 8d16
      // 8d13: goto 8d38
      // 8d16: aload 8
      // 8d18: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 8d1b: astore 14
      // 8d1d: aload 14
      // 8d1f: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 8d22: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Cyan_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 8d25: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 8d28: checkcast java/lang/Boolean
      // 8d2b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 8d2e: ifne 8d34
      // 8d31: goto 8d38
      // 8d34: bipush 1
      // 8d35: goto 8d39
      // 8d38: bipush 0
      // 8d39: bipush 1
      // 8d3a: if_icmpeq 8d40
      // 8d3d: goto 8da3
      // 8d40: aload 1
      // 8d41: instanceof net/minecraft/server/level/ServerLevel
      // 8d44: ifne 8d4a
      // 8d47: goto 8d7c
      // 8d4a: aload 1
      // 8d4b: checkcast net/minecraft/server/level/ServerLevel
      // 8d4e: astore 15
      // 8d50: new net/minecraft/world/entity/item/ItemEntity
      // 8d53: dup
      // 8d54: aload 15
      // 8d56: dload 2
      // 8d57: dload 4
      // 8d59: dload 6
      // 8d5b: new net/minecraft/world/item/ItemStack
      // 8d5e: dup
      // 8d5f: getstatic net/minecraft/world/level/block/Blocks.CYAN_WOOL Lnet/minecraft/world/level/block/Block;
      // 8d62: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 8d65: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 8d68: astore 16
      // 8d6a: aload 16
      // 8d6c: bipush 10
      // 8d6e: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 8d71: aload 15
      // 8d73: aload 16
      // 8d75: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 8d78: pop
      // 8d79: goto 8d7c
      // 8d7c: aload 8
      // 8d7e: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 8d81: ifne 8d87
      // 8d84: goto 8da0
      // 8d87: aload 8
      // 8d89: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 8d8c: astore 15
      // 8d8e: aload 15
      // 8d90: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 8d93: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Cyan_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 8d96: bipush 0
      // 8d97: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 8d9a: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 8d9d: goto 8da0
      // 8da0: goto 8da3
      // 8da3: aload 8
      // 8da5: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 8da8: ifne 8dae
      // 8dab: goto 8dd0
      // 8dae: aload 8
      // 8db0: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 8db3: astore 14
      // 8db5: aload 14
      // 8db7: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 8dba: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Red_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 8dbd: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 8dc0: checkcast java/lang/Boolean
      // 8dc3: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 8dc6: ifne 8dcc
      // 8dc9: goto 8dd0
      // 8dcc: bipush 1
      // 8dcd: goto 8dd1
      // 8dd0: bipush 0
      // 8dd1: bipush 1
      // 8dd2: if_icmpeq 8dd8
      // 8dd5: goto 8e3b
      // 8dd8: aload 1
      // 8dd9: instanceof net/minecraft/server/level/ServerLevel
      // 8ddc: ifne 8de2
      // 8ddf: goto 8e14
      // 8de2: aload 1
      // 8de3: checkcast net/minecraft/server/level/ServerLevel
      // 8de6: astore 15
      // 8de8: new net/minecraft/world/entity/item/ItemEntity
      // 8deb: dup
      // 8dec: aload 15
      // 8dee: dload 2
      // 8def: dload 4
      // 8df1: dload 6
      // 8df3: new net/minecraft/world/item/ItemStack
      // 8df6: dup
      // 8df7: getstatic net/minecraft/world/level/block/Blocks.RED_WOOL Lnet/minecraft/world/level/block/Block;
      // 8dfa: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 8dfd: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 8e00: astore 16
      // 8e02: aload 16
      // 8e04: bipush 10
      // 8e06: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 8e09: aload 15
      // 8e0b: aload 16
      // 8e0d: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 8e10: pop
      // 8e11: goto 8e14
      // 8e14: aload 8
      // 8e16: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 8e19: ifne 8e1f
      // 8e1c: goto 8e38
      // 8e1f: aload 8
      // 8e21: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 8e24: astore 15
      // 8e26: aload 15
      // 8e28: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 8e2b: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Red_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 8e2e: bipush 0
      // 8e2f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 8e32: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 8e35: goto 8e38
      // 8e38: goto 8e3b
      // 8e3b: aload 8
      // 8e3d: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 8e40: ifne 8e46
      // 8e43: goto 8e68
      // 8e46: aload 8
      // 8e48: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 8e4b: astore 14
      // 8e4d: aload 14
      // 8e4f: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 8e52: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Yellow_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 8e55: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 8e58: checkcast java/lang/Boolean
      // 8e5b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 8e5e: ifne 8e64
      // 8e61: goto 8e68
      // 8e64: bipush 1
      // 8e65: goto 8e69
      // 8e68: bipush 0
      // 8e69: bipush 1
      // 8e6a: if_icmpeq 8e70
      // 8e6d: goto 8ed3
      // 8e70: aload 1
      // 8e71: instanceof net/minecraft/server/level/ServerLevel
      // 8e74: ifne 8e7a
      // 8e77: goto 8eac
      // 8e7a: aload 1
      // 8e7b: checkcast net/minecraft/server/level/ServerLevel
      // 8e7e: astore 15
      // 8e80: new net/minecraft/world/entity/item/ItemEntity
      // 8e83: dup
      // 8e84: aload 15
      // 8e86: dload 2
      // 8e87: dload 4
      // 8e89: dload 6
      // 8e8b: new net/minecraft/world/item/ItemStack
      // 8e8e: dup
      // 8e8f: getstatic net/minecraft/world/level/block/Blocks.YELLOW_WOOL Lnet/minecraft/world/level/block/Block;
      // 8e92: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 8e95: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 8e98: astore 16
      // 8e9a: aload 16
      // 8e9c: bipush 10
      // 8e9e: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 8ea1: aload 15
      // 8ea3: aload 16
      // 8ea5: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 8ea8: pop
      // 8ea9: goto 8eac
      // 8eac: aload 8
      // 8eae: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 8eb1: ifne 8eb7
      // 8eb4: goto 8ed0
      // 8eb7: aload 8
      // 8eb9: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 8ebc: astore 15
      // 8ebe: aload 15
      // 8ec0: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 8ec3: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Yellow_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 8ec6: bipush 0
      // 8ec7: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 8eca: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 8ecd: goto 8ed0
      // 8ed0: goto 8ed3
      // 8ed3: aload 8
      // 8ed5: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 8ed8: ifne 8ede
      // 8edb: goto 8f00
      // 8ede: aload 8
      // 8ee0: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 8ee3: astore 14
      // 8ee5: aload 14
      // 8ee7: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 8eea: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_White_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 8eed: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 8ef0: checkcast java/lang/Boolean
      // 8ef3: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 8ef6: ifne 8efc
      // 8ef9: goto 8f00
      // 8efc: bipush 1
      // 8efd: goto 8f01
      // 8f00: bipush 0
      // 8f01: bipush 1
      // 8f02: if_icmpeq 8f08
      // 8f05: goto 8f6b
      // 8f08: aload 1
      // 8f09: instanceof net/minecraft/server/level/ServerLevel
      // 8f0c: ifne 8f12
      // 8f0f: goto 8f44
      // 8f12: aload 1
      // 8f13: checkcast net/minecraft/server/level/ServerLevel
      // 8f16: astore 15
      // 8f18: new net/minecraft/world/entity/item/ItemEntity
      // 8f1b: dup
      // 8f1c: aload 15
      // 8f1e: dload 2
      // 8f1f: dload 4
      // 8f21: dload 6
      // 8f23: new net/minecraft/world/item/ItemStack
      // 8f26: dup
      // 8f27: getstatic net/minecraft/world/level/block/Blocks.WHITE_WOOL Lnet/minecraft/world/level/block/Block;
      // 8f2a: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 8f2d: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 8f30: astore 16
      // 8f32: aload 16
      // 8f34: bipush 10
      // 8f36: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 8f39: aload 15
      // 8f3b: aload 16
      // 8f3d: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 8f40: pop
      // 8f41: goto 8f44
      // 8f44: aload 8
      // 8f46: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 8f49: ifne 8f4f
      // 8f4c: goto 8f68
      // 8f4f: aload 8
      // 8f51: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 8f54: astore 15
      // 8f56: aload 15
      // 8f58: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 8f5b: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_White_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 8f5e: bipush 0
      // 8f5f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 8f62: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 8f65: goto 8f68
      // 8f68: goto 8f6b
      // 8f6b: aload 8
      // 8f6d: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 8f70: ifne 8f76
      // 8f73: goto 8f98
      // 8f76: aload 8
      // 8f78: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 8f7b: astore 14
      // 8f7d: aload 14
      // 8f7f: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 8f82: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Grey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 8f85: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 8f88: checkcast java/lang/Boolean
      // 8f8b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 8f8e: ifne 8f94
      // 8f91: goto 8f98
      // 8f94: bipush 1
      // 8f95: goto 8f99
      // 8f98: bipush 0
      // 8f99: bipush 1
      // 8f9a: if_icmpeq 8fa0
      // 8f9d: goto 9003
      // 8fa0: aload 1
      // 8fa1: instanceof net/minecraft/server/level/ServerLevel
      // 8fa4: ifne 8faa
      // 8fa7: goto 8fdc
      // 8faa: aload 1
      // 8fab: checkcast net/minecraft/server/level/ServerLevel
      // 8fae: astore 15
      // 8fb0: new net/minecraft/world/entity/item/ItemEntity
      // 8fb3: dup
      // 8fb4: aload 15
      // 8fb6: dload 2
      // 8fb7: dload 4
      // 8fb9: dload 6
      // 8fbb: new net/minecraft/world/item/ItemStack
      // 8fbe: dup
      // 8fbf: getstatic net/minecraft/world/level/block/Blocks.GRAY_WOOL Lnet/minecraft/world/level/block/Block;
      // 8fc2: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 8fc5: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 8fc8: astore 16
      // 8fca: aload 16
      // 8fcc: bipush 10
      // 8fce: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 8fd1: aload 15
      // 8fd3: aload 16
      // 8fd5: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 8fd8: pop
      // 8fd9: goto 8fdc
      // 8fdc: aload 8
      // 8fde: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 8fe1: ifne 8fe7
      // 8fe4: goto 9000
      // 8fe7: aload 8
      // 8fe9: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 8fec: astore 15
      // 8fee: aload 15
      // 8ff0: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 8ff3: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Grey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 8ff6: bipush 0
      // 8ff7: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 8ffa: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 8ffd: goto 9000
      // 9000: goto 9003
      // 9003: aload 8
      // 9005: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 9008: ifne 900e
      // 900b: goto 9030
      // 900e: aload 8
      // 9010: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 9013: astore 14
      // 9015: aload 14
      // 9017: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 901a: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGrey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 901d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 9020: checkcast java/lang/Boolean
      // 9023: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 9026: ifne 902c
      // 9029: goto 9030
      // 902c: bipush 1
      // 902d: goto 9031
      // 9030: bipush 0
      // 9031: bipush 1
      // 9032: if_icmpeq 9038
      // 9035: goto 909b
      // 9038: aload 1
      // 9039: instanceof net/minecraft/server/level/ServerLevel
      // 903c: ifne 9042
      // 903f: goto 9074
      // 9042: aload 1
      // 9043: checkcast net/minecraft/server/level/ServerLevel
      // 9046: astore 15
      // 9048: new net/minecraft/world/entity/item/ItemEntity
      // 904b: dup
      // 904c: aload 15
      // 904e: dload 2
      // 904f: dload 4
      // 9051: dload 6
      // 9053: new net/minecraft/world/item/ItemStack
      // 9056: dup
      // 9057: getstatic net/minecraft/world/level/block/Blocks.LIGHT_GRAY_WOOL Lnet/minecraft/world/level/block/Block;
      // 905a: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 905d: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 9060: astore 16
      // 9062: aload 16
      // 9064: bipush 10
      // 9066: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 9069: aload 15
      // 906b: aload 16
      // 906d: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 9070: pop
      // 9071: goto 9074
      // 9074: aload 8
      // 9076: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 9079: ifne 907f
      // 907c: goto 9098
      // 907f: aload 8
      // 9081: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 9084: astore 15
      // 9086: aload 15
      // 9088: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 908b: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGrey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 908e: bipush 0
      // 908f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 9092: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 9095: goto 9098
      // 9098: goto 909b
      // 909b: aload 8
      // 909d: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 90a0: ifne 90a6
      // 90a3: goto 90c8
      // 90a6: aload 8
      // 90a8: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 90ab: astore 14
      // 90ad: aload 14
      // 90af: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 90b2: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Brown_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 90b5: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 90b8: checkcast java/lang/Boolean
      // 90bb: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 90be: ifne 90c4
      // 90c1: goto 90c8
      // 90c4: bipush 1
      // 90c5: goto 90c9
      // 90c8: bipush 0
      // 90c9: bipush 1
      // 90ca: if_icmpeq 90d0
      // 90cd: goto 9133
      // 90d0: aload 1
      // 90d1: instanceof net/minecraft/server/level/ServerLevel
      // 90d4: ifne 90da
      // 90d7: goto 910c
      // 90da: aload 1
      // 90db: checkcast net/minecraft/server/level/ServerLevel
      // 90de: astore 15
      // 90e0: new net/minecraft/world/entity/item/ItemEntity
      // 90e3: dup
      // 90e4: aload 15
      // 90e6: dload 2
      // 90e7: dload 4
      // 90e9: dload 6
      // 90eb: new net/minecraft/world/item/ItemStack
      // 90ee: dup
      // 90ef: getstatic net/minecraft/world/level/block/Blocks.BROWN_WOOL Lnet/minecraft/world/level/block/Block;
      // 90f2: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 90f5: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 90f8: astore 16
      // 90fa: aload 16
      // 90fc: bipush 10
      // 90fe: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 9101: aload 15
      // 9103: aload 16
      // 9105: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 9108: pop
      // 9109: goto 910c
      // 910c: aload 8
      // 910e: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 9111: ifne 9117
      // 9114: goto 9130
      // 9117: aload 8
      // 9119: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 911c: astore 15
      // 911e: aload 15
      // 9120: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 9123: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Brown_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 9126: bipush 0
      // 9127: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 912a: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 912d: goto 9130
      // 9130: goto 9133
      // 9133: aload 8
      // 9135: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 9138: ifne 913e
      // 913b: goto 9160
      // 913e: aload 8
      // 9140: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 9143: astore 12
      // 9145: aload 12
      // 9147: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 914a: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Brown_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 914d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 9150: checkcast java/lang/Boolean
      // 9153: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 9156: ifne 915c
      // 9159: goto 9160
      // 915c: bipush 1
      // 915d: goto 9161
      // 9160: bipush 0
      // 9161: ifeq 9167
      // 9164: goto 9ad9
      // 9167: aload 9
      // 9169: instanceof net/minecraft/world/entity/LivingEntity
      // 916c: ifne 9172
      // 916f: goto 9181
      // 9172: aload 9
      // 9174: checkcast net/minecraft/world/entity/LivingEntity
      // 9177: astore 13
      // 9179: aload 13
      // 917b: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 917e: goto 9184
      // 9181: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 9184: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 9187: getstatic net/minecraft/world/level/block/Blocks.BROWN_WOOL Lnet/minecraft/world/level/block/Block;
      // 918a: invokevirtual net/minecraft/world/level/block/Block.asItem ()Lnet/minecraft/world/item/Item;
      // 918d: if_acmpeq 9193
      // 9190: goto 9ad9
      // 9193: aload 9
      // 9195: instanceof net/minecraft/world/entity/player/Player
      // 9198: ifne 919e
      // 919b: goto 91cd
      // 919e: aload 9
      // 91a0: checkcast net/minecraft/world/entity/player/Player
      // 91a3: astore 14
      // 91a5: new net/minecraft/world/item/ItemStack
      // 91a8: dup
      // 91a9: getstatic net/minecraft/world/level/block/Blocks.BROWN_WOOL Lnet/minecraft/world/level/block/Block;
      // 91ac: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 91af: astore 15
      // 91b1: aload 14
      // 91b3: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 91b6: aload 15
      // 91b8: invokedynamic test (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, net/mocreatures/procedures/UndeadOstrichEquipmentSwapProcedure.lambda$execute$15 (Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z, (Lnet/minecraft/world/item/ItemStack;)Z ]
      // 91bd: bipush 1
      // 91be: aload 14
      // 91c0: getfield net/minecraft/world/entity/player/Player.inventoryMenu Lnet/minecraft/world/inventory/InventoryMenu;
      // 91c3: invokevirtual net/minecraft/world/inventory/InventoryMenu.getCraftSlots ()Lnet/minecraft/world/inventory/CraftingContainer;
      // 91c6: invokevirtual net/minecraft/world/entity/player/Inventory.clearOrCountMatchingItems (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
      // 91c9: pop
      // 91ca: goto 91cd
      // 91cd: aload 8
      // 91cf: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 91d2: ifne 91d8
      // 91d5: goto 91f1
      // 91d8: aload 8
      // 91da: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 91dd: astore 14
      // 91df: aload 14
      // 91e1: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 91e4: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Brown_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 91e7: bipush 1
      // 91e8: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 91eb: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 91ee: goto 91f1
      // 91f1: aload 8
      // 91f3: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 91f6: ifne 91fc
      // 91f9: goto 921e
      // 91fc: aload 8
      // 91fe: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 9201: astore 14
      // 9203: aload 14
      // 9205: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 9208: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Green_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 920b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 920e: checkcast java/lang/Boolean
      // 9211: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 9214: ifne 921a
      // 9217: goto 921e
      // 921a: bipush 1
      // 921b: goto 921f
      // 921e: bipush 0
      // 921f: bipush 1
      // 9220: if_icmpeq 9226
      // 9223: goto 9289
      // 9226: aload 1
      // 9227: instanceof net/minecraft/server/level/ServerLevel
      // 922a: ifne 9230
      // 922d: goto 9262
      // 9230: aload 1
      // 9231: checkcast net/minecraft/server/level/ServerLevel
      // 9234: astore 15
      // 9236: new net/minecraft/world/entity/item/ItemEntity
      // 9239: dup
      // 923a: aload 15
      // 923c: dload 2
      // 923d: dload 4
      // 923f: dload 6
      // 9241: new net/minecraft/world/item/ItemStack
      // 9244: dup
      // 9245: getstatic net/minecraft/world/level/block/Blocks.GREEN_WOOL Lnet/minecraft/world/level/block/Block;
      // 9248: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 924b: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 924e: astore 16
      // 9250: aload 16
      // 9252: bipush 10
      // 9254: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 9257: aload 15
      // 9259: aload 16
      // 925b: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 925e: pop
      // 925f: goto 9262
      // 9262: aload 8
      // 9264: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 9267: ifne 926d
      // 926a: goto 9286
      // 926d: aload 8
      // 926f: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 9272: astore 15
      // 9274: aload 15
      // 9276: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 9279: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Green_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 927c: bipush 0
      // 927d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 9280: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 9283: goto 9286
      // 9286: goto 9289
      // 9289: aload 8
      // 928b: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 928e: ifne 9294
      // 9291: goto 92b6
      // 9294: aload 8
      // 9296: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 9299: astore 14
      // 929b: aload 14
      // 929d: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 92a0: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGreen_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 92a3: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 92a6: checkcast java/lang/Boolean
      // 92a9: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 92ac: ifne 92b2
      // 92af: goto 92b6
      // 92b2: bipush 1
      // 92b3: goto 92b7
      // 92b6: bipush 0
      // 92b7: bipush 1
      // 92b8: if_icmpeq 92be
      // 92bb: goto 9321
      // 92be: aload 1
      // 92bf: instanceof net/minecraft/server/level/ServerLevel
      // 92c2: ifne 92c8
      // 92c5: goto 92fa
      // 92c8: aload 1
      // 92c9: checkcast net/minecraft/server/level/ServerLevel
      // 92cc: astore 15
      // 92ce: new net/minecraft/world/entity/item/ItemEntity
      // 92d1: dup
      // 92d2: aload 15
      // 92d4: dload 2
      // 92d5: dload 4
      // 92d7: dload 6
      // 92d9: new net/minecraft/world/item/ItemStack
      // 92dc: dup
      // 92dd: getstatic net/minecraft/world/level/block/Blocks.LIME_WOOL Lnet/minecraft/world/level/block/Block;
      // 92e0: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 92e3: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 92e6: astore 16
      // 92e8: aload 16
      // 92ea: bipush 10
      // 92ec: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 92ef: aload 15
      // 92f1: aload 16
      // 92f3: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 92f6: pop
      // 92f7: goto 92fa
      // 92fa: aload 8
      // 92fc: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 92ff: ifne 9305
      // 9302: goto 931e
      // 9305: aload 8
      // 9307: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 930a: astore 15
      // 930c: aload 15
      // 930e: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 9311: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGreen_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 9314: bipush 0
      // 9315: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 9318: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 931b: goto 931e
      // 931e: goto 9321
      // 9321: aload 8
      // 9323: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 9326: ifne 932c
      // 9329: goto 934e
      // 932c: aload 8
      // 932e: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 9331: astore 14
      // 9333: aload 14
      // 9335: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 9338: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Blue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 933b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 933e: checkcast java/lang/Boolean
      // 9341: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 9344: ifne 934a
      // 9347: goto 934e
      // 934a: bipush 1
      // 934b: goto 934f
      // 934e: bipush 0
      // 934f: bipush 1
      // 9350: if_icmpeq 9356
      // 9353: goto 93b9
      // 9356: aload 1
      // 9357: instanceof net/minecraft/server/level/ServerLevel
      // 935a: ifne 9360
      // 935d: goto 9392
      // 9360: aload 1
      // 9361: checkcast net/minecraft/server/level/ServerLevel
      // 9364: astore 15
      // 9366: new net/minecraft/world/entity/item/ItemEntity
      // 9369: dup
      // 936a: aload 15
      // 936c: dload 2
      // 936d: dload 4
      // 936f: dload 6
      // 9371: new net/minecraft/world/item/ItemStack
      // 9374: dup
      // 9375: getstatic net/minecraft/world/level/block/Blocks.BLUE_WOOL Lnet/minecraft/world/level/block/Block;
      // 9378: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 937b: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 937e: astore 16
      // 9380: aload 16
      // 9382: bipush 10
      // 9384: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 9387: aload 15
      // 9389: aload 16
      // 938b: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 938e: pop
      // 938f: goto 9392
      // 9392: aload 8
      // 9394: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 9397: ifne 939d
      // 939a: goto 93b6
      // 939d: aload 8
      // 939f: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 93a2: astore 15
      // 93a4: aload 15
      // 93a6: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 93a9: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Blue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 93ac: bipush 0
      // 93ad: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 93b0: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 93b3: goto 93b6
      // 93b6: goto 93b9
      // 93b9: aload 8
      // 93bb: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 93be: ifne 93c4
      // 93c1: goto 93e6
      // 93c4: aload 8
      // 93c6: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 93c9: astore 14
      // 93cb: aload 14
      // 93cd: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 93d0: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightBlue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 93d3: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 93d6: checkcast java/lang/Boolean
      // 93d9: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 93dc: ifne 93e2
      // 93df: goto 93e6
      // 93e2: bipush 1
      // 93e3: goto 93e7
      // 93e6: bipush 0
      // 93e7: bipush 1
      // 93e8: if_icmpeq 93ee
      // 93eb: goto 9451
      // 93ee: aload 1
      // 93ef: instanceof net/minecraft/server/level/ServerLevel
      // 93f2: ifne 93f8
      // 93f5: goto 942a
      // 93f8: aload 1
      // 93f9: checkcast net/minecraft/server/level/ServerLevel
      // 93fc: astore 15
      // 93fe: new net/minecraft/world/entity/item/ItemEntity
      // 9401: dup
      // 9402: aload 15
      // 9404: dload 2
      // 9405: dload 4
      // 9407: dload 6
      // 9409: new net/minecraft/world/item/ItemStack
      // 940c: dup
      // 940d: getstatic net/minecraft/world/level/block/Blocks.LIGHT_BLUE_WOOL Lnet/minecraft/world/level/block/Block;
      // 9410: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 9413: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 9416: astore 16
      // 9418: aload 16
      // 941a: bipush 10
      // 941c: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 941f: aload 15
      // 9421: aload 16
      // 9423: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 9426: pop
      // 9427: goto 942a
      // 942a: aload 8
      // 942c: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 942f: ifne 9435
      // 9432: goto 944e
      // 9435: aload 8
      // 9437: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 943a: astore 15
      // 943c: aload 15
      // 943e: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 9441: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightBlue_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 9444: bipush 0
      // 9445: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 9448: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 944b: goto 944e
      // 944e: goto 9451
      // 9451: aload 8
      // 9453: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 9456: ifne 945c
      // 9459: goto 947e
      // 945c: aload 8
      // 945e: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 9461: astore 14
      // 9463: aload 14
      // 9465: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 9468: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Pink_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 946b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 946e: checkcast java/lang/Boolean
      // 9471: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 9474: ifne 947a
      // 9477: goto 947e
      // 947a: bipush 1
      // 947b: goto 947f
      // 947e: bipush 0
      // 947f: bipush 1
      // 9480: if_icmpeq 9486
      // 9483: goto 94e9
      // 9486: aload 1
      // 9487: instanceof net/minecraft/server/level/ServerLevel
      // 948a: ifne 9490
      // 948d: goto 94c2
      // 9490: aload 1
      // 9491: checkcast net/minecraft/server/level/ServerLevel
      // 9494: astore 15
      // 9496: new net/minecraft/world/entity/item/ItemEntity
      // 9499: dup
      // 949a: aload 15
      // 949c: dload 2
      // 949d: dload 4
      // 949f: dload 6
      // 94a1: new net/minecraft/world/item/ItemStack
      // 94a4: dup
      // 94a5: getstatic net/minecraft/world/level/block/Blocks.PINK_WOOL Lnet/minecraft/world/level/block/Block;
      // 94a8: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 94ab: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 94ae: astore 16
      // 94b0: aload 16
      // 94b2: bipush 10
      // 94b4: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 94b7: aload 15
      // 94b9: aload 16
      // 94bb: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 94be: pop
      // 94bf: goto 94c2
      // 94c2: aload 8
      // 94c4: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 94c7: ifne 94cd
      // 94ca: goto 94e6
      // 94cd: aload 8
      // 94cf: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 94d2: astore 15
      // 94d4: aload 15
      // 94d6: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 94d9: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Pink_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 94dc: bipush 0
      // 94dd: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 94e0: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 94e3: goto 94e6
      // 94e6: goto 94e9
      // 94e9: aload 8
      // 94eb: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 94ee: ifne 94f4
      // 94f1: goto 9516
      // 94f4: aload 8
      // 94f6: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 94f9: astore 14
      // 94fb: aload 14
      // 94fd: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 9500: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Magenta_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 9503: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 9506: checkcast java/lang/Boolean
      // 9509: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 950c: ifne 9512
      // 950f: goto 9516
      // 9512: bipush 1
      // 9513: goto 9517
      // 9516: bipush 0
      // 9517: bipush 1
      // 9518: if_icmpeq 951e
      // 951b: goto 9581
      // 951e: aload 1
      // 951f: instanceof net/minecraft/server/level/ServerLevel
      // 9522: ifne 9528
      // 9525: goto 955a
      // 9528: aload 1
      // 9529: checkcast net/minecraft/server/level/ServerLevel
      // 952c: astore 15
      // 952e: new net/minecraft/world/entity/item/ItemEntity
      // 9531: dup
      // 9532: aload 15
      // 9534: dload 2
      // 9535: dload 4
      // 9537: dload 6
      // 9539: new net/minecraft/world/item/ItemStack
      // 953c: dup
      // 953d: getstatic net/minecraft/world/level/block/Blocks.MAGENTA_WOOL Lnet/minecraft/world/level/block/Block;
      // 9540: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 9543: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 9546: astore 16
      // 9548: aload 16
      // 954a: bipush 10
      // 954c: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 954f: aload 15
      // 9551: aload 16
      // 9553: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 9556: pop
      // 9557: goto 955a
      // 955a: aload 8
      // 955c: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 955f: ifne 9565
      // 9562: goto 957e
      // 9565: aload 8
      // 9567: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 956a: astore 15
      // 956c: aload 15
      // 956e: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 9571: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Magenta_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 9574: bipush 0
      // 9575: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 9578: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 957b: goto 957e
      // 957e: goto 9581
      // 9581: aload 8
      // 9583: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 9586: ifne 958c
      // 9589: goto 95ae
      // 958c: aload 8
      // 958e: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 9591: astore 14
      // 9593: aload 14
      // 9595: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 9598: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Purple_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 959b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 959e: checkcast java/lang/Boolean
      // 95a1: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 95a4: ifne 95aa
      // 95a7: goto 95ae
      // 95aa: bipush 1
      // 95ab: goto 95af
      // 95ae: bipush 0
      // 95af: bipush 1
      // 95b0: if_icmpeq 95b6
      // 95b3: goto 9619
      // 95b6: aload 1
      // 95b7: instanceof net/minecraft/server/level/ServerLevel
      // 95ba: ifne 95c0
      // 95bd: goto 95f2
      // 95c0: aload 1
      // 95c1: checkcast net/minecraft/server/level/ServerLevel
      // 95c4: astore 15
      // 95c6: new net/minecraft/world/entity/item/ItemEntity
      // 95c9: dup
      // 95ca: aload 15
      // 95cc: dload 2
      // 95cd: dload 4
      // 95cf: dload 6
      // 95d1: new net/minecraft/world/item/ItemStack
      // 95d4: dup
      // 95d5: getstatic net/minecraft/world/level/block/Blocks.PURPLE_WOOL Lnet/minecraft/world/level/block/Block;
      // 95d8: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 95db: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 95de: astore 16
      // 95e0: aload 16
      // 95e2: bipush 10
      // 95e4: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 95e7: aload 15
      // 95e9: aload 16
      // 95eb: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 95ee: pop
      // 95ef: goto 95f2
      // 95f2: aload 8
      // 95f4: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 95f7: ifne 95fd
      // 95fa: goto 9616
      // 95fd: aload 8
      // 95ff: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 9602: astore 15
      // 9604: aload 15
      // 9606: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 9609: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Purple_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 960c: bipush 0
      // 960d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 9610: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 9613: goto 9616
      // 9616: goto 9619
      // 9619: aload 8
      // 961b: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 961e: ifne 9624
      // 9621: goto 9646
      // 9624: aload 8
      // 9626: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 9629: astore 14
      // 962b: aload 14
      // 962d: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 9630: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Orange_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 9633: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 9636: checkcast java/lang/Boolean
      // 9639: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 963c: ifne 9642
      // 963f: goto 9646
      // 9642: bipush 1
      // 9643: goto 9647
      // 9646: bipush 0
      // 9647: bipush 1
      // 9648: if_icmpeq 964e
      // 964b: goto 96b1
      // 964e: aload 1
      // 964f: instanceof net/minecraft/server/level/ServerLevel
      // 9652: ifne 9658
      // 9655: goto 968a
      // 9658: aload 1
      // 9659: checkcast net/minecraft/server/level/ServerLevel
      // 965c: astore 15
      // 965e: new net/minecraft/world/entity/item/ItemEntity
      // 9661: dup
      // 9662: aload 15
      // 9664: dload 2
      // 9665: dload 4
      // 9667: dload 6
      // 9669: new net/minecraft/world/item/ItemStack
      // 966c: dup
      // 966d: getstatic net/minecraft/world/level/block/Blocks.ORANGE_WOOL Lnet/minecraft/world/level/block/Block;
      // 9670: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 9673: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 9676: astore 16
      // 9678: aload 16
      // 967a: bipush 10
      // 967c: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 967f: aload 15
      // 9681: aload 16
      // 9683: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 9686: pop
      // 9687: goto 968a
      // 968a: aload 8
      // 968c: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 968f: ifne 9695
      // 9692: goto 96ae
      // 9695: aload 8
      // 9697: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 969a: astore 15
      // 969c: aload 15
      // 969e: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 96a1: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Orange_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 96a4: bipush 0
      // 96a5: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 96a8: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 96ab: goto 96ae
      // 96ae: goto 96b1
      // 96b1: aload 8
      // 96b3: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 96b6: ifne 96bc
      // 96b9: goto 96de
      // 96bc: aload 8
      // 96be: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 96c1: astore 14
      // 96c3: aload 14
      // 96c5: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 96c8: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Cyan_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 96cb: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 96ce: checkcast java/lang/Boolean
      // 96d1: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 96d4: ifne 96da
      // 96d7: goto 96de
      // 96da: bipush 1
      // 96db: goto 96df
      // 96de: bipush 0
      // 96df: bipush 1
      // 96e0: if_icmpeq 96e6
      // 96e3: goto 9749
      // 96e6: aload 1
      // 96e7: instanceof net/minecraft/server/level/ServerLevel
      // 96ea: ifne 96f0
      // 96ed: goto 9722
      // 96f0: aload 1
      // 96f1: checkcast net/minecraft/server/level/ServerLevel
      // 96f4: astore 15
      // 96f6: new net/minecraft/world/entity/item/ItemEntity
      // 96f9: dup
      // 96fa: aload 15
      // 96fc: dload 2
      // 96fd: dload 4
      // 96ff: dload 6
      // 9701: new net/minecraft/world/item/ItemStack
      // 9704: dup
      // 9705: getstatic net/minecraft/world/level/block/Blocks.CYAN_WOOL Lnet/minecraft/world/level/block/Block;
      // 9708: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 970b: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 970e: astore 16
      // 9710: aload 16
      // 9712: bipush 10
      // 9714: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 9717: aload 15
      // 9719: aload 16
      // 971b: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 971e: pop
      // 971f: goto 9722
      // 9722: aload 8
      // 9724: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 9727: ifne 972d
      // 972a: goto 9746
      // 972d: aload 8
      // 972f: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 9732: astore 15
      // 9734: aload 15
      // 9736: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 9739: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Cyan_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 973c: bipush 0
      // 973d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 9740: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 9743: goto 9746
      // 9746: goto 9749
      // 9749: aload 8
      // 974b: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 974e: ifne 9754
      // 9751: goto 9776
      // 9754: aload 8
      // 9756: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 9759: astore 14
      // 975b: aload 14
      // 975d: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 9760: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Red_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 9763: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 9766: checkcast java/lang/Boolean
      // 9769: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 976c: ifne 9772
      // 976f: goto 9776
      // 9772: bipush 1
      // 9773: goto 9777
      // 9776: bipush 0
      // 9777: bipush 1
      // 9778: if_icmpeq 977e
      // 977b: goto 97e1
      // 977e: aload 1
      // 977f: instanceof net/minecraft/server/level/ServerLevel
      // 9782: ifne 9788
      // 9785: goto 97ba
      // 9788: aload 1
      // 9789: checkcast net/minecraft/server/level/ServerLevel
      // 978c: astore 15
      // 978e: new net/minecraft/world/entity/item/ItemEntity
      // 9791: dup
      // 9792: aload 15
      // 9794: dload 2
      // 9795: dload 4
      // 9797: dload 6
      // 9799: new net/minecraft/world/item/ItemStack
      // 979c: dup
      // 979d: getstatic net/minecraft/world/level/block/Blocks.RED_WOOL Lnet/minecraft/world/level/block/Block;
      // 97a0: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 97a3: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 97a6: astore 16
      // 97a8: aload 16
      // 97aa: bipush 10
      // 97ac: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 97af: aload 15
      // 97b1: aload 16
      // 97b3: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 97b6: pop
      // 97b7: goto 97ba
      // 97ba: aload 8
      // 97bc: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 97bf: ifne 97c5
      // 97c2: goto 97de
      // 97c5: aload 8
      // 97c7: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 97ca: astore 15
      // 97cc: aload 15
      // 97ce: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 97d1: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Red_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 97d4: bipush 0
      // 97d5: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 97d8: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 97db: goto 97de
      // 97de: goto 97e1
      // 97e1: aload 8
      // 97e3: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 97e6: ifne 97ec
      // 97e9: goto 980e
      // 97ec: aload 8
      // 97ee: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 97f1: astore 14
      // 97f3: aload 14
      // 97f5: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 97f8: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Yellow_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 97fb: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 97fe: checkcast java/lang/Boolean
      // 9801: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 9804: ifne 980a
      // 9807: goto 980e
      // 980a: bipush 1
      // 980b: goto 980f
      // 980e: bipush 0
      // 980f: bipush 1
      // 9810: if_icmpeq 9816
      // 9813: goto 9879
      // 9816: aload 1
      // 9817: instanceof net/minecraft/server/level/ServerLevel
      // 981a: ifne 9820
      // 981d: goto 9852
      // 9820: aload 1
      // 9821: checkcast net/minecraft/server/level/ServerLevel
      // 9824: astore 15
      // 9826: new net/minecraft/world/entity/item/ItemEntity
      // 9829: dup
      // 982a: aload 15
      // 982c: dload 2
      // 982d: dload 4
      // 982f: dload 6
      // 9831: new net/minecraft/world/item/ItemStack
      // 9834: dup
      // 9835: getstatic net/minecraft/world/level/block/Blocks.YELLOW_WOOL Lnet/minecraft/world/level/block/Block;
      // 9838: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 983b: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 983e: astore 16
      // 9840: aload 16
      // 9842: bipush 10
      // 9844: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 9847: aload 15
      // 9849: aload 16
      // 984b: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 984e: pop
      // 984f: goto 9852
      // 9852: aload 8
      // 9854: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 9857: ifne 985d
      // 985a: goto 9876
      // 985d: aload 8
      // 985f: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 9862: astore 15
      // 9864: aload 15
      // 9866: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 9869: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Yellow_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 986c: bipush 0
      // 986d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 9870: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 9873: goto 9876
      // 9876: goto 9879
      // 9879: aload 8
      // 987b: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 987e: ifne 9884
      // 9881: goto 98a6
      // 9884: aload 8
      // 9886: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 9889: astore 14
      // 988b: aload 14
      // 988d: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 9890: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_White_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 9893: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 9896: checkcast java/lang/Boolean
      // 9899: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 989c: ifne 98a2
      // 989f: goto 98a6
      // 98a2: bipush 1
      // 98a3: goto 98a7
      // 98a6: bipush 0
      // 98a7: bipush 1
      // 98a8: if_icmpeq 98ae
      // 98ab: goto 9911
      // 98ae: aload 1
      // 98af: instanceof net/minecraft/server/level/ServerLevel
      // 98b2: ifne 98b8
      // 98b5: goto 98ea
      // 98b8: aload 1
      // 98b9: checkcast net/minecraft/server/level/ServerLevel
      // 98bc: astore 15
      // 98be: new net/minecraft/world/entity/item/ItemEntity
      // 98c1: dup
      // 98c2: aload 15
      // 98c4: dload 2
      // 98c5: dload 4
      // 98c7: dload 6
      // 98c9: new net/minecraft/world/item/ItemStack
      // 98cc: dup
      // 98cd: getstatic net/minecraft/world/level/block/Blocks.WHITE_WOOL Lnet/minecraft/world/level/block/Block;
      // 98d0: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 98d3: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 98d6: astore 16
      // 98d8: aload 16
      // 98da: bipush 10
      // 98dc: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 98df: aload 15
      // 98e1: aload 16
      // 98e3: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 98e6: pop
      // 98e7: goto 98ea
      // 98ea: aload 8
      // 98ec: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 98ef: ifne 98f5
      // 98f2: goto 990e
      // 98f5: aload 8
      // 98f7: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 98fa: astore 15
      // 98fc: aload 15
      // 98fe: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 9901: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_White_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 9904: bipush 0
      // 9905: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 9908: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 990b: goto 990e
      // 990e: goto 9911
      // 9911: aload 8
      // 9913: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 9916: ifne 991c
      // 9919: goto 993e
      // 991c: aload 8
      // 991e: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 9921: astore 14
      // 9923: aload 14
      // 9925: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 9928: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Grey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 992b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 992e: checkcast java/lang/Boolean
      // 9931: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 9934: ifne 993a
      // 9937: goto 993e
      // 993a: bipush 1
      // 993b: goto 993f
      // 993e: bipush 0
      // 993f: bipush 1
      // 9940: if_icmpeq 9946
      // 9943: goto 99a9
      // 9946: aload 1
      // 9947: instanceof net/minecraft/server/level/ServerLevel
      // 994a: ifne 9950
      // 994d: goto 9982
      // 9950: aload 1
      // 9951: checkcast net/minecraft/server/level/ServerLevel
      // 9954: astore 15
      // 9956: new net/minecraft/world/entity/item/ItemEntity
      // 9959: dup
      // 995a: aload 15
      // 995c: dload 2
      // 995d: dload 4
      // 995f: dload 6
      // 9961: new net/minecraft/world/item/ItemStack
      // 9964: dup
      // 9965: getstatic net/minecraft/world/level/block/Blocks.GRAY_WOOL Lnet/minecraft/world/level/block/Block;
      // 9968: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 996b: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 996e: astore 16
      // 9970: aload 16
      // 9972: bipush 10
      // 9974: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 9977: aload 15
      // 9979: aload 16
      // 997b: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 997e: pop
      // 997f: goto 9982
      // 9982: aload 8
      // 9984: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 9987: ifne 998d
      // 998a: goto 99a6
      // 998d: aload 8
      // 998f: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 9992: astore 15
      // 9994: aload 15
      // 9996: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 9999: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Grey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 999c: bipush 0
      // 999d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 99a0: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 99a3: goto 99a6
      // 99a6: goto 99a9
      // 99a9: aload 8
      // 99ab: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 99ae: ifne 99b4
      // 99b1: goto 99d6
      // 99b4: aload 8
      // 99b6: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 99b9: astore 14
      // 99bb: aload 14
      // 99bd: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 99c0: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGrey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 99c3: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 99c6: checkcast java/lang/Boolean
      // 99c9: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 99cc: ifne 99d2
      // 99cf: goto 99d6
      // 99d2: bipush 1
      // 99d3: goto 99d7
      // 99d6: bipush 0
      // 99d7: bipush 1
      // 99d8: if_icmpeq 99de
      // 99db: goto 9a41
      // 99de: aload 1
      // 99df: instanceof net/minecraft/server/level/ServerLevel
      // 99e2: ifne 99e8
      // 99e5: goto 9a1a
      // 99e8: aload 1
      // 99e9: checkcast net/minecraft/server/level/ServerLevel
      // 99ec: astore 15
      // 99ee: new net/minecraft/world/entity/item/ItemEntity
      // 99f1: dup
      // 99f2: aload 15
      // 99f4: dload 2
      // 99f5: dload 4
      // 99f7: dload 6
      // 99f9: new net/minecraft/world/item/ItemStack
      // 99fc: dup
      // 99fd: getstatic net/minecraft/world/level/block/Blocks.LIGHT_GRAY_WOOL Lnet/minecraft/world/level/block/Block;
      // 9a00: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 9a03: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 9a06: astore 16
      // 9a08: aload 16
      // 9a0a: bipush 10
      // 9a0c: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 9a0f: aload 15
      // 9a11: aload 16
      // 9a13: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 9a16: pop
      // 9a17: goto 9a1a
      // 9a1a: aload 8
      // 9a1c: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 9a1f: ifne 9a25
      // 9a22: goto 9a3e
      // 9a25: aload 8
      // 9a27: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 9a2a: astore 15
      // 9a2c: aload 15
      // 9a2e: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 9a31: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_LightGrey_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 9a34: bipush 0
      // 9a35: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 9a38: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 9a3b: goto 9a3e
      // 9a3e: goto 9a41
      // 9a41: aload 8
      // 9a43: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 9a46: ifne 9a4c
      // 9a49: goto 9a6e
      // 9a4c: aload 8
      // 9a4e: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 9a51: astore 14
      // 9a53: aload 14
      // 9a55: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 9a58: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Black_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 9a5b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 9a5e: checkcast java/lang/Boolean
      // 9a61: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 9a64: ifne 9a6a
      // 9a67: goto 9a6e
      // 9a6a: bipush 1
      // 9a6b: goto 9a6f
      // 9a6e: bipush 0
      // 9a6f: bipush 1
      // 9a70: if_icmpeq 9a76
      // 9a73: goto 9ad9
      // 9a76: aload 1
      // 9a77: instanceof net/minecraft/server/level/ServerLevel
      // 9a7a: ifne 9a80
      // 9a7d: goto 9ab2
      // 9a80: aload 1
      // 9a81: checkcast net/minecraft/server/level/ServerLevel
      // 9a84: astore 15
      // 9a86: new net/minecraft/world/entity/item/ItemEntity
      // 9a89: dup
      // 9a8a: aload 15
      // 9a8c: dload 2
      // 9a8d: dload 4
      // 9a8f: dload 6
      // 9a91: new net/minecraft/world/item/ItemStack
      // 9a94: dup
      // 9a95: getstatic net/minecraft/world/level/block/Blocks.BLACK_WOOL Lnet/minecraft/world/level/block/Block;
      // 9a98: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 9a9b: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 9a9e: astore 16
      // 9aa0: aload 16
      // 9aa2: bipush 10
      // 9aa4: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 9aa7: aload 15
      // 9aa9: aload 16
      // 9aab: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 9aae: pop
      // 9aaf: goto 9ab2
      // 9ab2: aload 8
      // 9ab4: instanceof net/mocreatures/entity/UndeadOstrichEntity
      // 9ab7: ifne 9abd
      // 9aba: goto 9ad6
      // 9abd: aload 8
      // 9abf: checkcast net/mocreatures/entity/UndeadOstrichEntity
      // 9ac2: astore 15
      // 9ac4: aload 15
      // 9ac6: invokevirtual net/mocreatures/entity/UndeadOstrichEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 9ac9: getstatic net/mocreatures/entity/UndeadOstrichEntity.DATA_Black_Flag Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 9acc: bipush 0
      // 9acd: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 9ad0: invokevirtual net/minecraft/network/syncher/SynchedEntityData.set (Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V
      // 9ad3: goto 9ad6
      // 9ad6: goto 9ad9
      // 9ad9: return
   }
}
