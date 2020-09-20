package com.training.codelab01

object TestClass {
    @JvmStatic
    /*
    Task 2:
    Step 1 - Create variable age in main function and set to 20.
    Step 2 - Create variable layer in main function and set to 5.
    Step 3 - Call printCandle from main with param age.
    Step 4 - Call printCakeTop from main with param age.
    Step 5 - Call printCakeBottom from main with param age and layer.
    Step 6 - To get rid of error, add // to start of that lines, it will like saving code
                as draft.
    Step 7 - Run the program


     */
    fun main(args: Array<String>){
        val age = 20
        val layer = 4
        printCandle(age)
        printCakeTop(age)
        printCakeBottom(age, layer)

    }

    // Create print cake top function below with param age
    // It will print top of cake. It is same as printBorder function.
    fun printCakeTop(age: Int){
        // We need to print `=` sign age + 2 times by using repeat function.
        repeat(age + 2){
            print("=")
        }
        println() // To print empty lines.
    }

    fun printCandle(age: Int){
        // we need to print two lines .. one for flames with comma sign
        // one for candle bodies by using |
        print(" ")
        repeat(age){
            print(",")
        }
        println()
        print(" ")
        repeat(age){
            print("|")
        }
        println()
    }

    fun printCakeBottom(age: Int, layer: Int){
        // We need to print @ two-three times or what layer value is.
        // To do so we need write two repeat function, one inside another.
        repeat(layer){
            repeat(age+2){
                print("@")
            }
            println()
        }




    }
}
