package com.MaysaSantos.CarterinhaMaysa.app.di

import com.MaysaSantos.CarterinhaMaysa.core.auth.SessionTokenStore
import com.MaysaSantos.CarterinhaMaysa.feature.aluno.unidadescurriculares.domain.repository.UnidadeCurricularRepository
import com.MaysaSantos.CarterinhaMaysa.feature.login.domain.repository.LoginRepository

interface AppContainer {
    val sessionTokenStore: SessionTokenStore
    val loginRepository: LoginRepository
    val unidadeCurricularRepository: UnidadeCurricularRepository
}
