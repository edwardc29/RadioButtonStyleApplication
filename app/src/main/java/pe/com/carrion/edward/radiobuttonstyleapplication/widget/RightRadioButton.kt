package pe.com.carrion.edward.radiobuttonstyleapplication.widget

import android.content.Context
import android.graphics.drawable.StateListDrawable
import android.util.AttributeSet
import android.widget.RadioButton
import androidx.appcompat.view.ContextThemeWrapper
import androidx.core.content.ContextCompat
import pe.com.carrion.edward.radiobuttonstyleapplication.R

class RightRadioButton : RadioButton {
    constructor(context: Context) : this(context, null)

    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        ContextThemeWrapper(context, R.style.RightRadioButtonStyle),
        attrs,
        defStyleAttr
    )
}