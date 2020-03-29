package pe.com.carrion.edward.customradiobutton

import android.content.Context
import android.util.AttributeSet
import android.widget.RadioGroup
import androidx.appcompat.view.ContextThemeWrapper

class MyRadioGroup : RadioGroup {
    constructor(context: Context?) : this(context, null)
    constructor(context: Context?, attrs: AttributeSet?) : super(
        ContextThemeWrapper(
            context,
            R.style.MyRadioGroupStyle
        ), attrs
    )
}