package ConcreteStates

import State._

class desbloqueadoState extends celularState {
    
    override def llamar() : Unit = println("Llamando...")
    override def llamarEmergencia() : Unit = println("Llamando a emergencia...")
    override def contestar() : Unit = println("Contestando...")
    override def colgar() : Unit = println("colgando...")
    override def tomarFoto() : Unit = println("Tomando foto...")
    override def enviarMensaje() : Unit = println("Enviando mensaje...")
    override def abrirAplicacionA() : Unit = println("Abriendo aplicacion A...")
    override def abrirAplicacionB() : Unit = println("Abriendo aplicacion B")
    override def cerrarAplicaciones() : Unit = println("Cerrando aplicaciones...")
    override def verFotos() : Unit = println("Fotos...")
    override def abrirRecovery() : Unit = {}
}