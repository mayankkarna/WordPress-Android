package org.wordpress.android.ui.utils

import android.text.Spanned
import androidx.annotation.StringRes
import androidx.core.text.HtmlCompat
import org.wordpress.android.viewmodel.ResourceProvider
import javax.inject.Inject

class HtmlMessageUtils
@Inject constructor(private val resourceProvider: ResourceProvider) {
    fun getHtmlMessageFromStringFormatResId(@StringRes formatResId: Int, vararg args: Any?): Spanned {
        return HtmlCompat.fromHtml(
                String.format(resourceProvider.getString(formatResId), *args),
                HtmlCompat.FROM_HTML_MODE_LEGACY
        )
    }
}
