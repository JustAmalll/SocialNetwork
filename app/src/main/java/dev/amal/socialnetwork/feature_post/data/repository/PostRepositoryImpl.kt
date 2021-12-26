package dev.amal.socialnetwork.feature_post.data.repository

import com.google.gson.Gson
import dev.amal.socialnetwork.R
import dev.amal.socialnetwork.core.domain.models.Post
import dev.amal.socialnetwork.core.util.Resource
import dev.amal.socialnetwork.core.util.UiText
import dev.amal.socialnetwork.feature_post.data.remote.PostApi
import dev.amal.socialnetwork.feature_post.domain.repository.PostRepository
import retrofit2.HttpException
import java.io.IOException

class PostRepositoryImpl(
    private val api: PostApi,
    private val gson: Gson
) : PostRepository {

    override suspend fun getPostsForFollows(page: Int, pageSize: Int): Resource<List<Post>> {
        return try {
            val posts = api.getPostsForFollows(page = page, pageSize = pageSize)
            Resource.Success(data = posts)
        } catch (e: IOException) {
            Resource.Error(
                uiText = UiText.StringResource(R.string.error_couldnt_reach_server)
            )
        } catch (e: HttpException) {
            Resource.Error(
                uiText = UiText.StringResource(R.string.oops_something_went_wrong)
            )
        }
    }
}