<template>
    <div>
      <h1>Lista de vehiculos </h1>
      <nav aria-label="breadcrumb">
        <ol class="breadcrumb">
          <li class="breadcrumb-item">
            <b-link :to="{ name: 'inicio' }">Inicio</b-link>
          </li>
          <li class="breadcrumb-item">
            <b-link :to="{ name: 'formulario' }">formulario</b-link>
          </li>
          <li class="breadcrumb-item active" aria-current="page">
            Paginacion
          </li>
        </ol>
      </nav>
      <div class="overflow-auto">
        <b-pagination
          v-model="currentPage"
          :total-rows="rows"
          :per-page="perPage"
          aria-controls="my-table"
          @input="cargarDatosAPI"
        ></b-pagination>
  
        <p class="mt-3">Current Page: {{ currentPage }}</p>
  
        <b-table
          id="my-table"
          :items="items"
          :fields="fields"
          small
        ></b-table>
      </div>
    </div>
  </template>
  
  <script>
  import axios from "axios";
  
  export default {
    data() {
      return {
        links: [
          {
            text: "inicio",
            to: { name: "inicio" },
          },
          {
            text: "paginacion",
            active: true,
          },
        ],
        perPage: 4,
        currentPage: 1,
        fields: [
          {
            key: "brand",
            sortable: true,
          },
          {
            key: "id",
            sortable: true,
          },
          {
            key: "model",
            sortable: true,
          },
          {
            key: "serie",
            sortable: true,
          },
          {
            key: "year",
            sortable: true,
          },
        ],
        items: [],
      };
    },
    computed: {
      rows() {
        return this.items.length;
      },
    },
    methods: {
      async cargarDatosAPI() {
        try {
          const response = await axios.post("http://localhost:8080/api/vehiculos/page", {
            page: this.currentPage - 1, 
            size: this.perPage,
          });
  
          if (Array.isArray(response.data.content)) {
            this.items = response.data.content.map((vehicle) => ({
              brand: vehicle.brand,
              id: vehicle.id,
              model: vehicle.model,
              serie: vehicle.serie,
              year: vehicle.year,
            }));
          } else {
            console.error("Formato inesperado:", response.data);
          }
        } catch (error) {
          console.error("Error al cargar datos desde la API:", error);
        }
      },
    },
    mounted() {
      this.cargarDatosAPI();
    },
  };
  </script>