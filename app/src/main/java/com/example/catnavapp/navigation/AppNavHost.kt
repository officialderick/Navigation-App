package com.example.catnavapp.navigation


import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.catnavapp.ui.theme.screens.bmicalc.BmiScreen
import com.example.catnavapp.ui.theme.screens.calculator.CalculatorScreen
import com.example.catnavapp.ui.theme.screens.calculator.IntentScreen
import com.example.catnavapp.ui.theme.screens.home.HomeScreen
import com.example.catnavapp.ui.theme.screens.intents.IntentScreen

@Composable
fun AppNavHost(
    modifier: Modifier =Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_HOME
) {
    NavHost(
        navController = navController,
        modifier = modifier,
        startDestination = startDestination
    ) {
        composable(ROUTE_BMI) {
            BmiScreen(navHostController = navController)
        }
        composable(ROUTE_CALCULATOR) {
            CalculatorScreen(navController = navController)
        }
        composable(ROUTE_INTENT) {
            IntentScreen(navController = navController)
        }
        composable(ROUTE_HOME) {
            HomeScreen(navController = navController)
        }
    }
}
