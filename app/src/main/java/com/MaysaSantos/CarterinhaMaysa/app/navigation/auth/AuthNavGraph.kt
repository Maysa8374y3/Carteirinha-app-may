package com.MaysaSantos.CarterinhaMaysa.app.navigation.auth

import androidx.compose.runtime.remember
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.MaysaSantos.CarterinhaMaysa.app.navigation.GraphRoutes
import com.MaysaSantos.CarterinhaMaysa.feature.login.domain.model.UsuarioLogado
import com.MaysaSantos.CarterinhaMaysa.feature.login.domain.repository.LoginRepository
import com.MaysaSantos.CarterinhaMaysa.feature.login.presentation.LoginViewModel
import com.MaysaSantos.CarterinhaMaysa.feature.login.presentation.factory.LoginViewModelFactory
import com.MaysaSantos.CarterinhaMaysa.feature.login.presentation.screen.LoginScreen

fun NavGraphBuilder.authNavGraph(
    loginRepository: LoginRepository,
    onLoginSucesso: (UsuarioLogado) -> Unit
) {
    navigation(
        startDestination = AuthRoutes.LOGIN,
        route = GraphRoutes.AUTH
    ) {
        composable(route = AuthRoutes.LOGIN) {
            val factory = remember(loginRepository) {
                LoginViewModelFactory(
                    repository = loginRepository
                )
            }

            val loginViewModel: LoginViewModel = viewModel(
                factory = factory
            )

            LoginScreen(
                viewModel = loginViewModel,
                onLoginSucesso = onLoginSucesso
            )
        }
    }
}