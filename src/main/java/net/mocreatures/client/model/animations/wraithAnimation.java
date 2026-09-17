package net.mocreatures.client.model.animations;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.animation.AnimationChannel.Interpolations;
import net.minecraft.client.animation.AnimationChannel.Targets;
import net.minecraft.client.animation.AnimationDefinition.Builder;

public class wraithAnimation {
   public static final AnimationDefinition idle = Builder.withLength(6.321F)
      .looping()
      .addAnimation(
         "bipedRightArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.3945F, KeyframeAnimations.degreeVec(-0.0024F, -0.0024F, -0.109F), Interpolations.LINEAR),
               new Keyframe(1.5779F, KeyframeAnimations.degreeVec(-0.0024F, 1.4976F, -0.1091F), Interpolations.LINEAR),
               new Keyframe(2.7613F, KeyframeAnimations.degreeVec(-1.5024F, 2.4976F, -0.1091F), Interpolations.LINEAR),
               new Keyframe(3.9448F, KeyframeAnimations.degreeVec(-2.5001F, -0.4995F, 0.0218F), Interpolations.LINEAR),
               new Keyframe(5.1282F, KeyframeAnimations.degreeVec(-1.0024F, -2.4976F, 0.1091F), Interpolations.LINEAR),
               new Keyframe(6.3116F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "bipedLeftArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.0024F, 0.0024F, 0.109F), Interpolations.LINEAR),
               new Keyframe(1.1834F, KeyframeAnimations.degreeVec(-0.0024F, -1.4976F, 0.1091F), Interpolations.LINEAR),
               new Keyframe(2.3669F, KeyframeAnimations.degreeVec(-1.5024F, -2.4976F, 0.1091F), Interpolations.LINEAR),
               new Keyframe(3.5503F, KeyframeAnimations.degreeVec(-2.5001F, 0.4995F, -0.0218F), Interpolations.LINEAR),
               new Keyframe(4.7337F, KeyframeAnimations.degreeVec(-1.0024F, 2.4976F, -0.1091F), Interpolations.LINEAR),
               new Keyframe(5.9172F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .build();
}
