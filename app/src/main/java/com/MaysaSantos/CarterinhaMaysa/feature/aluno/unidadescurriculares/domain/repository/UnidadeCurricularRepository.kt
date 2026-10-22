package com.MaysaSantos.CarterinhaMaysa.feature.aluno.unidadescurriculares.domain.repository

import com.MaysaSantos.CarterinhaMaysa.feature.aluno.unidadescurriculares.domain.model.UnidadeCurricular

interface UnidadeCurricularRepository {
    suspend fun listar():Result<List<UnidadeCurricular>>
}