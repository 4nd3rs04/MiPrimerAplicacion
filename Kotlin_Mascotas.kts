
//////////////////// VARIABLES Y TIPOS DE DATOS /////////////////////////

val nombre: String = "Maxxi"
var edad: Int = 3
var peso: Float = 12.5f
val sexo: Char = 'M'
var vacunado: Boolean = true

// Actualizacion de la edad y el peso
edad = edad + 1
peso = peso + 1.5f

println("--- FICHA DEL PACIENTE ---")
println("Nombre: $nombre | Edad: $edad años | Peso: $peso kg | Sexo: $sexo | Vacunado: $vacunado")


//////////////// OPERADORES Y ESTRUCTURA /////////////////////////////////

val edadMascota: Int = 9
val esUrgencia: Boolean = false

val categoria: String = when (edadMascota) {
    in 0..1 -> "Cachorro"
    in 2..7 -> "Adulto"
    in 8..Int.MAX_VALUE -> "Senior"
    else -> "Edad no válida"
}

println("\n--- CLASIFICACION ---")
println("Edad: $edadMascota años")
println("Categoría: $categoria")

if (esUrgencia || categoria == "Senior") {
    println("Prioridad Alta")
} else {
    println("Atención Regular")
}


///////////////////// LISTAS, BUCLES Y RANGOS /////////////////////////

val mascotas: List<String> = listOf("Luna", "Max", "Rocky", "Milo")

println("\n--- TURNOS DE CONSULTA ---")

var turno: Int = 1

for (mascota in mascotas) {
    println("Turno $turno: $mascota")
    turno++
}

println("\n--- CUENTA REGRESIVA ---")

for (minuto in 5 downTo 1) {
    println("$minuto minuto(s)")
}

println("¡La clínica ya está abierta!")


///////////////////// TIPOS NULABLES Y OPERADOR ELVIS ////////////////////////

val contactoEmergencia: String? = null

val cantidadCaracteres: Int? = contactoEmergencia?.length

val contactoFinal: String =
    contactoEmergencia ?: "Sin contacto registrado"

println("\n--- CONTACTO DE EMERGENCIA ---")
println("Cantidad de caracteres: $cantidadCaracteres")
println("Contacto: $contactoFinal")


///////////////////////// LAMBDAS Y FOR EACH ////////////////////////

val precios: List<Double> = listOf(30000.0, 25000.0, 18000.0)

val recargoNocturno: (Double) -> Double = {
    it * 1.10
}

println("\n--- PRECIOS DE SERVICIOS ---")

precios.forEach {
    val precioAjustado: Double = recargoNocturno(it)

    println("Precio original: $it")
    println("Precio con recargo nocturno: $precioAjustado")
}
