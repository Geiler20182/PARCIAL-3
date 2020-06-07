package ConcreteStates

import State._

class ApagadoState extends CelularState {
    
    override def llamar() : Unit = {}
    override def llamarEmergencia() : Unit = {}
    override def contestar() : Unit = {}
    override def colgar() : Unit = {}
    override def tomarFoto() : Unit = {}
    override def enviarMensaje() : Unit = {}
    override def abrirAplicacionA() : Unit = {}
    override def abrirAplicacionB() : Unit = {}
    override def cerrarAplicaciones() : Unit = {}
    override def verFotos() : Unit = {}
    override def abrirRecovery() : Unit = println("Abriendo recovery...")
}