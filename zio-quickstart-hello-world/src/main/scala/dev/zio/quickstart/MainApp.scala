package dev.zio.quickstart

import zio._

object MainApp extends ZIOAppDefault {
  def run =
    //Console.printLine("Hello, World!")
    
    for {
        _ <- Console.print("Please enter your name : ")
        name <- Console.readLine
        _ <- Console.printLine(s"Hello, $name!")
    } yield()
      
    /*
    Console.print("Please enter your name: ")
      .flatMap { _ => 
        Console.readLine
        .flatMap { name => 
          Console.printLine(s"Hello, $name!")
        }
      }
        */
}
