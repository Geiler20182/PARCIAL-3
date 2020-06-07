package State

trait celularState {

    def llamar() : Unit
    def llamarEmergencia() : Unit
    def contestar() : Unit
    def colgar() : Unit 
    def tomarFoto() : Unit
    def enviarMensaje() : Unit
    def abrirAplicacionA() : Unit
    def abrirAplicacionB() : Unit
    def cerrarAplicaciones() : Unit
    def verFotos() : Unit
    def abrirRecovery() : Unit
}