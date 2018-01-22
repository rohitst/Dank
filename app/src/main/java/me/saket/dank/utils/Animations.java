package me.saket.dank.utils;

import android.support.transition.ChangeBounds;
import android.support.transition.Fade;
import android.support.transition.TransitionSet;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.view.animation.Interpolator;

/**
 * Animation utilities.
 */
public class Animations {

  public static final int TRANSITION_ANIM_DURATION = 200;
  public static final Interpolator INTERPOLATOR = new FastOutSlowInInterpolator();

  public static TransitionSet transitions() {
    return new TransitionSet()
        .addTransition(new ChangeBounds().setInterpolator(Animations.INTERPOLATOR))
        .addTransition(new Fade(Fade.IN).setInterpolator(Animations.INTERPOLATOR))
        .addTransition(new Fade(Fade.OUT).setInterpolator(Animations.INTERPOLATOR))
        .setOrdering(TransitionSet.ORDERING_TOGETHER)
        .setDuration(TRANSITION_ANIM_DURATION);
  }
}
