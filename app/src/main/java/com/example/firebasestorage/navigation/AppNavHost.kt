package com.example.firebasestorage.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.ui.theme.screens.Services.ServicesScreen
import com.example.firebasestorage.ui.theme.screens.Splash.SplashScreen
import com.example.firebasestorage.ui.theme.screens.about.AboutScreen
import com.example.firebasestorage.ui.theme.screens.dashboard.DashBoardScreen
import com.example.firebasestorage.ui.theme.screens.home.HomeScreen
import com.example.firebasestorage.ui.theme.screens.login.LoginScreen
import com.example.firebasestorage.ui.theme.screens.signup.SignupScreen
import com.example.firebasestorage.ui.theme.screens.upload.UploadScreen

@Composable
fun AppNavHost(modifier: Modifier = Modifier, navController:NavHostController = rememberNavController(), startDestination:String = ROUT_SPLASH) {
    NavHost(navController = navController, modifier=modifier, startDestination = startDestination){
        composable(ROUT_HOME){
            HomeScreen(navController)
        }

        composable(ROUT_LOGIN){
            LoginScreen(navController)
        }

        composable(ROUT_SIGNUP){
            SignupScreen(navController)
        }

        composable(ROUT_UPLOAD){
            UploadScreen(navController)
        }
        composable(ROUT_DASHBOARD){
            DashBoardScreen(navController)
        }
        composable(ROUT_SPLASH){
            SplashScreen(navController)
        }
        composable(ROUT_ABOUT){
            AboutScreen(navController)
        }
        composable(ROUT_SERVICES){
            ServicesScreen(navController)
        }
    }
}