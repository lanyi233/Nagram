/*
 * This is the source code of Telegram for Android v. 2.0.x.
 * It is licensed under GNU GPL v. 2 or later.
 * You should have received a copy of the license in this archive (see LICENSE).
 *
 * Copyright Nikolai Kudashov, 2013-2018.
 */

package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.evildayz.code.telegraher.ThePenisMightierThanTheSword;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;

public class EmojiReplacementCell extends FrameLayout {

    private ImageView imageView;
    private String emoji;
    private final Theme.ResourcesProvider resourcesProvider;

    public EmojiReplacementCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.resourcesProvider = resourcesProvider;

        imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, LayoutHelper.createFrame(42, 42, Gravity.CENTER_HORIZONTAL, 0, 5, 0, 0));
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52) + getPaddingLeft() + getPaddingRight(), MeasureSpec.EXACTLY), MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(54), MeasureSpec.EXACTLY));
    }

    public void setEmoji(String e, int side) {
        emoji = e;
        imageView.setImageDrawable(Emoji.getEmojiBigDrawable(e));
        if (side == -1) {
            setBackgroundResource(R.drawable.stickers_back_left);
            setPadding(AndroidUtilities.dp(7), 0, 0, 0);
        } else if (side == 0) {
            setBackgroundResource(R.drawable.stickers_back_center);
            setPadding(0, 0, 0, 0);
        } else if (side == 1) {
            setBackgroundResource(R.drawable.stickers_back_right);
            setPadding(0, 0, AndroidUtilities.dp(7), 0);
        } else if (side == 2) {
            setBackgroundResource(R.drawable.stickers_back_all);
            setPadding(AndroidUtilities.dp(3), 0, AndroidUtilities.dp(3), 0);
        }
        Drawable background = getBackground();
        if (background != null) {
            background.setAlpha(230);
            background.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_chat_stickersHintPanel), PorterDuff.Mode.MULTIPLY));
        }
    }

    public String getEmoji() {
        return emoji;
    }

    @Override
    public void invalidate() {
        super.invalidate();
        imageView.invalidate();
    }

    private int getThemedColor(String key) {
        Integer color = resourcesProvider != null ? resourcesProvider.getColor(key) : null;
        return color != null ? color : Theme.getColor(key);
    }
}
