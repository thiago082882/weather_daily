package com.example.jetweatherapp.data.mapper

interface ApiMapper<Domain,Entity> {

    fun mapToDomain(apiEntity: Entity):Domain
}