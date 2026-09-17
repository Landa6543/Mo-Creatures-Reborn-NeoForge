package net.mocreatures.client.model.animations;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.animation.AnimationChannel.Interpolations;
import net.minecraft.client.animation.AnimationChannel.Targets;
import net.minecraft.client.animation.AnimationDefinition.Builder;

public class WyvernAnimation {
   public static final AnimationDefinition walk = Builder.withLength(2.0F)
      .looping()
      .addAnimation(
         "tail1",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -5.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 5.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, -5.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.4583F, KeyframeAnimations.degreeVec(0.0F, 5.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, -5.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "tail2",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0417F, KeyframeAnimations.degreeVec(0.0F, -10.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.5417F, KeyframeAnimations.degreeVec(0.0F, 10.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0417F, KeyframeAnimations.degreeVec(0.0F, -10.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 10.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, -10.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "tail3",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0833F, KeyframeAnimations.degreeVec(0.0F, -10.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.5833F, KeyframeAnimations.degreeVec(0.0F, 10.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0833F, KeyframeAnimations.degreeVec(0.0F, -10.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.5417F, KeyframeAnimations.degreeVec(0.0F, 10.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, -10.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "tail4",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, -5.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, 5.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.0F, -5.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.5833F, KeyframeAnimations.degreeVec(0.0F, 5.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, -5.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "tail5",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.1667F, KeyframeAnimations.degreeVec(0.0F, -10.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.6667F, KeyframeAnimations.degreeVec(0.0F, 10.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.1667F, KeyframeAnimations.degreeVec(0.0F, -10.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.625F, KeyframeAnimations.degreeVec(0.0F, 10.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, -10.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rightupleg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-25.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-25.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-25.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(-25.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(-25.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "leftupleg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(-25.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-25.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-25.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(-25.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "leftuparm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 20.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 20.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 20.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 20.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 20.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rightuparm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, -20.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, -20.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(0.0F, -20.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(0.0F, -20.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "neck2",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .build();
   public static final AnimationDefinition fly = Builder.withLength(1.0F)
      .looping()
      .addAnimation(
         "torso",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(2.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.35F, KeyframeAnimations.degreeVec(-7.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.7F, KeyframeAnimations.degreeVec(4.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(2.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "torso",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, -2.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.75F, KeyframeAnimations.posVec(0.0F, 1.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "neck2",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(44.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.35F, KeyframeAnimations.degreeVec(49.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.7F, KeyframeAnimations.degreeVec(42.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(44.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "neck1",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-16.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.35F, KeyframeAnimations.degreeVec(-22.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.7F, KeyframeAnimations.degreeVec(-13.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-16.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-32.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.35F, KeyframeAnimations.degreeVec(-40.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.7F, KeyframeAnimations.degreeVec(-28.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-32.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "Jaw",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.35F, KeyframeAnimations.degreeVec(14.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.65F, KeyframeAnimations.degreeVec(3.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "leftuparm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-50.0F, 10.0F, -75.0F), Interpolations.LINEAR),
               new Keyframe(0.2F, KeyframeAnimations.degreeVec(-20.0F, 30.0F, -25.0F), Interpolations.LINEAR),
               new Keyframe(0.45F, KeyframeAnimations.degreeVec(12.0F, 48.0F, 22.0F), Interpolations.LINEAR),
               new Keyframe(0.7F, KeyframeAnimations.degreeVec(-25.0F, 22.0F, -35.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-50.0F, 10.0F, -75.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "leftlowarm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-4.0F, -50.0F, -12.0F), Interpolations.LINEAR),
               new Keyframe(0.2F, KeyframeAnimations.degreeVec(2.0F, -35.0F, 5.0F), Interpolations.LINEAR),
               new Keyframe(0.45F, KeyframeAnimations.degreeVec(5.0F, -25.0F, 12.0F), Interpolations.LINEAR),
               new Keyframe(0.7F, KeyframeAnimations.degreeVec(-15.0F, -90.0F, -30.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-4.0F, -50.0F, -12.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "leftfing1a",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 85.0F, -8.0F), Interpolations.LINEAR),
               new Keyframe(0.2F, KeyframeAnimations.degreeVec(5.0F, 90.0F, 10.0F), Interpolations.LINEAR),
               new Keyframe(0.45F, KeyframeAnimations.degreeVec(10.0F, 95.0F, 22.0F), Interpolations.LINEAR),
               new Keyframe(0.7F, KeyframeAnimations.degreeVec(-8.0F, 75.0F, -18.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 85.0F, -8.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "leftfing1b",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -5.0F), Interpolations.LINEAR),
               new Keyframe(0.45F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 22.0F), Interpolations.LINEAR),
               new Keyframe(0.7F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -15.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -5.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "leftwingflap1",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -5.0F), Interpolations.LINEAR),
               new Keyframe(0.45F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 22.0F), Interpolations.LINEAR),
               new Keyframe(0.7F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -18.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -5.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "leftfing2a",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 38.0F, -5.0F), Interpolations.LINEAR),
               new Keyframe(0.2F, KeyframeAnimations.degreeVec(4.0F, 42.0F, 12.0F), Interpolations.LINEAR),
               new Keyframe(0.45F, KeyframeAnimations.degreeVec(8.0F, 45.0F, 20.0F), Interpolations.LINEAR),
               new Keyframe(0.7F, KeyframeAnimations.degreeVec(-6.0F, 30.0F, -16.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 38.0F, -5.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "leftfing2b",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -5.0F), Interpolations.LINEAR),
               new Keyframe(0.45F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 20.0F), Interpolations.LINEAR),
               new Keyframe(0.7F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -14.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -5.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "leftwingflap2",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -15.0F), Interpolations.LINEAR),
               new Keyframe(0.45F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 15.0F), Interpolations.LINEAR),
               new Keyframe(0.7F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -28.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -15.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "leftfing3a",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 8.0F, -4.0F), Interpolations.LINEAR),
               new Keyframe(0.2F, KeyframeAnimations.degreeVec(3.0F, 15.0F, 10.0F), Interpolations.LINEAR),
               new Keyframe(0.45F, KeyframeAnimations.degreeVec(6.0F, 18.0F, 16.0F), Interpolations.LINEAR),
               new Keyframe(0.7F, KeyframeAnimations.degreeVec(-4.0F, 5.0F, -14.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 8.0F, -4.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "leftfing3b",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -4.0F), Interpolations.LINEAR),
               new Keyframe(0.45F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 16.0F), Interpolations.LINEAR),
               new Keyframe(0.7F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -12.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -4.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "leftwingflap3",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -10.0F), Interpolations.LINEAR),
               new Keyframe(0.45F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 14.0F), Interpolations.LINEAR),
               new Keyframe(0.7F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -22.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -10.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rightuparm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-50.0F, -10.0F, 75.0F), Interpolations.LINEAR),
               new Keyframe(0.2F, KeyframeAnimations.degreeVec(-20.0F, -30.0F, 25.0F), Interpolations.LINEAR),
               new Keyframe(0.45F, KeyframeAnimations.degreeVec(12.0F, -48.0F, -22.0F), Interpolations.LINEAR),
               new Keyframe(0.7F, KeyframeAnimations.degreeVec(-25.0F, -22.0F, 35.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-50.0F, -10.0F, 75.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rightlowarm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-4.0F, 50.0F, 12.0F), Interpolations.LINEAR),
               new Keyframe(0.2F, KeyframeAnimations.degreeVec(2.0F, 35.0F, -5.0F), Interpolations.LINEAR),
               new Keyframe(0.45F, KeyframeAnimations.degreeVec(5.0F, 25.0F, -12.0F), Interpolations.LINEAR),
               new Keyframe(0.7F, KeyframeAnimations.degreeVec(-15.0F, 90.0F, 30.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-4.0F, 50.0F, 12.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rightfing1a",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 85.0F, 8.0F), Interpolations.LINEAR),
               new Keyframe(0.2F, KeyframeAnimations.degreeVec(5.0F, 90.0F, -10.0F), Interpolations.LINEAR),
               new Keyframe(0.45F, KeyframeAnimations.degreeVec(10.0F, 95.0F, -22.0F), Interpolations.LINEAR),
               new Keyframe(0.7F, KeyframeAnimations.degreeVec(-8.0F, 75.0F, 18.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 85.0F, 8.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rightfing1b",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 5.0F), Interpolations.LINEAR),
               new Keyframe(0.45F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -22.0F), Interpolations.LINEAR),
               new Keyframe(0.7F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 15.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 5.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rightwingflap1",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 5.0F), Interpolations.LINEAR),
               new Keyframe(0.45F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -22.0F), Interpolations.LINEAR),
               new Keyframe(0.7F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 18.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 5.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rightfing2a",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -38.0F, 5.0F), Interpolations.LINEAR),
               new Keyframe(0.2F, KeyframeAnimations.degreeVec(4.0F, -42.0F, -12.0F), Interpolations.LINEAR),
               new Keyframe(0.45F, KeyframeAnimations.degreeVec(8.0F, -45.0F, -20.0F), Interpolations.LINEAR),
               new Keyframe(0.7F, KeyframeAnimations.degreeVec(-6.0F, -30.0F, 16.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, -38.0F, 5.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rightfing2b",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 5.0F), Interpolations.LINEAR),
               new Keyframe(0.45F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -20.0F), Interpolations.LINEAR),
               new Keyframe(0.7F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 14.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 5.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rightwingflap2",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 15.0F), Interpolations.LINEAR),
               new Keyframe(0.45F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -15.0F), Interpolations.LINEAR),
               new Keyframe(0.7F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 28.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 15.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rightfing3a",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -8.0F, 4.0F), Interpolations.LINEAR),
               new Keyframe(0.2F, KeyframeAnimations.degreeVec(3.0F, -15.0F, -10.0F), Interpolations.LINEAR),
               new Keyframe(0.45F, KeyframeAnimations.degreeVec(6.0F, -18.0F, -16.0F), Interpolations.LINEAR),
               new Keyframe(0.7F, KeyframeAnimations.degreeVec(-4.0F, -5.0F, 14.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, -8.0F, 4.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rightfing3b",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 4.0F), Interpolations.LINEAR),
               new Keyframe(0.45F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -16.0F), Interpolations.LINEAR),
               new Keyframe(0.7F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 12.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 4.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rightwingflap3",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 10.0F), Interpolations.LINEAR),
               new Keyframe(0.45F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -14.0F), Interpolations.LINEAR),
               new Keyframe(0.7F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 22.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 10.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "leftupleg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(32.0F, 0.0F, -3.0F), Interpolations.LINEAR),
               new Keyframe(0.4F, KeyframeAnimations.degreeVec(44.0F, 0.0F, -3.0F), Interpolations.LINEAR),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(28.0F, 0.0F, -3.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(32.0F, 0.0F, -3.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "leftmidleg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-18.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.4F, KeyframeAnimations.degreeVec(-8.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-24.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-18.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "leftfoot",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(25.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.4F, KeyframeAnimations.degreeVec(38.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(18.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(25.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rightupleg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(32.0F, 0.0F, 3.0F), Interpolations.LINEAR),
               new Keyframe(0.4F, KeyframeAnimations.degreeVec(44.0F, 0.0F, 3.0F), Interpolations.LINEAR),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(28.0F, 0.0F, 3.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(32.0F, 0.0F, 3.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rightmidleg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-18.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.4F, KeyframeAnimations.degreeVec(-8.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-24.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-18.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rightfoot",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(25.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.4F, KeyframeAnimations.degreeVec(38.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(18.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(25.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "tail1",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(4.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.35F, KeyframeAnimations.degreeVec(-6.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.7F, KeyframeAnimations.degreeVec(7.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(4.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "tail2",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(2.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.45F, KeyframeAnimations.degreeVec(-9.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.8F, KeyframeAnimations.degreeVec(9.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(2.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "tail3",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-4.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.55F, KeyframeAnimations.degreeVec(-12.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.85F, KeyframeAnimations.degreeVec(12.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-4.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "tail4",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.65F, KeyframeAnimations.degreeVec(-14.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.9F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-7.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "tail5",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.3F, KeyframeAnimations.degreeVec(16.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-16.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .build();
   public static final AnimationDefinition idle = Builder.withLength(1.75F)
      .addAnimation(
         "Jaw",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.9583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(25.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.7083F, KeyframeAnimations.degreeVec(25.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .build();
}
