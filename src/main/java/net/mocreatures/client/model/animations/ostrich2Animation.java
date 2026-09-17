package net.mocreatures.client.model.animations;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.animation.AnimationChannel.Interpolations;
import net.minecraft.client.animation.AnimationChannel.Targets;
import net.minecraft.client.animation.AnimationDefinition.Builder;

public class ostrich2Animation {
   public static final AnimationDefinition idle = Builder.withLength(0.0F).build();
   public static final AnimationDefinition walk = Builder.withLength(1.0256F)
      .looping()
      .addAnimation(
         "LLegA",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(45.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.5128F, KeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0256F, KeyframeAnimations.degreeVec(45.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "RLegA",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.5128F, KeyframeAnimations.degreeVec(45.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0256F, KeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "LWingC",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.5128F, KeyframeAnimations.degreeVec(0.0F, 15.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0256F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "RWingC",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.5128F, KeyframeAnimations.degreeVec(0.0F, -15.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0256F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "LWingD",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -10.0F), Interpolations.LINEAR),
               new Keyframe(0.5128F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 10.0F), Interpolations.LINEAR),
               new Keyframe(1.0256F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -10.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "RWingD",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 10.0F), Interpolations.LINEAR),
               new Keyframe(0.5128F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -10.0F), Interpolations.LINEAR),
               new Keyframe(1.0256F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 10.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "Wyvern2",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 5.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "Wyvern3",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 5.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.5128F, KeyframeAnimations.degreeVec(0.0F, -5.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0256F, KeyframeAnimations.degreeVec(0.0F, 5.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "Wyvern4",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 5.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.5128F, KeyframeAnimations.degreeVec(0.0F, -5.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0256F, KeyframeAnimations.degreeVec(0.0F, 5.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "Wyvern5",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 5.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.5128F, KeyframeAnimations.degreeVec(0.0F, -5.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0256F, KeyframeAnimations.degreeVec(0.0F, 5.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "Wyvern6",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 20.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.5128F, KeyframeAnimations.degreeVec(0.0F, -20.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0256F, KeyframeAnimations.degreeVec(0.0F, 20.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .build();
}
