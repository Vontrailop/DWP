<template>
  <b-container class="mt-5">
    <b-table
      id="my-table"
      :items="personas"
      :per-page="perPage"
      :current-page="currentPage"
      :fields="fields"
      :sort-by.sync="sortBy"
      :sort-desc.sync="sortDesc"
      label-sort-asc=""
      label-sort-desc=""
      small
    >
    </b-table>
    <div class="overflow-auto">
      <b-pagination
        v-model="currentPage"
        :total-rows="personas.length"
        :per-page="perPage"
        aria-controls="my-table"
      ></b-pagination>

      <p class="mt-3">Current Page: {{ currentPage }}</p>
    </div>
  </b-container>
</template>

<script>
import personaService from "../services/Persona"; // Ajusta la ruta según tu estructura de archivos

export default {
  data() {
    return {
      sortBy: "name",
      sortDesc: false,
      perPage: 3,
      currentPage: 1,
      personas: [],
      fields: [
        { key: "name", label: "Nombre", sortable: true },
        { key: "firstname", label: "Apellido Paterno", sortable: true },
        { key: "lastname", label: "Apellido Materno", sortable: true },
        { key: "address", label: "Direccion", sortable: true },
        { key: "birthday", label: "Fech. Nac.", sortable: true },
        { key: "email", label: "Email", sortable: true },
        { key: "email", label: "Email", sortable: true },
      ],
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
          parseInt(this.perPage),
          this.sortBy
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