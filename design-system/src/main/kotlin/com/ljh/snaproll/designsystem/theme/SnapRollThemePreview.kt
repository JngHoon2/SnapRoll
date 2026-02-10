package com.ljh.snaproll.designsystem.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ljh.snaproll.designsystem.foundation.SnapRollColors

@Composable
fun ColorPreview(name: String, color: Color) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Spacer(
            modifier = Modifier
                .size(40.dp)
                .background(color)
        )
        Spacer(modifier = Modifier.width(12.dp))
        Text(
            text = name,
            style = SnapRollTheme.typography.body2,
            color = SnapRollTheme.colors.onBackground
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SnapRollThemePreview() {
    SnapRollTheme {
        Surface(
            modifier = Modifier.fillMaxWidth(),
            color = SnapRollTheme.colors.background
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                Text(
                    text = "Typography System",
                    style = SnapRollTheme.typography.h1,
                    color = SnapRollTheme.colors.primary
                )
                Spacer(modifier = Modifier.height(16.dp))
                
                Text("H1 Text: Hello SnapRoll", style = SnapRollTheme.typography.h1)
                Text("H2 Text: Hello SnapRoll", style = SnapRollTheme.typography.h2)
                Text("H3 Text: Hello SnapRoll", style = SnapRollTheme.typography.h3)
                Text("Body1 Text: Basic content text style", style = SnapRollTheme.typography.body1)
                Text("Body2 Text: Secondary content text style", style = SnapRollTheme.typography.body2)
                Text("Caption Text: Helper text style", style = SnapRollTheme.typography.caption)
                
                Spacer(modifier = Modifier.height(32.dp))
                
                Text(
                    text = "Film Color Palette",
                    style = SnapRollTheme.typography.h2,
                    color = SnapRollTheme.colors.primary
                )
                Spacer(modifier = Modifier.height(8.dp))
                
                ColorPreview("Kodak Gold (Primary)", SnapRollColors.KodakGold)
                ColorPreview("Kodak Red", SnapRollColors.KodakRed)
                ColorPreview("Fuji Green (Secondary)", SnapRollColors.FujiGreen)
                ColorPreview("Ilford Gray", SnapRollColors.IlfordGray)
                
                Spacer(modifier = Modifier.height(16.dp))
                
                Text(
                    text = "System Colors",
                    style = SnapRollTheme.typography.h2,
                    color = SnapRollTheme.colors.primary
                )
                Spacer(modifier = Modifier.height(8.dp))
                
                ColorPreview("Error", SnapRollColors.Error)
                ColorPreview("Warning", SnapRollColors.Warning)
                ColorPreview("Success", SnapRollColors.Success)
                ColorPreview("Disable", SnapRollColors.Disable)
            }
        }
    }
}
