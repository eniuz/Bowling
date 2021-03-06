package bowling.domain

case class PlayerId(value:Int)
case class PlayerName(value:String)
case class Player(id: PlayerId, name: PlayerName) {
  def setName(name:PlayerName):Player = this.copy(name = name)
}
