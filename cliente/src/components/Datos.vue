<template>
  <b-container class="mt-5 my-4">
    <h1>Información de los coches</h1>
    <b-table
      id="my-table"
      :items="obtenerCarros"
      :per-page="perPage"
      :current-page="currentPage"
      :fields="fields"
      :sort-by.sync="sortBy"
      label-sort-asc=""
      label-sort-desc=""
      :sort-desc.sync="sortDesc"
      :filter="filtro"
      @filtered="onFiltered"
    >
    </b-table>
    <div class="overflow-auto">
      <b-pagination
        v-model="currentPage"
        :total-rows="rows"
        :per-page="perPage"
        aria-controls="my-table"
      ></b-pagination>
    </div>
  </b-container>
</template>

<script>
import paginationControl from "../services/paginationControl";

export default {
  data() {
    return {
      sortBy: "model",
      sortDesc: false,
      perPage: 5,
      rows: 0,
      currentPage: 1,
      personas: [],
      fields: [
        { key: "model", label: "Modelo", sortable: true },
        { key: "brand", label: "Marca", sortable: true },
        { key: "serie", label: "Número de serie", sortable: true },
        { key: "year", label: "Año de fabricación", sortable: true },
      ],
    };
  },
  methods: {
    async obtenerCarros(ctx) {
      console.log("SI jala?",ctx);
      try {
        const data = await paginationControl.obtenerPaginas(
          +ctx.currentPage-1,
          +ctx.perPage,
          ctx.sortBy
        );
        this.rows = data.totalElements;
        return data.content;
      } catch (error) {
        console.error("Valio queso",error);
      }
    },
    onFiltered(filteredItems) {
      this.currentPage = 1;
      this.rows = filteredItems.length;
    },
  },
};
</script>