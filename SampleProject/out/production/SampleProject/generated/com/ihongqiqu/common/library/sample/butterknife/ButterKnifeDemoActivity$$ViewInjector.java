// Generated code from Butter Knife. Do not modify!
package com.ihongqiqu.common.library.sample.butterknife;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class ButterKnifeDemoActivity$$ViewInjector<T extends com.ihongqiqu.common.library.sample.butterknife.ButterKnifeDemoActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131034112, "field 'tvTitle'");
    target.tvTitle = finder.castView(view, 2131034112, "field 'tvTitle'");
    view = finder.findRequiredView(source, 2131034113, "field 'btnSubmit' and method 'doSubmit'");
    target.btnSubmit = finder.castView(view, 2131034113, "field 'btnSubmit'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.doSubmit();
        }
      });
    view = finder.findRequiredView(source, 2131034114, "field 'imgPhoto'");
    target.imgPhoto = finder.castView(view, 2131034114, "field 'imgPhoto'");
  }

  @Override public void reset(T target) {
    target.tvTitle = null;
    target.btnSubmit = null;
    target.imgPhoto = null;
  }
}
