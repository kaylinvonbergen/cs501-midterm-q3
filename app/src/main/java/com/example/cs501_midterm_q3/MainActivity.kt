package com.example.cs501_midterm_q3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.cs501_midterm_q3.ui.theme.Cs501midtermq3Theme
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Cs501midtermq3Theme {
                StudentList(students)

            }
        }
    }
}

val students = listOf(
    "Alice","Bob","Charlie","Dana","Eric",
    "Fatima","Grace","Hiro","Isabel","Jack",
    "Karen","Luis","Maya","Nate","Olivia",
    "Priya","Quinn","Ravi","Sara","Tom"
)

//@Composable
//fun StudentList(students: List<String>) {
//    LazyColumn {
//        items(students) { student ->
//            Text(text = student)
//        }
//    }
//}

@Composable
fun StudentList(students: List<String>) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 16.dp)
    ) {
        items(students) { student ->
            Text(
                text = student,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp)
                    .border(1.dp, Color.Gray)
                    .padding(16.dp),
                fontSize = 20.sp
            )
        }
    }
}