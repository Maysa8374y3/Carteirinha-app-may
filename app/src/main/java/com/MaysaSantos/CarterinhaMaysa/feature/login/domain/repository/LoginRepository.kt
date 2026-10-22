package com.MaysaSantos.CarterinhaMaysa.feature.login.domain.repository

import com.MaysaSantos.CarterinhaMaysa.feature.login.domain.model.UsuarioLogado

interface LoginRepository {
    suspend fun login(login: String, senha: String): Result<UsuarioLogado>
}