import java.io.PrintWriter

@main def main: Unit = 
  val r = requests.get("https://opensky-network.org/api/states/all")
  new PrintWriter("flight_state.json") { write(r.text()); close }
  println("Writing done successfully")