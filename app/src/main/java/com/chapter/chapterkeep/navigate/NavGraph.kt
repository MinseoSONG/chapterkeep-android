package com.chapter.chapterkeep.navigate

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.chapter.chapterkeep.model.Routes
import com.chapter.chapterkeep.ui.screen.loginScreen.LoginScreen
import com.chapter.chapterkeep.ui.screen.loginScreen.SignupScreen_ID
import com.chapter.chapterkeep.ui.screen.loginScreen.SignupScreen_NickName
import com.chapter.chapterkeep.ui.screen.startScreen.SplashScreen

@Composable
fun NavGraph(navController: NavHostController){
    NavHost(navController = navController, startDestination = Routes.Splash.route){
        // 초기 화면
        composable(route = Routes.Splash.route){ // 스플래시
            SplashScreen(navController)
        }
        composable(route = Routes.Login.route){ // 로그인
            LoginScreen(navController)
        }
        composable(route = Routes.Signup_ID.route){
            SignupScreen_ID(navController)
        }
        composable(route = Routes.Signup_NickName.route) {
            SignupScreen_NickName(navController)
        }


        //홈화면
        composable(route = Routes.Home.route){

        }
        
    }
}