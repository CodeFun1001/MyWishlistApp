package com.img.mywishlistapp


import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.img.mywishlistapp.ui.theme.app_bar_color

@Composable
fun AppBarView(
    title : String,
    onBackNavClicked : () -> Unit = {}
)
{
    TopAppBar(
        title = {
            Text(
                text = title,
                color = Color.White,
                modifier = Modifier
                    .wrapContentSize()
                    .padding(start = 4.dp,top = 20.dp)
                    .heightIn(max = 24.dp),
                fontSize = 24.sp
                )

        },

        navigationIcon = if (!title.contains("WishList")) {
            {
                IconButton(
                    onClick = onBackNavClicked,
                    modifier = Modifier.padding(start = 4.dp, top = 20.dp)
                ) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "Back",
                        tint = Color.White
                    )
                }
            }
        } else null,

        elevation = 3.dp,
        backgroundColor = app_bar_color,
        modifier = Modifier.fillMaxWidth().height(80.dp)
    )
}
