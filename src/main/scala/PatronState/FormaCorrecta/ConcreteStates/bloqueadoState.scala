package ConcreteStates

import State._

class BloqueadoState extends CelularState {
    

    override def llamar() : Unit = {}
    override def llamarEmergencia() : Unit = println("Llamando a emergencia...")
    override def contestar() : Unit = println("Contestando...")
    override def colgar() : Unit = println("colgando...")
    override def tomarFoto() : Unit = println("Tomando foto...")
    override def enviarMensaje() : Unit = {}
    override def abrirAplicacionA() : Unit = {}
    override def abrirAplicacionB() : Unit = {}
    override def cerrarAplicaciones() : Unit = {}
    override def verFotos() : Unit = {}
    override def abrirRecovery() : Unit = {}
}