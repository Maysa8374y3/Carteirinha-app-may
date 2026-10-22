package com.MaysaSantos.CarterinhaMaysa.feature.aluno.unidadescurriculares.presentation

import com.MaysaSantos.CarterinhaMaysa.feature.aluno.unidadescurriculares.domain.model.UnidadeCurricular

data class UnidadeCurricularUiState(
    val isLoading: Boolean = false,
    val unidades: List<UnidadeCurricular> = emptyList(),
    val errorMessage: String? = null
)