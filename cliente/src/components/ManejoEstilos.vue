<template>
  <b-container>
    <h1>Estilos</h1>
    <br />
    <div>
      <!-- Ventana con estilo dinámico
        Recordar que cuando nosotros utilizamos los dos puntos : estamos accediendo
        a las variables de data, de esa manera podemos asignar un objeto a la propiedad
        de estilos. Hay que tener en cuenta los elementos de CSS sean apropiados para las
        propiedades asignadas del objeto en cuestión.
        :style=""
      
       -->
      <div :style="ventanaStyle" class="ventana">Contenido de la ventana</div>

      <!-- Botones para asignar estilos -->
      <div class="botones">
        <button @click="aplicarEstilo('color', 'red')">Rojo</button>
        <button @click="aplicarEstilo('color', 'blue')">Azul</button>
        <button @click="aplicarEstilo('color', 'green')">Verde</button>
        <button @click="aplicarEstilo('font-size', '24px')">
          Tamaño de Fuente
        </button>
        <!-- Agrega más botones con diferentes estilos -->
      </div>
    </div>

    <br />
    <h1>Condicionales</h1>
    
    <div v-if="condicion1">Existe el elemento si es true</div>
    <div v-show="condicion2">Se muestra este mensaje si es true</div>

    <div v-for="obj in lista">
      {{ obj.nombre }}
    </div>
    <br />

    <h1>Prueba estilos</h1>

    <b-row align-h="end">
      <b-col sm="2"><b-button>Anything</b-button></b-col>
    </b-row>
  </b-container>
</template>

<script>
export default {
  data() {
    return {
      // Estilos predeterminados para la ventana
      ventanaStyle: {
        width: "300px",
        height: "200px",
        border: "1px solid black",
        padding: "20px",
        margin: "20px",
      },
      //variables para condicionar
      condicion1: false,
      condicion2: false,
      lista: [
        {
          nombre: "David",
        },
        {
          nombre: "José",
        },
        {
          nombre: "Maria",
        },
      ],
    };
  },
  methods: {
    // Método para aplicar estilos dinámicamente a la ventana
    aplicarEstilo(propiedad, valor) {
      // Haciendo una copia de los estilos actuales
      const nuevosEstilos = { ...this.ventanaStyle };
      // Asignando la nueva propiedad
      nuevosEstilos[propiedad] = valor;
      // Actualizando los estilos de la ventana
      this.ventanaStyle = nuevosEstilos;
    },
  },
};
</script>

<style>
</style>