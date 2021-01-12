package org.wordpress.android.ui.reader.repository.usecases

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import org.wordpress.android.modules.BG_THREAD
import org.wordpress.android.ui.reader.actions.ReaderBlogActions
import org.wordpress.android.ui.reader.actions.ReaderBlogActions.BlockedBlogResult
import javax.inject.Inject
import javax.inject.Named

class UndoBlockBlogUseCase @Inject constructor(@Named(BG_THREAD) private val bgDispatcher: CoroutineDispatcher) {
    suspend fun undoBlockBlog(blockedBlogData: BlockedBlogResult) {
        withContext(bgDispatcher) {
            ReaderBlogActions.undoBlockBlogFromReader(blockedBlogData)
        }
    }
}
