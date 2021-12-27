package dev.amal.socialnetwork.di

import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.amal.socialnetwork.feature_post.data.remote.PostApi
import dev.amal.socialnetwork.feature_post.data.repository.PostRepositoryImpl
import dev.amal.socialnetwork.feature_post.domain.repository.PostRepository
import dev.amal.socialnetwork.feature_post.domain.use_case.CreatePostUseCase
import dev.amal.socialnetwork.feature_post.domain.use_case.GetPostsForFollowsUseCase
import dev.amal.socialnetwork.feature_post.domain.use_case.PostUseCases
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object PostModule {

    @Provides
    @Singleton
    fun providePostApi(client: OkHttpClient): PostApi = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(PostApi.BASE_URL)
        .client(client)
        .build()
        .create(PostApi::class.java)

    @Provides
    @Singleton
    fun providePostRepository(api: PostApi, gson: Gson): PostRepository =
        PostRepositoryImpl(api, gson)

    @Provides
    @Singleton
    fun providePostUseCases(
        repository: PostRepository
    ): PostUseCases = PostUseCases(
        getPostsForFollows = GetPostsForFollowsUseCase(repository),
        createPostUseCase = CreatePostUseCase(repository)
    )

}