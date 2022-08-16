package com.quiteinnocuous.ptgscribe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.quiteinnocuous.ptgscribe.ui.theme.PathToGloryScribeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            PathToGloryScribeTheme {
                Scaffold {
                    paddingValues ->
                    NavigationComponent(
                        navController,
                        modifier = Modifier.padding(paddingValues = paddingValues)
                    )
                }
            }
        }
    }
}

@Composable
fun NavigationComponent(
    navController: NavHostController,
    modifier: Modifier
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") {
            HomeScreen(navController)
        }
        composable("createArmy") {
            CreateArmyScreen()
        }
    }
}

@Composable
fun HomeScreen(navController: NavController) {
    Button(onClick = { navController.navigate("createArmy") }) {
        Text(stringResource(R.string.create_army))
    }
}

@Composable
fun CreateArmyScreen() {
    Text(stringResource(R.string.create_army))
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PathToGloryScribeTheme {
        HomeScreen(rememberNavController())
    }
}