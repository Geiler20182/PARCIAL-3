package PatronState

import ConcreteStates._
import Context._
import State._

object Main {

    def main(args: Array[String]) : Unit = {

        println("Estado de un celular")

        var celular_context = new celularContext
        
        println("\n[Celular bloqueado]\n")
        celular_context.llamar()
        celular_context.llamarEmergencia()
        celular_context.contestar()
        celular_context.colgar()
        celular_context.tomarFoto()
        celular_context.enviarMensaje()
        celular_context.abrirAplicacionA()
        celular_context.abrirAplicacionB()
        celular_context.cerrarAplicaciones()
        celular_context.verFotos()
        celular_context.abrirRecovery()

        println("\n[Celular desbloqueado]\n")
        celular_context.setEstadoActual(new desbloqueadoState)
        celular_context.llamar()
        celular_context.llamarEmergencia()
        celular_context.contestar()
        celular_context.colgar()
        celular_context.tomarFoto()
        celular_context.enviarMensaje()
        celular_context.abrirAplicacionA()
        celular_context.abrirAplicacionB()
        celular_context.cerrarAplicaciones()
        celular_context.verFotos()
        celular_context.abrirRecovery()

        println("\n[Celular apagado]\n")
        celular_context.setEstadoActual(new apagadoState)
        celular_context.llamar()
        celular_context.llamarEmergencia()
        celular_context.contestar()
        celular_context.colgar()
        celular_context.tomarFoto()
        celular_context.enviarMensaje()
        celular_context.abrirAplicacionA()
        celular_context.abrirAplicacionB()
        celular_context.cerrarAplicaciones()
        celular_context.verFotos()
        celular_context.abrirRecovery()

        println("\n")
    }
}