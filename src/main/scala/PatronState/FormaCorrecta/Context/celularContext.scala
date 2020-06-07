package Context

import ConcreteStates._
import State._


class celularContext {

    private var estado_actual : celularState = new bloqueadoState
    
    def llamar() : Unit = estado_actual.llamar()
    def llamarEmergencia() : Unit = estado_actual.llamarEmergencia()
    def contestar() : Unit = estado_actual.contestar()
    def colgar() : Unit = estado_actual.colgar()
    def tomarFoto() : Unit = estado_actual.tomarFoto()
    def enviarMensaje() : Unit = estado_actual.enviarMensaje()
    def abrirAplicacionA() : Unit =  estado_actual.abrirAplicacionA()
    def abrirAplicacionB() : Unit = estado_actual.abrirAplicacionB()
    def cerrarAplicaciones() : Unit = estado_actual.cerrarAplicaciones()
    def verFotos() : Unit = estado_actual.verFotos()
    def abrirRecovery() : Unit = estado_actual.abrirRecovery()
    def setEstadoActual(nuevo_estado : celularState) : Unit = estado_actual = nuevo_estado

}