package com.example.firebasestorage.ui.theme.screens.dashboard



import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.R

@Composable
fun DashBoardScreen(navController:NavHostController) {
Column (modifier = Modifier
    .fillMaxSize()
    .verticalScroll(rememberScrollState())) {
    TopAppBar(
        title = {
            Text(
                text = "Amazon Shop",
                color = Color.White
            )

        },
        backgroundColor = Color(20,20,200)
    )//End of Top App bar

    Spacer(modifier = Modifier.height(20.dp))

    Row( modifier = Modifier.padding(start = 20.dp)) {
        Column {
            Text(
                text = "Amazon",
                fontSize = 30.sp,
                fontWeight = FontWeight.Medium,
                color = Color(20,100,255)
            )
            Text(text = "Shop from A To Z")
        }
        Spacer(modifier = Modifier.width(100.dp))

        Image(
            painter = painterResource(id = R.drawable.amazon),
            contentDescription ="amazon",
            modifier = Modifier.size(100.dp))
    }//End Row
    Spacer(modifier = Modifier.height(20.dp))


    //cards columns start
    Column(modifier = Modifier.padding(start = 20.dp)) {
       Row {

            //First Card
   Card (modifier = Modifier
       .size(width = 150.dp, height = 150.dp)
       .shadow(10.dp)){



           Box(
               modifier = Modifier.fillMaxWidth(),
               contentAlignment = Alignment.Center
           ) {
               Image(
                   painter = painterResource(id = R.drawable.dress),
                   contentDescription = "amazon",
                   modifier = Modifier.size(50.dp)
               )
               Text(
                   text = "Clothing",
                   fontSize = 20.sp,
                   textAlign = TextAlign.Center,

                   modifier = Modifier
                       .fillMaxWidth()
                       .align(Alignment.BottomCenter)

               )

           }




    }
Spacer(modifier = Modifier.width(30.dp))
            //second card
           Card (modifier = Modifier
               .size(width = 150.dp, height = 150.dp)
               .shadow(10.dp)){



               Box(
                   modifier = Modifier.fillMaxWidth(),
                   contentAlignment = Alignment.Center
               ) {
                   Image(
                       painter = painterResource(id = R.drawable.pc),
                       contentDescription = "Electronics",
                       modifier = Modifier.size(50.dp)
                   )
                   Text(
                       text = "Home",
                       fontSize = 20.sp,
                       textAlign = TextAlign.Center,

                       modifier = Modifier
                           .fillMaxWidth()
                           .align(Alignment.BottomCenter)

                   )

               }




           }
            } // End of Row 1
        Spacer(modifier = Modifier.height(25.dp))

        //Row 2
        Row {

            //First Card
            Card (modifier = Modifier
                .size(width = 150.dp, height = 150.dp)
                .shadow(10.dp)){



                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.house),
                        contentDescription = "amazon",
                        modifier = Modifier.size(50.dp)
                    )
                    Text(
                        text = "Home",
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center,

                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.BottomCenter)

                    )

                }




            }
            Spacer(modifier = Modifier.width(30.dp))
            //second card
            Card (modifier = Modifier
                .size(width = 150.dp, height = 150.dp)
                .shadow(10.dp)){



                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.beauty),
                        contentDescription = "amazon",
                        modifier = Modifier.size(50.dp)
                    )
                    Text(
                        text = "Beauty",
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center,

                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.BottomCenter)

                    )

                }




            }
        } // End of Row 2
        Spacer(modifier = Modifier.height(25.dp))

        //Row 3
        Row {

            //First Card
            Card (modifier = Modifier
                .size(width = 150.dp, height = 150.dp)
                .shadow(10.dp,)){



                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.medicine),
                        contentDescription = "amazon",
                        modifier = Modifier.size(50.dp)
                    )
                    Text(
                        text = "Pharmacy",
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center,

                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.BottomCenter)

                    )

                }




            }
            Spacer(modifier = Modifier.width(30.dp))
            //second card
            Card (modifier = Modifier
                .size(width = 150.dp, height = 150.dp)
                .shadow(10.dp)){



                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.groceries),
                        contentDescription = "amazon",
                        modifier = Modifier.size(50.dp)
                    )
                    Text(
                        text = "Groceries",
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center,

                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.BottomCenter)

                    )

                }




            }
        } // End of Row 3

        }

    }


}


@Preview(showBackground = true)
@Composable
fun DashBoardScreenPreview() {
    DashBoardScreen(rememberNavController())
}