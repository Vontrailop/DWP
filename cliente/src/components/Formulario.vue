<template>
  <div>
    <b-breadcrumb :items="items"></b-breadcrumb>
    <h2>Registro de Vehículo</h2>
    <b-form @submit.prevent="submitForm">
      <b-form-group
        id="brand"
        label="brand"
        label-for="brand"
        :state="!errors.brand ? true : false"
        :invalid-feedback="errors.brand"
      >
        <b-form-input
          id="brand"
          v-model="brand"
          type="text"
          placeholder="Ingrese la marca del vehículo"
          required
        ></b-form-input>
      </b-form-group>
      <b-form-group
        id="model"
        label="Model"
        label-for="model"
        :state="!errors.model ? true : false"
        :invalid-feedback="errors.model"
      >
        <b-form-input
          id="model"
          v-model="model"
          type="text"
          placeholder="Ingrese el modelo del vehículo"
          required
        ></b-form-input>
      </b-form-group>
      <b-form-input
        id="year"
        v-model="year"
        type="number"
        placeholder="Ingrese el año de fabricación"
        min="1900"
        :max="currentYear"
        required
      ></b-form-input>
      <b-form-group
        id="serie"
        label="Número de Serie"
        label-for="serie"
        :state="!errors.serie ? true : false"
        :invalid-feedback="errors.serie"
      >
        <b-form-input
          id="serie"
          v-model="serie"
          type="text"
          placeholder="Ingrese el número de serie (ej. ABCD123-45EF)"
          pattern="[A-Z]{4}[0-9]{3}-[0-9]{2}[A-Z]{2}"
          required
        ></b-form-input>
      </b-form-group>
      <b-button type="submit" variant="primary">Registrar</b-button>
    </b-form>
  </div>
</template>

<script>
import Vue from 'Vue';
export default Vue.extend ({
  data() {
    return {
      brand: "",
      model: "",
      year: null,
      serie: "",
      currentYear: new Date().getFullYear(),
      errors: {},
    };
  },
  // Validación (alfanuméricos)
  methods: {
    async submitForm() {
      this.errors = {}; 

      if (!/^[a-zA-Z0-9\s]+$/.test(this.brand)) {
        this.errors.brand = "La Marca solo puede contener letras y números";
      }
      if (!/^[a-zA-Z0-9\s]+$/.test(this.model)) {
        this.errors.model = "El modelo solo debe contener letras y números";
      } 

      if (this.año > this.currentYear) {
        this.errors.year =
          "El año de fabricación no puede ser mayor al año actual (2024)";
      } 

      if (!/^[A-Z]{4}[0-9]{3}-[0-9]{2}[A-Z]{2}$/.test(this.serie)) {
        this.errors.serie =
          "El número de serie debe tener el formato correcto (ejemplo: ABCD123-45EF)";
      }
    },
  },
  items: [
    {
      text: "Inicio",
      to: "inicio",
    },
    {
      text: "Paginacion",
      to: "paginacion",
    },
    {
        
    text: "Formulario",
    active: true,
    }
  ],
});
</script>

<style scoped>
</style>