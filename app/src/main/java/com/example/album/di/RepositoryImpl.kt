package com.example.album.di

import com.example.album.infra.repository.AlbumRepository
import com.example.album.infra.repository.AlbumRepositoryImpl
import com.example.album.infra.repository.EventRepository
import com.example.album.infra.repository.EventRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryImpl {

  @Binds
  fun bindAlbumRepository(impl: AlbumRepositoryImpl): AlbumRepository

  @Binds
  fun bindEventRepository(impl: EventRepositoryImpl): EventRepository
}
