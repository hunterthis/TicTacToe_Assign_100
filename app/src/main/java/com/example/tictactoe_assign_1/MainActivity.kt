package com.example.tictactoe_assign_1
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.tictactoe_assign_1.R.id.*
import com.google.android.material.textview.MaterialTextView
import com.example.tictactoe_assign_1.R.id.textViewTurn as idTextViewTurn

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(button1)
        val button2 = findViewById<Button>(button2)
        val button3 = findViewById<Button>(button3)
        val button4 = findViewById<Button>(button4)
        val button5 = findViewById<Button>(button5)
        val button6 = findViewById<Button>(button6)
        val button7 = findViewById<Button>(button7)
        val button8 = findViewById<Button>(button8)
        val button9 = findViewById<Button>(button9)
        val newgamebutton = findViewById<Button>(button10)
        val turntextbox = this.findViewById<MaterialTextView>(idTextViewTurn)

        newgamebutton?.setOnClickListener {
            button1.text = ""
            button2.text = ""
            button3.text = ""
            button4.text = ""
            button5.text = ""
            button6.text = ""
            button7.text = ""
            button8.text = ""
            button9.text = ""
            turntextbox.text = "Player X's Turn"
        }
        fun onClick() {
            // horizontal rows X check
            if (button1.text.toString() === "X") {
                if (button2.text.toString() === "X") {
                    if (button3.text.toString() == "X") {
                        Toast.makeText(this, "Player X has won!", Toast.LENGTH_SHORT).show()
                    }
                }
            }
            if (button4.text.toString() === "X") {
                if (button5.text.toString() === "X") {
                    if (button6.text.toString() == "X") {
                        Toast.makeText(this, "Player X has won!", Toast.LENGTH_SHORT).show()
                    }
                }
            }
            if (button7.text.toString() === "X") {
                if (button8.text.toString() === "X") {
                    if (button9.text.toString() == "X") {
                        Toast.makeText(this, "Player X has won!", Toast.LENGTH_SHORT).show()
                    }
                }
            }

            // vertical rows X check
            if (button1.text.toString() === "X") {
                if (button4.text.toString() === "X") {
                    if (button7.text.toString() == "X") {
                        Toast.makeText(this, "Player X has won!", Toast.LENGTH_SHORT).show()
                    }
                }
            }
            if (button2.text.toString() === "X") {
                if (button5.text.toString() === "X") {
                    if (button8.text.toString() == "X") {
                        Toast.makeText(this, "Player X has won!", Toast.LENGTH_SHORT).show()
                    }
                }
            }
            if (button3.text.toString() === "X") {
                if (button6.text.toString() === "X") {
                    if (button9.text.toString() === "X") {
                        Toast.makeText(this, "Player X has won!", Toast.LENGTH_SHORT).show()
                    }
                }
            }
            // diagonal x check
            if (button1.text.toString() === "X") {
                if (button5.text.toString() === "X") {
                    if (button9.text.toString() === "X") {
                        Toast.makeText(this, "Player X has won!", Toast.LENGTH_SHORT).show()
                    }
                }
            }
            if (button3.text.toString() === "X") {
                if (button5.text.toString() === "X") {
                    if (button7.text.toString() === "X") {
                        Toast.makeText(this, "Player X has won!", Toast.LENGTH_SHORT).show()
                    }
                }
            }


            // horizontal rows X check
            if (button1.text.toString() === "O") {
                if (button2.text.toString() === "O") {
                    if (button3.text.toString() === "O") {
                        Toast.makeText(this, "Player O has won!", Toast.LENGTH_SHORT).show()
                    }
                }
            }
            if (button4.text.toString() === "O") {
                if (button5.text.toString() === "O") {
                    if (button6.text.toString() === "O") {
                        Toast.makeText(this, "Player O has won!", Toast.LENGTH_SHORT).show()
                    }
                }
            }
            if (button7.text.toString() === "O") {
                if (button8.text.toString() === "O") {
                    if (button9.text.toString() === "O") {
                        Toast.makeText(this, "Player O has won!", Toast.LENGTH_SHORT).show()
                    }
                }
            }

            // vertical rows O check
            if (button1.text.toString() === "O") {
                if (button4.text.toString() === "O") {
                    if (button7.text.toString() === "O") {
                        Toast.makeText(this, "Player O has won!", Toast.LENGTH_SHORT).show()
                    }
                }
            }
            if (button2.text.toString() === "O") {
                if (button5.text.toString() === "O") {
                    if (button8.text.toString() === "O") {
                        Toast.makeText(this, "Player O has won!", Toast.LENGTH_SHORT).show()
                    }
                }
            }
            if (button3.text.toString() === "O") {
                if (button6.text.toString() === "O") {
                    if (button9.text.toString() === "O") {
                        Toast.makeText(this, "Player O has won!", Toast.LENGTH_SHORT).show()
                    }
                }
            }
            // diagonal O check
            if (button1.text.toString() === "O") {
                if (button5.text.toString() === "O") {
                    if (button9.text.toString() === "O") {
                        Toast.makeText(this, "Player O has won!", Toast.LENGTH_SHORT).show()
                    }
                }
            }
            if (button3.text.toString() === "O") {
                if (button5.text.toString() === "O") {
                    if (button7.text.toString() === "O") {
                        Toast.makeText(this, "Player O has won!", Toast.LENGTH_SHORT).show()
                    }
                }
            }
// end onclick function
        }

        button1?.setOnClickListener {
            if (button1.text == "") {
                if (turntextbox.text == "Player X's Turn") {
                    button1.text = "X"
                      turntextbox.text = "Player O's Turn"
                }
                if (button1.text == "") {
                    if (turntextbox.text == "Player O's Turn") {
                        button1.text = "O"
                        turntextbox.text = "Player X's Turn"
                    }
                }
                onClick()
            }
        }
        button2?.setOnClickListener {
                    if (button2.text == "") {
                        if (turntextbox.text == "Player X's Turn") {
                            button2.text = "X"
                                      turntextbox.text = "Player O's Turn"
                        } else {
                            button2.text = "O"
                            turntextbox.text = "Player X's Turn"
                        }
                    }
                    onClick()
                }
        button3?.setOnClickListener {
                    if (button3.text == "") {
                        if (turntextbox.text == "Player X's Turn") {
                            button3.text = "X"
                                   turntextbox.text = "Player O's Turn"
                        } else {
                            button3.text = "O"
                            turntextbox.text = "Player X's Turn"
                        }
                    }
                    onClick()
                }
        button4?.setOnClickListener {
                    if (button4.text == "") {
                        if (turntextbox.text == "Player X's Turn") {
                            button4.text = "X"
                            turntextbox.text = "Player O's Turn"
                        } else {
                            button4.text = "O"
                            turntextbox.text = "Player X's Turn"
                        }
                    }
                    onClick()
                }
        button5?.setOnClickListener {
                    if (button5.text == "") {
                        if (turntextbox.text == "Player X's Turn") {
                            button5.text = "X"
                            turntextbox.text = "Player O's Turn"
                        } else {
                            button5.text = "O"
                            turntextbox.text = "Player X's Turn"
                        }
                    }
                    onClick()
                }
        button6?.setOnClickListener {
                    if (button6.text == "") {
                        if (turntextbox.text == "Player X's Turn") {
                            button6.text = "X"
                            turntextbox.text = "Player O's Turn"
                        } else {
                            button6.text = "O"
                            turntextbox.text = "Player X's Turn"
                        }
                    }
                    onClick()
                }
        button7?.setOnClickListener {
                    if (button7.text == "") {
                        if (turntextbox.text == "Player X's Turn") {
                            button7.text = "X"
                            turntextbox.text = "Player O's Turn"
                        } else {
                            button7.text = "O"
                            turntextbox.text = "Player X's Turn"
                        }
                    }
                    onClick()
                }
        button8?.setOnClickListener {
                    if (button8.text == "") {
                        if (turntextbox.text == "Player X's Turn") {
                            button8.text = "X"
                            turntextbox.text = "Player O's Turn"
                        } else {
                            button8.text = "O"
                            turntextbox.text = "Player X's Turn"
                        }
                    }
                    onClick()
                }
        button9?.setOnClickListener {
                    if (button9.text == "") {
                        if (turntextbox.text == "Player X's Turn") {
                            button9.text = "X"
                            turntextbox.text = "Player O's Turn"
                        } else {
                            button9.text = "O"
                            turntextbox.text = "Player X's Turn"
                        }
                    }
                    onClick()
                }
            }
        }

