package net.mocreatures.procedures;

import javax.annotation.Nullable;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent.EntityInteract;

@EventBusSubscriber
public class PetAmuletCapture2Procedure {
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
      //
      // Bytecode:
      // 0000: aload 8
      // 0002: ifnull 000a
      // 0005: aload 9
      // 0007: ifnonnull 000b
      // 000a: return
      // 000b: bipush 0
      // 000c: istore 10
      // 000e: aload 9
      // 0010: instanceof net/minecraft/world/entity/LivingEntity
      // 0013: ifeq 0025
      // 0016: aload 9
      // 0018: checkcast net/minecraft/world/entity/LivingEntity
      // 001b: astore 11
      // 001d: aload 11
      // 001f: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 0022: goto 0028
      // 0025: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 0028: ldc_w "mocreatures:amulet/empty"
      // 002b: invokestatic net/minecraft/resources/ResourceLocation.parse (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
      // 002e: invokestatic net/minecraft/tags/ItemTags.create (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
      // 0031: invokevirtual net/minecraft/world/item/ItemStack.is (Lnet/minecraft/tags/TagKey;)Z
      // 0034: ifeq 0ada
      // 0037: aload 8
      // 0039: invokevirtual net/minecraft/world/entity/Entity.getType ()Lnet/minecraft/world/entity/EntityType;
      // 003c: getstatic net/minecraft/core/registries/Registries.ENTITY_TYPE Lnet/minecraft/resources/ResourceKey;
      // 003f: ldc_w "mocreatures:wyvern"
      // 0042: invokestatic net/minecraft/resources/ResourceLocation.parse (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
      // 0045: invokestatic net/minecraft/tags/TagKey.create (Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
      // 0048: invokevirtual net/minecraft/world/entity/EntityType.is (Lnet/minecraft/tags/TagKey;)Z
      // 004b: ifeq 0ada
      // 004e: aload 8
      // 0050: instanceof net/minecraft/world/entity/TamableAnimal
      // 0053: ifeq 00b6
      // 0056: aload 8
      // 0058: checkcast net/minecraft/world/entity/TamableAnimal
      // 005b: astore 12
      // 005d: aload 12
      // 005f: invokevirtual net/minecraft/world/entity/TamableAnimal.isTame ()Z
      // 0062: ifeq 00b6
      // 0065: aload 8
      // 0067: instanceof net/mocreatures/entity/WyvernEntity
      // 006a: ifeq 008c
      // 006d: aload 8
      // 006f: checkcast net/mocreatures/entity/WyvernEntity
      // 0072: astore 13
      // 0074: aload 13
      // 0076: invokevirtual net/mocreatures/entity/WyvernEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0079: getstatic net/mocreatures/entity/WyvernEntity.DATA_Baby Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 007c: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 007f: checkcast java/lang/Boolean
      // 0082: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0085: ifeq 008c
      // 0088: bipush 1
      // 0089: goto 008d
      // 008c: bipush 0
      // 008d: ifne 00b6
      // 0090: aload 8
      // 0092: instanceof net/minecraft/world/entity/TamableAnimal
      // 0095: ifeq 00a7
      // 0098: aload 8
      // 009a: checkcast net/minecraft/world/entity/TamableAnimal
      // 009d: astore 14
      // 009f: aload 14
      // 00a1: invokevirtual net/minecraft/world/entity/TamableAnimal.getOwner ()Lnet/minecraft/world/entity/LivingEntity;
      // 00a4: goto 00a8
      // 00a7: aconst_null
      // 00a8: aload 9
      // 00aa: if_acmpne 00b3
      // 00ad: bipush 1
      // 00ae: istore 10
      // 00b0: goto 00b6
      // 00b3: bipush 0
      // 00b4: istore 10
      // 00b6: iload 10
      // 00b8: ifeq 0ada
      // 00bb: aload 9
      // 00bd: instanceof net/minecraft/world/entity/LivingEntity
      // 00c0: ifeq 0106
      // 00c3: aload 9
      // 00c5: checkcast net/minecraft/world/entity/LivingEntity
      // 00c8: astore 12
      // 00ca: new net/minecraft/world/item/ItemStack
      // 00cd: dup
      // 00ce: getstatic net/mocreatures/init/MocreaturesModItems.PET_AMULET_FULL Lnet/neoforged/neoforge/registries/DeferredItem;
      // 00d1: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 00d4: checkcast net/minecraft/world/level/ItemLike
      // 00d7: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 00da: invokevirtual net/minecraft/world/item/ItemStack.copy ()Lnet/minecraft/world/item/ItemStack;
      // 00dd: astore 13
      // 00df: aload 13
      // 00e1: bipush 1
      // 00e2: invokevirtual net/minecraft/world/item/ItemStack.setCount (I)V
      // 00e5: aload 12
      // 00e7: getstatic net/minecraft/world/InteractionHand.MAIN_HAND Lnet/minecraft/world/InteractionHand;
      // 00ea: aload 13
      // 00ec: invokevirtual net/minecraft/world/entity/LivingEntity.setItemInHand (Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/item/ItemStack;)V
      // 00ef: aload 12
      // 00f1: instanceof net/minecraft/world/entity/player/Player
      // 00f4: ifeq 0106
      // 00f7: aload 12
      // 00f9: checkcast net/minecraft/world/entity/player/Player
      // 00fc: astore 14
      // 00fe: aload 14
      // 0100: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 0103: invokevirtual net/minecraft/world/entity/player/Inventory.setChanged ()V
      // 0106: ldc_w "Mob"
      // 0109: astore 12
      // 010b: ldc_w "mocreatures:wyvern"
      // 010e: astore 13
      // 0110: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 0113: aload 9
      // 0115: instanceof net/minecraft/world/entity/LivingEntity
      // 0118: ifeq 012a
      // 011b: aload 9
      // 011d: checkcast net/minecraft/world/entity/LivingEntity
      // 0120: astore 14
      // 0122: aload 14
      // 0124: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 0127: goto 012d
      // 012a: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 012d: invokedynamic accept ()Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$0 (Lnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 0132: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 0135: ldc_w "Name"
      // 0138: astore 12
      // 013a: aload 8
      // 013c: invokevirtual net/minecraft/world/entity/Entity.getDisplayName ()Lnet/minecraft/network/chat/Component;
      // 013f: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 0144: astore 13
      // 0146: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 0149: aload 9
      // 014b: instanceof net/minecraft/world/entity/LivingEntity
      // 014e: ifeq 0160
      // 0151: aload 9
      // 0153: checkcast net/minecraft/world/entity/LivingEntity
      // 0156: astore 14
      // 0158: aload 14
      // 015a: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 015d: goto 0163
      // 0160: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 0163: aload 13
      // 0165: invokedynamic accept (Ljava/lang/String;)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$1 (Ljava/lang/String;Lnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 016a: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 016d: aload 8
      // 016f: instanceof net/minecraft/world/entity/TamableAnimal
      // 0172: ifeq 01bc
      // 0175: aload 8
      // 0177: checkcast net/minecraft/world/entity/TamableAnimal
      // 017a: astore 12
      // 017c: aload 12
      // 017e: invokevirtual net/minecraft/world/entity/TamableAnimal.isTame ()Z
      // 0181: ifeq 01bc
      // 0184: ldc_w "Owner"
      // 0187: astore 13
      // 0189: aload 9
      // 018b: invokevirtual net/minecraft/world/entity/Entity.getDisplayName ()Lnet/minecraft/network/chat/Component;
      // 018e: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 0193: astore 14
      // 0195: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 0198: aload 9
      // 019a: instanceof net/minecraft/world/entity/LivingEntity
      // 019d: ifeq 01af
      // 01a0: aload 9
      // 01a2: checkcast net/minecraft/world/entity/LivingEntity
      // 01a5: astore 15
      // 01a7: aload 15
      // 01a9: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 01ac: goto 01b2
      // 01af: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 01b2: aload 14
      // 01b4: invokedynamic accept (Ljava/lang/String;)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$2 (Ljava/lang/String;Lnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 01b9: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 01bc: ldc_w "Leashed"
      // 01bf: astore 12
      // 01c1: aload 8
      // 01c3: instanceof net/minecraft/world/entity/Mob
      // 01c6: ifeq 01d8
      // 01c9: aload 8
      // 01cb: checkcast net/minecraft/world/entity/Mob
      // 01ce: astore 14
      // 01d0: aload 14
      // 01d2: invokevirtual net/minecraft/world/entity/Mob.isLeashed ()Z
      // 01d5: goto 01d9
      // 01d8: bipush 0
      // 01d9: istore 13
      // 01db: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 01de: aload 9
      // 01e0: instanceof net/minecraft/world/entity/LivingEntity
      // 01e3: ifeq 01f5
      // 01e6: aload 9
      // 01e8: checkcast net/minecraft/world/entity/LivingEntity
      // 01eb: astore 14
      // 01ed: aload 14
      // 01ef: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 01f2: goto 01f8
      // 01f5: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 01f8: iload 13
      // 01fa: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$3 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 01ff: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 0202: ldc_w "NoGravity"
      // 0205: astore 12
      // 0207: aload 8
      // 0209: invokevirtual net/minecraft/world/entity/Entity.isNoGravity ()Z
      // 020c: istore 13
      // 020e: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 0211: aload 9
      // 0213: instanceof net/minecraft/world/entity/LivingEntity
      // 0216: ifeq 0228
      // 0219: aload 9
      // 021b: checkcast net/minecraft/world/entity/LivingEntity
      // 021e: astore 14
      // 0220: aload 14
      // 0222: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 0225: goto 022b
      // 0228: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 022b: iload 13
      // 022d: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$4 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 0232: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 0235: ldc_w "MaxHealth"
      // 0238: astore 12
      // 023a: aload 8
      // 023c: instanceof net/minecraft/world/entity/LivingEntity
      // 023f: ifeq 0252
      // 0242: aload 8
      // 0244: checkcast net/minecraft/world/entity/LivingEntity
      // 0247: astore 15
      // 0249: aload 15
      // 024b: invokevirtual net/minecraft/world/entity/LivingEntity.getMaxHealth ()F
      // 024e: f2d
      // 024f: goto 0255
      // 0252: ldc2_w -1.0
      // 0255: dstore 13
      // 0257: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 025a: aload 9
      // 025c: instanceof net/minecraft/world/entity/LivingEntity
      // 025f: ifeq 0271
      // 0262: aload 9
      // 0264: checkcast net/minecraft/world/entity/LivingEntity
      // 0267: astore 15
      // 0269: aload 15
      // 026b: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 026e: goto 0274
      // 0271: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 0274: dload 13
      // 0276: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$5 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 027b: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 027e: ldc_w "Health"
      // 0281: astore 12
      // 0283: aload 8
      // 0285: instanceof net/minecraft/world/entity/LivingEntity
      // 0288: ifeq 029b
      // 028b: aload 8
      // 028d: checkcast net/minecraft/world/entity/LivingEntity
      // 0290: astore 15
      // 0292: aload 15
      // 0294: invokevirtual net/minecraft/world/entity/LivingEntity.getHealth ()F
      // 0297: f2d
      // 0298: goto 029e
      // 029b: ldc2_w -1.0
      // 029e: dstore 13
      // 02a0: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 02a3: aload 9
      // 02a5: instanceof net/minecraft/world/entity/LivingEntity
      // 02a8: ifeq 02ba
      // 02ab: aload 9
      // 02ad: checkcast net/minecraft/world/entity/LivingEntity
      // 02b0: astore 15
      // 02b2: aload 15
      // 02b4: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 02b7: goto 02bd
      // 02ba: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 02bd: dload 13
      // 02bf: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$6 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 02c4: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 02c7: ldc_w "Air"
      // 02ca: astore 12
      // 02cc: aload 8
      // 02ce: invokevirtual net/minecraft/world/entity/Entity.getAirSupply ()I
      // 02d1: i2d
      // 02d2: dstore 13
      // 02d4: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 02d7: aload 9
      // 02d9: instanceof net/minecraft/world/entity/LivingEntity
      // 02dc: ifeq 02ee
      // 02df: aload 9
      // 02e1: checkcast net/minecraft/world/entity/LivingEntity
      // 02e4: astore 15
      // 02e6: aload 15
      // 02e8: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 02eb: goto 02f1
      // 02ee: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 02f1: dload 13
      // 02f3: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$7 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 02f8: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 02fb: ldc_w "MotionX"
      // 02fe: astore 12
      // 0300: aload 8
      // 0302: invokevirtual net/minecraft/world/entity/Entity.getDeltaMovement ()Lnet/minecraft/world/phys/Vec3;
      // 0305: invokevirtual net/minecraft/world/phys/Vec3.x ()D
      // 0308: dstore 13
      // 030a: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 030d: aload 9
      // 030f: instanceof net/minecraft/world/entity/LivingEntity
      // 0312: ifeq 0324
      // 0315: aload 9
      // 0317: checkcast net/minecraft/world/entity/LivingEntity
      // 031a: astore 15
      // 031c: aload 15
      // 031e: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 0321: goto 0327
      // 0324: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 0327: dload 13
      // 0329: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$8 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 032e: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 0331: ldc_w "MotionY"
      // 0334: astore 12
      // 0336: aload 8
      // 0338: invokevirtual net/minecraft/world/entity/Entity.getDeltaMovement ()Lnet/minecraft/world/phys/Vec3;
      // 033b: invokevirtual net/minecraft/world/phys/Vec3.y ()D
      // 033e: dstore 13
      // 0340: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 0343: aload 9
      // 0345: instanceof net/minecraft/world/entity/LivingEntity
      // 0348: ifeq 035a
      // 034b: aload 9
      // 034d: checkcast net/minecraft/world/entity/LivingEntity
      // 0350: astore 15
      // 0352: aload 15
      // 0354: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 0357: goto 035d
      // 035a: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 035d: dload 13
      // 035f: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$9 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 0364: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 0367: ldc_w "MotionZ"
      // 036a: astore 12
      // 036c: aload 8
      // 036e: invokevirtual net/minecraft/world/entity/Entity.getDeltaMovement ()Lnet/minecraft/world/phys/Vec3;
      // 0371: invokevirtual net/minecraft/world/phys/Vec3.z ()D
      // 0374: dstore 13
      // 0376: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 0379: aload 9
      // 037b: instanceof net/minecraft/world/entity/LivingEntity
      // 037e: ifeq 0390
      // 0381: aload 9
      // 0383: checkcast net/minecraft/world/entity/LivingEntity
      // 0386: astore 15
      // 0388: aload 15
      // 038a: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 038d: goto 0393
      // 0390: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 0393: dload 13
      // 0395: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$10 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 039a: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 039d: ldc_w "RotationYaw"
      // 03a0: astore 12
      // 03a2: aload 8
      // 03a4: invokevirtual net/minecraft/world/entity/Entity.getYRot ()F
      // 03a7: f2d
      // 03a8: dstore 13
      // 03aa: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 03ad: aload 9
      // 03af: instanceof net/minecraft/world/entity/LivingEntity
      // 03b2: ifeq 03c4
      // 03b5: aload 9
      // 03b7: checkcast net/minecraft/world/entity/LivingEntity
      // 03ba: astore 15
      // 03bc: aload 15
      // 03be: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 03c1: goto 03c7
      // 03c4: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 03c7: dload 13
      // 03c9: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$11 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 03ce: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 03d1: ldc_w "RotationPitch"
      // 03d4: astore 12
      // 03d6: aload 8
      // 03d8: invokevirtual net/minecraft/world/entity/Entity.getXRot ()F
      // 03db: f2d
      // 03dc: dstore 13
      // 03de: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 03e1: aload 9
      // 03e3: instanceof net/minecraft/world/entity/LivingEntity
      // 03e6: ifeq 03f8
      // 03e9: aload 9
      // 03eb: checkcast net/minecraft/world/entity/LivingEntity
      // 03ee: astore 15
      // 03f0: aload 15
      // 03f2: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 03f5: goto 03fb
      // 03f8: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 03fb: dload 13
      // 03fd: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$12 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 0402: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 0405: ldc_w "Variant"
      // 0408: astore 12
      // 040a: aload 8
      // 040c: instanceof net/mocreatures/entity/WyvernEntity
      // 040f: ifeq 042e
      // 0412: aload 8
      // 0414: checkcast net/mocreatures/entity/WyvernEntity
      // 0417: astore 15
      // 0419: aload 15
      // 041b: invokevirtual net/mocreatures/entity/WyvernEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 041e: getstatic net/mocreatures/entity/WyvernEntity.DATA_WyvernVariant Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0421: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 0424: checkcast java/lang/Integer
      // 0427: invokevirtual java/lang/Integer.intValue ()I
      // 042a: i2d
      // 042b: goto 042f
      // 042e: dconst_0
      // 042f: dstore 13
      // 0431: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 0434: aload 9
      // 0436: instanceof net/minecraft/world/entity/LivingEntity
      // 0439: ifeq 044b
      // 043c: aload 9
      // 043e: checkcast net/minecraft/world/entity/LivingEntity
      // 0441: astore 15
      // 0443: aload 15
      // 0445: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 0448: goto 044e
      // 044b: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 044e: dload 13
      // 0450: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$13 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 0455: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 0458: aload 8
      // 045a: invokevirtual net/minecraft/world/entity/Entity.getType ()Lnet/minecraft/world/entity/EntityType;
      // 045d: getstatic net/minecraft/core/registries/Registries.ENTITY_TYPE Lnet/minecraft/resources/ResourceKey;
      // 0460: ldc_w "mocreatures:wyvern"
      // 0463: invokestatic net/minecraft/resources/ResourceLocation.parse (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
      // 0466: invokestatic net/minecraft/tags/TagKey.create (Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
      // 0469: invokevirtual net/minecraft/world/entity/EntityType.is (Lnet/minecraft/tags/TagKey;)Z
      // 046c: ifeq 0ada
      // 046f: aload 8
      // 0471: instanceof net/mocreatures/entity/WyvernEntity
      // 0474: ifeq 0496
      // 0477: aload 8
      // 0479: checkcast net/mocreatures/entity/WyvernEntity
      // 047c: astore 12
      // 047e: aload 12
      // 0480: invokevirtual net/mocreatures/entity/WyvernEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0483: getstatic net/mocreatures/entity/WyvernEntity.DATA_Saddle Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0486: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 0489: checkcast java/lang/Boolean
      // 048c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 048f: ifeq 0496
      // 0492: bipush 1
      // 0493: goto 0497
      // 0496: bipush 0
      // 0497: bipush 1
      // 0498: if_icmpne 04d7
      // 049b: aload 1
      // 049c: instanceof net/minecraft/server/level/ServerLevel
      // 049f: ifeq 04d7
      // 04a2: aload 1
      // 04a3: checkcast net/minecraft/server/level/ServerLevel
      // 04a6: astore 13
      // 04a8: new net/minecraft/world/entity/item/ItemEntity
      // 04ab: dup
      // 04ac: aload 13
      // 04ae: dload 2
      // 04af: dload 4
      // 04b1: dload 6
      // 04b3: new net/minecraft/world/item/ItemStack
      // 04b6: dup
      // 04b7: getstatic net/mocreatures/init/MocreaturesModItems.CRAFTED_SADDLE Lnet/neoforged/neoforge/registries/DeferredItem;
      // 04ba: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 04bd: checkcast net/minecraft/world/level/ItemLike
      // 04c0: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 04c3: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 04c6: astore 14
      // 04c8: aload 14
      // 04ca: bipush 10
      // 04cc: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 04cf: aload 13
      // 04d1: aload 14
      // 04d3: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 04d6: pop
      // 04d7: aload 8
      // 04d9: instanceof net/mocreatures/entity/WyvernEntity
      // 04dc: ifeq 04fe
      // 04df: aload 8
      // 04e1: checkcast net/mocreatures/entity/WyvernEntity
      // 04e4: astore 12
      // 04e6: aload 12
      // 04e8: invokevirtual net/mocreatures/entity/WyvernEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 04eb: getstatic net/mocreatures/entity/WyvernEntity.DATA_Chest Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 04ee: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 04f1: checkcast java/lang/Boolean
      // 04f4: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 04f7: ifeq 04fe
      // 04fa: bipush 1
      // 04fb: goto 04ff
      // 04fe: bipush 0
      // 04ff: bipush 1
      // 0500: if_icmpne 0539
      // 0503: aload 1
      // 0504: instanceof net/minecraft/server/level/ServerLevel
      // 0507: ifeq 0539
      // 050a: aload 1
      // 050b: checkcast net/minecraft/server/level/ServerLevel
      // 050e: astore 13
      // 0510: new net/minecraft/world/entity/item/ItemEntity
      // 0513: dup
      // 0514: aload 13
      // 0516: dload 2
      // 0517: dload 4
      // 0519: dload 6
      // 051b: new net/minecraft/world/item/ItemStack
      // 051e: dup
      // 051f: getstatic net/minecraft/world/level/block/Blocks.CHEST Lnet/minecraft/world/level/block/Block;
      // 0522: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 0525: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 0528: astore 14
      // 052a: aload 14
      // 052c: bipush 10
      // 052e: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 0531: aload 13
      // 0533: aload 14
      // 0535: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 0538: pop
      // 0539: aload 8
      // 053b: instanceof net/mocreatures/entity/WyvernEntity
      // 053e: ifeq 0560
      // 0541: aload 8
      // 0543: checkcast net/mocreatures/entity/WyvernEntity
      // 0546: astore 12
      // 0548: aload 12
      // 054a: invokevirtual net/mocreatures/entity/WyvernEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 054d: getstatic net/mocreatures/entity/WyvernEntity.DATA_Diamond_Armor Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0550: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 0553: checkcast java/lang/Boolean
      // 0556: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0559: ifeq 0560
      // 055c: bipush 1
      // 055d: goto 0561
      // 0560: bipush 0
      // 0561: bipush 1
      // 0562: if_icmpne 059b
      // 0565: aload 1
      // 0566: instanceof net/minecraft/server/level/ServerLevel
      // 0569: ifeq 059b
      // 056c: aload 1
      // 056d: checkcast net/minecraft/server/level/ServerLevel
      // 0570: astore 13
      // 0572: new net/minecraft/world/entity/item/ItemEntity
      // 0575: dup
      // 0576: aload 13
      // 0578: dload 2
      // 0579: dload 4
      // 057b: dload 6
      // 057d: new net/minecraft/world/item/ItemStack
      // 0580: dup
      // 0581: getstatic net/minecraft/world/item/Items.DIAMOND_HORSE_ARMOR Lnet/minecraft/world/item/Item;
      // 0584: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 0587: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 058a: astore 14
      // 058c: aload 14
      // 058e: bipush 10
      // 0590: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 0593: aload 13
      // 0595: aload 14
      // 0597: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 059a: pop
      // 059b: aload 8
      // 059d: instanceof net/mocreatures/entity/WyvernEntity
      // 05a0: ifeq 05c2
      // 05a3: aload 8
      // 05a5: checkcast net/mocreatures/entity/WyvernEntity
      // 05a8: astore 12
      // 05aa: aload 12
      // 05ac: invokevirtual net/mocreatures/entity/WyvernEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 05af: getstatic net/mocreatures/entity/WyvernEntity.DATA_Golden_Armor Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 05b2: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 05b5: checkcast java/lang/Boolean
      // 05b8: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 05bb: ifeq 05c2
      // 05be: bipush 1
      // 05bf: goto 05c3
      // 05c2: bipush 0
      // 05c3: bipush 1
      // 05c4: if_icmpne 05fd
      // 05c7: aload 1
      // 05c8: instanceof net/minecraft/server/level/ServerLevel
      // 05cb: ifeq 05fd
      // 05ce: aload 1
      // 05cf: checkcast net/minecraft/server/level/ServerLevel
      // 05d2: astore 13
      // 05d4: new net/minecraft/world/entity/item/ItemEntity
      // 05d7: dup
      // 05d8: aload 13
      // 05da: dload 2
      // 05db: dload 4
      // 05dd: dload 6
      // 05df: new net/minecraft/world/item/ItemStack
      // 05e2: dup
      // 05e3: getstatic net/minecraft/world/item/Items.GOLDEN_HORSE_ARMOR Lnet/minecraft/world/item/Item;
      // 05e6: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 05e9: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 05ec: astore 14
      // 05ee: aload 14
      // 05f0: bipush 10
      // 05f2: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 05f5: aload 13
      // 05f7: aload 14
      // 05f9: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 05fc: pop
      // 05fd: aload 8
      // 05ff: instanceof net/mocreatures/entity/WyvernEntity
      // 0602: ifeq 0624
      // 0605: aload 8
      // 0607: checkcast net/mocreatures/entity/WyvernEntity
      // 060a: astore 12
      // 060c: aload 12
      // 060e: invokevirtual net/mocreatures/entity/WyvernEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0611: getstatic net/mocreatures/entity/WyvernEntity.DATA_Iron_Armor Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0614: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 0617: checkcast java/lang/Boolean
      // 061a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 061d: ifeq 0624
      // 0620: bipush 1
      // 0621: goto 0625
      // 0624: bipush 0
      // 0625: bipush 1
      // 0626: if_icmpne 065f
      // 0629: aload 1
      // 062a: instanceof net/minecraft/server/level/ServerLevel
      // 062d: ifeq 065f
      // 0630: aload 1
      // 0631: checkcast net/minecraft/server/level/ServerLevel
      // 0634: astore 13
      // 0636: new net/minecraft/world/entity/item/ItemEntity
      // 0639: dup
      // 063a: aload 13
      // 063c: dload 2
      // 063d: dload 4
      // 063f: dload 6
      // 0641: new net/minecraft/world/item/ItemStack
      // 0644: dup
      // 0645: getstatic net/minecraft/world/item/Items.IRON_HORSE_ARMOR Lnet/minecraft/world/item/Item;
      // 0648: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 064b: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 064e: astore 14
      // 0650: aload 14
      // 0652: bipush 10
      // 0654: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 0657: aload 13
      // 0659: aload 14
      // 065b: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 065e: pop
      // 065f: aload 8
      // 0661: invokevirtual net/minecraft/world/entity/Entity.level ()Lnet/minecraft/world/level/Level;
      // 0664: invokevirtual net/minecraft/world/level/Level.isClientSide ()Z
      // 0667: ifne 066f
      // 066a: aload 8
      // 066c: invokevirtual net/minecraft/world/entity/Entity.discard ()V
      // 066f: aload 1
      // 0670: instanceof net/minecraft/world/level/Level
      // 0673: ifeq 06cc
      // 0676: aload 1
      // 0677: checkcast net/minecraft/world/level/Level
      // 067a: astore 12
      // 067c: aload 12
      // 067e: invokevirtual net/minecraft/world/level/Level.isClientSide ()Z
      // 0681: ifne 06ab
      // 0684: aload 12
      // 0686: aconst_null
      // 0687: dload 2
      // 0688: dload 4
      // 068a: dload 6
      // 068c: invokestatic net/minecraft/core/BlockPos.containing (DDD)Lnet/minecraft/core/BlockPos;
      // 068f: getstatic net/minecraft/core/registries/BuiltInRegistries.SOUND_EVENT Lnet/minecraft/core/Registry;
      // 0692: ldc_w "entity.item.pickup"
      // 0695: invokestatic net/minecraft/resources/ResourceLocation.parse (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
      // 0698: invokeinterface net/minecraft/core/Registry.get (Lnet/minecraft/resources/ResourceLocation;)Ljava/lang/Object; 2
      // 069d: checkcast net/minecraft/sounds/SoundEvent
      // 06a0: getstatic net/minecraft/sounds/SoundSource.NEUTRAL Lnet/minecraft/sounds/SoundSource;
      // 06a3: fconst_2
      // 06a4: fconst_1
      // 06a5: invokevirtual net/minecraft/world/level/Level.playSound (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
      // 06a8: goto 06cc
      // 06ab: aload 12
      // 06ad: dload 2
      // 06ae: dload 4
      // 06b0: dload 6
      // 06b2: getstatic net/minecraft/core/registries/BuiltInRegistries.SOUND_EVENT Lnet/minecraft/core/Registry;
      // 06b5: ldc_w "entity.item.pickup"
      // 06b8: invokestatic net/minecraft/resources/ResourceLocation.parse (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
      // 06bb: invokeinterface net/minecraft/core/Registry.get (Lnet/minecraft/resources/ResourceLocation;)Ljava/lang/Object; 2
      // 06c0: checkcast net/minecraft/sounds/SoundEvent
      // 06c3: getstatic net/minecraft/sounds/SoundSource.NEUTRAL Lnet/minecraft/sounds/SoundSource;
      // 06c6: fconst_2
      // 06c7: fconst_1
      // 06c8: bipush 0
      // 06c9: invokevirtual net/minecraft/world/level/Level.playLocalSound (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
      // 06cc: aload 1
      // 06cd: instanceof net/minecraft/server/level/ServerLevel
      // 06d0: ifeq 0705
      // 06d3: aload 1
      // 06d4: checkcast net/minecraft/server/level/ServerLevel
      // 06d7: astore 12
      // 06d9: new net/minecraft/world/entity/item/ItemEntity
      // 06dc: dup
      // 06dd: aload 12
      // 06df: dload 2
      // 06e0: dload 4
      // 06e2: dload 6
      // 06e4: new net/mocreatures/procedures/PetAmuletCapture2Procedure$1
      // 06e7: dup
      // 06e8: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$1.<init> ()V
      // 06eb: bipush 0
      // 06ec: aload 8
      // 06ee: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$1.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 06f1: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 06f4: astore 13
      // 06f6: aload 13
      // 06f8: bipush 10
      // 06fa: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 06fd: aload 12
      // 06ff: aload 13
      // 0701: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 0704: pop
      // 0705: aload 1
      // 0706: instanceof net/minecraft/server/level/ServerLevel
      // 0709: ifeq 073e
      // 070c: aload 1
      // 070d: checkcast net/minecraft/server/level/ServerLevel
      // 0710: astore 12
      // 0712: new net/minecraft/world/entity/item/ItemEntity
      // 0715: dup
      // 0716: aload 12
      // 0718: dload 2
      // 0719: dload 4
      // 071b: dload 6
      // 071d: new net/mocreatures/procedures/PetAmuletCapture2Procedure$2
      // 0720: dup
      // 0721: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$2.<init> ()V
      // 0724: bipush 1
      // 0725: aload 8
      // 0727: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$2.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 072a: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 072d: astore 13
      // 072f: aload 13
      // 0731: bipush 10
      // 0733: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 0736: aload 12
      // 0738: aload 13
      // 073a: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 073d: pop
      // 073e: aload 1
      // 073f: instanceof net/minecraft/server/level/ServerLevel
      // 0742: ifeq 0777
      // 0745: aload 1
      // 0746: checkcast net/minecraft/server/level/ServerLevel
      // 0749: astore 12
      // 074b: new net/minecraft/world/entity/item/ItemEntity
      // 074e: dup
      // 074f: aload 12
      // 0751: dload 2
      // 0752: dload 4
      // 0754: dload 6
      // 0756: new net/mocreatures/procedures/PetAmuletCapture2Procedure$3
      // 0759: dup
      // 075a: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$3.<init> ()V
      // 075d: bipush 2
      // 075e: aload 8
      // 0760: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$3.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 0763: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 0766: astore 13
      // 0768: aload 13
      // 076a: bipush 10
      // 076c: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 076f: aload 12
      // 0771: aload 13
      // 0773: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 0776: pop
      // 0777: aload 1
      // 0778: instanceof net/minecraft/server/level/ServerLevel
      // 077b: ifeq 07b0
      // 077e: aload 1
      // 077f: checkcast net/minecraft/server/level/ServerLevel
      // 0782: astore 12
      // 0784: new net/minecraft/world/entity/item/ItemEntity
      // 0787: dup
      // 0788: aload 12
      // 078a: dload 2
      // 078b: dload 4
      // 078d: dload 6
      // 078f: new net/mocreatures/procedures/PetAmuletCapture2Procedure$4
      // 0792: dup
      // 0793: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$4.<init> ()V
      // 0796: bipush 3
      // 0797: aload 8
      // 0799: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$4.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 079c: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 079f: astore 13
      // 07a1: aload 13
      // 07a3: bipush 10
      // 07a5: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 07a8: aload 12
      // 07aa: aload 13
      // 07ac: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 07af: pop
      // 07b0: aload 1
      // 07b1: instanceof net/minecraft/server/level/ServerLevel
      // 07b4: ifeq 07e9
      // 07b7: aload 1
      // 07b8: checkcast net/minecraft/server/level/ServerLevel
      // 07bb: astore 12
      // 07bd: new net/minecraft/world/entity/item/ItemEntity
      // 07c0: dup
      // 07c1: aload 12
      // 07c3: dload 2
      // 07c4: dload 4
      // 07c6: dload 6
      // 07c8: new net/mocreatures/procedures/PetAmuletCapture2Procedure$5
      // 07cb: dup
      // 07cc: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$5.<init> ()V
      // 07cf: bipush 4
      // 07d0: aload 8
      // 07d2: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$5.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 07d5: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 07d8: astore 13
      // 07da: aload 13
      // 07dc: bipush 10
      // 07de: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 07e1: aload 12
      // 07e3: aload 13
      // 07e5: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 07e8: pop
      // 07e9: aload 1
      // 07ea: instanceof net/minecraft/server/level/ServerLevel
      // 07ed: ifeq 0822
      // 07f0: aload 1
      // 07f1: checkcast net/minecraft/server/level/ServerLevel
      // 07f4: astore 12
      // 07f6: new net/minecraft/world/entity/item/ItemEntity
      // 07f9: dup
      // 07fa: aload 12
      // 07fc: dload 2
      // 07fd: dload 4
      // 07ff: dload 6
      // 0801: new net/mocreatures/procedures/PetAmuletCapture2Procedure$6
      // 0804: dup
      // 0805: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$6.<init> ()V
      // 0808: bipush 5
      // 0809: aload 8
      // 080b: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$6.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 080e: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 0811: astore 13
      // 0813: aload 13
      // 0815: bipush 10
      // 0817: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 081a: aload 12
      // 081c: aload 13
      // 081e: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 0821: pop
      // 0822: aload 1
      // 0823: instanceof net/minecraft/server/level/ServerLevel
      // 0826: ifeq 085c
      // 0829: aload 1
      // 082a: checkcast net/minecraft/server/level/ServerLevel
      // 082d: astore 12
      // 082f: new net/minecraft/world/entity/item/ItemEntity
      // 0832: dup
      // 0833: aload 12
      // 0835: dload 2
      // 0836: dload 4
      // 0838: dload 6
      // 083a: new net/mocreatures/procedures/PetAmuletCapture2Procedure$7
      // 083d: dup
      // 083e: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$7.<init> ()V
      // 0841: bipush 6
      // 0843: aload 8
      // 0845: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$7.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 0848: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 084b: astore 13
      // 084d: aload 13
      // 084f: bipush 10
      // 0851: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 0854: aload 12
      // 0856: aload 13
      // 0858: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 085b: pop
      // 085c: aload 1
      // 085d: instanceof net/minecraft/server/level/ServerLevel
      // 0860: ifeq 0896
      // 0863: aload 1
      // 0864: checkcast net/minecraft/server/level/ServerLevel
      // 0867: astore 12
      // 0869: new net/minecraft/world/entity/item/ItemEntity
      // 086c: dup
      // 086d: aload 12
      // 086f: dload 2
      // 0870: dload 4
      // 0872: dload 6
      // 0874: new net/mocreatures/procedures/PetAmuletCapture2Procedure$8
      // 0877: dup
      // 0878: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$8.<init> ()V
      // 087b: bipush 7
      // 087d: aload 8
      // 087f: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$8.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 0882: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 0885: astore 13
      // 0887: aload 13
      // 0889: bipush 10
      // 088b: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 088e: aload 12
      // 0890: aload 13
      // 0892: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 0895: pop
      // 0896: aload 1
      // 0897: instanceof net/minecraft/server/level/ServerLevel
      // 089a: ifeq 08d0
      // 089d: aload 1
      // 089e: checkcast net/minecraft/server/level/ServerLevel
      // 08a1: astore 12
      // 08a3: new net/minecraft/world/entity/item/ItemEntity
      // 08a6: dup
      // 08a7: aload 12
      // 08a9: dload 2
      // 08aa: dload 4
      // 08ac: dload 6
      // 08ae: new net/mocreatures/procedures/PetAmuletCapture2Procedure$9
      // 08b1: dup
      // 08b2: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$9.<init> ()V
      // 08b5: bipush 8
      // 08b7: aload 8
      // 08b9: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$9.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 08bc: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 08bf: astore 13
      // 08c1: aload 13
      // 08c3: bipush 10
      // 08c5: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 08c8: aload 12
      // 08ca: aload 13
      // 08cc: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 08cf: pop
      // 08d0: aload 1
      // 08d1: instanceof net/minecraft/server/level/ServerLevel
      // 08d4: ifeq 090a
      // 08d7: aload 1
      // 08d8: checkcast net/minecraft/server/level/ServerLevel
      // 08db: astore 12
      // 08dd: new net/minecraft/world/entity/item/ItemEntity
      // 08e0: dup
      // 08e1: aload 12
      // 08e3: dload 2
      // 08e4: dload 4
      // 08e6: dload 6
      // 08e8: new net/mocreatures/procedures/PetAmuletCapture2Procedure$10
      // 08eb: dup
      // 08ec: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$10.<init> ()V
      // 08ef: bipush 9
      // 08f1: aload 8
      // 08f3: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$10.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 08f6: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 08f9: astore 13
      // 08fb: aload 13
      // 08fd: bipush 10
      // 08ff: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 0902: aload 12
      // 0904: aload 13
      // 0906: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 0909: pop
      // 090a: aload 1
      // 090b: instanceof net/minecraft/server/level/ServerLevel
      // 090e: ifeq 0944
      // 0911: aload 1
      // 0912: checkcast net/minecraft/server/level/ServerLevel
      // 0915: astore 12
      // 0917: new net/minecraft/world/entity/item/ItemEntity
      // 091a: dup
      // 091b: aload 12
      // 091d: dload 2
      // 091e: dload 4
      // 0920: dload 6
      // 0922: new net/mocreatures/procedures/PetAmuletCapture2Procedure$11
      // 0925: dup
      // 0926: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$11.<init> ()V
      // 0929: bipush 10
      // 092b: aload 8
      // 092d: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$11.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 0930: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 0933: astore 13
      // 0935: aload 13
      // 0937: bipush 10
      // 0939: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 093c: aload 12
      // 093e: aload 13
      // 0940: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 0943: pop
      // 0944: aload 1
      // 0945: instanceof net/minecraft/server/level/ServerLevel
      // 0948: ifeq 097e
      // 094b: aload 1
      // 094c: checkcast net/minecraft/server/level/ServerLevel
      // 094f: astore 12
      // 0951: new net/minecraft/world/entity/item/ItemEntity
      // 0954: dup
      // 0955: aload 12
      // 0957: dload 2
      // 0958: dload 4
      // 095a: dload 6
      // 095c: new net/mocreatures/procedures/PetAmuletCapture2Procedure$12
      // 095f: dup
      // 0960: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$12.<init> ()V
      // 0963: bipush 11
      // 0965: aload 8
      // 0967: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$12.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 096a: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 096d: astore 13
      // 096f: aload 13
      // 0971: bipush 10
      // 0973: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 0976: aload 12
      // 0978: aload 13
      // 097a: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 097d: pop
      // 097e: aload 1
      // 097f: instanceof net/minecraft/server/level/ServerLevel
      // 0982: ifeq 09b8
      // 0985: aload 1
      // 0986: checkcast net/minecraft/server/level/ServerLevel
      // 0989: astore 12
      // 098b: new net/minecraft/world/entity/item/ItemEntity
      // 098e: dup
      // 098f: aload 12
      // 0991: dload 2
      // 0992: dload 4
      // 0994: dload 6
      // 0996: new net/mocreatures/procedures/PetAmuletCapture2Procedure$13
      // 0999: dup
      // 099a: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$13.<init> ()V
      // 099d: bipush 12
      // 099f: aload 8
      // 09a1: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$13.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 09a4: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 09a7: astore 13
      // 09a9: aload 13
      // 09ab: bipush 10
      // 09ad: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 09b0: aload 12
      // 09b2: aload 13
      // 09b4: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 09b7: pop
      // 09b8: aload 1
      // 09b9: instanceof net/minecraft/server/level/ServerLevel
      // 09bc: ifeq 09f2
      // 09bf: aload 1
      // 09c0: checkcast net/minecraft/server/level/ServerLevel
      // 09c3: astore 12
      // 09c5: new net/minecraft/world/entity/item/ItemEntity
      // 09c8: dup
      // 09c9: aload 12
      // 09cb: dload 2
      // 09cc: dload 4
      // 09ce: dload 6
      // 09d0: new net/mocreatures/procedures/PetAmuletCapture2Procedure$14
      // 09d3: dup
      // 09d4: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$14.<init> ()V
      // 09d7: bipush 13
      // 09d9: aload 8
      // 09db: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$14.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 09de: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 09e1: astore 13
      // 09e3: aload 13
      // 09e5: bipush 10
      // 09e7: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 09ea: aload 12
      // 09ec: aload 13
      // 09ee: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 09f1: pop
      // 09f2: aload 1
      // 09f3: instanceof net/minecraft/server/level/ServerLevel
      // 09f6: ifeq 0a2c
      // 09f9: aload 1
      // 09fa: checkcast net/minecraft/server/level/ServerLevel
      // 09fd: astore 12
      // 09ff: new net/minecraft/world/entity/item/ItemEntity
      // 0a02: dup
      // 0a03: aload 12
      // 0a05: dload 2
      // 0a06: dload 4
      // 0a08: dload 6
      // 0a0a: new net/mocreatures/procedures/PetAmuletCapture2Procedure$15
      // 0a0d: dup
      // 0a0e: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$15.<init> ()V
      // 0a11: bipush 14
      // 0a13: aload 8
      // 0a15: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$15.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 0a18: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 0a1b: astore 13
      // 0a1d: aload 13
      // 0a1f: bipush 10
      // 0a21: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 0a24: aload 12
      // 0a26: aload 13
      // 0a28: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 0a2b: pop
      // 0a2c: aload 1
      // 0a2d: instanceof net/minecraft/server/level/ServerLevel
      // 0a30: ifeq 0a66
      // 0a33: aload 1
      // 0a34: checkcast net/minecraft/server/level/ServerLevel
      // 0a37: astore 12
      // 0a39: new net/minecraft/world/entity/item/ItemEntity
      // 0a3c: dup
      // 0a3d: aload 12
      // 0a3f: dload 2
      // 0a40: dload 4
      // 0a42: dload 6
      // 0a44: new net/mocreatures/procedures/PetAmuletCapture2Procedure$16
      // 0a47: dup
      // 0a48: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$16.<init> ()V
      // 0a4b: bipush 15
      // 0a4d: aload 8
      // 0a4f: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$16.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 0a52: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 0a55: astore 13
      // 0a57: aload 13
      // 0a59: bipush 10
      // 0a5b: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 0a5e: aload 12
      // 0a60: aload 13
      // 0a62: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 0a65: pop
      // 0a66: aload 1
      // 0a67: instanceof net/minecraft/server/level/ServerLevel
      // 0a6a: ifeq 0aa0
      // 0a6d: aload 1
      // 0a6e: checkcast net/minecraft/server/level/ServerLevel
      // 0a71: astore 12
      // 0a73: new net/minecraft/world/entity/item/ItemEntity
      // 0a76: dup
      // 0a77: aload 12
      // 0a79: dload 2
      // 0a7a: dload 4
      // 0a7c: dload 6
      // 0a7e: new net/mocreatures/procedures/PetAmuletCapture2Procedure$17
      // 0a81: dup
      // 0a82: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$17.<init> ()V
      // 0a85: bipush 16
      // 0a87: aload 8
      // 0a89: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$17.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 0a8c: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 0a8f: astore 13
      // 0a91: aload 13
      // 0a93: bipush 10
      // 0a95: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 0a98: aload 12
      // 0a9a: aload 13
      // 0a9c: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 0a9f: pop
      // 0aa0: aload 1
      // 0aa1: instanceof net/minecraft/server/level/ServerLevel
      // 0aa4: ifeq 0ada
      // 0aa7: aload 1
      // 0aa8: checkcast net/minecraft/server/level/ServerLevel
      // 0aab: astore 12
      // 0aad: new net/minecraft/world/entity/item/ItemEntity
      // 0ab0: dup
      // 0ab1: aload 12
      // 0ab3: dload 2
      // 0ab4: dload 4
      // 0ab6: dload 6
      // 0ab8: new net/mocreatures/procedures/PetAmuletCapture2Procedure$18
      // 0abb: dup
      // 0abc: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$18.<init> ()V
      // 0abf: bipush 17
      // 0ac1: aload 8
      // 0ac3: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$18.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 0ac6: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 0ac9: astore 13
      // 0acb: aload 13
      // 0acd: bipush 10
      // 0acf: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 0ad2: aload 12
      // 0ad4: aload 13
      // 0ad6: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 0ad9: pop
      // 0ada: aload 9
      // 0adc: instanceof net/minecraft/world/entity/LivingEntity
      // 0adf: ifeq 0af1
      // 0ae2: aload 9
      // 0ae4: checkcast net/minecraft/world/entity/LivingEntity
      // 0ae7: astore 11
      // 0ae9: aload 11
      // 0aeb: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 0aee: goto 0af4
      // 0af1: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 0af4: ldc_w "mocreatures:amulet/empty"
      // 0af7: invokestatic net/minecraft/resources/ResourceLocation.parse (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
      // 0afa: invokestatic net/minecraft/tags/ItemTags.create (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
      // 0afd: invokevirtual net/minecraft/world/item/ItemStack.is (Lnet/minecraft/tags/TagKey;)Z
      // 0b00: ifeq 1522
      // 0b03: aload 8
      // 0b05: invokevirtual net/minecraft/world/entity/Entity.getType ()Lnet/minecraft/world/entity/EntityType;
      // 0b08: getstatic net/minecraft/core/registries/Registries.ENTITY_TYPE Lnet/minecraft/resources/ResourceKey;
      // 0b0b: ldc_w "mocreatures:lion"
      // 0b0e: invokestatic net/minecraft/resources/ResourceLocation.parse (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
      // 0b11: invokestatic net/minecraft/tags/TagKey.create (Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
      // 0b14: invokevirtual net/minecraft/world/entity/EntityType.is (Lnet/minecraft/tags/TagKey;)Z
      // 0b17: ifeq 1522
      // 0b1a: aload 8
      // 0b1c: instanceof net/minecraft/world/entity/TamableAnimal
      // 0b1f: ifeq 0b82
      // 0b22: aload 8
      // 0b24: checkcast net/minecraft/world/entity/TamableAnimal
      // 0b27: astore 12
      // 0b29: aload 12
      // 0b2b: invokevirtual net/minecraft/world/entity/TamableAnimal.isTame ()Z
      // 0b2e: ifeq 0b82
      // 0b31: aload 8
      // 0b33: instanceof net/mocreatures/entity/LionEntity
      // 0b36: ifeq 0b58
      // 0b39: aload 8
      // 0b3b: checkcast net/mocreatures/entity/LionEntity
      // 0b3e: astore 13
      // 0b40: aload 13
      // 0b42: invokevirtual net/mocreatures/entity/LionEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0b45: getstatic net/mocreatures/entity/LionEntity.DATA_Baby Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0b48: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 0b4b: checkcast java/lang/Boolean
      // 0b4e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0b51: ifeq 0b58
      // 0b54: bipush 1
      // 0b55: goto 0b59
      // 0b58: bipush 0
      // 0b59: ifne 0b82
      // 0b5c: aload 8
      // 0b5e: instanceof net/minecraft/world/entity/TamableAnimal
      // 0b61: ifeq 0b73
      // 0b64: aload 8
      // 0b66: checkcast net/minecraft/world/entity/TamableAnimal
      // 0b69: astore 14
      // 0b6b: aload 14
      // 0b6d: invokevirtual net/minecraft/world/entity/TamableAnimal.getOwner ()Lnet/minecraft/world/entity/LivingEntity;
      // 0b70: goto 0b74
      // 0b73: aconst_null
      // 0b74: aload 9
      // 0b76: if_acmpne 0b7f
      // 0b79: bipush 1
      // 0b7a: istore 10
      // 0b7c: goto 0b82
      // 0b7f: bipush 0
      // 0b80: istore 10
      // 0b82: iload 10
      // 0b84: ifeq 1522
      // 0b87: aload 9
      // 0b89: instanceof net/minecraft/world/entity/LivingEntity
      // 0b8c: ifeq 0bd2
      // 0b8f: aload 9
      // 0b91: checkcast net/minecraft/world/entity/LivingEntity
      // 0b94: astore 12
      // 0b96: new net/minecraft/world/item/ItemStack
      // 0b99: dup
      // 0b9a: getstatic net/mocreatures/init/MocreaturesModItems.PET_AMULET_FULL Lnet/neoforged/neoforge/registries/DeferredItem;
      // 0b9d: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 0ba0: checkcast net/minecraft/world/level/ItemLike
      // 0ba3: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 0ba6: invokevirtual net/minecraft/world/item/ItemStack.copy ()Lnet/minecraft/world/item/ItemStack;
      // 0ba9: astore 13
      // 0bab: aload 13
      // 0bad: bipush 1
      // 0bae: invokevirtual net/minecraft/world/item/ItemStack.setCount (I)V
      // 0bb1: aload 12
      // 0bb3: getstatic net/minecraft/world/InteractionHand.MAIN_HAND Lnet/minecraft/world/InteractionHand;
      // 0bb6: aload 13
      // 0bb8: invokevirtual net/minecraft/world/entity/LivingEntity.setItemInHand (Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/item/ItemStack;)V
      // 0bbb: aload 12
      // 0bbd: instanceof net/minecraft/world/entity/player/Player
      // 0bc0: ifeq 0bd2
      // 0bc3: aload 12
      // 0bc5: checkcast net/minecraft/world/entity/player/Player
      // 0bc8: astore 14
      // 0bca: aload 14
      // 0bcc: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 0bcf: invokevirtual net/minecraft/world/entity/player/Inventory.setChanged ()V
      // 0bd2: ldc_w "Mob"
      // 0bd5: astore 12
      // 0bd7: ldc_w "mocreatures:lion"
      // 0bda: astore 13
      // 0bdc: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 0bdf: aload 9
      // 0be1: instanceof net/minecraft/world/entity/LivingEntity
      // 0be4: ifeq 0bf6
      // 0be7: aload 9
      // 0be9: checkcast net/minecraft/world/entity/LivingEntity
      // 0bec: astore 14
      // 0bee: aload 14
      // 0bf0: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 0bf3: goto 0bf9
      // 0bf6: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 0bf9: invokedynamic accept ()Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$14 (Lnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 0bfe: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 0c01: ldc_w "Name"
      // 0c04: astore 12
      // 0c06: aload 8
      // 0c08: invokevirtual net/minecraft/world/entity/Entity.getDisplayName ()Lnet/minecraft/network/chat/Component;
      // 0c0b: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 0c10: astore 13
      // 0c12: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 0c15: aload 9
      // 0c17: instanceof net/minecraft/world/entity/LivingEntity
      // 0c1a: ifeq 0c2c
      // 0c1d: aload 9
      // 0c1f: checkcast net/minecraft/world/entity/LivingEntity
      // 0c22: astore 14
      // 0c24: aload 14
      // 0c26: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 0c29: goto 0c2f
      // 0c2c: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 0c2f: aload 13
      // 0c31: invokedynamic accept (Ljava/lang/String;)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$15 (Ljava/lang/String;Lnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 0c36: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 0c39: aload 8
      // 0c3b: instanceof net/minecraft/world/entity/TamableAnimal
      // 0c3e: ifeq 0c88
      // 0c41: aload 8
      // 0c43: checkcast net/minecraft/world/entity/TamableAnimal
      // 0c46: astore 12
      // 0c48: aload 12
      // 0c4a: invokevirtual net/minecraft/world/entity/TamableAnimal.isTame ()Z
      // 0c4d: ifeq 0c88
      // 0c50: ldc_w "Owner"
      // 0c53: astore 13
      // 0c55: aload 9
      // 0c57: invokevirtual net/minecraft/world/entity/Entity.getDisplayName ()Lnet/minecraft/network/chat/Component;
      // 0c5a: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 0c5f: astore 14
      // 0c61: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 0c64: aload 9
      // 0c66: instanceof net/minecraft/world/entity/LivingEntity
      // 0c69: ifeq 0c7b
      // 0c6c: aload 9
      // 0c6e: checkcast net/minecraft/world/entity/LivingEntity
      // 0c71: astore 15
      // 0c73: aload 15
      // 0c75: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 0c78: goto 0c7e
      // 0c7b: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 0c7e: aload 14
      // 0c80: invokedynamic accept (Ljava/lang/String;)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$16 (Ljava/lang/String;Lnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 0c85: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 0c88: ldc_w "Leashed"
      // 0c8b: astore 12
      // 0c8d: aload 8
      // 0c8f: instanceof net/minecraft/world/entity/Mob
      // 0c92: ifeq 0ca4
      // 0c95: aload 8
      // 0c97: checkcast net/minecraft/world/entity/Mob
      // 0c9a: astore 14
      // 0c9c: aload 14
      // 0c9e: invokevirtual net/minecraft/world/entity/Mob.isLeashed ()Z
      // 0ca1: goto 0ca5
      // 0ca4: bipush 0
      // 0ca5: istore 13
      // 0ca7: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 0caa: aload 9
      // 0cac: instanceof net/minecraft/world/entity/LivingEntity
      // 0caf: ifeq 0cc1
      // 0cb2: aload 9
      // 0cb4: checkcast net/minecraft/world/entity/LivingEntity
      // 0cb7: astore 14
      // 0cb9: aload 14
      // 0cbb: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 0cbe: goto 0cc4
      // 0cc1: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 0cc4: iload 13
      // 0cc6: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$17 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 0ccb: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 0cce: ldc_w "NoGravity"
      // 0cd1: astore 12
      // 0cd3: aload 8
      // 0cd5: invokevirtual net/minecraft/world/entity/Entity.isNoGravity ()Z
      // 0cd8: istore 13
      // 0cda: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 0cdd: aload 9
      // 0cdf: instanceof net/minecraft/world/entity/LivingEntity
      // 0ce2: ifeq 0cf4
      // 0ce5: aload 9
      // 0ce7: checkcast net/minecraft/world/entity/LivingEntity
      // 0cea: astore 14
      // 0cec: aload 14
      // 0cee: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 0cf1: goto 0cf7
      // 0cf4: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 0cf7: iload 13
      // 0cf9: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$18 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 0cfe: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 0d01: ldc_w "MaxHealth"
      // 0d04: astore 12
      // 0d06: aload 8
      // 0d08: instanceof net/minecraft/world/entity/LivingEntity
      // 0d0b: ifeq 0d1e
      // 0d0e: aload 8
      // 0d10: checkcast net/minecraft/world/entity/LivingEntity
      // 0d13: astore 15
      // 0d15: aload 15
      // 0d17: invokevirtual net/minecraft/world/entity/LivingEntity.getMaxHealth ()F
      // 0d1a: f2d
      // 0d1b: goto 0d21
      // 0d1e: ldc2_w -1.0
      // 0d21: dstore 13
      // 0d23: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 0d26: aload 9
      // 0d28: instanceof net/minecraft/world/entity/LivingEntity
      // 0d2b: ifeq 0d3d
      // 0d2e: aload 9
      // 0d30: checkcast net/minecraft/world/entity/LivingEntity
      // 0d33: astore 15
      // 0d35: aload 15
      // 0d37: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 0d3a: goto 0d40
      // 0d3d: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 0d40: dload 13
      // 0d42: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$19 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 0d47: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 0d4a: ldc_w "Health"
      // 0d4d: astore 12
      // 0d4f: aload 8
      // 0d51: instanceof net/minecraft/world/entity/LivingEntity
      // 0d54: ifeq 0d67
      // 0d57: aload 8
      // 0d59: checkcast net/minecraft/world/entity/LivingEntity
      // 0d5c: astore 15
      // 0d5e: aload 15
      // 0d60: invokevirtual net/minecraft/world/entity/LivingEntity.getHealth ()F
      // 0d63: f2d
      // 0d64: goto 0d6a
      // 0d67: ldc2_w -1.0
      // 0d6a: dstore 13
      // 0d6c: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 0d6f: aload 9
      // 0d71: instanceof net/minecraft/world/entity/LivingEntity
      // 0d74: ifeq 0d86
      // 0d77: aload 9
      // 0d79: checkcast net/minecraft/world/entity/LivingEntity
      // 0d7c: astore 15
      // 0d7e: aload 15
      // 0d80: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 0d83: goto 0d89
      // 0d86: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 0d89: dload 13
      // 0d8b: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$20 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 0d90: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 0d93: ldc_w "Air"
      // 0d96: astore 12
      // 0d98: aload 8
      // 0d9a: invokevirtual net/minecraft/world/entity/Entity.getAirSupply ()I
      // 0d9d: i2d
      // 0d9e: dstore 13
      // 0da0: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 0da3: aload 9
      // 0da5: instanceof net/minecraft/world/entity/LivingEntity
      // 0da8: ifeq 0dba
      // 0dab: aload 9
      // 0dad: checkcast net/minecraft/world/entity/LivingEntity
      // 0db0: astore 15
      // 0db2: aload 15
      // 0db4: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 0db7: goto 0dbd
      // 0dba: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 0dbd: dload 13
      // 0dbf: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$21 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 0dc4: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 0dc7: ldc_w "MotionX"
      // 0dca: astore 12
      // 0dcc: aload 8
      // 0dce: invokevirtual net/minecraft/world/entity/Entity.getDeltaMovement ()Lnet/minecraft/world/phys/Vec3;
      // 0dd1: invokevirtual net/minecraft/world/phys/Vec3.x ()D
      // 0dd4: dstore 13
      // 0dd6: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 0dd9: aload 9
      // 0ddb: instanceof net/minecraft/world/entity/LivingEntity
      // 0dde: ifeq 0df0
      // 0de1: aload 9
      // 0de3: checkcast net/minecraft/world/entity/LivingEntity
      // 0de6: astore 15
      // 0de8: aload 15
      // 0dea: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 0ded: goto 0df3
      // 0df0: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 0df3: dload 13
      // 0df5: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$22 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 0dfa: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 0dfd: ldc_w "MotionY"
      // 0e00: astore 12
      // 0e02: aload 8
      // 0e04: invokevirtual net/minecraft/world/entity/Entity.getDeltaMovement ()Lnet/minecraft/world/phys/Vec3;
      // 0e07: invokevirtual net/minecraft/world/phys/Vec3.y ()D
      // 0e0a: dstore 13
      // 0e0c: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 0e0f: aload 9
      // 0e11: instanceof net/minecraft/world/entity/LivingEntity
      // 0e14: ifeq 0e26
      // 0e17: aload 9
      // 0e19: checkcast net/minecraft/world/entity/LivingEntity
      // 0e1c: astore 15
      // 0e1e: aload 15
      // 0e20: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 0e23: goto 0e29
      // 0e26: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 0e29: dload 13
      // 0e2b: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$23 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 0e30: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 0e33: ldc_w "MotionZ"
      // 0e36: astore 12
      // 0e38: aload 8
      // 0e3a: invokevirtual net/minecraft/world/entity/Entity.getDeltaMovement ()Lnet/minecraft/world/phys/Vec3;
      // 0e3d: invokevirtual net/minecraft/world/phys/Vec3.z ()D
      // 0e40: dstore 13
      // 0e42: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 0e45: aload 9
      // 0e47: instanceof net/minecraft/world/entity/LivingEntity
      // 0e4a: ifeq 0e5c
      // 0e4d: aload 9
      // 0e4f: checkcast net/minecraft/world/entity/LivingEntity
      // 0e52: astore 15
      // 0e54: aload 15
      // 0e56: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 0e59: goto 0e5f
      // 0e5c: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 0e5f: dload 13
      // 0e61: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$24 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 0e66: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 0e69: ldc_w "RotationYaw"
      // 0e6c: astore 12
      // 0e6e: aload 8
      // 0e70: invokevirtual net/minecraft/world/entity/Entity.getYRot ()F
      // 0e73: f2d
      // 0e74: dstore 13
      // 0e76: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 0e79: aload 9
      // 0e7b: instanceof net/minecraft/world/entity/LivingEntity
      // 0e7e: ifeq 0e90
      // 0e81: aload 9
      // 0e83: checkcast net/minecraft/world/entity/LivingEntity
      // 0e86: astore 15
      // 0e88: aload 15
      // 0e8a: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 0e8d: goto 0e93
      // 0e90: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 0e93: dload 13
      // 0e95: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$25 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 0e9a: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 0e9d: ldc_w "RotationPitch"
      // 0ea0: astore 12
      // 0ea2: aload 8
      // 0ea4: invokevirtual net/minecraft/world/entity/Entity.getXRot ()F
      // 0ea7: f2d
      // 0ea8: dstore 13
      // 0eaa: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 0ead: aload 9
      // 0eaf: instanceof net/minecraft/world/entity/LivingEntity
      // 0eb2: ifeq 0ec4
      // 0eb5: aload 9
      // 0eb7: checkcast net/minecraft/world/entity/LivingEntity
      // 0eba: astore 15
      // 0ebc: aload 15
      // 0ebe: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 0ec1: goto 0ec7
      // 0ec4: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 0ec7: dload 13
      // 0ec9: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$26 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 0ece: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 0ed1: ldc_w "Gender"
      // 0ed4: astore 12
      // 0ed6: aload 8
      // 0ed8: instanceof net/mocreatures/entity/LionEntity
      // 0edb: ifeq 0efa
      // 0ede: aload 8
      // 0ee0: checkcast net/mocreatures/entity/LionEntity
      // 0ee3: astore 15
      // 0ee5: aload 15
      // 0ee7: invokevirtual net/mocreatures/entity/LionEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0eea: getstatic net/mocreatures/entity/LionEntity.DATA_LionGender Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0eed: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 0ef0: checkcast java/lang/Integer
      // 0ef3: invokevirtual java/lang/Integer.intValue ()I
      // 0ef6: i2d
      // 0ef7: goto 0efb
      // 0efa: dconst_0
      // 0efb: dstore 13
      // 0efd: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 0f00: aload 9
      // 0f02: instanceof net/minecraft/world/entity/LivingEntity
      // 0f05: ifeq 0f17
      // 0f08: aload 9
      // 0f0a: checkcast net/minecraft/world/entity/LivingEntity
      // 0f0d: astore 15
      // 0f0f: aload 15
      // 0f11: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 0f14: goto 0f1a
      // 0f17: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 0f1a: dload 13
      // 0f1c: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$27 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 0f21: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 0f24: ldc_w "Color"
      // 0f27: astore 12
      // 0f29: aload 8
      // 0f2b: instanceof net/mocreatures/entity/LionEntity
      // 0f2e: ifeq 0f4d
      // 0f31: aload 8
      // 0f33: checkcast net/mocreatures/entity/LionEntity
      // 0f36: astore 15
      // 0f38: aload 15
      // 0f3a: invokevirtual net/mocreatures/entity/LionEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0f3d: getstatic net/mocreatures/entity/LionEntity.DATA_LionColor Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0f40: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 0f43: checkcast java/lang/Integer
      // 0f46: invokevirtual java/lang/Integer.intValue ()I
      // 0f49: i2d
      // 0f4a: goto 0f4e
      // 0f4d: dconst_0
      // 0f4e: dstore 13
      // 0f50: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 0f53: aload 9
      // 0f55: instanceof net/minecraft/world/entity/LivingEntity
      // 0f58: ifeq 0f6a
      // 0f5b: aload 9
      // 0f5d: checkcast net/minecraft/world/entity/LivingEntity
      // 0f60: astore 15
      // 0f62: aload 15
      // 0f64: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 0f67: goto 0f6d
      // 0f6a: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 0f6d: dload 13
      // 0f6f: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$28 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 0f74: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 0f77: ldc_w "Wings"
      // 0f7a: astore 12
      // 0f7c: aload 8
      // 0f7e: instanceof net/mocreatures/entity/LionEntity
      // 0f81: ifeq 0fa3
      // 0f84: aload 8
      // 0f86: checkcast net/mocreatures/entity/LionEntity
      // 0f89: astore 14
      // 0f8b: aload 14
      // 0f8d: invokevirtual net/mocreatures/entity/LionEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0f90: getstatic net/mocreatures/entity/LionEntity.DATA_Wings Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0f93: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 0f96: checkcast java/lang/Boolean
      // 0f99: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0f9c: ifeq 0fa3
      // 0f9f: bipush 1
      // 0fa0: goto 0fa4
      // 0fa3: bipush 0
      // 0fa4: istore 13
      // 0fa6: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 0fa9: aload 9
      // 0fab: instanceof net/minecraft/world/entity/LivingEntity
      // 0fae: ifeq 0fc0
      // 0fb1: aload 9
      // 0fb3: checkcast net/minecraft/world/entity/LivingEntity
      // 0fb6: astore 14
      // 0fb8: aload 14
      // 0fba: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 0fbd: goto 0fc3
      // 0fc0: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 0fc3: iload 13
      // 0fc5: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$29 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 0fca: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 0fcd: ldc_w "Medallion"
      // 0fd0: astore 12
      // 0fd2: aload 8
      // 0fd4: instanceof net/mocreatures/entity/LionEntity
      // 0fd7: ifeq 0ff9
      // 0fda: aload 8
      // 0fdc: checkcast net/mocreatures/entity/LionEntity
      // 0fdf: astore 14
      // 0fe1: aload 14
      // 0fe3: invokevirtual net/mocreatures/entity/LionEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 0fe6: getstatic net/mocreatures/entity/LionEntity.DATA_Medallion Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 0fe9: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 0fec: checkcast java/lang/Boolean
      // 0fef: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0ff2: ifeq 0ff9
      // 0ff5: bipush 1
      // 0ff6: goto 0ffa
      // 0ff9: bipush 0
      // 0ffa: istore 13
      // 0ffc: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 0fff: aload 9
      // 1001: instanceof net/minecraft/world/entity/LivingEntity
      // 1004: ifeq 1016
      // 1007: aload 9
      // 1009: checkcast net/minecraft/world/entity/LivingEntity
      // 100c: astore 14
      // 100e: aload 14
      // 1010: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 1013: goto 1019
      // 1016: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 1019: iload 13
      // 101b: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$30 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 1020: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 1023: aload 8
      // 1025: invokevirtual net/minecraft/world/entity/Entity.getType ()Lnet/minecraft/world/entity/EntityType;
      // 1028: getstatic net/minecraft/core/registries/Registries.ENTITY_TYPE Lnet/minecraft/resources/ResourceKey;
      // 102b: ldc_w "mocreatures:lion"
      // 102e: invokestatic net/minecraft/resources/ResourceLocation.parse (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
      // 1031: invokestatic net/minecraft/tags/TagKey.create (Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
      // 1034: invokevirtual net/minecraft/world/entity/EntityType.is (Lnet/minecraft/tags/TagKey;)Z
      // 1037: ifeq 1522
      // 103a: aload 8
      // 103c: instanceof net/mocreatures/entity/LionEntity
      // 103f: ifeq 1061
      // 1042: aload 8
      // 1044: checkcast net/mocreatures/entity/LionEntity
      // 1047: astore 12
      // 1049: aload 12
      // 104b: invokevirtual net/mocreatures/entity/LionEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 104e: getstatic net/mocreatures/entity/LionEntity.DATA_Saddle Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1051: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 1054: checkcast java/lang/Boolean
      // 1057: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 105a: ifeq 1061
      // 105d: bipush 1
      // 105e: goto 1062
      // 1061: bipush 0
      // 1062: bipush 1
      // 1063: if_icmpne 10a2
      // 1066: aload 1
      // 1067: instanceof net/minecraft/server/level/ServerLevel
      // 106a: ifeq 10a2
      // 106d: aload 1
      // 106e: checkcast net/minecraft/server/level/ServerLevel
      // 1071: astore 13
      // 1073: new net/minecraft/world/entity/item/ItemEntity
      // 1076: dup
      // 1077: aload 13
      // 1079: dload 2
      // 107a: dload 4
      // 107c: dload 6
      // 107e: new net/minecraft/world/item/ItemStack
      // 1081: dup
      // 1082: getstatic net/mocreatures/init/MocreaturesModItems.CRAFTED_SADDLE Lnet/neoforged/neoforge/registries/DeferredItem;
      // 1085: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 1088: checkcast net/minecraft/world/level/ItemLike
      // 108b: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 108e: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1091: astore 14
      // 1093: aload 14
      // 1095: bipush 10
      // 1097: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 109a: aload 13
      // 109c: aload 14
      // 109e: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 10a1: pop
      // 10a2: aload 8
      // 10a4: instanceof net/mocreatures/entity/LionEntity
      // 10a7: ifeq 10c9
      // 10aa: aload 8
      // 10ac: checkcast net/mocreatures/entity/LionEntity
      // 10af: astore 12
      // 10b1: aload 12
      // 10b3: invokevirtual net/mocreatures/entity/LionEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 10b6: getstatic net/mocreatures/entity/LionEntity.DATA_Chest Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 10b9: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 10bc: checkcast java/lang/Boolean
      // 10bf: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 10c2: ifeq 10c9
      // 10c5: bipush 1
      // 10c6: goto 10ca
      // 10c9: bipush 0
      // 10ca: bipush 1
      // 10cb: if_icmpne 1104
      // 10ce: aload 1
      // 10cf: instanceof net/minecraft/server/level/ServerLevel
      // 10d2: ifeq 1104
      // 10d5: aload 1
      // 10d6: checkcast net/minecraft/server/level/ServerLevel
      // 10d9: astore 13
      // 10db: new net/minecraft/world/entity/item/ItemEntity
      // 10de: dup
      // 10df: aload 13
      // 10e1: dload 2
      // 10e2: dload 4
      // 10e4: dload 6
      // 10e6: new net/minecraft/world/item/ItemStack
      // 10e9: dup
      // 10ea: getstatic net/minecraft/world/level/block/Blocks.CHEST Lnet/minecraft/world/level/block/Block;
      // 10ed: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 10f0: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 10f3: astore 14
      // 10f5: aload 14
      // 10f7: bipush 10
      // 10f9: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 10fc: aload 13
      // 10fe: aload 14
      // 1100: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1103: pop
      // 1104: aload 1
      // 1105: instanceof net/minecraft/server/level/ServerLevel
      // 1108: ifeq 113d
      // 110b: aload 1
      // 110c: checkcast net/minecraft/server/level/ServerLevel
      // 110f: astore 12
      // 1111: new net/minecraft/world/entity/item/ItemEntity
      // 1114: dup
      // 1115: aload 12
      // 1117: dload 2
      // 1118: dload 4
      // 111a: dload 6
      // 111c: new net/mocreatures/procedures/PetAmuletCapture2Procedure$19
      // 111f: dup
      // 1120: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$19.<init> ()V
      // 1123: bipush 0
      // 1124: aload 8
      // 1126: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$19.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 1129: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 112c: astore 13
      // 112e: aload 13
      // 1130: bipush 10
      // 1132: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1135: aload 12
      // 1137: aload 13
      // 1139: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 113c: pop
      // 113d: aload 1
      // 113e: instanceof net/minecraft/server/level/ServerLevel
      // 1141: ifeq 1176
      // 1144: aload 1
      // 1145: checkcast net/minecraft/server/level/ServerLevel
      // 1148: astore 12
      // 114a: new net/minecraft/world/entity/item/ItemEntity
      // 114d: dup
      // 114e: aload 12
      // 1150: dload 2
      // 1151: dload 4
      // 1153: dload 6
      // 1155: new net/mocreatures/procedures/PetAmuletCapture2Procedure$20
      // 1158: dup
      // 1159: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$20.<init> ()V
      // 115c: bipush 1
      // 115d: aload 8
      // 115f: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$20.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 1162: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1165: astore 13
      // 1167: aload 13
      // 1169: bipush 10
      // 116b: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 116e: aload 12
      // 1170: aload 13
      // 1172: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1175: pop
      // 1176: aload 1
      // 1177: instanceof net/minecraft/server/level/ServerLevel
      // 117a: ifeq 11af
      // 117d: aload 1
      // 117e: checkcast net/minecraft/server/level/ServerLevel
      // 1181: astore 12
      // 1183: new net/minecraft/world/entity/item/ItemEntity
      // 1186: dup
      // 1187: aload 12
      // 1189: dload 2
      // 118a: dload 4
      // 118c: dload 6
      // 118e: new net/mocreatures/procedures/PetAmuletCapture2Procedure$21
      // 1191: dup
      // 1192: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$21.<init> ()V
      // 1195: bipush 2
      // 1196: aload 8
      // 1198: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$21.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 119b: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 119e: astore 13
      // 11a0: aload 13
      // 11a2: bipush 10
      // 11a4: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 11a7: aload 12
      // 11a9: aload 13
      // 11ab: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 11ae: pop
      // 11af: aload 1
      // 11b0: instanceof net/minecraft/server/level/ServerLevel
      // 11b3: ifeq 11e8
      // 11b6: aload 1
      // 11b7: checkcast net/minecraft/server/level/ServerLevel
      // 11ba: astore 12
      // 11bc: new net/minecraft/world/entity/item/ItemEntity
      // 11bf: dup
      // 11c0: aload 12
      // 11c2: dload 2
      // 11c3: dload 4
      // 11c5: dload 6
      // 11c7: new net/mocreatures/procedures/PetAmuletCapture2Procedure$22
      // 11ca: dup
      // 11cb: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$22.<init> ()V
      // 11ce: bipush 3
      // 11cf: aload 8
      // 11d1: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$22.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 11d4: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 11d7: astore 13
      // 11d9: aload 13
      // 11db: bipush 10
      // 11dd: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 11e0: aload 12
      // 11e2: aload 13
      // 11e4: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 11e7: pop
      // 11e8: aload 1
      // 11e9: instanceof net/minecraft/server/level/ServerLevel
      // 11ec: ifeq 1221
      // 11ef: aload 1
      // 11f0: checkcast net/minecraft/server/level/ServerLevel
      // 11f3: astore 12
      // 11f5: new net/minecraft/world/entity/item/ItemEntity
      // 11f8: dup
      // 11f9: aload 12
      // 11fb: dload 2
      // 11fc: dload 4
      // 11fe: dload 6
      // 1200: new net/mocreatures/procedures/PetAmuletCapture2Procedure$23
      // 1203: dup
      // 1204: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$23.<init> ()V
      // 1207: bipush 4
      // 1208: aload 8
      // 120a: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$23.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 120d: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1210: astore 13
      // 1212: aload 13
      // 1214: bipush 10
      // 1216: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1219: aload 12
      // 121b: aload 13
      // 121d: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1220: pop
      // 1221: aload 1
      // 1222: instanceof net/minecraft/server/level/ServerLevel
      // 1225: ifeq 125a
      // 1228: aload 1
      // 1229: checkcast net/minecraft/server/level/ServerLevel
      // 122c: astore 12
      // 122e: new net/minecraft/world/entity/item/ItemEntity
      // 1231: dup
      // 1232: aload 12
      // 1234: dload 2
      // 1235: dload 4
      // 1237: dload 6
      // 1239: new net/mocreatures/procedures/PetAmuletCapture2Procedure$24
      // 123c: dup
      // 123d: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$24.<init> ()V
      // 1240: bipush 5
      // 1241: aload 8
      // 1243: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$24.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 1246: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1249: astore 13
      // 124b: aload 13
      // 124d: bipush 10
      // 124f: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1252: aload 12
      // 1254: aload 13
      // 1256: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1259: pop
      // 125a: aload 1
      // 125b: instanceof net/minecraft/server/level/ServerLevel
      // 125e: ifeq 1294
      // 1261: aload 1
      // 1262: checkcast net/minecraft/server/level/ServerLevel
      // 1265: astore 12
      // 1267: new net/minecraft/world/entity/item/ItemEntity
      // 126a: dup
      // 126b: aload 12
      // 126d: dload 2
      // 126e: dload 4
      // 1270: dload 6
      // 1272: new net/mocreatures/procedures/PetAmuletCapture2Procedure$25
      // 1275: dup
      // 1276: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$25.<init> ()V
      // 1279: bipush 6
      // 127b: aload 8
      // 127d: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$25.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 1280: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1283: astore 13
      // 1285: aload 13
      // 1287: bipush 10
      // 1289: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 128c: aload 12
      // 128e: aload 13
      // 1290: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1293: pop
      // 1294: aload 1
      // 1295: instanceof net/minecraft/server/level/ServerLevel
      // 1298: ifeq 12ce
      // 129b: aload 1
      // 129c: checkcast net/minecraft/server/level/ServerLevel
      // 129f: astore 12
      // 12a1: new net/minecraft/world/entity/item/ItemEntity
      // 12a4: dup
      // 12a5: aload 12
      // 12a7: dload 2
      // 12a8: dload 4
      // 12aa: dload 6
      // 12ac: new net/mocreatures/procedures/PetAmuletCapture2Procedure$26
      // 12af: dup
      // 12b0: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$26.<init> ()V
      // 12b3: bipush 7
      // 12b5: aload 8
      // 12b7: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$26.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 12ba: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 12bd: astore 13
      // 12bf: aload 13
      // 12c1: bipush 10
      // 12c3: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 12c6: aload 12
      // 12c8: aload 13
      // 12ca: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 12cd: pop
      // 12ce: aload 1
      // 12cf: instanceof net/minecraft/server/level/ServerLevel
      // 12d2: ifeq 1308
      // 12d5: aload 1
      // 12d6: checkcast net/minecraft/server/level/ServerLevel
      // 12d9: astore 12
      // 12db: new net/minecraft/world/entity/item/ItemEntity
      // 12de: dup
      // 12df: aload 12
      // 12e1: dload 2
      // 12e2: dload 4
      // 12e4: dload 6
      // 12e6: new net/mocreatures/procedures/PetAmuletCapture2Procedure$27
      // 12e9: dup
      // 12ea: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$27.<init> ()V
      // 12ed: bipush 8
      // 12ef: aload 8
      // 12f1: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$27.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 12f4: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 12f7: astore 13
      // 12f9: aload 13
      // 12fb: bipush 10
      // 12fd: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1300: aload 12
      // 1302: aload 13
      // 1304: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1307: pop
      // 1308: aload 1
      // 1309: instanceof net/minecraft/server/level/ServerLevel
      // 130c: ifeq 1342
      // 130f: aload 1
      // 1310: checkcast net/minecraft/server/level/ServerLevel
      // 1313: astore 12
      // 1315: new net/minecraft/world/entity/item/ItemEntity
      // 1318: dup
      // 1319: aload 12
      // 131b: dload 2
      // 131c: dload 4
      // 131e: dload 6
      // 1320: new net/mocreatures/procedures/PetAmuletCapture2Procedure$28
      // 1323: dup
      // 1324: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$28.<init> ()V
      // 1327: bipush 9
      // 1329: aload 8
      // 132b: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$28.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 132e: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1331: astore 13
      // 1333: aload 13
      // 1335: bipush 10
      // 1337: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 133a: aload 12
      // 133c: aload 13
      // 133e: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1341: pop
      // 1342: aload 1
      // 1343: instanceof net/minecraft/server/level/ServerLevel
      // 1346: ifeq 137c
      // 1349: aload 1
      // 134a: checkcast net/minecraft/server/level/ServerLevel
      // 134d: astore 12
      // 134f: new net/minecraft/world/entity/item/ItemEntity
      // 1352: dup
      // 1353: aload 12
      // 1355: dload 2
      // 1356: dload 4
      // 1358: dload 6
      // 135a: new net/mocreatures/procedures/PetAmuletCapture2Procedure$29
      // 135d: dup
      // 135e: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$29.<init> ()V
      // 1361: bipush 10
      // 1363: aload 8
      // 1365: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$29.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 1368: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 136b: astore 13
      // 136d: aload 13
      // 136f: bipush 10
      // 1371: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1374: aload 12
      // 1376: aload 13
      // 1378: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 137b: pop
      // 137c: aload 1
      // 137d: instanceof net/minecraft/server/level/ServerLevel
      // 1380: ifeq 13b6
      // 1383: aload 1
      // 1384: checkcast net/minecraft/server/level/ServerLevel
      // 1387: astore 12
      // 1389: new net/minecraft/world/entity/item/ItemEntity
      // 138c: dup
      // 138d: aload 12
      // 138f: dload 2
      // 1390: dload 4
      // 1392: dload 6
      // 1394: new net/mocreatures/procedures/PetAmuletCapture2Procedure$30
      // 1397: dup
      // 1398: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$30.<init> ()V
      // 139b: bipush 11
      // 139d: aload 8
      // 139f: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$30.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 13a2: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 13a5: astore 13
      // 13a7: aload 13
      // 13a9: bipush 10
      // 13ab: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 13ae: aload 12
      // 13b0: aload 13
      // 13b2: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 13b5: pop
      // 13b6: aload 1
      // 13b7: instanceof net/minecraft/server/level/ServerLevel
      // 13ba: ifeq 13f0
      // 13bd: aload 1
      // 13be: checkcast net/minecraft/server/level/ServerLevel
      // 13c1: astore 12
      // 13c3: new net/minecraft/world/entity/item/ItemEntity
      // 13c6: dup
      // 13c7: aload 12
      // 13c9: dload 2
      // 13ca: dload 4
      // 13cc: dload 6
      // 13ce: new net/mocreatures/procedures/PetAmuletCapture2Procedure$31
      // 13d1: dup
      // 13d2: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$31.<init> ()V
      // 13d5: bipush 12
      // 13d7: aload 8
      // 13d9: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$31.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 13dc: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 13df: astore 13
      // 13e1: aload 13
      // 13e3: bipush 10
      // 13e5: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 13e8: aload 12
      // 13ea: aload 13
      // 13ec: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 13ef: pop
      // 13f0: aload 1
      // 13f1: instanceof net/minecraft/server/level/ServerLevel
      // 13f4: ifeq 142a
      // 13f7: aload 1
      // 13f8: checkcast net/minecraft/server/level/ServerLevel
      // 13fb: astore 12
      // 13fd: new net/minecraft/world/entity/item/ItemEntity
      // 1400: dup
      // 1401: aload 12
      // 1403: dload 2
      // 1404: dload 4
      // 1406: dload 6
      // 1408: new net/mocreatures/procedures/PetAmuletCapture2Procedure$32
      // 140b: dup
      // 140c: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$32.<init> ()V
      // 140f: bipush 13
      // 1411: aload 8
      // 1413: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$32.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 1416: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1419: astore 13
      // 141b: aload 13
      // 141d: bipush 10
      // 141f: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1422: aload 12
      // 1424: aload 13
      // 1426: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1429: pop
      // 142a: aload 1
      // 142b: instanceof net/minecraft/server/level/ServerLevel
      // 142e: ifeq 1464
      // 1431: aload 1
      // 1432: checkcast net/minecraft/server/level/ServerLevel
      // 1435: astore 12
      // 1437: new net/minecraft/world/entity/item/ItemEntity
      // 143a: dup
      // 143b: aload 12
      // 143d: dload 2
      // 143e: dload 4
      // 1440: dload 6
      // 1442: new net/mocreatures/procedures/PetAmuletCapture2Procedure$33
      // 1445: dup
      // 1446: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$33.<init> ()V
      // 1449: bipush 14
      // 144b: aload 8
      // 144d: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$33.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 1450: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1453: astore 13
      // 1455: aload 13
      // 1457: bipush 10
      // 1459: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 145c: aload 12
      // 145e: aload 13
      // 1460: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1463: pop
      // 1464: aload 1
      // 1465: instanceof net/minecraft/server/level/ServerLevel
      // 1468: ifeq 149e
      // 146b: aload 1
      // 146c: checkcast net/minecraft/server/level/ServerLevel
      // 146f: astore 12
      // 1471: new net/minecraft/world/entity/item/ItemEntity
      // 1474: dup
      // 1475: aload 12
      // 1477: dload 2
      // 1478: dload 4
      // 147a: dload 6
      // 147c: new net/mocreatures/procedures/PetAmuletCapture2Procedure$34
      // 147f: dup
      // 1480: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$34.<init> ()V
      // 1483: bipush 15
      // 1485: aload 8
      // 1487: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$34.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 148a: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 148d: astore 13
      // 148f: aload 13
      // 1491: bipush 10
      // 1493: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1496: aload 12
      // 1498: aload 13
      // 149a: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 149d: pop
      // 149e: aload 1
      // 149f: instanceof net/minecraft/server/level/ServerLevel
      // 14a2: ifeq 14d8
      // 14a5: aload 1
      // 14a6: checkcast net/minecraft/server/level/ServerLevel
      // 14a9: astore 12
      // 14ab: new net/minecraft/world/entity/item/ItemEntity
      // 14ae: dup
      // 14af: aload 12
      // 14b1: dload 2
      // 14b2: dload 4
      // 14b4: dload 6
      // 14b6: new net/mocreatures/procedures/PetAmuletCapture2Procedure$35
      // 14b9: dup
      // 14ba: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$35.<init> ()V
      // 14bd: bipush 16
      // 14bf: aload 8
      // 14c1: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$35.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 14c4: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 14c7: astore 13
      // 14c9: aload 13
      // 14cb: bipush 10
      // 14cd: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 14d0: aload 12
      // 14d2: aload 13
      // 14d4: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 14d7: pop
      // 14d8: aload 1
      // 14d9: instanceof net/minecraft/server/level/ServerLevel
      // 14dc: ifeq 1512
      // 14df: aload 1
      // 14e0: checkcast net/minecraft/server/level/ServerLevel
      // 14e3: astore 12
      // 14e5: new net/minecraft/world/entity/item/ItemEntity
      // 14e8: dup
      // 14e9: aload 12
      // 14eb: dload 2
      // 14ec: dload 4
      // 14ee: dload 6
      // 14f0: new net/mocreatures/procedures/PetAmuletCapture2Procedure$36
      // 14f3: dup
      // 14f4: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$36.<init> ()V
      // 14f7: bipush 17
      // 14f9: aload 8
      // 14fb: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$36.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 14fe: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1501: astore 13
      // 1503: aload 13
      // 1505: bipush 10
      // 1507: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 150a: aload 12
      // 150c: aload 13
      // 150e: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1511: pop
      // 1512: aload 8
      // 1514: invokevirtual net/minecraft/world/entity/Entity.level ()Lnet/minecraft/world/level/Level;
      // 1517: invokevirtual net/minecraft/world/level/Level.isClientSide ()Z
      // 151a: ifne 1522
      // 151d: aload 8
      // 151f: invokevirtual net/minecraft/world/entity/Entity.discard ()V
      // 1522: aload 9
      // 1524: instanceof net/minecraft/world/entity/LivingEntity
      // 1527: ifeq 1539
      // 152a: aload 9
      // 152c: checkcast net/minecraft/world/entity/LivingEntity
      // 152f: astore 11
      // 1531: aload 11
      // 1533: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 1536: goto 153c
      // 1539: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 153c: ldc_w "mocreatures:amulet/empty"
      // 153f: invokestatic net/minecraft/resources/ResourceLocation.parse (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
      // 1542: invokestatic net/minecraft/tags/ItemTags.create (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
      // 1545: invokevirtual net/minecraft/world/item/ItemStack.is (Lnet/minecraft/tags/TagKey;)Z
      // 1548: ifeq 1f6a
      // 154b: aload 8
      // 154d: invokevirtual net/minecraft/world/entity/Entity.getType ()Lnet/minecraft/world/entity/EntityType;
      // 1550: getstatic net/minecraft/core/registries/Registries.ENTITY_TYPE Lnet/minecraft/resources/ResourceKey;
      // 1553: ldc_w "mocreatures:tiger"
      // 1556: invokestatic net/minecraft/resources/ResourceLocation.parse (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
      // 1559: invokestatic net/minecraft/tags/TagKey.create (Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
      // 155c: invokevirtual net/minecraft/world/entity/EntityType.is (Lnet/minecraft/tags/TagKey;)Z
      // 155f: ifeq 1f6a
      // 1562: aload 8
      // 1564: instanceof net/minecraft/world/entity/TamableAnimal
      // 1567: ifeq 15ca
      // 156a: aload 8
      // 156c: checkcast net/minecraft/world/entity/TamableAnimal
      // 156f: astore 12
      // 1571: aload 12
      // 1573: invokevirtual net/minecraft/world/entity/TamableAnimal.isTame ()Z
      // 1576: ifeq 15ca
      // 1579: aload 8
      // 157b: instanceof net/mocreatures/entity/TigerEntity
      // 157e: ifeq 15a0
      // 1581: aload 8
      // 1583: checkcast net/mocreatures/entity/TigerEntity
      // 1586: astore 13
      // 1588: aload 13
      // 158a: invokevirtual net/mocreatures/entity/TigerEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 158d: getstatic net/mocreatures/entity/TigerEntity.DATA_Baby Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1590: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 1593: checkcast java/lang/Boolean
      // 1596: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1599: ifeq 15a0
      // 159c: bipush 1
      // 159d: goto 15a1
      // 15a0: bipush 0
      // 15a1: ifne 15ca
      // 15a4: aload 8
      // 15a6: instanceof net/minecraft/world/entity/TamableAnimal
      // 15a9: ifeq 15bb
      // 15ac: aload 8
      // 15ae: checkcast net/minecraft/world/entity/TamableAnimal
      // 15b1: astore 14
      // 15b3: aload 14
      // 15b5: invokevirtual net/minecraft/world/entity/TamableAnimal.getOwner ()Lnet/minecraft/world/entity/LivingEntity;
      // 15b8: goto 15bc
      // 15bb: aconst_null
      // 15bc: aload 9
      // 15be: if_acmpne 15c7
      // 15c1: bipush 1
      // 15c2: istore 10
      // 15c4: goto 15ca
      // 15c7: bipush 0
      // 15c8: istore 10
      // 15ca: iload 10
      // 15cc: ifeq 1f6a
      // 15cf: aload 9
      // 15d1: instanceof net/minecraft/world/entity/LivingEntity
      // 15d4: ifeq 161a
      // 15d7: aload 9
      // 15d9: checkcast net/minecraft/world/entity/LivingEntity
      // 15dc: astore 12
      // 15de: new net/minecraft/world/item/ItemStack
      // 15e1: dup
      // 15e2: getstatic net/mocreatures/init/MocreaturesModItems.PET_AMULET_FULL Lnet/neoforged/neoforge/registries/DeferredItem;
      // 15e5: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 15e8: checkcast net/minecraft/world/level/ItemLike
      // 15eb: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 15ee: invokevirtual net/minecraft/world/item/ItemStack.copy ()Lnet/minecraft/world/item/ItemStack;
      // 15f1: astore 13
      // 15f3: aload 13
      // 15f5: bipush 1
      // 15f6: invokevirtual net/minecraft/world/item/ItemStack.setCount (I)V
      // 15f9: aload 12
      // 15fb: getstatic net/minecraft/world/InteractionHand.MAIN_HAND Lnet/minecraft/world/InteractionHand;
      // 15fe: aload 13
      // 1600: invokevirtual net/minecraft/world/entity/LivingEntity.setItemInHand (Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/item/ItemStack;)V
      // 1603: aload 12
      // 1605: instanceof net/minecraft/world/entity/player/Player
      // 1608: ifeq 161a
      // 160b: aload 12
      // 160d: checkcast net/minecraft/world/entity/player/Player
      // 1610: astore 14
      // 1612: aload 14
      // 1614: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 1617: invokevirtual net/minecraft/world/entity/player/Inventory.setChanged ()V
      // 161a: ldc_w "Mob"
      // 161d: astore 12
      // 161f: ldc_w "mocreatures:tiger"
      // 1622: astore 13
      // 1624: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 1627: aload 9
      // 1629: instanceof net/minecraft/world/entity/LivingEntity
      // 162c: ifeq 163e
      // 162f: aload 9
      // 1631: checkcast net/minecraft/world/entity/LivingEntity
      // 1634: astore 14
      // 1636: aload 14
      // 1638: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 163b: goto 1641
      // 163e: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 1641: invokedynamic accept ()Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$31 (Lnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 1646: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 1649: ldc_w "Name"
      // 164c: astore 12
      // 164e: aload 8
      // 1650: invokevirtual net/minecraft/world/entity/Entity.getDisplayName ()Lnet/minecraft/network/chat/Component;
      // 1653: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 1658: astore 13
      // 165a: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 165d: aload 9
      // 165f: instanceof net/minecraft/world/entity/LivingEntity
      // 1662: ifeq 1674
      // 1665: aload 9
      // 1667: checkcast net/minecraft/world/entity/LivingEntity
      // 166a: astore 14
      // 166c: aload 14
      // 166e: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 1671: goto 1677
      // 1674: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 1677: aload 13
      // 1679: invokedynamic accept (Ljava/lang/String;)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$32 (Ljava/lang/String;Lnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 167e: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 1681: aload 8
      // 1683: instanceof net/minecraft/world/entity/TamableAnimal
      // 1686: ifeq 16d0
      // 1689: aload 8
      // 168b: checkcast net/minecraft/world/entity/TamableAnimal
      // 168e: astore 12
      // 1690: aload 12
      // 1692: invokevirtual net/minecraft/world/entity/TamableAnimal.isTame ()Z
      // 1695: ifeq 16d0
      // 1698: ldc_w "Owner"
      // 169b: astore 13
      // 169d: aload 9
      // 169f: invokevirtual net/minecraft/world/entity/Entity.getDisplayName ()Lnet/minecraft/network/chat/Component;
      // 16a2: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 16a7: astore 14
      // 16a9: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 16ac: aload 9
      // 16ae: instanceof net/minecraft/world/entity/LivingEntity
      // 16b1: ifeq 16c3
      // 16b4: aload 9
      // 16b6: checkcast net/minecraft/world/entity/LivingEntity
      // 16b9: astore 15
      // 16bb: aload 15
      // 16bd: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 16c0: goto 16c6
      // 16c3: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 16c6: aload 14
      // 16c8: invokedynamic accept (Ljava/lang/String;)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$33 (Ljava/lang/String;Lnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 16cd: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 16d0: ldc_w "Leashed"
      // 16d3: astore 12
      // 16d5: aload 8
      // 16d7: instanceof net/minecraft/world/entity/Mob
      // 16da: ifeq 16ec
      // 16dd: aload 8
      // 16df: checkcast net/minecraft/world/entity/Mob
      // 16e2: astore 14
      // 16e4: aload 14
      // 16e6: invokevirtual net/minecraft/world/entity/Mob.isLeashed ()Z
      // 16e9: goto 16ed
      // 16ec: bipush 0
      // 16ed: istore 13
      // 16ef: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 16f2: aload 9
      // 16f4: instanceof net/minecraft/world/entity/LivingEntity
      // 16f7: ifeq 1709
      // 16fa: aload 9
      // 16fc: checkcast net/minecraft/world/entity/LivingEntity
      // 16ff: astore 14
      // 1701: aload 14
      // 1703: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 1706: goto 170c
      // 1709: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 170c: iload 13
      // 170e: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$34 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 1713: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 1716: ldc_w "NoGravity"
      // 1719: astore 12
      // 171b: aload 8
      // 171d: invokevirtual net/minecraft/world/entity/Entity.isNoGravity ()Z
      // 1720: istore 13
      // 1722: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 1725: aload 9
      // 1727: instanceof net/minecraft/world/entity/LivingEntity
      // 172a: ifeq 173c
      // 172d: aload 9
      // 172f: checkcast net/minecraft/world/entity/LivingEntity
      // 1732: astore 14
      // 1734: aload 14
      // 1736: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 1739: goto 173f
      // 173c: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 173f: iload 13
      // 1741: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$35 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 1746: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 1749: ldc_w "MaxHealth"
      // 174c: astore 12
      // 174e: aload 8
      // 1750: instanceof net/minecraft/world/entity/LivingEntity
      // 1753: ifeq 1766
      // 1756: aload 8
      // 1758: checkcast net/minecraft/world/entity/LivingEntity
      // 175b: astore 15
      // 175d: aload 15
      // 175f: invokevirtual net/minecraft/world/entity/LivingEntity.getMaxHealth ()F
      // 1762: f2d
      // 1763: goto 1769
      // 1766: ldc2_w -1.0
      // 1769: dstore 13
      // 176b: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 176e: aload 9
      // 1770: instanceof net/minecraft/world/entity/LivingEntity
      // 1773: ifeq 1785
      // 1776: aload 9
      // 1778: checkcast net/minecraft/world/entity/LivingEntity
      // 177b: astore 15
      // 177d: aload 15
      // 177f: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 1782: goto 1788
      // 1785: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 1788: dload 13
      // 178a: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$36 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 178f: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 1792: ldc_w "Health"
      // 1795: astore 12
      // 1797: aload 8
      // 1799: instanceof net/minecraft/world/entity/LivingEntity
      // 179c: ifeq 17af
      // 179f: aload 8
      // 17a1: checkcast net/minecraft/world/entity/LivingEntity
      // 17a4: astore 15
      // 17a6: aload 15
      // 17a8: invokevirtual net/minecraft/world/entity/LivingEntity.getHealth ()F
      // 17ab: f2d
      // 17ac: goto 17b2
      // 17af: ldc2_w -1.0
      // 17b2: dstore 13
      // 17b4: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 17b7: aload 9
      // 17b9: instanceof net/minecraft/world/entity/LivingEntity
      // 17bc: ifeq 17ce
      // 17bf: aload 9
      // 17c1: checkcast net/minecraft/world/entity/LivingEntity
      // 17c4: astore 15
      // 17c6: aload 15
      // 17c8: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 17cb: goto 17d1
      // 17ce: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 17d1: dload 13
      // 17d3: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$37 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 17d8: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 17db: ldc_w "Air"
      // 17de: astore 12
      // 17e0: aload 8
      // 17e2: invokevirtual net/minecraft/world/entity/Entity.getAirSupply ()I
      // 17e5: i2d
      // 17e6: dstore 13
      // 17e8: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 17eb: aload 9
      // 17ed: instanceof net/minecraft/world/entity/LivingEntity
      // 17f0: ifeq 1802
      // 17f3: aload 9
      // 17f5: checkcast net/minecraft/world/entity/LivingEntity
      // 17f8: astore 15
      // 17fa: aload 15
      // 17fc: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 17ff: goto 1805
      // 1802: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 1805: dload 13
      // 1807: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$38 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 180c: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 180f: ldc_w "MotionX"
      // 1812: astore 12
      // 1814: aload 8
      // 1816: invokevirtual net/minecraft/world/entity/Entity.getDeltaMovement ()Lnet/minecraft/world/phys/Vec3;
      // 1819: invokevirtual net/minecraft/world/phys/Vec3.x ()D
      // 181c: dstore 13
      // 181e: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 1821: aload 9
      // 1823: instanceof net/minecraft/world/entity/LivingEntity
      // 1826: ifeq 1838
      // 1829: aload 9
      // 182b: checkcast net/minecraft/world/entity/LivingEntity
      // 182e: astore 15
      // 1830: aload 15
      // 1832: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 1835: goto 183b
      // 1838: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 183b: dload 13
      // 183d: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$39 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 1842: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 1845: ldc_w "MotionY"
      // 1848: astore 12
      // 184a: aload 8
      // 184c: invokevirtual net/minecraft/world/entity/Entity.getDeltaMovement ()Lnet/minecraft/world/phys/Vec3;
      // 184f: invokevirtual net/minecraft/world/phys/Vec3.y ()D
      // 1852: dstore 13
      // 1854: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 1857: aload 9
      // 1859: instanceof net/minecraft/world/entity/LivingEntity
      // 185c: ifeq 186e
      // 185f: aload 9
      // 1861: checkcast net/minecraft/world/entity/LivingEntity
      // 1864: astore 15
      // 1866: aload 15
      // 1868: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 186b: goto 1871
      // 186e: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 1871: dload 13
      // 1873: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$40 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 1878: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 187b: ldc_w "MotionZ"
      // 187e: astore 12
      // 1880: aload 8
      // 1882: invokevirtual net/minecraft/world/entity/Entity.getDeltaMovement ()Lnet/minecraft/world/phys/Vec3;
      // 1885: invokevirtual net/minecraft/world/phys/Vec3.z ()D
      // 1888: dstore 13
      // 188a: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 188d: aload 9
      // 188f: instanceof net/minecraft/world/entity/LivingEntity
      // 1892: ifeq 18a4
      // 1895: aload 9
      // 1897: checkcast net/minecraft/world/entity/LivingEntity
      // 189a: astore 15
      // 189c: aload 15
      // 189e: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 18a1: goto 18a7
      // 18a4: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 18a7: dload 13
      // 18a9: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$41 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 18ae: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 18b1: ldc_w "RotationYaw"
      // 18b4: astore 12
      // 18b6: aload 8
      // 18b8: invokevirtual net/minecraft/world/entity/Entity.getYRot ()F
      // 18bb: f2d
      // 18bc: dstore 13
      // 18be: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 18c1: aload 9
      // 18c3: instanceof net/minecraft/world/entity/LivingEntity
      // 18c6: ifeq 18d8
      // 18c9: aload 9
      // 18cb: checkcast net/minecraft/world/entity/LivingEntity
      // 18ce: astore 15
      // 18d0: aload 15
      // 18d2: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 18d5: goto 18db
      // 18d8: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 18db: dload 13
      // 18dd: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$42 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 18e2: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 18e5: ldc_w "RotationPitch"
      // 18e8: astore 12
      // 18ea: aload 8
      // 18ec: invokevirtual net/minecraft/world/entity/Entity.getXRot ()F
      // 18ef: f2d
      // 18f0: dstore 13
      // 18f2: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 18f5: aload 9
      // 18f7: instanceof net/minecraft/world/entity/LivingEntity
      // 18fa: ifeq 190c
      // 18fd: aload 9
      // 18ff: checkcast net/minecraft/world/entity/LivingEntity
      // 1902: astore 15
      // 1904: aload 15
      // 1906: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 1909: goto 190f
      // 190c: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 190f: dload 13
      // 1911: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$43 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 1916: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 1919: ldc_w "Gender"
      // 191c: astore 12
      // 191e: aload 8
      // 1920: instanceof net/mocreatures/entity/TigerEntity
      // 1923: ifeq 1942
      // 1926: aload 8
      // 1928: checkcast net/mocreatures/entity/TigerEntity
      // 192b: astore 15
      // 192d: aload 15
      // 192f: invokevirtual net/mocreatures/entity/TigerEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1932: getstatic net/mocreatures/entity/TigerEntity.DATA_Gender Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1935: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 1938: checkcast java/lang/Integer
      // 193b: invokevirtual java/lang/Integer.intValue ()I
      // 193e: i2d
      // 193f: goto 1943
      // 1942: dconst_0
      // 1943: dstore 13
      // 1945: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 1948: aload 9
      // 194a: instanceof net/minecraft/world/entity/LivingEntity
      // 194d: ifeq 195f
      // 1950: aload 9
      // 1952: checkcast net/minecraft/world/entity/LivingEntity
      // 1955: astore 15
      // 1957: aload 15
      // 1959: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 195c: goto 1962
      // 195f: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 1962: dload 13
      // 1964: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$44 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 1969: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 196c: ldc_w "Color"
      // 196f: astore 12
      // 1971: aload 8
      // 1973: instanceof net/mocreatures/entity/TigerEntity
      // 1976: ifeq 1995
      // 1979: aload 8
      // 197b: checkcast net/mocreatures/entity/TigerEntity
      // 197e: astore 15
      // 1980: aload 15
      // 1982: invokevirtual net/mocreatures/entity/TigerEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1985: getstatic net/mocreatures/entity/TigerEntity.DATA_Color Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1988: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 198b: checkcast java/lang/Integer
      // 198e: invokevirtual java/lang/Integer.intValue ()I
      // 1991: i2d
      // 1992: goto 1996
      // 1995: dconst_0
      // 1996: dstore 13
      // 1998: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 199b: aload 9
      // 199d: instanceof net/minecraft/world/entity/LivingEntity
      // 19a0: ifeq 19b2
      // 19a3: aload 9
      // 19a5: checkcast net/minecraft/world/entity/LivingEntity
      // 19a8: astore 15
      // 19aa: aload 15
      // 19ac: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 19af: goto 19b5
      // 19b2: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 19b5: dload 13
      // 19b7: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$45 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 19bc: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 19bf: ldc_w "Wings"
      // 19c2: astore 12
      // 19c4: aload 8
      // 19c6: instanceof net/mocreatures/entity/TigerEntity
      // 19c9: ifeq 19eb
      // 19cc: aload 8
      // 19ce: checkcast net/mocreatures/entity/TigerEntity
      // 19d1: astore 14
      // 19d3: aload 14
      // 19d5: invokevirtual net/mocreatures/entity/TigerEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 19d8: getstatic net/mocreatures/entity/TigerEntity.DATA_Wings Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 19db: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 19de: checkcast java/lang/Boolean
      // 19e1: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 19e4: ifeq 19eb
      // 19e7: bipush 1
      // 19e8: goto 19ec
      // 19eb: bipush 0
      // 19ec: istore 13
      // 19ee: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 19f1: aload 9
      // 19f3: instanceof net/minecraft/world/entity/LivingEntity
      // 19f6: ifeq 1a08
      // 19f9: aload 9
      // 19fb: checkcast net/minecraft/world/entity/LivingEntity
      // 19fe: astore 14
      // 1a00: aload 14
      // 1a02: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 1a05: goto 1a0b
      // 1a08: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 1a0b: iload 13
      // 1a0d: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$46 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 1a12: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 1a15: ldc_w "Medallion"
      // 1a18: astore 12
      // 1a1a: aload 8
      // 1a1c: instanceof net/mocreatures/entity/TigerEntity
      // 1a1f: ifeq 1a41
      // 1a22: aload 8
      // 1a24: checkcast net/mocreatures/entity/TigerEntity
      // 1a27: astore 14
      // 1a29: aload 14
      // 1a2b: invokevirtual net/mocreatures/entity/TigerEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1a2e: getstatic net/mocreatures/entity/TigerEntity.DATA_Medallion Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1a31: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 1a34: checkcast java/lang/Boolean
      // 1a37: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1a3a: ifeq 1a41
      // 1a3d: bipush 1
      // 1a3e: goto 1a42
      // 1a41: bipush 0
      // 1a42: istore 13
      // 1a44: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 1a47: aload 9
      // 1a49: instanceof net/minecraft/world/entity/LivingEntity
      // 1a4c: ifeq 1a5e
      // 1a4f: aload 9
      // 1a51: checkcast net/minecraft/world/entity/LivingEntity
      // 1a54: astore 14
      // 1a56: aload 14
      // 1a58: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 1a5b: goto 1a61
      // 1a5e: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 1a61: iload 13
      // 1a63: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$47 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 1a68: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 1a6b: aload 8
      // 1a6d: invokevirtual net/minecraft/world/entity/Entity.getType ()Lnet/minecraft/world/entity/EntityType;
      // 1a70: getstatic net/minecraft/core/registries/Registries.ENTITY_TYPE Lnet/minecraft/resources/ResourceKey;
      // 1a73: ldc_w "mocreatures:tiger"
      // 1a76: invokestatic net/minecraft/resources/ResourceLocation.parse (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
      // 1a79: invokestatic net/minecraft/tags/TagKey.create (Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
      // 1a7c: invokevirtual net/minecraft/world/entity/EntityType.is (Lnet/minecraft/tags/TagKey;)Z
      // 1a7f: ifeq 1f6a
      // 1a82: aload 8
      // 1a84: instanceof net/mocreatures/entity/TigerEntity
      // 1a87: ifeq 1aa9
      // 1a8a: aload 8
      // 1a8c: checkcast net/mocreatures/entity/TigerEntity
      // 1a8f: astore 12
      // 1a91: aload 12
      // 1a93: invokevirtual net/mocreatures/entity/TigerEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1a96: getstatic net/mocreatures/entity/TigerEntity.DATA_Saddle Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1a99: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 1a9c: checkcast java/lang/Boolean
      // 1a9f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1aa2: ifeq 1aa9
      // 1aa5: bipush 1
      // 1aa6: goto 1aaa
      // 1aa9: bipush 0
      // 1aaa: bipush 1
      // 1aab: if_icmpne 1aea
      // 1aae: aload 1
      // 1aaf: instanceof net/minecraft/server/level/ServerLevel
      // 1ab2: ifeq 1aea
      // 1ab5: aload 1
      // 1ab6: checkcast net/minecraft/server/level/ServerLevel
      // 1ab9: astore 13
      // 1abb: new net/minecraft/world/entity/item/ItemEntity
      // 1abe: dup
      // 1abf: aload 13
      // 1ac1: dload 2
      // 1ac2: dload 4
      // 1ac4: dload 6
      // 1ac6: new net/minecraft/world/item/ItemStack
      // 1ac9: dup
      // 1aca: getstatic net/mocreatures/init/MocreaturesModItems.CRAFTED_SADDLE Lnet/neoforged/neoforge/registries/DeferredItem;
      // 1acd: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 1ad0: checkcast net/minecraft/world/level/ItemLike
      // 1ad3: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 1ad6: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1ad9: astore 14
      // 1adb: aload 14
      // 1add: bipush 10
      // 1adf: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1ae2: aload 13
      // 1ae4: aload 14
      // 1ae6: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1ae9: pop
      // 1aea: aload 8
      // 1aec: instanceof net/mocreatures/entity/TigerEntity
      // 1aef: ifeq 1b11
      // 1af2: aload 8
      // 1af4: checkcast net/mocreatures/entity/TigerEntity
      // 1af7: astore 12
      // 1af9: aload 12
      // 1afb: invokevirtual net/mocreatures/entity/TigerEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1afe: getstatic net/mocreatures/entity/TigerEntity.DATA_Chest Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1b01: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 1b04: checkcast java/lang/Boolean
      // 1b07: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1b0a: ifeq 1b11
      // 1b0d: bipush 1
      // 1b0e: goto 1b12
      // 1b11: bipush 0
      // 1b12: bipush 1
      // 1b13: if_icmpne 1b4c
      // 1b16: aload 1
      // 1b17: instanceof net/minecraft/server/level/ServerLevel
      // 1b1a: ifeq 1b4c
      // 1b1d: aload 1
      // 1b1e: checkcast net/minecraft/server/level/ServerLevel
      // 1b21: astore 13
      // 1b23: new net/minecraft/world/entity/item/ItemEntity
      // 1b26: dup
      // 1b27: aload 13
      // 1b29: dload 2
      // 1b2a: dload 4
      // 1b2c: dload 6
      // 1b2e: new net/minecraft/world/item/ItemStack
      // 1b31: dup
      // 1b32: getstatic net/minecraft/world/level/block/Blocks.CHEST Lnet/minecraft/world/level/block/Block;
      // 1b35: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 1b38: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1b3b: astore 14
      // 1b3d: aload 14
      // 1b3f: bipush 10
      // 1b41: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1b44: aload 13
      // 1b46: aload 14
      // 1b48: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1b4b: pop
      // 1b4c: aload 1
      // 1b4d: instanceof net/minecraft/server/level/ServerLevel
      // 1b50: ifeq 1b85
      // 1b53: aload 1
      // 1b54: checkcast net/minecraft/server/level/ServerLevel
      // 1b57: astore 12
      // 1b59: new net/minecraft/world/entity/item/ItemEntity
      // 1b5c: dup
      // 1b5d: aload 12
      // 1b5f: dload 2
      // 1b60: dload 4
      // 1b62: dload 6
      // 1b64: new net/mocreatures/procedures/PetAmuletCapture2Procedure$37
      // 1b67: dup
      // 1b68: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$37.<init> ()V
      // 1b6b: bipush 0
      // 1b6c: aload 8
      // 1b6e: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$37.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 1b71: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1b74: astore 13
      // 1b76: aload 13
      // 1b78: bipush 10
      // 1b7a: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1b7d: aload 12
      // 1b7f: aload 13
      // 1b81: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1b84: pop
      // 1b85: aload 1
      // 1b86: instanceof net/minecraft/server/level/ServerLevel
      // 1b89: ifeq 1bbe
      // 1b8c: aload 1
      // 1b8d: checkcast net/minecraft/server/level/ServerLevel
      // 1b90: astore 12
      // 1b92: new net/minecraft/world/entity/item/ItemEntity
      // 1b95: dup
      // 1b96: aload 12
      // 1b98: dload 2
      // 1b99: dload 4
      // 1b9b: dload 6
      // 1b9d: new net/mocreatures/procedures/PetAmuletCapture2Procedure$38
      // 1ba0: dup
      // 1ba1: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$38.<init> ()V
      // 1ba4: bipush 1
      // 1ba5: aload 8
      // 1ba7: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$38.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 1baa: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1bad: astore 13
      // 1baf: aload 13
      // 1bb1: bipush 10
      // 1bb3: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1bb6: aload 12
      // 1bb8: aload 13
      // 1bba: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1bbd: pop
      // 1bbe: aload 1
      // 1bbf: instanceof net/minecraft/server/level/ServerLevel
      // 1bc2: ifeq 1bf7
      // 1bc5: aload 1
      // 1bc6: checkcast net/minecraft/server/level/ServerLevel
      // 1bc9: astore 12
      // 1bcb: new net/minecraft/world/entity/item/ItemEntity
      // 1bce: dup
      // 1bcf: aload 12
      // 1bd1: dload 2
      // 1bd2: dload 4
      // 1bd4: dload 6
      // 1bd6: new net/mocreatures/procedures/PetAmuletCapture2Procedure$39
      // 1bd9: dup
      // 1bda: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$39.<init> ()V
      // 1bdd: bipush 2
      // 1bde: aload 8
      // 1be0: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$39.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 1be3: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1be6: astore 13
      // 1be8: aload 13
      // 1bea: bipush 10
      // 1bec: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1bef: aload 12
      // 1bf1: aload 13
      // 1bf3: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1bf6: pop
      // 1bf7: aload 1
      // 1bf8: instanceof net/minecraft/server/level/ServerLevel
      // 1bfb: ifeq 1c30
      // 1bfe: aload 1
      // 1bff: checkcast net/minecraft/server/level/ServerLevel
      // 1c02: astore 12
      // 1c04: new net/minecraft/world/entity/item/ItemEntity
      // 1c07: dup
      // 1c08: aload 12
      // 1c0a: dload 2
      // 1c0b: dload 4
      // 1c0d: dload 6
      // 1c0f: new net/mocreatures/procedures/PetAmuletCapture2Procedure$40
      // 1c12: dup
      // 1c13: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$40.<init> ()V
      // 1c16: bipush 3
      // 1c17: aload 8
      // 1c19: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$40.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 1c1c: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1c1f: astore 13
      // 1c21: aload 13
      // 1c23: bipush 10
      // 1c25: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1c28: aload 12
      // 1c2a: aload 13
      // 1c2c: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1c2f: pop
      // 1c30: aload 1
      // 1c31: instanceof net/minecraft/server/level/ServerLevel
      // 1c34: ifeq 1c69
      // 1c37: aload 1
      // 1c38: checkcast net/minecraft/server/level/ServerLevel
      // 1c3b: astore 12
      // 1c3d: new net/minecraft/world/entity/item/ItemEntity
      // 1c40: dup
      // 1c41: aload 12
      // 1c43: dload 2
      // 1c44: dload 4
      // 1c46: dload 6
      // 1c48: new net/mocreatures/procedures/PetAmuletCapture2Procedure$41
      // 1c4b: dup
      // 1c4c: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$41.<init> ()V
      // 1c4f: bipush 4
      // 1c50: aload 8
      // 1c52: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$41.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 1c55: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1c58: astore 13
      // 1c5a: aload 13
      // 1c5c: bipush 10
      // 1c5e: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1c61: aload 12
      // 1c63: aload 13
      // 1c65: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1c68: pop
      // 1c69: aload 1
      // 1c6a: instanceof net/minecraft/server/level/ServerLevel
      // 1c6d: ifeq 1ca2
      // 1c70: aload 1
      // 1c71: checkcast net/minecraft/server/level/ServerLevel
      // 1c74: astore 12
      // 1c76: new net/minecraft/world/entity/item/ItemEntity
      // 1c79: dup
      // 1c7a: aload 12
      // 1c7c: dload 2
      // 1c7d: dload 4
      // 1c7f: dload 6
      // 1c81: new net/mocreatures/procedures/PetAmuletCapture2Procedure$42
      // 1c84: dup
      // 1c85: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$42.<init> ()V
      // 1c88: bipush 5
      // 1c89: aload 8
      // 1c8b: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$42.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 1c8e: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1c91: astore 13
      // 1c93: aload 13
      // 1c95: bipush 10
      // 1c97: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1c9a: aload 12
      // 1c9c: aload 13
      // 1c9e: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1ca1: pop
      // 1ca2: aload 1
      // 1ca3: instanceof net/minecraft/server/level/ServerLevel
      // 1ca6: ifeq 1cdc
      // 1ca9: aload 1
      // 1caa: checkcast net/minecraft/server/level/ServerLevel
      // 1cad: astore 12
      // 1caf: new net/minecraft/world/entity/item/ItemEntity
      // 1cb2: dup
      // 1cb3: aload 12
      // 1cb5: dload 2
      // 1cb6: dload 4
      // 1cb8: dload 6
      // 1cba: new net/mocreatures/procedures/PetAmuletCapture2Procedure$43
      // 1cbd: dup
      // 1cbe: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$43.<init> ()V
      // 1cc1: bipush 6
      // 1cc3: aload 8
      // 1cc5: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$43.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 1cc8: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1ccb: astore 13
      // 1ccd: aload 13
      // 1ccf: bipush 10
      // 1cd1: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1cd4: aload 12
      // 1cd6: aload 13
      // 1cd8: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1cdb: pop
      // 1cdc: aload 1
      // 1cdd: instanceof net/minecraft/server/level/ServerLevel
      // 1ce0: ifeq 1d16
      // 1ce3: aload 1
      // 1ce4: checkcast net/minecraft/server/level/ServerLevel
      // 1ce7: astore 12
      // 1ce9: new net/minecraft/world/entity/item/ItemEntity
      // 1cec: dup
      // 1ced: aload 12
      // 1cef: dload 2
      // 1cf0: dload 4
      // 1cf2: dload 6
      // 1cf4: new net/mocreatures/procedures/PetAmuletCapture2Procedure$44
      // 1cf7: dup
      // 1cf8: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$44.<init> ()V
      // 1cfb: bipush 7
      // 1cfd: aload 8
      // 1cff: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$44.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 1d02: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1d05: astore 13
      // 1d07: aload 13
      // 1d09: bipush 10
      // 1d0b: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1d0e: aload 12
      // 1d10: aload 13
      // 1d12: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1d15: pop
      // 1d16: aload 1
      // 1d17: instanceof net/minecraft/server/level/ServerLevel
      // 1d1a: ifeq 1d50
      // 1d1d: aload 1
      // 1d1e: checkcast net/minecraft/server/level/ServerLevel
      // 1d21: astore 12
      // 1d23: new net/minecraft/world/entity/item/ItemEntity
      // 1d26: dup
      // 1d27: aload 12
      // 1d29: dload 2
      // 1d2a: dload 4
      // 1d2c: dload 6
      // 1d2e: new net/mocreatures/procedures/PetAmuletCapture2Procedure$45
      // 1d31: dup
      // 1d32: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$45.<init> ()V
      // 1d35: bipush 8
      // 1d37: aload 8
      // 1d39: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$45.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 1d3c: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1d3f: astore 13
      // 1d41: aload 13
      // 1d43: bipush 10
      // 1d45: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1d48: aload 12
      // 1d4a: aload 13
      // 1d4c: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1d4f: pop
      // 1d50: aload 1
      // 1d51: instanceof net/minecraft/server/level/ServerLevel
      // 1d54: ifeq 1d8a
      // 1d57: aload 1
      // 1d58: checkcast net/minecraft/server/level/ServerLevel
      // 1d5b: astore 12
      // 1d5d: new net/minecraft/world/entity/item/ItemEntity
      // 1d60: dup
      // 1d61: aload 12
      // 1d63: dload 2
      // 1d64: dload 4
      // 1d66: dload 6
      // 1d68: new net/mocreatures/procedures/PetAmuletCapture2Procedure$46
      // 1d6b: dup
      // 1d6c: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$46.<init> ()V
      // 1d6f: bipush 9
      // 1d71: aload 8
      // 1d73: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$46.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 1d76: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1d79: astore 13
      // 1d7b: aload 13
      // 1d7d: bipush 10
      // 1d7f: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1d82: aload 12
      // 1d84: aload 13
      // 1d86: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1d89: pop
      // 1d8a: aload 1
      // 1d8b: instanceof net/minecraft/server/level/ServerLevel
      // 1d8e: ifeq 1dc4
      // 1d91: aload 1
      // 1d92: checkcast net/minecraft/server/level/ServerLevel
      // 1d95: astore 12
      // 1d97: new net/minecraft/world/entity/item/ItemEntity
      // 1d9a: dup
      // 1d9b: aload 12
      // 1d9d: dload 2
      // 1d9e: dload 4
      // 1da0: dload 6
      // 1da2: new net/mocreatures/procedures/PetAmuletCapture2Procedure$47
      // 1da5: dup
      // 1da6: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$47.<init> ()V
      // 1da9: bipush 10
      // 1dab: aload 8
      // 1dad: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$47.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 1db0: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1db3: astore 13
      // 1db5: aload 13
      // 1db7: bipush 10
      // 1db9: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1dbc: aload 12
      // 1dbe: aload 13
      // 1dc0: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1dc3: pop
      // 1dc4: aload 1
      // 1dc5: instanceof net/minecraft/server/level/ServerLevel
      // 1dc8: ifeq 1dfe
      // 1dcb: aload 1
      // 1dcc: checkcast net/minecraft/server/level/ServerLevel
      // 1dcf: astore 12
      // 1dd1: new net/minecraft/world/entity/item/ItemEntity
      // 1dd4: dup
      // 1dd5: aload 12
      // 1dd7: dload 2
      // 1dd8: dload 4
      // 1dda: dload 6
      // 1ddc: new net/mocreatures/procedures/PetAmuletCapture2Procedure$48
      // 1ddf: dup
      // 1de0: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$48.<init> ()V
      // 1de3: bipush 11
      // 1de5: aload 8
      // 1de7: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$48.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 1dea: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1ded: astore 13
      // 1def: aload 13
      // 1df1: bipush 10
      // 1df3: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1df6: aload 12
      // 1df8: aload 13
      // 1dfa: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1dfd: pop
      // 1dfe: aload 1
      // 1dff: instanceof net/minecraft/server/level/ServerLevel
      // 1e02: ifeq 1e38
      // 1e05: aload 1
      // 1e06: checkcast net/minecraft/server/level/ServerLevel
      // 1e09: astore 12
      // 1e0b: new net/minecraft/world/entity/item/ItemEntity
      // 1e0e: dup
      // 1e0f: aload 12
      // 1e11: dload 2
      // 1e12: dload 4
      // 1e14: dload 6
      // 1e16: new net/mocreatures/procedures/PetAmuletCapture2Procedure$49
      // 1e19: dup
      // 1e1a: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$49.<init> ()V
      // 1e1d: bipush 12
      // 1e1f: aload 8
      // 1e21: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$49.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 1e24: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1e27: astore 13
      // 1e29: aload 13
      // 1e2b: bipush 10
      // 1e2d: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1e30: aload 12
      // 1e32: aload 13
      // 1e34: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1e37: pop
      // 1e38: aload 1
      // 1e39: instanceof net/minecraft/server/level/ServerLevel
      // 1e3c: ifeq 1e72
      // 1e3f: aload 1
      // 1e40: checkcast net/minecraft/server/level/ServerLevel
      // 1e43: astore 12
      // 1e45: new net/minecraft/world/entity/item/ItemEntity
      // 1e48: dup
      // 1e49: aload 12
      // 1e4b: dload 2
      // 1e4c: dload 4
      // 1e4e: dload 6
      // 1e50: new net/mocreatures/procedures/PetAmuletCapture2Procedure$50
      // 1e53: dup
      // 1e54: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$50.<init> ()V
      // 1e57: bipush 13
      // 1e59: aload 8
      // 1e5b: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$50.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 1e5e: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1e61: astore 13
      // 1e63: aload 13
      // 1e65: bipush 10
      // 1e67: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1e6a: aload 12
      // 1e6c: aload 13
      // 1e6e: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1e71: pop
      // 1e72: aload 1
      // 1e73: instanceof net/minecraft/server/level/ServerLevel
      // 1e76: ifeq 1eac
      // 1e79: aload 1
      // 1e7a: checkcast net/minecraft/server/level/ServerLevel
      // 1e7d: astore 12
      // 1e7f: new net/minecraft/world/entity/item/ItemEntity
      // 1e82: dup
      // 1e83: aload 12
      // 1e85: dload 2
      // 1e86: dload 4
      // 1e88: dload 6
      // 1e8a: new net/mocreatures/procedures/PetAmuletCapture2Procedure$51
      // 1e8d: dup
      // 1e8e: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$51.<init> ()V
      // 1e91: bipush 14
      // 1e93: aload 8
      // 1e95: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$51.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 1e98: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1e9b: astore 13
      // 1e9d: aload 13
      // 1e9f: bipush 10
      // 1ea1: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1ea4: aload 12
      // 1ea6: aload 13
      // 1ea8: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1eab: pop
      // 1eac: aload 1
      // 1ead: instanceof net/minecraft/server/level/ServerLevel
      // 1eb0: ifeq 1ee6
      // 1eb3: aload 1
      // 1eb4: checkcast net/minecraft/server/level/ServerLevel
      // 1eb7: astore 12
      // 1eb9: new net/minecraft/world/entity/item/ItemEntity
      // 1ebc: dup
      // 1ebd: aload 12
      // 1ebf: dload 2
      // 1ec0: dload 4
      // 1ec2: dload 6
      // 1ec4: new net/mocreatures/procedures/PetAmuletCapture2Procedure$52
      // 1ec7: dup
      // 1ec8: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$52.<init> ()V
      // 1ecb: bipush 15
      // 1ecd: aload 8
      // 1ecf: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$52.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 1ed2: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1ed5: astore 13
      // 1ed7: aload 13
      // 1ed9: bipush 10
      // 1edb: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1ede: aload 12
      // 1ee0: aload 13
      // 1ee2: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1ee5: pop
      // 1ee6: aload 1
      // 1ee7: instanceof net/minecraft/server/level/ServerLevel
      // 1eea: ifeq 1f20
      // 1eed: aload 1
      // 1eee: checkcast net/minecraft/server/level/ServerLevel
      // 1ef1: astore 12
      // 1ef3: new net/minecraft/world/entity/item/ItemEntity
      // 1ef6: dup
      // 1ef7: aload 12
      // 1ef9: dload 2
      // 1efa: dload 4
      // 1efc: dload 6
      // 1efe: new net/mocreatures/procedures/PetAmuletCapture2Procedure$53
      // 1f01: dup
      // 1f02: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$53.<init> ()V
      // 1f05: bipush 16
      // 1f07: aload 8
      // 1f09: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$53.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 1f0c: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1f0f: astore 13
      // 1f11: aload 13
      // 1f13: bipush 10
      // 1f15: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1f18: aload 12
      // 1f1a: aload 13
      // 1f1c: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1f1f: pop
      // 1f20: aload 1
      // 1f21: instanceof net/minecraft/server/level/ServerLevel
      // 1f24: ifeq 1f5a
      // 1f27: aload 1
      // 1f28: checkcast net/minecraft/server/level/ServerLevel
      // 1f2b: astore 12
      // 1f2d: new net/minecraft/world/entity/item/ItemEntity
      // 1f30: dup
      // 1f31: aload 12
      // 1f33: dload 2
      // 1f34: dload 4
      // 1f36: dload 6
      // 1f38: new net/mocreatures/procedures/PetAmuletCapture2Procedure$54
      // 1f3b: dup
      // 1f3c: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$54.<init> ()V
      // 1f3f: bipush 17
      // 1f41: aload 8
      // 1f43: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$54.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 1f46: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 1f49: astore 13
      // 1f4b: aload 13
      // 1f4d: bipush 10
      // 1f4f: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 1f52: aload 12
      // 1f54: aload 13
      // 1f56: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 1f59: pop
      // 1f5a: aload 8
      // 1f5c: invokevirtual net/minecraft/world/entity/Entity.level ()Lnet/minecraft/world/level/Level;
      // 1f5f: invokevirtual net/minecraft/world/level/Level.isClientSide ()Z
      // 1f62: ifne 1f6a
      // 1f65: aload 8
      // 1f67: invokevirtual net/minecraft/world/entity/Entity.discard ()V
      // 1f6a: aload 9
      // 1f6c: instanceof net/minecraft/world/entity/LivingEntity
      // 1f6f: ifeq 1f81
      // 1f72: aload 9
      // 1f74: checkcast net/minecraft/world/entity/LivingEntity
      // 1f77: astore 11
      // 1f79: aload 11
      // 1f7b: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 1f7e: goto 1f84
      // 1f81: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 1f84: ldc_w "mocreatures:amulet/empty"
      // 1f87: invokestatic net/minecraft/resources/ResourceLocation.parse (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
      // 1f8a: invokestatic net/minecraft/tags/ItemTags.create (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
      // 1f8d: invokevirtual net/minecraft/world/item/ItemStack.is (Lnet/minecraft/tags/TagKey;)Z
      // 1f90: ifeq 29b2
      // 1f93: aload 8
      // 1f95: invokevirtual net/minecraft/world/entity/Entity.getType ()Lnet/minecraft/world/entity/EntityType;
      // 1f98: getstatic net/minecraft/core/registries/Registries.ENTITY_TYPE Lnet/minecraft/resources/ResourceKey;
      // 1f9b: ldc_w "mocreatures:leopard"
      // 1f9e: invokestatic net/minecraft/resources/ResourceLocation.parse (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
      // 1fa1: invokestatic net/minecraft/tags/TagKey.create (Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
      // 1fa4: invokevirtual net/minecraft/world/entity/EntityType.is (Lnet/minecraft/tags/TagKey;)Z
      // 1fa7: ifeq 29b2
      // 1faa: aload 8
      // 1fac: instanceof net/minecraft/world/entity/TamableAnimal
      // 1faf: ifeq 2012
      // 1fb2: aload 8
      // 1fb4: checkcast net/minecraft/world/entity/TamableAnimal
      // 1fb7: astore 12
      // 1fb9: aload 12
      // 1fbb: invokevirtual net/minecraft/world/entity/TamableAnimal.isTame ()Z
      // 1fbe: ifeq 2012
      // 1fc1: aload 8
      // 1fc3: instanceof net/mocreatures/entity/LeopardEntity
      // 1fc6: ifeq 1fe8
      // 1fc9: aload 8
      // 1fcb: checkcast net/mocreatures/entity/LeopardEntity
      // 1fce: astore 13
      // 1fd0: aload 13
      // 1fd2: invokevirtual net/mocreatures/entity/LeopardEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 1fd5: getstatic net/mocreatures/entity/LeopardEntity.DATA_Baby Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 1fd8: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 1fdb: checkcast java/lang/Boolean
      // 1fde: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1fe1: ifeq 1fe8
      // 1fe4: bipush 1
      // 1fe5: goto 1fe9
      // 1fe8: bipush 0
      // 1fe9: ifne 2012
      // 1fec: aload 8
      // 1fee: instanceof net/minecraft/world/entity/TamableAnimal
      // 1ff1: ifeq 2003
      // 1ff4: aload 8
      // 1ff6: checkcast net/minecraft/world/entity/TamableAnimal
      // 1ff9: astore 14
      // 1ffb: aload 14
      // 1ffd: invokevirtual net/minecraft/world/entity/TamableAnimal.getOwner ()Lnet/minecraft/world/entity/LivingEntity;
      // 2000: goto 2004
      // 2003: aconst_null
      // 2004: aload 9
      // 2006: if_acmpne 200f
      // 2009: bipush 1
      // 200a: istore 10
      // 200c: goto 2012
      // 200f: bipush 0
      // 2010: istore 10
      // 2012: iload 10
      // 2014: ifeq 29b2
      // 2017: aload 9
      // 2019: instanceof net/minecraft/world/entity/LivingEntity
      // 201c: ifeq 2062
      // 201f: aload 9
      // 2021: checkcast net/minecraft/world/entity/LivingEntity
      // 2024: astore 12
      // 2026: new net/minecraft/world/item/ItemStack
      // 2029: dup
      // 202a: getstatic net/mocreatures/init/MocreaturesModItems.PET_AMULET_FULL Lnet/neoforged/neoforge/registries/DeferredItem;
      // 202d: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 2030: checkcast net/minecraft/world/level/ItemLike
      // 2033: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 2036: invokevirtual net/minecraft/world/item/ItemStack.copy ()Lnet/minecraft/world/item/ItemStack;
      // 2039: astore 13
      // 203b: aload 13
      // 203d: bipush 1
      // 203e: invokevirtual net/minecraft/world/item/ItemStack.setCount (I)V
      // 2041: aload 12
      // 2043: getstatic net/minecraft/world/InteractionHand.MAIN_HAND Lnet/minecraft/world/InteractionHand;
      // 2046: aload 13
      // 2048: invokevirtual net/minecraft/world/entity/LivingEntity.setItemInHand (Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/item/ItemStack;)V
      // 204b: aload 12
      // 204d: instanceof net/minecraft/world/entity/player/Player
      // 2050: ifeq 2062
      // 2053: aload 12
      // 2055: checkcast net/minecraft/world/entity/player/Player
      // 2058: astore 14
      // 205a: aload 14
      // 205c: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 205f: invokevirtual net/minecraft/world/entity/player/Inventory.setChanged ()V
      // 2062: ldc_w "Mob"
      // 2065: astore 12
      // 2067: ldc_w "mocreatures:leopard"
      // 206a: astore 13
      // 206c: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 206f: aload 9
      // 2071: instanceof net/minecraft/world/entity/LivingEntity
      // 2074: ifeq 2086
      // 2077: aload 9
      // 2079: checkcast net/minecraft/world/entity/LivingEntity
      // 207c: astore 14
      // 207e: aload 14
      // 2080: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 2083: goto 2089
      // 2086: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 2089: invokedynamic accept ()Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$48 (Lnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 208e: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 2091: ldc_w "Name"
      // 2094: astore 12
      // 2096: aload 8
      // 2098: invokevirtual net/minecraft/world/entity/Entity.getDisplayName ()Lnet/minecraft/network/chat/Component;
      // 209b: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 20a0: astore 13
      // 20a2: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 20a5: aload 9
      // 20a7: instanceof net/minecraft/world/entity/LivingEntity
      // 20aa: ifeq 20bc
      // 20ad: aload 9
      // 20af: checkcast net/minecraft/world/entity/LivingEntity
      // 20b2: astore 14
      // 20b4: aload 14
      // 20b6: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 20b9: goto 20bf
      // 20bc: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 20bf: aload 13
      // 20c1: invokedynamic accept (Ljava/lang/String;)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$49 (Ljava/lang/String;Lnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 20c6: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 20c9: aload 8
      // 20cb: instanceof net/minecraft/world/entity/TamableAnimal
      // 20ce: ifeq 2118
      // 20d1: aload 8
      // 20d3: checkcast net/minecraft/world/entity/TamableAnimal
      // 20d6: astore 12
      // 20d8: aload 12
      // 20da: invokevirtual net/minecraft/world/entity/TamableAnimal.isTame ()Z
      // 20dd: ifeq 2118
      // 20e0: ldc_w "Owner"
      // 20e3: astore 13
      // 20e5: aload 9
      // 20e7: invokevirtual net/minecraft/world/entity/Entity.getDisplayName ()Lnet/minecraft/network/chat/Component;
      // 20ea: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 20ef: astore 14
      // 20f1: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 20f4: aload 9
      // 20f6: instanceof net/minecraft/world/entity/LivingEntity
      // 20f9: ifeq 210b
      // 20fc: aload 9
      // 20fe: checkcast net/minecraft/world/entity/LivingEntity
      // 2101: astore 15
      // 2103: aload 15
      // 2105: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 2108: goto 210e
      // 210b: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 210e: aload 14
      // 2110: invokedynamic accept (Ljava/lang/String;)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$50 (Ljava/lang/String;Lnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 2115: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 2118: ldc_w "Leashed"
      // 211b: astore 12
      // 211d: aload 8
      // 211f: instanceof net/minecraft/world/entity/Mob
      // 2122: ifeq 2134
      // 2125: aload 8
      // 2127: checkcast net/minecraft/world/entity/Mob
      // 212a: astore 14
      // 212c: aload 14
      // 212e: invokevirtual net/minecraft/world/entity/Mob.isLeashed ()Z
      // 2131: goto 2135
      // 2134: bipush 0
      // 2135: istore 13
      // 2137: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 213a: aload 9
      // 213c: instanceof net/minecraft/world/entity/LivingEntity
      // 213f: ifeq 2151
      // 2142: aload 9
      // 2144: checkcast net/minecraft/world/entity/LivingEntity
      // 2147: astore 14
      // 2149: aload 14
      // 214b: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 214e: goto 2154
      // 2151: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 2154: iload 13
      // 2156: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$51 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 215b: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 215e: ldc_w "NoGravity"
      // 2161: astore 12
      // 2163: aload 8
      // 2165: invokevirtual net/minecraft/world/entity/Entity.isNoGravity ()Z
      // 2168: istore 13
      // 216a: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 216d: aload 9
      // 216f: instanceof net/minecraft/world/entity/LivingEntity
      // 2172: ifeq 2184
      // 2175: aload 9
      // 2177: checkcast net/minecraft/world/entity/LivingEntity
      // 217a: astore 14
      // 217c: aload 14
      // 217e: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 2181: goto 2187
      // 2184: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 2187: iload 13
      // 2189: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$52 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 218e: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 2191: ldc_w "MaxHealth"
      // 2194: astore 12
      // 2196: aload 8
      // 2198: instanceof net/minecraft/world/entity/LivingEntity
      // 219b: ifeq 21ae
      // 219e: aload 8
      // 21a0: checkcast net/minecraft/world/entity/LivingEntity
      // 21a3: astore 15
      // 21a5: aload 15
      // 21a7: invokevirtual net/minecraft/world/entity/LivingEntity.getMaxHealth ()F
      // 21aa: f2d
      // 21ab: goto 21b1
      // 21ae: ldc2_w -1.0
      // 21b1: dstore 13
      // 21b3: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 21b6: aload 9
      // 21b8: instanceof net/minecraft/world/entity/LivingEntity
      // 21bb: ifeq 21cd
      // 21be: aload 9
      // 21c0: checkcast net/minecraft/world/entity/LivingEntity
      // 21c3: astore 15
      // 21c5: aload 15
      // 21c7: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 21ca: goto 21d0
      // 21cd: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 21d0: dload 13
      // 21d2: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$53 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 21d7: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 21da: ldc_w "Health"
      // 21dd: astore 12
      // 21df: aload 8
      // 21e1: instanceof net/minecraft/world/entity/LivingEntity
      // 21e4: ifeq 21f7
      // 21e7: aload 8
      // 21e9: checkcast net/minecraft/world/entity/LivingEntity
      // 21ec: astore 15
      // 21ee: aload 15
      // 21f0: invokevirtual net/minecraft/world/entity/LivingEntity.getHealth ()F
      // 21f3: f2d
      // 21f4: goto 21fa
      // 21f7: ldc2_w -1.0
      // 21fa: dstore 13
      // 21fc: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 21ff: aload 9
      // 2201: instanceof net/minecraft/world/entity/LivingEntity
      // 2204: ifeq 2216
      // 2207: aload 9
      // 2209: checkcast net/minecraft/world/entity/LivingEntity
      // 220c: astore 15
      // 220e: aload 15
      // 2210: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 2213: goto 2219
      // 2216: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 2219: dload 13
      // 221b: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$54 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 2220: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 2223: ldc_w "Air"
      // 2226: astore 12
      // 2228: aload 8
      // 222a: invokevirtual net/minecraft/world/entity/Entity.getAirSupply ()I
      // 222d: i2d
      // 222e: dstore 13
      // 2230: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 2233: aload 9
      // 2235: instanceof net/minecraft/world/entity/LivingEntity
      // 2238: ifeq 224a
      // 223b: aload 9
      // 223d: checkcast net/minecraft/world/entity/LivingEntity
      // 2240: astore 15
      // 2242: aload 15
      // 2244: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 2247: goto 224d
      // 224a: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 224d: dload 13
      // 224f: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$55 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 2254: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 2257: ldc_w "MotionX"
      // 225a: astore 12
      // 225c: aload 8
      // 225e: invokevirtual net/minecraft/world/entity/Entity.getDeltaMovement ()Lnet/minecraft/world/phys/Vec3;
      // 2261: invokevirtual net/minecraft/world/phys/Vec3.x ()D
      // 2264: dstore 13
      // 2266: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 2269: aload 9
      // 226b: instanceof net/minecraft/world/entity/LivingEntity
      // 226e: ifeq 2280
      // 2271: aload 9
      // 2273: checkcast net/minecraft/world/entity/LivingEntity
      // 2276: astore 15
      // 2278: aload 15
      // 227a: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 227d: goto 2283
      // 2280: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 2283: dload 13
      // 2285: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$56 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 228a: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 228d: ldc_w "MotionY"
      // 2290: astore 12
      // 2292: aload 8
      // 2294: invokevirtual net/minecraft/world/entity/Entity.getDeltaMovement ()Lnet/minecraft/world/phys/Vec3;
      // 2297: invokevirtual net/minecraft/world/phys/Vec3.y ()D
      // 229a: dstore 13
      // 229c: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 229f: aload 9
      // 22a1: instanceof net/minecraft/world/entity/LivingEntity
      // 22a4: ifeq 22b6
      // 22a7: aload 9
      // 22a9: checkcast net/minecraft/world/entity/LivingEntity
      // 22ac: astore 15
      // 22ae: aload 15
      // 22b0: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 22b3: goto 22b9
      // 22b6: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 22b9: dload 13
      // 22bb: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$57 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 22c0: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 22c3: ldc_w "MotionZ"
      // 22c6: astore 12
      // 22c8: aload 8
      // 22ca: invokevirtual net/minecraft/world/entity/Entity.getDeltaMovement ()Lnet/minecraft/world/phys/Vec3;
      // 22cd: invokevirtual net/minecraft/world/phys/Vec3.z ()D
      // 22d0: dstore 13
      // 22d2: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 22d5: aload 9
      // 22d7: instanceof net/minecraft/world/entity/LivingEntity
      // 22da: ifeq 22ec
      // 22dd: aload 9
      // 22df: checkcast net/minecraft/world/entity/LivingEntity
      // 22e2: astore 15
      // 22e4: aload 15
      // 22e6: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 22e9: goto 22ef
      // 22ec: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 22ef: dload 13
      // 22f1: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$58 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 22f6: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 22f9: ldc_w "RotationYaw"
      // 22fc: astore 12
      // 22fe: aload 8
      // 2300: invokevirtual net/minecraft/world/entity/Entity.getYRot ()F
      // 2303: f2d
      // 2304: dstore 13
      // 2306: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 2309: aload 9
      // 230b: instanceof net/minecraft/world/entity/LivingEntity
      // 230e: ifeq 2320
      // 2311: aload 9
      // 2313: checkcast net/minecraft/world/entity/LivingEntity
      // 2316: astore 15
      // 2318: aload 15
      // 231a: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 231d: goto 2323
      // 2320: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 2323: dload 13
      // 2325: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$59 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 232a: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 232d: ldc_w "RotationPitch"
      // 2330: astore 12
      // 2332: aload 8
      // 2334: invokevirtual net/minecraft/world/entity/Entity.getXRot ()F
      // 2337: f2d
      // 2338: dstore 13
      // 233a: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 233d: aload 9
      // 233f: instanceof net/minecraft/world/entity/LivingEntity
      // 2342: ifeq 2354
      // 2345: aload 9
      // 2347: checkcast net/minecraft/world/entity/LivingEntity
      // 234a: astore 15
      // 234c: aload 15
      // 234e: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 2351: goto 2357
      // 2354: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 2357: dload 13
      // 2359: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$60 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 235e: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 2361: ldc_w "Gender"
      // 2364: astore 12
      // 2366: aload 8
      // 2368: instanceof net/mocreatures/entity/LeopardEntity
      // 236b: ifeq 238a
      // 236e: aload 8
      // 2370: checkcast net/mocreatures/entity/LeopardEntity
      // 2373: astore 15
      // 2375: aload 15
      // 2377: invokevirtual net/mocreatures/entity/LeopardEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 237a: getstatic net/mocreatures/entity/LeopardEntity.DATA_Gender Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 237d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2380: checkcast java/lang/Integer
      // 2383: invokevirtual java/lang/Integer.intValue ()I
      // 2386: i2d
      // 2387: goto 238b
      // 238a: dconst_0
      // 238b: dstore 13
      // 238d: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 2390: aload 9
      // 2392: instanceof net/minecraft/world/entity/LivingEntity
      // 2395: ifeq 23a7
      // 2398: aload 9
      // 239a: checkcast net/minecraft/world/entity/LivingEntity
      // 239d: astore 15
      // 239f: aload 15
      // 23a1: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 23a4: goto 23aa
      // 23a7: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 23aa: dload 13
      // 23ac: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$61 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 23b1: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 23b4: ldc_w "Color"
      // 23b7: astore 12
      // 23b9: aload 8
      // 23bb: instanceof net/mocreatures/entity/LeopardEntity
      // 23be: ifeq 23dd
      // 23c1: aload 8
      // 23c3: checkcast net/mocreatures/entity/LeopardEntity
      // 23c6: astore 15
      // 23c8: aload 15
      // 23ca: invokevirtual net/mocreatures/entity/LeopardEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 23cd: getstatic net/mocreatures/entity/LeopardEntity.DATA_Color Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 23d0: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 23d3: checkcast java/lang/Integer
      // 23d6: invokevirtual java/lang/Integer.intValue ()I
      // 23d9: i2d
      // 23da: goto 23de
      // 23dd: dconst_0
      // 23de: dstore 13
      // 23e0: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 23e3: aload 9
      // 23e5: instanceof net/minecraft/world/entity/LivingEntity
      // 23e8: ifeq 23fa
      // 23eb: aload 9
      // 23ed: checkcast net/minecraft/world/entity/LivingEntity
      // 23f0: astore 15
      // 23f2: aload 15
      // 23f4: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 23f7: goto 23fd
      // 23fa: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 23fd: dload 13
      // 23ff: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$62 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 2404: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 2407: ldc_w "Wings"
      // 240a: astore 12
      // 240c: aload 8
      // 240e: instanceof net/mocreatures/entity/LeopardEntity
      // 2411: ifeq 2433
      // 2414: aload 8
      // 2416: checkcast net/mocreatures/entity/LeopardEntity
      // 2419: astore 14
      // 241b: aload 14
      // 241d: invokevirtual net/mocreatures/entity/LeopardEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2420: getstatic net/mocreatures/entity/LeopardEntity.DATA_Wings Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2423: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2426: checkcast java/lang/Boolean
      // 2429: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 242c: ifeq 2433
      // 242f: bipush 1
      // 2430: goto 2434
      // 2433: bipush 0
      // 2434: istore 13
      // 2436: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 2439: aload 9
      // 243b: instanceof net/minecraft/world/entity/LivingEntity
      // 243e: ifeq 2450
      // 2441: aload 9
      // 2443: checkcast net/minecraft/world/entity/LivingEntity
      // 2446: astore 14
      // 2448: aload 14
      // 244a: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 244d: goto 2453
      // 2450: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 2453: iload 13
      // 2455: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$63 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 245a: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 245d: ldc_w "Medallion"
      // 2460: astore 12
      // 2462: aload 8
      // 2464: instanceof net/mocreatures/entity/LeopardEntity
      // 2467: ifeq 2489
      // 246a: aload 8
      // 246c: checkcast net/mocreatures/entity/LeopardEntity
      // 246f: astore 14
      // 2471: aload 14
      // 2473: invokevirtual net/mocreatures/entity/LeopardEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2476: getstatic net/mocreatures/entity/LeopardEntity.DATA_Medallion Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2479: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 247c: checkcast java/lang/Boolean
      // 247f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2482: ifeq 2489
      // 2485: bipush 1
      // 2486: goto 248a
      // 2489: bipush 0
      // 248a: istore 13
      // 248c: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 248f: aload 9
      // 2491: instanceof net/minecraft/world/entity/LivingEntity
      // 2494: ifeq 24a6
      // 2497: aload 9
      // 2499: checkcast net/minecraft/world/entity/LivingEntity
      // 249c: astore 14
      // 249e: aload 14
      // 24a0: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 24a3: goto 24a9
      // 24a6: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 24a9: iload 13
      // 24ab: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$64 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 24b0: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 24b3: aload 8
      // 24b5: invokevirtual net/minecraft/world/entity/Entity.getType ()Lnet/minecraft/world/entity/EntityType;
      // 24b8: getstatic net/minecraft/core/registries/Registries.ENTITY_TYPE Lnet/minecraft/resources/ResourceKey;
      // 24bb: ldc_w "mocreatures:leopard"
      // 24be: invokestatic net/minecraft/resources/ResourceLocation.parse (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
      // 24c1: invokestatic net/minecraft/tags/TagKey.create (Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
      // 24c4: invokevirtual net/minecraft/world/entity/EntityType.is (Lnet/minecraft/tags/TagKey;)Z
      // 24c7: ifeq 29b2
      // 24ca: aload 8
      // 24cc: instanceof net/mocreatures/entity/LeopardEntity
      // 24cf: ifeq 24f1
      // 24d2: aload 8
      // 24d4: checkcast net/mocreatures/entity/LeopardEntity
      // 24d7: astore 12
      // 24d9: aload 12
      // 24db: invokevirtual net/mocreatures/entity/LeopardEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 24de: getstatic net/mocreatures/entity/LeopardEntity.DATA_Saddle Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 24e1: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 24e4: checkcast java/lang/Boolean
      // 24e7: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 24ea: ifeq 24f1
      // 24ed: bipush 1
      // 24ee: goto 24f2
      // 24f1: bipush 0
      // 24f2: bipush 1
      // 24f3: if_icmpne 2532
      // 24f6: aload 1
      // 24f7: instanceof net/minecraft/server/level/ServerLevel
      // 24fa: ifeq 2532
      // 24fd: aload 1
      // 24fe: checkcast net/minecraft/server/level/ServerLevel
      // 2501: astore 13
      // 2503: new net/minecraft/world/entity/item/ItemEntity
      // 2506: dup
      // 2507: aload 13
      // 2509: dload 2
      // 250a: dload 4
      // 250c: dload 6
      // 250e: new net/minecraft/world/item/ItemStack
      // 2511: dup
      // 2512: getstatic net/mocreatures/init/MocreaturesModItems.CRAFTED_SADDLE Lnet/neoforged/neoforge/registries/DeferredItem;
      // 2515: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 2518: checkcast net/minecraft/world/level/ItemLike
      // 251b: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 251e: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 2521: astore 14
      // 2523: aload 14
      // 2525: bipush 10
      // 2527: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 252a: aload 13
      // 252c: aload 14
      // 252e: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 2531: pop
      // 2532: aload 8
      // 2534: instanceof net/mocreatures/entity/LeopardEntity
      // 2537: ifeq 2559
      // 253a: aload 8
      // 253c: checkcast net/mocreatures/entity/LeopardEntity
      // 253f: astore 12
      // 2541: aload 12
      // 2543: invokevirtual net/mocreatures/entity/LeopardEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2546: getstatic net/mocreatures/entity/LeopardEntity.DATA_Chest Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2549: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 254c: checkcast java/lang/Boolean
      // 254f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2552: ifeq 2559
      // 2555: bipush 1
      // 2556: goto 255a
      // 2559: bipush 0
      // 255a: bipush 1
      // 255b: if_icmpne 2594
      // 255e: aload 1
      // 255f: instanceof net/minecraft/server/level/ServerLevel
      // 2562: ifeq 2594
      // 2565: aload 1
      // 2566: checkcast net/minecraft/server/level/ServerLevel
      // 2569: astore 13
      // 256b: new net/minecraft/world/entity/item/ItemEntity
      // 256e: dup
      // 256f: aload 13
      // 2571: dload 2
      // 2572: dload 4
      // 2574: dload 6
      // 2576: new net/minecraft/world/item/ItemStack
      // 2579: dup
      // 257a: getstatic net/minecraft/world/level/block/Blocks.CHEST Lnet/minecraft/world/level/block/Block;
      // 257d: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 2580: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 2583: astore 14
      // 2585: aload 14
      // 2587: bipush 10
      // 2589: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 258c: aload 13
      // 258e: aload 14
      // 2590: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 2593: pop
      // 2594: aload 1
      // 2595: instanceof net/minecraft/server/level/ServerLevel
      // 2598: ifeq 25cd
      // 259b: aload 1
      // 259c: checkcast net/minecraft/server/level/ServerLevel
      // 259f: astore 12
      // 25a1: new net/minecraft/world/entity/item/ItemEntity
      // 25a4: dup
      // 25a5: aload 12
      // 25a7: dload 2
      // 25a8: dload 4
      // 25aa: dload 6
      // 25ac: new net/mocreatures/procedures/PetAmuletCapture2Procedure$55
      // 25af: dup
      // 25b0: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$55.<init> ()V
      // 25b3: bipush 0
      // 25b4: aload 8
      // 25b6: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$55.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 25b9: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 25bc: astore 13
      // 25be: aload 13
      // 25c0: bipush 10
      // 25c2: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 25c5: aload 12
      // 25c7: aload 13
      // 25c9: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 25cc: pop
      // 25cd: aload 1
      // 25ce: instanceof net/minecraft/server/level/ServerLevel
      // 25d1: ifeq 2606
      // 25d4: aload 1
      // 25d5: checkcast net/minecraft/server/level/ServerLevel
      // 25d8: astore 12
      // 25da: new net/minecraft/world/entity/item/ItemEntity
      // 25dd: dup
      // 25de: aload 12
      // 25e0: dload 2
      // 25e1: dload 4
      // 25e3: dload 6
      // 25e5: new net/mocreatures/procedures/PetAmuletCapture2Procedure$56
      // 25e8: dup
      // 25e9: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$56.<init> ()V
      // 25ec: bipush 1
      // 25ed: aload 8
      // 25ef: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$56.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 25f2: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 25f5: astore 13
      // 25f7: aload 13
      // 25f9: bipush 10
      // 25fb: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 25fe: aload 12
      // 2600: aload 13
      // 2602: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 2605: pop
      // 2606: aload 1
      // 2607: instanceof net/minecraft/server/level/ServerLevel
      // 260a: ifeq 263f
      // 260d: aload 1
      // 260e: checkcast net/minecraft/server/level/ServerLevel
      // 2611: astore 12
      // 2613: new net/minecraft/world/entity/item/ItemEntity
      // 2616: dup
      // 2617: aload 12
      // 2619: dload 2
      // 261a: dload 4
      // 261c: dload 6
      // 261e: new net/mocreatures/procedures/PetAmuletCapture2Procedure$57
      // 2621: dup
      // 2622: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$57.<init> ()V
      // 2625: bipush 2
      // 2626: aload 8
      // 2628: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$57.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 262b: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 262e: astore 13
      // 2630: aload 13
      // 2632: bipush 10
      // 2634: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 2637: aload 12
      // 2639: aload 13
      // 263b: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 263e: pop
      // 263f: aload 1
      // 2640: instanceof net/minecraft/server/level/ServerLevel
      // 2643: ifeq 2678
      // 2646: aload 1
      // 2647: checkcast net/minecraft/server/level/ServerLevel
      // 264a: astore 12
      // 264c: new net/minecraft/world/entity/item/ItemEntity
      // 264f: dup
      // 2650: aload 12
      // 2652: dload 2
      // 2653: dload 4
      // 2655: dload 6
      // 2657: new net/mocreatures/procedures/PetAmuletCapture2Procedure$58
      // 265a: dup
      // 265b: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$58.<init> ()V
      // 265e: bipush 3
      // 265f: aload 8
      // 2661: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$58.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 2664: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 2667: astore 13
      // 2669: aload 13
      // 266b: bipush 10
      // 266d: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 2670: aload 12
      // 2672: aload 13
      // 2674: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 2677: pop
      // 2678: aload 1
      // 2679: instanceof net/minecraft/server/level/ServerLevel
      // 267c: ifeq 26b1
      // 267f: aload 1
      // 2680: checkcast net/minecraft/server/level/ServerLevel
      // 2683: astore 12
      // 2685: new net/minecraft/world/entity/item/ItemEntity
      // 2688: dup
      // 2689: aload 12
      // 268b: dload 2
      // 268c: dload 4
      // 268e: dload 6
      // 2690: new net/mocreatures/procedures/PetAmuletCapture2Procedure$59
      // 2693: dup
      // 2694: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$59.<init> ()V
      // 2697: bipush 4
      // 2698: aload 8
      // 269a: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$59.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 269d: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 26a0: astore 13
      // 26a2: aload 13
      // 26a4: bipush 10
      // 26a6: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 26a9: aload 12
      // 26ab: aload 13
      // 26ad: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 26b0: pop
      // 26b1: aload 1
      // 26b2: instanceof net/minecraft/server/level/ServerLevel
      // 26b5: ifeq 26ea
      // 26b8: aload 1
      // 26b9: checkcast net/minecraft/server/level/ServerLevel
      // 26bc: astore 12
      // 26be: new net/minecraft/world/entity/item/ItemEntity
      // 26c1: dup
      // 26c2: aload 12
      // 26c4: dload 2
      // 26c5: dload 4
      // 26c7: dload 6
      // 26c9: new net/mocreatures/procedures/PetAmuletCapture2Procedure$60
      // 26cc: dup
      // 26cd: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$60.<init> ()V
      // 26d0: bipush 5
      // 26d1: aload 8
      // 26d3: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$60.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 26d6: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 26d9: astore 13
      // 26db: aload 13
      // 26dd: bipush 10
      // 26df: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 26e2: aload 12
      // 26e4: aload 13
      // 26e6: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 26e9: pop
      // 26ea: aload 1
      // 26eb: instanceof net/minecraft/server/level/ServerLevel
      // 26ee: ifeq 2724
      // 26f1: aload 1
      // 26f2: checkcast net/minecraft/server/level/ServerLevel
      // 26f5: astore 12
      // 26f7: new net/minecraft/world/entity/item/ItemEntity
      // 26fa: dup
      // 26fb: aload 12
      // 26fd: dload 2
      // 26fe: dload 4
      // 2700: dload 6
      // 2702: new net/mocreatures/procedures/PetAmuletCapture2Procedure$61
      // 2705: dup
      // 2706: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$61.<init> ()V
      // 2709: bipush 6
      // 270b: aload 8
      // 270d: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$61.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 2710: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 2713: astore 13
      // 2715: aload 13
      // 2717: bipush 10
      // 2719: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 271c: aload 12
      // 271e: aload 13
      // 2720: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 2723: pop
      // 2724: aload 1
      // 2725: instanceof net/minecraft/server/level/ServerLevel
      // 2728: ifeq 275e
      // 272b: aload 1
      // 272c: checkcast net/minecraft/server/level/ServerLevel
      // 272f: astore 12
      // 2731: new net/minecraft/world/entity/item/ItemEntity
      // 2734: dup
      // 2735: aload 12
      // 2737: dload 2
      // 2738: dload 4
      // 273a: dload 6
      // 273c: new net/mocreatures/procedures/PetAmuletCapture2Procedure$62
      // 273f: dup
      // 2740: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$62.<init> ()V
      // 2743: bipush 7
      // 2745: aload 8
      // 2747: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$62.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 274a: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 274d: astore 13
      // 274f: aload 13
      // 2751: bipush 10
      // 2753: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 2756: aload 12
      // 2758: aload 13
      // 275a: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 275d: pop
      // 275e: aload 1
      // 275f: instanceof net/minecraft/server/level/ServerLevel
      // 2762: ifeq 2798
      // 2765: aload 1
      // 2766: checkcast net/minecraft/server/level/ServerLevel
      // 2769: astore 12
      // 276b: new net/minecraft/world/entity/item/ItemEntity
      // 276e: dup
      // 276f: aload 12
      // 2771: dload 2
      // 2772: dload 4
      // 2774: dload 6
      // 2776: new net/mocreatures/procedures/PetAmuletCapture2Procedure$63
      // 2779: dup
      // 277a: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$63.<init> ()V
      // 277d: bipush 8
      // 277f: aload 8
      // 2781: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$63.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 2784: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 2787: astore 13
      // 2789: aload 13
      // 278b: bipush 10
      // 278d: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 2790: aload 12
      // 2792: aload 13
      // 2794: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 2797: pop
      // 2798: aload 1
      // 2799: instanceof net/minecraft/server/level/ServerLevel
      // 279c: ifeq 27d2
      // 279f: aload 1
      // 27a0: checkcast net/minecraft/server/level/ServerLevel
      // 27a3: astore 12
      // 27a5: new net/minecraft/world/entity/item/ItemEntity
      // 27a8: dup
      // 27a9: aload 12
      // 27ab: dload 2
      // 27ac: dload 4
      // 27ae: dload 6
      // 27b0: new net/mocreatures/procedures/PetAmuletCapture2Procedure$64
      // 27b3: dup
      // 27b4: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$64.<init> ()V
      // 27b7: bipush 9
      // 27b9: aload 8
      // 27bb: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$64.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 27be: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 27c1: astore 13
      // 27c3: aload 13
      // 27c5: bipush 10
      // 27c7: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 27ca: aload 12
      // 27cc: aload 13
      // 27ce: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 27d1: pop
      // 27d2: aload 1
      // 27d3: instanceof net/minecraft/server/level/ServerLevel
      // 27d6: ifeq 280c
      // 27d9: aload 1
      // 27da: checkcast net/minecraft/server/level/ServerLevel
      // 27dd: astore 12
      // 27df: new net/minecraft/world/entity/item/ItemEntity
      // 27e2: dup
      // 27e3: aload 12
      // 27e5: dload 2
      // 27e6: dload 4
      // 27e8: dload 6
      // 27ea: new net/mocreatures/procedures/PetAmuletCapture2Procedure$65
      // 27ed: dup
      // 27ee: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$65.<init> ()V
      // 27f1: bipush 10
      // 27f3: aload 8
      // 27f5: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$65.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 27f8: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 27fb: astore 13
      // 27fd: aload 13
      // 27ff: bipush 10
      // 2801: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 2804: aload 12
      // 2806: aload 13
      // 2808: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 280b: pop
      // 280c: aload 1
      // 280d: instanceof net/minecraft/server/level/ServerLevel
      // 2810: ifeq 2846
      // 2813: aload 1
      // 2814: checkcast net/minecraft/server/level/ServerLevel
      // 2817: astore 12
      // 2819: new net/minecraft/world/entity/item/ItemEntity
      // 281c: dup
      // 281d: aload 12
      // 281f: dload 2
      // 2820: dload 4
      // 2822: dload 6
      // 2824: new net/mocreatures/procedures/PetAmuletCapture2Procedure$66
      // 2827: dup
      // 2828: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$66.<init> ()V
      // 282b: bipush 11
      // 282d: aload 8
      // 282f: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$66.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 2832: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 2835: astore 13
      // 2837: aload 13
      // 2839: bipush 10
      // 283b: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 283e: aload 12
      // 2840: aload 13
      // 2842: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 2845: pop
      // 2846: aload 1
      // 2847: instanceof net/minecraft/server/level/ServerLevel
      // 284a: ifeq 2880
      // 284d: aload 1
      // 284e: checkcast net/minecraft/server/level/ServerLevel
      // 2851: astore 12
      // 2853: new net/minecraft/world/entity/item/ItemEntity
      // 2856: dup
      // 2857: aload 12
      // 2859: dload 2
      // 285a: dload 4
      // 285c: dload 6
      // 285e: new net/mocreatures/procedures/PetAmuletCapture2Procedure$67
      // 2861: dup
      // 2862: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$67.<init> ()V
      // 2865: bipush 12
      // 2867: aload 8
      // 2869: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$67.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 286c: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 286f: astore 13
      // 2871: aload 13
      // 2873: bipush 10
      // 2875: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 2878: aload 12
      // 287a: aload 13
      // 287c: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 287f: pop
      // 2880: aload 1
      // 2881: instanceof net/minecraft/server/level/ServerLevel
      // 2884: ifeq 28ba
      // 2887: aload 1
      // 2888: checkcast net/minecraft/server/level/ServerLevel
      // 288b: astore 12
      // 288d: new net/minecraft/world/entity/item/ItemEntity
      // 2890: dup
      // 2891: aload 12
      // 2893: dload 2
      // 2894: dload 4
      // 2896: dload 6
      // 2898: new net/mocreatures/procedures/PetAmuletCapture2Procedure$68
      // 289b: dup
      // 289c: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$68.<init> ()V
      // 289f: bipush 13
      // 28a1: aload 8
      // 28a3: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$68.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 28a6: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 28a9: astore 13
      // 28ab: aload 13
      // 28ad: bipush 10
      // 28af: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 28b2: aload 12
      // 28b4: aload 13
      // 28b6: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 28b9: pop
      // 28ba: aload 1
      // 28bb: instanceof net/minecraft/server/level/ServerLevel
      // 28be: ifeq 28f4
      // 28c1: aload 1
      // 28c2: checkcast net/minecraft/server/level/ServerLevel
      // 28c5: astore 12
      // 28c7: new net/minecraft/world/entity/item/ItemEntity
      // 28ca: dup
      // 28cb: aload 12
      // 28cd: dload 2
      // 28ce: dload 4
      // 28d0: dload 6
      // 28d2: new net/mocreatures/procedures/PetAmuletCapture2Procedure$69
      // 28d5: dup
      // 28d6: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$69.<init> ()V
      // 28d9: bipush 14
      // 28db: aload 8
      // 28dd: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$69.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 28e0: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 28e3: astore 13
      // 28e5: aload 13
      // 28e7: bipush 10
      // 28e9: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 28ec: aload 12
      // 28ee: aload 13
      // 28f0: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 28f3: pop
      // 28f4: aload 1
      // 28f5: instanceof net/minecraft/server/level/ServerLevel
      // 28f8: ifeq 292e
      // 28fb: aload 1
      // 28fc: checkcast net/minecraft/server/level/ServerLevel
      // 28ff: astore 12
      // 2901: new net/minecraft/world/entity/item/ItemEntity
      // 2904: dup
      // 2905: aload 12
      // 2907: dload 2
      // 2908: dload 4
      // 290a: dload 6
      // 290c: new net/mocreatures/procedures/PetAmuletCapture2Procedure$70
      // 290f: dup
      // 2910: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$70.<init> ()V
      // 2913: bipush 15
      // 2915: aload 8
      // 2917: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$70.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 291a: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 291d: astore 13
      // 291f: aload 13
      // 2921: bipush 10
      // 2923: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 2926: aload 12
      // 2928: aload 13
      // 292a: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 292d: pop
      // 292e: aload 1
      // 292f: instanceof net/minecraft/server/level/ServerLevel
      // 2932: ifeq 2968
      // 2935: aload 1
      // 2936: checkcast net/minecraft/server/level/ServerLevel
      // 2939: astore 12
      // 293b: new net/minecraft/world/entity/item/ItemEntity
      // 293e: dup
      // 293f: aload 12
      // 2941: dload 2
      // 2942: dload 4
      // 2944: dload 6
      // 2946: new net/mocreatures/procedures/PetAmuletCapture2Procedure$71
      // 2949: dup
      // 294a: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$71.<init> ()V
      // 294d: bipush 16
      // 294f: aload 8
      // 2951: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$71.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 2954: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 2957: astore 13
      // 2959: aload 13
      // 295b: bipush 10
      // 295d: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 2960: aload 12
      // 2962: aload 13
      // 2964: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 2967: pop
      // 2968: aload 1
      // 2969: instanceof net/minecraft/server/level/ServerLevel
      // 296c: ifeq 29a2
      // 296f: aload 1
      // 2970: checkcast net/minecraft/server/level/ServerLevel
      // 2973: astore 12
      // 2975: new net/minecraft/world/entity/item/ItemEntity
      // 2978: dup
      // 2979: aload 12
      // 297b: dload 2
      // 297c: dload 4
      // 297e: dload 6
      // 2980: new net/mocreatures/procedures/PetAmuletCapture2Procedure$72
      // 2983: dup
      // 2984: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$72.<init> ()V
      // 2987: bipush 17
      // 2989: aload 8
      // 298b: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$72.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 298e: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 2991: astore 13
      // 2993: aload 13
      // 2995: bipush 10
      // 2997: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 299a: aload 12
      // 299c: aload 13
      // 299e: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 29a1: pop
      // 29a2: aload 8
      // 29a4: invokevirtual net/minecraft/world/entity/Entity.level ()Lnet/minecraft/world/level/Level;
      // 29a7: invokevirtual net/minecraft/world/level/Level.isClientSide ()Z
      // 29aa: ifne 29b2
      // 29ad: aload 8
      // 29af: invokevirtual net/minecraft/world/entity/Entity.discard ()V
      // 29b2: aload 9
      // 29b4: instanceof net/minecraft/world/entity/LivingEntity
      // 29b7: ifeq 29c9
      // 29ba: aload 9
      // 29bc: checkcast net/minecraft/world/entity/LivingEntity
      // 29bf: astore 11
      // 29c1: aload 11
      // 29c3: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 29c6: goto 29cc
      // 29c9: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 29cc: ldc_w "mocreatures:amulet/empty"
      // 29cf: invokestatic net/minecraft/resources/ResourceLocation.parse (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
      // 29d2: invokestatic net/minecraft/tags/ItemTags.create (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
      // 29d5: invokevirtual net/minecraft/world/item/ItemStack.is (Lnet/minecraft/tags/TagKey;)Z
      // 29d8: ifeq 33fa
      // 29db: aload 8
      // 29dd: invokevirtual net/minecraft/world/entity/Entity.getType ()Lnet/minecraft/world/entity/EntityType;
      // 29e0: getstatic net/minecraft/core/registries/Registries.ENTITY_TYPE Lnet/minecraft/resources/ResourceKey;
      // 29e3: ldc_w "mocreatures:panther"
      // 29e6: invokestatic net/minecraft/resources/ResourceLocation.parse (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
      // 29e9: invokestatic net/minecraft/tags/TagKey.create (Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
      // 29ec: invokevirtual net/minecraft/world/entity/EntityType.is (Lnet/minecraft/tags/TagKey;)Z
      // 29ef: ifeq 33fa
      // 29f2: aload 8
      // 29f4: instanceof net/minecraft/world/entity/TamableAnimal
      // 29f7: ifeq 2a5a
      // 29fa: aload 8
      // 29fc: checkcast net/minecraft/world/entity/TamableAnimal
      // 29ff: astore 12
      // 2a01: aload 12
      // 2a03: invokevirtual net/minecraft/world/entity/TamableAnimal.isTame ()Z
      // 2a06: ifeq 2a5a
      // 2a09: aload 8
      // 2a0b: instanceof net/mocreatures/entity/PantherEntity
      // 2a0e: ifeq 2a30
      // 2a11: aload 8
      // 2a13: checkcast net/mocreatures/entity/PantherEntity
      // 2a16: astore 13
      // 2a18: aload 13
      // 2a1a: invokevirtual net/mocreatures/entity/PantherEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2a1d: getstatic net/mocreatures/entity/PantherEntity.DATA_Baby Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2a20: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2a23: checkcast java/lang/Boolean
      // 2a26: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2a29: ifeq 2a30
      // 2a2c: bipush 1
      // 2a2d: goto 2a31
      // 2a30: bipush 0
      // 2a31: ifne 2a5a
      // 2a34: aload 8
      // 2a36: instanceof net/minecraft/world/entity/TamableAnimal
      // 2a39: ifeq 2a4b
      // 2a3c: aload 8
      // 2a3e: checkcast net/minecraft/world/entity/TamableAnimal
      // 2a41: astore 14
      // 2a43: aload 14
      // 2a45: invokevirtual net/minecraft/world/entity/TamableAnimal.getOwner ()Lnet/minecraft/world/entity/LivingEntity;
      // 2a48: goto 2a4c
      // 2a4b: aconst_null
      // 2a4c: aload 9
      // 2a4e: if_acmpne 2a57
      // 2a51: bipush 1
      // 2a52: istore 10
      // 2a54: goto 2a5a
      // 2a57: bipush 0
      // 2a58: istore 10
      // 2a5a: iload 10
      // 2a5c: ifeq 33fa
      // 2a5f: aload 9
      // 2a61: instanceof net/minecraft/world/entity/LivingEntity
      // 2a64: ifeq 2aaa
      // 2a67: aload 9
      // 2a69: checkcast net/minecraft/world/entity/LivingEntity
      // 2a6c: astore 12
      // 2a6e: new net/minecraft/world/item/ItemStack
      // 2a71: dup
      // 2a72: getstatic net/mocreatures/init/MocreaturesModItems.PET_AMULET_FULL Lnet/neoforged/neoforge/registries/DeferredItem;
      // 2a75: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 2a78: checkcast net/minecraft/world/level/ItemLike
      // 2a7b: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 2a7e: invokevirtual net/minecraft/world/item/ItemStack.copy ()Lnet/minecraft/world/item/ItemStack;
      // 2a81: astore 13
      // 2a83: aload 13
      // 2a85: bipush 1
      // 2a86: invokevirtual net/minecraft/world/item/ItemStack.setCount (I)V
      // 2a89: aload 12
      // 2a8b: getstatic net/minecraft/world/InteractionHand.MAIN_HAND Lnet/minecraft/world/InteractionHand;
      // 2a8e: aload 13
      // 2a90: invokevirtual net/minecraft/world/entity/LivingEntity.setItemInHand (Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/item/ItemStack;)V
      // 2a93: aload 12
      // 2a95: instanceof net/minecraft/world/entity/player/Player
      // 2a98: ifeq 2aaa
      // 2a9b: aload 12
      // 2a9d: checkcast net/minecraft/world/entity/player/Player
      // 2aa0: astore 14
      // 2aa2: aload 14
      // 2aa4: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 2aa7: invokevirtual net/minecraft/world/entity/player/Inventory.setChanged ()V
      // 2aaa: ldc_w "Mob"
      // 2aad: astore 12
      // 2aaf: ldc_w "mocreatures:panther"
      // 2ab2: astore 13
      // 2ab4: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 2ab7: aload 9
      // 2ab9: instanceof net/minecraft/world/entity/LivingEntity
      // 2abc: ifeq 2ace
      // 2abf: aload 9
      // 2ac1: checkcast net/minecraft/world/entity/LivingEntity
      // 2ac4: astore 14
      // 2ac6: aload 14
      // 2ac8: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 2acb: goto 2ad1
      // 2ace: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 2ad1: invokedynamic accept ()Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$65 (Lnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 2ad6: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 2ad9: ldc_w "Name"
      // 2adc: astore 12
      // 2ade: aload 8
      // 2ae0: invokevirtual net/minecraft/world/entity/Entity.getDisplayName ()Lnet/minecraft/network/chat/Component;
      // 2ae3: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 2ae8: astore 13
      // 2aea: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 2aed: aload 9
      // 2aef: instanceof net/minecraft/world/entity/LivingEntity
      // 2af2: ifeq 2b04
      // 2af5: aload 9
      // 2af7: checkcast net/minecraft/world/entity/LivingEntity
      // 2afa: astore 14
      // 2afc: aload 14
      // 2afe: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 2b01: goto 2b07
      // 2b04: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 2b07: aload 13
      // 2b09: invokedynamic accept (Ljava/lang/String;)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$66 (Ljava/lang/String;Lnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 2b0e: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 2b11: aload 8
      // 2b13: instanceof net/minecraft/world/entity/TamableAnimal
      // 2b16: ifeq 2b60
      // 2b19: aload 8
      // 2b1b: checkcast net/minecraft/world/entity/TamableAnimal
      // 2b1e: astore 12
      // 2b20: aload 12
      // 2b22: invokevirtual net/minecraft/world/entity/TamableAnimal.isTame ()Z
      // 2b25: ifeq 2b60
      // 2b28: ldc_w "Owner"
      // 2b2b: astore 13
      // 2b2d: aload 9
      // 2b2f: invokevirtual net/minecraft/world/entity/Entity.getDisplayName ()Lnet/minecraft/network/chat/Component;
      // 2b32: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 2b37: astore 14
      // 2b39: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 2b3c: aload 9
      // 2b3e: instanceof net/minecraft/world/entity/LivingEntity
      // 2b41: ifeq 2b53
      // 2b44: aload 9
      // 2b46: checkcast net/minecraft/world/entity/LivingEntity
      // 2b49: astore 15
      // 2b4b: aload 15
      // 2b4d: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 2b50: goto 2b56
      // 2b53: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 2b56: aload 14
      // 2b58: invokedynamic accept (Ljava/lang/String;)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$67 (Ljava/lang/String;Lnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 2b5d: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 2b60: ldc_w "Leashed"
      // 2b63: astore 12
      // 2b65: aload 8
      // 2b67: instanceof net/minecraft/world/entity/Mob
      // 2b6a: ifeq 2b7c
      // 2b6d: aload 8
      // 2b6f: checkcast net/minecraft/world/entity/Mob
      // 2b72: astore 14
      // 2b74: aload 14
      // 2b76: invokevirtual net/minecraft/world/entity/Mob.isLeashed ()Z
      // 2b79: goto 2b7d
      // 2b7c: bipush 0
      // 2b7d: istore 13
      // 2b7f: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 2b82: aload 9
      // 2b84: instanceof net/minecraft/world/entity/LivingEntity
      // 2b87: ifeq 2b99
      // 2b8a: aload 9
      // 2b8c: checkcast net/minecraft/world/entity/LivingEntity
      // 2b8f: astore 14
      // 2b91: aload 14
      // 2b93: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 2b96: goto 2b9c
      // 2b99: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 2b9c: iload 13
      // 2b9e: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$68 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 2ba3: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 2ba6: ldc_w "NoGravity"
      // 2ba9: astore 12
      // 2bab: aload 8
      // 2bad: invokevirtual net/minecraft/world/entity/Entity.isNoGravity ()Z
      // 2bb0: istore 13
      // 2bb2: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 2bb5: aload 9
      // 2bb7: instanceof net/minecraft/world/entity/LivingEntity
      // 2bba: ifeq 2bcc
      // 2bbd: aload 9
      // 2bbf: checkcast net/minecraft/world/entity/LivingEntity
      // 2bc2: astore 14
      // 2bc4: aload 14
      // 2bc6: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 2bc9: goto 2bcf
      // 2bcc: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 2bcf: iload 13
      // 2bd1: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$69 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 2bd6: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 2bd9: ldc_w "MaxHealth"
      // 2bdc: astore 12
      // 2bde: aload 8
      // 2be0: instanceof net/minecraft/world/entity/LivingEntity
      // 2be3: ifeq 2bf6
      // 2be6: aload 8
      // 2be8: checkcast net/minecraft/world/entity/LivingEntity
      // 2beb: astore 15
      // 2bed: aload 15
      // 2bef: invokevirtual net/minecraft/world/entity/LivingEntity.getMaxHealth ()F
      // 2bf2: f2d
      // 2bf3: goto 2bf9
      // 2bf6: ldc2_w -1.0
      // 2bf9: dstore 13
      // 2bfb: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 2bfe: aload 9
      // 2c00: instanceof net/minecraft/world/entity/LivingEntity
      // 2c03: ifeq 2c15
      // 2c06: aload 9
      // 2c08: checkcast net/minecraft/world/entity/LivingEntity
      // 2c0b: astore 15
      // 2c0d: aload 15
      // 2c0f: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 2c12: goto 2c18
      // 2c15: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 2c18: dload 13
      // 2c1a: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$70 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 2c1f: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 2c22: ldc_w "Health"
      // 2c25: astore 12
      // 2c27: aload 8
      // 2c29: instanceof net/minecraft/world/entity/LivingEntity
      // 2c2c: ifeq 2c3f
      // 2c2f: aload 8
      // 2c31: checkcast net/minecraft/world/entity/LivingEntity
      // 2c34: astore 15
      // 2c36: aload 15
      // 2c38: invokevirtual net/minecraft/world/entity/LivingEntity.getHealth ()F
      // 2c3b: f2d
      // 2c3c: goto 2c42
      // 2c3f: ldc2_w -1.0
      // 2c42: dstore 13
      // 2c44: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 2c47: aload 9
      // 2c49: instanceof net/minecraft/world/entity/LivingEntity
      // 2c4c: ifeq 2c5e
      // 2c4f: aload 9
      // 2c51: checkcast net/minecraft/world/entity/LivingEntity
      // 2c54: astore 15
      // 2c56: aload 15
      // 2c58: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 2c5b: goto 2c61
      // 2c5e: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 2c61: dload 13
      // 2c63: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$71 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 2c68: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 2c6b: ldc_w "Air"
      // 2c6e: astore 12
      // 2c70: aload 8
      // 2c72: invokevirtual net/minecraft/world/entity/Entity.getAirSupply ()I
      // 2c75: i2d
      // 2c76: dstore 13
      // 2c78: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 2c7b: aload 9
      // 2c7d: instanceof net/minecraft/world/entity/LivingEntity
      // 2c80: ifeq 2c92
      // 2c83: aload 9
      // 2c85: checkcast net/minecraft/world/entity/LivingEntity
      // 2c88: astore 15
      // 2c8a: aload 15
      // 2c8c: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 2c8f: goto 2c95
      // 2c92: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 2c95: dload 13
      // 2c97: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$72 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 2c9c: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 2c9f: ldc_w "MotionX"
      // 2ca2: astore 12
      // 2ca4: aload 8
      // 2ca6: invokevirtual net/minecraft/world/entity/Entity.getDeltaMovement ()Lnet/minecraft/world/phys/Vec3;
      // 2ca9: invokevirtual net/minecraft/world/phys/Vec3.x ()D
      // 2cac: dstore 13
      // 2cae: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 2cb1: aload 9
      // 2cb3: instanceof net/minecraft/world/entity/LivingEntity
      // 2cb6: ifeq 2cc8
      // 2cb9: aload 9
      // 2cbb: checkcast net/minecraft/world/entity/LivingEntity
      // 2cbe: astore 15
      // 2cc0: aload 15
      // 2cc2: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 2cc5: goto 2ccb
      // 2cc8: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 2ccb: dload 13
      // 2ccd: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$73 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 2cd2: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 2cd5: ldc_w "MotionY"
      // 2cd8: astore 12
      // 2cda: aload 8
      // 2cdc: invokevirtual net/minecraft/world/entity/Entity.getDeltaMovement ()Lnet/minecraft/world/phys/Vec3;
      // 2cdf: invokevirtual net/minecraft/world/phys/Vec3.y ()D
      // 2ce2: dstore 13
      // 2ce4: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 2ce7: aload 9
      // 2ce9: instanceof net/minecraft/world/entity/LivingEntity
      // 2cec: ifeq 2cfe
      // 2cef: aload 9
      // 2cf1: checkcast net/minecraft/world/entity/LivingEntity
      // 2cf4: astore 15
      // 2cf6: aload 15
      // 2cf8: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 2cfb: goto 2d01
      // 2cfe: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 2d01: dload 13
      // 2d03: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$74 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 2d08: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 2d0b: ldc_w "MotionZ"
      // 2d0e: astore 12
      // 2d10: aload 8
      // 2d12: invokevirtual net/minecraft/world/entity/Entity.getDeltaMovement ()Lnet/minecraft/world/phys/Vec3;
      // 2d15: invokevirtual net/minecraft/world/phys/Vec3.z ()D
      // 2d18: dstore 13
      // 2d1a: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 2d1d: aload 9
      // 2d1f: instanceof net/minecraft/world/entity/LivingEntity
      // 2d22: ifeq 2d34
      // 2d25: aload 9
      // 2d27: checkcast net/minecraft/world/entity/LivingEntity
      // 2d2a: astore 15
      // 2d2c: aload 15
      // 2d2e: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 2d31: goto 2d37
      // 2d34: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 2d37: dload 13
      // 2d39: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$75 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 2d3e: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 2d41: ldc_w "RotationYaw"
      // 2d44: astore 12
      // 2d46: aload 8
      // 2d48: invokevirtual net/minecraft/world/entity/Entity.getYRot ()F
      // 2d4b: f2d
      // 2d4c: dstore 13
      // 2d4e: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 2d51: aload 9
      // 2d53: instanceof net/minecraft/world/entity/LivingEntity
      // 2d56: ifeq 2d68
      // 2d59: aload 9
      // 2d5b: checkcast net/minecraft/world/entity/LivingEntity
      // 2d5e: astore 15
      // 2d60: aload 15
      // 2d62: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 2d65: goto 2d6b
      // 2d68: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 2d6b: dload 13
      // 2d6d: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$76 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 2d72: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 2d75: ldc_w "RotationPitch"
      // 2d78: astore 12
      // 2d7a: aload 8
      // 2d7c: invokevirtual net/minecraft/world/entity/Entity.getXRot ()F
      // 2d7f: f2d
      // 2d80: dstore 13
      // 2d82: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 2d85: aload 9
      // 2d87: instanceof net/minecraft/world/entity/LivingEntity
      // 2d8a: ifeq 2d9c
      // 2d8d: aload 9
      // 2d8f: checkcast net/minecraft/world/entity/LivingEntity
      // 2d92: astore 15
      // 2d94: aload 15
      // 2d96: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 2d99: goto 2d9f
      // 2d9c: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 2d9f: dload 13
      // 2da1: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$77 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 2da6: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 2da9: ldc_w "Gender"
      // 2dac: astore 12
      // 2dae: aload 8
      // 2db0: instanceof net/mocreatures/entity/PantherEntity
      // 2db3: ifeq 2dd2
      // 2db6: aload 8
      // 2db8: checkcast net/mocreatures/entity/PantherEntity
      // 2dbb: astore 15
      // 2dbd: aload 15
      // 2dbf: invokevirtual net/mocreatures/entity/PantherEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2dc2: getstatic net/mocreatures/entity/PantherEntity.DATA_Gender Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2dc5: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2dc8: checkcast java/lang/Integer
      // 2dcb: invokevirtual java/lang/Integer.intValue ()I
      // 2dce: i2d
      // 2dcf: goto 2dd3
      // 2dd2: dconst_0
      // 2dd3: dstore 13
      // 2dd5: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 2dd8: aload 9
      // 2dda: instanceof net/minecraft/world/entity/LivingEntity
      // 2ddd: ifeq 2def
      // 2de0: aload 9
      // 2de2: checkcast net/minecraft/world/entity/LivingEntity
      // 2de5: astore 15
      // 2de7: aload 15
      // 2de9: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 2dec: goto 2df2
      // 2def: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 2df2: dload 13
      // 2df4: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$78 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 2df9: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 2dfc: ldc_w "Color"
      // 2dff: astore 12
      // 2e01: aload 8
      // 2e03: instanceof net/mocreatures/entity/PantherEntity
      // 2e06: ifeq 2e25
      // 2e09: aload 8
      // 2e0b: checkcast net/mocreatures/entity/PantherEntity
      // 2e0e: astore 15
      // 2e10: aload 15
      // 2e12: invokevirtual net/mocreatures/entity/PantherEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2e15: getstatic net/mocreatures/entity/PantherEntity.DATA_Color Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2e18: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2e1b: checkcast java/lang/Integer
      // 2e1e: invokevirtual java/lang/Integer.intValue ()I
      // 2e21: i2d
      // 2e22: goto 2e26
      // 2e25: dconst_0
      // 2e26: dstore 13
      // 2e28: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 2e2b: aload 9
      // 2e2d: instanceof net/minecraft/world/entity/LivingEntity
      // 2e30: ifeq 2e42
      // 2e33: aload 9
      // 2e35: checkcast net/minecraft/world/entity/LivingEntity
      // 2e38: astore 15
      // 2e3a: aload 15
      // 2e3c: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 2e3f: goto 2e45
      // 2e42: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 2e45: dload 13
      // 2e47: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$79 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 2e4c: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 2e4f: ldc_w "Wings"
      // 2e52: astore 12
      // 2e54: aload 8
      // 2e56: instanceof net/mocreatures/entity/PantherEntity
      // 2e59: ifeq 2e7b
      // 2e5c: aload 8
      // 2e5e: checkcast net/mocreatures/entity/PantherEntity
      // 2e61: astore 14
      // 2e63: aload 14
      // 2e65: invokevirtual net/mocreatures/entity/PantherEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2e68: getstatic net/mocreatures/entity/PantherEntity.DATA_Wings Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2e6b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2e6e: checkcast java/lang/Boolean
      // 2e71: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2e74: ifeq 2e7b
      // 2e77: bipush 1
      // 2e78: goto 2e7c
      // 2e7b: bipush 0
      // 2e7c: istore 13
      // 2e7e: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 2e81: aload 9
      // 2e83: instanceof net/minecraft/world/entity/LivingEntity
      // 2e86: ifeq 2e98
      // 2e89: aload 9
      // 2e8b: checkcast net/minecraft/world/entity/LivingEntity
      // 2e8e: astore 14
      // 2e90: aload 14
      // 2e92: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 2e95: goto 2e9b
      // 2e98: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 2e9b: iload 13
      // 2e9d: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$80 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 2ea2: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 2ea5: ldc_w "Medallion"
      // 2ea8: astore 12
      // 2eaa: aload 8
      // 2eac: instanceof net/mocreatures/entity/PantherEntity
      // 2eaf: ifeq 2ed1
      // 2eb2: aload 8
      // 2eb4: checkcast net/mocreatures/entity/PantherEntity
      // 2eb7: astore 14
      // 2eb9: aload 14
      // 2ebb: invokevirtual net/mocreatures/entity/PantherEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2ebe: getstatic net/mocreatures/entity/PantherEntity.DATA_Medallion Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2ec1: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2ec4: checkcast java/lang/Boolean
      // 2ec7: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2eca: ifeq 2ed1
      // 2ecd: bipush 1
      // 2ece: goto 2ed2
      // 2ed1: bipush 0
      // 2ed2: istore 13
      // 2ed4: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 2ed7: aload 9
      // 2ed9: instanceof net/minecraft/world/entity/LivingEntity
      // 2edc: ifeq 2eee
      // 2edf: aload 9
      // 2ee1: checkcast net/minecraft/world/entity/LivingEntity
      // 2ee4: astore 14
      // 2ee6: aload 14
      // 2ee8: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 2eeb: goto 2ef1
      // 2eee: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 2ef1: iload 13
      // 2ef3: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$81 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 2ef8: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 2efb: aload 8
      // 2efd: invokevirtual net/minecraft/world/entity/Entity.getType ()Lnet/minecraft/world/entity/EntityType;
      // 2f00: getstatic net/minecraft/core/registries/Registries.ENTITY_TYPE Lnet/minecraft/resources/ResourceKey;
      // 2f03: ldc_w "mocreatures:panther"
      // 2f06: invokestatic net/minecraft/resources/ResourceLocation.parse (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
      // 2f09: invokestatic net/minecraft/tags/TagKey.create (Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
      // 2f0c: invokevirtual net/minecraft/world/entity/EntityType.is (Lnet/minecraft/tags/TagKey;)Z
      // 2f0f: ifeq 33fa
      // 2f12: aload 8
      // 2f14: instanceof net/mocreatures/entity/PantherEntity
      // 2f17: ifeq 2f39
      // 2f1a: aload 8
      // 2f1c: checkcast net/mocreatures/entity/PantherEntity
      // 2f1f: astore 12
      // 2f21: aload 12
      // 2f23: invokevirtual net/mocreatures/entity/PantherEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2f26: getstatic net/mocreatures/entity/PantherEntity.DATA_Saddle Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2f29: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2f2c: checkcast java/lang/Boolean
      // 2f2f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2f32: ifeq 2f39
      // 2f35: bipush 1
      // 2f36: goto 2f3a
      // 2f39: bipush 0
      // 2f3a: bipush 1
      // 2f3b: if_icmpne 2f7a
      // 2f3e: aload 1
      // 2f3f: instanceof net/minecraft/server/level/ServerLevel
      // 2f42: ifeq 2f7a
      // 2f45: aload 1
      // 2f46: checkcast net/minecraft/server/level/ServerLevel
      // 2f49: astore 13
      // 2f4b: new net/minecraft/world/entity/item/ItemEntity
      // 2f4e: dup
      // 2f4f: aload 13
      // 2f51: dload 2
      // 2f52: dload 4
      // 2f54: dload 6
      // 2f56: new net/minecraft/world/item/ItemStack
      // 2f59: dup
      // 2f5a: getstatic net/mocreatures/init/MocreaturesModItems.CRAFTED_SADDLE Lnet/neoforged/neoforge/registries/DeferredItem;
      // 2f5d: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 2f60: checkcast net/minecraft/world/level/ItemLike
      // 2f63: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 2f66: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 2f69: astore 14
      // 2f6b: aload 14
      // 2f6d: bipush 10
      // 2f6f: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 2f72: aload 13
      // 2f74: aload 14
      // 2f76: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 2f79: pop
      // 2f7a: aload 8
      // 2f7c: instanceof net/mocreatures/entity/PantherEntity
      // 2f7f: ifeq 2fa1
      // 2f82: aload 8
      // 2f84: checkcast net/mocreatures/entity/PantherEntity
      // 2f87: astore 12
      // 2f89: aload 12
      // 2f8b: invokevirtual net/mocreatures/entity/PantherEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 2f8e: getstatic net/mocreatures/entity/PantherEntity.DATA_Chest Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 2f91: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 2f94: checkcast java/lang/Boolean
      // 2f97: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2f9a: ifeq 2fa1
      // 2f9d: bipush 1
      // 2f9e: goto 2fa2
      // 2fa1: bipush 0
      // 2fa2: bipush 1
      // 2fa3: if_icmpne 2fdc
      // 2fa6: aload 1
      // 2fa7: instanceof net/minecraft/server/level/ServerLevel
      // 2faa: ifeq 2fdc
      // 2fad: aload 1
      // 2fae: checkcast net/minecraft/server/level/ServerLevel
      // 2fb1: astore 13
      // 2fb3: new net/minecraft/world/entity/item/ItemEntity
      // 2fb6: dup
      // 2fb7: aload 13
      // 2fb9: dload 2
      // 2fba: dload 4
      // 2fbc: dload 6
      // 2fbe: new net/minecraft/world/item/ItemStack
      // 2fc1: dup
      // 2fc2: getstatic net/minecraft/world/level/block/Blocks.CHEST Lnet/minecraft/world/level/block/Block;
      // 2fc5: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 2fc8: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 2fcb: astore 14
      // 2fcd: aload 14
      // 2fcf: bipush 10
      // 2fd1: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 2fd4: aload 13
      // 2fd6: aload 14
      // 2fd8: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 2fdb: pop
      // 2fdc: aload 1
      // 2fdd: instanceof net/minecraft/server/level/ServerLevel
      // 2fe0: ifeq 3015
      // 2fe3: aload 1
      // 2fe4: checkcast net/minecraft/server/level/ServerLevel
      // 2fe7: astore 12
      // 2fe9: new net/minecraft/world/entity/item/ItemEntity
      // 2fec: dup
      // 2fed: aload 12
      // 2fef: dload 2
      // 2ff0: dload 4
      // 2ff2: dload 6
      // 2ff4: new net/mocreatures/procedures/PetAmuletCapture2Procedure$73
      // 2ff7: dup
      // 2ff8: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$73.<init> ()V
      // 2ffb: bipush 0
      // 2ffc: aload 8
      // 2ffe: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$73.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 3001: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3004: astore 13
      // 3006: aload 13
      // 3008: bipush 10
      // 300a: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 300d: aload 12
      // 300f: aload 13
      // 3011: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3014: pop
      // 3015: aload 1
      // 3016: instanceof net/minecraft/server/level/ServerLevel
      // 3019: ifeq 304e
      // 301c: aload 1
      // 301d: checkcast net/minecraft/server/level/ServerLevel
      // 3020: astore 12
      // 3022: new net/minecraft/world/entity/item/ItemEntity
      // 3025: dup
      // 3026: aload 12
      // 3028: dload 2
      // 3029: dload 4
      // 302b: dload 6
      // 302d: new net/mocreatures/procedures/PetAmuletCapture2Procedure$74
      // 3030: dup
      // 3031: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$74.<init> ()V
      // 3034: bipush 1
      // 3035: aload 8
      // 3037: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$74.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 303a: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 303d: astore 13
      // 303f: aload 13
      // 3041: bipush 10
      // 3043: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3046: aload 12
      // 3048: aload 13
      // 304a: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 304d: pop
      // 304e: aload 1
      // 304f: instanceof net/minecraft/server/level/ServerLevel
      // 3052: ifeq 3087
      // 3055: aload 1
      // 3056: checkcast net/minecraft/server/level/ServerLevel
      // 3059: astore 12
      // 305b: new net/minecraft/world/entity/item/ItemEntity
      // 305e: dup
      // 305f: aload 12
      // 3061: dload 2
      // 3062: dload 4
      // 3064: dload 6
      // 3066: new net/mocreatures/procedures/PetAmuletCapture2Procedure$75
      // 3069: dup
      // 306a: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$75.<init> ()V
      // 306d: bipush 2
      // 306e: aload 8
      // 3070: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$75.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 3073: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3076: astore 13
      // 3078: aload 13
      // 307a: bipush 10
      // 307c: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 307f: aload 12
      // 3081: aload 13
      // 3083: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3086: pop
      // 3087: aload 1
      // 3088: instanceof net/minecraft/server/level/ServerLevel
      // 308b: ifeq 30c0
      // 308e: aload 1
      // 308f: checkcast net/minecraft/server/level/ServerLevel
      // 3092: astore 12
      // 3094: new net/minecraft/world/entity/item/ItemEntity
      // 3097: dup
      // 3098: aload 12
      // 309a: dload 2
      // 309b: dload 4
      // 309d: dload 6
      // 309f: new net/mocreatures/procedures/PetAmuletCapture2Procedure$76
      // 30a2: dup
      // 30a3: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$76.<init> ()V
      // 30a6: bipush 3
      // 30a7: aload 8
      // 30a9: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$76.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 30ac: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 30af: astore 13
      // 30b1: aload 13
      // 30b3: bipush 10
      // 30b5: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 30b8: aload 12
      // 30ba: aload 13
      // 30bc: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 30bf: pop
      // 30c0: aload 1
      // 30c1: instanceof net/minecraft/server/level/ServerLevel
      // 30c4: ifeq 30f9
      // 30c7: aload 1
      // 30c8: checkcast net/minecraft/server/level/ServerLevel
      // 30cb: astore 12
      // 30cd: new net/minecraft/world/entity/item/ItemEntity
      // 30d0: dup
      // 30d1: aload 12
      // 30d3: dload 2
      // 30d4: dload 4
      // 30d6: dload 6
      // 30d8: new net/mocreatures/procedures/PetAmuletCapture2Procedure$77
      // 30db: dup
      // 30dc: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$77.<init> ()V
      // 30df: bipush 4
      // 30e0: aload 8
      // 30e2: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$77.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 30e5: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 30e8: astore 13
      // 30ea: aload 13
      // 30ec: bipush 10
      // 30ee: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 30f1: aload 12
      // 30f3: aload 13
      // 30f5: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 30f8: pop
      // 30f9: aload 1
      // 30fa: instanceof net/minecraft/server/level/ServerLevel
      // 30fd: ifeq 3132
      // 3100: aload 1
      // 3101: checkcast net/minecraft/server/level/ServerLevel
      // 3104: astore 12
      // 3106: new net/minecraft/world/entity/item/ItemEntity
      // 3109: dup
      // 310a: aload 12
      // 310c: dload 2
      // 310d: dload 4
      // 310f: dload 6
      // 3111: new net/mocreatures/procedures/PetAmuletCapture2Procedure$78
      // 3114: dup
      // 3115: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$78.<init> ()V
      // 3118: bipush 5
      // 3119: aload 8
      // 311b: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$78.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 311e: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3121: astore 13
      // 3123: aload 13
      // 3125: bipush 10
      // 3127: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 312a: aload 12
      // 312c: aload 13
      // 312e: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3131: pop
      // 3132: aload 1
      // 3133: instanceof net/minecraft/server/level/ServerLevel
      // 3136: ifeq 316c
      // 3139: aload 1
      // 313a: checkcast net/minecraft/server/level/ServerLevel
      // 313d: astore 12
      // 313f: new net/minecraft/world/entity/item/ItemEntity
      // 3142: dup
      // 3143: aload 12
      // 3145: dload 2
      // 3146: dload 4
      // 3148: dload 6
      // 314a: new net/mocreatures/procedures/PetAmuletCapture2Procedure$79
      // 314d: dup
      // 314e: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$79.<init> ()V
      // 3151: bipush 6
      // 3153: aload 8
      // 3155: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$79.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 3158: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 315b: astore 13
      // 315d: aload 13
      // 315f: bipush 10
      // 3161: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3164: aload 12
      // 3166: aload 13
      // 3168: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 316b: pop
      // 316c: aload 1
      // 316d: instanceof net/minecraft/server/level/ServerLevel
      // 3170: ifeq 31a6
      // 3173: aload 1
      // 3174: checkcast net/minecraft/server/level/ServerLevel
      // 3177: astore 12
      // 3179: new net/minecraft/world/entity/item/ItemEntity
      // 317c: dup
      // 317d: aload 12
      // 317f: dload 2
      // 3180: dload 4
      // 3182: dload 6
      // 3184: new net/mocreatures/procedures/PetAmuletCapture2Procedure$80
      // 3187: dup
      // 3188: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$80.<init> ()V
      // 318b: bipush 7
      // 318d: aload 8
      // 318f: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$80.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 3192: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3195: astore 13
      // 3197: aload 13
      // 3199: bipush 10
      // 319b: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 319e: aload 12
      // 31a0: aload 13
      // 31a2: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 31a5: pop
      // 31a6: aload 1
      // 31a7: instanceof net/minecraft/server/level/ServerLevel
      // 31aa: ifeq 31e0
      // 31ad: aload 1
      // 31ae: checkcast net/minecraft/server/level/ServerLevel
      // 31b1: astore 12
      // 31b3: new net/minecraft/world/entity/item/ItemEntity
      // 31b6: dup
      // 31b7: aload 12
      // 31b9: dload 2
      // 31ba: dload 4
      // 31bc: dload 6
      // 31be: new net/mocreatures/procedures/PetAmuletCapture2Procedure$81
      // 31c1: dup
      // 31c2: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$81.<init> ()V
      // 31c5: bipush 8
      // 31c7: aload 8
      // 31c9: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$81.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 31cc: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 31cf: astore 13
      // 31d1: aload 13
      // 31d3: bipush 10
      // 31d5: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 31d8: aload 12
      // 31da: aload 13
      // 31dc: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 31df: pop
      // 31e0: aload 1
      // 31e1: instanceof net/minecraft/server/level/ServerLevel
      // 31e4: ifeq 321a
      // 31e7: aload 1
      // 31e8: checkcast net/minecraft/server/level/ServerLevel
      // 31eb: astore 12
      // 31ed: new net/minecraft/world/entity/item/ItemEntity
      // 31f0: dup
      // 31f1: aload 12
      // 31f3: dload 2
      // 31f4: dload 4
      // 31f6: dload 6
      // 31f8: new net/mocreatures/procedures/PetAmuletCapture2Procedure$82
      // 31fb: dup
      // 31fc: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$82.<init> ()V
      // 31ff: bipush 9
      // 3201: aload 8
      // 3203: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$82.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 3206: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3209: astore 13
      // 320b: aload 13
      // 320d: bipush 10
      // 320f: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3212: aload 12
      // 3214: aload 13
      // 3216: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3219: pop
      // 321a: aload 1
      // 321b: instanceof net/minecraft/server/level/ServerLevel
      // 321e: ifeq 3254
      // 3221: aload 1
      // 3222: checkcast net/minecraft/server/level/ServerLevel
      // 3225: astore 12
      // 3227: new net/minecraft/world/entity/item/ItemEntity
      // 322a: dup
      // 322b: aload 12
      // 322d: dload 2
      // 322e: dload 4
      // 3230: dload 6
      // 3232: new net/mocreatures/procedures/PetAmuletCapture2Procedure$83
      // 3235: dup
      // 3236: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$83.<init> ()V
      // 3239: bipush 10
      // 323b: aload 8
      // 323d: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$83.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 3240: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3243: astore 13
      // 3245: aload 13
      // 3247: bipush 10
      // 3249: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 324c: aload 12
      // 324e: aload 13
      // 3250: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3253: pop
      // 3254: aload 1
      // 3255: instanceof net/minecraft/server/level/ServerLevel
      // 3258: ifeq 328e
      // 325b: aload 1
      // 325c: checkcast net/minecraft/server/level/ServerLevel
      // 325f: astore 12
      // 3261: new net/minecraft/world/entity/item/ItemEntity
      // 3264: dup
      // 3265: aload 12
      // 3267: dload 2
      // 3268: dload 4
      // 326a: dload 6
      // 326c: new net/mocreatures/procedures/PetAmuletCapture2Procedure$84
      // 326f: dup
      // 3270: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$84.<init> ()V
      // 3273: bipush 11
      // 3275: aload 8
      // 3277: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$84.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 327a: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 327d: astore 13
      // 327f: aload 13
      // 3281: bipush 10
      // 3283: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3286: aload 12
      // 3288: aload 13
      // 328a: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 328d: pop
      // 328e: aload 1
      // 328f: instanceof net/minecraft/server/level/ServerLevel
      // 3292: ifeq 32c8
      // 3295: aload 1
      // 3296: checkcast net/minecraft/server/level/ServerLevel
      // 3299: astore 12
      // 329b: new net/minecraft/world/entity/item/ItemEntity
      // 329e: dup
      // 329f: aload 12
      // 32a1: dload 2
      // 32a2: dload 4
      // 32a4: dload 6
      // 32a6: new net/mocreatures/procedures/PetAmuletCapture2Procedure$85
      // 32a9: dup
      // 32aa: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$85.<init> ()V
      // 32ad: bipush 12
      // 32af: aload 8
      // 32b1: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$85.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 32b4: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 32b7: astore 13
      // 32b9: aload 13
      // 32bb: bipush 10
      // 32bd: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 32c0: aload 12
      // 32c2: aload 13
      // 32c4: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 32c7: pop
      // 32c8: aload 1
      // 32c9: instanceof net/minecraft/server/level/ServerLevel
      // 32cc: ifeq 3302
      // 32cf: aload 1
      // 32d0: checkcast net/minecraft/server/level/ServerLevel
      // 32d3: astore 12
      // 32d5: new net/minecraft/world/entity/item/ItemEntity
      // 32d8: dup
      // 32d9: aload 12
      // 32db: dload 2
      // 32dc: dload 4
      // 32de: dload 6
      // 32e0: new net/mocreatures/procedures/PetAmuletCapture2Procedure$86
      // 32e3: dup
      // 32e4: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$86.<init> ()V
      // 32e7: bipush 13
      // 32e9: aload 8
      // 32eb: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$86.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 32ee: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 32f1: astore 13
      // 32f3: aload 13
      // 32f5: bipush 10
      // 32f7: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 32fa: aload 12
      // 32fc: aload 13
      // 32fe: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3301: pop
      // 3302: aload 1
      // 3303: instanceof net/minecraft/server/level/ServerLevel
      // 3306: ifeq 333c
      // 3309: aload 1
      // 330a: checkcast net/minecraft/server/level/ServerLevel
      // 330d: astore 12
      // 330f: new net/minecraft/world/entity/item/ItemEntity
      // 3312: dup
      // 3313: aload 12
      // 3315: dload 2
      // 3316: dload 4
      // 3318: dload 6
      // 331a: new net/mocreatures/procedures/PetAmuletCapture2Procedure$87
      // 331d: dup
      // 331e: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$87.<init> ()V
      // 3321: bipush 14
      // 3323: aload 8
      // 3325: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$87.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 3328: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 332b: astore 13
      // 332d: aload 13
      // 332f: bipush 10
      // 3331: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3334: aload 12
      // 3336: aload 13
      // 3338: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 333b: pop
      // 333c: aload 1
      // 333d: instanceof net/minecraft/server/level/ServerLevel
      // 3340: ifeq 3376
      // 3343: aload 1
      // 3344: checkcast net/minecraft/server/level/ServerLevel
      // 3347: astore 12
      // 3349: new net/minecraft/world/entity/item/ItemEntity
      // 334c: dup
      // 334d: aload 12
      // 334f: dload 2
      // 3350: dload 4
      // 3352: dload 6
      // 3354: new net/mocreatures/procedures/PetAmuletCapture2Procedure$88
      // 3357: dup
      // 3358: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$88.<init> ()V
      // 335b: bipush 15
      // 335d: aload 8
      // 335f: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$88.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 3362: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3365: astore 13
      // 3367: aload 13
      // 3369: bipush 10
      // 336b: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 336e: aload 12
      // 3370: aload 13
      // 3372: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3375: pop
      // 3376: aload 1
      // 3377: instanceof net/minecraft/server/level/ServerLevel
      // 337a: ifeq 33b0
      // 337d: aload 1
      // 337e: checkcast net/minecraft/server/level/ServerLevel
      // 3381: astore 12
      // 3383: new net/minecraft/world/entity/item/ItemEntity
      // 3386: dup
      // 3387: aload 12
      // 3389: dload 2
      // 338a: dload 4
      // 338c: dload 6
      // 338e: new net/mocreatures/procedures/PetAmuletCapture2Procedure$89
      // 3391: dup
      // 3392: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$89.<init> ()V
      // 3395: bipush 16
      // 3397: aload 8
      // 3399: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$89.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 339c: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 339f: astore 13
      // 33a1: aload 13
      // 33a3: bipush 10
      // 33a5: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 33a8: aload 12
      // 33aa: aload 13
      // 33ac: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 33af: pop
      // 33b0: aload 1
      // 33b1: instanceof net/minecraft/server/level/ServerLevel
      // 33b4: ifeq 33ea
      // 33b7: aload 1
      // 33b8: checkcast net/minecraft/server/level/ServerLevel
      // 33bb: astore 12
      // 33bd: new net/minecraft/world/entity/item/ItemEntity
      // 33c0: dup
      // 33c1: aload 12
      // 33c3: dload 2
      // 33c4: dload 4
      // 33c6: dload 6
      // 33c8: new net/mocreatures/procedures/PetAmuletCapture2Procedure$90
      // 33cb: dup
      // 33cc: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$90.<init> ()V
      // 33cf: bipush 17
      // 33d1: aload 8
      // 33d3: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$90.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 33d6: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 33d9: astore 13
      // 33db: aload 13
      // 33dd: bipush 10
      // 33df: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 33e2: aload 12
      // 33e4: aload 13
      // 33e6: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 33e9: pop
      // 33ea: aload 8
      // 33ec: invokevirtual net/minecraft/world/entity/Entity.level ()Lnet/minecraft/world/level/Level;
      // 33ef: invokevirtual net/minecraft/world/level/Level.isClientSide ()Z
      // 33f2: ifne 33fa
      // 33f5: aload 8
      // 33f7: invokevirtual net/minecraft/world/entity/Entity.discard ()V
      // 33fa: aload 9
      // 33fc: instanceof net/minecraft/world/entity/LivingEntity
      // 33ff: ifeq 3411
      // 3402: aload 9
      // 3404: checkcast net/minecraft/world/entity/LivingEntity
      // 3407: astore 11
      // 3409: aload 11
      // 340b: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 340e: goto 3414
      // 3411: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 3414: ldc_w "mocreatures:amulet/empty"
      // 3417: invokestatic net/minecraft/resources/ResourceLocation.parse (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
      // 341a: invokestatic net/minecraft/tags/ItemTags.create (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
      // 341d: invokevirtual net/minecraft/world/item/ItemStack.is (Lnet/minecraft/tags/TagKey;)Z
      // 3420: ifeq 3e42
      // 3423: aload 8
      // 3425: invokevirtual net/minecraft/world/entity/Entity.getType ()Lnet/minecraft/world/entity/EntityType;
      // 3428: getstatic net/minecraft/core/registries/Registries.ENTITY_TYPE Lnet/minecraft/resources/ResourceKey;
      // 342b: ldc_w "mocreatures:panthger"
      // 342e: invokestatic net/minecraft/resources/ResourceLocation.parse (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
      // 3431: invokestatic net/minecraft/tags/TagKey.create (Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
      // 3434: invokevirtual net/minecraft/world/entity/EntityType.is (Lnet/minecraft/tags/TagKey;)Z
      // 3437: ifeq 3e42
      // 343a: aload 8
      // 343c: instanceof net/minecraft/world/entity/TamableAnimal
      // 343f: ifeq 34a2
      // 3442: aload 8
      // 3444: checkcast net/minecraft/world/entity/TamableAnimal
      // 3447: astore 12
      // 3449: aload 12
      // 344b: invokevirtual net/minecraft/world/entity/TamableAnimal.isTame ()Z
      // 344e: ifeq 34a2
      // 3451: aload 8
      // 3453: instanceof net/mocreatures/entity/PanthgerEntity
      // 3456: ifeq 3478
      // 3459: aload 8
      // 345b: checkcast net/mocreatures/entity/PanthgerEntity
      // 345e: astore 13
      // 3460: aload 13
      // 3462: invokevirtual net/mocreatures/entity/PanthgerEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3465: getstatic net/mocreatures/entity/PanthgerEntity.DATA_Baby Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3468: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 346b: checkcast java/lang/Boolean
      // 346e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3471: ifeq 3478
      // 3474: bipush 1
      // 3475: goto 3479
      // 3478: bipush 0
      // 3479: ifne 34a2
      // 347c: aload 8
      // 347e: instanceof net/minecraft/world/entity/TamableAnimal
      // 3481: ifeq 3493
      // 3484: aload 8
      // 3486: checkcast net/minecraft/world/entity/TamableAnimal
      // 3489: astore 14
      // 348b: aload 14
      // 348d: invokevirtual net/minecraft/world/entity/TamableAnimal.getOwner ()Lnet/minecraft/world/entity/LivingEntity;
      // 3490: goto 3494
      // 3493: aconst_null
      // 3494: aload 9
      // 3496: if_acmpne 349f
      // 3499: bipush 1
      // 349a: istore 10
      // 349c: goto 34a2
      // 349f: bipush 0
      // 34a0: istore 10
      // 34a2: iload 10
      // 34a4: ifeq 3e42
      // 34a7: aload 9
      // 34a9: instanceof net/minecraft/world/entity/LivingEntity
      // 34ac: ifeq 34f2
      // 34af: aload 9
      // 34b1: checkcast net/minecraft/world/entity/LivingEntity
      // 34b4: astore 12
      // 34b6: new net/minecraft/world/item/ItemStack
      // 34b9: dup
      // 34ba: getstatic net/mocreatures/init/MocreaturesModItems.PET_AMULET_FULL Lnet/neoforged/neoforge/registries/DeferredItem;
      // 34bd: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 34c0: checkcast net/minecraft/world/level/ItemLike
      // 34c3: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 34c6: invokevirtual net/minecraft/world/item/ItemStack.copy ()Lnet/minecraft/world/item/ItemStack;
      // 34c9: astore 13
      // 34cb: aload 13
      // 34cd: bipush 1
      // 34ce: invokevirtual net/minecraft/world/item/ItemStack.setCount (I)V
      // 34d1: aload 12
      // 34d3: getstatic net/minecraft/world/InteractionHand.MAIN_HAND Lnet/minecraft/world/InteractionHand;
      // 34d6: aload 13
      // 34d8: invokevirtual net/minecraft/world/entity/LivingEntity.setItemInHand (Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/item/ItemStack;)V
      // 34db: aload 12
      // 34dd: instanceof net/minecraft/world/entity/player/Player
      // 34e0: ifeq 34f2
      // 34e3: aload 12
      // 34e5: checkcast net/minecraft/world/entity/player/Player
      // 34e8: astore 14
      // 34ea: aload 14
      // 34ec: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 34ef: invokevirtual net/minecraft/world/entity/player/Inventory.setChanged ()V
      // 34f2: ldc_w "Mob"
      // 34f5: astore 12
      // 34f7: ldc_w "mocreatures:panthger"
      // 34fa: astore 13
      // 34fc: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 34ff: aload 9
      // 3501: instanceof net/minecraft/world/entity/LivingEntity
      // 3504: ifeq 3516
      // 3507: aload 9
      // 3509: checkcast net/minecraft/world/entity/LivingEntity
      // 350c: astore 14
      // 350e: aload 14
      // 3510: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 3513: goto 3519
      // 3516: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 3519: invokedynamic accept ()Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$82 (Lnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 351e: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 3521: ldc_w "Name"
      // 3524: astore 12
      // 3526: aload 8
      // 3528: invokevirtual net/minecraft/world/entity/Entity.getDisplayName ()Lnet/minecraft/network/chat/Component;
      // 352b: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 3530: astore 13
      // 3532: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 3535: aload 9
      // 3537: instanceof net/minecraft/world/entity/LivingEntity
      // 353a: ifeq 354c
      // 353d: aload 9
      // 353f: checkcast net/minecraft/world/entity/LivingEntity
      // 3542: astore 14
      // 3544: aload 14
      // 3546: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 3549: goto 354f
      // 354c: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 354f: aload 13
      // 3551: invokedynamic accept (Ljava/lang/String;)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$83 (Ljava/lang/String;Lnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 3556: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 3559: aload 8
      // 355b: instanceof net/minecraft/world/entity/TamableAnimal
      // 355e: ifeq 35a8
      // 3561: aload 8
      // 3563: checkcast net/minecraft/world/entity/TamableAnimal
      // 3566: astore 12
      // 3568: aload 12
      // 356a: invokevirtual net/minecraft/world/entity/TamableAnimal.isTame ()Z
      // 356d: ifeq 35a8
      // 3570: ldc_w "Owner"
      // 3573: astore 13
      // 3575: aload 9
      // 3577: invokevirtual net/minecraft/world/entity/Entity.getDisplayName ()Lnet/minecraft/network/chat/Component;
      // 357a: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 357f: astore 14
      // 3581: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 3584: aload 9
      // 3586: instanceof net/minecraft/world/entity/LivingEntity
      // 3589: ifeq 359b
      // 358c: aload 9
      // 358e: checkcast net/minecraft/world/entity/LivingEntity
      // 3591: astore 15
      // 3593: aload 15
      // 3595: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 3598: goto 359e
      // 359b: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 359e: aload 14
      // 35a0: invokedynamic accept (Ljava/lang/String;)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$84 (Ljava/lang/String;Lnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 35a5: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 35a8: ldc_w "Leashed"
      // 35ab: astore 12
      // 35ad: aload 8
      // 35af: instanceof net/minecraft/world/entity/Mob
      // 35b2: ifeq 35c4
      // 35b5: aload 8
      // 35b7: checkcast net/minecraft/world/entity/Mob
      // 35ba: astore 14
      // 35bc: aload 14
      // 35be: invokevirtual net/minecraft/world/entity/Mob.isLeashed ()Z
      // 35c1: goto 35c5
      // 35c4: bipush 0
      // 35c5: istore 13
      // 35c7: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 35ca: aload 9
      // 35cc: instanceof net/minecraft/world/entity/LivingEntity
      // 35cf: ifeq 35e1
      // 35d2: aload 9
      // 35d4: checkcast net/minecraft/world/entity/LivingEntity
      // 35d7: astore 14
      // 35d9: aload 14
      // 35db: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 35de: goto 35e4
      // 35e1: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 35e4: iload 13
      // 35e6: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$85 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 35eb: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 35ee: ldc_w "NoGravity"
      // 35f1: astore 12
      // 35f3: aload 8
      // 35f5: invokevirtual net/minecraft/world/entity/Entity.isNoGravity ()Z
      // 35f8: istore 13
      // 35fa: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 35fd: aload 9
      // 35ff: instanceof net/minecraft/world/entity/LivingEntity
      // 3602: ifeq 3614
      // 3605: aload 9
      // 3607: checkcast net/minecraft/world/entity/LivingEntity
      // 360a: astore 14
      // 360c: aload 14
      // 360e: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 3611: goto 3617
      // 3614: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 3617: iload 13
      // 3619: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$86 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 361e: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 3621: ldc_w "MaxHealth"
      // 3624: astore 12
      // 3626: aload 8
      // 3628: instanceof net/minecraft/world/entity/LivingEntity
      // 362b: ifeq 363e
      // 362e: aload 8
      // 3630: checkcast net/minecraft/world/entity/LivingEntity
      // 3633: astore 15
      // 3635: aload 15
      // 3637: invokevirtual net/minecraft/world/entity/LivingEntity.getMaxHealth ()F
      // 363a: f2d
      // 363b: goto 3641
      // 363e: ldc2_w -1.0
      // 3641: dstore 13
      // 3643: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 3646: aload 9
      // 3648: instanceof net/minecraft/world/entity/LivingEntity
      // 364b: ifeq 365d
      // 364e: aload 9
      // 3650: checkcast net/minecraft/world/entity/LivingEntity
      // 3653: astore 15
      // 3655: aload 15
      // 3657: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 365a: goto 3660
      // 365d: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 3660: dload 13
      // 3662: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$87 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 3667: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 366a: ldc_w "Health"
      // 366d: astore 12
      // 366f: aload 8
      // 3671: instanceof net/minecraft/world/entity/LivingEntity
      // 3674: ifeq 3687
      // 3677: aload 8
      // 3679: checkcast net/minecraft/world/entity/LivingEntity
      // 367c: astore 15
      // 367e: aload 15
      // 3680: invokevirtual net/minecraft/world/entity/LivingEntity.getHealth ()F
      // 3683: f2d
      // 3684: goto 368a
      // 3687: ldc2_w -1.0
      // 368a: dstore 13
      // 368c: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 368f: aload 9
      // 3691: instanceof net/minecraft/world/entity/LivingEntity
      // 3694: ifeq 36a6
      // 3697: aload 9
      // 3699: checkcast net/minecraft/world/entity/LivingEntity
      // 369c: astore 15
      // 369e: aload 15
      // 36a0: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 36a3: goto 36a9
      // 36a6: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 36a9: dload 13
      // 36ab: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$88 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 36b0: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 36b3: ldc_w "Air"
      // 36b6: astore 12
      // 36b8: aload 8
      // 36ba: invokevirtual net/minecraft/world/entity/Entity.getAirSupply ()I
      // 36bd: i2d
      // 36be: dstore 13
      // 36c0: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 36c3: aload 9
      // 36c5: instanceof net/minecraft/world/entity/LivingEntity
      // 36c8: ifeq 36da
      // 36cb: aload 9
      // 36cd: checkcast net/minecraft/world/entity/LivingEntity
      // 36d0: astore 15
      // 36d2: aload 15
      // 36d4: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 36d7: goto 36dd
      // 36da: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 36dd: dload 13
      // 36df: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$89 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 36e4: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 36e7: ldc_w "MotionX"
      // 36ea: astore 12
      // 36ec: aload 8
      // 36ee: invokevirtual net/minecraft/world/entity/Entity.getDeltaMovement ()Lnet/minecraft/world/phys/Vec3;
      // 36f1: invokevirtual net/minecraft/world/phys/Vec3.x ()D
      // 36f4: dstore 13
      // 36f6: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 36f9: aload 9
      // 36fb: instanceof net/minecraft/world/entity/LivingEntity
      // 36fe: ifeq 3710
      // 3701: aload 9
      // 3703: checkcast net/minecraft/world/entity/LivingEntity
      // 3706: astore 15
      // 3708: aload 15
      // 370a: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 370d: goto 3713
      // 3710: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 3713: dload 13
      // 3715: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$90 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 371a: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 371d: ldc_w "MotionY"
      // 3720: astore 12
      // 3722: aload 8
      // 3724: invokevirtual net/minecraft/world/entity/Entity.getDeltaMovement ()Lnet/minecraft/world/phys/Vec3;
      // 3727: invokevirtual net/minecraft/world/phys/Vec3.y ()D
      // 372a: dstore 13
      // 372c: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 372f: aload 9
      // 3731: instanceof net/minecraft/world/entity/LivingEntity
      // 3734: ifeq 3746
      // 3737: aload 9
      // 3739: checkcast net/minecraft/world/entity/LivingEntity
      // 373c: astore 15
      // 373e: aload 15
      // 3740: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 3743: goto 3749
      // 3746: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 3749: dload 13
      // 374b: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$91 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 3750: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 3753: ldc_w "MotionZ"
      // 3756: astore 12
      // 3758: aload 8
      // 375a: invokevirtual net/minecraft/world/entity/Entity.getDeltaMovement ()Lnet/minecraft/world/phys/Vec3;
      // 375d: invokevirtual net/minecraft/world/phys/Vec3.z ()D
      // 3760: dstore 13
      // 3762: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 3765: aload 9
      // 3767: instanceof net/minecraft/world/entity/LivingEntity
      // 376a: ifeq 377c
      // 376d: aload 9
      // 376f: checkcast net/minecraft/world/entity/LivingEntity
      // 3772: astore 15
      // 3774: aload 15
      // 3776: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 3779: goto 377f
      // 377c: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 377f: dload 13
      // 3781: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$92 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 3786: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 3789: ldc_w "RotationYaw"
      // 378c: astore 12
      // 378e: aload 8
      // 3790: invokevirtual net/minecraft/world/entity/Entity.getYRot ()F
      // 3793: f2d
      // 3794: dstore 13
      // 3796: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 3799: aload 9
      // 379b: instanceof net/minecraft/world/entity/LivingEntity
      // 379e: ifeq 37b0
      // 37a1: aload 9
      // 37a3: checkcast net/minecraft/world/entity/LivingEntity
      // 37a6: astore 15
      // 37a8: aload 15
      // 37aa: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 37ad: goto 37b3
      // 37b0: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 37b3: dload 13
      // 37b5: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$93 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 37ba: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 37bd: ldc_w "RotationPitch"
      // 37c0: astore 12
      // 37c2: aload 8
      // 37c4: invokevirtual net/minecraft/world/entity/Entity.getXRot ()F
      // 37c7: f2d
      // 37c8: dstore 13
      // 37ca: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 37cd: aload 9
      // 37cf: instanceof net/minecraft/world/entity/LivingEntity
      // 37d2: ifeq 37e4
      // 37d5: aload 9
      // 37d7: checkcast net/minecraft/world/entity/LivingEntity
      // 37da: astore 15
      // 37dc: aload 15
      // 37de: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 37e1: goto 37e7
      // 37e4: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 37e7: dload 13
      // 37e9: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$94 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 37ee: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 37f1: ldc_w "Gender"
      // 37f4: astore 12
      // 37f6: aload 8
      // 37f8: instanceof net/mocreatures/entity/PanthgerEntity
      // 37fb: ifeq 381a
      // 37fe: aload 8
      // 3800: checkcast net/mocreatures/entity/PanthgerEntity
      // 3803: astore 15
      // 3805: aload 15
      // 3807: invokevirtual net/mocreatures/entity/PanthgerEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 380a: getstatic net/mocreatures/entity/PanthgerEntity.DATA_Gender Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 380d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 3810: checkcast java/lang/Integer
      // 3813: invokevirtual java/lang/Integer.intValue ()I
      // 3816: i2d
      // 3817: goto 381b
      // 381a: dconst_0
      // 381b: dstore 13
      // 381d: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 3820: aload 9
      // 3822: instanceof net/minecraft/world/entity/LivingEntity
      // 3825: ifeq 3837
      // 3828: aload 9
      // 382a: checkcast net/minecraft/world/entity/LivingEntity
      // 382d: astore 15
      // 382f: aload 15
      // 3831: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 3834: goto 383a
      // 3837: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 383a: dload 13
      // 383c: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$95 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 3841: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 3844: ldc_w "Color"
      // 3847: astore 12
      // 3849: aload 8
      // 384b: instanceof net/mocreatures/entity/PanthgerEntity
      // 384e: ifeq 386d
      // 3851: aload 8
      // 3853: checkcast net/mocreatures/entity/PanthgerEntity
      // 3856: astore 15
      // 3858: aload 15
      // 385a: invokevirtual net/mocreatures/entity/PanthgerEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 385d: getstatic net/mocreatures/entity/PanthgerEntity.DATA_Color Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3860: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 3863: checkcast java/lang/Integer
      // 3866: invokevirtual java/lang/Integer.intValue ()I
      // 3869: i2d
      // 386a: goto 386e
      // 386d: dconst_0
      // 386e: dstore 13
      // 3870: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 3873: aload 9
      // 3875: instanceof net/minecraft/world/entity/LivingEntity
      // 3878: ifeq 388a
      // 387b: aload 9
      // 387d: checkcast net/minecraft/world/entity/LivingEntity
      // 3880: astore 15
      // 3882: aload 15
      // 3884: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 3887: goto 388d
      // 388a: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 388d: dload 13
      // 388f: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$96 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 3894: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 3897: ldc_w "Wings"
      // 389a: astore 12
      // 389c: aload 8
      // 389e: instanceof net/mocreatures/entity/PanthgerEntity
      // 38a1: ifeq 38c3
      // 38a4: aload 8
      // 38a6: checkcast net/mocreatures/entity/PanthgerEntity
      // 38a9: astore 14
      // 38ab: aload 14
      // 38ad: invokevirtual net/mocreatures/entity/PanthgerEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 38b0: getstatic net/mocreatures/entity/PanthgerEntity.DATA_Wings Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 38b3: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 38b6: checkcast java/lang/Boolean
      // 38b9: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 38bc: ifeq 38c3
      // 38bf: bipush 1
      // 38c0: goto 38c4
      // 38c3: bipush 0
      // 38c4: istore 13
      // 38c6: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 38c9: aload 9
      // 38cb: instanceof net/minecraft/world/entity/LivingEntity
      // 38ce: ifeq 38e0
      // 38d1: aload 9
      // 38d3: checkcast net/minecraft/world/entity/LivingEntity
      // 38d6: astore 14
      // 38d8: aload 14
      // 38da: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 38dd: goto 38e3
      // 38e0: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 38e3: iload 13
      // 38e5: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$97 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 38ea: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 38ed: ldc_w "Medallion"
      // 38f0: astore 12
      // 38f2: aload 8
      // 38f4: instanceof net/mocreatures/entity/PanthgerEntity
      // 38f7: ifeq 3919
      // 38fa: aload 8
      // 38fc: checkcast net/mocreatures/entity/PanthgerEntity
      // 38ff: astore 14
      // 3901: aload 14
      // 3903: invokevirtual net/mocreatures/entity/PanthgerEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3906: getstatic net/mocreatures/entity/PanthgerEntity.DATA_Medallion Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3909: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 390c: checkcast java/lang/Boolean
      // 390f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3912: ifeq 3919
      // 3915: bipush 1
      // 3916: goto 391a
      // 3919: bipush 0
      // 391a: istore 13
      // 391c: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 391f: aload 9
      // 3921: instanceof net/minecraft/world/entity/LivingEntity
      // 3924: ifeq 3936
      // 3927: aload 9
      // 3929: checkcast net/minecraft/world/entity/LivingEntity
      // 392c: astore 14
      // 392e: aload 14
      // 3930: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 3933: goto 3939
      // 3936: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 3939: iload 13
      // 393b: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$98 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 3940: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 3943: aload 8
      // 3945: invokevirtual net/minecraft/world/entity/Entity.getType ()Lnet/minecraft/world/entity/EntityType;
      // 3948: getstatic net/minecraft/core/registries/Registries.ENTITY_TYPE Lnet/minecraft/resources/ResourceKey;
      // 394b: ldc_w "mocreatures:panthger"
      // 394e: invokestatic net/minecraft/resources/ResourceLocation.parse (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
      // 3951: invokestatic net/minecraft/tags/TagKey.create (Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
      // 3954: invokevirtual net/minecraft/world/entity/EntityType.is (Lnet/minecraft/tags/TagKey;)Z
      // 3957: ifeq 3e42
      // 395a: aload 8
      // 395c: instanceof net/mocreatures/entity/PanthgerEntity
      // 395f: ifeq 3981
      // 3962: aload 8
      // 3964: checkcast net/mocreatures/entity/PanthgerEntity
      // 3967: astore 12
      // 3969: aload 12
      // 396b: invokevirtual net/mocreatures/entity/PanthgerEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 396e: getstatic net/mocreatures/entity/PanthgerEntity.DATA_Saddle Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3971: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 3974: checkcast java/lang/Boolean
      // 3977: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 397a: ifeq 3981
      // 397d: bipush 1
      // 397e: goto 3982
      // 3981: bipush 0
      // 3982: bipush 1
      // 3983: if_icmpne 39c2
      // 3986: aload 1
      // 3987: instanceof net/minecraft/server/level/ServerLevel
      // 398a: ifeq 39c2
      // 398d: aload 1
      // 398e: checkcast net/minecraft/server/level/ServerLevel
      // 3991: astore 13
      // 3993: new net/minecraft/world/entity/item/ItemEntity
      // 3996: dup
      // 3997: aload 13
      // 3999: dload 2
      // 399a: dload 4
      // 399c: dload 6
      // 399e: new net/minecraft/world/item/ItemStack
      // 39a1: dup
      // 39a2: getstatic net/mocreatures/init/MocreaturesModItems.CRAFTED_SADDLE Lnet/neoforged/neoforge/registries/DeferredItem;
      // 39a5: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 39a8: checkcast net/minecraft/world/level/ItemLike
      // 39ab: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 39ae: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 39b1: astore 14
      // 39b3: aload 14
      // 39b5: bipush 10
      // 39b7: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 39ba: aload 13
      // 39bc: aload 14
      // 39be: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 39c1: pop
      // 39c2: aload 8
      // 39c4: instanceof net/mocreatures/entity/PanthgerEntity
      // 39c7: ifeq 39e9
      // 39ca: aload 8
      // 39cc: checkcast net/mocreatures/entity/PanthgerEntity
      // 39cf: astore 12
      // 39d1: aload 12
      // 39d3: invokevirtual net/mocreatures/entity/PanthgerEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 39d6: getstatic net/mocreatures/entity/PanthgerEntity.DATA_Chest Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 39d9: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 39dc: checkcast java/lang/Boolean
      // 39df: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 39e2: ifeq 39e9
      // 39e5: bipush 1
      // 39e6: goto 39ea
      // 39e9: bipush 0
      // 39ea: bipush 1
      // 39eb: if_icmpne 3a24
      // 39ee: aload 1
      // 39ef: instanceof net/minecraft/server/level/ServerLevel
      // 39f2: ifeq 3a24
      // 39f5: aload 1
      // 39f6: checkcast net/minecraft/server/level/ServerLevel
      // 39f9: astore 13
      // 39fb: new net/minecraft/world/entity/item/ItemEntity
      // 39fe: dup
      // 39ff: aload 13
      // 3a01: dload 2
      // 3a02: dload 4
      // 3a04: dload 6
      // 3a06: new net/minecraft/world/item/ItemStack
      // 3a09: dup
      // 3a0a: getstatic net/minecraft/world/level/block/Blocks.CHEST Lnet/minecraft/world/level/block/Block;
      // 3a0d: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 3a10: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3a13: astore 14
      // 3a15: aload 14
      // 3a17: bipush 10
      // 3a19: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3a1c: aload 13
      // 3a1e: aload 14
      // 3a20: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3a23: pop
      // 3a24: aload 1
      // 3a25: instanceof net/minecraft/server/level/ServerLevel
      // 3a28: ifeq 3a5d
      // 3a2b: aload 1
      // 3a2c: checkcast net/minecraft/server/level/ServerLevel
      // 3a2f: astore 12
      // 3a31: new net/minecraft/world/entity/item/ItemEntity
      // 3a34: dup
      // 3a35: aload 12
      // 3a37: dload 2
      // 3a38: dload 4
      // 3a3a: dload 6
      // 3a3c: new net/mocreatures/procedures/PetAmuletCapture2Procedure$91
      // 3a3f: dup
      // 3a40: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$91.<init> ()V
      // 3a43: bipush 0
      // 3a44: aload 8
      // 3a46: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$91.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 3a49: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3a4c: astore 13
      // 3a4e: aload 13
      // 3a50: bipush 10
      // 3a52: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3a55: aload 12
      // 3a57: aload 13
      // 3a59: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3a5c: pop
      // 3a5d: aload 1
      // 3a5e: instanceof net/minecraft/server/level/ServerLevel
      // 3a61: ifeq 3a96
      // 3a64: aload 1
      // 3a65: checkcast net/minecraft/server/level/ServerLevel
      // 3a68: astore 12
      // 3a6a: new net/minecraft/world/entity/item/ItemEntity
      // 3a6d: dup
      // 3a6e: aload 12
      // 3a70: dload 2
      // 3a71: dload 4
      // 3a73: dload 6
      // 3a75: new net/mocreatures/procedures/PetAmuletCapture2Procedure$92
      // 3a78: dup
      // 3a79: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$92.<init> ()V
      // 3a7c: bipush 1
      // 3a7d: aload 8
      // 3a7f: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$92.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 3a82: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3a85: astore 13
      // 3a87: aload 13
      // 3a89: bipush 10
      // 3a8b: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3a8e: aload 12
      // 3a90: aload 13
      // 3a92: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3a95: pop
      // 3a96: aload 1
      // 3a97: instanceof net/minecraft/server/level/ServerLevel
      // 3a9a: ifeq 3acf
      // 3a9d: aload 1
      // 3a9e: checkcast net/minecraft/server/level/ServerLevel
      // 3aa1: astore 12
      // 3aa3: new net/minecraft/world/entity/item/ItemEntity
      // 3aa6: dup
      // 3aa7: aload 12
      // 3aa9: dload 2
      // 3aaa: dload 4
      // 3aac: dload 6
      // 3aae: new net/mocreatures/procedures/PetAmuletCapture2Procedure$93
      // 3ab1: dup
      // 3ab2: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$93.<init> ()V
      // 3ab5: bipush 2
      // 3ab6: aload 8
      // 3ab8: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$93.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 3abb: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3abe: astore 13
      // 3ac0: aload 13
      // 3ac2: bipush 10
      // 3ac4: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3ac7: aload 12
      // 3ac9: aload 13
      // 3acb: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3ace: pop
      // 3acf: aload 1
      // 3ad0: instanceof net/minecraft/server/level/ServerLevel
      // 3ad3: ifeq 3b08
      // 3ad6: aload 1
      // 3ad7: checkcast net/minecraft/server/level/ServerLevel
      // 3ada: astore 12
      // 3adc: new net/minecraft/world/entity/item/ItemEntity
      // 3adf: dup
      // 3ae0: aload 12
      // 3ae2: dload 2
      // 3ae3: dload 4
      // 3ae5: dload 6
      // 3ae7: new net/mocreatures/procedures/PetAmuletCapture2Procedure$94
      // 3aea: dup
      // 3aeb: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$94.<init> ()V
      // 3aee: bipush 3
      // 3aef: aload 8
      // 3af1: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$94.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 3af4: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3af7: astore 13
      // 3af9: aload 13
      // 3afb: bipush 10
      // 3afd: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3b00: aload 12
      // 3b02: aload 13
      // 3b04: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3b07: pop
      // 3b08: aload 1
      // 3b09: instanceof net/minecraft/server/level/ServerLevel
      // 3b0c: ifeq 3b41
      // 3b0f: aload 1
      // 3b10: checkcast net/minecraft/server/level/ServerLevel
      // 3b13: astore 12
      // 3b15: new net/minecraft/world/entity/item/ItemEntity
      // 3b18: dup
      // 3b19: aload 12
      // 3b1b: dload 2
      // 3b1c: dload 4
      // 3b1e: dload 6
      // 3b20: new net/mocreatures/procedures/PetAmuletCapture2Procedure$95
      // 3b23: dup
      // 3b24: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$95.<init> ()V
      // 3b27: bipush 4
      // 3b28: aload 8
      // 3b2a: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$95.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 3b2d: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3b30: astore 13
      // 3b32: aload 13
      // 3b34: bipush 10
      // 3b36: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3b39: aload 12
      // 3b3b: aload 13
      // 3b3d: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3b40: pop
      // 3b41: aload 1
      // 3b42: instanceof net/minecraft/server/level/ServerLevel
      // 3b45: ifeq 3b7a
      // 3b48: aload 1
      // 3b49: checkcast net/minecraft/server/level/ServerLevel
      // 3b4c: astore 12
      // 3b4e: new net/minecraft/world/entity/item/ItemEntity
      // 3b51: dup
      // 3b52: aload 12
      // 3b54: dload 2
      // 3b55: dload 4
      // 3b57: dload 6
      // 3b59: new net/mocreatures/procedures/PetAmuletCapture2Procedure$96
      // 3b5c: dup
      // 3b5d: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$96.<init> ()V
      // 3b60: bipush 5
      // 3b61: aload 8
      // 3b63: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$96.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 3b66: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3b69: astore 13
      // 3b6b: aload 13
      // 3b6d: bipush 10
      // 3b6f: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3b72: aload 12
      // 3b74: aload 13
      // 3b76: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3b79: pop
      // 3b7a: aload 1
      // 3b7b: instanceof net/minecraft/server/level/ServerLevel
      // 3b7e: ifeq 3bb4
      // 3b81: aload 1
      // 3b82: checkcast net/minecraft/server/level/ServerLevel
      // 3b85: astore 12
      // 3b87: new net/minecraft/world/entity/item/ItemEntity
      // 3b8a: dup
      // 3b8b: aload 12
      // 3b8d: dload 2
      // 3b8e: dload 4
      // 3b90: dload 6
      // 3b92: new net/mocreatures/procedures/PetAmuletCapture2Procedure$97
      // 3b95: dup
      // 3b96: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$97.<init> ()V
      // 3b99: bipush 6
      // 3b9b: aload 8
      // 3b9d: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$97.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 3ba0: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3ba3: astore 13
      // 3ba5: aload 13
      // 3ba7: bipush 10
      // 3ba9: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3bac: aload 12
      // 3bae: aload 13
      // 3bb0: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3bb3: pop
      // 3bb4: aload 1
      // 3bb5: instanceof net/minecraft/server/level/ServerLevel
      // 3bb8: ifeq 3bee
      // 3bbb: aload 1
      // 3bbc: checkcast net/minecraft/server/level/ServerLevel
      // 3bbf: astore 12
      // 3bc1: new net/minecraft/world/entity/item/ItemEntity
      // 3bc4: dup
      // 3bc5: aload 12
      // 3bc7: dload 2
      // 3bc8: dload 4
      // 3bca: dload 6
      // 3bcc: new net/mocreatures/procedures/PetAmuletCapture2Procedure$98
      // 3bcf: dup
      // 3bd0: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$98.<init> ()V
      // 3bd3: bipush 7
      // 3bd5: aload 8
      // 3bd7: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$98.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 3bda: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3bdd: astore 13
      // 3bdf: aload 13
      // 3be1: bipush 10
      // 3be3: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3be6: aload 12
      // 3be8: aload 13
      // 3bea: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3bed: pop
      // 3bee: aload 1
      // 3bef: instanceof net/minecraft/server/level/ServerLevel
      // 3bf2: ifeq 3c28
      // 3bf5: aload 1
      // 3bf6: checkcast net/minecraft/server/level/ServerLevel
      // 3bf9: astore 12
      // 3bfb: new net/minecraft/world/entity/item/ItemEntity
      // 3bfe: dup
      // 3bff: aload 12
      // 3c01: dload 2
      // 3c02: dload 4
      // 3c04: dload 6
      // 3c06: new net/mocreatures/procedures/PetAmuletCapture2Procedure$99
      // 3c09: dup
      // 3c0a: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$99.<init> ()V
      // 3c0d: bipush 8
      // 3c0f: aload 8
      // 3c11: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$99.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 3c14: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3c17: astore 13
      // 3c19: aload 13
      // 3c1b: bipush 10
      // 3c1d: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3c20: aload 12
      // 3c22: aload 13
      // 3c24: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3c27: pop
      // 3c28: aload 1
      // 3c29: instanceof net/minecraft/server/level/ServerLevel
      // 3c2c: ifeq 3c62
      // 3c2f: aload 1
      // 3c30: checkcast net/minecraft/server/level/ServerLevel
      // 3c33: astore 12
      // 3c35: new net/minecraft/world/entity/item/ItemEntity
      // 3c38: dup
      // 3c39: aload 12
      // 3c3b: dload 2
      // 3c3c: dload 4
      // 3c3e: dload 6
      // 3c40: new net/mocreatures/procedures/PetAmuletCapture2Procedure$100
      // 3c43: dup
      // 3c44: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$100.<init> ()V
      // 3c47: bipush 9
      // 3c49: aload 8
      // 3c4b: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$100.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 3c4e: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3c51: astore 13
      // 3c53: aload 13
      // 3c55: bipush 10
      // 3c57: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3c5a: aload 12
      // 3c5c: aload 13
      // 3c5e: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3c61: pop
      // 3c62: aload 1
      // 3c63: instanceof net/minecraft/server/level/ServerLevel
      // 3c66: ifeq 3c9c
      // 3c69: aload 1
      // 3c6a: checkcast net/minecraft/server/level/ServerLevel
      // 3c6d: astore 12
      // 3c6f: new net/minecraft/world/entity/item/ItemEntity
      // 3c72: dup
      // 3c73: aload 12
      // 3c75: dload 2
      // 3c76: dload 4
      // 3c78: dload 6
      // 3c7a: new net/mocreatures/procedures/PetAmuletCapture2Procedure$101
      // 3c7d: dup
      // 3c7e: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$101.<init> ()V
      // 3c81: bipush 10
      // 3c83: aload 8
      // 3c85: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$101.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 3c88: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3c8b: astore 13
      // 3c8d: aload 13
      // 3c8f: bipush 10
      // 3c91: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3c94: aload 12
      // 3c96: aload 13
      // 3c98: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3c9b: pop
      // 3c9c: aload 1
      // 3c9d: instanceof net/minecraft/server/level/ServerLevel
      // 3ca0: ifeq 3cd6
      // 3ca3: aload 1
      // 3ca4: checkcast net/minecraft/server/level/ServerLevel
      // 3ca7: astore 12
      // 3ca9: new net/minecraft/world/entity/item/ItemEntity
      // 3cac: dup
      // 3cad: aload 12
      // 3caf: dload 2
      // 3cb0: dload 4
      // 3cb2: dload 6
      // 3cb4: new net/mocreatures/procedures/PetAmuletCapture2Procedure$102
      // 3cb7: dup
      // 3cb8: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$102.<init> ()V
      // 3cbb: bipush 11
      // 3cbd: aload 8
      // 3cbf: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$102.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 3cc2: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3cc5: astore 13
      // 3cc7: aload 13
      // 3cc9: bipush 10
      // 3ccb: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3cce: aload 12
      // 3cd0: aload 13
      // 3cd2: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3cd5: pop
      // 3cd6: aload 1
      // 3cd7: instanceof net/minecraft/server/level/ServerLevel
      // 3cda: ifeq 3d10
      // 3cdd: aload 1
      // 3cde: checkcast net/minecraft/server/level/ServerLevel
      // 3ce1: astore 12
      // 3ce3: new net/minecraft/world/entity/item/ItemEntity
      // 3ce6: dup
      // 3ce7: aload 12
      // 3ce9: dload 2
      // 3cea: dload 4
      // 3cec: dload 6
      // 3cee: new net/mocreatures/procedures/PetAmuletCapture2Procedure$103
      // 3cf1: dup
      // 3cf2: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$103.<init> ()V
      // 3cf5: bipush 12
      // 3cf7: aload 8
      // 3cf9: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$103.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 3cfc: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3cff: astore 13
      // 3d01: aload 13
      // 3d03: bipush 10
      // 3d05: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3d08: aload 12
      // 3d0a: aload 13
      // 3d0c: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3d0f: pop
      // 3d10: aload 1
      // 3d11: instanceof net/minecraft/server/level/ServerLevel
      // 3d14: ifeq 3d4a
      // 3d17: aload 1
      // 3d18: checkcast net/minecraft/server/level/ServerLevel
      // 3d1b: astore 12
      // 3d1d: new net/minecraft/world/entity/item/ItemEntity
      // 3d20: dup
      // 3d21: aload 12
      // 3d23: dload 2
      // 3d24: dload 4
      // 3d26: dload 6
      // 3d28: new net/mocreatures/procedures/PetAmuletCapture2Procedure$104
      // 3d2b: dup
      // 3d2c: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$104.<init> ()V
      // 3d2f: bipush 13
      // 3d31: aload 8
      // 3d33: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$104.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 3d36: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3d39: astore 13
      // 3d3b: aload 13
      // 3d3d: bipush 10
      // 3d3f: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3d42: aload 12
      // 3d44: aload 13
      // 3d46: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3d49: pop
      // 3d4a: aload 1
      // 3d4b: instanceof net/minecraft/server/level/ServerLevel
      // 3d4e: ifeq 3d84
      // 3d51: aload 1
      // 3d52: checkcast net/minecraft/server/level/ServerLevel
      // 3d55: astore 12
      // 3d57: new net/minecraft/world/entity/item/ItemEntity
      // 3d5a: dup
      // 3d5b: aload 12
      // 3d5d: dload 2
      // 3d5e: dload 4
      // 3d60: dload 6
      // 3d62: new net/mocreatures/procedures/PetAmuletCapture2Procedure$105
      // 3d65: dup
      // 3d66: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$105.<init> ()V
      // 3d69: bipush 14
      // 3d6b: aload 8
      // 3d6d: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$105.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 3d70: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3d73: astore 13
      // 3d75: aload 13
      // 3d77: bipush 10
      // 3d79: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3d7c: aload 12
      // 3d7e: aload 13
      // 3d80: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3d83: pop
      // 3d84: aload 1
      // 3d85: instanceof net/minecraft/server/level/ServerLevel
      // 3d88: ifeq 3dbe
      // 3d8b: aload 1
      // 3d8c: checkcast net/minecraft/server/level/ServerLevel
      // 3d8f: astore 12
      // 3d91: new net/minecraft/world/entity/item/ItemEntity
      // 3d94: dup
      // 3d95: aload 12
      // 3d97: dload 2
      // 3d98: dload 4
      // 3d9a: dload 6
      // 3d9c: new net/mocreatures/procedures/PetAmuletCapture2Procedure$106
      // 3d9f: dup
      // 3da0: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$106.<init> ()V
      // 3da3: bipush 15
      // 3da5: aload 8
      // 3da7: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$106.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 3daa: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3dad: astore 13
      // 3daf: aload 13
      // 3db1: bipush 10
      // 3db3: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3db6: aload 12
      // 3db8: aload 13
      // 3dba: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3dbd: pop
      // 3dbe: aload 1
      // 3dbf: instanceof net/minecraft/server/level/ServerLevel
      // 3dc2: ifeq 3df8
      // 3dc5: aload 1
      // 3dc6: checkcast net/minecraft/server/level/ServerLevel
      // 3dc9: astore 12
      // 3dcb: new net/minecraft/world/entity/item/ItemEntity
      // 3dce: dup
      // 3dcf: aload 12
      // 3dd1: dload 2
      // 3dd2: dload 4
      // 3dd4: dload 6
      // 3dd6: new net/mocreatures/procedures/PetAmuletCapture2Procedure$107
      // 3dd9: dup
      // 3dda: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$107.<init> ()V
      // 3ddd: bipush 16
      // 3ddf: aload 8
      // 3de1: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$107.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 3de4: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3de7: astore 13
      // 3de9: aload 13
      // 3deb: bipush 10
      // 3ded: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3df0: aload 12
      // 3df2: aload 13
      // 3df4: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3df7: pop
      // 3df8: aload 1
      // 3df9: instanceof net/minecraft/server/level/ServerLevel
      // 3dfc: ifeq 3e32
      // 3dff: aload 1
      // 3e00: checkcast net/minecraft/server/level/ServerLevel
      // 3e03: astore 12
      // 3e05: new net/minecraft/world/entity/item/ItemEntity
      // 3e08: dup
      // 3e09: aload 12
      // 3e0b: dload 2
      // 3e0c: dload 4
      // 3e0e: dload 6
      // 3e10: new net/mocreatures/procedures/PetAmuletCapture2Procedure$108
      // 3e13: dup
      // 3e14: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$108.<init> ()V
      // 3e17: bipush 17
      // 3e19: aload 8
      // 3e1b: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$108.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 3e1e: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 3e21: astore 13
      // 3e23: aload 13
      // 3e25: bipush 10
      // 3e27: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 3e2a: aload 12
      // 3e2c: aload 13
      // 3e2e: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 3e31: pop
      // 3e32: aload 8
      // 3e34: invokevirtual net/minecraft/world/entity/Entity.level ()Lnet/minecraft/world/level/Level;
      // 3e37: invokevirtual net/minecraft/world/level/Level.isClientSide ()Z
      // 3e3a: ifne 3e42
      // 3e3d: aload 8
      // 3e3f: invokevirtual net/minecraft/world/entity/Entity.discard ()V
      // 3e42: aload 9
      // 3e44: instanceof net/minecraft/world/entity/LivingEntity
      // 3e47: ifeq 3e59
      // 3e4a: aload 9
      // 3e4c: checkcast net/minecraft/world/entity/LivingEntity
      // 3e4f: astore 11
      // 3e51: aload 11
      // 3e53: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 3e56: goto 3e5c
      // 3e59: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 3e5c: ldc_w "mocreatures:amulet/empty"
      // 3e5f: invokestatic net/minecraft/resources/ResourceLocation.parse (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
      // 3e62: invokestatic net/minecraft/tags/ItemTags.create (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
      // 3e65: invokevirtual net/minecraft/world/item/ItemStack.is (Lnet/minecraft/tags/TagKey;)Z
      // 3e68: ifeq 488a
      // 3e6b: aload 8
      // 3e6d: invokevirtual net/minecraft/world/entity/Entity.getType ()Lnet/minecraft/world/entity/EntityType;
      // 3e70: getstatic net/minecraft/core/registries/Registries.ENTITY_TYPE Lnet/minecraft/resources/ResourceKey;
      // 3e73: ldc_w "mocreatures:panthard"
      // 3e76: invokestatic net/minecraft/resources/ResourceLocation.parse (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
      // 3e79: invokestatic net/minecraft/tags/TagKey.create (Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
      // 3e7c: invokevirtual net/minecraft/world/entity/EntityType.is (Lnet/minecraft/tags/TagKey;)Z
      // 3e7f: ifeq 488a
      // 3e82: aload 8
      // 3e84: instanceof net/minecraft/world/entity/TamableAnimal
      // 3e87: ifeq 3eea
      // 3e8a: aload 8
      // 3e8c: checkcast net/minecraft/world/entity/TamableAnimal
      // 3e8f: astore 12
      // 3e91: aload 12
      // 3e93: invokevirtual net/minecraft/world/entity/TamableAnimal.isTame ()Z
      // 3e96: ifeq 3eea
      // 3e99: aload 8
      // 3e9b: instanceof net/mocreatures/entity/PanthardEntity
      // 3e9e: ifeq 3ec0
      // 3ea1: aload 8
      // 3ea3: checkcast net/mocreatures/entity/PanthardEntity
      // 3ea6: astore 13
      // 3ea8: aload 13
      // 3eaa: invokevirtual net/mocreatures/entity/PanthardEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 3ead: getstatic net/mocreatures/entity/PanthardEntity.DATA_Baby Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 3eb0: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 3eb3: checkcast java/lang/Boolean
      // 3eb6: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3eb9: ifeq 3ec0
      // 3ebc: bipush 1
      // 3ebd: goto 3ec1
      // 3ec0: bipush 0
      // 3ec1: ifne 3eea
      // 3ec4: aload 8
      // 3ec6: instanceof net/minecraft/world/entity/TamableAnimal
      // 3ec9: ifeq 3edb
      // 3ecc: aload 8
      // 3ece: checkcast net/minecraft/world/entity/TamableAnimal
      // 3ed1: astore 14
      // 3ed3: aload 14
      // 3ed5: invokevirtual net/minecraft/world/entity/TamableAnimal.getOwner ()Lnet/minecraft/world/entity/LivingEntity;
      // 3ed8: goto 3edc
      // 3edb: aconst_null
      // 3edc: aload 9
      // 3ede: if_acmpne 3ee7
      // 3ee1: bipush 1
      // 3ee2: istore 10
      // 3ee4: goto 3eea
      // 3ee7: bipush 0
      // 3ee8: istore 10
      // 3eea: iload 10
      // 3eec: ifeq 488a
      // 3eef: aload 9
      // 3ef1: instanceof net/minecraft/world/entity/LivingEntity
      // 3ef4: ifeq 3f3a
      // 3ef7: aload 9
      // 3ef9: checkcast net/minecraft/world/entity/LivingEntity
      // 3efc: astore 12
      // 3efe: new net/minecraft/world/item/ItemStack
      // 3f01: dup
      // 3f02: getstatic net/mocreatures/init/MocreaturesModItems.PET_AMULET_FULL Lnet/neoforged/neoforge/registries/DeferredItem;
      // 3f05: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 3f08: checkcast net/minecraft/world/level/ItemLike
      // 3f0b: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 3f0e: invokevirtual net/minecraft/world/item/ItemStack.copy ()Lnet/minecraft/world/item/ItemStack;
      // 3f11: astore 13
      // 3f13: aload 13
      // 3f15: bipush 1
      // 3f16: invokevirtual net/minecraft/world/item/ItemStack.setCount (I)V
      // 3f19: aload 12
      // 3f1b: getstatic net/minecraft/world/InteractionHand.MAIN_HAND Lnet/minecraft/world/InteractionHand;
      // 3f1e: aload 13
      // 3f20: invokevirtual net/minecraft/world/entity/LivingEntity.setItemInHand (Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/item/ItemStack;)V
      // 3f23: aload 12
      // 3f25: instanceof net/minecraft/world/entity/player/Player
      // 3f28: ifeq 3f3a
      // 3f2b: aload 12
      // 3f2d: checkcast net/minecraft/world/entity/player/Player
      // 3f30: astore 14
      // 3f32: aload 14
      // 3f34: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 3f37: invokevirtual net/minecraft/world/entity/player/Inventory.setChanged ()V
      // 3f3a: ldc_w "Mob"
      // 3f3d: astore 12
      // 3f3f: ldc_w "mocreatures:panthard"
      // 3f42: astore 13
      // 3f44: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 3f47: aload 9
      // 3f49: instanceof net/minecraft/world/entity/LivingEntity
      // 3f4c: ifeq 3f5e
      // 3f4f: aload 9
      // 3f51: checkcast net/minecraft/world/entity/LivingEntity
      // 3f54: astore 14
      // 3f56: aload 14
      // 3f58: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 3f5b: goto 3f61
      // 3f5e: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 3f61: invokedynamic accept ()Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$99 (Lnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 3f66: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 3f69: ldc_w "Name"
      // 3f6c: astore 12
      // 3f6e: aload 8
      // 3f70: invokevirtual net/minecraft/world/entity/Entity.getDisplayName ()Lnet/minecraft/network/chat/Component;
      // 3f73: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 3f78: astore 13
      // 3f7a: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 3f7d: aload 9
      // 3f7f: instanceof net/minecraft/world/entity/LivingEntity
      // 3f82: ifeq 3f94
      // 3f85: aload 9
      // 3f87: checkcast net/minecraft/world/entity/LivingEntity
      // 3f8a: astore 14
      // 3f8c: aload 14
      // 3f8e: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 3f91: goto 3f97
      // 3f94: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 3f97: aload 13
      // 3f99: invokedynamic accept (Ljava/lang/String;)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$100 (Ljava/lang/String;Lnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 3f9e: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 3fa1: aload 8
      // 3fa3: instanceof net/minecraft/world/entity/TamableAnimal
      // 3fa6: ifeq 3ff0
      // 3fa9: aload 8
      // 3fab: checkcast net/minecraft/world/entity/TamableAnimal
      // 3fae: astore 12
      // 3fb0: aload 12
      // 3fb2: invokevirtual net/minecraft/world/entity/TamableAnimal.isTame ()Z
      // 3fb5: ifeq 3ff0
      // 3fb8: ldc_w "Owner"
      // 3fbb: astore 13
      // 3fbd: aload 9
      // 3fbf: invokevirtual net/minecraft/world/entity/Entity.getDisplayName ()Lnet/minecraft/network/chat/Component;
      // 3fc2: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 3fc7: astore 14
      // 3fc9: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 3fcc: aload 9
      // 3fce: instanceof net/minecraft/world/entity/LivingEntity
      // 3fd1: ifeq 3fe3
      // 3fd4: aload 9
      // 3fd6: checkcast net/minecraft/world/entity/LivingEntity
      // 3fd9: astore 15
      // 3fdb: aload 15
      // 3fdd: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 3fe0: goto 3fe6
      // 3fe3: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 3fe6: aload 14
      // 3fe8: invokedynamic accept (Ljava/lang/String;)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$101 (Ljava/lang/String;Lnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 3fed: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 3ff0: ldc_w "Leashed"
      // 3ff3: astore 12
      // 3ff5: aload 8
      // 3ff7: instanceof net/minecraft/world/entity/Mob
      // 3ffa: ifeq 400c
      // 3ffd: aload 8
      // 3fff: checkcast net/minecraft/world/entity/Mob
      // 4002: astore 14
      // 4004: aload 14
      // 4006: invokevirtual net/minecraft/world/entity/Mob.isLeashed ()Z
      // 4009: goto 400d
      // 400c: bipush 0
      // 400d: istore 13
      // 400f: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 4012: aload 9
      // 4014: instanceof net/minecraft/world/entity/LivingEntity
      // 4017: ifeq 4029
      // 401a: aload 9
      // 401c: checkcast net/minecraft/world/entity/LivingEntity
      // 401f: astore 14
      // 4021: aload 14
      // 4023: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 4026: goto 402c
      // 4029: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 402c: iload 13
      // 402e: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$102 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 4033: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 4036: ldc_w "NoGravity"
      // 4039: astore 12
      // 403b: aload 8
      // 403d: invokevirtual net/minecraft/world/entity/Entity.isNoGravity ()Z
      // 4040: istore 13
      // 4042: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 4045: aload 9
      // 4047: instanceof net/minecraft/world/entity/LivingEntity
      // 404a: ifeq 405c
      // 404d: aload 9
      // 404f: checkcast net/minecraft/world/entity/LivingEntity
      // 4052: astore 14
      // 4054: aload 14
      // 4056: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 4059: goto 405f
      // 405c: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 405f: iload 13
      // 4061: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$103 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 4066: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 4069: ldc_w "MaxHealth"
      // 406c: astore 12
      // 406e: aload 8
      // 4070: instanceof net/minecraft/world/entity/LivingEntity
      // 4073: ifeq 4086
      // 4076: aload 8
      // 4078: checkcast net/minecraft/world/entity/LivingEntity
      // 407b: astore 15
      // 407d: aload 15
      // 407f: invokevirtual net/minecraft/world/entity/LivingEntity.getMaxHealth ()F
      // 4082: f2d
      // 4083: goto 4089
      // 4086: ldc2_w -1.0
      // 4089: dstore 13
      // 408b: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 408e: aload 9
      // 4090: instanceof net/minecraft/world/entity/LivingEntity
      // 4093: ifeq 40a5
      // 4096: aload 9
      // 4098: checkcast net/minecraft/world/entity/LivingEntity
      // 409b: astore 15
      // 409d: aload 15
      // 409f: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 40a2: goto 40a8
      // 40a5: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 40a8: dload 13
      // 40aa: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$104 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 40af: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 40b2: ldc_w "Health"
      // 40b5: astore 12
      // 40b7: aload 8
      // 40b9: instanceof net/minecraft/world/entity/LivingEntity
      // 40bc: ifeq 40cf
      // 40bf: aload 8
      // 40c1: checkcast net/minecraft/world/entity/LivingEntity
      // 40c4: astore 15
      // 40c6: aload 15
      // 40c8: invokevirtual net/minecraft/world/entity/LivingEntity.getHealth ()F
      // 40cb: f2d
      // 40cc: goto 40d2
      // 40cf: ldc2_w -1.0
      // 40d2: dstore 13
      // 40d4: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 40d7: aload 9
      // 40d9: instanceof net/minecraft/world/entity/LivingEntity
      // 40dc: ifeq 40ee
      // 40df: aload 9
      // 40e1: checkcast net/minecraft/world/entity/LivingEntity
      // 40e4: astore 15
      // 40e6: aload 15
      // 40e8: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 40eb: goto 40f1
      // 40ee: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 40f1: dload 13
      // 40f3: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$105 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 40f8: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 40fb: ldc_w "Air"
      // 40fe: astore 12
      // 4100: aload 8
      // 4102: invokevirtual net/minecraft/world/entity/Entity.getAirSupply ()I
      // 4105: i2d
      // 4106: dstore 13
      // 4108: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 410b: aload 9
      // 410d: instanceof net/minecraft/world/entity/LivingEntity
      // 4110: ifeq 4122
      // 4113: aload 9
      // 4115: checkcast net/minecraft/world/entity/LivingEntity
      // 4118: astore 15
      // 411a: aload 15
      // 411c: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 411f: goto 4125
      // 4122: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 4125: dload 13
      // 4127: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$106 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 412c: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 412f: ldc_w "MotionX"
      // 4132: astore 12
      // 4134: aload 8
      // 4136: invokevirtual net/minecraft/world/entity/Entity.getDeltaMovement ()Lnet/minecraft/world/phys/Vec3;
      // 4139: invokevirtual net/minecraft/world/phys/Vec3.x ()D
      // 413c: dstore 13
      // 413e: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 4141: aload 9
      // 4143: instanceof net/minecraft/world/entity/LivingEntity
      // 4146: ifeq 4158
      // 4149: aload 9
      // 414b: checkcast net/minecraft/world/entity/LivingEntity
      // 414e: astore 15
      // 4150: aload 15
      // 4152: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 4155: goto 415b
      // 4158: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 415b: dload 13
      // 415d: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$107 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 4162: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 4165: ldc_w "MotionY"
      // 4168: astore 12
      // 416a: aload 8
      // 416c: invokevirtual net/minecraft/world/entity/Entity.getDeltaMovement ()Lnet/minecraft/world/phys/Vec3;
      // 416f: invokevirtual net/minecraft/world/phys/Vec3.y ()D
      // 4172: dstore 13
      // 4174: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 4177: aload 9
      // 4179: instanceof net/minecraft/world/entity/LivingEntity
      // 417c: ifeq 418e
      // 417f: aload 9
      // 4181: checkcast net/minecraft/world/entity/LivingEntity
      // 4184: astore 15
      // 4186: aload 15
      // 4188: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 418b: goto 4191
      // 418e: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 4191: dload 13
      // 4193: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$108 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 4198: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 419b: ldc_w "MotionZ"
      // 419e: astore 12
      // 41a0: aload 8
      // 41a2: invokevirtual net/minecraft/world/entity/Entity.getDeltaMovement ()Lnet/minecraft/world/phys/Vec3;
      // 41a5: invokevirtual net/minecraft/world/phys/Vec3.z ()D
      // 41a8: dstore 13
      // 41aa: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 41ad: aload 9
      // 41af: instanceof net/minecraft/world/entity/LivingEntity
      // 41b2: ifeq 41c4
      // 41b5: aload 9
      // 41b7: checkcast net/minecraft/world/entity/LivingEntity
      // 41ba: astore 15
      // 41bc: aload 15
      // 41be: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 41c1: goto 41c7
      // 41c4: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 41c7: dload 13
      // 41c9: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$109 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 41ce: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 41d1: ldc_w "RotationYaw"
      // 41d4: astore 12
      // 41d6: aload 8
      // 41d8: invokevirtual net/minecraft/world/entity/Entity.getYRot ()F
      // 41db: f2d
      // 41dc: dstore 13
      // 41de: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 41e1: aload 9
      // 41e3: instanceof net/minecraft/world/entity/LivingEntity
      // 41e6: ifeq 41f8
      // 41e9: aload 9
      // 41eb: checkcast net/minecraft/world/entity/LivingEntity
      // 41ee: astore 15
      // 41f0: aload 15
      // 41f2: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 41f5: goto 41fb
      // 41f8: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 41fb: dload 13
      // 41fd: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$110 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 4202: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 4205: ldc_w "RotationPitch"
      // 4208: astore 12
      // 420a: aload 8
      // 420c: invokevirtual net/minecraft/world/entity/Entity.getXRot ()F
      // 420f: f2d
      // 4210: dstore 13
      // 4212: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 4215: aload 9
      // 4217: instanceof net/minecraft/world/entity/LivingEntity
      // 421a: ifeq 422c
      // 421d: aload 9
      // 421f: checkcast net/minecraft/world/entity/LivingEntity
      // 4222: astore 15
      // 4224: aload 15
      // 4226: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 4229: goto 422f
      // 422c: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 422f: dload 13
      // 4231: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$111 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 4236: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 4239: ldc_w "Gender"
      // 423c: astore 12
      // 423e: aload 8
      // 4240: instanceof net/mocreatures/entity/PanthardEntity
      // 4243: ifeq 4262
      // 4246: aload 8
      // 4248: checkcast net/mocreatures/entity/PanthardEntity
      // 424b: astore 15
      // 424d: aload 15
      // 424f: invokevirtual net/mocreatures/entity/PanthardEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4252: getstatic net/mocreatures/entity/PanthardEntity.DATA_Gender Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4255: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 4258: checkcast java/lang/Integer
      // 425b: invokevirtual java/lang/Integer.intValue ()I
      // 425e: i2d
      // 425f: goto 4263
      // 4262: dconst_0
      // 4263: dstore 13
      // 4265: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 4268: aload 9
      // 426a: instanceof net/minecraft/world/entity/LivingEntity
      // 426d: ifeq 427f
      // 4270: aload 9
      // 4272: checkcast net/minecraft/world/entity/LivingEntity
      // 4275: astore 15
      // 4277: aload 15
      // 4279: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 427c: goto 4282
      // 427f: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 4282: dload 13
      // 4284: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$112 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 4289: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 428c: ldc_w "Color"
      // 428f: astore 12
      // 4291: aload 8
      // 4293: instanceof net/mocreatures/entity/PanthardEntity
      // 4296: ifeq 42b5
      // 4299: aload 8
      // 429b: checkcast net/mocreatures/entity/PanthardEntity
      // 429e: astore 15
      // 42a0: aload 15
      // 42a2: invokevirtual net/mocreatures/entity/PanthardEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 42a5: getstatic net/mocreatures/entity/PanthardEntity.DATA_Color Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 42a8: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 42ab: checkcast java/lang/Integer
      // 42ae: invokevirtual java/lang/Integer.intValue ()I
      // 42b1: i2d
      // 42b2: goto 42b6
      // 42b5: dconst_0
      // 42b6: dstore 13
      // 42b8: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 42bb: aload 9
      // 42bd: instanceof net/minecraft/world/entity/LivingEntity
      // 42c0: ifeq 42d2
      // 42c3: aload 9
      // 42c5: checkcast net/minecraft/world/entity/LivingEntity
      // 42c8: astore 15
      // 42ca: aload 15
      // 42cc: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 42cf: goto 42d5
      // 42d2: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 42d5: dload 13
      // 42d7: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$113 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 42dc: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 42df: ldc_w "Wings"
      // 42e2: astore 12
      // 42e4: aload 8
      // 42e6: instanceof net/mocreatures/entity/PanthardEntity
      // 42e9: ifeq 430b
      // 42ec: aload 8
      // 42ee: checkcast net/mocreatures/entity/PanthardEntity
      // 42f1: astore 14
      // 42f3: aload 14
      // 42f5: invokevirtual net/mocreatures/entity/PanthardEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 42f8: getstatic net/mocreatures/entity/PanthardEntity.DATA_Wings Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 42fb: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 42fe: checkcast java/lang/Boolean
      // 4301: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4304: ifeq 430b
      // 4307: bipush 1
      // 4308: goto 430c
      // 430b: bipush 0
      // 430c: istore 13
      // 430e: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 4311: aload 9
      // 4313: instanceof net/minecraft/world/entity/LivingEntity
      // 4316: ifeq 4328
      // 4319: aload 9
      // 431b: checkcast net/minecraft/world/entity/LivingEntity
      // 431e: astore 14
      // 4320: aload 14
      // 4322: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 4325: goto 432b
      // 4328: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 432b: iload 13
      // 432d: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$114 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 4332: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 4335: ldc_w "Medallion"
      // 4338: astore 12
      // 433a: aload 8
      // 433c: instanceof net/mocreatures/entity/PanthardEntity
      // 433f: ifeq 4361
      // 4342: aload 8
      // 4344: checkcast net/mocreatures/entity/PanthardEntity
      // 4347: astore 14
      // 4349: aload 14
      // 434b: invokevirtual net/mocreatures/entity/PanthardEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 434e: getstatic net/mocreatures/entity/PanthardEntity.DATA_Medallion Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4351: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 4354: checkcast java/lang/Boolean
      // 4357: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 435a: ifeq 4361
      // 435d: bipush 1
      // 435e: goto 4362
      // 4361: bipush 0
      // 4362: istore 13
      // 4364: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 4367: aload 9
      // 4369: instanceof net/minecraft/world/entity/LivingEntity
      // 436c: ifeq 437e
      // 436f: aload 9
      // 4371: checkcast net/minecraft/world/entity/LivingEntity
      // 4374: astore 14
      // 4376: aload 14
      // 4378: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 437b: goto 4381
      // 437e: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 4381: iload 13
      // 4383: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$115 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 4388: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 438b: aload 8
      // 438d: invokevirtual net/minecraft/world/entity/Entity.getType ()Lnet/minecraft/world/entity/EntityType;
      // 4390: getstatic net/minecraft/core/registries/Registries.ENTITY_TYPE Lnet/minecraft/resources/ResourceKey;
      // 4393: ldc_w "mocreatures:panthard"
      // 4396: invokestatic net/minecraft/resources/ResourceLocation.parse (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
      // 4399: invokestatic net/minecraft/tags/TagKey.create (Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
      // 439c: invokevirtual net/minecraft/world/entity/EntityType.is (Lnet/minecraft/tags/TagKey;)Z
      // 439f: ifeq 488a
      // 43a2: aload 8
      // 43a4: instanceof net/mocreatures/entity/PanthardEntity
      // 43a7: ifeq 43c9
      // 43aa: aload 8
      // 43ac: checkcast net/mocreatures/entity/PanthardEntity
      // 43af: astore 12
      // 43b1: aload 12
      // 43b3: invokevirtual net/mocreatures/entity/PanthardEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 43b6: getstatic net/mocreatures/entity/PanthardEntity.DATA_Saddle Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 43b9: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 43bc: checkcast java/lang/Boolean
      // 43bf: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 43c2: ifeq 43c9
      // 43c5: bipush 1
      // 43c6: goto 43ca
      // 43c9: bipush 0
      // 43ca: bipush 1
      // 43cb: if_icmpne 440a
      // 43ce: aload 1
      // 43cf: instanceof net/minecraft/server/level/ServerLevel
      // 43d2: ifeq 440a
      // 43d5: aload 1
      // 43d6: checkcast net/minecraft/server/level/ServerLevel
      // 43d9: astore 13
      // 43db: new net/minecraft/world/entity/item/ItemEntity
      // 43de: dup
      // 43df: aload 13
      // 43e1: dload 2
      // 43e2: dload 4
      // 43e4: dload 6
      // 43e6: new net/minecraft/world/item/ItemStack
      // 43e9: dup
      // 43ea: getstatic net/mocreatures/init/MocreaturesModItems.CRAFTED_SADDLE Lnet/neoforged/neoforge/registries/DeferredItem;
      // 43ed: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 43f0: checkcast net/minecraft/world/level/ItemLike
      // 43f3: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 43f6: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 43f9: astore 14
      // 43fb: aload 14
      // 43fd: bipush 10
      // 43ff: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4402: aload 13
      // 4404: aload 14
      // 4406: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4409: pop
      // 440a: aload 8
      // 440c: instanceof net/mocreatures/entity/PanthardEntity
      // 440f: ifeq 4431
      // 4412: aload 8
      // 4414: checkcast net/mocreatures/entity/PanthardEntity
      // 4417: astore 12
      // 4419: aload 12
      // 441b: invokevirtual net/mocreatures/entity/PanthardEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 441e: getstatic net/mocreatures/entity/PanthardEntity.DATA_Chest Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4421: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 4424: checkcast java/lang/Boolean
      // 4427: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 442a: ifeq 4431
      // 442d: bipush 1
      // 442e: goto 4432
      // 4431: bipush 0
      // 4432: bipush 1
      // 4433: if_icmpne 446c
      // 4436: aload 1
      // 4437: instanceof net/minecraft/server/level/ServerLevel
      // 443a: ifeq 446c
      // 443d: aload 1
      // 443e: checkcast net/minecraft/server/level/ServerLevel
      // 4441: astore 13
      // 4443: new net/minecraft/world/entity/item/ItemEntity
      // 4446: dup
      // 4447: aload 13
      // 4449: dload 2
      // 444a: dload 4
      // 444c: dload 6
      // 444e: new net/minecraft/world/item/ItemStack
      // 4451: dup
      // 4452: getstatic net/minecraft/world/level/block/Blocks.CHEST Lnet/minecraft/world/level/block/Block;
      // 4455: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 4458: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 445b: astore 14
      // 445d: aload 14
      // 445f: bipush 10
      // 4461: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4464: aload 13
      // 4466: aload 14
      // 4468: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 446b: pop
      // 446c: aload 1
      // 446d: instanceof net/minecraft/server/level/ServerLevel
      // 4470: ifeq 44a5
      // 4473: aload 1
      // 4474: checkcast net/minecraft/server/level/ServerLevel
      // 4477: astore 12
      // 4479: new net/minecraft/world/entity/item/ItemEntity
      // 447c: dup
      // 447d: aload 12
      // 447f: dload 2
      // 4480: dload 4
      // 4482: dload 6
      // 4484: new net/mocreatures/procedures/PetAmuletCapture2Procedure$109
      // 4487: dup
      // 4488: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$109.<init> ()V
      // 448b: bipush 0
      // 448c: aload 8
      // 448e: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$109.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 4491: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4494: astore 13
      // 4496: aload 13
      // 4498: bipush 10
      // 449a: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 449d: aload 12
      // 449f: aload 13
      // 44a1: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 44a4: pop
      // 44a5: aload 1
      // 44a6: instanceof net/minecraft/server/level/ServerLevel
      // 44a9: ifeq 44de
      // 44ac: aload 1
      // 44ad: checkcast net/minecraft/server/level/ServerLevel
      // 44b0: astore 12
      // 44b2: new net/minecraft/world/entity/item/ItemEntity
      // 44b5: dup
      // 44b6: aload 12
      // 44b8: dload 2
      // 44b9: dload 4
      // 44bb: dload 6
      // 44bd: new net/mocreatures/procedures/PetAmuletCapture2Procedure$110
      // 44c0: dup
      // 44c1: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$110.<init> ()V
      // 44c4: bipush 1
      // 44c5: aload 8
      // 44c7: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$110.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 44ca: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 44cd: astore 13
      // 44cf: aload 13
      // 44d1: bipush 10
      // 44d3: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 44d6: aload 12
      // 44d8: aload 13
      // 44da: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 44dd: pop
      // 44de: aload 1
      // 44df: instanceof net/minecraft/server/level/ServerLevel
      // 44e2: ifeq 4517
      // 44e5: aload 1
      // 44e6: checkcast net/minecraft/server/level/ServerLevel
      // 44e9: astore 12
      // 44eb: new net/minecraft/world/entity/item/ItemEntity
      // 44ee: dup
      // 44ef: aload 12
      // 44f1: dload 2
      // 44f2: dload 4
      // 44f4: dload 6
      // 44f6: new net/mocreatures/procedures/PetAmuletCapture2Procedure$111
      // 44f9: dup
      // 44fa: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$111.<init> ()V
      // 44fd: bipush 2
      // 44fe: aload 8
      // 4500: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$111.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 4503: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4506: astore 13
      // 4508: aload 13
      // 450a: bipush 10
      // 450c: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 450f: aload 12
      // 4511: aload 13
      // 4513: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4516: pop
      // 4517: aload 1
      // 4518: instanceof net/minecraft/server/level/ServerLevel
      // 451b: ifeq 4550
      // 451e: aload 1
      // 451f: checkcast net/minecraft/server/level/ServerLevel
      // 4522: astore 12
      // 4524: new net/minecraft/world/entity/item/ItemEntity
      // 4527: dup
      // 4528: aload 12
      // 452a: dload 2
      // 452b: dload 4
      // 452d: dload 6
      // 452f: new net/mocreatures/procedures/PetAmuletCapture2Procedure$112
      // 4532: dup
      // 4533: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$112.<init> ()V
      // 4536: bipush 3
      // 4537: aload 8
      // 4539: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$112.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 453c: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 453f: astore 13
      // 4541: aload 13
      // 4543: bipush 10
      // 4545: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4548: aload 12
      // 454a: aload 13
      // 454c: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 454f: pop
      // 4550: aload 1
      // 4551: instanceof net/minecraft/server/level/ServerLevel
      // 4554: ifeq 4589
      // 4557: aload 1
      // 4558: checkcast net/minecraft/server/level/ServerLevel
      // 455b: astore 12
      // 455d: new net/minecraft/world/entity/item/ItemEntity
      // 4560: dup
      // 4561: aload 12
      // 4563: dload 2
      // 4564: dload 4
      // 4566: dload 6
      // 4568: new net/mocreatures/procedures/PetAmuletCapture2Procedure$113
      // 456b: dup
      // 456c: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$113.<init> ()V
      // 456f: bipush 4
      // 4570: aload 8
      // 4572: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$113.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 4575: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4578: astore 13
      // 457a: aload 13
      // 457c: bipush 10
      // 457e: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4581: aload 12
      // 4583: aload 13
      // 4585: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4588: pop
      // 4589: aload 1
      // 458a: instanceof net/minecraft/server/level/ServerLevel
      // 458d: ifeq 45c2
      // 4590: aload 1
      // 4591: checkcast net/minecraft/server/level/ServerLevel
      // 4594: astore 12
      // 4596: new net/minecraft/world/entity/item/ItemEntity
      // 4599: dup
      // 459a: aload 12
      // 459c: dload 2
      // 459d: dload 4
      // 459f: dload 6
      // 45a1: new net/mocreatures/procedures/PetAmuletCapture2Procedure$114
      // 45a4: dup
      // 45a5: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$114.<init> ()V
      // 45a8: bipush 5
      // 45a9: aload 8
      // 45ab: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$114.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 45ae: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 45b1: astore 13
      // 45b3: aload 13
      // 45b5: bipush 10
      // 45b7: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 45ba: aload 12
      // 45bc: aload 13
      // 45be: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 45c1: pop
      // 45c2: aload 1
      // 45c3: instanceof net/minecraft/server/level/ServerLevel
      // 45c6: ifeq 45fc
      // 45c9: aload 1
      // 45ca: checkcast net/minecraft/server/level/ServerLevel
      // 45cd: astore 12
      // 45cf: new net/minecraft/world/entity/item/ItemEntity
      // 45d2: dup
      // 45d3: aload 12
      // 45d5: dload 2
      // 45d6: dload 4
      // 45d8: dload 6
      // 45da: new net/mocreatures/procedures/PetAmuletCapture2Procedure$115
      // 45dd: dup
      // 45de: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$115.<init> ()V
      // 45e1: bipush 6
      // 45e3: aload 8
      // 45e5: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$115.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 45e8: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 45eb: astore 13
      // 45ed: aload 13
      // 45ef: bipush 10
      // 45f1: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 45f4: aload 12
      // 45f6: aload 13
      // 45f8: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 45fb: pop
      // 45fc: aload 1
      // 45fd: instanceof net/minecraft/server/level/ServerLevel
      // 4600: ifeq 4636
      // 4603: aload 1
      // 4604: checkcast net/minecraft/server/level/ServerLevel
      // 4607: astore 12
      // 4609: new net/minecraft/world/entity/item/ItemEntity
      // 460c: dup
      // 460d: aload 12
      // 460f: dload 2
      // 4610: dload 4
      // 4612: dload 6
      // 4614: new net/mocreatures/procedures/PetAmuletCapture2Procedure$116
      // 4617: dup
      // 4618: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$116.<init> ()V
      // 461b: bipush 7
      // 461d: aload 8
      // 461f: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$116.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 4622: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4625: astore 13
      // 4627: aload 13
      // 4629: bipush 10
      // 462b: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 462e: aload 12
      // 4630: aload 13
      // 4632: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4635: pop
      // 4636: aload 1
      // 4637: instanceof net/minecraft/server/level/ServerLevel
      // 463a: ifeq 4670
      // 463d: aload 1
      // 463e: checkcast net/minecraft/server/level/ServerLevel
      // 4641: astore 12
      // 4643: new net/minecraft/world/entity/item/ItemEntity
      // 4646: dup
      // 4647: aload 12
      // 4649: dload 2
      // 464a: dload 4
      // 464c: dload 6
      // 464e: new net/mocreatures/procedures/PetAmuletCapture2Procedure$117
      // 4651: dup
      // 4652: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$117.<init> ()V
      // 4655: bipush 8
      // 4657: aload 8
      // 4659: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$117.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 465c: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 465f: astore 13
      // 4661: aload 13
      // 4663: bipush 10
      // 4665: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4668: aload 12
      // 466a: aload 13
      // 466c: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 466f: pop
      // 4670: aload 1
      // 4671: instanceof net/minecraft/server/level/ServerLevel
      // 4674: ifeq 46aa
      // 4677: aload 1
      // 4678: checkcast net/minecraft/server/level/ServerLevel
      // 467b: astore 12
      // 467d: new net/minecraft/world/entity/item/ItemEntity
      // 4680: dup
      // 4681: aload 12
      // 4683: dload 2
      // 4684: dload 4
      // 4686: dload 6
      // 4688: new net/mocreatures/procedures/PetAmuletCapture2Procedure$118
      // 468b: dup
      // 468c: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$118.<init> ()V
      // 468f: bipush 9
      // 4691: aload 8
      // 4693: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$118.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 4696: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4699: astore 13
      // 469b: aload 13
      // 469d: bipush 10
      // 469f: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 46a2: aload 12
      // 46a4: aload 13
      // 46a6: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 46a9: pop
      // 46aa: aload 1
      // 46ab: instanceof net/minecraft/server/level/ServerLevel
      // 46ae: ifeq 46e4
      // 46b1: aload 1
      // 46b2: checkcast net/minecraft/server/level/ServerLevel
      // 46b5: astore 12
      // 46b7: new net/minecraft/world/entity/item/ItemEntity
      // 46ba: dup
      // 46bb: aload 12
      // 46bd: dload 2
      // 46be: dload 4
      // 46c0: dload 6
      // 46c2: new net/mocreatures/procedures/PetAmuletCapture2Procedure$119
      // 46c5: dup
      // 46c6: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$119.<init> ()V
      // 46c9: bipush 10
      // 46cb: aload 8
      // 46cd: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$119.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 46d0: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 46d3: astore 13
      // 46d5: aload 13
      // 46d7: bipush 10
      // 46d9: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 46dc: aload 12
      // 46de: aload 13
      // 46e0: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 46e3: pop
      // 46e4: aload 1
      // 46e5: instanceof net/minecraft/server/level/ServerLevel
      // 46e8: ifeq 471e
      // 46eb: aload 1
      // 46ec: checkcast net/minecraft/server/level/ServerLevel
      // 46ef: astore 12
      // 46f1: new net/minecraft/world/entity/item/ItemEntity
      // 46f4: dup
      // 46f5: aload 12
      // 46f7: dload 2
      // 46f8: dload 4
      // 46fa: dload 6
      // 46fc: new net/mocreatures/procedures/PetAmuletCapture2Procedure$120
      // 46ff: dup
      // 4700: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$120.<init> ()V
      // 4703: bipush 11
      // 4705: aload 8
      // 4707: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$120.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 470a: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 470d: astore 13
      // 470f: aload 13
      // 4711: bipush 10
      // 4713: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4716: aload 12
      // 4718: aload 13
      // 471a: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 471d: pop
      // 471e: aload 1
      // 471f: instanceof net/minecraft/server/level/ServerLevel
      // 4722: ifeq 4758
      // 4725: aload 1
      // 4726: checkcast net/minecraft/server/level/ServerLevel
      // 4729: astore 12
      // 472b: new net/minecraft/world/entity/item/ItemEntity
      // 472e: dup
      // 472f: aload 12
      // 4731: dload 2
      // 4732: dload 4
      // 4734: dload 6
      // 4736: new net/mocreatures/procedures/PetAmuletCapture2Procedure$121
      // 4739: dup
      // 473a: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$121.<init> ()V
      // 473d: bipush 12
      // 473f: aload 8
      // 4741: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$121.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 4744: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4747: astore 13
      // 4749: aload 13
      // 474b: bipush 10
      // 474d: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4750: aload 12
      // 4752: aload 13
      // 4754: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4757: pop
      // 4758: aload 1
      // 4759: instanceof net/minecraft/server/level/ServerLevel
      // 475c: ifeq 4792
      // 475f: aload 1
      // 4760: checkcast net/minecraft/server/level/ServerLevel
      // 4763: astore 12
      // 4765: new net/minecraft/world/entity/item/ItemEntity
      // 4768: dup
      // 4769: aload 12
      // 476b: dload 2
      // 476c: dload 4
      // 476e: dload 6
      // 4770: new net/mocreatures/procedures/PetAmuletCapture2Procedure$122
      // 4773: dup
      // 4774: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$122.<init> ()V
      // 4777: bipush 13
      // 4779: aload 8
      // 477b: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$122.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 477e: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4781: astore 13
      // 4783: aload 13
      // 4785: bipush 10
      // 4787: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 478a: aload 12
      // 478c: aload 13
      // 478e: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4791: pop
      // 4792: aload 1
      // 4793: instanceof net/minecraft/server/level/ServerLevel
      // 4796: ifeq 47cc
      // 4799: aload 1
      // 479a: checkcast net/minecraft/server/level/ServerLevel
      // 479d: astore 12
      // 479f: new net/minecraft/world/entity/item/ItemEntity
      // 47a2: dup
      // 47a3: aload 12
      // 47a5: dload 2
      // 47a6: dload 4
      // 47a8: dload 6
      // 47aa: new net/mocreatures/procedures/PetAmuletCapture2Procedure$123
      // 47ad: dup
      // 47ae: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$123.<init> ()V
      // 47b1: bipush 14
      // 47b3: aload 8
      // 47b5: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$123.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 47b8: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 47bb: astore 13
      // 47bd: aload 13
      // 47bf: bipush 10
      // 47c1: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 47c4: aload 12
      // 47c6: aload 13
      // 47c8: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 47cb: pop
      // 47cc: aload 1
      // 47cd: instanceof net/minecraft/server/level/ServerLevel
      // 47d0: ifeq 4806
      // 47d3: aload 1
      // 47d4: checkcast net/minecraft/server/level/ServerLevel
      // 47d7: astore 12
      // 47d9: new net/minecraft/world/entity/item/ItemEntity
      // 47dc: dup
      // 47dd: aload 12
      // 47df: dload 2
      // 47e0: dload 4
      // 47e2: dload 6
      // 47e4: new net/mocreatures/procedures/PetAmuletCapture2Procedure$124
      // 47e7: dup
      // 47e8: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$124.<init> ()V
      // 47eb: bipush 15
      // 47ed: aload 8
      // 47ef: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$124.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 47f2: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 47f5: astore 13
      // 47f7: aload 13
      // 47f9: bipush 10
      // 47fb: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 47fe: aload 12
      // 4800: aload 13
      // 4802: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4805: pop
      // 4806: aload 1
      // 4807: instanceof net/minecraft/server/level/ServerLevel
      // 480a: ifeq 4840
      // 480d: aload 1
      // 480e: checkcast net/minecraft/server/level/ServerLevel
      // 4811: astore 12
      // 4813: new net/minecraft/world/entity/item/ItemEntity
      // 4816: dup
      // 4817: aload 12
      // 4819: dload 2
      // 481a: dload 4
      // 481c: dload 6
      // 481e: new net/mocreatures/procedures/PetAmuletCapture2Procedure$125
      // 4821: dup
      // 4822: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$125.<init> ()V
      // 4825: bipush 16
      // 4827: aload 8
      // 4829: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$125.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 482c: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 482f: astore 13
      // 4831: aload 13
      // 4833: bipush 10
      // 4835: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4838: aload 12
      // 483a: aload 13
      // 483c: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 483f: pop
      // 4840: aload 1
      // 4841: instanceof net/minecraft/server/level/ServerLevel
      // 4844: ifeq 487a
      // 4847: aload 1
      // 4848: checkcast net/minecraft/server/level/ServerLevel
      // 484b: astore 12
      // 484d: new net/minecraft/world/entity/item/ItemEntity
      // 4850: dup
      // 4851: aload 12
      // 4853: dload 2
      // 4854: dload 4
      // 4856: dload 6
      // 4858: new net/mocreatures/procedures/PetAmuletCapture2Procedure$126
      // 485b: dup
      // 485c: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$126.<init> ()V
      // 485f: bipush 17
      // 4861: aload 8
      // 4863: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$126.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 4866: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4869: astore 13
      // 486b: aload 13
      // 486d: bipush 10
      // 486f: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4872: aload 12
      // 4874: aload 13
      // 4876: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4879: pop
      // 487a: aload 8
      // 487c: invokevirtual net/minecraft/world/entity/Entity.level ()Lnet/minecraft/world/level/Level;
      // 487f: invokevirtual net/minecraft/world/level/Level.isClientSide ()Z
      // 4882: ifne 488a
      // 4885: aload 8
      // 4887: invokevirtual net/minecraft/world/entity/Entity.discard ()V
      // 488a: aload 9
      // 488c: instanceof net/minecraft/world/entity/LivingEntity
      // 488f: ifeq 48a1
      // 4892: aload 9
      // 4894: checkcast net/minecraft/world/entity/LivingEntity
      // 4897: astore 11
      // 4899: aload 11
      // 489b: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 489e: goto 48a4
      // 48a1: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 48a4: ldc_w "mocreatures:amulet/empty"
      // 48a7: invokestatic net/minecraft/resources/ResourceLocation.parse (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
      // 48aa: invokestatic net/minecraft/tags/ItemTags.create (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
      // 48ad: invokevirtual net/minecraft/world/item/ItemStack.is (Lnet/minecraft/tags/TagKey;)Z
      // 48b0: ifeq 52d2
      // 48b3: aload 8
      // 48b5: invokevirtual net/minecraft/world/entity/Entity.getType ()Lnet/minecraft/world/entity/EntityType;
      // 48b8: getstatic net/minecraft/core/registries/Registries.ENTITY_TYPE Lnet/minecraft/resources/ResourceKey;
      // 48bb: ldc_w "mocreatures:lither"
      // 48be: invokestatic net/minecraft/resources/ResourceLocation.parse (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
      // 48c1: invokestatic net/minecraft/tags/TagKey.create (Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
      // 48c4: invokevirtual net/minecraft/world/entity/EntityType.is (Lnet/minecraft/tags/TagKey;)Z
      // 48c7: ifeq 52d2
      // 48ca: aload 8
      // 48cc: instanceof net/minecraft/world/entity/TamableAnimal
      // 48cf: ifeq 4932
      // 48d2: aload 8
      // 48d4: checkcast net/minecraft/world/entity/TamableAnimal
      // 48d7: astore 12
      // 48d9: aload 12
      // 48db: invokevirtual net/minecraft/world/entity/TamableAnimal.isTame ()Z
      // 48de: ifeq 4932
      // 48e1: aload 8
      // 48e3: instanceof net/mocreatures/entity/LitherEntity
      // 48e6: ifeq 4908
      // 48e9: aload 8
      // 48eb: checkcast net/mocreatures/entity/LitherEntity
      // 48ee: astore 13
      // 48f0: aload 13
      // 48f2: invokevirtual net/mocreatures/entity/LitherEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 48f5: getstatic net/mocreatures/entity/LitherEntity.DATA_Baby Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 48f8: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 48fb: checkcast java/lang/Boolean
      // 48fe: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4901: ifeq 4908
      // 4904: bipush 1
      // 4905: goto 4909
      // 4908: bipush 0
      // 4909: ifne 4932
      // 490c: aload 8
      // 490e: instanceof net/minecraft/world/entity/TamableAnimal
      // 4911: ifeq 4923
      // 4914: aload 8
      // 4916: checkcast net/minecraft/world/entity/TamableAnimal
      // 4919: astore 14
      // 491b: aload 14
      // 491d: invokevirtual net/minecraft/world/entity/TamableAnimal.getOwner ()Lnet/minecraft/world/entity/LivingEntity;
      // 4920: goto 4924
      // 4923: aconst_null
      // 4924: aload 9
      // 4926: if_acmpne 492f
      // 4929: bipush 1
      // 492a: istore 10
      // 492c: goto 4932
      // 492f: bipush 0
      // 4930: istore 10
      // 4932: iload 10
      // 4934: ifeq 52d2
      // 4937: aload 9
      // 4939: instanceof net/minecraft/world/entity/LivingEntity
      // 493c: ifeq 4982
      // 493f: aload 9
      // 4941: checkcast net/minecraft/world/entity/LivingEntity
      // 4944: astore 12
      // 4946: new net/minecraft/world/item/ItemStack
      // 4949: dup
      // 494a: getstatic net/mocreatures/init/MocreaturesModItems.PET_AMULET_FULL Lnet/neoforged/neoforge/registries/DeferredItem;
      // 494d: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 4950: checkcast net/minecraft/world/level/ItemLike
      // 4953: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 4956: invokevirtual net/minecraft/world/item/ItemStack.copy ()Lnet/minecraft/world/item/ItemStack;
      // 4959: astore 13
      // 495b: aload 13
      // 495d: bipush 1
      // 495e: invokevirtual net/minecraft/world/item/ItemStack.setCount (I)V
      // 4961: aload 12
      // 4963: getstatic net/minecraft/world/InteractionHand.MAIN_HAND Lnet/minecraft/world/InteractionHand;
      // 4966: aload 13
      // 4968: invokevirtual net/minecraft/world/entity/LivingEntity.setItemInHand (Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/item/ItemStack;)V
      // 496b: aload 12
      // 496d: instanceof net/minecraft/world/entity/player/Player
      // 4970: ifeq 4982
      // 4973: aload 12
      // 4975: checkcast net/minecraft/world/entity/player/Player
      // 4978: astore 14
      // 497a: aload 14
      // 497c: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 497f: invokevirtual net/minecraft/world/entity/player/Inventory.setChanged ()V
      // 4982: ldc_w "Mob"
      // 4985: astore 12
      // 4987: ldc_w "mocreatures:lither"
      // 498a: astore 13
      // 498c: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 498f: aload 9
      // 4991: instanceof net/minecraft/world/entity/LivingEntity
      // 4994: ifeq 49a6
      // 4997: aload 9
      // 4999: checkcast net/minecraft/world/entity/LivingEntity
      // 499c: astore 14
      // 499e: aload 14
      // 49a0: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 49a3: goto 49a9
      // 49a6: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 49a9: invokedynamic accept ()Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$116 (Lnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 49ae: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 49b1: ldc_w "Name"
      // 49b4: astore 12
      // 49b6: aload 8
      // 49b8: invokevirtual net/minecraft/world/entity/Entity.getDisplayName ()Lnet/minecraft/network/chat/Component;
      // 49bb: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 49c0: astore 13
      // 49c2: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 49c5: aload 9
      // 49c7: instanceof net/minecraft/world/entity/LivingEntity
      // 49ca: ifeq 49dc
      // 49cd: aload 9
      // 49cf: checkcast net/minecraft/world/entity/LivingEntity
      // 49d2: astore 14
      // 49d4: aload 14
      // 49d6: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 49d9: goto 49df
      // 49dc: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 49df: aload 13
      // 49e1: invokedynamic accept (Ljava/lang/String;)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$117 (Ljava/lang/String;Lnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 49e6: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 49e9: aload 8
      // 49eb: instanceof net/minecraft/world/entity/TamableAnimal
      // 49ee: ifeq 4a38
      // 49f1: aload 8
      // 49f3: checkcast net/minecraft/world/entity/TamableAnimal
      // 49f6: astore 12
      // 49f8: aload 12
      // 49fa: invokevirtual net/minecraft/world/entity/TamableAnimal.isTame ()Z
      // 49fd: ifeq 4a38
      // 4a00: ldc_w "Owner"
      // 4a03: astore 13
      // 4a05: aload 9
      // 4a07: invokevirtual net/minecraft/world/entity/Entity.getDisplayName ()Lnet/minecraft/network/chat/Component;
      // 4a0a: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 4a0f: astore 14
      // 4a11: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 4a14: aload 9
      // 4a16: instanceof net/minecraft/world/entity/LivingEntity
      // 4a19: ifeq 4a2b
      // 4a1c: aload 9
      // 4a1e: checkcast net/minecraft/world/entity/LivingEntity
      // 4a21: astore 15
      // 4a23: aload 15
      // 4a25: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 4a28: goto 4a2e
      // 4a2b: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 4a2e: aload 14
      // 4a30: invokedynamic accept (Ljava/lang/String;)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$118 (Ljava/lang/String;Lnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 4a35: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 4a38: ldc_w "Leashed"
      // 4a3b: astore 12
      // 4a3d: aload 8
      // 4a3f: instanceof net/minecraft/world/entity/Mob
      // 4a42: ifeq 4a54
      // 4a45: aload 8
      // 4a47: checkcast net/minecraft/world/entity/Mob
      // 4a4a: astore 14
      // 4a4c: aload 14
      // 4a4e: invokevirtual net/minecraft/world/entity/Mob.isLeashed ()Z
      // 4a51: goto 4a55
      // 4a54: bipush 0
      // 4a55: istore 13
      // 4a57: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 4a5a: aload 9
      // 4a5c: instanceof net/minecraft/world/entity/LivingEntity
      // 4a5f: ifeq 4a71
      // 4a62: aload 9
      // 4a64: checkcast net/minecraft/world/entity/LivingEntity
      // 4a67: astore 14
      // 4a69: aload 14
      // 4a6b: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 4a6e: goto 4a74
      // 4a71: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 4a74: iload 13
      // 4a76: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$119 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 4a7b: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 4a7e: ldc_w "NoGravity"
      // 4a81: astore 12
      // 4a83: aload 8
      // 4a85: invokevirtual net/minecraft/world/entity/Entity.isNoGravity ()Z
      // 4a88: istore 13
      // 4a8a: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 4a8d: aload 9
      // 4a8f: instanceof net/minecraft/world/entity/LivingEntity
      // 4a92: ifeq 4aa4
      // 4a95: aload 9
      // 4a97: checkcast net/minecraft/world/entity/LivingEntity
      // 4a9a: astore 14
      // 4a9c: aload 14
      // 4a9e: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 4aa1: goto 4aa7
      // 4aa4: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 4aa7: iload 13
      // 4aa9: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$120 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 4aae: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 4ab1: ldc_w "MaxHealth"
      // 4ab4: astore 12
      // 4ab6: aload 8
      // 4ab8: instanceof net/minecraft/world/entity/LivingEntity
      // 4abb: ifeq 4ace
      // 4abe: aload 8
      // 4ac0: checkcast net/minecraft/world/entity/LivingEntity
      // 4ac3: astore 15
      // 4ac5: aload 15
      // 4ac7: invokevirtual net/minecraft/world/entity/LivingEntity.getMaxHealth ()F
      // 4aca: f2d
      // 4acb: goto 4ad1
      // 4ace: ldc2_w -1.0
      // 4ad1: dstore 13
      // 4ad3: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 4ad6: aload 9
      // 4ad8: instanceof net/minecraft/world/entity/LivingEntity
      // 4adb: ifeq 4aed
      // 4ade: aload 9
      // 4ae0: checkcast net/minecraft/world/entity/LivingEntity
      // 4ae3: astore 15
      // 4ae5: aload 15
      // 4ae7: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 4aea: goto 4af0
      // 4aed: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 4af0: dload 13
      // 4af2: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$121 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 4af7: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 4afa: ldc_w "Health"
      // 4afd: astore 12
      // 4aff: aload 8
      // 4b01: instanceof net/minecraft/world/entity/LivingEntity
      // 4b04: ifeq 4b17
      // 4b07: aload 8
      // 4b09: checkcast net/minecraft/world/entity/LivingEntity
      // 4b0c: astore 15
      // 4b0e: aload 15
      // 4b10: invokevirtual net/minecraft/world/entity/LivingEntity.getHealth ()F
      // 4b13: f2d
      // 4b14: goto 4b1a
      // 4b17: ldc2_w -1.0
      // 4b1a: dstore 13
      // 4b1c: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 4b1f: aload 9
      // 4b21: instanceof net/minecraft/world/entity/LivingEntity
      // 4b24: ifeq 4b36
      // 4b27: aload 9
      // 4b29: checkcast net/minecraft/world/entity/LivingEntity
      // 4b2c: astore 15
      // 4b2e: aload 15
      // 4b30: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 4b33: goto 4b39
      // 4b36: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 4b39: dload 13
      // 4b3b: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$122 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 4b40: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 4b43: ldc_w "Air"
      // 4b46: astore 12
      // 4b48: aload 8
      // 4b4a: invokevirtual net/minecraft/world/entity/Entity.getAirSupply ()I
      // 4b4d: i2d
      // 4b4e: dstore 13
      // 4b50: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 4b53: aload 9
      // 4b55: instanceof net/minecraft/world/entity/LivingEntity
      // 4b58: ifeq 4b6a
      // 4b5b: aload 9
      // 4b5d: checkcast net/minecraft/world/entity/LivingEntity
      // 4b60: astore 15
      // 4b62: aload 15
      // 4b64: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 4b67: goto 4b6d
      // 4b6a: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 4b6d: dload 13
      // 4b6f: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$123 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 4b74: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 4b77: ldc_w "MotionX"
      // 4b7a: astore 12
      // 4b7c: aload 8
      // 4b7e: invokevirtual net/minecraft/world/entity/Entity.getDeltaMovement ()Lnet/minecraft/world/phys/Vec3;
      // 4b81: invokevirtual net/minecraft/world/phys/Vec3.x ()D
      // 4b84: dstore 13
      // 4b86: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 4b89: aload 9
      // 4b8b: instanceof net/minecraft/world/entity/LivingEntity
      // 4b8e: ifeq 4ba0
      // 4b91: aload 9
      // 4b93: checkcast net/minecraft/world/entity/LivingEntity
      // 4b96: astore 15
      // 4b98: aload 15
      // 4b9a: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 4b9d: goto 4ba3
      // 4ba0: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 4ba3: dload 13
      // 4ba5: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$124 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 4baa: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 4bad: ldc_w "MotionY"
      // 4bb0: astore 12
      // 4bb2: aload 8
      // 4bb4: invokevirtual net/minecraft/world/entity/Entity.getDeltaMovement ()Lnet/minecraft/world/phys/Vec3;
      // 4bb7: invokevirtual net/minecraft/world/phys/Vec3.y ()D
      // 4bba: dstore 13
      // 4bbc: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 4bbf: aload 9
      // 4bc1: instanceof net/minecraft/world/entity/LivingEntity
      // 4bc4: ifeq 4bd6
      // 4bc7: aload 9
      // 4bc9: checkcast net/minecraft/world/entity/LivingEntity
      // 4bcc: astore 15
      // 4bce: aload 15
      // 4bd0: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 4bd3: goto 4bd9
      // 4bd6: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 4bd9: dload 13
      // 4bdb: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$125 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 4be0: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 4be3: ldc_w "MotionZ"
      // 4be6: astore 12
      // 4be8: aload 8
      // 4bea: invokevirtual net/minecraft/world/entity/Entity.getDeltaMovement ()Lnet/minecraft/world/phys/Vec3;
      // 4bed: invokevirtual net/minecraft/world/phys/Vec3.z ()D
      // 4bf0: dstore 13
      // 4bf2: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 4bf5: aload 9
      // 4bf7: instanceof net/minecraft/world/entity/LivingEntity
      // 4bfa: ifeq 4c0c
      // 4bfd: aload 9
      // 4bff: checkcast net/minecraft/world/entity/LivingEntity
      // 4c02: astore 15
      // 4c04: aload 15
      // 4c06: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 4c09: goto 4c0f
      // 4c0c: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 4c0f: dload 13
      // 4c11: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$126 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 4c16: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 4c19: ldc_w "RotationYaw"
      // 4c1c: astore 12
      // 4c1e: aload 8
      // 4c20: invokevirtual net/minecraft/world/entity/Entity.getYRot ()F
      // 4c23: f2d
      // 4c24: dstore 13
      // 4c26: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 4c29: aload 9
      // 4c2b: instanceof net/minecraft/world/entity/LivingEntity
      // 4c2e: ifeq 4c40
      // 4c31: aload 9
      // 4c33: checkcast net/minecraft/world/entity/LivingEntity
      // 4c36: astore 15
      // 4c38: aload 15
      // 4c3a: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 4c3d: goto 4c43
      // 4c40: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 4c43: dload 13
      // 4c45: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$127 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 4c4a: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 4c4d: ldc_w "RotationPitch"
      // 4c50: astore 12
      // 4c52: aload 8
      // 4c54: invokevirtual net/minecraft/world/entity/Entity.getXRot ()F
      // 4c57: f2d
      // 4c58: dstore 13
      // 4c5a: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 4c5d: aload 9
      // 4c5f: instanceof net/minecraft/world/entity/LivingEntity
      // 4c62: ifeq 4c74
      // 4c65: aload 9
      // 4c67: checkcast net/minecraft/world/entity/LivingEntity
      // 4c6a: astore 15
      // 4c6c: aload 15
      // 4c6e: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 4c71: goto 4c77
      // 4c74: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 4c77: dload 13
      // 4c79: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$128 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 4c7e: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 4c81: ldc_w "Gender"
      // 4c84: astore 12
      // 4c86: aload 8
      // 4c88: instanceof net/mocreatures/entity/LitherEntity
      // 4c8b: ifeq 4caa
      // 4c8e: aload 8
      // 4c90: checkcast net/mocreatures/entity/LitherEntity
      // 4c93: astore 15
      // 4c95: aload 15
      // 4c97: invokevirtual net/mocreatures/entity/LitherEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4c9a: getstatic net/mocreatures/entity/LitherEntity.DATA_Gender Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4c9d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 4ca0: checkcast java/lang/Integer
      // 4ca3: invokevirtual java/lang/Integer.intValue ()I
      // 4ca6: i2d
      // 4ca7: goto 4cab
      // 4caa: dconst_0
      // 4cab: dstore 13
      // 4cad: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 4cb0: aload 9
      // 4cb2: instanceof net/minecraft/world/entity/LivingEntity
      // 4cb5: ifeq 4cc7
      // 4cb8: aload 9
      // 4cba: checkcast net/minecraft/world/entity/LivingEntity
      // 4cbd: astore 15
      // 4cbf: aload 15
      // 4cc1: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 4cc4: goto 4cca
      // 4cc7: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 4cca: dload 13
      // 4ccc: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$129 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 4cd1: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 4cd4: ldc_w "Color"
      // 4cd7: astore 12
      // 4cd9: aload 8
      // 4cdb: instanceof net/mocreatures/entity/LitherEntity
      // 4cde: ifeq 4cfd
      // 4ce1: aload 8
      // 4ce3: checkcast net/mocreatures/entity/LitherEntity
      // 4ce6: astore 15
      // 4ce8: aload 15
      // 4cea: invokevirtual net/mocreatures/entity/LitherEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4ced: getstatic net/mocreatures/entity/LitherEntity.DATA_Color Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4cf0: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 4cf3: checkcast java/lang/Integer
      // 4cf6: invokevirtual java/lang/Integer.intValue ()I
      // 4cf9: i2d
      // 4cfa: goto 4cfe
      // 4cfd: dconst_0
      // 4cfe: dstore 13
      // 4d00: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 4d03: aload 9
      // 4d05: instanceof net/minecraft/world/entity/LivingEntity
      // 4d08: ifeq 4d1a
      // 4d0b: aload 9
      // 4d0d: checkcast net/minecraft/world/entity/LivingEntity
      // 4d10: astore 15
      // 4d12: aload 15
      // 4d14: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 4d17: goto 4d1d
      // 4d1a: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 4d1d: dload 13
      // 4d1f: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$130 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 4d24: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 4d27: ldc_w "Wings"
      // 4d2a: astore 12
      // 4d2c: aload 8
      // 4d2e: instanceof net/mocreatures/entity/LitherEntity
      // 4d31: ifeq 4d53
      // 4d34: aload 8
      // 4d36: checkcast net/mocreatures/entity/LitherEntity
      // 4d39: astore 14
      // 4d3b: aload 14
      // 4d3d: invokevirtual net/mocreatures/entity/LitherEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4d40: getstatic net/mocreatures/entity/LitherEntity.DATA_Wings Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4d43: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 4d46: checkcast java/lang/Boolean
      // 4d49: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4d4c: ifeq 4d53
      // 4d4f: bipush 1
      // 4d50: goto 4d54
      // 4d53: bipush 0
      // 4d54: istore 13
      // 4d56: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 4d59: aload 9
      // 4d5b: instanceof net/minecraft/world/entity/LivingEntity
      // 4d5e: ifeq 4d70
      // 4d61: aload 9
      // 4d63: checkcast net/minecraft/world/entity/LivingEntity
      // 4d66: astore 14
      // 4d68: aload 14
      // 4d6a: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 4d6d: goto 4d73
      // 4d70: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 4d73: iload 13
      // 4d75: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$131 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 4d7a: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 4d7d: ldc_w "Medallion"
      // 4d80: astore 12
      // 4d82: aload 8
      // 4d84: instanceof net/mocreatures/entity/LitherEntity
      // 4d87: ifeq 4da9
      // 4d8a: aload 8
      // 4d8c: checkcast net/mocreatures/entity/LitherEntity
      // 4d8f: astore 14
      // 4d91: aload 14
      // 4d93: invokevirtual net/mocreatures/entity/LitherEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4d96: getstatic net/mocreatures/entity/LitherEntity.DATA_Medallion Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4d99: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 4d9c: checkcast java/lang/Boolean
      // 4d9f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4da2: ifeq 4da9
      // 4da5: bipush 1
      // 4da6: goto 4daa
      // 4da9: bipush 0
      // 4daa: istore 13
      // 4dac: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 4daf: aload 9
      // 4db1: instanceof net/minecraft/world/entity/LivingEntity
      // 4db4: ifeq 4dc6
      // 4db7: aload 9
      // 4db9: checkcast net/minecraft/world/entity/LivingEntity
      // 4dbc: astore 14
      // 4dbe: aload 14
      // 4dc0: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 4dc3: goto 4dc9
      // 4dc6: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 4dc9: iload 13
      // 4dcb: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$132 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 4dd0: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 4dd3: aload 8
      // 4dd5: invokevirtual net/minecraft/world/entity/Entity.getType ()Lnet/minecraft/world/entity/EntityType;
      // 4dd8: getstatic net/minecraft/core/registries/Registries.ENTITY_TYPE Lnet/minecraft/resources/ResourceKey;
      // 4ddb: ldc_w "mocreatures:lither"
      // 4dde: invokestatic net/minecraft/resources/ResourceLocation.parse (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
      // 4de1: invokestatic net/minecraft/tags/TagKey.create (Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
      // 4de4: invokevirtual net/minecraft/world/entity/EntityType.is (Lnet/minecraft/tags/TagKey;)Z
      // 4de7: ifeq 52d2
      // 4dea: aload 8
      // 4dec: instanceof net/mocreatures/entity/LitherEntity
      // 4def: ifeq 4e11
      // 4df2: aload 8
      // 4df4: checkcast net/mocreatures/entity/LitherEntity
      // 4df7: astore 12
      // 4df9: aload 12
      // 4dfb: invokevirtual net/mocreatures/entity/LitherEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4dfe: getstatic net/mocreatures/entity/LitherEntity.DATA_Saddle Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4e01: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 4e04: checkcast java/lang/Boolean
      // 4e07: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4e0a: ifeq 4e11
      // 4e0d: bipush 1
      // 4e0e: goto 4e12
      // 4e11: bipush 0
      // 4e12: bipush 1
      // 4e13: if_icmpne 4e52
      // 4e16: aload 1
      // 4e17: instanceof net/minecraft/server/level/ServerLevel
      // 4e1a: ifeq 4e52
      // 4e1d: aload 1
      // 4e1e: checkcast net/minecraft/server/level/ServerLevel
      // 4e21: astore 13
      // 4e23: new net/minecraft/world/entity/item/ItemEntity
      // 4e26: dup
      // 4e27: aload 13
      // 4e29: dload 2
      // 4e2a: dload 4
      // 4e2c: dload 6
      // 4e2e: new net/minecraft/world/item/ItemStack
      // 4e31: dup
      // 4e32: getstatic net/mocreatures/init/MocreaturesModItems.CRAFTED_SADDLE Lnet/neoforged/neoforge/registries/DeferredItem;
      // 4e35: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 4e38: checkcast net/minecraft/world/level/ItemLike
      // 4e3b: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 4e3e: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4e41: astore 14
      // 4e43: aload 14
      // 4e45: bipush 10
      // 4e47: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4e4a: aload 13
      // 4e4c: aload 14
      // 4e4e: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4e51: pop
      // 4e52: aload 8
      // 4e54: instanceof net/mocreatures/entity/LitherEntity
      // 4e57: ifeq 4e79
      // 4e5a: aload 8
      // 4e5c: checkcast net/mocreatures/entity/LitherEntity
      // 4e5f: astore 12
      // 4e61: aload 12
      // 4e63: invokevirtual net/mocreatures/entity/LitherEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 4e66: getstatic net/mocreatures/entity/LitherEntity.DATA_Chest Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 4e69: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 4e6c: checkcast java/lang/Boolean
      // 4e6f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4e72: ifeq 4e79
      // 4e75: bipush 1
      // 4e76: goto 4e7a
      // 4e79: bipush 0
      // 4e7a: bipush 1
      // 4e7b: if_icmpne 4eb4
      // 4e7e: aload 1
      // 4e7f: instanceof net/minecraft/server/level/ServerLevel
      // 4e82: ifeq 4eb4
      // 4e85: aload 1
      // 4e86: checkcast net/minecraft/server/level/ServerLevel
      // 4e89: astore 13
      // 4e8b: new net/minecraft/world/entity/item/ItemEntity
      // 4e8e: dup
      // 4e8f: aload 13
      // 4e91: dload 2
      // 4e92: dload 4
      // 4e94: dload 6
      // 4e96: new net/minecraft/world/item/ItemStack
      // 4e99: dup
      // 4e9a: getstatic net/minecraft/world/level/block/Blocks.CHEST Lnet/minecraft/world/level/block/Block;
      // 4e9d: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 4ea0: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4ea3: astore 14
      // 4ea5: aload 14
      // 4ea7: bipush 10
      // 4ea9: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4eac: aload 13
      // 4eae: aload 14
      // 4eb0: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4eb3: pop
      // 4eb4: aload 1
      // 4eb5: instanceof net/minecraft/server/level/ServerLevel
      // 4eb8: ifeq 4eed
      // 4ebb: aload 1
      // 4ebc: checkcast net/minecraft/server/level/ServerLevel
      // 4ebf: astore 12
      // 4ec1: new net/minecraft/world/entity/item/ItemEntity
      // 4ec4: dup
      // 4ec5: aload 12
      // 4ec7: dload 2
      // 4ec8: dload 4
      // 4eca: dload 6
      // 4ecc: new net/mocreatures/procedures/PetAmuletCapture2Procedure$127
      // 4ecf: dup
      // 4ed0: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$127.<init> ()V
      // 4ed3: bipush 0
      // 4ed4: aload 8
      // 4ed6: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$127.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 4ed9: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4edc: astore 13
      // 4ede: aload 13
      // 4ee0: bipush 10
      // 4ee2: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4ee5: aload 12
      // 4ee7: aload 13
      // 4ee9: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4eec: pop
      // 4eed: aload 1
      // 4eee: instanceof net/minecraft/server/level/ServerLevel
      // 4ef1: ifeq 4f26
      // 4ef4: aload 1
      // 4ef5: checkcast net/minecraft/server/level/ServerLevel
      // 4ef8: astore 12
      // 4efa: new net/minecraft/world/entity/item/ItemEntity
      // 4efd: dup
      // 4efe: aload 12
      // 4f00: dload 2
      // 4f01: dload 4
      // 4f03: dload 6
      // 4f05: new net/mocreatures/procedures/PetAmuletCapture2Procedure$128
      // 4f08: dup
      // 4f09: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$128.<init> ()V
      // 4f0c: bipush 1
      // 4f0d: aload 8
      // 4f0f: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$128.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 4f12: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4f15: astore 13
      // 4f17: aload 13
      // 4f19: bipush 10
      // 4f1b: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4f1e: aload 12
      // 4f20: aload 13
      // 4f22: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4f25: pop
      // 4f26: aload 1
      // 4f27: instanceof net/minecraft/server/level/ServerLevel
      // 4f2a: ifeq 4f5f
      // 4f2d: aload 1
      // 4f2e: checkcast net/minecraft/server/level/ServerLevel
      // 4f31: astore 12
      // 4f33: new net/minecraft/world/entity/item/ItemEntity
      // 4f36: dup
      // 4f37: aload 12
      // 4f39: dload 2
      // 4f3a: dload 4
      // 4f3c: dload 6
      // 4f3e: new net/mocreatures/procedures/PetAmuletCapture2Procedure$129
      // 4f41: dup
      // 4f42: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$129.<init> ()V
      // 4f45: bipush 2
      // 4f46: aload 8
      // 4f48: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$129.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 4f4b: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4f4e: astore 13
      // 4f50: aload 13
      // 4f52: bipush 10
      // 4f54: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4f57: aload 12
      // 4f59: aload 13
      // 4f5b: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4f5e: pop
      // 4f5f: aload 1
      // 4f60: instanceof net/minecraft/server/level/ServerLevel
      // 4f63: ifeq 4f98
      // 4f66: aload 1
      // 4f67: checkcast net/minecraft/server/level/ServerLevel
      // 4f6a: astore 12
      // 4f6c: new net/minecraft/world/entity/item/ItemEntity
      // 4f6f: dup
      // 4f70: aload 12
      // 4f72: dload 2
      // 4f73: dload 4
      // 4f75: dload 6
      // 4f77: new net/mocreatures/procedures/PetAmuletCapture2Procedure$130
      // 4f7a: dup
      // 4f7b: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$130.<init> ()V
      // 4f7e: bipush 3
      // 4f7f: aload 8
      // 4f81: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$130.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 4f84: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4f87: astore 13
      // 4f89: aload 13
      // 4f8b: bipush 10
      // 4f8d: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4f90: aload 12
      // 4f92: aload 13
      // 4f94: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4f97: pop
      // 4f98: aload 1
      // 4f99: instanceof net/minecraft/server/level/ServerLevel
      // 4f9c: ifeq 4fd1
      // 4f9f: aload 1
      // 4fa0: checkcast net/minecraft/server/level/ServerLevel
      // 4fa3: astore 12
      // 4fa5: new net/minecraft/world/entity/item/ItemEntity
      // 4fa8: dup
      // 4fa9: aload 12
      // 4fab: dload 2
      // 4fac: dload 4
      // 4fae: dload 6
      // 4fb0: new net/mocreatures/procedures/PetAmuletCapture2Procedure$131
      // 4fb3: dup
      // 4fb4: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$131.<init> ()V
      // 4fb7: bipush 4
      // 4fb8: aload 8
      // 4fba: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$131.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 4fbd: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4fc0: astore 13
      // 4fc2: aload 13
      // 4fc4: bipush 10
      // 4fc6: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 4fc9: aload 12
      // 4fcb: aload 13
      // 4fcd: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 4fd0: pop
      // 4fd1: aload 1
      // 4fd2: instanceof net/minecraft/server/level/ServerLevel
      // 4fd5: ifeq 500a
      // 4fd8: aload 1
      // 4fd9: checkcast net/minecraft/server/level/ServerLevel
      // 4fdc: astore 12
      // 4fde: new net/minecraft/world/entity/item/ItemEntity
      // 4fe1: dup
      // 4fe2: aload 12
      // 4fe4: dload 2
      // 4fe5: dload 4
      // 4fe7: dload 6
      // 4fe9: new net/mocreatures/procedures/PetAmuletCapture2Procedure$132
      // 4fec: dup
      // 4fed: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$132.<init> ()V
      // 4ff0: bipush 5
      // 4ff1: aload 8
      // 4ff3: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$132.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 4ff6: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 4ff9: astore 13
      // 4ffb: aload 13
      // 4ffd: bipush 10
      // 4fff: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5002: aload 12
      // 5004: aload 13
      // 5006: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5009: pop
      // 500a: aload 1
      // 500b: instanceof net/minecraft/server/level/ServerLevel
      // 500e: ifeq 5044
      // 5011: aload 1
      // 5012: checkcast net/minecraft/server/level/ServerLevel
      // 5015: astore 12
      // 5017: new net/minecraft/world/entity/item/ItemEntity
      // 501a: dup
      // 501b: aload 12
      // 501d: dload 2
      // 501e: dload 4
      // 5020: dload 6
      // 5022: new net/mocreatures/procedures/PetAmuletCapture2Procedure$133
      // 5025: dup
      // 5026: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$133.<init> ()V
      // 5029: bipush 6
      // 502b: aload 8
      // 502d: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$133.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 5030: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5033: astore 13
      // 5035: aload 13
      // 5037: bipush 10
      // 5039: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 503c: aload 12
      // 503e: aload 13
      // 5040: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5043: pop
      // 5044: aload 1
      // 5045: instanceof net/minecraft/server/level/ServerLevel
      // 5048: ifeq 507e
      // 504b: aload 1
      // 504c: checkcast net/minecraft/server/level/ServerLevel
      // 504f: astore 12
      // 5051: new net/minecraft/world/entity/item/ItemEntity
      // 5054: dup
      // 5055: aload 12
      // 5057: dload 2
      // 5058: dload 4
      // 505a: dload 6
      // 505c: new net/mocreatures/procedures/PetAmuletCapture2Procedure$134
      // 505f: dup
      // 5060: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$134.<init> ()V
      // 5063: bipush 7
      // 5065: aload 8
      // 5067: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$134.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 506a: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 506d: astore 13
      // 506f: aload 13
      // 5071: bipush 10
      // 5073: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5076: aload 12
      // 5078: aload 13
      // 507a: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 507d: pop
      // 507e: aload 1
      // 507f: instanceof net/minecraft/server/level/ServerLevel
      // 5082: ifeq 50b8
      // 5085: aload 1
      // 5086: checkcast net/minecraft/server/level/ServerLevel
      // 5089: astore 12
      // 508b: new net/minecraft/world/entity/item/ItemEntity
      // 508e: dup
      // 508f: aload 12
      // 5091: dload 2
      // 5092: dload 4
      // 5094: dload 6
      // 5096: new net/mocreatures/procedures/PetAmuletCapture2Procedure$135
      // 5099: dup
      // 509a: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$135.<init> ()V
      // 509d: bipush 8
      // 509f: aload 8
      // 50a1: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$135.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 50a4: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 50a7: astore 13
      // 50a9: aload 13
      // 50ab: bipush 10
      // 50ad: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 50b0: aload 12
      // 50b2: aload 13
      // 50b4: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 50b7: pop
      // 50b8: aload 1
      // 50b9: instanceof net/minecraft/server/level/ServerLevel
      // 50bc: ifeq 50f2
      // 50bf: aload 1
      // 50c0: checkcast net/minecraft/server/level/ServerLevel
      // 50c3: astore 12
      // 50c5: new net/minecraft/world/entity/item/ItemEntity
      // 50c8: dup
      // 50c9: aload 12
      // 50cb: dload 2
      // 50cc: dload 4
      // 50ce: dload 6
      // 50d0: new net/mocreatures/procedures/PetAmuletCapture2Procedure$136
      // 50d3: dup
      // 50d4: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$136.<init> ()V
      // 50d7: bipush 9
      // 50d9: aload 8
      // 50db: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$136.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 50de: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 50e1: astore 13
      // 50e3: aload 13
      // 50e5: bipush 10
      // 50e7: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 50ea: aload 12
      // 50ec: aload 13
      // 50ee: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 50f1: pop
      // 50f2: aload 1
      // 50f3: instanceof net/minecraft/server/level/ServerLevel
      // 50f6: ifeq 512c
      // 50f9: aload 1
      // 50fa: checkcast net/minecraft/server/level/ServerLevel
      // 50fd: astore 12
      // 50ff: new net/minecraft/world/entity/item/ItemEntity
      // 5102: dup
      // 5103: aload 12
      // 5105: dload 2
      // 5106: dload 4
      // 5108: dload 6
      // 510a: new net/mocreatures/procedures/PetAmuletCapture2Procedure$137
      // 510d: dup
      // 510e: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$137.<init> ()V
      // 5111: bipush 10
      // 5113: aload 8
      // 5115: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$137.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 5118: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 511b: astore 13
      // 511d: aload 13
      // 511f: bipush 10
      // 5121: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5124: aload 12
      // 5126: aload 13
      // 5128: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 512b: pop
      // 512c: aload 1
      // 512d: instanceof net/minecraft/server/level/ServerLevel
      // 5130: ifeq 5166
      // 5133: aload 1
      // 5134: checkcast net/minecraft/server/level/ServerLevel
      // 5137: astore 12
      // 5139: new net/minecraft/world/entity/item/ItemEntity
      // 513c: dup
      // 513d: aload 12
      // 513f: dload 2
      // 5140: dload 4
      // 5142: dload 6
      // 5144: new net/mocreatures/procedures/PetAmuletCapture2Procedure$138
      // 5147: dup
      // 5148: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$138.<init> ()V
      // 514b: bipush 11
      // 514d: aload 8
      // 514f: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$138.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 5152: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5155: astore 13
      // 5157: aload 13
      // 5159: bipush 10
      // 515b: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 515e: aload 12
      // 5160: aload 13
      // 5162: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5165: pop
      // 5166: aload 1
      // 5167: instanceof net/minecraft/server/level/ServerLevel
      // 516a: ifeq 51a0
      // 516d: aload 1
      // 516e: checkcast net/minecraft/server/level/ServerLevel
      // 5171: astore 12
      // 5173: new net/minecraft/world/entity/item/ItemEntity
      // 5176: dup
      // 5177: aload 12
      // 5179: dload 2
      // 517a: dload 4
      // 517c: dload 6
      // 517e: new net/mocreatures/procedures/PetAmuletCapture2Procedure$139
      // 5181: dup
      // 5182: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$139.<init> ()V
      // 5185: bipush 12
      // 5187: aload 8
      // 5189: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$139.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 518c: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 518f: astore 13
      // 5191: aload 13
      // 5193: bipush 10
      // 5195: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5198: aload 12
      // 519a: aload 13
      // 519c: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 519f: pop
      // 51a0: aload 1
      // 51a1: instanceof net/minecraft/server/level/ServerLevel
      // 51a4: ifeq 51da
      // 51a7: aload 1
      // 51a8: checkcast net/minecraft/server/level/ServerLevel
      // 51ab: astore 12
      // 51ad: new net/minecraft/world/entity/item/ItemEntity
      // 51b0: dup
      // 51b1: aload 12
      // 51b3: dload 2
      // 51b4: dload 4
      // 51b6: dload 6
      // 51b8: new net/mocreatures/procedures/PetAmuletCapture2Procedure$140
      // 51bb: dup
      // 51bc: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$140.<init> ()V
      // 51bf: bipush 13
      // 51c1: aload 8
      // 51c3: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$140.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 51c6: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 51c9: astore 13
      // 51cb: aload 13
      // 51cd: bipush 10
      // 51cf: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 51d2: aload 12
      // 51d4: aload 13
      // 51d6: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 51d9: pop
      // 51da: aload 1
      // 51db: instanceof net/minecraft/server/level/ServerLevel
      // 51de: ifeq 5214
      // 51e1: aload 1
      // 51e2: checkcast net/minecraft/server/level/ServerLevel
      // 51e5: astore 12
      // 51e7: new net/minecraft/world/entity/item/ItemEntity
      // 51ea: dup
      // 51eb: aload 12
      // 51ed: dload 2
      // 51ee: dload 4
      // 51f0: dload 6
      // 51f2: new net/mocreatures/procedures/PetAmuletCapture2Procedure$141
      // 51f5: dup
      // 51f6: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$141.<init> ()V
      // 51f9: bipush 14
      // 51fb: aload 8
      // 51fd: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$141.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 5200: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5203: astore 13
      // 5205: aload 13
      // 5207: bipush 10
      // 5209: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 520c: aload 12
      // 520e: aload 13
      // 5210: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5213: pop
      // 5214: aload 1
      // 5215: instanceof net/minecraft/server/level/ServerLevel
      // 5218: ifeq 524e
      // 521b: aload 1
      // 521c: checkcast net/minecraft/server/level/ServerLevel
      // 521f: astore 12
      // 5221: new net/minecraft/world/entity/item/ItemEntity
      // 5224: dup
      // 5225: aload 12
      // 5227: dload 2
      // 5228: dload 4
      // 522a: dload 6
      // 522c: new net/mocreatures/procedures/PetAmuletCapture2Procedure$142
      // 522f: dup
      // 5230: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$142.<init> ()V
      // 5233: bipush 15
      // 5235: aload 8
      // 5237: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$142.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 523a: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 523d: astore 13
      // 523f: aload 13
      // 5241: bipush 10
      // 5243: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5246: aload 12
      // 5248: aload 13
      // 524a: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 524d: pop
      // 524e: aload 1
      // 524f: instanceof net/minecraft/server/level/ServerLevel
      // 5252: ifeq 5288
      // 5255: aload 1
      // 5256: checkcast net/minecraft/server/level/ServerLevel
      // 5259: astore 12
      // 525b: new net/minecraft/world/entity/item/ItemEntity
      // 525e: dup
      // 525f: aload 12
      // 5261: dload 2
      // 5262: dload 4
      // 5264: dload 6
      // 5266: new net/mocreatures/procedures/PetAmuletCapture2Procedure$143
      // 5269: dup
      // 526a: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$143.<init> ()V
      // 526d: bipush 16
      // 526f: aload 8
      // 5271: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$143.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 5274: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5277: astore 13
      // 5279: aload 13
      // 527b: bipush 10
      // 527d: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5280: aload 12
      // 5282: aload 13
      // 5284: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5287: pop
      // 5288: aload 1
      // 5289: instanceof net/minecraft/server/level/ServerLevel
      // 528c: ifeq 52c2
      // 528f: aload 1
      // 5290: checkcast net/minecraft/server/level/ServerLevel
      // 5293: astore 12
      // 5295: new net/minecraft/world/entity/item/ItemEntity
      // 5298: dup
      // 5299: aload 12
      // 529b: dload 2
      // 529c: dload 4
      // 529e: dload 6
      // 52a0: new net/mocreatures/procedures/PetAmuletCapture2Procedure$144
      // 52a3: dup
      // 52a4: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$144.<init> ()V
      // 52a7: bipush 17
      // 52a9: aload 8
      // 52ab: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$144.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 52ae: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 52b1: astore 13
      // 52b3: aload 13
      // 52b5: bipush 10
      // 52b7: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 52ba: aload 12
      // 52bc: aload 13
      // 52be: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 52c1: pop
      // 52c2: aload 8
      // 52c4: invokevirtual net/minecraft/world/entity/Entity.level ()Lnet/minecraft/world/level/Level;
      // 52c7: invokevirtual net/minecraft/world/level/Level.isClientSide ()Z
      // 52ca: ifne 52d2
      // 52cd: aload 8
      // 52cf: invokevirtual net/minecraft/world/entity/Entity.discard ()V
      // 52d2: aload 9
      // 52d4: instanceof net/minecraft/world/entity/LivingEntity
      // 52d7: ifeq 52e9
      // 52da: aload 9
      // 52dc: checkcast net/minecraft/world/entity/LivingEntity
      // 52df: astore 11
      // 52e1: aload 11
      // 52e3: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 52e6: goto 52ec
      // 52e9: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 52ec: ldc_w "mocreatures:amulet/empty"
      // 52ef: invokestatic net/minecraft/resources/ResourceLocation.parse (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
      // 52f2: invokestatic net/minecraft/tags/ItemTags.create (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
      // 52f5: invokevirtual net/minecraft/world/item/ItemStack.is (Lnet/minecraft/tags/TagKey;)Z
      // 52f8: ifeq 5d1a
      // 52fb: aload 8
      // 52fd: invokevirtual net/minecraft/world/entity/Entity.getType ()Lnet/minecraft/world/entity/EntityType;
      // 5300: getstatic net/minecraft/core/registries/Registries.ENTITY_TYPE Lnet/minecraft/resources/ResourceKey;
      // 5303: ldc_w "mocreatures:leoger"
      // 5306: invokestatic net/minecraft/resources/ResourceLocation.parse (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
      // 5309: invokestatic net/minecraft/tags/TagKey.create (Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
      // 530c: invokevirtual net/minecraft/world/entity/EntityType.is (Lnet/minecraft/tags/TagKey;)Z
      // 530f: ifeq 5d1a
      // 5312: aload 8
      // 5314: instanceof net/minecraft/world/entity/TamableAnimal
      // 5317: ifeq 537a
      // 531a: aload 8
      // 531c: checkcast net/minecraft/world/entity/TamableAnimal
      // 531f: astore 12
      // 5321: aload 12
      // 5323: invokevirtual net/minecraft/world/entity/TamableAnimal.isTame ()Z
      // 5326: ifeq 537a
      // 5329: aload 8
      // 532b: instanceof net/mocreatures/entity/LeogerEntity
      // 532e: ifeq 5350
      // 5331: aload 8
      // 5333: checkcast net/mocreatures/entity/LeogerEntity
      // 5336: astore 13
      // 5338: aload 13
      // 533a: invokevirtual net/mocreatures/entity/LeogerEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 533d: getstatic net/mocreatures/entity/LeogerEntity.DATA_Baby Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5340: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 5343: checkcast java/lang/Boolean
      // 5346: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 5349: ifeq 5350
      // 534c: bipush 1
      // 534d: goto 5351
      // 5350: bipush 0
      // 5351: ifne 537a
      // 5354: aload 8
      // 5356: instanceof net/minecraft/world/entity/TamableAnimal
      // 5359: ifeq 536b
      // 535c: aload 8
      // 535e: checkcast net/minecraft/world/entity/TamableAnimal
      // 5361: astore 14
      // 5363: aload 14
      // 5365: invokevirtual net/minecraft/world/entity/TamableAnimal.getOwner ()Lnet/minecraft/world/entity/LivingEntity;
      // 5368: goto 536c
      // 536b: aconst_null
      // 536c: aload 9
      // 536e: if_acmpne 5377
      // 5371: bipush 1
      // 5372: istore 10
      // 5374: goto 537a
      // 5377: bipush 0
      // 5378: istore 10
      // 537a: iload 10
      // 537c: ifeq 5d1a
      // 537f: aload 9
      // 5381: instanceof net/minecraft/world/entity/LivingEntity
      // 5384: ifeq 53ca
      // 5387: aload 9
      // 5389: checkcast net/minecraft/world/entity/LivingEntity
      // 538c: astore 12
      // 538e: new net/minecraft/world/item/ItemStack
      // 5391: dup
      // 5392: getstatic net/mocreatures/init/MocreaturesModItems.PET_AMULET_FULL Lnet/neoforged/neoforge/registries/DeferredItem;
      // 5395: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 5398: checkcast net/minecraft/world/level/ItemLike
      // 539b: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 539e: invokevirtual net/minecraft/world/item/ItemStack.copy ()Lnet/minecraft/world/item/ItemStack;
      // 53a1: astore 13
      // 53a3: aload 13
      // 53a5: bipush 1
      // 53a6: invokevirtual net/minecraft/world/item/ItemStack.setCount (I)V
      // 53a9: aload 12
      // 53ab: getstatic net/minecraft/world/InteractionHand.MAIN_HAND Lnet/minecraft/world/InteractionHand;
      // 53ae: aload 13
      // 53b0: invokevirtual net/minecraft/world/entity/LivingEntity.setItemInHand (Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/item/ItemStack;)V
      // 53b3: aload 12
      // 53b5: instanceof net/minecraft/world/entity/player/Player
      // 53b8: ifeq 53ca
      // 53bb: aload 12
      // 53bd: checkcast net/minecraft/world/entity/player/Player
      // 53c0: astore 14
      // 53c2: aload 14
      // 53c4: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 53c7: invokevirtual net/minecraft/world/entity/player/Inventory.setChanged ()V
      // 53ca: ldc_w "Mob"
      // 53cd: astore 12
      // 53cf: ldc_w "mocreatures:leoger"
      // 53d2: astore 13
      // 53d4: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 53d7: aload 9
      // 53d9: instanceof net/minecraft/world/entity/LivingEntity
      // 53dc: ifeq 53ee
      // 53df: aload 9
      // 53e1: checkcast net/minecraft/world/entity/LivingEntity
      // 53e4: astore 14
      // 53e6: aload 14
      // 53e8: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 53eb: goto 53f1
      // 53ee: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 53f1: invokedynamic accept ()Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$133 (Lnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 53f6: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 53f9: ldc_w "Name"
      // 53fc: astore 12
      // 53fe: aload 8
      // 5400: invokevirtual net/minecraft/world/entity/Entity.getDisplayName ()Lnet/minecraft/network/chat/Component;
      // 5403: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 5408: astore 13
      // 540a: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 540d: aload 9
      // 540f: instanceof net/minecraft/world/entity/LivingEntity
      // 5412: ifeq 5424
      // 5415: aload 9
      // 5417: checkcast net/minecraft/world/entity/LivingEntity
      // 541a: astore 14
      // 541c: aload 14
      // 541e: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 5421: goto 5427
      // 5424: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 5427: aload 13
      // 5429: invokedynamic accept (Ljava/lang/String;)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$134 (Ljava/lang/String;Lnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 542e: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 5431: aload 8
      // 5433: instanceof net/minecraft/world/entity/TamableAnimal
      // 5436: ifeq 5480
      // 5439: aload 8
      // 543b: checkcast net/minecraft/world/entity/TamableAnimal
      // 543e: astore 12
      // 5440: aload 12
      // 5442: invokevirtual net/minecraft/world/entity/TamableAnimal.isTame ()Z
      // 5445: ifeq 5480
      // 5448: ldc_w "Owner"
      // 544b: astore 13
      // 544d: aload 9
      // 544f: invokevirtual net/minecraft/world/entity/Entity.getDisplayName ()Lnet/minecraft/network/chat/Component;
      // 5452: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 5457: astore 14
      // 5459: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 545c: aload 9
      // 545e: instanceof net/minecraft/world/entity/LivingEntity
      // 5461: ifeq 5473
      // 5464: aload 9
      // 5466: checkcast net/minecraft/world/entity/LivingEntity
      // 5469: astore 15
      // 546b: aload 15
      // 546d: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 5470: goto 5476
      // 5473: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 5476: aload 14
      // 5478: invokedynamic accept (Ljava/lang/String;)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$135 (Ljava/lang/String;Lnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 547d: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 5480: ldc_w "Leashed"
      // 5483: astore 12
      // 5485: aload 8
      // 5487: instanceof net/minecraft/world/entity/Mob
      // 548a: ifeq 549c
      // 548d: aload 8
      // 548f: checkcast net/minecraft/world/entity/Mob
      // 5492: astore 14
      // 5494: aload 14
      // 5496: invokevirtual net/minecraft/world/entity/Mob.isLeashed ()Z
      // 5499: goto 549d
      // 549c: bipush 0
      // 549d: istore 13
      // 549f: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 54a2: aload 9
      // 54a4: instanceof net/minecraft/world/entity/LivingEntity
      // 54a7: ifeq 54b9
      // 54aa: aload 9
      // 54ac: checkcast net/minecraft/world/entity/LivingEntity
      // 54af: astore 14
      // 54b1: aload 14
      // 54b3: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 54b6: goto 54bc
      // 54b9: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 54bc: iload 13
      // 54be: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$136 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 54c3: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 54c6: ldc_w "NoGravity"
      // 54c9: astore 12
      // 54cb: aload 8
      // 54cd: invokevirtual net/minecraft/world/entity/Entity.isNoGravity ()Z
      // 54d0: istore 13
      // 54d2: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 54d5: aload 9
      // 54d7: instanceof net/minecraft/world/entity/LivingEntity
      // 54da: ifeq 54ec
      // 54dd: aload 9
      // 54df: checkcast net/minecraft/world/entity/LivingEntity
      // 54e2: astore 14
      // 54e4: aload 14
      // 54e6: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 54e9: goto 54ef
      // 54ec: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 54ef: iload 13
      // 54f1: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$137 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 54f6: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 54f9: ldc_w "MaxHealth"
      // 54fc: astore 12
      // 54fe: aload 8
      // 5500: instanceof net/minecraft/world/entity/LivingEntity
      // 5503: ifeq 5516
      // 5506: aload 8
      // 5508: checkcast net/minecraft/world/entity/LivingEntity
      // 550b: astore 15
      // 550d: aload 15
      // 550f: invokevirtual net/minecraft/world/entity/LivingEntity.getMaxHealth ()F
      // 5512: f2d
      // 5513: goto 5519
      // 5516: ldc2_w -1.0
      // 5519: dstore 13
      // 551b: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 551e: aload 9
      // 5520: instanceof net/minecraft/world/entity/LivingEntity
      // 5523: ifeq 5535
      // 5526: aload 9
      // 5528: checkcast net/minecraft/world/entity/LivingEntity
      // 552b: astore 15
      // 552d: aload 15
      // 552f: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 5532: goto 5538
      // 5535: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 5538: dload 13
      // 553a: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$138 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 553f: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 5542: ldc_w "Health"
      // 5545: astore 12
      // 5547: aload 8
      // 5549: instanceof net/minecraft/world/entity/LivingEntity
      // 554c: ifeq 555f
      // 554f: aload 8
      // 5551: checkcast net/minecraft/world/entity/LivingEntity
      // 5554: astore 15
      // 5556: aload 15
      // 5558: invokevirtual net/minecraft/world/entity/LivingEntity.getHealth ()F
      // 555b: f2d
      // 555c: goto 5562
      // 555f: ldc2_w -1.0
      // 5562: dstore 13
      // 5564: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 5567: aload 9
      // 5569: instanceof net/minecraft/world/entity/LivingEntity
      // 556c: ifeq 557e
      // 556f: aload 9
      // 5571: checkcast net/minecraft/world/entity/LivingEntity
      // 5574: astore 15
      // 5576: aload 15
      // 5578: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 557b: goto 5581
      // 557e: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 5581: dload 13
      // 5583: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$139 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 5588: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 558b: ldc_w "Air"
      // 558e: astore 12
      // 5590: aload 8
      // 5592: invokevirtual net/minecraft/world/entity/Entity.getAirSupply ()I
      // 5595: i2d
      // 5596: dstore 13
      // 5598: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 559b: aload 9
      // 559d: instanceof net/minecraft/world/entity/LivingEntity
      // 55a0: ifeq 55b2
      // 55a3: aload 9
      // 55a5: checkcast net/minecraft/world/entity/LivingEntity
      // 55a8: astore 15
      // 55aa: aload 15
      // 55ac: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 55af: goto 55b5
      // 55b2: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 55b5: dload 13
      // 55b7: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$140 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 55bc: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 55bf: ldc_w "MotionX"
      // 55c2: astore 12
      // 55c4: aload 8
      // 55c6: invokevirtual net/minecraft/world/entity/Entity.getDeltaMovement ()Lnet/minecraft/world/phys/Vec3;
      // 55c9: invokevirtual net/minecraft/world/phys/Vec3.x ()D
      // 55cc: dstore 13
      // 55ce: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 55d1: aload 9
      // 55d3: instanceof net/minecraft/world/entity/LivingEntity
      // 55d6: ifeq 55e8
      // 55d9: aload 9
      // 55db: checkcast net/minecraft/world/entity/LivingEntity
      // 55de: astore 15
      // 55e0: aload 15
      // 55e2: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 55e5: goto 55eb
      // 55e8: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 55eb: dload 13
      // 55ed: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$141 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 55f2: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 55f5: ldc_w "MotionY"
      // 55f8: astore 12
      // 55fa: aload 8
      // 55fc: invokevirtual net/minecraft/world/entity/Entity.getDeltaMovement ()Lnet/minecraft/world/phys/Vec3;
      // 55ff: invokevirtual net/minecraft/world/phys/Vec3.y ()D
      // 5602: dstore 13
      // 5604: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 5607: aload 9
      // 5609: instanceof net/minecraft/world/entity/LivingEntity
      // 560c: ifeq 561e
      // 560f: aload 9
      // 5611: checkcast net/minecraft/world/entity/LivingEntity
      // 5614: astore 15
      // 5616: aload 15
      // 5618: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 561b: goto 5621
      // 561e: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 5621: dload 13
      // 5623: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$142 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 5628: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 562b: ldc_w "MotionZ"
      // 562e: astore 12
      // 5630: aload 8
      // 5632: invokevirtual net/minecraft/world/entity/Entity.getDeltaMovement ()Lnet/minecraft/world/phys/Vec3;
      // 5635: invokevirtual net/minecraft/world/phys/Vec3.z ()D
      // 5638: dstore 13
      // 563a: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 563d: aload 9
      // 563f: instanceof net/minecraft/world/entity/LivingEntity
      // 5642: ifeq 5654
      // 5645: aload 9
      // 5647: checkcast net/minecraft/world/entity/LivingEntity
      // 564a: astore 15
      // 564c: aload 15
      // 564e: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 5651: goto 5657
      // 5654: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 5657: dload 13
      // 5659: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$143 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 565e: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 5661: ldc_w "RotationYaw"
      // 5664: astore 12
      // 5666: aload 8
      // 5668: invokevirtual net/minecraft/world/entity/Entity.getYRot ()F
      // 566b: f2d
      // 566c: dstore 13
      // 566e: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 5671: aload 9
      // 5673: instanceof net/minecraft/world/entity/LivingEntity
      // 5676: ifeq 5688
      // 5679: aload 9
      // 567b: checkcast net/minecraft/world/entity/LivingEntity
      // 567e: astore 15
      // 5680: aload 15
      // 5682: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 5685: goto 568b
      // 5688: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 568b: dload 13
      // 568d: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$144 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 5692: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 5695: ldc_w "RotationPitch"
      // 5698: astore 12
      // 569a: aload 8
      // 569c: invokevirtual net/minecraft/world/entity/Entity.getXRot ()F
      // 569f: f2d
      // 56a0: dstore 13
      // 56a2: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 56a5: aload 9
      // 56a7: instanceof net/minecraft/world/entity/LivingEntity
      // 56aa: ifeq 56bc
      // 56ad: aload 9
      // 56af: checkcast net/minecraft/world/entity/LivingEntity
      // 56b2: astore 15
      // 56b4: aload 15
      // 56b6: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 56b9: goto 56bf
      // 56bc: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 56bf: dload 13
      // 56c1: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$145 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 56c6: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 56c9: ldc_w "Gender"
      // 56cc: astore 12
      // 56ce: aload 8
      // 56d0: instanceof net/mocreatures/entity/LeogerEntity
      // 56d3: ifeq 56f2
      // 56d6: aload 8
      // 56d8: checkcast net/mocreatures/entity/LeogerEntity
      // 56db: astore 15
      // 56dd: aload 15
      // 56df: invokevirtual net/mocreatures/entity/LeogerEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 56e2: getstatic net/mocreatures/entity/LeogerEntity.DATA_Gender Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 56e5: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 56e8: checkcast java/lang/Integer
      // 56eb: invokevirtual java/lang/Integer.intValue ()I
      // 56ee: i2d
      // 56ef: goto 56f3
      // 56f2: dconst_0
      // 56f3: dstore 13
      // 56f5: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 56f8: aload 9
      // 56fa: instanceof net/minecraft/world/entity/LivingEntity
      // 56fd: ifeq 570f
      // 5700: aload 9
      // 5702: checkcast net/minecraft/world/entity/LivingEntity
      // 5705: astore 15
      // 5707: aload 15
      // 5709: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 570c: goto 5712
      // 570f: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 5712: dload 13
      // 5714: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$146 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 5719: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 571c: ldc_w "Color"
      // 571f: astore 12
      // 5721: aload 8
      // 5723: instanceof net/mocreatures/entity/LeogerEntity
      // 5726: ifeq 5745
      // 5729: aload 8
      // 572b: checkcast net/mocreatures/entity/LeogerEntity
      // 572e: astore 15
      // 5730: aload 15
      // 5732: invokevirtual net/mocreatures/entity/LeogerEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5735: getstatic net/mocreatures/entity/LeogerEntity.DATA_Color Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5738: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 573b: checkcast java/lang/Integer
      // 573e: invokevirtual java/lang/Integer.intValue ()I
      // 5741: i2d
      // 5742: goto 5746
      // 5745: dconst_0
      // 5746: dstore 13
      // 5748: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 574b: aload 9
      // 574d: instanceof net/minecraft/world/entity/LivingEntity
      // 5750: ifeq 5762
      // 5753: aload 9
      // 5755: checkcast net/minecraft/world/entity/LivingEntity
      // 5758: astore 15
      // 575a: aload 15
      // 575c: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 575f: goto 5765
      // 5762: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 5765: dload 13
      // 5767: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$147 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 576c: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 576f: ldc_w "Wings"
      // 5772: astore 12
      // 5774: aload 8
      // 5776: instanceof net/mocreatures/entity/LeogerEntity
      // 5779: ifeq 579b
      // 577c: aload 8
      // 577e: checkcast net/mocreatures/entity/LeogerEntity
      // 5781: astore 14
      // 5783: aload 14
      // 5785: invokevirtual net/mocreatures/entity/LeogerEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5788: getstatic net/mocreatures/entity/LeogerEntity.DATA_Wings Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 578b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 578e: checkcast java/lang/Boolean
      // 5791: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 5794: ifeq 579b
      // 5797: bipush 1
      // 5798: goto 579c
      // 579b: bipush 0
      // 579c: istore 13
      // 579e: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 57a1: aload 9
      // 57a3: instanceof net/minecraft/world/entity/LivingEntity
      // 57a6: ifeq 57b8
      // 57a9: aload 9
      // 57ab: checkcast net/minecraft/world/entity/LivingEntity
      // 57ae: astore 14
      // 57b0: aload 14
      // 57b2: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 57b5: goto 57bb
      // 57b8: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 57bb: iload 13
      // 57bd: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$148 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 57c2: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 57c5: ldc_w "Medallion"
      // 57c8: astore 12
      // 57ca: aload 8
      // 57cc: instanceof net/mocreatures/entity/LeogerEntity
      // 57cf: ifeq 57f1
      // 57d2: aload 8
      // 57d4: checkcast net/mocreatures/entity/LeogerEntity
      // 57d7: astore 14
      // 57d9: aload 14
      // 57db: invokevirtual net/mocreatures/entity/LeogerEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 57de: getstatic net/mocreatures/entity/LeogerEntity.DATA_Medallion Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 57e1: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 57e4: checkcast java/lang/Boolean
      // 57e7: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 57ea: ifeq 57f1
      // 57ed: bipush 1
      // 57ee: goto 57f2
      // 57f1: bipush 0
      // 57f2: istore 13
      // 57f4: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 57f7: aload 9
      // 57f9: instanceof net/minecraft/world/entity/LivingEntity
      // 57fc: ifeq 580e
      // 57ff: aload 9
      // 5801: checkcast net/minecraft/world/entity/LivingEntity
      // 5804: astore 14
      // 5806: aload 14
      // 5808: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 580b: goto 5811
      // 580e: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 5811: iload 13
      // 5813: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$149 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 5818: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 581b: aload 8
      // 581d: invokevirtual net/minecraft/world/entity/Entity.getType ()Lnet/minecraft/world/entity/EntityType;
      // 5820: getstatic net/minecraft/core/registries/Registries.ENTITY_TYPE Lnet/minecraft/resources/ResourceKey;
      // 5823: ldc_w "mocreatures:leoger"
      // 5826: invokestatic net/minecraft/resources/ResourceLocation.parse (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
      // 5829: invokestatic net/minecraft/tags/TagKey.create (Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
      // 582c: invokevirtual net/minecraft/world/entity/EntityType.is (Lnet/minecraft/tags/TagKey;)Z
      // 582f: ifeq 5d1a
      // 5832: aload 8
      // 5834: instanceof net/mocreatures/entity/LeogerEntity
      // 5837: ifeq 5859
      // 583a: aload 8
      // 583c: checkcast net/mocreatures/entity/LeogerEntity
      // 583f: astore 12
      // 5841: aload 12
      // 5843: invokevirtual net/mocreatures/entity/LeogerEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5846: getstatic net/mocreatures/entity/LeogerEntity.DATA_Saddle Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5849: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 584c: checkcast java/lang/Boolean
      // 584f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 5852: ifeq 5859
      // 5855: bipush 1
      // 5856: goto 585a
      // 5859: bipush 0
      // 585a: bipush 1
      // 585b: if_icmpne 589a
      // 585e: aload 1
      // 585f: instanceof net/minecraft/server/level/ServerLevel
      // 5862: ifeq 589a
      // 5865: aload 1
      // 5866: checkcast net/minecraft/server/level/ServerLevel
      // 5869: astore 13
      // 586b: new net/minecraft/world/entity/item/ItemEntity
      // 586e: dup
      // 586f: aload 13
      // 5871: dload 2
      // 5872: dload 4
      // 5874: dload 6
      // 5876: new net/minecraft/world/item/ItemStack
      // 5879: dup
      // 587a: getstatic net/mocreatures/init/MocreaturesModItems.CRAFTED_SADDLE Lnet/neoforged/neoforge/registries/DeferredItem;
      // 587d: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 5880: checkcast net/minecraft/world/level/ItemLike
      // 5883: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 5886: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5889: astore 14
      // 588b: aload 14
      // 588d: bipush 10
      // 588f: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5892: aload 13
      // 5894: aload 14
      // 5896: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5899: pop
      // 589a: aload 8
      // 589c: instanceof net/mocreatures/entity/LeogerEntity
      // 589f: ifeq 58c1
      // 58a2: aload 8
      // 58a4: checkcast net/mocreatures/entity/LeogerEntity
      // 58a7: astore 12
      // 58a9: aload 12
      // 58ab: invokevirtual net/mocreatures/entity/LeogerEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 58ae: getstatic net/mocreatures/entity/LeogerEntity.DATA_Chest Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 58b1: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 58b4: checkcast java/lang/Boolean
      // 58b7: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 58ba: ifeq 58c1
      // 58bd: bipush 1
      // 58be: goto 58c2
      // 58c1: bipush 0
      // 58c2: bipush 1
      // 58c3: if_icmpne 58fc
      // 58c6: aload 1
      // 58c7: instanceof net/minecraft/server/level/ServerLevel
      // 58ca: ifeq 58fc
      // 58cd: aload 1
      // 58ce: checkcast net/minecraft/server/level/ServerLevel
      // 58d1: astore 13
      // 58d3: new net/minecraft/world/entity/item/ItemEntity
      // 58d6: dup
      // 58d7: aload 13
      // 58d9: dload 2
      // 58da: dload 4
      // 58dc: dload 6
      // 58de: new net/minecraft/world/item/ItemStack
      // 58e1: dup
      // 58e2: getstatic net/minecraft/world/level/block/Blocks.CHEST Lnet/minecraft/world/level/block/Block;
      // 58e5: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 58e8: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 58eb: astore 14
      // 58ed: aload 14
      // 58ef: bipush 10
      // 58f1: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 58f4: aload 13
      // 58f6: aload 14
      // 58f8: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 58fb: pop
      // 58fc: aload 1
      // 58fd: instanceof net/minecraft/server/level/ServerLevel
      // 5900: ifeq 5935
      // 5903: aload 1
      // 5904: checkcast net/minecraft/server/level/ServerLevel
      // 5907: astore 12
      // 5909: new net/minecraft/world/entity/item/ItemEntity
      // 590c: dup
      // 590d: aload 12
      // 590f: dload 2
      // 5910: dload 4
      // 5912: dload 6
      // 5914: new net/mocreatures/procedures/PetAmuletCapture2Procedure$145
      // 5917: dup
      // 5918: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$145.<init> ()V
      // 591b: bipush 0
      // 591c: aload 8
      // 591e: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$145.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 5921: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5924: astore 13
      // 5926: aload 13
      // 5928: bipush 10
      // 592a: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 592d: aload 12
      // 592f: aload 13
      // 5931: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5934: pop
      // 5935: aload 1
      // 5936: instanceof net/minecraft/server/level/ServerLevel
      // 5939: ifeq 596e
      // 593c: aload 1
      // 593d: checkcast net/minecraft/server/level/ServerLevel
      // 5940: astore 12
      // 5942: new net/minecraft/world/entity/item/ItemEntity
      // 5945: dup
      // 5946: aload 12
      // 5948: dload 2
      // 5949: dload 4
      // 594b: dload 6
      // 594d: new net/mocreatures/procedures/PetAmuletCapture2Procedure$146
      // 5950: dup
      // 5951: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$146.<init> ()V
      // 5954: bipush 1
      // 5955: aload 8
      // 5957: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$146.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 595a: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 595d: astore 13
      // 595f: aload 13
      // 5961: bipush 10
      // 5963: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5966: aload 12
      // 5968: aload 13
      // 596a: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 596d: pop
      // 596e: aload 1
      // 596f: instanceof net/minecraft/server/level/ServerLevel
      // 5972: ifeq 59a7
      // 5975: aload 1
      // 5976: checkcast net/minecraft/server/level/ServerLevel
      // 5979: astore 12
      // 597b: new net/minecraft/world/entity/item/ItemEntity
      // 597e: dup
      // 597f: aload 12
      // 5981: dload 2
      // 5982: dload 4
      // 5984: dload 6
      // 5986: new net/mocreatures/procedures/PetAmuletCapture2Procedure$147
      // 5989: dup
      // 598a: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$147.<init> ()V
      // 598d: bipush 2
      // 598e: aload 8
      // 5990: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$147.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 5993: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5996: astore 13
      // 5998: aload 13
      // 599a: bipush 10
      // 599c: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 599f: aload 12
      // 59a1: aload 13
      // 59a3: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 59a6: pop
      // 59a7: aload 1
      // 59a8: instanceof net/minecraft/server/level/ServerLevel
      // 59ab: ifeq 59e0
      // 59ae: aload 1
      // 59af: checkcast net/minecraft/server/level/ServerLevel
      // 59b2: astore 12
      // 59b4: new net/minecraft/world/entity/item/ItemEntity
      // 59b7: dup
      // 59b8: aload 12
      // 59ba: dload 2
      // 59bb: dload 4
      // 59bd: dload 6
      // 59bf: new net/mocreatures/procedures/PetAmuletCapture2Procedure$148
      // 59c2: dup
      // 59c3: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$148.<init> ()V
      // 59c6: bipush 3
      // 59c7: aload 8
      // 59c9: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$148.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 59cc: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 59cf: astore 13
      // 59d1: aload 13
      // 59d3: bipush 10
      // 59d5: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 59d8: aload 12
      // 59da: aload 13
      // 59dc: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 59df: pop
      // 59e0: aload 1
      // 59e1: instanceof net/minecraft/server/level/ServerLevel
      // 59e4: ifeq 5a19
      // 59e7: aload 1
      // 59e8: checkcast net/minecraft/server/level/ServerLevel
      // 59eb: astore 12
      // 59ed: new net/minecraft/world/entity/item/ItemEntity
      // 59f0: dup
      // 59f1: aload 12
      // 59f3: dload 2
      // 59f4: dload 4
      // 59f6: dload 6
      // 59f8: new net/mocreatures/procedures/PetAmuletCapture2Procedure$149
      // 59fb: dup
      // 59fc: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$149.<init> ()V
      // 59ff: bipush 4
      // 5a00: aload 8
      // 5a02: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$149.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 5a05: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5a08: astore 13
      // 5a0a: aload 13
      // 5a0c: bipush 10
      // 5a0e: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5a11: aload 12
      // 5a13: aload 13
      // 5a15: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5a18: pop
      // 5a19: aload 1
      // 5a1a: instanceof net/minecraft/server/level/ServerLevel
      // 5a1d: ifeq 5a52
      // 5a20: aload 1
      // 5a21: checkcast net/minecraft/server/level/ServerLevel
      // 5a24: astore 12
      // 5a26: new net/minecraft/world/entity/item/ItemEntity
      // 5a29: dup
      // 5a2a: aload 12
      // 5a2c: dload 2
      // 5a2d: dload 4
      // 5a2f: dload 6
      // 5a31: new net/mocreatures/procedures/PetAmuletCapture2Procedure$150
      // 5a34: dup
      // 5a35: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$150.<init> ()V
      // 5a38: bipush 5
      // 5a39: aload 8
      // 5a3b: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$150.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 5a3e: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5a41: astore 13
      // 5a43: aload 13
      // 5a45: bipush 10
      // 5a47: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5a4a: aload 12
      // 5a4c: aload 13
      // 5a4e: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5a51: pop
      // 5a52: aload 1
      // 5a53: instanceof net/minecraft/server/level/ServerLevel
      // 5a56: ifeq 5a8c
      // 5a59: aload 1
      // 5a5a: checkcast net/minecraft/server/level/ServerLevel
      // 5a5d: astore 12
      // 5a5f: new net/minecraft/world/entity/item/ItemEntity
      // 5a62: dup
      // 5a63: aload 12
      // 5a65: dload 2
      // 5a66: dload 4
      // 5a68: dload 6
      // 5a6a: new net/mocreatures/procedures/PetAmuletCapture2Procedure$151
      // 5a6d: dup
      // 5a6e: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$151.<init> ()V
      // 5a71: bipush 6
      // 5a73: aload 8
      // 5a75: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$151.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 5a78: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5a7b: astore 13
      // 5a7d: aload 13
      // 5a7f: bipush 10
      // 5a81: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5a84: aload 12
      // 5a86: aload 13
      // 5a88: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5a8b: pop
      // 5a8c: aload 1
      // 5a8d: instanceof net/minecraft/server/level/ServerLevel
      // 5a90: ifeq 5ac6
      // 5a93: aload 1
      // 5a94: checkcast net/minecraft/server/level/ServerLevel
      // 5a97: astore 12
      // 5a99: new net/minecraft/world/entity/item/ItemEntity
      // 5a9c: dup
      // 5a9d: aload 12
      // 5a9f: dload 2
      // 5aa0: dload 4
      // 5aa2: dload 6
      // 5aa4: new net/mocreatures/procedures/PetAmuletCapture2Procedure$152
      // 5aa7: dup
      // 5aa8: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$152.<init> ()V
      // 5aab: bipush 7
      // 5aad: aload 8
      // 5aaf: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$152.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 5ab2: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5ab5: astore 13
      // 5ab7: aload 13
      // 5ab9: bipush 10
      // 5abb: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5abe: aload 12
      // 5ac0: aload 13
      // 5ac2: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5ac5: pop
      // 5ac6: aload 1
      // 5ac7: instanceof net/minecraft/server/level/ServerLevel
      // 5aca: ifeq 5b00
      // 5acd: aload 1
      // 5ace: checkcast net/minecraft/server/level/ServerLevel
      // 5ad1: astore 12
      // 5ad3: new net/minecraft/world/entity/item/ItemEntity
      // 5ad6: dup
      // 5ad7: aload 12
      // 5ad9: dload 2
      // 5ada: dload 4
      // 5adc: dload 6
      // 5ade: new net/mocreatures/procedures/PetAmuletCapture2Procedure$153
      // 5ae1: dup
      // 5ae2: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$153.<init> ()V
      // 5ae5: bipush 8
      // 5ae7: aload 8
      // 5ae9: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$153.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 5aec: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5aef: astore 13
      // 5af1: aload 13
      // 5af3: bipush 10
      // 5af5: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5af8: aload 12
      // 5afa: aload 13
      // 5afc: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5aff: pop
      // 5b00: aload 1
      // 5b01: instanceof net/minecraft/server/level/ServerLevel
      // 5b04: ifeq 5b3a
      // 5b07: aload 1
      // 5b08: checkcast net/minecraft/server/level/ServerLevel
      // 5b0b: astore 12
      // 5b0d: new net/minecraft/world/entity/item/ItemEntity
      // 5b10: dup
      // 5b11: aload 12
      // 5b13: dload 2
      // 5b14: dload 4
      // 5b16: dload 6
      // 5b18: new net/mocreatures/procedures/PetAmuletCapture2Procedure$154
      // 5b1b: dup
      // 5b1c: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$154.<init> ()V
      // 5b1f: bipush 9
      // 5b21: aload 8
      // 5b23: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$154.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 5b26: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5b29: astore 13
      // 5b2b: aload 13
      // 5b2d: bipush 10
      // 5b2f: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5b32: aload 12
      // 5b34: aload 13
      // 5b36: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5b39: pop
      // 5b3a: aload 1
      // 5b3b: instanceof net/minecraft/server/level/ServerLevel
      // 5b3e: ifeq 5b74
      // 5b41: aload 1
      // 5b42: checkcast net/minecraft/server/level/ServerLevel
      // 5b45: astore 12
      // 5b47: new net/minecraft/world/entity/item/ItemEntity
      // 5b4a: dup
      // 5b4b: aload 12
      // 5b4d: dload 2
      // 5b4e: dload 4
      // 5b50: dload 6
      // 5b52: new net/mocreatures/procedures/PetAmuletCapture2Procedure$155
      // 5b55: dup
      // 5b56: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$155.<init> ()V
      // 5b59: bipush 10
      // 5b5b: aload 8
      // 5b5d: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$155.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 5b60: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5b63: astore 13
      // 5b65: aload 13
      // 5b67: bipush 10
      // 5b69: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5b6c: aload 12
      // 5b6e: aload 13
      // 5b70: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5b73: pop
      // 5b74: aload 1
      // 5b75: instanceof net/minecraft/server/level/ServerLevel
      // 5b78: ifeq 5bae
      // 5b7b: aload 1
      // 5b7c: checkcast net/minecraft/server/level/ServerLevel
      // 5b7f: astore 12
      // 5b81: new net/minecraft/world/entity/item/ItemEntity
      // 5b84: dup
      // 5b85: aload 12
      // 5b87: dload 2
      // 5b88: dload 4
      // 5b8a: dload 6
      // 5b8c: new net/mocreatures/procedures/PetAmuletCapture2Procedure$156
      // 5b8f: dup
      // 5b90: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$156.<init> ()V
      // 5b93: bipush 11
      // 5b95: aload 8
      // 5b97: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$156.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 5b9a: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5b9d: astore 13
      // 5b9f: aload 13
      // 5ba1: bipush 10
      // 5ba3: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5ba6: aload 12
      // 5ba8: aload 13
      // 5baa: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5bad: pop
      // 5bae: aload 1
      // 5baf: instanceof net/minecraft/server/level/ServerLevel
      // 5bb2: ifeq 5be8
      // 5bb5: aload 1
      // 5bb6: checkcast net/minecraft/server/level/ServerLevel
      // 5bb9: astore 12
      // 5bbb: new net/minecraft/world/entity/item/ItemEntity
      // 5bbe: dup
      // 5bbf: aload 12
      // 5bc1: dload 2
      // 5bc2: dload 4
      // 5bc4: dload 6
      // 5bc6: new net/mocreatures/procedures/PetAmuletCapture2Procedure$157
      // 5bc9: dup
      // 5bca: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$157.<init> ()V
      // 5bcd: bipush 12
      // 5bcf: aload 8
      // 5bd1: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$157.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 5bd4: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5bd7: astore 13
      // 5bd9: aload 13
      // 5bdb: bipush 10
      // 5bdd: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5be0: aload 12
      // 5be2: aload 13
      // 5be4: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5be7: pop
      // 5be8: aload 1
      // 5be9: instanceof net/minecraft/server/level/ServerLevel
      // 5bec: ifeq 5c22
      // 5bef: aload 1
      // 5bf0: checkcast net/minecraft/server/level/ServerLevel
      // 5bf3: astore 12
      // 5bf5: new net/minecraft/world/entity/item/ItemEntity
      // 5bf8: dup
      // 5bf9: aload 12
      // 5bfb: dload 2
      // 5bfc: dload 4
      // 5bfe: dload 6
      // 5c00: new net/mocreatures/procedures/PetAmuletCapture2Procedure$158
      // 5c03: dup
      // 5c04: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$158.<init> ()V
      // 5c07: bipush 13
      // 5c09: aload 8
      // 5c0b: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$158.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 5c0e: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5c11: astore 13
      // 5c13: aload 13
      // 5c15: bipush 10
      // 5c17: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5c1a: aload 12
      // 5c1c: aload 13
      // 5c1e: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5c21: pop
      // 5c22: aload 1
      // 5c23: instanceof net/minecraft/server/level/ServerLevel
      // 5c26: ifeq 5c5c
      // 5c29: aload 1
      // 5c2a: checkcast net/minecraft/server/level/ServerLevel
      // 5c2d: astore 12
      // 5c2f: new net/minecraft/world/entity/item/ItemEntity
      // 5c32: dup
      // 5c33: aload 12
      // 5c35: dload 2
      // 5c36: dload 4
      // 5c38: dload 6
      // 5c3a: new net/mocreatures/procedures/PetAmuletCapture2Procedure$159
      // 5c3d: dup
      // 5c3e: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$159.<init> ()V
      // 5c41: bipush 14
      // 5c43: aload 8
      // 5c45: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$159.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 5c48: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5c4b: astore 13
      // 5c4d: aload 13
      // 5c4f: bipush 10
      // 5c51: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5c54: aload 12
      // 5c56: aload 13
      // 5c58: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5c5b: pop
      // 5c5c: aload 1
      // 5c5d: instanceof net/minecraft/server/level/ServerLevel
      // 5c60: ifeq 5c96
      // 5c63: aload 1
      // 5c64: checkcast net/minecraft/server/level/ServerLevel
      // 5c67: astore 12
      // 5c69: new net/minecraft/world/entity/item/ItemEntity
      // 5c6c: dup
      // 5c6d: aload 12
      // 5c6f: dload 2
      // 5c70: dload 4
      // 5c72: dload 6
      // 5c74: new net/mocreatures/procedures/PetAmuletCapture2Procedure$160
      // 5c77: dup
      // 5c78: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$160.<init> ()V
      // 5c7b: bipush 15
      // 5c7d: aload 8
      // 5c7f: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$160.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 5c82: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5c85: astore 13
      // 5c87: aload 13
      // 5c89: bipush 10
      // 5c8b: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5c8e: aload 12
      // 5c90: aload 13
      // 5c92: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5c95: pop
      // 5c96: aload 1
      // 5c97: instanceof net/minecraft/server/level/ServerLevel
      // 5c9a: ifeq 5cd0
      // 5c9d: aload 1
      // 5c9e: checkcast net/minecraft/server/level/ServerLevel
      // 5ca1: astore 12
      // 5ca3: new net/minecraft/world/entity/item/ItemEntity
      // 5ca6: dup
      // 5ca7: aload 12
      // 5ca9: dload 2
      // 5caa: dload 4
      // 5cac: dload 6
      // 5cae: new net/mocreatures/procedures/PetAmuletCapture2Procedure$161
      // 5cb1: dup
      // 5cb2: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$161.<init> ()V
      // 5cb5: bipush 16
      // 5cb7: aload 8
      // 5cb9: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$161.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 5cbc: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5cbf: astore 13
      // 5cc1: aload 13
      // 5cc3: bipush 10
      // 5cc5: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5cc8: aload 12
      // 5cca: aload 13
      // 5ccc: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5ccf: pop
      // 5cd0: aload 1
      // 5cd1: instanceof net/minecraft/server/level/ServerLevel
      // 5cd4: ifeq 5d0a
      // 5cd7: aload 1
      // 5cd8: checkcast net/minecraft/server/level/ServerLevel
      // 5cdb: astore 12
      // 5cdd: new net/minecraft/world/entity/item/ItemEntity
      // 5ce0: dup
      // 5ce1: aload 12
      // 5ce3: dload 2
      // 5ce4: dload 4
      // 5ce6: dload 6
      // 5ce8: new net/mocreatures/procedures/PetAmuletCapture2Procedure$162
      // 5ceb: dup
      // 5cec: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$162.<init> ()V
      // 5cef: bipush 17
      // 5cf1: aload 8
      // 5cf3: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$162.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 5cf6: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 5cf9: astore 13
      // 5cfb: aload 13
      // 5cfd: bipush 10
      // 5cff: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 5d02: aload 12
      // 5d04: aload 13
      // 5d06: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 5d09: pop
      // 5d0a: aload 8
      // 5d0c: invokevirtual net/minecraft/world/entity/Entity.level ()Lnet/minecraft/world/level/Level;
      // 5d0f: invokevirtual net/minecraft/world/level/Level.isClientSide ()Z
      // 5d12: ifne 5d1a
      // 5d15: aload 8
      // 5d17: invokevirtual net/minecraft/world/entity/Entity.discard ()V
      // 5d1a: aload 9
      // 5d1c: instanceof net/minecraft/world/entity/LivingEntity
      // 5d1f: ifeq 5d31
      // 5d22: aload 9
      // 5d24: checkcast net/minecraft/world/entity/LivingEntity
      // 5d27: astore 11
      // 5d29: aload 11
      // 5d2b: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 5d2e: goto 5d34
      // 5d31: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 5d34: ldc_w "mocreatures:amulet/empty"
      // 5d37: invokestatic net/minecraft/resources/ResourceLocation.parse (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
      // 5d3a: invokestatic net/minecraft/tags/ItemTags.create (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
      // 5d3d: invokevirtual net/minecraft/world/item/ItemStack.is (Lnet/minecraft/tags/TagKey;)Z
      // 5d40: ifeq 6762
      // 5d43: aload 8
      // 5d45: invokevirtual net/minecraft/world/entity/Entity.getType ()Lnet/minecraft/world/entity/EntityType;
      // 5d48: getstatic net/minecraft/core/registries/Registries.ENTITY_TYPE Lnet/minecraft/resources/ResourceKey;
      // 5d4b: ldc_w "mocreatures:liard"
      // 5d4e: invokestatic net/minecraft/resources/ResourceLocation.parse (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
      // 5d51: invokestatic net/minecraft/tags/TagKey.create (Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
      // 5d54: invokevirtual net/minecraft/world/entity/EntityType.is (Lnet/minecraft/tags/TagKey;)Z
      // 5d57: ifeq 6762
      // 5d5a: aload 8
      // 5d5c: instanceof net/minecraft/world/entity/TamableAnimal
      // 5d5f: ifeq 5dc2
      // 5d62: aload 8
      // 5d64: checkcast net/minecraft/world/entity/TamableAnimal
      // 5d67: astore 12
      // 5d69: aload 12
      // 5d6b: invokevirtual net/minecraft/world/entity/TamableAnimal.isTame ()Z
      // 5d6e: ifeq 5dc2
      // 5d71: aload 8
      // 5d73: instanceof net/mocreatures/entity/LiardEntity
      // 5d76: ifeq 5d98
      // 5d79: aload 8
      // 5d7b: checkcast net/mocreatures/entity/LiardEntity
      // 5d7e: astore 13
      // 5d80: aload 13
      // 5d82: invokevirtual net/mocreatures/entity/LiardEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 5d85: getstatic net/mocreatures/entity/LiardEntity.DATA_Baby Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 5d88: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 5d8b: checkcast java/lang/Boolean
      // 5d8e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 5d91: ifeq 5d98
      // 5d94: bipush 1
      // 5d95: goto 5d99
      // 5d98: bipush 0
      // 5d99: ifne 5dc2
      // 5d9c: aload 8
      // 5d9e: instanceof net/minecraft/world/entity/TamableAnimal
      // 5da1: ifeq 5db3
      // 5da4: aload 8
      // 5da6: checkcast net/minecraft/world/entity/TamableAnimal
      // 5da9: astore 14
      // 5dab: aload 14
      // 5dad: invokevirtual net/minecraft/world/entity/TamableAnimal.getOwner ()Lnet/minecraft/world/entity/LivingEntity;
      // 5db0: goto 5db4
      // 5db3: aconst_null
      // 5db4: aload 9
      // 5db6: if_acmpne 5dbf
      // 5db9: bipush 1
      // 5dba: istore 10
      // 5dbc: goto 5dc2
      // 5dbf: bipush 0
      // 5dc0: istore 10
      // 5dc2: iload 10
      // 5dc4: ifeq 6762
      // 5dc7: aload 9
      // 5dc9: instanceof net/minecraft/world/entity/LivingEntity
      // 5dcc: ifeq 5e12
      // 5dcf: aload 9
      // 5dd1: checkcast net/minecraft/world/entity/LivingEntity
      // 5dd4: astore 12
      // 5dd6: new net/minecraft/world/item/ItemStack
      // 5dd9: dup
      // 5dda: getstatic net/mocreatures/init/MocreaturesModItems.PET_AMULET_FULL Lnet/neoforged/neoforge/registries/DeferredItem;
      // 5ddd: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 5de0: checkcast net/minecraft/world/level/ItemLike
      // 5de3: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 5de6: invokevirtual net/minecraft/world/item/ItemStack.copy ()Lnet/minecraft/world/item/ItemStack;
      // 5de9: astore 13
      // 5deb: aload 13
      // 5ded: bipush 1
      // 5dee: invokevirtual net/minecraft/world/item/ItemStack.setCount (I)V
      // 5df1: aload 12
      // 5df3: getstatic net/minecraft/world/InteractionHand.MAIN_HAND Lnet/minecraft/world/InteractionHand;
      // 5df6: aload 13
      // 5df8: invokevirtual net/minecraft/world/entity/LivingEntity.setItemInHand (Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/item/ItemStack;)V
      // 5dfb: aload 12
      // 5dfd: instanceof net/minecraft/world/entity/player/Player
      // 5e00: ifeq 5e12
      // 5e03: aload 12
      // 5e05: checkcast net/minecraft/world/entity/player/Player
      // 5e08: astore 14
      // 5e0a: aload 14
      // 5e0c: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 5e0f: invokevirtual net/minecraft/world/entity/player/Inventory.setChanged ()V
      // 5e12: ldc_w "Mob"
      // 5e15: astore 12
      // 5e17: ldc_w "mocreatures:liard"
      // 5e1a: astore 13
      // 5e1c: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 5e1f: aload 9
      // 5e21: instanceof net/minecraft/world/entity/LivingEntity
      // 5e24: ifeq 5e36
      // 5e27: aload 9
      // 5e29: checkcast net/minecraft/world/entity/LivingEntity
      // 5e2c: astore 14
      // 5e2e: aload 14
      // 5e30: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 5e33: goto 5e39
      // 5e36: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 5e39: invokedynamic accept ()Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$150 (Lnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 5e3e: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 5e41: ldc_w "Name"
      // 5e44: astore 12
      // 5e46: aload 8
      // 5e48: invokevirtual net/minecraft/world/entity/Entity.getDisplayName ()Lnet/minecraft/network/chat/Component;
      // 5e4b: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 5e50: astore 13
      // 5e52: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 5e55: aload 9
      // 5e57: instanceof net/minecraft/world/entity/LivingEntity
      // 5e5a: ifeq 5e6c
      // 5e5d: aload 9
      // 5e5f: checkcast net/minecraft/world/entity/LivingEntity
      // 5e62: astore 14
      // 5e64: aload 14
      // 5e66: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 5e69: goto 5e6f
      // 5e6c: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 5e6f: aload 13
      // 5e71: invokedynamic accept (Ljava/lang/String;)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$151 (Ljava/lang/String;Lnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 5e76: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 5e79: aload 8
      // 5e7b: instanceof net/minecraft/world/entity/TamableAnimal
      // 5e7e: ifeq 5ec8
      // 5e81: aload 8
      // 5e83: checkcast net/minecraft/world/entity/TamableAnimal
      // 5e86: astore 12
      // 5e88: aload 12
      // 5e8a: invokevirtual net/minecraft/world/entity/TamableAnimal.isTame ()Z
      // 5e8d: ifeq 5ec8
      // 5e90: ldc_w "Owner"
      // 5e93: astore 13
      // 5e95: aload 9
      // 5e97: invokevirtual net/minecraft/world/entity/Entity.getDisplayName ()Lnet/minecraft/network/chat/Component;
      // 5e9a: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 5e9f: astore 14
      // 5ea1: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 5ea4: aload 9
      // 5ea6: instanceof net/minecraft/world/entity/LivingEntity
      // 5ea9: ifeq 5ebb
      // 5eac: aload 9
      // 5eae: checkcast net/minecraft/world/entity/LivingEntity
      // 5eb1: astore 15
      // 5eb3: aload 15
      // 5eb5: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 5eb8: goto 5ebe
      // 5ebb: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 5ebe: aload 14
      // 5ec0: invokedynamic accept (Ljava/lang/String;)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$152 (Ljava/lang/String;Lnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 5ec5: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 5ec8: ldc_w "Leashed"
      // 5ecb: astore 12
      // 5ecd: aload 8
      // 5ecf: instanceof net/minecraft/world/entity/Mob
      // 5ed2: ifeq 5ee4
      // 5ed5: aload 8
      // 5ed7: checkcast net/minecraft/world/entity/Mob
      // 5eda: astore 14
      // 5edc: aload 14
      // 5ede: invokevirtual net/minecraft/world/entity/Mob.isLeashed ()Z
      // 5ee1: goto 5ee5
      // 5ee4: bipush 0
      // 5ee5: istore 13
      // 5ee7: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 5eea: aload 9
      // 5eec: instanceof net/minecraft/world/entity/LivingEntity
      // 5eef: ifeq 5f01
      // 5ef2: aload 9
      // 5ef4: checkcast net/minecraft/world/entity/LivingEntity
      // 5ef7: astore 14
      // 5ef9: aload 14
      // 5efb: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 5efe: goto 5f04
      // 5f01: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 5f04: iload 13
      // 5f06: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$153 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 5f0b: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 5f0e: ldc_w "NoGravity"
      // 5f11: astore 12
      // 5f13: aload 8
      // 5f15: invokevirtual net/minecraft/world/entity/Entity.isNoGravity ()Z
      // 5f18: istore 13
      // 5f1a: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 5f1d: aload 9
      // 5f1f: instanceof net/minecraft/world/entity/LivingEntity
      // 5f22: ifeq 5f34
      // 5f25: aload 9
      // 5f27: checkcast net/minecraft/world/entity/LivingEntity
      // 5f2a: astore 14
      // 5f2c: aload 14
      // 5f2e: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 5f31: goto 5f37
      // 5f34: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 5f37: iload 13
      // 5f39: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$154 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 5f3e: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 5f41: ldc_w "MaxHealth"
      // 5f44: astore 12
      // 5f46: aload 8
      // 5f48: instanceof net/minecraft/world/entity/LivingEntity
      // 5f4b: ifeq 5f5e
      // 5f4e: aload 8
      // 5f50: checkcast net/minecraft/world/entity/LivingEntity
      // 5f53: astore 15
      // 5f55: aload 15
      // 5f57: invokevirtual net/minecraft/world/entity/LivingEntity.getMaxHealth ()F
      // 5f5a: f2d
      // 5f5b: goto 5f61
      // 5f5e: ldc2_w -1.0
      // 5f61: dstore 13
      // 5f63: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 5f66: aload 9
      // 5f68: instanceof net/minecraft/world/entity/LivingEntity
      // 5f6b: ifeq 5f7d
      // 5f6e: aload 9
      // 5f70: checkcast net/minecraft/world/entity/LivingEntity
      // 5f73: astore 15
      // 5f75: aload 15
      // 5f77: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 5f7a: goto 5f80
      // 5f7d: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 5f80: dload 13
      // 5f82: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$155 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 5f87: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 5f8a: ldc_w "Health"
      // 5f8d: astore 12
      // 5f8f: aload 8
      // 5f91: instanceof net/minecraft/world/entity/LivingEntity
      // 5f94: ifeq 5fa7
      // 5f97: aload 8
      // 5f99: checkcast net/minecraft/world/entity/LivingEntity
      // 5f9c: astore 15
      // 5f9e: aload 15
      // 5fa0: invokevirtual net/minecraft/world/entity/LivingEntity.getHealth ()F
      // 5fa3: f2d
      // 5fa4: goto 5faa
      // 5fa7: ldc2_w -1.0
      // 5faa: dstore 13
      // 5fac: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 5faf: aload 9
      // 5fb1: instanceof net/minecraft/world/entity/LivingEntity
      // 5fb4: ifeq 5fc6
      // 5fb7: aload 9
      // 5fb9: checkcast net/minecraft/world/entity/LivingEntity
      // 5fbc: astore 15
      // 5fbe: aload 15
      // 5fc0: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 5fc3: goto 5fc9
      // 5fc6: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 5fc9: dload 13
      // 5fcb: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$156 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 5fd0: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 5fd3: ldc_w "Air"
      // 5fd6: astore 12
      // 5fd8: aload 8
      // 5fda: invokevirtual net/minecraft/world/entity/Entity.getAirSupply ()I
      // 5fdd: i2d
      // 5fde: dstore 13
      // 5fe0: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 5fe3: aload 9
      // 5fe5: instanceof net/minecraft/world/entity/LivingEntity
      // 5fe8: ifeq 5ffa
      // 5feb: aload 9
      // 5fed: checkcast net/minecraft/world/entity/LivingEntity
      // 5ff0: astore 15
      // 5ff2: aload 15
      // 5ff4: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 5ff7: goto 5ffd
      // 5ffa: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 5ffd: dload 13
      // 5fff: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$157 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 6004: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 6007: ldc_w "MotionX"
      // 600a: astore 12
      // 600c: aload 8
      // 600e: invokevirtual net/minecraft/world/entity/Entity.getDeltaMovement ()Lnet/minecraft/world/phys/Vec3;
      // 6011: invokevirtual net/minecraft/world/phys/Vec3.x ()D
      // 6014: dstore 13
      // 6016: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 6019: aload 9
      // 601b: instanceof net/minecraft/world/entity/LivingEntity
      // 601e: ifeq 6030
      // 6021: aload 9
      // 6023: checkcast net/minecraft/world/entity/LivingEntity
      // 6026: astore 15
      // 6028: aload 15
      // 602a: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 602d: goto 6033
      // 6030: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 6033: dload 13
      // 6035: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$158 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 603a: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 603d: ldc_w "MotionY"
      // 6040: astore 12
      // 6042: aload 8
      // 6044: invokevirtual net/minecraft/world/entity/Entity.getDeltaMovement ()Lnet/minecraft/world/phys/Vec3;
      // 6047: invokevirtual net/minecraft/world/phys/Vec3.y ()D
      // 604a: dstore 13
      // 604c: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 604f: aload 9
      // 6051: instanceof net/minecraft/world/entity/LivingEntity
      // 6054: ifeq 6066
      // 6057: aload 9
      // 6059: checkcast net/minecraft/world/entity/LivingEntity
      // 605c: astore 15
      // 605e: aload 15
      // 6060: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 6063: goto 6069
      // 6066: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 6069: dload 13
      // 606b: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$159 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 6070: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 6073: ldc_w "MotionZ"
      // 6076: astore 12
      // 6078: aload 8
      // 607a: invokevirtual net/minecraft/world/entity/Entity.getDeltaMovement ()Lnet/minecraft/world/phys/Vec3;
      // 607d: invokevirtual net/minecraft/world/phys/Vec3.z ()D
      // 6080: dstore 13
      // 6082: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 6085: aload 9
      // 6087: instanceof net/minecraft/world/entity/LivingEntity
      // 608a: ifeq 609c
      // 608d: aload 9
      // 608f: checkcast net/minecraft/world/entity/LivingEntity
      // 6092: astore 15
      // 6094: aload 15
      // 6096: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 6099: goto 609f
      // 609c: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 609f: dload 13
      // 60a1: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$160 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 60a6: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 60a9: ldc_w "RotationYaw"
      // 60ac: astore 12
      // 60ae: aload 8
      // 60b0: invokevirtual net/minecraft/world/entity/Entity.getYRot ()F
      // 60b3: f2d
      // 60b4: dstore 13
      // 60b6: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 60b9: aload 9
      // 60bb: instanceof net/minecraft/world/entity/LivingEntity
      // 60be: ifeq 60d0
      // 60c1: aload 9
      // 60c3: checkcast net/minecraft/world/entity/LivingEntity
      // 60c6: astore 15
      // 60c8: aload 15
      // 60ca: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 60cd: goto 60d3
      // 60d0: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 60d3: dload 13
      // 60d5: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$161 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 60da: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 60dd: ldc_w "RotationPitch"
      // 60e0: astore 12
      // 60e2: aload 8
      // 60e4: invokevirtual net/minecraft/world/entity/Entity.getXRot ()F
      // 60e7: f2d
      // 60e8: dstore 13
      // 60ea: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 60ed: aload 9
      // 60ef: instanceof net/minecraft/world/entity/LivingEntity
      // 60f2: ifeq 6104
      // 60f5: aload 9
      // 60f7: checkcast net/minecraft/world/entity/LivingEntity
      // 60fa: astore 15
      // 60fc: aload 15
      // 60fe: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 6101: goto 6107
      // 6104: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 6107: dload 13
      // 6109: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$162 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 610e: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 6111: ldc_w "Gender"
      // 6114: astore 12
      // 6116: aload 8
      // 6118: instanceof net/mocreatures/entity/LiardEntity
      // 611b: ifeq 613a
      // 611e: aload 8
      // 6120: checkcast net/mocreatures/entity/LiardEntity
      // 6123: astore 15
      // 6125: aload 15
      // 6127: invokevirtual net/mocreatures/entity/LiardEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 612a: getstatic net/mocreatures/entity/LiardEntity.DATA_Gender Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 612d: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 6130: checkcast java/lang/Integer
      // 6133: invokevirtual java/lang/Integer.intValue ()I
      // 6136: i2d
      // 6137: goto 613b
      // 613a: dconst_0
      // 613b: dstore 13
      // 613d: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 6140: aload 9
      // 6142: instanceof net/minecraft/world/entity/LivingEntity
      // 6145: ifeq 6157
      // 6148: aload 9
      // 614a: checkcast net/minecraft/world/entity/LivingEntity
      // 614d: astore 15
      // 614f: aload 15
      // 6151: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 6154: goto 615a
      // 6157: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 615a: dload 13
      // 615c: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$163 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 6161: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 6164: ldc_w "Color"
      // 6167: astore 12
      // 6169: aload 8
      // 616b: instanceof net/mocreatures/entity/LiardEntity
      // 616e: ifeq 618d
      // 6171: aload 8
      // 6173: checkcast net/mocreatures/entity/LiardEntity
      // 6176: astore 15
      // 6178: aload 15
      // 617a: invokevirtual net/mocreatures/entity/LiardEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 617d: getstatic net/mocreatures/entity/LiardEntity.DATA_Color Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 6180: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 6183: checkcast java/lang/Integer
      // 6186: invokevirtual java/lang/Integer.intValue ()I
      // 6189: i2d
      // 618a: goto 618e
      // 618d: dconst_0
      // 618e: dstore 13
      // 6190: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 6193: aload 9
      // 6195: instanceof net/minecraft/world/entity/LivingEntity
      // 6198: ifeq 61aa
      // 619b: aload 9
      // 619d: checkcast net/minecraft/world/entity/LivingEntity
      // 61a0: astore 15
      // 61a2: aload 15
      // 61a4: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 61a7: goto 61ad
      // 61aa: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 61ad: dload 13
      // 61af: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$164 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 61b4: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 61b7: ldc_w "Wings"
      // 61ba: astore 12
      // 61bc: aload 8
      // 61be: instanceof net/mocreatures/entity/LiardEntity
      // 61c1: ifeq 61e3
      // 61c4: aload 8
      // 61c6: checkcast net/mocreatures/entity/LiardEntity
      // 61c9: astore 14
      // 61cb: aload 14
      // 61cd: invokevirtual net/mocreatures/entity/LiardEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 61d0: getstatic net/mocreatures/entity/LiardEntity.DATA_Wings Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 61d3: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 61d6: checkcast java/lang/Boolean
      // 61d9: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 61dc: ifeq 61e3
      // 61df: bipush 1
      // 61e0: goto 61e4
      // 61e3: bipush 0
      // 61e4: istore 13
      // 61e6: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 61e9: aload 9
      // 61eb: instanceof net/minecraft/world/entity/LivingEntity
      // 61ee: ifeq 6200
      // 61f1: aload 9
      // 61f3: checkcast net/minecraft/world/entity/LivingEntity
      // 61f6: astore 14
      // 61f8: aload 14
      // 61fa: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 61fd: goto 6203
      // 6200: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 6203: iload 13
      // 6205: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$165 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 620a: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 620d: ldc_w "Medallion"
      // 6210: astore 12
      // 6212: aload 8
      // 6214: instanceof net/mocreatures/entity/LiardEntity
      // 6217: ifeq 6239
      // 621a: aload 8
      // 621c: checkcast net/mocreatures/entity/LiardEntity
      // 621f: astore 14
      // 6221: aload 14
      // 6223: invokevirtual net/mocreatures/entity/LiardEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 6226: getstatic net/mocreatures/entity/LiardEntity.DATA_Medallion Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 6229: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 622c: checkcast java/lang/Boolean
      // 622f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 6232: ifeq 6239
      // 6235: bipush 1
      // 6236: goto 623a
      // 6239: bipush 0
      // 623a: istore 13
      // 623c: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 623f: aload 9
      // 6241: instanceof net/minecraft/world/entity/LivingEntity
      // 6244: ifeq 6256
      // 6247: aload 9
      // 6249: checkcast net/minecraft/world/entity/LivingEntity
      // 624c: astore 14
      // 624e: aload 14
      // 6250: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 6253: goto 6259
      // 6256: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 6259: iload 13
      // 625b: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$166 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 6260: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 6263: aload 8
      // 6265: invokevirtual net/minecraft/world/entity/Entity.getType ()Lnet/minecraft/world/entity/EntityType;
      // 6268: getstatic net/minecraft/core/registries/Registries.ENTITY_TYPE Lnet/minecraft/resources/ResourceKey;
      // 626b: ldc_w "mocreatures:liard"
      // 626e: invokestatic net/minecraft/resources/ResourceLocation.parse (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
      // 6271: invokestatic net/minecraft/tags/TagKey.create (Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
      // 6274: invokevirtual net/minecraft/world/entity/EntityType.is (Lnet/minecraft/tags/TagKey;)Z
      // 6277: ifeq 6762
      // 627a: aload 8
      // 627c: instanceof net/mocreatures/entity/LiardEntity
      // 627f: ifeq 62a1
      // 6282: aload 8
      // 6284: checkcast net/mocreatures/entity/LiardEntity
      // 6287: astore 12
      // 6289: aload 12
      // 628b: invokevirtual net/mocreatures/entity/LiardEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 628e: getstatic net/mocreatures/entity/LiardEntity.DATA_Saddle Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 6291: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 6294: checkcast java/lang/Boolean
      // 6297: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 629a: ifeq 62a1
      // 629d: bipush 1
      // 629e: goto 62a2
      // 62a1: bipush 0
      // 62a2: bipush 1
      // 62a3: if_icmpne 62e2
      // 62a6: aload 1
      // 62a7: instanceof net/minecraft/server/level/ServerLevel
      // 62aa: ifeq 62e2
      // 62ad: aload 1
      // 62ae: checkcast net/minecraft/server/level/ServerLevel
      // 62b1: astore 13
      // 62b3: new net/minecraft/world/entity/item/ItemEntity
      // 62b6: dup
      // 62b7: aload 13
      // 62b9: dload 2
      // 62ba: dload 4
      // 62bc: dload 6
      // 62be: new net/minecraft/world/item/ItemStack
      // 62c1: dup
      // 62c2: getstatic net/mocreatures/init/MocreaturesModItems.CRAFTED_SADDLE Lnet/neoforged/neoforge/registries/DeferredItem;
      // 62c5: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 62c8: checkcast net/minecraft/world/level/ItemLike
      // 62cb: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 62ce: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 62d1: astore 14
      // 62d3: aload 14
      // 62d5: bipush 10
      // 62d7: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 62da: aload 13
      // 62dc: aload 14
      // 62de: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 62e1: pop
      // 62e2: aload 8
      // 62e4: instanceof net/mocreatures/entity/LiardEntity
      // 62e7: ifeq 6309
      // 62ea: aload 8
      // 62ec: checkcast net/mocreatures/entity/LiardEntity
      // 62ef: astore 12
      // 62f1: aload 12
      // 62f3: invokevirtual net/mocreatures/entity/LiardEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 62f6: getstatic net/mocreatures/entity/LiardEntity.DATA_Chest Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 62f9: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 62fc: checkcast java/lang/Boolean
      // 62ff: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 6302: ifeq 6309
      // 6305: bipush 1
      // 6306: goto 630a
      // 6309: bipush 0
      // 630a: bipush 1
      // 630b: if_icmpne 6344
      // 630e: aload 1
      // 630f: instanceof net/minecraft/server/level/ServerLevel
      // 6312: ifeq 6344
      // 6315: aload 1
      // 6316: checkcast net/minecraft/server/level/ServerLevel
      // 6319: astore 13
      // 631b: new net/minecraft/world/entity/item/ItemEntity
      // 631e: dup
      // 631f: aload 13
      // 6321: dload 2
      // 6322: dload 4
      // 6324: dload 6
      // 6326: new net/minecraft/world/item/ItemStack
      // 6329: dup
      // 632a: getstatic net/minecraft/world/level/block/Blocks.CHEST Lnet/minecraft/world/level/block/Block;
      // 632d: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 6330: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6333: astore 14
      // 6335: aload 14
      // 6337: bipush 10
      // 6339: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 633c: aload 13
      // 633e: aload 14
      // 6340: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 6343: pop
      // 6344: aload 1
      // 6345: instanceof net/minecraft/server/level/ServerLevel
      // 6348: ifeq 637d
      // 634b: aload 1
      // 634c: checkcast net/minecraft/server/level/ServerLevel
      // 634f: astore 12
      // 6351: new net/minecraft/world/entity/item/ItemEntity
      // 6354: dup
      // 6355: aload 12
      // 6357: dload 2
      // 6358: dload 4
      // 635a: dload 6
      // 635c: new net/mocreatures/procedures/PetAmuletCapture2Procedure$163
      // 635f: dup
      // 6360: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$163.<init> ()V
      // 6363: bipush 0
      // 6364: aload 8
      // 6366: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$163.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 6369: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 636c: astore 13
      // 636e: aload 13
      // 6370: bipush 10
      // 6372: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 6375: aload 12
      // 6377: aload 13
      // 6379: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 637c: pop
      // 637d: aload 1
      // 637e: instanceof net/minecraft/server/level/ServerLevel
      // 6381: ifeq 63b6
      // 6384: aload 1
      // 6385: checkcast net/minecraft/server/level/ServerLevel
      // 6388: astore 12
      // 638a: new net/minecraft/world/entity/item/ItemEntity
      // 638d: dup
      // 638e: aload 12
      // 6390: dload 2
      // 6391: dload 4
      // 6393: dload 6
      // 6395: new net/mocreatures/procedures/PetAmuletCapture2Procedure$164
      // 6398: dup
      // 6399: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$164.<init> ()V
      // 639c: bipush 1
      // 639d: aload 8
      // 639f: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$164.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 63a2: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 63a5: astore 13
      // 63a7: aload 13
      // 63a9: bipush 10
      // 63ab: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 63ae: aload 12
      // 63b0: aload 13
      // 63b2: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 63b5: pop
      // 63b6: aload 1
      // 63b7: instanceof net/minecraft/server/level/ServerLevel
      // 63ba: ifeq 63ef
      // 63bd: aload 1
      // 63be: checkcast net/minecraft/server/level/ServerLevel
      // 63c1: astore 12
      // 63c3: new net/minecraft/world/entity/item/ItemEntity
      // 63c6: dup
      // 63c7: aload 12
      // 63c9: dload 2
      // 63ca: dload 4
      // 63cc: dload 6
      // 63ce: new net/mocreatures/procedures/PetAmuletCapture2Procedure$165
      // 63d1: dup
      // 63d2: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$165.<init> ()V
      // 63d5: bipush 2
      // 63d6: aload 8
      // 63d8: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$165.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 63db: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 63de: astore 13
      // 63e0: aload 13
      // 63e2: bipush 10
      // 63e4: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 63e7: aload 12
      // 63e9: aload 13
      // 63eb: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 63ee: pop
      // 63ef: aload 1
      // 63f0: instanceof net/minecraft/server/level/ServerLevel
      // 63f3: ifeq 6428
      // 63f6: aload 1
      // 63f7: checkcast net/minecraft/server/level/ServerLevel
      // 63fa: astore 12
      // 63fc: new net/minecraft/world/entity/item/ItemEntity
      // 63ff: dup
      // 6400: aload 12
      // 6402: dload 2
      // 6403: dload 4
      // 6405: dload 6
      // 6407: new net/mocreatures/procedures/PetAmuletCapture2Procedure$166
      // 640a: dup
      // 640b: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$166.<init> ()V
      // 640e: bipush 3
      // 640f: aload 8
      // 6411: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$166.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 6414: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6417: astore 13
      // 6419: aload 13
      // 641b: bipush 10
      // 641d: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 6420: aload 12
      // 6422: aload 13
      // 6424: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 6427: pop
      // 6428: aload 1
      // 6429: instanceof net/minecraft/server/level/ServerLevel
      // 642c: ifeq 6461
      // 642f: aload 1
      // 6430: checkcast net/minecraft/server/level/ServerLevel
      // 6433: astore 12
      // 6435: new net/minecraft/world/entity/item/ItemEntity
      // 6438: dup
      // 6439: aload 12
      // 643b: dload 2
      // 643c: dload 4
      // 643e: dload 6
      // 6440: new net/mocreatures/procedures/PetAmuletCapture2Procedure$167
      // 6443: dup
      // 6444: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$167.<init> ()V
      // 6447: bipush 4
      // 6448: aload 8
      // 644a: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$167.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 644d: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6450: astore 13
      // 6452: aload 13
      // 6454: bipush 10
      // 6456: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 6459: aload 12
      // 645b: aload 13
      // 645d: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 6460: pop
      // 6461: aload 1
      // 6462: instanceof net/minecraft/server/level/ServerLevel
      // 6465: ifeq 649a
      // 6468: aload 1
      // 6469: checkcast net/minecraft/server/level/ServerLevel
      // 646c: astore 12
      // 646e: new net/minecraft/world/entity/item/ItemEntity
      // 6471: dup
      // 6472: aload 12
      // 6474: dload 2
      // 6475: dload 4
      // 6477: dload 6
      // 6479: new net/mocreatures/procedures/PetAmuletCapture2Procedure$168
      // 647c: dup
      // 647d: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$168.<init> ()V
      // 6480: bipush 5
      // 6481: aload 8
      // 6483: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$168.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 6486: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6489: astore 13
      // 648b: aload 13
      // 648d: bipush 10
      // 648f: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 6492: aload 12
      // 6494: aload 13
      // 6496: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 6499: pop
      // 649a: aload 1
      // 649b: instanceof net/minecraft/server/level/ServerLevel
      // 649e: ifeq 64d4
      // 64a1: aload 1
      // 64a2: checkcast net/minecraft/server/level/ServerLevel
      // 64a5: astore 12
      // 64a7: new net/minecraft/world/entity/item/ItemEntity
      // 64aa: dup
      // 64ab: aload 12
      // 64ad: dload 2
      // 64ae: dload 4
      // 64b0: dload 6
      // 64b2: new net/mocreatures/procedures/PetAmuletCapture2Procedure$169
      // 64b5: dup
      // 64b6: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$169.<init> ()V
      // 64b9: bipush 6
      // 64bb: aload 8
      // 64bd: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$169.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 64c0: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 64c3: astore 13
      // 64c5: aload 13
      // 64c7: bipush 10
      // 64c9: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 64cc: aload 12
      // 64ce: aload 13
      // 64d0: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 64d3: pop
      // 64d4: aload 1
      // 64d5: instanceof net/minecraft/server/level/ServerLevel
      // 64d8: ifeq 650e
      // 64db: aload 1
      // 64dc: checkcast net/minecraft/server/level/ServerLevel
      // 64df: astore 12
      // 64e1: new net/minecraft/world/entity/item/ItemEntity
      // 64e4: dup
      // 64e5: aload 12
      // 64e7: dload 2
      // 64e8: dload 4
      // 64ea: dload 6
      // 64ec: new net/mocreatures/procedures/PetAmuletCapture2Procedure$170
      // 64ef: dup
      // 64f0: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$170.<init> ()V
      // 64f3: bipush 7
      // 64f5: aload 8
      // 64f7: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$170.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 64fa: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 64fd: astore 13
      // 64ff: aload 13
      // 6501: bipush 10
      // 6503: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 6506: aload 12
      // 6508: aload 13
      // 650a: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 650d: pop
      // 650e: aload 1
      // 650f: instanceof net/minecraft/server/level/ServerLevel
      // 6512: ifeq 6548
      // 6515: aload 1
      // 6516: checkcast net/minecraft/server/level/ServerLevel
      // 6519: astore 12
      // 651b: new net/minecraft/world/entity/item/ItemEntity
      // 651e: dup
      // 651f: aload 12
      // 6521: dload 2
      // 6522: dload 4
      // 6524: dload 6
      // 6526: new net/mocreatures/procedures/PetAmuletCapture2Procedure$171
      // 6529: dup
      // 652a: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$171.<init> ()V
      // 652d: bipush 8
      // 652f: aload 8
      // 6531: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$171.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 6534: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6537: astore 13
      // 6539: aload 13
      // 653b: bipush 10
      // 653d: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 6540: aload 12
      // 6542: aload 13
      // 6544: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 6547: pop
      // 6548: aload 1
      // 6549: instanceof net/minecraft/server/level/ServerLevel
      // 654c: ifeq 6582
      // 654f: aload 1
      // 6550: checkcast net/minecraft/server/level/ServerLevel
      // 6553: astore 12
      // 6555: new net/minecraft/world/entity/item/ItemEntity
      // 6558: dup
      // 6559: aload 12
      // 655b: dload 2
      // 655c: dload 4
      // 655e: dload 6
      // 6560: new net/mocreatures/procedures/PetAmuletCapture2Procedure$172
      // 6563: dup
      // 6564: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$172.<init> ()V
      // 6567: bipush 9
      // 6569: aload 8
      // 656b: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$172.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 656e: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6571: astore 13
      // 6573: aload 13
      // 6575: bipush 10
      // 6577: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 657a: aload 12
      // 657c: aload 13
      // 657e: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 6581: pop
      // 6582: aload 1
      // 6583: instanceof net/minecraft/server/level/ServerLevel
      // 6586: ifeq 65bc
      // 6589: aload 1
      // 658a: checkcast net/minecraft/server/level/ServerLevel
      // 658d: astore 12
      // 658f: new net/minecraft/world/entity/item/ItemEntity
      // 6592: dup
      // 6593: aload 12
      // 6595: dload 2
      // 6596: dload 4
      // 6598: dload 6
      // 659a: new net/mocreatures/procedures/PetAmuletCapture2Procedure$173
      // 659d: dup
      // 659e: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$173.<init> ()V
      // 65a1: bipush 10
      // 65a3: aload 8
      // 65a5: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$173.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 65a8: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 65ab: astore 13
      // 65ad: aload 13
      // 65af: bipush 10
      // 65b1: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 65b4: aload 12
      // 65b6: aload 13
      // 65b8: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 65bb: pop
      // 65bc: aload 1
      // 65bd: instanceof net/minecraft/server/level/ServerLevel
      // 65c0: ifeq 65f6
      // 65c3: aload 1
      // 65c4: checkcast net/minecraft/server/level/ServerLevel
      // 65c7: astore 12
      // 65c9: new net/minecraft/world/entity/item/ItemEntity
      // 65cc: dup
      // 65cd: aload 12
      // 65cf: dload 2
      // 65d0: dload 4
      // 65d2: dload 6
      // 65d4: new net/mocreatures/procedures/PetAmuletCapture2Procedure$174
      // 65d7: dup
      // 65d8: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$174.<init> ()V
      // 65db: bipush 11
      // 65dd: aload 8
      // 65df: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$174.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 65e2: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 65e5: astore 13
      // 65e7: aload 13
      // 65e9: bipush 10
      // 65eb: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 65ee: aload 12
      // 65f0: aload 13
      // 65f2: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 65f5: pop
      // 65f6: aload 1
      // 65f7: instanceof net/minecraft/server/level/ServerLevel
      // 65fa: ifeq 6630
      // 65fd: aload 1
      // 65fe: checkcast net/minecraft/server/level/ServerLevel
      // 6601: astore 12
      // 6603: new net/minecraft/world/entity/item/ItemEntity
      // 6606: dup
      // 6607: aload 12
      // 6609: dload 2
      // 660a: dload 4
      // 660c: dload 6
      // 660e: new net/mocreatures/procedures/PetAmuletCapture2Procedure$175
      // 6611: dup
      // 6612: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$175.<init> ()V
      // 6615: bipush 12
      // 6617: aload 8
      // 6619: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$175.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 661c: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 661f: astore 13
      // 6621: aload 13
      // 6623: bipush 10
      // 6625: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 6628: aload 12
      // 662a: aload 13
      // 662c: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 662f: pop
      // 6630: aload 1
      // 6631: instanceof net/minecraft/server/level/ServerLevel
      // 6634: ifeq 666a
      // 6637: aload 1
      // 6638: checkcast net/minecraft/server/level/ServerLevel
      // 663b: astore 12
      // 663d: new net/minecraft/world/entity/item/ItemEntity
      // 6640: dup
      // 6641: aload 12
      // 6643: dload 2
      // 6644: dload 4
      // 6646: dload 6
      // 6648: new net/mocreatures/procedures/PetAmuletCapture2Procedure$176
      // 664b: dup
      // 664c: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$176.<init> ()V
      // 664f: bipush 13
      // 6651: aload 8
      // 6653: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$176.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 6656: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6659: astore 13
      // 665b: aload 13
      // 665d: bipush 10
      // 665f: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 6662: aload 12
      // 6664: aload 13
      // 6666: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 6669: pop
      // 666a: aload 1
      // 666b: instanceof net/minecraft/server/level/ServerLevel
      // 666e: ifeq 66a4
      // 6671: aload 1
      // 6672: checkcast net/minecraft/server/level/ServerLevel
      // 6675: astore 12
      // 6677: new net/minecraft/world/entity/item/ItemEntity
      // 667a: dup
      // 667b: aload 12
      // 667d: dload 2
      // 667e: dload 4
      // 6680: dload 6
      // 6682: new net/mocreatures/procedures/PetAmuletCapture2Procedure$177
      // 6685: dup
      // 6686: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$177.<init> ()V
      // 6689: bipush 14
      // 668b: aload 8
      // 668d: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$177.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 6690: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6693: astore 13
      // 6695: aload 13
      // 6697: bipush 10
      // 6699: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 669c: aload 12
      // 669e: aload 13
      // 66a0: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 66a3: pop
      // 66a4: aload 1
      // 66a5: instanceof net/minecraft/server/level/ServerLevel
      // 66a8: ifeq 66de
      // 66ab: aload 1
      // 66ac: checkcast net/minecraft/server/level/ServerLevel
      // 66af: astore 12
      // 66b1: new net/minecraft/world/entity/item/ItemEntity
      // 66b4: dup
      // 66b5: aload 12
      // 66b7: dload 2
      // 66b8: dload 4
      // 66ba: dload 6
      // 66bc: new net/mocreatures/procedures/PetAmuletCapture2Procedure$178
      // 66bf: dup
      // 66c0: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$178.<init> ()V
      // 66c3: bipush 15
      // 66c5: aload 8
      // 66c7: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$178.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 66ca: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 66cd: astore 13
      // 66cf: aload 13
      // 66d1: bipush 10
      // 66d3: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 66d6: aload 12
      // 66d8: aload 13
      // 66da: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 66dd: pop
      // 66de: aload 1
      // 66df: instanceof net/minecraft/server/level/ServerLevel
      // 66e2: ifeq 6718
      // 66e5: aload 1
      // 66e6: checkcast net/minecraft/server/level/ServerLevel
      // 66e9: astore 12
      // 66eb: new net/minecraft/world/entity/item/ItemEntity
      // 66ee: dup
      // 66ef: aload 12
      // 66f1: dload 2
      // 66f2: dload 4
      // 66f4: dload 6
      // 66f6: new net/mocreatures/procedures/PetAmuletCapture2Procedure$179
      // 66f9: dup
      // 66fa: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$179.<init> ()V
      // 66fd: bipush 16
      // 66ff: aload 8
      // 6701: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$179.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 6704: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6707: astore 13
      // 6709: aload 13
      // 670b: bipush 10
      // 670d: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 6710: aload 12
      // 6712: aload 13
      // 6714: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 6717: pop
      // 6718: aload 1
      // 6719: instanceof net/minecraft/server/level/ServerLevel
      // 671c: ifeq 6752
      // 671f: aload 1
      // 6720: checkcast net/minecraft/server/level/ServerLevel
      // 6723: astore 12
      // 6725: new net/minecraft/world/entity/item/ItemEntity
      // 6728: dup
      // 6729: aload 12
      // 672b: dload 2
      // 672c: dload 4
      // 672e: dload 6
      // 6730: new net/mocreatures/procedures/PetAmuletCapture2Procedure$180
      // 6733: dup
      // 6734: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$180.<init> ()V
      // 6737: bipush 17
      // 6739: aload 8
      // 673b: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$180.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 673e: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6741: astore 13
      // 6743: aload 13
      // 6745: bipush 10
      // 6747: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 674a: aload 12
      // 674c: aload 13
      // 674e: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 6751: pop
      // 6752: aload 8
      // 6754: invokevirtual net/minecraft/world/entity/Entity.level ()Lnet/minecraft/world/level/Level;
      // 6757: invokevirtual net/minecraft/world/level/Level.isClientSide ()Z
      // 675a: ifne 6762
      // 675d: aload 8
      // 675f: invokevirtual net/minecraft/world/entity/Entity.discard ()V
      // 6762: aload 9
      // 6764: instanceof net/minecraft/world/entity/LivingEntity
      // 6767: ifeq 6779
      // 676a: aload 9
      // 676c: checkcast net/minecraft/world/entity/LivingEntity
      // 676f: astore 11
      // 6771: aload 11
      // 6773: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 6776: goto 677c
      // 6779: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 677c: ldc_w "mocreatures:amulet/empty"
      // 677f: invokestatic net/minecraft/resources/ResourceLocation.parse (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
      // 6782: invokestatic net/minecraft/tags/ItemTags.create (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
      // 6785: invokevirtual net/minecraft/world/item/ItemStack.is (Lnet/minecraft/tags/TagKey;)Z
      // 6788: ifeq 71aa
      // 678b: aload 8
      // 678d: invokevirtual net/minecraft/world/entity/Entity.getType ()Lnet/minecraft/world/entity/EntityType;
      // 6790: getstatic net/minecraft/core/registries/Registries.ENTITY_TYPE Lnet/minecraft/resources/ResourceKey;
      // 6793: ldc_w "mocreatures:liger"
      // 6796: invokestatic net/minecraft/resources/ResourceLocation.parse (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
      // 6799: invokestatic net/minecraft/tags/TagKey.create (Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
      // 679c: invokevirtual net/minecraft/world/entity/EntityType.is (Lnet/minecraft/tags/TagKey;)Z
      // 679f: ifeq 71aa
      // 67a2: aload 8
      // 67a4: instanceof net/minecraft/world/entity/TamableAnimal
      // 67a7: ifeq 680a
      // 67aa: aload 8
      // 67ac: checkcast net/minecraft/world/entity/TamableAnimal
      // 67af: astore 12
      // 67b1: aload 12
      // 67b3: invokevirtual net/minecraft/world/entity/TamableAnimal.isTame ()Z
      // 67b6: ifeq 680a
      // 67b9: aload 8
      // 67bb: instanceof net/mocreatures/entity/LigerEntity
      // 67be: ifeq 67e0
      // 67c1: aload 8
      // 67c3: checkcast net/mocreatures/entity/LigerEntity
      // 67c6: astore 13
      // 67c8: aload 13
      // 67ca: invokevirtual net/mocreatures/entity/LigerEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 67cd: getstatic net/mocreatures/entity/LigerEntity.DATA_Baby Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 67d0: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 67d3: checkcast java/lang/Boolean
      // 67d6: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 67d9: ifeq 67e0
      // 67dc: bipush 1
      // 67dd: goto 67e1
      // 67e0: bipush 0
      // 67e1: ifne 680a
      // 67e4: aload 8
      // 67e6: instanceof net/minecraft/world/entity/TamableAnimal
      // 67e9: ifeq 67fb
      // 67ec: aload 8
      // 67ee: checkcast net/minecraft/world/entity/TamableAnimal
      // 67f1: astore 14
      // 67f3: aload 14
      // 67f5: invokevirtual net/minecraft/world/entity/TamableAnimal.getOwner ()Lnet/minecraft/world/entity/LivingEntity;
      // 67f8: goto 67fc
      // 67fb: aconst_null
      // 67fc: aload 9
      // 67fe: if_acmpne 6807
      // 6801: bipush 1
      // 6802: istore 10
      // 6804: goto 680a
      // 6807: bipush 0
      // 6808: istore 10
      // 680a: iload 10
      // 680c: ifeq 71aa
      // 680f: aload 9
      // 6811: instanceof net/minecraft/world/entity/LivingEntity
      // 6814: ifeq 685a
      // 6817: aload 9
      // 6819: checkcast net/minecraft/world/entity/LivingEntity
      // 681c: astore 12
      // 681e: new net/minecraft/world/item/ItemStack
      // 6821: dup
      // 6822: getstatic net/mocreatures/init/MocreaturesModItems.PET_AMULET_FULL Lnet/neoforged/neoforge/registries/DeferredItem;
      // 6825: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 6828: checkcast net/minecraft/world/level/ItemLike
      // 682b: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 682e: invokevirtual net/minecraft/world/item/ItemStack.copy ()Lnet/minecraft/world/item/ItemStack;
      // 6831: astore 13
      // 6833: aload 13
      // 6835: bipush 1
      // 6836: invokevirtual net/minecraft/world/item/ItemStack.setCount (I)V
      // 6839: aload 12
      // 683b: getstatic net/minecraft/world/InteractionHand.MAIN_HAND Lnet/minecraft/world/InteractionHand;
      // 683e: aload 13
      // 6840: invokevirtual net/minecraft/world/entity/LivingEntity.setItemInHand (Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/item/ItemStack;)V
      // 6843: aload 12
      // 6845: instanceof net/minecraft/world/entity/player/Player
      // 6848: ifeq 685a
      // 684b: aload 12
      // 684d: checkcast net/minecraft/world/entity/player/Player
      // 6850: astore 14
      // 6852: aload 14
      // 6854: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 6857: invokevirtual net/minecraft/world/entity/player/Inventory.setChanged ()V
      // 685a: ldc_w "Mob"
      // 685d: astore 12
      // 685f: ldc_w "mocreatures:liger"
      // 6862: astore 13
      // 6864: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 6867: aload 9
      // 6869: instanceof net/minecraft/world/entity/LivingEntity
      // 686c: ifeq 687e
      // 686f: aload 9
      // 6871: checkcast net/minecraft/world/entity/LivingEntity
      // 6874: astore 14
      // 6876: aload 14
      // 6878: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 687b: goto 6881
      // 687e: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 6881: invokedynamic accept ()Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$167 (Lnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 6886: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 6889: ldc_w "Name"
      // 688c: astore 12
      // 688e: aload 8
      // 6890: invokevirtual net/minecraft/world/entity/Entity.getDisplayName ()Lnet/minecraft/network/chat/Component;
      // 6893: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 6898: astore 13
      // 689a: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 689d: aload 9
      // 689f: instanceof net/minecraft/world/entity/LivingEntity
      // 68a2: ifeq 68b4
      // 68a5: aload 9
      // 68a7: checkcast net/minecraft/world/entity/LivingEntity
      // 68aa: astore 14
      // 68ac: aload 14
      // 68ae: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 68b1: goto 68b7
      // 68b4: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 68b7: aload 13
      // 68b9: invokedynamic accept (Ljava/lang/String;)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$168 (Ljava/lang/String;Lnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 68be: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 68c1: aload 8
      // 68c3: instanceof net/minecraft/world/entity/TamableAnimal
      // 68c6: ifeq 6910
      // 68c9: aload 8
      // 68cb: checkcast net/minecraft/world/entity/TamableAnimal
      // 68ce: astore 12
      // 68d0: aload 12
      // 68d2: invokevirtual net/minecraft/world/entity/TamableAnimal.isTame ()Z
      // 68d5: ifeq 6910
      // 68d8: ldc_w "Owner"
      // 68db: astore 13
      // 68dd: aload 9
      // 68df: invokevirtual net/minecraft/world/entity/Entity.getDisplayName ()Lnet/minecraft/network/chat/Component;
      // 68e2: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 68e7: astore 14
      // 68e9: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 68ec: aload 9
      // 68ee: instanceof net/minecraft/world/entity/LivingEntity
      // 68f1: ifeq 6903
      // 68f4: aload 9
      // 68f6: checkcast net/minecraft/world/entity/LivingEntity
      // 68f9: astore 15
      // 68fb: aload 15
      // 68fd: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 6900: goto 6906
      // 6903: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 6906: aload 14
      // 6908: invokedynamic accept (Ljava/lang/String;)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$169 (Ljava/lang/String;Lnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 690d: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 6910: ldc_w "Leashed"
      // 6913: astore 12
      // 6915: aload 8
      // 6917: instanceof net/minecraft/world/entity/Mob
      // 691a: ifeq 692c
      // 691d: aload 8
      // 691f: checkcast net/minecraft/world/entity/Mob
      // 6922: astore 14
      // 6924: aload 14
      // 6926: invokevirtual net/minecraft/world/entity/Mob.isLeashed ()Z
      // 6929: goto 692d
      // 692c: bipush 0
      // 692d: istore 13
      // 692f: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 6932: aload 9
      // 6934: instanceof net/minecraft/world/entity/LivingEntity
      // 6937: ifeq 6949
      // 693a: aload 9
      // 693c: checkcast net/minecraft/world/entity/LivingEntity
      // 693f: astore 14
      // 6941: aload 14
      // 6943: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 6946: goto 694c
      // 6949: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 694c: iload 13
      // 694e: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$170 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 6953: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 6956: ldc_w "NoGravity"
      // 6959: astore 12
      // 695b: aload 8
      // 695d: invokevirtual net/minecraft/world/entity/Entity.isNoGravity ()Z
      // 6960: istore 13
      // 6962: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 6965: aload 9
      // 6967: instanceof net/minecraft/world/entity/LivingEntity
      // 696a: ifeq 697c
      // 696d: aload 9
      // 696f: checkcast net/minecraft/world/entity/LivingEntity
      // 6972: astore 14
      // 6974: aload 14
      // 6976: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 6979: goto 697f
      // 697c: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 697f: iload 13
      // 6981: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$171 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 6986: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 6989: ldc_w "MaxHealth"
      // 698c: astore 12
      // 698e: aload 8
      // 6990: instanceof net/minecraft/world/entity/LivingEntity
      // 6993: ifeq 69a6
      // 6996: aload 8
      // 6998: checkcast net/minecraft/world/entity/LivingEntity
      // 699b: astore 15
      // 699d: aload 15
      // 699f: invokevirtual net/minecraft/world/entity/LivingEntity.getMaxHealth ()F
      // 69a2: f2d
      // 69a3: goto 69a9
      // 69a6: ldc2_w -1.0
      // 69a9: dstore 13
      // 69ab: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 69ae: aload 9
      // 69b0: instanceof net/minecraft/world/entity/LivingEntity
      // 69b3: ifeq 69c5
      // 69b6: aload 9
      // 69b8: checkcast net/minecraft/world/entity/LivingEntity
      // 69bb: astore 15
      // 69bd: aload 15
      // 69bf: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 69c2: goto 69c8
      // 69c5: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 69c8: dload 13
      // 69ca: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$172 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 69cf: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 69d2: ldc_w "Health"
      // 69d5: astore 12
      // 69d7: aload 8
      // 69d9: instanceof net/minecraft/world/entity/LivingEntity
      // 69dc: ifeq 69ef
      // 69df: aload 8
      // 69e1: checkcast net/minecraft/world/entity/LivingEntity
      // 69e4: astore 15
      // 69e6: aload 15
      // 69e8: invokevirtual net/minecraft/world/entity/LivingEntity.getHealth ()F
      // 69eb: f2d
      // 69ec: goto 69f2
      // 69ef: ldc2_w -1.0
      // 69f2: dstore 13
      // 69f4: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 69f7: aload 9
      // 69f9: instanceof net/minecraft/world/entity/LivingEntity
      // 69fc: ifeq 6a0e
      // 69ff: aload 9
      // 6a01: checkcast net/minecraft/world/entity/LivingEntity
      // 6a04: astore 15
      // 6a06: aload 15
      // 6a08: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 6a0b: goto 6a11
      // 6a0e: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 6a11: dload 13
      // 6a13: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$173 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 6a18: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 6a1b: ldc_w "Air"
      // 6a1e: astore 12
      // 6a20: aload 8
      // 6a22: invokevirtual net/minecraft/world/entity/Entity.getAirSupply ()I
      // 6a25: i2d
      // 6a26: dstore 13
      // 6a28: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 6a2b: aload 9
      // 6a2d: instanceof net/minecraft/world/entity/LivingEntity
      // 6a30: ifeq 6a42
      // 6a33: aload 9
      // 6a35: checkcast net/minecraft/world/entity/LivingEntity
      // 6a38: astore 15
      // 6a3a: aload 15
      // 6a3c: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 6a3f: goto 6a45
      // 6a42: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 6a45: dload 13
      // 6a47: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$174 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 6a4c: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 6a4f: ldc_w "MotionX"
      // 6a52: astore 12
      // 6a54: aload 8
      // 6a56: invokevirtual net/minecraft/world/entity/Entity.getDeltaMovement ()Lnet/minecraft/world/phys/Vec3;
      // 6a59: invokevirtual net/minecraft/world/phys/Vec3.x ()D
      // 6a5c: dstore 13
      // 6a5e: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 6a61: aload 9
      // 6a63: instanceof net/minecraft/world/entity/LivingEntity
      // 6a66: ifeq 6a78
      // 6a69: aload 9
      // 6a6b: checkcast net/minecraft/world/entity/LivingEntity
      // 6a6e: astore 15
      // 6a70: aload 15
      // 6a72: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 6a75: goto 6a7b
      // 6a78: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 6a7b: dload 13
      // 6a7d: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$175 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 6a82: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 6a85: ldc_w "MotionY"
      // 6a88: astore 12
      // 6a8a: aload 8
      // 6a8c: invokevirtual net/minecraft/world/entity/Entity.getDeltaMovement ()Lnet/minecraft/world/phys/Vec3;
      // 6a8f: invokevirtual net/minecraft/world/phys/Vec3.y ()D
      // 6a92: dstore 13
      // 6a94: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 6a97: aload 9
      // 6a99: instanceof net/minecraft/world/entity/LivingEntity
      // 6a9c: ifeq 6aae
      // 6a9f: aload 9
      // 6aa1: checkcast net/minecraft/world/entity/LivingEntity
      // 6aa4: astore 15
      // 6aa6: aload 15
      // 6aa8: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 6aab: goto 6ab1
      // 6aae: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 6ab1: dload 13
      // 6ab3: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$176 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 6ab8: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 6abb: ldc_w "MotionZ"
      // 6abe: astore 12
      // 6ac0: aload 8
      // 6ac2: invokevirtual net/minecraft/world/entity/Entity.getDeltaMovement ()Lnet/minecraft/world/phys/Vec3;
      // 6ac5: invokevirtual net/minecraft/world/phys/Vec3.z ()D
      // 6ac8: dstore 13
      // 6aca: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 6acd: aload 9
      // 6acf: instanceof net/minecraft/world/entity/LivingEntity
      // 6ad2: ifeq 6ae4
      // 6ad5: aload 9
      // 6ad7: checkcast net/minecraft/world/entity/LivingEntity
      // 6ada: astore 15
      // 6adc: aload 15
      // 6ade: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 6ae1: goto 6ae7
      // 6ae4: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 6ae7: dload 13
      // 6ae9: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$177 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 6aee: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 6af1: ldc_w "RotationYaw"
      // 6af4: astore 12
      // 6af6: aload 8
      // 6af8: invokevirtual net/minecraft/world/entity/Entity.getYRot ()F
      // 6afb: f2d
      // 6afc: dstore 13
      // 6afe: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 6b01: aload 9
      // 6b03: instanceof net/minecraft/world/entity/LivingEntity
      // 6b06: ifeq 6b18
      // 6b09: aload 9
      // 6b0b: checkcast net/minecraft/world/entity/LivingEntity
      // 6b0e: astore 15
      // 6b10: aload 15
      // 6b12: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 6b15: goto 6b1b
      // 6b18: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 6b1b: dload 13
      // 6b1d: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$178 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 6b22: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 6b25: ldc_w "RotationPitch"
      // 6b28: astore 12
      // 6b2a: aload 8
      // 6b2c: invokevirtual net/minecraft/world/entity/Entity.getXRot ()F
      // 6b2f: f2d
      // 6b30: dstore 13
      // 6b32: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 6b35: aload 9
      // 6b37: instanceof net/minecraft/world/entity/LivingEntity
      // 6b3a: ifeq 6b4c
      // 6b3d: aload 9
      // 6b3f: checkcast net/minecraft/world/entity/LivingEntity
      // 6b42: astore 15
      // 6b44: aload 15
      // 6b46: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 6b49: goto 6b4f
      // 6b4c: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 6b4f: dload 13
      // 6b51: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$179 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 6b56: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 6b59: ldc_w "Gender"
      // 6b5c: astore 12
      // 6b5e: aload 8
      // 6b60: instanceof net/mocreatures/entity/LigerEntity
      // 6b63: ifeq 6b82
      // 6b66: aload 8
      // 6b68: checkcast net/mocreatures/entity/LigerEntity
      // 6b6b: astore 15
      // 6b6d: aload 15
      // 6b6f: invokevirtual net/mocreatures/entity/LigerEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 6b72: getstatic net/mocreatures/entity/LigerEntity.DATA_Gender Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 6b75: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 6b78: checkcast java/lang/Integer
      // 6b7b: invokevirtual java/lang/Integer.intValue ()I
      // 6b7e: i2d
      // 6b7f: goto 6b83
      // 6b82: dconst_0
      // 6b83: dstore 13
      // 6b85: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 6b88: aload 9
      // 6b8a: instanceof net/minecraft/world/entity/LivingEntity
      // 6b8d: ifeq 6b9f
      // 6b90: aload 9
      // 6b92: checkcast net/minecraft/world/entity/LivingEntity
      // 6b95: astore 15
      // 6b97: aload 15
      // 6b99: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 6b9c: goto 6ba2
      // 6b9f: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 6ba2: dload 13
      // 6ba4: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$180 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 6ba9: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 6bac: ldc_w "Color"
      // 6baf: astore 12
      // 6bb1: aload 8
      // 6bb3: instanceof net/mocreatures/entity/LigerEntity
      // 6bb6: ifeq 6bd5
      // 6bb9: aload 8
      // 6bbb: checkcast net/mocreatures/entity/LigerEntity
      // 6bbe: astore 15
      // 6bc0: aload 15
      // 6bc2: invokevirtual net/mocreatures/entity/LigerEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 6bc5: getstatic net/mocreatures/entity/LigerEntity.DATA_Color Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 6bc8: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 6bcb: checkcast java/lang/Integer
      // 6bce: invokevirtual java/lang/Integer.intValue ()I
      // 6bd1: i2d
      // 6bd2: goto 6bd6
      // 6bd5: dconst_0
      // 6bd6: dstore 13
      // 6bd8: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 6bdb: aload 9
      // 6bdd: instanceof net/minecraft/world/entity/LivingEntity
      // 6be0: ifeq 6bf2
      // 6be3: aload 9
      // 6be5: checkcast net/minecraft/world/entity/LivingEntity
      // 6be8: astore 15
      // 6bea: aload 15
      // 6bec: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 6bef: goto 6bf5
      // 6bf2: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 6bf5: dload 13
      // 6bf7: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$181 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 6bfc: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 6bff: ldc_w "Wings"
      // 6c02: astore 12
      // 6c04: aload 8
      // 6c06: instanceof net/mocreatures/entity/LigerEntity
      // 6c09: ifeq 6c2b
      // 6c0c: aload 8
      // 6c0e: checkcast net/mocreatures/entity/LigerEntity
      // 6c11: astore 14
      // 6c13: aload 14
      // 6c15: invokevirtual net/mocreatures/entity/LigerEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 6c18: getstatic net/mocreatures/entity/LigerEntity.DATA_Wings Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 6c1b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 6c1e: checkcast java/lang/Boolean
      // 6c21: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 6c24: ifeq 6c2b
      // 6c27: bipush 1
      // 6c28: goto 6c2c
      // 6c2b: bipush 0
      // 6c2c: istore 13
      // 6c2e: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 6c31: aload 9
      // 6c33: instanceof net/minecraft/world/entity/LivingEntity
      // 6c36: ifeq 6c48
      // 6c39: aload 9
      // 6c3b: checkcast net/minecraft/world/entity/LivingEntity
      // 6c3e: astore 14
      // 6c40: aload 14
      // 6c42: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 6c45: goto 6c4b
      // 6c48: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 6c4b: iload 13
      // 6c4d: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$182 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 6c52: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 6c55: ldc_w "Medallion"
      // 6c58: astore 12
      // 6c5a: aload 8
      // 6c5c: instanceof net/mocreatures/entity/LigerEntity
      // 6c5f: ifeq 6c81
      // 6c62: aload 8
      // 6c64: checkcast net/mocreatures/entity/LigerEntity
      // 6c67: astore 14
      // 6c69: aload 14
      // 6c6b: invokevirtual net/mocreatures/entity/LigerEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 6c6e: getstatic net/mocreatures/entity/LigerEntity.DATA_Medallion Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 6c71: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 6c74: checkcast java/lang/Boolean
      // 6c77: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 6c7a: ifeq 6c81
      // 6c7d: bipush 1
      // 6c7e: goto 6c82
      // 6c81: bipush 0
      // 6c82: istore 13
      // 6c84: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 6c87: aload 9
      // 6c89: instanceof net/minecraft/world/entity/LivingEntity
      // 6c8c: ifeq 6c9e
      // 6c8f: aload 9
      // 6c91: checkcast net/minecraft/world/entity/LivingEntity
      // 6c94: astore 14
      // 6c96: aload 14
      // 6c98: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 6c9b: goto 6ca1
      // 6c9e: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 6ca1: iload 13
      // 6ca3: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$183 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 6ca8: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 6cab: aload 8
      // 6cad: invokevirtual net/minecraft/world/entity/Entity.getType ()Lnet/minecraft/world/entity/EntityType;
      // 6cb0: getstatic net/minecraft/core/registries/Registries.ENTITY_TYPE Lnet/minecraft/resources/ResourceKey;
      // 6cb3: ldc_w "mocreatures:liger"
      // 6cb6: invokestatic net/minecraft/resources/ResourceLocation.parse (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
      // 6cb9: invokestatic net/minecraft/tags/TagKey.create (Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
      // 6cbc: invokevirtual net/minecraft/world/entity/EntityType.is (Lnet/minecraft/tags/TagKey;)Z
      // 6cbf: ifeq 71aa
      // 6cc2: aload 8
      // 6cc4: instanceof net/mocreatures/entity/LigerEntity
      // 6cc7: ifeq 6ce9
      // 6cca: aload 8
      // 6ccc: checkcast net/mocreatures/entity/LigerEntity
      // 6ccf: astore 12
      // 6cd1: aload 12
      // 6cd3: invokevirtual net/mocreatures/entity/LigerEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 6cd6: getstatic net/mocreatures/entity/LigerEntity.DATA_Saddle Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 6cd9: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 6cdc: checkcast java/lang/Boolean
      // 6cdf: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 6ce2: ifeq 6ce9
      // 6ce5: bipush 1
      // 6ce6: goto 6cea
      // 6ce9: bipush 0
      // 6cea: bipush 1
      // 6ceb: if_icmpne 6d2a
      // 6cee: aload 1
      // 6cef: instanceof net/minecraft/server/level/ServerLevel
      // 6cf2: ifeq 6d2a
      // 6cf5: aload 1
      // 6cf6: checkcast net/minecraft/server/level/ServerLevel
      // 6cf9: astore 13
      // 6cfb: new net/minecraft/world/entity/item/ItemEntity
      // 6cfe: dup
      // 6cff: aload 13
      // 6d01: dload 2
      // 6d02: dload 4
      // 6d04: dload 6
      // 6d06: new net/minecraft/world/item/ItemStack
      // 6d09: dup
      // 6d0a: getstatic net/mocreatures/init/MocreaturesModItems.CRAFTED_SADDLE Lnet/neoforged/neoforge/registries/DeferredItem;
      // 6d0d: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 6d10: checkcast net/minecraft/world/level/ItemLike
      // 6d13: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 6d16: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6d19: astore 14
      // 6d1b: aload 14
      // 6d1d: bipush 10
      // 6d1f: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 6d22: aload 13
      // 6d24: aload 14
      // 6d26: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 6d29: pop
      // 6d2a: aload 8
      // 6d2c: instanceof net/mocreatures/entity/LigerEntity
      // 6d2f: ifeq 6d51
      // 6d32: aload 8
      // 6d34: checkcast net/mocreatures/entity/LigerEntity
      // 6d37: astore 12
      // 6d39: aload 12
      // 6d3b: invokevirtual net/mocreatures/entity/LigerEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 6d3e: getstatic net/mocreatures/entity/LigerEntity.DATA_Chest Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 6d41: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 6d44: checkcast java/lang/Boolean
      // 6d47: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 6d4a: ifeq 6d51
      // 6d4d: bipush 1
      // 6d4e: goto 6d52
      // 6d51: bipush 0
      // 6d52: bipush 1
      // 6d53: if_icmpne 6d8c
      // 6d56: aload 1
      // 6d57: instanceof net/minecraft/server/level/ServerLevel
      // 6d5a: ifeq 6d8c
      // 6d5d: aload 1
      // 6d5e: checkcast net/minecraft/server/level/ServerLevel
      // 6d61: astore 13
      // 6d63: new net/minecraft/world/entity/item/ItemEntity
      // 6d66: dup
      // 6d67: aload 13
      // 6d69: dload 2
      // 6d6a: dload 4
      // 6d6c: dload 6
      // 6d6e: new net/minecraft/world/item/ItemStack
      // 6d71: dup
      // 6d72: getstatic net/minecraft/world/level/block/Blocks.CHEST Lnet/minecraft/world/level/block/Block;
      // 6d75: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 6d78: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6d7b: astore 14
      // 6d7d: aload 14
      // 6d7f: bipush 10
      // 6d81: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 6d84: aload 13
      // 6d86: aload 14
      // 6d88: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 6d8b: pop
      // 6d8c: aload 1
      // 6d8d: instanceof net/minecraft/server/level/ServerLevel
      // 6d90: ifeq 6dc5
      // 6d93: aload 1
      // 6d94: checkcast net/minecraft/server/level/ServerLevel
      // 6d97: astore 12
      // 6d99: new net/minecraft/world/entity/item/ItemEntity
      // 6d9c: dup
      // 6d9d: aload 12
      // 6d9f: dload 2
      // 6da0: dload 4
      // 6da2: dload 6
      // 6da4: new net/mocreatures/procedures/PetAmuletCapture2Procedure$181
      // 6da7: dup
      // 6da8: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$181.<init> ()V
      // 6dab: bipush 0
      // 6dac: aload 8
      // 6dae: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$181.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 6db1: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6db4: astore 13
      // 6db6: aload 13
      // 6db8: bipush 10
      // 6dba: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 6dbd: aload 12
      // 6dbf: aload 13
      // 6dc1: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 6dc4: pop
      // 6dc5: aload 1
      // 6dc6: instanceof net/minecraft/server/level/ServerLevel
      // 6dc9: ifeq 6dfe
      // 6dcc: aload 1
      // 6dcd: checkcast net/minecraft/server/level/ServerLevel
      // 6dd0: astore 12
      // 6dd2: new net/minecraft/world/entity/item/ItemEntity
      // 6dd5: dup
      // 6dd6: aload 12
      // 6dd8: dload 2
      // 6dd9: dload 4
      // 6ddb: dload 6
      // 6ddd: new net/mocreatures/procedures/PetAmuletCapture2Procedure$182
      // 6de0: dup
      // 6de1: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$182.<init> ()V
      // 6de4: bipush 1
      // 6de5: aload 8
      // 6de7: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$182.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 6dea: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6ded: astore 13
      // 6def: aload 13
      // 6df1: bipush 10
      // 6df3: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 6df6: aload 12
      // 6df8: aload 13
      // 6dfa: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 6dfd: pop
      // 6dfe: aload 1
      // 6dff: instanceof net/minecraft/server/level/ServerLevel
      // 6e02: ifeq 6e37
      // 6e05: aload 1
      // 6e06: checkcast net/minecraft/server/level/ServerLevel
      // 6e09: astore 12
      // 6e0b: new net/minecraft/world/entity/item/ItemEntity
      // 6e0e: dup
      // 6e0f: aload 12
      // 6e11: dload 2
      // 6e12: dload 4
      // 6e14: dload 6
      // 6e16: new net/mocreatures/procedures/PetAmuletCapture2Procedure$183
      // 6e19: dup
      // 6e1a: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$183.<init> ()V
      // 6e1d: bipush 2
      // 6e1e: aload 8
      // 6e20: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$183.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 6e23: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6e26: astore 13
      // 6e28: aload 13
      // 6e2a: bipush 10
      // 6e2c: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 6e2f: aload 12
      // 6e31: aload 13
      // 6e33: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 6e36: pop
      // 6e37: aload 1
      // 6e38: instanceof net/minecraft/server/level/ServerLevel
      // 6e3b: ifeq 6e70
      // 6e3e: aload 1
      // 6e3f: checkcast net/minecraft/server/level/ServerLevel
      // 6e42: astore 12
      // 6e44: new net/minecraft/world/entity/item/ItemEntity
      // 6e47: dup
      // 6e48: aload 12
      // 6e4a: dload 2
      // 6e4b: dload 4
      // 6e4d: dload 6
      // 6e4f: new net/mocreatures/procedures/PetAmuletCapture2Procedure$184
      // 6e52: dup
      // 6e53: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$184.<init> ()V
      // 6e56: bipush 3
      // 6e57: aload 8
      // 6e59: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$184.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 6e5c: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6e5f: astore 13
      // 6e61: aload 13
      // 6e63: bipush 10
      // 6e65: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 6e68: aload 12
      // 6e6a: aload 13
      // 6e6c: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 6e6f: pop
      // 6e70: aload 1
      // 6e71: instanceof net/minecraft/server/level/ServerLevel
      // 6e74: ifeq 6ea9
      // 6e77: aload 1
      // 6e78: checkcast net/minecraft/server/level/ServerLevel
      // 6e7b: astore 12
      // 6e7d: new net/minecraft/world/entity/item/ItemEntity
      // 6e80: dup
      // 6e81: aload 12
      // 6e83: dload 2
      // 6e84: dload 4
      // 6e86: dload 6
      // 6e88: new net/mocreatures/procedures/PetAmuletCapture2Procedure$185
      // 6e8b: dup
      // 6e8c: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$185.<init> ()V
      // 6e8f: bipush 4
      // 6e90: aload 8
      // 6e92: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$185.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 6e95: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6e98: astore 13
      // 6e9a: aload 13
      // 6e9c: bipush 10
      // 6e9e: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 6ea1: aload 12
      // 6ea3: aload 13
      // 6ea5: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 6ea8: pop
      // 6ea9: aload 1
      // 6eaa: instanceof net/minecraft/server/level/ServerLevel
      // 6ead: ifeq 6ee2
      // 6eb0: aload 1
      // 6eb1: checkcast net/minecraft/server/level/ServerLevel
      // 6eb4: astore 12
      // 6eb6: new net/minecraft/world/entity/item/ItemEntity
      // 6eb9: dup
      // 6eba: aload 12
      // 6ebc: dload 2
      // 6ebd: dload 4
      // 6ebf: dload 6
      // 6ec1: new net/mocreatures/procedures/PetAmuletCapture2Procedure$186
      // 6ec4: dup
      // 6ec5: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$186.<init> ()V
      // 6ec8: bipush 5
      // 6ec9: aload 8
      // 6ecb: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$186.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 6ece: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6ed1: astore 13
      // 6ed3: aload 13
      // 6ed5: bipush 10
      // 6ed7: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 6eda: aload 12
      // 6edc: aload 13
      // 6ede: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 6ee1: pop
      // 6ee2: aload 1
      // 6ee3: instanceof net/minecraft/server/level/ServerLevel
      // 6ee6: ifeq 6f1c
      // 6ee9: aload 1
      // 6eea: checkcast net/minecraft/server/level/ServerLevel
      // 6eed: astore 12
      // 6eef: new net/minecraft/world/entity/item/ItemEntity
      // 6ef2: dup
      // 6ef3: aload 12
      // 6ef5: dload 2
      // 6ef6: dload 4
      // 6ef8: dload 6
      // 6efa: new net/mocreatures/procedures/PetAmuletCapture2Procedure$187
      // 6efd: dup
      // 6efe: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$187.<init> ()V
      // 6f01: bipush 6
      // 6f03: aload 8
      // 6f05: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$187.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 6f08: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6f0b: astore 13
      // 6f0d: aload 13
      // 6f0f: bipush 10
      // 6f11: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 6f14: aload 12
      // 6f16: aload 13
      // 6f18: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 6f1b: pop
      // 6f1c: aload 1
      // 6f1d: instanceof net/minecraft/server/level/ServerLevel
      // 6f20: ifeq 6f56
      // 6f23: aload 1
      // 6f24: checkcast net/minecraft/server/level/ServerLevel
      // 6f27: astore 12
      // 6f29: new net/minecraft/world/entity/item/ItemEntity
      // 6f2c: dup
      // 6f2d: aload 12
      // 6f2f: dload 2
      // 6f30: dload 4
      // 6f32: dload 6
      // 6f34: new net/mocreatures/procedures/PetAmuletCapture2Procedure$188
      // 6f37: dup
      // 6f38: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$188.<init> ()V
      // 6f3b: bipush 7
      // 6f3d: aload 8
      // 6f3f: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$188.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 6f42: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6f45: astore 13
      // 6f47: aload 13
      // 6f49: bipush 10
      // 6f4b: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 6f4e: aload 12
      // 6f50: aload 13
      // 6f52: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 6f55: pop
      // 6f56: aload 1
      // 6f57: instanceof net/minecraft/server/level/ServerLevel
      // 6f5a: ifeq 6f90
      // 6f5d: aload 1
      // 6f5e: checkcast net/minecraft/server/level/ServerLevel
      // 6f61: astore 12
      // 6f63: new net/minecraft/world/entity/item/ItemEntity
      // 6f66: dup
      // 6f67: aload 12
      // 6f69: dload 2
      // 6f6a: dload 4
      // 6f6c: dload 6
      // 6f6e: new net/mocreatures/procedures/PetAmuletCapture2Procedure$189
      // 6f71: dup
      // 6f72: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$189.<init> ()V
      // 6f75: bipush 8
      // 6f77: aload 8
      // 6f79: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$189.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 6f7c: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6f7f: astore 13
      // 6f81: aload 13
      // 6f83: bipush 10
      // 6f85: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 6f88: aload 12
      // 6f8a: aload 13
      // 6f8c: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 6f8f: pop
      // 6f90: aload 1
      // 6f91: instanceof net/minecraft/server/level/ServerLevel
      // 6f94: ifeq 6fca
      // 6f97: aload 1
      // 6f98: checkcast net/minecraft/server/level/ServerLevel
      // 6f9b: astore 12
      // 6f9d: new net/minecraft/world/entity/item/ItemEntity
      // 6fa0: dup
      // 6fa1: aload 12
      // 6fa3: dload 2
      // 6fa4: dload 4
      // 6fa6: dload 6
      // 6fa8: new net/mocreatures/procedures/PetAmuletCapture2Procedure$190
      // 6fab: dup
      // 6fac: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$190.<init> ()V
      // 6faf: bipush 9
      // 6fb1: aload 8
      // 6fb3: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$190.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 6fb6: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6fb9: astore 13
      // 6fbb: aload 13
      // 6fbd: bipush 10
      // 6fbf: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 6fc2: aload 12
      // 6fc4: aload 13
      // 6fc6: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 6fc9: pop
      // 6fca: aload 1
      // 6fcb: instanceof net/minecraft/server/level/ServerLevel
      // 6fce: ifeq 7004
      // 6fd1: aload 1
      // 6fd2: checkcast net/minecraft/server/level/ServerLevel
      // 6fd5: astore 12
      // 6fd7: new net/minecraft/world/entity/item/ItemEntity
      // 6fda: dup
      // 6fdb: aload 12
      // 6fdd: dload 2
      // 6fde: dload 4
      // 6fe0: dload 6
      // 6fe2: new net/mocreatures/procedures/PetAmuletCapture2Procedure$191
      // 6fe5: dup
      // 6fe6: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$191.<init> ()V
      // 6fe9: bipush 10
      // 6feb: aload 8
      // 6fed: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$191.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 6ff0: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 6ff3: astore 13
      // 6ff5: aload 13
      // 6ff7: bipush 10
      // 6ff9: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 6ffc: aload 12
      // 6ffe: aload 13
      // 7000: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 7003: pop
      // 7004: aload 1
      // 7005: instanceof net/minecraft/server/level/ServerLevel
      // 7008: ifeq 703e
      // 700b: aload 1
      // 700c: checkcast net/minecraft/server/level/ServerLevel
      // 700f: astore 12
      // 7011: new net/minecraft/world/entity/item/ItemEntity
      // 7014: dup
      // 7015: aload 12
      // 7017: dload 2
      // 7018: dload 4
      // 701a: dload 6
      // 701c: new net/mocreatures/procedures/PetAmuletCapture2Procedure$192
      // 701f: dup
      // 7020: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$192.<init> ()V
      // 7023: bipush 11
      // 7025: aload 8
      // 7027: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$192.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 702a: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 702d: astore 13
      // 702f: aload 13
      // 7031: bipush 10
      // 7033: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 7036: aload 12
      // 7038: aload 13
      // 703a: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 703d: pop
      // 703e: aload 1
      // 703f: instanceof net/minecraft/server/level/ServerLevel
      // 7042: ifeq 7078
      // 7045: aload 1
      // 7046: checkcast net/minecraft/server/level/ServerLevel
      // 7049: astore 12
      // 704b: new net/minecraft/world/entity/item/ItemEntity
      // 704e: dup
      // 704f: aload 12
      // 7051: dload 2
      // 7052: dload 4
      // 7054: dload 6
      // 7056: new net/mocreatures/procedures/PetAmuletCapture2Procedure$193
      // 7059: dup
      // 705a: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$193.<init> ()V
      // 705d: bipush 12
      // 705f: aload 8
      // 7061: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$193.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 7064: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 7067: astore 13
      // 7069: aload 13
      // 706b: bipush 10
      // 706d: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 7070: aload 12
      // 7072: aload 13
      // 7074: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 7077: pop
      // 7078: aload 1
      // 7079: instanceof net/minecraft/server/level/ServerLevel
      // 707c: ifeq 70b2
      // 707f: aload 1
      // 7080: checkcast net/minecraft/server/level/ServerLevel
      // 7083: astore 12
      // 7085: new net/minecraft/world/entity/item/ItemEntity
      // 7088: dup
      // 7089: aload 12
      // 708b: dload 2
      // 708c: dload 4
      // 708e: dload 6
      // 7090: new net/mocreatures/procedures/PetAmuletCapture2Procedure$194
      // 7093: dup
      // 7094: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$194.<init> ()V
      // 7097: bipush 13
      // 7099: aload 8
      // 709b: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$194.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 709e: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 70a1: astore 13
      // 70a3: aload 13
      // 70a5: bipush 10
      // 70a7: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 70aa: aload 12
      // 70ac: aload 13
      // 70ae: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 70b1: pop
      // 70b2: aload 1
      // 70b3: instanceof net/minecraft/server/level/ServerLevel
      // 70b6: ifeq 70ec
      // 70b9: aload 1
      // 70ba: checkcast net/minecraft/server/level/ServerLevel
      // 70bd: astore 12
      // 70bf: new net/minecraft/world/entity/item/ItemEntity
      // 70c2: dup
      // 70c3: aload 12
      // 70c5: dload 2
      // 70c6: dload 4
      // 70c8: dload 6
      // 70ca: new net/mocreatures/procedures/PetAmuletCapture2Procedure$195
      // 70cd: dup
      // 70ce: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$195.<init> ()V
      // 70d1: bipush 14
      // 70d3: aload 8
      // 70d5: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$195.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 70d8: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 70db: astore 13
      // 70dd: aload 13
      // 70df: bipush 10
      // 70e1: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 70e4: aload 12
      // 70e6: aload 13
      // 70e8: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 70eb: pop
      // 70ec: aload 1
      // 70ed: instanceof net/minecraft/server/level/ServerLevel
      // 70f0: ifeq 7126
      // 70f3: aload 1
      // 70f4: checkcast net/minecraft/server/level/ServerLevel
      // 70f7: astore 12
      // 70f9: new net/minecraft/world/entity/item/ItemEntity
      // 70fc: dup
      // 70fd: aload 12
      // 70ff: dload 2
      // 7100: dload 4
      // 7102: dload 6
      // 7104: new net/mocreatures/procedures/PetAmuletCapture2Procedure$196
      // 7107: dup
      // 7108: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$196.<init> ()V
      // 710b: bipush 15
      // 710d: aload 8
      // 710f: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$196.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 7112: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 7115: astore 13
      // 7117: aload 13
      // 7119: bipush 10
      // 711b: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 711e: aload 12
      // 7120: aload 13
      // 7122: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 7125: pop
      // 7126: aload 1
      // 7127: instanceof net/minecraft/server/level/ServerLevel
      // 712a: ifeq 7160
      // 712d: aload 1
      // 712e: checkcast net/minecraft/server/level/ServerLevel
      // 7131: astore 12
      // 7133: new net/minecraft/world/entity/item/ItemEntity
      // 7136: dup
      // 7137: aload 12
      // 7139: dload 2
      // 713a: dload 4
      // 713c: dload 6
      // 713e: new net/mocreatures/procedures/PetAmuletCapture2Procedure$197
      // 7141: dup
      // 7142: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$197.<init> ()V
      // 7145: bipush 16
      // 7147: aload 8
      // 7149: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$197.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 714c: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 714f: astore 13
      // 7151: aload 13
      // 7153: bipush 10
      // 7155: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 7158: aload 12
      // 715a: aload 13
      // 715c: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 715f: pop
      // 7160: aload 1
      // 7161: instanceof net/minecraft/server/level/ServerLevel
      // 7164: ifeq 719a
      // 7167: aload 1
      // 7168: checkcast net/minecraft/server/level/ServerLevel
      // 716b: astore 12
      // 716d: new net/minecraft/world/entity/item/ItemEntity
      // 7170: dup
      // 7171: aload 12
      // 7173: dload 2
      // 7174: dload 4
      // 7176: dload 6
      // 7178: new net/mocreatures/procedures/PetAmuletCapture2Procedure$198
      // 717b: dup
      // 717c: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$198.<init> ()V
      // 717f: bipush 17
      // 7181: aload 8
      // 7183: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$198.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 7186: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 7189: astore 13
      // 718b: aload 13
      // 718d: bipush 10
      // 718f: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 7192: aload 12
      // 7194: aload 13
      // 7196: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 7199: pop
      // 719a: aload 8
      // 719c: invokevirtual net/minecraft/world/entity/Entity.level ()Lnet/minecraft/world/level/Level;
      // 719f: invokevirtual net/minecraft/world/level/Level.isClientSide ()Z
      // 71a2: ifne 71aa
      // 71a5: aload 8
      // 71a7: invokevirtual net/minecraft/world/entity/Entity.discard ()V
      // 71aa: aload 9
      // 71ac: instanceof net/minecraft/world/entity/LivingEntity
      // 71af: ifeq 71c1
      // 71b2: aload 9
      // 71b4: checkcast net/minecraft/world/entity/LivingEntity
      // 71b7: astore 11
      // 71b9: aload 11
      // 71bb: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 71be: goto 71c4
      // 71c1: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 71c4: ldc_w "mocreatures:amulet/empty"
      // 71c7: invokestatic net/minecraft/resources/ResourceLocation.parse (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
      // 71ca: invokestatic net/minecraft/tags/ItemTags.create (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
      // 71cd: invokevirtual net/minecraft/world/item/ItemStack.is (Lnet/minecraft/tags/TagKey;)Z
      // 71d0: ifeq 7e47
      // 71d3: aload 8
      // 71d5: invokevirtual net/minecraft/world/entity/Entity.getType ()Lnet/minecraft/world/entity/EntityType;
      // 71d8: getstatic net/minecraft/core/registries/Registries.ENTITY_TYPE Lnet/minecraft/resources/ResourceKey;
      // 71db: ldc_w "mocreatures:moc_horse"
      // 71de: invokestatic net/minecraft/resources/ResourceLocation.parse (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
      // 71e1: invokestatic net/minecraft/tags/TagKey.create (Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
      // 71e4: invokevirtual net/minecraft/world/entity/EntityType.is (Lnet/minecraft/tags/TagKey;)Z
      // 71e7: ifeq 7e47
      // 71ea: aload 8
      // 71ec: instanceof net/mocreatures/entity/HorseEntity
      // 71ef: ifeq 720d
      // 71f2: aload 8
      // 71f4: checkcast net/mocreatures/entity/HorseEntity
      // 71f7: astore 12
      // 71f9: aload 12
      // 71fb: invokevirtual net/mocreatures/entity/HorseEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 71fe: getstatic net/mocreatures/entity/HorseEntity.DATA_Variant Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 7201: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 7204: checkcast java/lang/Integer
      // 7207: invokevirtual java/lang/Integer.intValue ()I
      // 720a: goto 720e
      // 720d: bipush 0
      // 720e: bipush 105
      // 7210: if_icmpeq 7418
      // 7213: aload 8
      // 7215: instanceof net/mocreatures/entity/HorseEntity
      // 7218: ifeq 7236
      // 721b: aload 8
      // 721d: checkcast net/mocreatures/entity/HorseEntity
      // 7220: astore 13
      // 7222: aload 13
      // 7224: invokevirtual net/mocreatures/entity/HorseEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7227: getstatic net/mocreatures/entity/HorseEntity.DATA_Variant Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 722a: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 722d: checkcast java/lang/Integer
      // 7230: invokevirtual java/lang/Integer.intValue ()I
      // 7233: goto 7237
      // 7236: bipush 0
      // 7237: bipush 106
      // 7239: if_icmpeq 7418
      // 723c: aload 8
      // 723e: instanceof net/mocreatures/entity/HorseEntity
      // 7241: ifeq 725f
      // 7244: aload 8
      // 7246: checkcast net/mocreatures/entity/HorseEntity
      // 7249: astore 14
      // 724b: aload 14
      // 724d: invokevirtual net/mocreatures/entity/HorseEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7250: getstatic net/mocreatures/entity/HorseEntity.DATA_Variant Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 7253: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 7256: checkcast java/lang/Integer
      // 7259: invokevirtual java/lang/Integer.intValue ()I
      // 725c: goto 7260
      // 725f: bipush 0
      // 7260: bipush 107
      // 7262: if_icmpeq 7418
      // 7265: aload 8
      // 7267: instanceof net/mocreatures/entity/HorseEntity
      // 726a: ifeq 7288
      // 726d: aload 8
      // 726f: checkcast net/mocreatures/entity/HorseEntity
      // 7272: astore 15
      // 7274: aload 15
      // 7276: invokevirtual net/mocreatures/entity/HorseEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7279: getstatic net/mocreatures/entity/HorseEntity.DATA_Variant Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 727c: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 727f: checkcast java/lang/Integer
      // 7282: invokevirtual java/lang/Integer.intValue ()I
      // 7285: goto 7289
      // 7288: bipush 0
      // 7289: bipush 110
      // 728b: if_icmpeq 7418
      // 728e: aload 8
      // 7290: instanceof net/mocreatures/entity/HorseEntity
      // 7293: ifeq 72b1
      // 7296: aload 8
      // 7298: checkcast net/mocreatures/entity/HorseEntity
      // 729b: astore 16
      // 729d: aload 16
      // 729f: invokevirtual net/mocreatures/entity/HorseEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 72a2: getstatic net/mocreatures/entity/HorseEntity.DATA_Variant Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 72a5: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 72a8: checkcast java/lang/Integer
      // 72ab: invokevirtual java/lang/Integer.intValue ()I
      // 72ae: goto 72b2
      // 72b1: bipush 0
      // 72b2: bipush 111
      // 72b4: if_icmpeq 7418
      // 72b7: aload 8
      // 72b9: instanceof net/mocreatures/entity/HorseEntity
      // 72bc: ifeq 72da
      // 72bf: aload 8
      // 72c1: checkcast net/mocreatures/entity/HorseEntity
      // 72c4: astore 17
      // 72c6: aload 17
      // 72c8: invokevirtual net/mocreatures/entity/HorseEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 72cb: getstatic net/mocreatures/entity/HorseEntity.DATA_Variant Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 72ce: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 72d1: checkcast java/lang/Integer
      // 72d4: invokevirtual java/lang/Integer.intValue ()I
      // 72d7: goto 72db
      // 72da: bipush 0
      // 72db: bipush 112
      // 72dd: if_icmpeq 7418
      // 72e0: aload 8
      // 72e2: instanceof net/mocreatures/entity/HorseEntity
      // 72e5: ifeq 7303
      // 72e8: aload 8
      // 72ea: checkcast net/mocreatures/entity/HorseEntity
      // 72ed: astore 18
      // 72ef: aload 18
      // 72f1: invokevirtual net/mocreatures/entity/HorseEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 72f4: getstatic net/mocreatures/entity/HorseEntity.DATA_Variant Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 72f7: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 72fa: checkcast java/lang/Integer
      // 72fd: invokevirtual java/lang/Integer.intValue ()I
      // 7300: goto 7304
      // 7303: bipush 0
      // 7304: bipush 113
      // 7306: if_icmpeq 7418
      // 7309: aload 8
      // 730b: instanceof net/mocreatures/entity/HorseEntity
      // 730e: ifeq 732c
      // 7311: aload 8
      // 7313: checkcast net/mocreatures/entity/HorseEntity
      // 7316: astore 19
      // 7318: aload 19
      // 731a: invokevirtual net/mocreatures/entity/HorseEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 731d: getstatic net/mocreatures/entity/HorseEntity.DATA_Variant Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 7320: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 7323: checkcast java/lang/Integer
      // 7326: invokevirtual java/lang/Integer.intValue ()I
      // 7329: goto 732d
      // 732c: bipush 0
      // 732d: bipush 114
      // 732f: if_icmpeq 7418
      // 7332: aload 8
      // 7334: instanceof net/mocreatures/entity/HorseEntity
      // 7337: ifeq 7355
      // 733a: aload 8
      // 733c: checkcast net/mocreatures/entity/HorseEntity
      // 733f: astore 20
      // 7341: aload 20
      // 7343: invokevirtual net/mocreatures/entity/HorseEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7346: getstatic net/mocreatures/entity/HorseEntity.DATA_Variant Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 7349: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 734c: checkcast java/lang/Integer
      // 734f: invokevirtual java/lang/Integer.intValue ()I
      // 7352: goto 7356
      // 7355: bipush 0
      // 7356: bipush 115
      // 7358: if_icmpeq 7418
      // 735b: aload 8
      // 735d: instanceof net/mocreatures/entity/HorseEntity
      // 7360: ifeq 737e
      // 7363: aload 8
      // 7365: checkcast net/mocreatures/entity/HorseEntity
      // 7368: astore 21
      // 736a: aload 21
      // 736c: invokevirtual net/mocreatures/entity/HorseEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 736f: getstatic net/mocreatures/entity/HorseEntity.DATA_Variant Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 7372: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 7375: checkcast java/lang/Integer
      // 7378: invokevirtual java/lang/Integer.intValue ()I
      // 737b: goto 737f
      // 737e: bipush 0
      // 737f: bipush 116
      // 7381: if_icmpeq 7418
      // 7384: aload 8
      // 7386: instanceof net/mocreatures/entity/HorseEntity
      // 7389: ifeq 73ab
      // 738c: aload 8
      // 738e: checkcast net/mocreatures/entity/HorseEntity
      // 7391: astore 22
      // 7393: aload 22
      // 7395: invokevirtual net/mocreatures/entity/HorseEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7398: getstatic net/mocreatures/entity/HorseEntity.DATA_Fairy Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 739b: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 739e: checkcast java/lang/Boolean
      // 73a1: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 73a4: ifeq 73ab
      // 73a7: bipush 1
      // 73a8: goto 73ac
      // 73ab: bipush 0
      // 73ac: bipush 1
      // 73ad: if_icmpeq 7418
      // 73b0: aload 8
      // 73b2: instanceof net/minecraft/world/entity/TamableAnimal
      // 73b5: ifeq 7418
      // 73b8: aload 8
      // 73ba: checkcast net/minecraft/world/entity/TamableAnimal
      // 73bd: astore 23
      // 73bf: aload 23
      // 73c1: invokevirtual net/minecraft/world/entity/TamableAnimal.isTame ()Z
      // 73c4: ifeq 7418
      // 73c7: aload 8
      // 73c9: instanceof net/mocreatures/entity/HorseEntity
      // 73cc: ifeq 73ee
      // 73cf: aload 8
      // 73d1: checkcast net/mocreatures/entity/HorseEntity
      // 73d4: astore 24
      // 73d6: aload 24
      // 73d8: invokevirtual net/mocreatures/entity/HorseEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 73db: getstatic net/mocreatures/entity/HorseEntity.DATA_Baby Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 73de: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 73e1: checkcast java/lang/Boolean
      // 73e4: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 73e7: ifeq 73ee
      // 73ea: bipush 1
      // 73eb: goto 73ef
      // 73ee: bipush 0
      // 73ef: ifne 7418
      // 73f2: aload 8
      // 73f4: instanceof net/minecraft/world/entity/TamableAnimal
      // 73f7: ifeq 7409
      // 73fa: aload 8
      // 73fc: checkcast net/minecraft/world/entity/TamableAnimal
      // 73ff: astore 25
      // 7401: aload 25
      // 7403: invokevirtual net/minecraft/world/entity/TamableAnimal.getOwner ()Lnet/minecraft/world/entity/LivingEntity;
      // 7406: goto 740a
      // 7409: aconst_null
      // 740a: aload 9
      // 740c: if_acmpne 7415
      // 740f: bipush 1
      // 7410: istore 10
      // 7412: goto 7418
      // 7415: bipush 0
      // 7416: istore 10
      // 7418: iload 10
      // 741a: ifeq 7e47
      // 741d: aload 9
      // 741f: instanceof net/minecraft/world/entity/LivingEntity
      // 7422: ifeq 7468
      // 7425: aload 9
      // 7427: checkcast net/minecraft/world/entity/LivingEntity
      // 742a: astore 12
      // 742c: new net/minecraft/world/item/ItemStack
      // 742f: dup
      // 7430: getstatic net/mocreatures/init/MocreaturesModItems.PET_AMULET_FULL Lnet/neoforged/neoforge/registries/DeferredItem;
      // 7433: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 7436: checkcast net/minecraft/world/level/ItemLike
      // 7439: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 743c: invokevirtual net/minecraft/world/item/ItemStack.copy ()Lnet/minecraft/world/item/ItemStack;
      // 743f: astore 13
      // 7441: aload 13
      // 7443: bipush 1
      // 7444: invokevirtual net/minecraft/world/item/ItemStack.setCount (I)V
      // 7447: aload 12
      // 7449: getstatic net/minecraft/world/InteractionHand.MAIN_HAND Lnet/minecraft/world/InteractionHand;
      // 744c: aload 13
      // 744e: invokevirtual net/minecraft/world/entity/LivingEntity.setItemInHand (Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/item/ItemStack;)V
      // 7451: aload 12
      // 7453: instanceof net/minecraft/world/entity/player/Player
      // 7456: ifeq 7468
      // 7459: aload 12
      // 745b: checkcast net/minecraft/world/entity/player/Player
      // 745e: astore 14
      // 7460: aload 14
      // 7462: invokevirtual net/minecraft/world/entity/player/Player.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 7465: invokevirtual net/minecraft/world/entity/player/Inventory.setChanged ()V
      // 7468: ldc_w "Mob"
      // 746b: astore 12
      // 746d: ldc_w "mocreatures:horse"
      // 7470: astore 13
      // 7472: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 7475: aload 9
      // 7477: instanceof net/minecraft/world/entity/LivingEntity
      // 747a: ifeq 748c
      // 747d: aload 9
      // 747f: checkcast net/minecraft/world/entity/LivingEntity
      // 7482: astore 14
      // 7484: aload 14
      // 7486: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 7489: goto 748f
      // 748c: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 748f: invokedynamic accept ()Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$184 (Lnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 7494: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 7497: ldc_w "Name"
      // 749a: astore 12
      // 749c: aload 8
      // 749e: invokevirtual net/minecraft/world/entity/Entity.getDisplayName ()Lnet/minecraft/network/chat/Component;
      // 74a1: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 74a6: astore 13
      // 74a8: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 74ab: aload 9
      // 74ad: instanceof net/minecraft/world/entity/LivingEntity
      // 74b0: ifeq 74c2
      // 74b3: aload 9
      // 74b5: checkcast net/minecraft/world/entity/LivingEntity
      // 74b8: astore 14
      // 74ba: aload 14
      // 74bc: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 74bf: goto 74c5
      // 74c2: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 74c5: aload 13
      // 74c7: invokedynamic accept (Ljava/lang/String;)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$185 (Ljava/lang/String;Lnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 74cc: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 74cf: aload 8
      // 74d1: instanceof net/minecraft/world/entity/TamableAnimal
      // 74d4: ifeq 751e
      // 74d7: aload 8
      // 74d9: checkcast net/minecraft/world/entity/TamableAnimal
      // 74dc: astore 12
      // 74de: aload 12
      // 74e0: invokevirtual net/minecraft/world/entity/TamableAnimal.isTame ()Z
      // 74e3: ifeq 751e
      // 74e6: ldc_w "Owner"
      // 74e9: astore 13
      // 74eb: aload 9
      // 74ed: invokevirtual net/minecraft/world/entity/Entity.getDisplayName ()Lnet/minecraft/network/chat/Component;
      // 74f0: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 74f5: astore 14
      // 74f7: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 74fa: aload 9
      // 74fc: instanceof net/minecraft/world/entity/LivingEntity
      // 74ff: ifeq 7511
      // 7502: aload 9
      // 7504: checkcast net/minecraft/world/entity/LivingEntity
      // 7507: astore 15
      // 7509: aload 15
      // 750b: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 750e: goto 7514
      // 7511: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 7514: aload 14
      // 7516: invokedynamic accept (Ljava/lang/String;)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$186 (Ljava/lang/String;Lnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 751b: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 751e: ldc_w "Leashed"
      // 7521: astore 12
      // 7523: aload 8
      // 7525: instanceof net/minecraft/world/entity/Mob
      // 7528: ifeq 753a
      // 752b: aload 8
      // 752d: checkcast net/minecraft/world/entity/Mob
      // 7530: astore 14
      // 7532: aload 14
      // 7534: invokevirtual net/minecraft/world/entity/Mob.isLeashed ()Z
      // 7537: goto 753b
      // 753a: bipush 0
      // 753b: istore 13
      // 753d: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 7540: aload 9
      // 7542: instanceof net/minecraft/world/entity/LivingEntity
      // 7545: ifeq 7557
      // 7548: aload 9
      // 754a: checkcast net/minecraft/world/entity/LivingEntity
      // 754d: astore 14
      // 754f: aload 14
      // 7551: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 7554: goto 755a
      // 7557: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 755a: iload 13
      // 755c: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$187 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 7561: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 7564: ldc_w "NoGravity"
      // 7567: astore 12
      // 7569: aload 8
      // 756b: invokevirtual net/minecraft/world/entity/Entity.isNoGravity ()Z
      // 756e: istore 13
      // 7570: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 7573: aload 9
      // 7575: instanceof net/minecraft/world/entity/LivingEntity
      // 7578: ifeq 758a
      // 757b: aload 9
      // 757d: checkcast net/minecraft/world/entity/LivingEntity
      // 7580: astore 14
      // 7582: aload 14
      // 7584: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 7587: goto 758d
      // 758a: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 758d: iload 13
      // 758f: invokedynamic accept (Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$188 (ZLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 7594: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 7597: ldc_w "MaxHealth"
      // 759a: astore 12
      // 759c: aload 8
      // 759e: instanceof net/minecraft/world/entity/LivingEntity
      // 75a1: ifeq 75b4
      // 75a4: aload 8
      // 75a6: checkcast net/minecraft/world/entity/LivingEntity
      // 75a9: astore 15
      // 75ab: aload 15
      // 75ad: invokevirtual net/minecraft/world/entity/LivingEntity.getMaxHealth ()F
      // 75b0: f2d
      // 75b1: goto 75b7
      // 75b4: ldc2_w -1.0
      // 75b7: dstore 13
      // 75b9: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 75bc: aload 9
      // 75be: instanceof net/minecraft/world/entity/LivingEntity
      // 75c1: ifeq 75d3
      // 75c4: aload 9
      // 75c6: checkcast net/minecraft/world/entity/LivingEntity
      // 75c9: astore 15
      // 75cb: aload 15
      // 75cd: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 75d0: goto 75d6
      // 75d3: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 75d6: dload 13
      // 75d8: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$189 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 75dd: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 75e0: ldc_w "Health"
      // 75e3: astore 12
      // 75e5: aload 8
      // 75e7: instanceof net/minecraft/world/entity/LivingEntity
      // 75ea: ifeq 75fd
      // 75ed: aload 8
      // 75ef: checkcast net/minecraft/world/entity/LivingEntity
      // 75f2: astore 15
      // 75f4: aload 15
      // 75f6: invokevirtual net/minecraft/world/entity/LivingEntity.getHealth ()F
      // 75f9: f2d
      // 75fa: goto 7600
      // 75fd: ldc2_w -1.0
      // 7600: dstore 13
      // 7602: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 7605: aload 9
      // 7607: instanceof net/minecraft/world/entity/LivingEntity
      // 760a: ifeq 761c
      // 760d: aload 9
      // 760f: checkcast net/minecraft/world/entity/LivingEntity
      // 7612: astore 15
      // 7614: aload 15
      // 7616: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 7619: goto 761f
      // 761c: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 761f: dload 13
      // 7621: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$190 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 7626: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 7629: ldc_w "Air"
      // 762c: astore 12
      // 762e: aload 8
      // 7630: invokevirtual net/minecraft/world/entity/Entity.getAirSupply ()I
      // 7633: i2d
      // 7634: dstore 13
      // 7636: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 7639: aload 9
      // 763b: instanceof net/minecraft/world/entity/LivingEntity
      // 763e: ifeq 7650
      // 7641: aload 9
      // 7643: checkcast net/minecraft/world/entity/LivingEntity
      // 7646: astore 15
      // 7648: aload 15
      // 764a: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 764d: goto 7653
      // 7650: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 7653: dload 13
      // 7655: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$191 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 765a: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 765d: ldc_w "MotionX"
      // 7660: astore 12
      // 7662: aload 8
      // 7664: invokevirtual net/minecraft/world/entity/Entity.getDeltaMovement ()Lnet/minecraft/world/phys/Vec3;
      // 7667: invokevirtual net/minecraft/world/phys/Vec3.x ()D
      // 766a: dstore 13
      // 766c: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 766f: aload 9
      // 7671: instanceof net/minecraft/world/entity/LivingEntity
      // 7674: ifeq 7686
      // 7677: aload 9
      // 7679: checkcast net/minecraft/world/entity/LivingEntity
      // 767c: astore 15
      // 767e: aload 15
      // 7680: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 7683: goto 7689
      // 7686: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 7689: dload 13
      // 768b: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$192 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 7690: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 7693: ldc_w "MotionY"
      // 7696: astore 12
      // 7698: aload 8
      // 769a: invokevirtual net/minecraft/world/entity/Entity.getDeltaMovement ()Lnet/minecraft/world/phys/Vec3;
      // 769d: invokevirtual net/minecraft/world/phys/Vec3.y ()D
      // 76a0: dstore 13
      // 76a2: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 76a5: aload 9
      // 76a7: instanceof net/minecraft/world/entity/LivingEntity
      // 76aa: ifeq 76bc
      // 76ad: aload 9
      // 76af: checkcast net/minecraft/world/entity/LivingEntity
      // 76b2: astore 15
      // 76b4: aload 15
      // 76b6: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 76b9: goto 76bf
      // 76bc: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 76bf: dload 13
      // 76c1: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$193 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 76c6: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 76c9: ldc_w "MotionZ"
      // 76cc: astore 12
      // 76ce: aload 8
      // 76d0: invokevirtual net/minecraft/world/entity/Entity.getDeltaMovement ()Lnet/minecraft/world/phys/Vec3;
      // 76d3: invokevirtual net/minecraft/world/phys/Vec3.z ()D
      // 76d6: dstore 13
      // 76d8: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 76db: aload 9
      // 76dd: instanceof net/minecraft/world/entity/LivingEntity
      // 76e0: ifeq 76f2
      // 76e3: aload 9
      // 76e5: checkcast net/minecraft/world/entity/LivingEntity
      // 76e8: astore 15
      // 76ea: aload 15
      // 76ec: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 76ef: goto 76f5
      // 76f2: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 76f5: dload 13
      // 76f7: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$194 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 76fc: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 76ff: ldc_w "RotationYaw"
      // 7702: astore 12
      // 7704: aload 8
      // 7706: invokevirtual net/minecraft/world/entity/Entity.getYRot ()F
      // 7709: f2d
      // 770a: dstore 13
      // 770c: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 770f: aload 9
      // 7711: instanceof net/minecraft/world/entity/LivingEntity
      // 7714: ifeq 7726
      // 7717: aload 9
      // 7719: checkcast net/minecraft/world/entity/LivingEntity
      // 771c: astore 15
      // 771e: aload 15
      // 7720: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 7723: goto 7729
      // 7726: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 7729: dload 13
      // 772b: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$195 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 7730: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 7733: ldc_w "RotationPitch"
      // 7736: astore 12
      // 7738: aload 8
      // 773a: invokevirtual net/minecraft/world/entity/Entity.getXRot ()F
      // 773d: f2d
      // 773e: dstore 13
      // 7740: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 7743: aload 9
      // 7745: instanceof net/minecraft/world/entity/LivingEntity
      // 7748: ifeq 775a
      // 774b: aload 9
      // 774d: checkcast net/minecraft/world/entity/LivingEntity
      // 7750: astore 15
      // 7752: aload 15
      // 7754: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 7757: goto 775d
      // 775a: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 775d: dload 13
      // 775f: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$196 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 7764: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 7767: ldc_w "Variant"
      // 776a: astore 12
      // 776c: aload 8
      // 776e: instanceof net/mocreatures/entity/HorseEntity
      // 7771: ifeq 7790
      // 7774: aload 8
      // 7776: checkcast net/mocreatures/entity/HorseEntity
      // 7779: astore 15
      // 777b: aload 15
      // 777d: invokevirtual net/mocreatures/entity/HorseEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7780: getstatic net/mocreatures/entity/HorseEntity.DATA_Variant Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 7783: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 7786: checkcast java/lang/Integer
      // 7789: invokevirtual java/lang/Integer.intValue ()I
      // 778c: i2d
      // 778d: goto 7791
      // 7790: dconst_0
      // 7791: dstore 13
      // 7793: getstatic net/minecraft/core/component/DataComponents.CUSTOM_DATA Lnet/minecraft/core/component/DataComponentType;
      // 7796: aload 9
      // 7798: instanceof net/minecraft/world/entity/LivingEntity
      // 779b: ifeq 77ad
      // 779e: aload 9
      // 77a0: checkcast net/minecraft/world/entity/LivingEntity
      // 77a3: astore 15
      // 77a5: aload 15
      // 77a7: invokevirtual net/minecraft/world/entity/LivingEntity.getMainHandItem ()Lnet/minecraft/world/item/ItemStack;
      // 77aa: goto 77b0
      // 77ad: getstatic net/minecraft/world/item/ItemStack.EMPTY Lnet/minecraft/world/item/ItemStack;
      // 77b0: dload 13
      // 77b2: invokedynamic accept (D)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/mocreatures/procedures/PetAmuletCapture2Procedure.lambda$execute$197 (DLnet/minecraft/nbt/CompoundTag;)V, (Lnet/minecraft/nbt/CompoundTag;)V ]
      // 77b7: invokestatic net/minecraft/world/item/component/CustomData.update (Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V
      // 77ba: aload 8
      // 77bc: invokevirtual net/minecraft/world/entity/Entity.getType ()Lnet/minecraft/world/entity/EntityType;
      // 77bf: getstatic net/minecraft/core/registries/Registries.ENTITY_TYPE Lnet/minecraft/resources/ResourceKey;
      // 77c2: ldc_w "mocreatures:moc_horse"
      // 77c5: invokestatic net/minecraft/resources/ResourceLocation.parse (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
      // 77c8: invokestatic net/minecraft/tags/TagKey.create (Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
      // 77cb: invokevirtual net/minecraft/world/entity/EntityType.is (Lnet/minecraft/tags/TagKey;)Z
      // 77ce: ifeq 7e47
      // 77d1: aload 8
      // 77d3: instanceof net/mocreatures/entity/HorseEntity
      // 77d6: ifeq 77f8
      // 77d9: aload 8
      // 77db: checkcast net/mocreatures/entity/HorseEntity
      // 77de: astore 12
      // 77e0: aload 12
      // 77e2: invokevirtual net/mocreatures/entity/HorseEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 77e5: getstatic net/mocreatures/entity/HorseEntity.DATA_Saddle Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 77e8: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 77eb: checkcast java/lang/Boolean
      // 77ee: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 77f1: ifeq 77f8
      // 77f4: bipush 1
      // 77f5: goto 77f9
      // 77f8: bipush 0
      // 77f9: bipush 1
      // 77fa: if_icmpne 7839
      // 77fd: aload 1
      // 77fe: instanceof net/minecraft/server/level/ServerLevel
      // 7801: ifeq 7839
      // 7804: aload 1
      // 7805: checkcast net/minecraft/server/level/ServerLevel
      // 7808: astore 13
      // 780a: new net/minecraft/world/entity/item/ItemEntity
      // 780d: dup
      // 780e: aload 13
      // 7810: dload 2
      // 7811: dload 4
      // 7813: dload 6
      // 7815: new net/minecraft/world/item/ItemStack
      // 7818: dup
      // 7819: getstatic net/mocreatures/init/MocreaturesModItems.CRAFTED_SADDLE Lnet/neoforged/neoforge/registries/DeferredItem;
      // 781c: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 781f: checkcast net/minecraft/world/level/ItemLike
      // 7822: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 7825: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 7828: astore 14
      // 782a: aload 14
      // 782c: bipush 10
      // 782e: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 7831: aload 13
      // 7833: aload 14
      // 7835: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 7838: pop
      // 7839: aload 8
      // 783b: instanceof net/mocreatures/entity/HorseEntity
      // 783e: ifeq 7860
      // 7841: aload 8
      // 7843: checkcast net/mocreatures/entity/HorseEntity
      // 7846: astore 12
      // 7848: aload 12
      // 784a: invokevirtual net/mocreatures/entity/HorseEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 784d: getstatic net/mocreatures/entity/HorseEntity.DATA_Chest Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 7850: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 7853: checkcast java/lang/Boolean
      // 7856: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 7859: ifeq 7860
      // 785c: bipush 1
      // 785d: goto 7861
      // 7860: bipush 0
      // 7861: bipush 1
      // 7862: if_icmpne 789b
      // 7865: aload 1
      // 7866: instanceof net/minecraft/server/level/ServerLevel
      // 7869: ifeq 789b
      // 786c: aload 1
      // 786d: checkcast net/minecraft/server/level/ServerLevel
      // 7870: astore 13
      // 7872: new net/minecraft/world/entity/item/ItemEntity
      // 7875: dup
      // 7876: aload 13
      // 7878: dload 2
      // 7879: dload 4
      // 787b: dload 6
      // 787d: new net/minecraft/world/item/ItemStack
      // 7880: dup
      // 7881: getstatic net/minecraft/world/level/block/Blocks.CHEST Lnet/minecraft/world/level/block/Block;
      // 7884: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 7887: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 788a: astore 14
      // 788c: aload 14
      // 788e: bipush 10
      // 7890: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 7893: aload 13
      // 7895: aload 14
      // 7897: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 789a: pop
      // 789b: aload 8
      // 789d: instanceof net/mocreatures/entity/HorseEntity
      // 78a0: ifeq 78c2
      // 78a3: aload 8
      // 78a5: checkcast net/mocreatures/entity/HorseEntity
      // 78a8: astore 12
      // 78aa: aload 12
      // 78ac: invokevirtual net/mocreatures/entity/HorseEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 78af: getstatic net/mocreatures/entity/HorseEntity.DATA_MetalArmored Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 78b2: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 78b5: checkcast java/lang/Boolean
      // 78b8: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 78bb: ifeq 78c2
      // 78be: bipush 1
      // 78bf: goto 78c3
      // 78c2: bipush 0
      // 78c3: bipush 1
      // 78c4: if_icmpne 78fd
      // 78c7: aload 1
      // 78c8: instanceof net/minecraft/server/level/ServerLevel
      // 78cb: ifeq 78fd
      // 78ce: aload 1
      // 78cf: checkcast net/minecraft/server/level/ServerLevel
      // 78d2: astore 13
      // 78d4: new net/minecraft/world/entity/item/ItemEntity
      // 78d7: dup
      // 78d8: aload 13
      // 78da: dload 2
      // 78db: dload 4
      // 78dd: dload 6
      // 78df: new net/minecraft/world/item/ItemStack
      // 78e2: dup
      // 78e3: getstatic net/minecraft/world/item/Items.IRON_HORSE_ARMOR Lnet/minecraft/world/item/Item;
      // 78e6: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 78e9: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 78ec: astore 14
      // 78ee: aload 14
      // 78f0: bipush 10
      // 78f2: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 78f5: aload 13
      // 78f7: aload 14
      // 78f9: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 78fc: pop
      // 78fd: aload 8
      // 78ff: instanceof net/mocreatures/entity/HorseEntity
      // 7902: ifeq 7924
      // 7905: aload 8
      // 7907: checkcast net/mocreatures/entity/HorseEntity
      // 790a: astore 12
      // 790c: aload 12
      // 790e: invokevirtual net/mocreatures/entity/HorseEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7911: getstatic net/mocreatures/entity/HorseEntity.DATA_GoldenArmored Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 7914: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 7917: checkcast java/lang/Boolean
      // 791a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 791d: ifeq 7924
      // 7920: bipush 1
      // 7921: goto 7925
      // 7924: bipush 0
      // 7925: bipush 1
      // 7926: if_icmpne 795f
      // 7929: aload 1
      // 792a: instanceof net/minecraft/server/level/ServerLevel
      // 792d: ifeq 795f
      // 7930: aload 1
      // 7931: checkcast net/minecraft/server/level/ServerLevel
      // 7934: astore 13
      // 7936: new net/minecraft/world/entity/item/ItemEntity
      // 7939: dup
      // 793a: aload 13
      // 793c: dload 2
      // 793d: dload 4
      // 793f: dload 6
      // 7941: new net/minecraft/world/item/ItemStack
      // 7944: dup
      // 7945: getstatic net/minecraft/world/item/Items.GOLDEN_HORSE_ARMOR Lnet/minecraft/world/item/Item;
      // 7948: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 794b: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 794e: astore 14
      // 7950: aload 14
      // 7952: bipush 10
      // 7954: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 7957: aload 13
      // 7959: aload 14
      // 795b: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 795e: pop
      // 795f: aload 8
      // 7961: instanceof net/mocreatures/entity/HorseEntity
      // 7964: ifeq 7986
      // 7967: aload 8
      // 7969: checkcast net/mocreatures/entity/HorseEntity
      // 796c: astore 12
      // 796e: aload 12
      // 7970: invokevirtual net/mocreatures/entity/HorseEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 7973: getstatic net/mocreatures/entity/HorseEntity.DATA_DiamondArmored Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 7976: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 7979: checkcast java/lang/Boolean
      // 797c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 797f: ifeq 7986
      // 7982: bipush 1
      // 7983: goto 7987
      // 7986: bipush 0
      // 7987: bipush 1
      // 7988: if_icmpne 79c1
      // 798b: aload 1
      // 798c: instanceof net/minecraft/server/level/ServerLevel
      // 798f: ifeq 79c1
      // 7992: aload 1
      // 7993: checkcast net/minecraft/server/level/ServerLevel
      // 7996: astore 13
      // 7998: new net/minecraft/world/entity/item/ItemEntity
      // 799b: dup
      // 799c: aload 13
      // 799e: dload 2
      // 799f: dload 4
      // 79a1: dload 6
      // 79a3: new net/minecraft/world/item/ItemStack
      // 79a6: dup
      // 79a7: getstatic net/minecraft/world/item/Items.DIAMOND_HORSE_ARMOR Lnet/minecraft/world/item/Item;
      // 79aa: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 79ad: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 79b0: astore 14
      // 79b2: aload 14
      // 79b4: bipush 10
      // 79b6: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 79b9: aload 13
      // 79bb: aload 14
      // 79bd: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 79c0: pop
      // 79c1: aload 8
      // 79c3: instanceof net/mocreatures/entity/HorseEntity
      // 79c6: ifeq 79e8
      // 79c9: aload 8
      // 79cb: checkcast net/mocreatures/entity/HorseEntity
      // 79ce: astore 12
      // 79d0: aload 12
      // 79d2: invokevirtual net/mocreatures/entity/HorseEntity.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
      // 79d5: getstatic net/mocreatures/entity/HorseEntity.DATA_CrystalineArmored Lnet/minecraft/network/syncher/EntityDataAccessor;
      // 79d8: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
      // 79db: checkcast java/lang/Boolean
      // 79de: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 79e1: ifeq 79e8
      // 79e4: bipush 1
      // 79e5: goto 79e9
      // 79e8: bipush 0
      // 79e9: bipush 1
      // 79ea: if_icmpne 7a29
      // 79ed: aload 1
      // 79ee: instanceof net/minecraft/server/level/ServerLevel
      // 79f1: ifeq 7a29
      // 79f4: aload 1
      // 79f5: checkcast net/minecraft/server/level/ServerLevel
      // 79f8: astore 13
      // 79fa: new net/minecraft/world/entity/item/ItemEntity
      // 79fd: dup
      // 79fe: aload 13
      // 7a00: dload 2
      // 7a01: dload 4
      // 7a03: dload 6
      // 7a05: new net/minecraft/world/item/ItemStack
      // 7a08: dup
      // 7a09: getstatic net/mocreatures/init/MocreaturesModItems.CRYSTAL_HORSE_ARMOR Lnet/neoforged/neoforge/registries/DeferredItem;
      // 7a0c: invokevirtual net/neoforged/neoforge/registries/DeferredItem.get ()Ljava/lang/Object;
      // 7a0f: checkcast net/minecraft/world/level/ItemLike
      // 7a12: invokespecial net/minecraft/world/item/ItemStack.<init> (Lnet/minecraft/world/level/ItemLike;)V
      // 7a15: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 7a18: astore 14
      // 7a1a: aload 14
      // 7a1c: bipush 10
      // 7a1e: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 7a21: aload 13
      // 7a23: aload 14
      // 7a25: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 7a28: pop
      // 7a29: aload 1
      // 7a2a: instanceof net/minecraft/server/level/ServerLevel
      // 7a2d: ifeq 7a62
      // 7a30: aload 1
      // 7a31: checkcast net/minecraft/server/level/ServerLevel
      // 7a34: astore 12
      // 7a36: new net/minecraft/world/entity/item/ItemEntity
      // 7a39: dup
      // 7a3a: aload 12
      // 7a3c: dload 2
      // 7a3d: dload 4
      // 7a3f: dload 6
      // 7a41: new net/mocreatures/procedures/PetAmuletCapture2Procedure$199
      // 7a44: dup
      // 7a45: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$199.<init> ()V
      // 7a48: bipush 0
      // 7a49: aload 8
      // 7a4b: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$199.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 7a4e: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 7a51: astore 13
      // 7a53: aload 13
      // 7a55: bipush 10
      // 7a57: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 7a5a: aload 12
      // 7a5c: aload 13
      // 7a5e: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 7a61: pop
      // 7a62: aload 1
      // 7a63: instanceof net/minecraft/server/level/ServerLevel
      // 7a66: ifeq 7a9b
      // 7a69: aload 1
      // 7a6a: checkcast net/minecraft/server/level/ServerLevel
      // 7a6d: astore 12
      // 7a6f: new net/minecraft/world/entity/item/ItemEntity
      // 7a72: dup
      // 7a73: aload 12
      // 7a75: dload 2
      // 7a76: dload 4
      // 7a78: dload 6
      // 7a7a: new net/mocreatures/procedures/PetAmuletCapture2Procedure$200
      // 7a7d: dup
      // 7a7e: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$200.<init> ()V
      // 7a81: bipush 1
      // 7a82: aload 8
      // 7a84: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$200.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 7a87: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 7a8a: astore 13
      // 7a8c: aload 13
      // 7a8e: bipush 10
      // 7a90: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 7a93: aload 12
      // 7a95: aload 13
      // 7a97: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 7a9a: pop
      // 7a9b: aload 1
      // 7a9c: instanceof net/minecraft/server/level/ServerLevel
      // 7a9f: ifeq 7ad4
      // 7aa2: aload 1
      // 7aa3: checkcast net/minecraft/server/level/ServerLevel
      // 7aa6: astore 12
      // 7aa8: new net/minecraft/world/entity/item/ItemEntity
      // 7aab: dup
      // 7aac: aload 12
      // 7aae: dload 2
      // 7aaf: dload 4
      // 7ab1: dload 6
      // 7ab3: new net/mocreatures/procedures/PetAmuletCapture2Procedure$201
      // 7ab6: dup
      // 7ab7: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$201.<init> ()V
      // 7aba: bipush 2
      // 7abb: aload 8
      // 7abd: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$201.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 7ac0: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 7ac3: astore 13
      // 7ac5: aload 13
      // 7ac7: bipush 10
      // 7ac9: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 7acc: aload 12
      // 7ace: aload 13
      // 7ad0: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 7ad3: pop
      // 7ad4: aload 1
      // 7ad5: instanceof net/minecraft/server/level/ServerLevel
      // 7ad8: ifeq 7b0d
      // 7adb: aload 1
      // 7adc: checkcast net/minecraft/server/level/ServerLevel
      // 7adf: astore 12
      // 7ae1: new net/minecraft/world/entity/item/ItemEntity
      // 7ae4: dup
      // 7ae5: aload 12
      // 7ae7: dload 2
      // 7ae8: dload 4
      // 7aea: dload 6
      // 7aec: new net/mocreatures/procedures/PetAmuletCapture2Procedure$202
      // 7aef: dup
      // 7af0: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$202.<init> ()V
      // 7af3: bipush 3
      // 7af4: aload 8
      // 7af6: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$202.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 7af9: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 7afc: astore 13
      // 7afe: aload 13
      // 7b00: bipush 10
      // 7b02: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 7b05: aload 12
      // 7b07: aload 13
      // 7b09: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 7b0c: pop
      // 7b0d: aload 1
      // 7b0e: instanceof net/minecraft/server/level/ServerLevel
      // 7b11: ifeq 7b46
      // 7b14: aload 1
      // 7b15: checkcast net/minecraft/server/level/ServerLevel
      // 7b18: astore 12
      // 7b1a: new net/minecraft/world/entity/item/ItemEntity
      // 7b1d: dup
      // 7b1e: aload 12
      // 7b20: dload 2
      // 7b21: dload 4
      // 7b23: dload 6
      // 7b25: new net/mocreatures/procedures/PetAmuletCapture2Procedure$203
      // 7b28: dup
      // 7b29: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$203.<init> ()V
      // 7b2c: bipush 4
      // 7b2d: aload 8
      // 7b2f: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$203.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 7b32: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 7b35: astore 13
      // 7b37: aload 13
      // 7b39: bipush 10
      // 7b3b: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 7b3e: aload 12
      // 7b40: aload 13
      // 7b42: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 7b45: pop
      // 7b46: aload 1
      // 7b47: instanceof net/minecraft/server/level/ServerLevel
      // 7b4a: ifeq 7b7f
      // 7b4d: aload 1
      // 7b4e: checkcast net/minecraft/server/level/ServerLevel
      // 7b51: astore 12
      // 7b53: new net/minecraft/world/entity/item/ItemEntity
      // 7b56: dup
      // 7b57: aload 12
      // 7b59: dload 2
      // 7b5a: dload 4
      // 7b5c: dload 6
      // 7b5e: new net/mocreatures/procedures/PetAmuletCapture2Procedure$204
      // 7b61: dup
      // 7b62: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$204.<init> ()V
      // 7b65: bipush 5
      // 7b66: aload 8
      // 7b68: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$204.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 7b6b: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 7b6e: astore 13
      // 7b70: aload 13
      // 7b72: bipush 10
      // 7b74: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 7b77: aload 12
      // 7b79: aload 13
      // 7b7b: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 7b7e: pop
      // 7b7f: aload 1
      // 7b80: instanceof net/minecraft/server/level/ServerLevel
      // 7b83: ifeq 7bb9
      // 7b86: aload 1
      // 7b87: checkcast net/minecraft/server/level/ServerLevel
      // 7b8a: astore 12
      // 7b8c: new net/minecraft/world/entity/item/ItemEntity
      // 7b8f: dup
      // 7b90: aload 12
      // 7b92: dload 2
      // 7b93: dload 4
      // 7b95: dload 6
      // 7b97: new net/mocreatures/procedures/PetAmuletCapture2Procedure$205
      // 7b9a: dup
      // 7b9b: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$205.<init> ()V
      // 7b9e: bipush 6
      // 7ba0: aload 8
      // 7ba2: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$205.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 7ba5: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 7ba8: astore 13
      // 7baa: aload 13
      // 7bac: bipush 10
      // 7bae: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 7bb1: aload 12
      // 7bb3: aload 13
      // 7bb5: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 7bb8: pop
      // 7bb9: aload 1
      // 7bba: instanceof net/minecraft/server/level/ServerLevel
      // 7bbd: ifeq 7bf3
      // 7bc0: aload 1
      // 7bc1: checkcast net/minecraft/server/level/ServerLevel
      // 7bc4: astore 12
      // 7bc6: new net/minecraft/world/entity/item/ItemEntity
      // 7bc9: dup
      // 7bca: aload 12
      // 7bcc: dload 2
      // 7bcd: dload 4
      // 7bcf: dload 6
      // 7bd1: new net/mocreatures/procedures/PetAmuletCapture2Procedure$206
      // 7bd4: dup
      // 7bd5: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$206.<init> ()V
      // 7bd8: bipush 7
      // 7bda: aload 8
      // 7bdc: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$206.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 7bdf: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 7be2: astore 13
      // 7be4: aload 13
      // 7be6: bipush 10
      // 7be8: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 7beb: aload 12
      // 7bed: aload 13
      // 7bef: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 7bf2: pop
      // 7bf3: aload 1
      // 7bf4: instanceof net/minecraft/server/level/ServerLevel
      // 7bf7: ifeq 7c2d
      // 7bfa: aload 1
      // 7bfb: checkcast net/minecraft/server/level/ServerLevel
      // 7bfe: astore 12
      // 7c00: new net/minecraft/world/entity/item/ItemEntity
      // 7c03: dup
      // 7c04: aload 12
      // 7c06: dload 2
      // 7c07: dload 4
      // 7c09: dload 6
      // 7c0b: new net/mocreatures/procedures/PetAmuletCapture2Procedure$207
      // 7c0e: dup
      // 7c0f: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$207.<init> ()V
      // 7c12: bipush 8
      // 7c14: aload 8
      // 7c16: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$207.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 7c19: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 7c1c: astore 13
      // 7c1e: aload 13
      // 7c20: bipush 10
      // 7c22: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 7c25: aload 12
      // 7c27: aload 13
      // 7c29: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 7c2c: pop
      // 7c2d: aload 1
      // 7c2e: instanceof net/minecraft/server/level/ServerLevel
      // 7c31: ifeq 7c67
      // 7c34: aload 1
      // 7c35: checkcast net/minecraft/server/level/ServerLevel
      // 7c38: astore 12
      // 7c3a: new net/minecraft/world/entity/item/ItemEntity
      // 7c3d: dup
      // 7c3e: aload 12
      // 7c40: dload 2
      // 7c41: dload 4
      // 7c43: dload 6
      // 7c45: new net/mocreatures/procedures/PetAmuletCapture2Procedure$208
      // 7c48: dup
      // 7c49: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$208.<init> ()V
      // 7c4c: bipush 9
      // 7c4e: aload 8
      // 7c50: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$208.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 7c53: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 7c56: astore 13
      // 7c58: aload 13
      // 7c5a: bipush 10
      // 7c5c: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 7c5f: aload 12
      // 7c61: aload 13
      // 7c63: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 7c66: pop
      // 7c67: aload 1
      // 7c68: instanceof net/minecraft/server/level/ServerLevel
      // 7c6b: ifeq 7ca1
      // 7c6e: aload 1
      // 7c6f: checkcast net/minecraft/server/level/ServerLevel
      // 7c72: astore 12
      // 7c74: new net/minecraft/world/entity/item/ItemEntity
      // 7c77: dup
      // 7c78: aload 12
      // 7c7a: dload 2
      // 7c7b: dload 4
      // 7c7d: dload 6
      // 7c7f: new net/mocreatures/procedures/PetAmuletCapture2Procedure$209
      // 7c82: dup
      // 7c83: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$209.<init> ()V
      // 7c86: bipush 10
      // 7c88: aload 8
      // 7c8a: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$209.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 7c8d: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 7c90: astore 13
      // 7c92: aload 13
      // 7c94: bipush 10
      // 7c96: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 7c99: aload 12
      // 7c9b: aload 13
      // 7c9d: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 7ca0: pop
      // 7ca1: aload 1
      // 7ca2: instanceof net/minecraft/server/level/ServerLevel
      // 7ca5: ifeq 7cdb
      // 7ca8: aload 1
      // 7ca9: checkcast net/minecraft/server/level/ServerLevel
      // 7cac: astore 12
      // 7cae: new net/minecraft/world/entity/item/ItemEntity
      // 7cb1: dup
      // 7cb2: aload 12
      // 7cb4: dload 2
      // 7cb5: dload 4
      // 7cb7: dload 6
      // 7cb9: new net/mocreatures/procedures/PetAmuletCapture2Procedure$210
      // 7cbc: dup
      // 7cbd: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$210.<init> ()V
      // 7cc0: bipush 11
      // 7cc2: aload 8
      // 7cc4: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$210.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 7cc7: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 7cca: astore 13
      // 7ccc: aload 13
      // 7cce: bipush 10
      // 7cd0: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 7cd3: aload 12
      // 7cd5: aload 13
      // 7cd7: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 7cda: pop
      // 7cdb: aload 1
      // 7cdc: instanceof net/minecraft/server/level/ServerLevel
      // 7cdf: ifeq 7d15
      // 7ce2: aload 1
      // 7ce3: checkcast net/minecraft/server/level/ServerLevel
      // 7ce6: astore 12
      // 7ce8: new net/minecraft/world/entity/item/ItemEntity
      // 7ceb: dup
      // 7cec: aload 12
      // 7cee: dload 2
      // 7cef: dload 4
      // 7cf1: dload 6
      // 7cf3: new net/mocreatures/procedures/PetAmuletCapture2Procedure$211
      // 7cf6: dup
      // 7cf7: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$211.<init> ()V
      // 7cfa: bipush 12
      // 7cfc: aload 8
      // 7cfe: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$211.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 7d01: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 7d04: astore 13
      // 7d06: aload 13
      // 7d08: bipush 10
      // 7d0a: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 7d0d: aload 12
      // 7d0f: aload 13
      // 7d11: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 7d14: pop
      // 7d15: aload 1
      // 7d16: instanceof net/minecraft/server/level/ServerLevel
      // 7d19: ifeq 7d4f
      // 7d1c: aload 1
      // 7d1d: checkcast net/minecraft/server/level/ServerLevel
      // 7d20: astore 12
      // 7d22: new net/minecraft/world/entity/item/ItemEntity
      // 7d25: dup
      // 7d26: aload 12
      // 7d28: dload 2
      // 7d29: dload 4
      // 7d2b: dload 6
      // 7d2d: new net/mocreatures/procedures/PetAmuletCapture2Procedure$212
      // 7d30: dup
      // 7d31: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$212.<init> ()V
      // 7d34: bipush 13
      // 7d36: aload 8
      // 7d38: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$212.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 7d3b: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 7d3e: astore 13
      // 7d40: aload 13
      // 7d42: bipush 10
      // 7d44: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 7d47: aload 12
      // 7d49: aload 13
      // 7d4b: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 7d4e: pop
      // 7d4f: aload 1
      // 7d50: instanceof net/minecraft/server/level/ServerLevel
      // 7d53: ifeq 7d89
      // 7d56: aload 1
      // 7d57: checkcast net/minecraft/server/level/ServerLevel
      // 7d5a: astore 12
      // 7d5c: new net/minecraft/world/entity/item/ItemEntity
      // 7d5f: dup
      // 7d60: aload 12
      // 7d62: dload 2
      // 7d63: dload 4
      // 7d65: dload 6
      // 7d67: new net/mocreatures/procedures/PetAmuletCapture2Procedure$213
      // 7d6a: dup
      // 7d6b: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$213.<init> ()V
      // 7d6e: bipush 14
      // 7d70: aload 8
      // 7d72: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$213.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 7d75: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 7d78: astore 13
      // 7d7a: aload 13
      // 7d7c: bipush 10
      // 7d7e: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 7d81: aload 12
      // 7d83: aload 13
      // 7d85: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 7d88: pop
      // 7d89: aload 1
      // 7d8a: instanceof net/minecraft/server/level/ServerLevel
      // 7d8d: ifeq 7dc3
      // 7d90: aload 1
      // 7d91: checkcast net/minecraft/server/level/ServerLevel
      // 7d94: astore 12
      // 7d96: new net/minecraft/world/entity/item/ItemEntity
      // 7d99: dup
      // 7d9a: aload 12
      // 7d9c: dload 2
      // 7d9d: dload 4
      // 7d9f: dload 6
      // 7da1: new net/mocreatures/procedures/PetAmuletCapture2Procedure$214
      // 7da4: dup
      // 7da5: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$214.<init> ()V
      // 7da8: bipush 15
      // 7daa: aload 8
      // 7dac: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$214.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 7daf: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 7db2: astore 13
      // 7db4: aload 13
      // 7db6: bipush 10
      // 7db8: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 7dbb: aload 12
      // 7dbd: aload 13
      // 7dbf: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 7dc2: pop
      // 7dc3: aload 1
      // 7dc4: instanceof net/minecraft/server/level/ServerLevel
      // 7dc7: ifeq 7dfd
      // 7dca: aload 1
      // 7dcb: checkcast net/minecraft/server/level/ServerLevel
      // 7dce: astore 12
      // 7dd0: new net/minecraft/world/entity/item/ItemEntity
      // 7dd3: dup
      // 7dd4: aload 12
      // 7dd6: dload 2
      // 7dd7: dload 4
      // 7dd9: dload 6
      // 7ddb: new net/mocreatures/procedures/PetAmuletCapture2Procedure$215
      // 7dde: dup
      // 7ddf: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$215.<init> ()V
      // 7de2: bipush 16
      // 7de4: aload 8
      // 7de6: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$215.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 7de9: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 7dec: astore 13
      // 7dee: aload 13
      // 7df0: bipush 10
      // 7df2: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 7df5: aload 12
      // 7df7: aload 13
      // 7df9: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 7dfc: pop
      // 7dfd: aload 1
      // 7dfe: instanceof net/minecraft/server/level/ServerLevel
      // 7e01: ifeq 7e37
      // 7e04: aload 1
      // 7e05: checkcast net/minecraft/server/level/ServerLevel
      // 7e08: astore 12
      // 7e0a: new net/minecraft/world/entity/item/ItemEntity
      // 7e0d: dup
      // 7e0e: aload 12
      // 7e10: dload 2
      // 7e11: dload 4
      // 7e13: dload 6
      // 7e15: new net/mocreatures/procedures/PetAmuletCapture2Procedure$216
      // 7e18: dup
      // 7e19: invokespecial net/mocreatures/procedures/PetAmuletCapture2Procedure$216.<init> ()V
      // 7e1c: bipush 17
      // 7e1e: aload 8
      // 7e20: invokevirtual net/mocreatures/procedures/PetAmuletCapture2Procedure$216.getItemStack (ILnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/item/ItemStack;
      // 7e23: invokespecial net/minecraft/world/entity/item/ItemEntity.<init> (Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V
      // 7e26: astore 13
      // 7e28: aload 13
      // 7e2a: bipush 10
      // 7e2c: invokevirtual net/minecraft/world/entity/item/ItemEntity.setPickUpDelay (I)V
      // 7e2f: aload 12
      // 7e31: aload 13
      // 7e33: invokevirtual net/minecraft/server/level/ServerLevel.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z
      // 7e36: pop
      // 7e37: aload 8
      // 7e39: invokevirtual net/minecraft/world/entity/Entity.level ()Lnet/minecraft/world/level/Level;
      // 7e3c: invokevirtual net/minecraft/world/level/Level.isClientSide ()Z
      // 7e3f: ifne 7e47
      // 7e42: aload 8
      // 7e44: invokevirtual net/minecraft/world/entity/Entity.discard ()V
      // 7e47: return
   }
}
