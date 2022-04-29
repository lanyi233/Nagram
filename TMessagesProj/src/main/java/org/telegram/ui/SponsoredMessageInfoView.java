package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.evildayz.code.telegraher.ThePenisMightierThanTheSword;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.browser.Browser;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;

public class SponsoredMessageInfoView extends FrameLayout {

    LinearLayout linearLayout;

    public SponsoredMessageInfoView(Activity context, Theme.ResourcesProvider resourcesProvider) {
        super(context);

        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString("SponsoredMessageInfo", R.string.SponsoredMessageInfo));
        textView.setTypeface(ThePenisMightierThanTheSword.getFont(MessagesController.getGlobalTelegraherUICustomFont("fonts/rmedium.ttf", "rmedium")));
        textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        textView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 20);

        TextView description1 = new TextView(context);
        description1.setText(LocaleController.getString("SponsoredMessageInfoDescription1", R.string.SponsoredMessageInfoDescription1));
        description1.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        description1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 14);
        description1.setLineSpacing(AndroidUtilities.dp(2), 1f);

        TextView description2 = new TextView(context);
        description2.setText(LocaleController.getString("SponsoredMessageInfoDescription2", R.string.SponsoredMessageInfoDescription2));
        description2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        description2.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 14);
        description2.setLineSpacing(AndroidUtilities.dp(2), 1f);

        TextView description3 = new TextView(context);
        description3.setText(LocaleController.getString("SponsoredMessageInfoDescription3", R.string.SponsoredMessageInfoDescription3));
        description3.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        description3.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 14);
        description3.setLineSpacing(AndroidUtilities.dp(2), 1f);

        Paint buttonPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        buttonPaint.setStyle(Paint.Style.STROKE);
        buttonPaint.setColor(Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider));
        buttonPaint.setStrokeWidth(AndroidUtilities.dp(1));
        TextView button = new TextView(context) {

            @Override
            protected void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                AndroidUtilities.rectTmp.set(AndroidUtilities.dp(1), AndroidUtilities.dp(1), getMeasuredWidth() - AndroidUtilities.dp(1), getMeasuredHeight() - AndroidUtilities.dp(1));
                canvas.drawRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(4), AndroidUtilities.dp(4), buttonPaint);
            }
        };
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Browser.openUrl(context, LocaleController.getString("SponsoredMessageAlertLearnMoreUrl", R.string.SponsoredMessageAlertLearnMoreUrl));
            }
        });

        button.setPadding(AndroidUtilities.dp(12), 0, AndroidUtilities.dp(12), 0);
        button.setText(LocaleController.getString("SponsoredMessageAlertLearnMoreUrl", R.string.SponsoredMessageAlertLearnMoreUrl));
        button.setTextColor(Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider));
        button.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(4), Theme.getColor(Theme.key_dialogBackground, resourcesProvider), Theme.getColor(Theme.key_featuredStickers_addButtonPressed, resourcesProvider)));
        button.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 14);
        button.setGravity(Gravity.CENTER_VERTICAL);


        TextView description4 = new TextView(context);
        description4.setText(LocaleController.getString("SponsoredMessageInfoDescription4", R.string.SponsoredMessageInfoDescription4));
        description4.setLineSpacing(AndroidUtilities.dp(2), 1f);
        description4.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        description4.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 14);

        linearLayout.addView(textView);
        linearLayout.addView(description1, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT, 0, 0, 18, 0, 0));
        linearLayout.addView(description2, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT, 0, 0, 24, 0, 0));
        linearLayout.addView(description3, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT, 0, 0, 24, 0, 0));
        linearLayout.addView(button, LayoutHelper.createLinear(LayoutHelper.WRAP_CONTENT, 34, Gravity.CENTER_HORIZONTAL, 0, 14, 0, 0));
        linearLayout.addView(description4, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT, 0, 0, 14, 0, 0));

        ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(linearLayout);
        addView(scrollView, LayoutHelper.createFrame(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT, 0, 22, 12, 22, 22));

    }
}
