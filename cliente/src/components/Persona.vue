<template>
  <div class="overflow-auto">
    <b-pagination
      v-model="currentPage"
      :total-rows="personas.length"
      :per-page="perPage"
      aria-controls="my-table"
    ></b-pagination>

    <p class="mt-3">Current Page: {{ currentPage }}</p>

    <b-table
      id="my-table"
      :items="personas"
      :per-page="perPage"
      :current-page="currentPage"
      small
    ></b-table>
  </div>
</template>

<script>
import personaService from "../services/Persona"; // Ajusta la ruta según tu estructura de archivos

export default {
  data() {
    return {
      perPage: 3,
      currentPage: 1,
      personas: [],
    };
  },
  mounted() {
    this.obtenerPersonas();
  },
  methods: {
    async obtenerPersonas() {
      try {
        const data = await personaService.obtenerPersonasPaginadas(
          parseInt(this.currentPage),
          parseInt(this.perPage)
        );
        this.personas = data.content;
      } catch (error) {
        console.error(error);
        // Manejar errores (puedes mostrar un mensaje de error al usuario, por ejemplo)
      }
    },
  },
};
</script>