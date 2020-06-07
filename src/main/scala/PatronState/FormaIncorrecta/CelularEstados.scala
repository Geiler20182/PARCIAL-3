package FormaIncorrecta


class CelularEstados {

    private var estado_actual : String = "Desbloqueado"  

    def llamar() : Unit = 
    {
        if (estado_actual == "Desbloqueado")
            println("Llamando...")
    }
    def llamarEmergencia() : Unit =
    {
        if (estado_actual == "Desbloqueado" || estado_actual == "Bloqueado")
            println("Llamando a emergencia...")
    } 
    def contestar() : Unit = 
    {
        if (estado_actual == "Desbloqueado" || estado_actual == "Bloqueado")
            println("Contestando...")
    }
    def colgar() : Unit = 
    {
        if (estado_actual == "Desbloqueado" || estado_actual == "Bloqueado") 
            println("colgando...")
    
    }
    def tomarFoto() : Unit =
    {
        if (estado_actual == "Desbloqueado" || estado_actual == "Bloqueado") 
            println("Tomando foto...")

    } 
    def enviarMensaje() : Unit = 
    {
        if (estado_actual == "Desbloqueado")
            println("Enviando mensaje...")
    }
    def abrirAplicacionA() : Unit = 
    {
        if (estado_actual == "Desbloqueado")
            println("Abriendo aplicacion A...")       
    }
    def abrirAplicacionB() : Unit = 
    {
        if (estado_actual == "Desbloqueado")
            println("Abriendo aplicacion B...")    
    }
    def cerrarAplicaciones() : Unit =
    {
        if (estado_actual == "Desbloqueado")
            println("Cerrando aplicaciones...")    
    }
    def verFotos() : Unit = 
    {
        if (estado_actual == "Desbloqueado")
            println("Abriendo galeria...")    
    }
    def abrirRecovery() : Unit = 
    {
        if (estado_actual == "Apagado")
            println("Abriendo recovery...")
    }
    def setEstadoActual(nuevo_estado : String) : Unit = estado_actual =  nuevo_estado
}
