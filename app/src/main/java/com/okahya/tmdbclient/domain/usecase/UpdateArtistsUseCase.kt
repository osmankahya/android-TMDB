package com.okahya.tmdbclient.domain.usecase

import com.okahya.tmdbclient.data.model.artist.Artist
import com.okahya.tmdbclient.domain.repository.ArtistRepository

class UpdateArtistsUseCase(private val artistRepository: ArtistRepository) {
    suspend fun execute(): List<Artist>? = artistRepository.updateArtists()
}