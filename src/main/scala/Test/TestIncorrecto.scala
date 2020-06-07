package scala

import FormaIncorrecta._

object TestIncorrecto {

    def main(args: Array[String]) : Unit = {
        
        println("\nTest incorrecto...\n")

        var celular : CelularEstados = new CelularEstados 

                
        println("\n[Celular bloqueado]\n")
        celular.llamar()
        celular.llamarEmergencia()
        celular.contestar()
        celular.colgar()
        celular.tomarFoto()
        celular.enviarMensaje()
        celular.abrirAplicacionA()
        celular.abrirAplicacionB()
        celular.cerrarAplicaciones()
        celular.verFotos()
        celular.abrirRecovery()

        println("\n[Celular desbloqueado]\n")
        celular.setEstadoActual("Desbloqueado")
        celular.llamar()
        celular.llamarEmergencia()
        celular.contestar()
        celular.colgar()
        celular.tomarFoto()
        celular.enviarMensaje()
        celular.abrirAplicacionA()
        celular.abrirAplicacionB()
        celular.cerrarAplicaciones()
        celular.verFotos()
        celular.abrirRecovery()

        println("\n[Celular apagado]\n")
        celular.setEstadoActual("Apagado")
        celular.llamar()
        celular.llamarEmergencia()
        celular.contestar()
        celular.colgar()
        celular.tomarFoto()
        celular.enviarMensaje()
        celular.abrirAplicacionA()
        celular.abrirAplicacionB()
        celular.cerrarAplicaciones()
        celular.verFotos()
        celular.abrirRecovery()

        println("\n")
    }  
}