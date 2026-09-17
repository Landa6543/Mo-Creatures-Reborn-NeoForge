package net.mocreatures.init;

import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.mocreatures.network.HorseFlyMessage;
import net.mocreatures.network.LigerFlyMessage;
import net.mocreatures.network.LionFlyMessage;
import net.mocreatures.network.LitherFlyMessage;
import net.mocreatures.network.ManticoreFlyMessage;
import net.mocreatures.network.NetherOstrichFlyMessage;
import net.mocreatures.network.PanthardFlyMessage;
import net.mocreatures.network.PantherFlyMessage;
import net.mocreatures.network.PanthgerFlyMessage;
import net.mocreatures.network.TigerFlyMessage;
import net.mocreatures.network.UndeadOstrichJumpMessage;
import net.mocreatures.network.UnicornOstrichJumpMessage;
import net.mocreatures.network.WyvernFlyMessage;
import net.mocreatures.network.WyvernOstrichFlyMessage;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.EventBusSubscriber.Bus;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.neoforged.neoforge.client.event.ClientTickEvent.Post;
import net.neoforged.neoforge.network.PacketDistributor;

@EventBusSubscriber(bus = Bus.MOD, value = Dist.CLIENT)
public class MocreaturesModKeyMappings {
   public static final KeyMapping NETHER_OSTRICH_FLY = new KeyMapping("key.mocreatures.nether_ostrich_fly", 32, "key.categories.mocreatures") {
      private boolean isDownOld = false;

      public void setDown(boolean isDown) {
         super.setDown(isDown);
         if (this.isDownOld != isDown && isDown) {
            PacketDistributor.sendToServer(new NetherOstrichFlyMessage(0, 0), new CustomPacketPayload[0]);
            NetherOstrichFlyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
            MocreaturesModKeyMappings.NETHER_OSTRICH_FLY_LASTPRESS = System.currentTimeMillis();
         } else if (this.isDownOld != isDown && !isDown) {
            int dt = (int)(System.currentTimeMillis() - MocreaturesModKeyMappings.NETHER_OSTRICH_FLY_LASTPRESS);
            PacketDistributor.sendToServer(new NetherOstrichFlyMessage(1, dt), new CustomPacketPayload[0]);
            NetherOstrichFlyMessage.pressAction(Minecraft.getInstance().player, 1, dt);
         }

         this.isDownOld = isDown;
      }
   };
   public static final KeyMapping UNICORN_OSTRICH_JUMP = new KeyMapping("key.mocreatures.unicorn_ostrich_jump", 32, "key.categories.mocreatures") {
      private boolean isDownOld = false;

      public void setDown(boolean isDown) {
         super.setDown(isDown);
         if (this.isDownOld != isDown && isDown) {
            PacketDistributor.sendToServer(new UnicornOstrichJumpMessage(0, 0), new CustomPacketPayload[0]);
            UnicornOstrichJumpMessage.pressAction(Minecraft.getInstance().player, 0, 0);
         }

         this.isDownOld = isDown;
      }
   };
   public static final KeyMapping MANTICORE_FLY = new KeyMapping("key.mocreatures.manticore_fly", 32, "key.categories.mocreatures") {
      private boolean isDownOld = false;

      public void setDown(boolean isDown) {
         super.setDown(isDown);
         if (this.isDownOld != isDown && isDown) {
            PacketDistributor.sendToServer(new ManticoreFlyMessage(0, 0), new CustomPacketPayload[0]);
            ManticoreFlyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
            MocreaturesModKeyMappings.MANTICORE_FLY_LASTPRESS = System.currentTimeMillis();
         } else if (this.isDownOld != isDown && !isDown) {
            int dt = (int)(System.currentTimeMillis() - MocreaturesModKeyMappings.MANTICORE_FLY_LASTPRESS);
            PacketDistributor.sendToServer(new ManticoreFlyMessage(1, dt), new CustomPacketPayload[0]);
            ManticoreFlyMessage.pressAction(Minecraft.getInstance().player, 1, dt);
         }

         this.isDownOld = isDown;
      }
   };
   public static final KeyMapping WYVERN_OSTRICH_FLY = new KeyMapping("key.mocreatures.wyvern_ostrich_fly", 32, "key.categories.mocreatures") {
      private boolean isDownOld = false;

      public void setDown(boolean isDown) {
         super.setDown(isDown);
         if (this.isDownOld != isDown && isDown) {
            PacketDistributor.sendToServer(new WyvernOstrichFlyMessage(0, 0), new CustomPacketPayload[0]);
            WyvernOstrichFlyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
            MocreaturesModKeyMappings.WYVERN_OSTRICH_FLY_LASTPRESS = System.currentTimeMillis();
         } else if (this.isDownOld != isDown && !isDown) {
            int dt = (int)(System.currentTimeMillis() - MocreaturesModKeyMappings.WYVERN_OSTRICH_FLY_LASTPRESS);
            PacketDistributor.sendToServer(new WyvernOstrichFlyMessage(1, dt), new CustomPacketPayload[0]);
            WyvernOstrichFlyMessage.pressAction(Minecraft.getInstance().player, 1, dt);
         }

         this.isDownOld = isDown;
      }
   };
   public static final KeyMapping UNDEAD_OSTRICH_JUMP = new KeyMapping("key.mocreatures.undead_ostrich_jump", 32, "key.categories.mocreatures") {
      private boolean isDownOld = false;

      public void setDown(boolean isDown) {
         super.setDown(isDown);
         if (this.isDownOld != isDown && isDown) {
            PacketDistributor.sendToServer(new UndeadOstrichJumpMessage(0, 0), new CustomPacketPayload[0]);
            UndeadOstrichJumpMessage.pressAction(Minecraft.getInstance().player, 0, 0);
         }

         this.isDownOld = isDown;
      }
   };
   public static final KeyMapping WYVERN_FLY = new KeyMapping("key.mocreatures.wyvern_fly", 32, "key.categories.mocreatures") {
      private boolean isDownOld = false;

      public void setDown(boolean isDown) {
         super.setDown(isDown);
         if (this.isDownOld != isDown && isDown) {
            PacketDistributor.sendToServer(new WyvernFlyMessage(0, 0), new CustomPacketPayload[0]);
            WyvernFlyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
            MocreaturesModKeyMappings.WYVERN_FLY_LASTPRESS = System.currentTimeMillis();
         } else if (this.isDownOld != isDown && !isDown) {
            int dt = (int)(System.currentTimeMillis() - MocreaturesModKeyMappings.WYVERN_FLY_LASTPRESS);
            PacketDistributor.sendToServer(new WyvernFlyMessage(1, dt), new CustomPacketPayload[0]);
            WyvernFlyMessage.pressAction(Minecraft.getInstance().player, 1, dt);
         }

         this.isDownOld = isDown;
      }
   };
   public static final KeyMapping LION_FLY = new KeyMapping("key.mocreatures.lion_fly", 32, "key.categories.mocreatures") {
      private boolean isDownOld = false;

      public void setDown(boolean isDown) {
         super.setDown(isDown);
         if (this.isDownOld != isDown && isDown) {
            PacketDistributor.sendToServer(new LionFlyMessage(0, 0), new CustomPacketPayload[0]);
            LionFlyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
            MocreaturesModKeyMappings.LION_FLY_LASTPRESS = System.currentTimeMillis();
         } else if (this.isDownOld != isDown && !isDown) {
            int dt = (int)(System.currentTimeMillis() - MocreaturesModKeyMappings.LION_FLY_LASTPRESS);
            PacketDistributor.sendToServer(new LionFlyMessage(1, dt), new CustomPacketPayload[0]);
            LionFlyMessage.pressAction(Minecraft.getInstance().player, 1, dt);
         }

         this.isDownOld = isDown;
      }
   };
   public static final KeyMapping TIGER_FLY = new KeyMapping("key.mocreatures.tiger_fly", 32, "key.categories.mocreatures") {
      private boolean isDownOld = false;

      public void setDown(boolean isDown) {
         super.setDown(isDown);
         if (this.isDownOld != isDown && isDown) {
            PacketDistributor.sendToServer(new TigerFlyMessage(0, 0), new CustomPacketPayload[0]);
            TigerFlyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
            MocreaturesModKeyMappings.TIGER_FLY_LASTPRESS = System.currentTimeMillis();
         } else if (this.isDownOld != isDown && !isDown) {
            int dt = (int)(System.currentTimeMillis() - MocreaturesModKeyMappings.TIGER_FLY_LASTPRESS);
            PacketDistributor.sendToServer(new TigerFlyMessage(1, dt), new CustomPacketPayload[0]);
            TigerFlyMessage.pressAction(Minecraft.getInstance().player, 1, dt);
         }

         this.isDownOld = isDown;
      }
   };
   public static final KeyMapping PANTHER_FLY = new KeyMapping("key.mocreatures.panther_fly", 32, "key.categories.mocreatures") {
      private boolean isDownOld = false;

      public void setDown(boolean isDown) {
         super.setDown(isDown);
         if (this.isDownOld != isDown && isDown) {
            PacketDistributor.sendToServer(new PantherFlyMessage(0, 0), new CustomPacketPayload[0]);
            PantherFlyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
            MocreaturesModKeyMappings.PANTHER_FLY_LASTPRESS = System.currentTimeMillis();
         } else if (this.isDownOld != isDown && !isDown) {
            int dt = (int)(System.currentTimeMillis() - MocreaturesModKeyMappings.PANTHER_FLY_LASTPRESS);
            PacketDistributor.sendToServer(new PantherFlyMessage(1, dt), new CustomPacketPayload[0]);
            PantherFlyMessage.pressAction(Minecraft.getInstance().player, 1, dt);
         }

         this.isDownOld = isDown;
      }
   };
   public static final KeyMapping PANTHGER_FLY = new KeyMapping("key.mocreatures.panthger_fly", 32, "key.categories.mocreatures") {
      private boolean isDownOld = false;

      public void setDown(boolean isDown) {
         super.setDown(isDown);
         if (this.isDownOld != isDown && isDown) {
            PacketDistributor.sendToServer(new PanthgerFlyMessage(0, 0), new CustomPacketPayload[0]);
            PanthgerFlyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
            MocreaturesModKeyMappings.PANTHGER_FLY_LASTPRESS = System.currentTimeMillis();
         } else if (this.isDownOld != isDown && !isDown) {
            int dt = (int)(System.currentTimeMillis() - MocreaturesModKeyMappings.PANTHGER_FLY_LASTPRESS);
            PacketDistributor.sendToServer(new PanthgerFlyMessage(1, dt), new CustomPacketPayload[0]);
            PanthgerFlyMessage.pressAction(Minecraft.getInstance().player, 1, dt);
         }

         this.isDownOld = isDown;
      }
   };
   public static final KeyMapping PANTHARD_FLY = new KeyMapping("key.mocreatures.panthard_fly", 32, "key.categories.mocreatures") {
      private boolean isDownOld = false;

      public void setDown(boolean isDown) {
         super.setDown(isDown);
         if (this.isDownOld != isDown && isDown) {
            PacketDistributor.sendToServer(new PanthardFlyMessage(0, 0), new CustomPacketPayload[0]);
            PanthardFlyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
            MocreaturesModKeyMappings.PANTHARD_FLY_LASTPRESS = System.currentTimeMillis();
         } else if (this.isDownOld != isDown && !isDown) {
            int dt = (int)(System.currentTimeMillis() - MocreaturesModKeyMappings.PANTHARD_FLY_LASTPRESS);
            PacketDistributor.sendToServer(new PanthardFlyMessage(1, dt), new CustomPacketPayload[0]);
            PanthardFlyMessage.pressAction(Minecraft.getInstance().player, 1, dt);
         }

         this.isDownOld = isDown;
      }
   };
   public static final KeyMapping LITHER_FLY = new KeyMapping("key.mocreatures.lither_fly", 32, "key.categories.mocreatures") {
      private boolean isDownOld = false;

      public void setDown(boolean isDown) {
         super.setDown(isDown);
         if (this.isDownOld != isDown && isDown) {
            PacketDistributor.sendToServer(new LitherFlyMessage(0, 0), new CustomPacketPayload[0]);
            LitherFlyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
            MocreaturesModKeyMappings.LITHER_FLY_LASTPRESS = System.currentTimeMillis();
         } else if (this.isDownOld != isDown && !isDown) {
            int dt = (int)(System.currentTimeMillis() - MocreaturesModKeyMappings.LITHER_FLY_LASTPRESS);
            PacketDistributor.sendToServer(new LitherFlyMessage(1, dt), new CustomPacketPayload[0]);
            LitherFlyMessage.pressAction(Minecraft.getInstance().player, 1, dt);
         }

         this.isDownOld = isDown;
      }
   };
   public static final KeyMapping LIGER_FLY = new KeyMapping("key.mocreatures.liger_fly", 32, "key.categories.mocreatures") {
      private boolean isDownOld = false;

      public void setDown(boolean isDown) {
         super.setDown(isDown);
         if (this.isDownOld != isDown && isDown) {
            PacketDistributor.sendToServer(new LigerFlyMessage(0, 0), new CustomPacketPayload[0]);
            LigerFlyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
            MocreaturesModKeyMappings.LIGER_FLY_LASTPRESS = System.currentTimeMillis();
         } else if (this.isDownOld != isDown && !isDown) {
            int dt = (int)(System.currentTimeMillis() - MocreaturesModKeyMappings.LIGER_FLY_LASTPRESS);
            PacketDistributor.sendToServer(new LigerFlyMessage(1, dt), new CustomPacketPayload[0]);
            LigerFlyMessage.pressAction(Minecraft.getInstance().player, 1, dt);
         }

         this.isDownOld = isDown;
      }
   };
   public static final KeyMapping HORSE_FLY = new KeyMapping("key.mocreatures.horse_fly", 32, "key.categories.mocreatures") {
      private boolean isDownOld = false;

      public void setDown(boolean isDown) {
         super.setDown(isDown);
         if (this.isDownOld != isDown && isDown) {
            PacketDistributor.sendToServer(new HorseFlyMessage(0, 0), new CustomPacketPayload[0]);
            HorseFlyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
            MocreaturesModKeyMappings.HORSE_FLY_LASTPRESS = System.currentTimeMillis();
         } else if (this.isDownOld != isDown && !isDown) {
            int dt = (int)(System.currentTimeMillis() - MocreaturesModKeyMappings.HORSE_FLY_LASTPRESS);
            PacketDistributor.sendToServer(new HorseFlyMessage(1, dt), new CustomPacketPayload[0]);
            HorseFlyMessage.pressAction(Minecraft.getInstance().player, 1, dt);
         }

         this.isDownOld = isDown;
      }
   };
   private static long NETHER_OSTRICH_FLY_LASTPRESS = 0L;
   private static long MANTICORE_FLY_LASTPRESS = 0L;
   private static long WYVERN_OSTRICH_FLY_LASTPRESS = 0L;
   private static long WYVERN_FLY_LASTPRESS = 0L;
   private static long LION_FLY_LASTPRESS = 0L;
   private static long TIGER_FLY_LASTPRESS = 0L;
   private static long PANTHER_FLY_LASTPRESS = 0L;
   private static long PANTHGER_FLY_LASTPRESS = 0L;
   private static long PANTHARD_FLY_LASTPRESS = 0L;
   private static long LITHER_FLY_LASTPRESS = 0L;
   private static long LIGER_FLY_LASTPRESS = 0L;
   private static long HORSE_FLY_LASTPRESS = 0L;

   @SubscribeEvent
   public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
      event.register(NETHER_OSTRICH_FLY);
      event.register(UNICORN_OSTRICH_JUMP);
      event.register(MANTICORE_FLY);
      event.register(WYVERN_OSTRICH_FLY);
      event.register(UNDEAD_OSTRICH_JUMP);
      event.register(WYVERN_FLY);
      event.register(LION_FLY);
      event.register(TIGER_FLY);
      event.register(PANTHER_FLY);
      event.register(PANTHGER_FLY);
      event.register(PANTHARD_FLY);
      event.register(LITHER_FLY);
      event.register(LIGER_FLY);
      event.register(HORSE_FLY);
   }

   @EventBusSubscriber(Dist.CLIENT)
   public static class KeyEventListener {
      @SubscribeEvent
      public static void onClientTick(Post event) {
         if (Minecraft.getInstance().screen == null) {
            MocreaturesModKeyMappings.NETHER_OSTRICH_FLY.consumeClick();
            MocreaturesModKeyMappings.UNICORN_OSTRICH_JUMP.consumeClick();
            MocreaturesModKeyMappings.MANTICORE_FLY.consumeClick();
            MocreaturesModKeyMappings.WYVERN_OSTRICH_FLY.consumeClick();
            MocreaturesModKeyMappings.UNDEAD_OSTRICH_JUMP.consumeClick();
            MocreaturesModKeyMappings.WYVERN_FLY.consumeClick();
            MocreaturesModKeyMappings.LION_FLY.consumeClick();
            MocreaturesModKeyMappings.TIGER_FLY.consumeClick();
            MocreaturesModKeyMappings.PANTHER_FLY.consumeClick();
            MocreaturesModKeyMappings.PANTHGER_FLY.consumeClick();
            MocreaturesModKeyMappings.PANTHARD_FLY.consumeClick();
            MocreaturesModKeyMappings.LITHER_FLY.consumeClick();
            MocreaturesModKeyMappings.LIGER_FLY.consumeClick();
            MocreaturesModKeyMappings.HORSE_FLY.consumeClick();
         }
      }
   }
}
